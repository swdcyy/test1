package com.kwai.emotionsdk.widget.FrescoImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import kd.b;
import yb.b;
import yb.c;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import ac.b;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Integer;
import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import java.io.File;
import android.net.Uri;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import uc.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import kk5.c;
import kk5.b;

public class FrescoImageView extends SimpleDraweeView	// class@000dc1
{
    public Integer j;
    public PaintFlagsDrawFilter k;
    public boolean l;
    public boolean m;
    public boolean n;

    public void FrescoImageView(Context p0){
       super(p0);
       this.r(p0, null);
    }
    public void FrescoImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.r(p0, p1);
    }
    public void FrescoImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r(p0, p1);
    }
    public final void A(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "12")) {
          return;
       }
       if (p0 instanceof BitmapDrawable) {
          DisplayMetrics densityDpi = c.c(this.getContext().getApplicationContext().getResources()).densityDpi;
          Bitmap bitmap = p0.getBitmap();
          if (bitmap != null) {
             bitmap.setDensity(densityDpi);
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "2")) {
          return;
       }
       if (this.l != null || (this.n != null && (this.m != null && Build$VERSION.SDK_INT >= 28))) {
          if (this.k == null) {
             this.k = new PaintFlagsDrawFilter(0, 3);
          }
          p0.setDrawFilter(this.k);
       }
    label_002f :
       super.onDraw(p0);
       return;
    }
    public void q(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrescoImageView.class, "11")) {
          return;
       }
       if (b.d()) {
          b.a("KwaiBindableImageView#inflateHierarchy");
       }
       b uob = c.d(p0, p1);
       this.A(uob.e());
       this.A(uob.c());
       this.setAspectRatio(uob.b());
       this.setHierarchy(uob.a());
       if (b.d()) {
          b.b();
       }
       return;
    }
    public final void r(Context p0,AttributeSet p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrescoImageView.class, "1")) {
          return;
       }
       if (b.d()) {
          b.a("KwaiBindableImageView#init");
       }
       b = true;
       this.m = b;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d5);
          if (!typedArray.hasValue(16) && !typedArray.hasValue(26)) {
             b = false;
          }
          this.l = b;
          typedArray.recycle();
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void setDoAntiAliasing(boolean p0){
       this.n = p0;
    }
    public void setFailureImage(int p0){
       if (PatchProxy.isSupport(FrescoImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrescoImageView.class, "5")) {
          return;
       }
       this.setFailureImage(this.getResources().getDrawable(p0));
       return;
    }
    public void setFailureImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "6")) {
          return;
       }
       this.getHierarchy().A(p0);
       this.A(p0);
       return;
    }
    public void setImageRotation(int p0){
       if (PatchProxy.isSupport(FrescoImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrescoImageView.class, "9")) {
          return;
       }
       this.j = Integer.valueOf(p0);
       return;
    }
    public void setOverlayColor(int p0){
       if (PatchProxy.isSupport(FrescoImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrescoImageView.class, "8")) {
          return;
       }
       this.getHierarchy().C(new ColorDrawable(ContextCompat.getColor(this.getContext(), p0)));
       return;
    }
    public void setOverlayImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "7")) {
          return;
       }
       this.getHierarchy().C(p0);
       return;
    }
    public void setPlaceHolderImage(int p0){
       if (PatchProxy.isSupport(FrescoImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrescoImageView.class, "3")) {
          return;
       }
       this.setPlaceHolderImage(this.getResources().getDrawable(p0));
       return;
    }
    public void setPlaceHolderImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "4")) {
          return;
       }
       this.getHierarchy().F(p0);
       this.A(p0);
       return;
    }
    public void v(File p0,int p1,int p2){
       if (PatchProxy.isSupport(FrescoImageView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FrescoImageView.class, "25")) {
          return;
       }
       if (!PatchProxy.isSupport(FrescoImageView.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, this, FrescoImageView.class, "26")) {
          this.x(Uri.fromFile(p0), p1, p2, null);
       }
       return;
    }
    public ImageRequest w(Uri p0,int p1,int p2){
       if (PatchProxy.isSupport(FrescoImageView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FrescoImageView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.x(p0, p1, p2, null);
    }
    public ImageRequest x(Uri p0,int p1,int p2,b p3){
       Object[] obj;
       Object obj1;
       if (PatchProxy.isSupport(FrescoImageView.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, FrescoImageView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       if (PatchProxy.isSupport(FrescoImageView.class)) {
          obj = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.FALSE,p3};
          obj1 = PatchProxy.apply(obj, this, FrescoImageView.class, "15");
          if (obj1 != PatchProxyResult.class) {
          label_00c7 :
             return obj1;
          }
       }
       if (PatchProxy.isSupport(FrescoImageView.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.FALSE, this, FrescoImageView.class, "16");
          if (obj1 != PatchProxyResult.class) {
          label_00a2 :
             d uod = PatchProxy.applyTwoRefs(p3, obj1, this, FrescoImageView.class, "30");
             if (uod != PatchProxyResult.class) {
             }else {
                uod = Fresco.newDraweeControllerBuilder();
                uod.y(this.getController());
                uod.w(obj1);
                uod.s(p3);
             }
             this.setController(uod.e());
             goto label_00c7 ;
          }
       }
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0);
       if (p1 > 0 && p2 > 0) {
          imageRequest.v(new d(p1, p2));
       }
       FrescoImageView tj = this.j;
       if (tj != null && tj.intValue() > -1) {
          imageRequest.w(e.d(this.j.intValue()));
       }
       obj1 = imageRequest.a();
       goto label_00a2 ;
    }
    public void y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrescoImageView.class, "23")) {
          return;
       }
       CDNUrl[] uCDNUrlArray = new CDNUrl[p0.size()];
       CDNUrl[] uCDNUrlArray1 = p0.toArray(uCDNUrlArray);
       if (!PatchProxy.applyVoidOneRefs(uCDNUrlArray1, this, FrescoImageView.class, "24")) {
          b uob = null;
          d uod = this.z(uob, uob, c.c().a(uCDNUrlArray1).b());
          if (uod != null) {
             uob = uod.e();
          }
          this.setController(uob);
       }
       return;
    }
    public d z(b p0,Object p1,ImageRequest[] p2){
       p0 = PatchProxy.applyThreeRefs(null, null, p2, this, FrescoImageView.class, "29");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p1 = null;
       if (p2.length > 0) {
          d uod = Fresco.newDraweeControllerBuilder().r(p1);
          uod.y(this.getController());
          uod.s(p1);
          uod.v(p2, false);
          p1 = uod;
       }
       return p1;
    }
}
