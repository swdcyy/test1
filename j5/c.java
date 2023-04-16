package j5.c;
import com.airbnb.lottie.ex.model.layer.a;
import a5.f;
import com.airbnb.lottie.ex.model.layer.Layer;
import b5.a;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import m5.f;
import java.lang.Object;
import n5.c;
import a5.j;
import d5.p;
import android.graphics.Canvas;
import android.graphics.Paint;
import d5.a;
import android.graphics.ColorFilter;
import java.lang.String;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import f5.b;
import java.util.Map;
import a5.e;
import a5.c;
import a5.g;
import android.graphics.BitmapFactory$Options;
import android.util.Base64;
import android.graphics.BitmapFactory;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.AssetManager;
import java.lang.StringBuilder;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.IllegalStateException;

public class c extends a	// class@002228
{
    public final Paint w;
    public final Rect x;
    public final Rect y;
    public a z;

    public void c(f p0,Layer p1){
       super(p0, p1);
       this.w = new a(3);
       this.x = new Rect();
       this.y = new Rect();
    }
    public void c(RectF p0,Matrix p1,boolean p2){
       super.c(p0, p1, p2);
       Bitmap uBitmap = this.u();
       if (uBitmap != null) {
          p0.set(0, 0, ((float)uBitmap.getWidth() * f.c()), ((float)uBitmap.getHeight() * f.c()));
          this.m.mapRect(p0);
       }
       return;
    }
    public void f(Object p0,c p1){
       super.f(p0, p1);
       if (p0 == j.B) {
          this.z = (p1 == null)? null: new p(p1);
       }
    label_0014 :
       return;
    }
    public void j(Canvas p0,Matrix p1,int p2){
       Bitmap uBitmap = this.u();
       if (uBitmap != null && !uBitmap.isRecycled()) {
          float f = f.c();
          this.w.setAlpha(p2);
          c tz = this.z;
          if (tz != null) {
             this.w.setColorFilter(tz.h());
          }
          p0.save();
          p0.concat(p1);
          this.x.set(0, 0, uBitmap.getWidth(), uBitmap.getHeight());
          this.y.set(0, 0, (int)((float)uBitmap.getWidth() * f), (int)((float)uBitmap.getHeight() * f));
          p0.drawBitmap(uBitmap, this.x, this.y, this.w);
          p0.restore();
       }
       return;
    }
    public final Bitmap u(){
       b uob;
       Bitmap uBitmap1;
       String str = this.o.i();
       a tn = this.n;
       Bitmap uBitmap = null;
       boolean b = true;
       int i = 0;
       if (tn.getCallback() == null) {
          uob = uBitmap;
       }else {
          f h = tn.h;
          if (h != null) {
             Drawable$Callback callback = tn.getCallback();
             Context context = (callback != null && callback instanceof View)? callback.getContext(): uBitmap;
             h = (uBitmap1 != null || (h.a == null || h.a.equals(uBitmap1)))? 1: null;
             if (!h) {
                tn.h = uBitmap;
             }
          }
          if (tn.h == null) {
             tn.h = new b(tn.getCallback(), tn.i, tn.j, tn.c.g());
          }
          uob = tn.h;
       }
       try{
          if (uob != null) {
             g og = uob.d.get(str);
             if (og != null) {
                uBitmap1 = og.a();
                if (uBitmap1 != null) {
                   uBitmap = uBitmap1;
                }else {
                   b c = uob.c;
                   if (c != null) {
                      uBitmap = c.a(og);
                      if (uBitmap != null) {
                         uob.a(str, uBitmap);
                      }
                   }else {
                      String str1 = og.b();
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      options.inScaled = b;
                      options.inDensity = 160;
                      if (str1.startsWith("data:") && str1.indexOf("base64,") > 0) {
                         int i1 = 44;
                         try{
                            byte[] uobyteArray = Base64.decode(str1.substring((str1.indexOf(i1) + b)), i);
                            uBitmap = BitmapFactory.decodeByteArray(uobyteArray, i, uobyteArray.length, options);
                            uob.a(str, uBitmap);
                         }catch(java.lang.IllegalArgumentException e0){
                         }
                      }else if(!TextUtils.isEmpty(uob.b)){
                         uBitmap = BitmapFactory.decodeStream(SplitAssetHelper.open(uob.a.getAssets(), uob.b+str1), uBitmap, options);
                         uob.a(str, uBitmap);
                      }else {
                         throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                      }
                   }
                }
             }
          }
          return uBitmap;
       }catch(java.io.IOException e0){
       }
    }
}
