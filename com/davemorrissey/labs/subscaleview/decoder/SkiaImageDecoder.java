package com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import android.graphics.Bitmap$Config;
import java.lang.Object;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.content.Context;
import android.net.Uri;
import android.graphics.Bitmap;
import java.lang.String;
import android.graphics.BitmapFactory$Options;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.graphics.BitmapFactory;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.graphics.Rect;
import android.content.ContentResolver;
import java.lang.RuntimeException;

public class SkiaImageDecoder implements ImageDecoder	// class@000fc0
{
    public final Bitmap$Config bitmapConfig;

    public void SkiaImageDecoder(){
       super(null);
    }
    public void SkiaImageDecoder(Bitmap$Config p0){
       super();
       Bitmap$Config preferredBit = SubsamplingScaleImageView.getPreferredBitmapConfig();
       if (p0 != null) {
          this.bitmapConfig = p0;
       }else if(preferredBit != null){
          this.bitmapConfig = preferredBit;
       }else {
          this.bitmapConfig = Bitmap$Config.RGB_565;
       }
       return;
    }
    public Bitmap decode(Context p0,Uri p1){
       Bitmap uBitmap;
       String str = p1.toString();
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inPreferredConfig = this.bitmapConfig;
       if (str.startsWith("android.resource://")) {
          str = p1.getAuthority();
          Resources resources = ((p0.getPackageName()).equals(str))? p0.getResources(): p0.getPackageManager().getResourcesForApplication(str);
          try{
             List pathSegments = p1.getPathSegments();
             int i = pathSegments.size();
             int i1 = 0;
             if (i == 2 && (pathSegments.get(i1)).equals("drawable")) {
                i1 = resources.getIdentifier(pathSegments.get(1), "drawable", str);
             }else if(i == 1 && TextUtils.isDigitsOnly(pathSegments.get(i1))){
                i1 = Integer.parseInt(pathSegments.get(i1));
             }
             uBitmap = BitmapFactory.decodeResource(p0.getResources(), i1, options);
          }catch(java.lang.NumberFormatException e0){
          }
       }else if(str.startsWith("file:///android_asset/")){
          uBitmap = BitmapFactory.decodeStream(SplitAssetHelper.open(p0.getAssets(), str.substring(22)), null, options);
       }else if(str.startsWith("file://")){
          uBitmap = BitmapFactory.decodeFile(str.substring(7), options);
       }else {
          InputStream inputStream = p0.getContentResolver().openInputStream(p1);
          Bitmap uBitmap1 = BitmapFactory.decodeStream(inputStream, null, options);
          if (inputStream != null) {
             inputStream.close();
          }
          uBitmap = uBitmap1;
       }
    }
}
