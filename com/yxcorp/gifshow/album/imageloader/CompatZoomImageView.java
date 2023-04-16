package com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import f79.c;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import f79.a;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView$b;
import java.lang.Number;
import f79.d;
import f79.g;
import ub.b;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView$c;
import c79.b;
import com.facebook.drawee.controller.ForwardingControllerListener;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.yxcorp.gifshow.image.KwaiImageView;
import f79.c$a;
import android.view.GestureDetector$OnDoubleTapListener;
import a2.f;
import f79.b;
import android.view.View$OnLongClickListener;
import f79.e;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView$a;
import android.view.View;
import android.net.Uri;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Long;

public class CompatZoomImageView extends CompatImageView implements c	// class@001a23
{
    public boolean A;
    public boolean B;
    public RectF C;
    public float D;
    public a z;

    public void CompatZoomImageView(Context p0){
       super(p0);
       this.A = true;
       this.s0();
    }
    public void CompatZoomImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.A = true;
       this.s0();
    }
    public void CompatZoomImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.A = true;
       this.s0();
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CompatZoomImageView.class, "27")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tz, a.class, "11")) {
          tz.r = p0;
          tz.q = p1;
          tz.u();
       }
       return;
    }
    public void e(float p0,boolean p1){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, CompatZoomImageView.class, "15")) {
          return;
       }
       this.z.e(p0, p1);
       return;
    }
    public void g(float p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, CompatZoomImageView.class, "16")) {
          return;
       }
       this.z.g(p0, p1, p2, p3);
       return;
    }
    public a getAttacher(){
       return this.z;
    }
    public RectF getDisplayRect(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.m();
    }
    public CompatZoomImageView$b getImageCallback(){
       return null;
    }
    public float getMaximumScale(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.z.getMaximumScale();
    }
    public float getMediumScale(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.z.getMediumScale();
    }
    public float getMinimumScale(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.z.getMinimumScale();
    }
    public d getOnPhotoTapListener(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getOnPhotoTapListener();
    }
    public g getOnViewTapListener(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getOnViewTapListener();
    }
    public RectF getOriginalRect(){
       return this.C;
    }
    public float getOriginalScale(){
       return this.D;
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, CompatZoomImageView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.z.getScale();
    }
    public b k0(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CompatZoomImageView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new CompatZoomImageView$c(this, null);
       }
       return ForwardingControllerListener.of(p0, new CompatZoomImageView$c(this, null));
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, CompatZoomImageView.class, "5")) {
          return;
       }
       this.s0();
       super.onAttachedToWindow();
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CompatZoomImageView.class, "6")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoid(objArray, tz, a.class, "32")) {
          tz.f();
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "2")) {
          return;
       }
       int i = p0.save();
       if (this.A != null) {
          p0.concat(this.z.o());
       }
       super.onDraw(p0);
       p0.restoreToCount(i);
       this.n0(p0);
       return;
    }
    public final void s0(){
       if (PatchProxy.applyVoid(null, this, CompatZoomImageView.class, "4")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       if (tz == null || tz.p() == null) {
          this.z = new a(this);
       }
       return;
    }
    public void setAllowParentInterceptOnEdge(boolean p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CompatZoomImageView.class, "19")) {
          return;
       }
       this.z.m = p0;
       return;
    }
    public void setAutoSetMinScale(boolean p0){
       this.B = p0;
    }
    public void setBoundsProvider(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "29")) {
          return;
       }
       this.z.y = p0;
       return;
    }
    public void setEnableDraweeMatrix(boolean p0){
       this.A = p0;
    }
    public void setMaximumScale(float p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CompatZoomImageView.class, "12")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tz, a.class, "4")) {
          a.k(tz.f, tz.g, p0);
          tz.h = p0;
       }
       return;
    }
    public void setMediumScale(float p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CompatZoomImageView.class, "11")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tz, a.class, "5")) {
          a.k(tz.f, p0, tz.h);
          tz.g = p0;
       }
       return;
    }
    public void setMinimumScale(float p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CompatZoomImageView.class, "10")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tz, a.class, "6")) {
          a.k(p0, tz.g, tz.h);
          tz.f = p0;
       }
       return;
    }
    public void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "20")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoidOneRefs(p0, tz, a.class, "2")) {
          if (p0 != null) {
             tz.k.b(p0);
          }else {
             tz.k.b(new b(tz));
          }
       }
       return;
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "22")) {
          return;
       }
       this.z.w = p0;
       return;
    }
    public void setOnPhotoTapListener(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "23")) {
          return;
       }
       this.z.u = p0;
       return;
    }
    public void setOnScaleChangeListener(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "21")) {
          return;
       }
       this.z.x = p0;
       return;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "1")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       if (tz != null) {
          View$OnTouchListener[] onTouchListe = new View$OnTouchListener[]{p0,tz};
          CompatZoomImageView$a uoa = PatchProxy.applyOneRefs(onTouchListe, null, CompatZoomImageView$a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new CompatZoomImageView$a(onTouchListe);
          }
          super.setOnTouchListener(uoa);
          return;
       }else {
          super.setOnTouchListener(p0);
          return;
       }
    }
    public void setOnViewTapListener(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "24")) {
          return;
       }
       this.z.v = p0;
       return;
    }
    public void setOrientation(int p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CompatZoomImageView.class, "17")) {
          return;
       }
       this.z.b = p0;
       return;
    }
    public void setPhotoUri(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompatZoomImageView.class, "30")) {
          return;
       }
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, CompatZoomImageView.class, "31")) {
          this.A = false;
          d uod = Fresco.newDraweeControllerBuilder().r(obj).D(p0);
          uod.y(this.getController());
          uod.s(new b(this));
          this.setController(uod.e());
       }
       return;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CompatZoomImageView.class, "14")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       Objects.requireNonNull(tz);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tz, a.class, "8")) {
          tz.e(p0, false);
       }
       return;
    }
    public void setZoomTransitionDuration(long p0){
       if (PatchProxy.isSupport(CompatZoomImageView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, CompatZoomImageView.class, "18")) {
          return;
       }
       CompatZoomImageView tz = this.z;
       if (p0 < 0) {
          p0 = 200;
       }
       tz.i = p0;
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, CompatZoomImageView.class, "28")) {
          return;
       }
       this.z.u();
       return;
    }
}
