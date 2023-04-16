package com.kwai.library.push.widget.InAppImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.widget.ImageView;
import kd.b;
import java.lang.String;
import yb.b;
import yb.c;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import ac.b;
import ll8.c$b;
import android.content.res.TypedArray;
import ac.a;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.lang.Object;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import cw9.c;

public class InAppImageView extends SimpleDraweeView	// class@0008dd
{
    public PaintFlagsDrawFilter j;
    public boolean k;

    public void InAppImageView(Context p0){
       super(p0);
       this.r(p0, null);
    }
    public void InAppImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.r(p0, p1);
    }
    public void InAppImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r(p0, p1);
    }
    public void onDraw(Canvas p0){
       if (this.k != null && Build$VERSION.SDK_INT >= 28) {
          if (this.j == null) {
             this.j = new PaintFlagsDrawFilter(0, 3);
          }
          p0.setDrawFilter(this.j);
       }
       super.onDraw(p0);
       return;
    }
    public void q(Context p0,AttributeSet p1){
       if (b.d()) {
          b.a("InAppImageView#inflateHierarchy");
       }
       b uob = c.d(p0, p1);
       this.w(uob.e());
       this.w(uob.c());
       this.setAspectRatio(uob.b());
       this.setHierarchy(uob.a());
       if (b.d()) {
          b.b();
       }
       return;
    }
    public final void r(Context p0,AttributeSet p1){
       boolean b;
       if (b.d()) {
          b.a("InAppImageView#init");
       }
       if (p1 != null && Build$VERSION.SDK_INT >= 28) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d5);
          b = (typedArray.hasValue(16) || typedArray.hasValue(26))? true: false;
          this.k = b;
          typedArray.recycle();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void setController(a p0){
       super.setController(p0);
    }
    public void setFailureImage(int p0){
       this.setFailureImage(this.getResources().getDrawable(p0));
    }
    public void setFailureImage(Drawable p0){
       this.getHierarchy().A(p0);
       this.w(p0);
    }
    public void setPlaceHolderImage(int p0){
       this.setPlaceHolderImage(this.getResources().getDrawable(p0));
    }
    public void setPlaceHolderImage(Drawable p0){
       this.getHierarchy().F(p0);
       this.w(p0);
    }
    public void v(String p0){
       if (p0 == null) {
          this.setController(null);
       }else {
          d uod = Fresco.newDraweeControllerBuilder();
          uod.y(this.getController());
          uod.w(ImageRequestBuilder.k(Uri.parse(p0)).a());
          uod.s(null);
          this.setController(uod.e());
       }
       return;
    }
    public final void w(Drawable p0){
       if (p0 instanceof BitmapDrawable) {
          p0.setTargetDensity(c.c(this.getContext().getApplicationContext().getResources()).densityDpi);
       }
       return;
    }
}
