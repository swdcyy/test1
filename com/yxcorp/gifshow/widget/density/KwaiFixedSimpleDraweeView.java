package com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import cw9.c;
import kd.b;
import java.lang.String;
import yb.b;
import yb.c;
import com.facebook.drawee.view.DraweeView;
import ll8.c$b;
import android.content.res.TypedArray;
import com.facebook.drawee.generic.RoundingParams;
import yb.a;
import ac.b;
import s0d.e;
import com.yxcorp.image.request.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import s0d.a;
import jd.c;
import azc.a;
import ac.a;
import com.facebook.drawee.view.SimpleDraweeView;

public class KwaiFixedSimpleDraweeView extends KwaiImageView	// class@001975
{
    public boolean x;
    public boolean y;

    public void KwaiFixedSimpleDraweeView(Context p0){
       super(p0, null, 0);
    }
    public void KwaiFixedSimpleDraweeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiFixedSimpleDraweeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public d e0(b p0,ImageRequest p1){
       return super.e0(p0, this.q0(p1));
    }
    public d f0(b p0,Object p1,ImageRequest p2){
       return super.f0(p0, p1, this.q0(p2));
    }
    public d g0(b p0,Object p1,ImageRequest[] p2){
       if (this.p0() && this.r0()) {
          ImageRequest[] imageRequest = new ImageRequest[p2.length];
          for (int i = 0; i < p2.length; i = i + 1) {
             imageRequest[i] = this.q0(p2[i]);
          }
          p2 = imageRequest;
       }
       return super.g0(p0, p1, p2);
    }
    public final void m0(Drawable p0){
       if (p0 instanceof BitmapDrawable && this.p0()) {
          Bitmap bitmap = p0.getBitmap();
          DisplayMetrics densityDpi = c.c(this.getResources()).densityDpi;
          if (bitmap != null && bitmap.getDensity() != densityDpi) {
             bitmap.setDensity(densityDpi);
          }
       }
       return;
    }
    public final boolean p0(){
       boolean b = (this.x == null && this.y != null)? true: false;
       return b;
    }
    public void q(Context p0,AttributeSet p1){
       boolean b;
       if (b.d()) {
          b.a("KwaiFixedSimpleDraweeView#inflateHierarchy");
       }
       b uob = c.d(p0, p1);
       this.setAspectRatio(uob.b());
       b = (c.c(p0.getApplicationContext().getResources()).densityDpi != c.c(this.getResources()).densityDpi)? true: false;
       this.y = b;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.M1);
          this.x = typedArray.getBoolean(0, 0);
          typedArray.recycle();
       }
       if (uob.h() != null) {
          this.m0(uob.e());
          this.m0(uob.c());
       }
       this.setHierarchy(uob.a());
       if (b.d()) {
          b.b();
       }
       return;
    }
    public final ImageRequest q0(ImageRequest p0){
       if (this.p0() && this.r0()) {
          if (p0 instanceof e) {
             a uoa = a.s(p0);
             e uoe = uoa.l(a.f(uoa.e().f(), c.c(this.getResources()).densityDpi)).q();
          }else {
             ImageRequestBuilder imageRequest = ImageRequestBuilder.d(p0);
             imageRequest.r(a.f(imageRequest.f(), c.c(this.getResources()).densityDpi));
             imageRequest = imageRequest.a();
          }
       }
       return p0;
    }
    public final boolean r0(){
       boolean b = (this.getHierarchy().n() != null)? true: false;
       return b;
    }
    public void setController(a p0){
       super.setController(p0);
    }
    public void setFailureImage(Drawable p0){
       if (this.r0()) {
          this.m0(p0);
       }
       this.getHierarchy().A(p0);
       return;
    }
    public void setForceKeepDensity(boolean p0){
       this.x = p0;
    }
    public void setImageRequest(ImageRequest p0){
       super.setImageRequest(this.q0(p0));
    }
    public void setPlaceHolderImage(Drawable p0){
       if (this.r0()) {
          this.m0(p0);
       }
       this.getHierarchy().F(p0);
       return;
    }
}
