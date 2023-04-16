package com.yxcorp.gifshow.image.KwaiZoomImageView;
import kxa.c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kxa.a;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kxa.f;
import kxa.i;
import ub.b;
import com.yxcorp.gifshow.image.KwaiZoomImageView$b;
import jxa.a;
import com.facebook.drawee.controller.ForwardingControllerListener;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import ll8.c$b;
import android.content.res.TypedArray;
import kxa.c$a;
import android.view.GestureDetector$OnDoubleTapListener;
import kxa.e;
import android.view.View$OnLongClickListener;
import kxa.g;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.image.KwaiZoomImageView$a;
import android.view.View;
import android.net.Uri;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.lang.Long;

public class KwaiZoomImageView extends KwaiBindableImageView implements c	// class@00194a
{
    public Drawable A;
    public a v;
    public boolean w;
    public boolean x;
    public RectF y;
    public float z;

    public void KwaiZoomImageView(Context p0){
       super(p0);
       this.w = true;
       this.r(p0, null);
    }
    public void KwaiZoomImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = true;
       this.r(p0, p1);
    }
    public void KwaiZoomImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = true;
       this.r(p0, p1);
    }
    public void d(int p0,int p1){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiZoomImageView.class, "32")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tv, a.class, "11")) {
          tv.r = p0;
          tv.q = p1;
          tv.w();
       }
       return;
    }
    public void drawableStateChanged(){
       if (PatchProxy.applyVoid(null, this, KwaiZoomImageView.class, "6")) {
          return;
       }
       super.drawableStateChanged();
       KwaiZoomImageView tA = this.A;
       if (tA != null && tA.isStateful()) {
          this.A.setState(this.getDrawableState());
       }
       return;
    }
    public void e(float p0,boolean p1){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, KwaiZoomImageView.class, "19")) {
          return;
       }
       this.v.e(p0, p1);
       return;
    }
    public void g(float p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, KwaiZoomImageView.class, "20")) {
          return;
       }
       this.v.g(p0, p1, p2, p3);
       return;
    }
    public a getAttacher(){
       return this.v;
    }
    public RectF getDisplayRect(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.n();
    }
    public float getMaximumScale(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.v.getMaximumScale();
    }
    public float getMediumScale(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.v.getMediumScale();
    }
    public float getMinimumScale(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.v.getMinimumScale();
    }
    public f getOnPhotoTapListener(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getOnPhotoTapListener();
    }
    public i getOnViewTapListener(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getOnViewTapListener();
    }
    public RectF getOriginalRect(){
       return this.y;
    }
    public float getOriginalScale(){
       return this.z;
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, KwaiZoomImageView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.v.getScale();
    }
    public b k0(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiZoomImageView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new KwaiZoomImageView$b(this, null);
       }
       return ForwardingControllerListener.of(new KwaiZoomImageView$b(this, null), p0);
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, KwaiZoomImageView.class, "8")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       if (tv == null || tv.q() == null) {
          this.v = new a(this);
       }
       return;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, KwaiZoomImageView.class, "33")) {
          return;
       }
       this.v.w();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiZoomImageView.class, "9")) {
          return;
       }
       this.n0();
       super.onAttachedToWindow();
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiZoomImageView.class, "10")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoid(objArray, tv, a.class, "33")) {
          tv.i();
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "5")) {
          return;
       }
       int i = p0.save();
       if (this.w != null) {
          p0.concat(this.v.p());
       }
       super.onDraw(p0);
       p0.restoreToCount(i);
       if (!PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "3")) {
          KwaiZoomImageView tA = this.A;
          if (tA != null) {
             tA.setBounds(new Rect(this.getPaddingLeft(), this.getPaddingTop(), (this.getWidth() - this.getPaddingRight()), (this.getHeight() - this.getPaddingBottom())));
             this.A.draw(p0);
          }
       }
       return;
    }
    public final void r(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiZoomImageView.class, "1")) {
          return;
       }
       this.n0();
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W1);
          this.A = typedArray.getDrawable(0);
          typedArray.recycle();
       }
       return;
    }
    public void setAllowParentInterceptOnEdge(boolean p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiZoomImageView.class, "23")) {
          return;
       }
       this.v.m = p0;
       return;
    }
    public void setAutoSetMinScale(boolean p0){
       this.x = p0;
    }
    public void setBoundsProvider(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "34")) {
          return;
       }
       this.v.z = p0;
       return;
    }
    public void setEnableDraweeMatrix(boolean p0){
       this.w = p0;
    }
    public void setForegroundDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "2")) {
          return;
       }
       this.A = p0;
       this.invalidate();
       return;
    }
    public void setMaximumScale(float p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KwaiZoomImageView.class, "16")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tv, a.class, "4")) {
          a.l(tv.f, tv.g, p0);
          tv.h = p0;
       }
       return;
    }
    public void setMediumScale(float p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KwaiZoomImageView.class, "15")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tv, a.class, "5")) {
          a.l(tv.f, p0, tv.h);
          tv.g = p0;
       }
       return;
    }
    public void setMinimumScale(float p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KwaiZoomImageView.class, "14")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), tv, a.class, "6")) {
          a.l(p0, tv.g, tv.h);
          tv.f = p0;
       }
       return;
    }
    public void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "24")) {
          return;
       }
       this.v.setOnDoubleTapListener(p0);
       return;
    }
    public void setOnImageDragListener(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "26")) {
          return;
       }
       this.v.setOnImageDragListener(p0);
       return;
    }
    public void setOnLongClickListener(View$OnLongClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "27")) {
          return;
       }
       this.v.setOnLongClickListener(p0);
       return;
    }
    public void setOnPhotoTapListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "28")) {
          return;
       }
       this.v.u = p0;
       return;
    }
    public void setOnScaleChangeListener(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "25")) {
          return;
       }
       this.v.setOnScaleChangeListener(p0);
       return;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "4")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       if (tv != null) {
          View$OnTouchListener[] onTouchListe = new View$OnTouchListener[]{p0,tv};
          KwaiZoomImageView$a uoa = PatchProxy.applyOneRefs(onTouchListe, null, KwaiZoomImageView$a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new KwaiZoomImageView$a(onTouchListe);
          }
          super.setOnTouchListener(uoa);
          return;
       }else {
          super.setOnTouchListener(p0);
          return;
       }
    }
    public void setOnViewTapListener(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "29")) {
          return;
       }
       this.v.setOnViewTapListener(p0);
       return;
    }
    public void setOrientation(int p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiZoomImageView.class, "21")) {
          return;
       }
       this.v.b = p0;
       return;
    }
    public void setPhotoUri(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiZoomImageView.class, "35")) {
          return;
       }
       Object obj = null;
       if (!PatchProxy.applyVoidTwoRefs(p0, obj, this, KwaiZoomImageView.class, "36")) {
          this.w = false;
          d uod = Fresco.newDraweeControllerBuilder().r(obj).D(p0);
          uod.y(this.getController());
          uod.s(new a(this));
          this.setController(uod.e());
       }
       return;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KwaiZoomImageView.class, "18")) {
          return;
       }
       this.v.setScale(p0);
       return;
    }
    public void setZoomTransitionDuration(long p0){
       if (PatchProxy.isSupport(KwaiZoomImageView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KwaiZoomImageView.class, "22")) {
          return;
       }
       KwaiZoomImageView tv = this.v;
       if (p0 < 0) {
          p0 = 200;
       }
       tv.i = p0;
       return;
    }
}
