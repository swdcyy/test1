package com.davemorrissey.labs.subscaleview.ImageSource;
import java.lang.Object;
import java.lang.Integer;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.String;
import java.io.File;
import java.net.URLDecoder;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.graphics.Rect;

public final class ImageSource	// class@000fa8
{
    public final Bitmap bitmap;
    public boolean cached;
    public final Integer resource;
    public int sHeight;
    public Rect sRegion;
    public int sWidth;
    public boolean tile;
    public final Uri uri;

    public void ImageSource(int p0){
       super();
       this.bitmap = null;
       this.uri = null;
       this.resource = Integer.valueOf(p0);
       this.tile = true;
    }
    public void ImageSource(Bitmap p0,boolean p1){
       super();
       this.bitmap = p0;
       this.uri = null;
       this.resource = null;
       this.tile = false;
       this.sWidth = p0.getWidth();
       this.sHeight = p0.getHeight();
       this.cached = p1;
    }
    public void ImageSource(Uri p0){
       try{
          super();
          String str = p0.toString();
          if (str.startsWith("file:///") && !new File(str.substring(7)).exists()) {
             p0 = Uri.parse(URLDecoder.decode(str, "UTF-8"));
          }
       label_0029 :
          this.bitmap = null;
          this.uri = p0;
          this.resource = null;
          this.tile = true;
          return;
       }catch(java.io.UnsupportedEncodingException e0){
       }
    }
    public static ImageSource asset(String p0){
       Objects.requireNonNull(p0, "Asset name must not be null");
       return ImageSource.uri("file:///android_asset/"+p0);
    }
    public static ImageSource bitmap(Bitmap p0){
       Objects.requireNonNull(p0, "Bitmap must not be null");
       return new ImageSource(p0, false);
    }
    public static ImageSource cachedBitmap(Bitmap p0){
       Objects.requireNonNull(p0, "Bitmap must not be null");
       return new ImageSource(p0, true);
    }
    public static ImageSource resource(int p0){
       return new ImageSource(p0);
    }
    public static ImageSource uri(Uri p0){
       Objects.requireNonNull(p0, "Uri must not be null");
       return new ImageSource(p0);
    }
    public static ImageSource uri(String p0){
       Objects.requireNonNull(p0, "Uri must not be null");
       if (!p0.contains("://")) {
          if (p0.startsWith("/")) {
             p0 = p0.substring(1);
          }
          p0 = "file:///"+p0;
       }
       return new ImageSource(Uri.parse(p0));
    }
    public ImageSource dimensions(int p0,int p1){
       if (this.bitmap == null) {
          this.sWidth = p0;
          this.sHeight = p1;
       }
       this.setInvariants();
       return this;
    }
    public final Bitmap getBitmap(){
       return this.bitmap;
    }
    public final Integer getResource(){
       return this.resource;
    }
    public final int getSHeight(){
       return this.sHeight;
    }
    public final Rect getSRegion(){
       return this.sRegion;
    }
    public final int getSWidth(){
       return this.sWidth;
    }
    public final boolean getTile(){
       return this.tile;
    }
    public final Uri getUri(){
       return this.uri;
    }
    public final boolean isCached(){
       return this.cached;
    }
    public ImageSource region(Rect p0){
       this.sRegion = p0;
       this.setInvariants();
       return this;
    }
    public final void setInvariants(){
       ImageSource tsRegion = this.sRegion;
       if (tsRegion != null) {
          this.tile = true;
          this.sWidth = tsRegion.width();
          this.sHeight = this.sRegion.height();
       }
       return;
    }
    public ImageSource tiling(boolean p0){
       this.tile = p0;
       return this;
    }
    public ImageSource tilingDisabled(){
       return this.tiling(false);
    }
    public ImageSource tilingEnabled(){
       return this.tiling(true);
    }
}
