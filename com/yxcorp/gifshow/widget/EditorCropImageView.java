package com.yxcorp.gifshow.widget.EditorCropImageView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.CropSelectionBoxView;
import android.widget.TextView;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.widget.EditorCropImageView$g;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.EditorCropImageView$a;
import kxa.c$a;
import com.yxcorp.gifshow.widget.EditorCropImageView$b;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.EditorCropImageView$c;
import kxa.e;
import com.yxcorp.gifshow.widget.EditorCropImageView$d;
import kxa.g;
import android.graphics.RectF;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import kxa.a;
import android.graphics.Matrix;
import com.yxcorp.gifshow.widget.EditorCropImageView$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.EditorCropImageView$e;
import java.lang.Integer;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.widget.EditorCropImageView$h;
import com.yxcorp.gifshow.widget.EditorCropImageView$i;
import erd.g;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import usd.q;

public final class EditorCropImageView extends FrameLayout	// class@00182b
{
    public boolean b;
    public final KwaiZoomImageView c;
    public final ImageView d;
    public final CropSelectionBoxView e;
    public final TextView f;
    public float g;
    public float h;
    public b i;
    public EditorCropImageView$e j;
    public ValueAnimator k;
    public final EditorCropImageView$g l;
    public HashMap m;

    public void EditorCropImageView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void EditorCropImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void EditorCropImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       boolean b = true;
       this.b = b;
       KwaiZoomImageView kwaiZoomImag = new KwaiZoomImageView(p0);
       this.c = kwaiZoomImag;
       ImageView imageView = new ImageView(p0);
       this.d = imageView;
       CropSelectionBoxView uCropSelecti = new CropSelectionBoxView(p0, null, 0, 6, null);
       this.e = v7;
       TextView textView = new TextView(p0);
       this.f = textView;
       this.k = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(200);
       EditorCropImageView$g og = new EditorCropImageView$g(this);
       this.l = og;
       int i = -1;
       this.addView(kwaiZoomImag, i, i);
       this.addView(v7, i, i);
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "11")) {
       }else {
          imageView.setAdjustViewBounds(b);
          imageView.setCropToPadding(b);
          imageView.setVisibility(8);
          imageView.setBackgroundColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060073));
          this.addView(imageView, i, i);
       }
       if (!PatchProxy.applyVoid(null, this, EditorCropImageView.class, "12")) {
          textView.setBackground(a1.f(R.drawable.arg_RES_7f080675));
          textView.setText(a1.p(R.string.arg_RES_7f100bca));
          textView.setTextSize(12.00f);
          textView.setIncludeFontPadding(false);
          textView.setTextColor(a1.b(R.color.arg_RES_7f06071c));
          textView.setPadding(a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f070334), a1.d(R.dimen.arg_RES_7f070271), a1.d(R.dimen.arg_RES_7f070334));
          textView.setGravity(17);
          textView.setVisibility(8);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
          layoutParams.gravity = b;
          layoutParams.bottomMargin = a1.d(0x7f0702fd);
          this.addView(textView, layoutParams);
       }
       kwaiZoomImag.setVisibility(8);
       kwaiZoomImag.setBoundsProvider(new EditorCropImageView$a(this));
       v7.setImageBoundsProvider(new EditorCropImageView$b(this));
       Objects.requireNonNull(v7);
       if (!PatchProxy.applyVoidOneRefs(og, v7, CropSelectionBoxView.class, "31")) {
          a.p(og, "listener");
          v7.u.add(og);
       }
       kwaiZoomImag.setOnImageDragListener(new EditorCropImageView$c(this));
       kwaiZoomImag.setOnScaleChangeListener(new EditorCropImageView$d(this));
       return;
    }
    public void EditorCropImageView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "25")) {
          return;
       }
       this.k.removeAllUpdateListeners();
       this.k.removeAllListeners();
       this.k.cancel();
       return;
    }
    public final ValueAnimator b(float p0,float p1,RectF p2,RectF p3){
       a obj;
       if (PatchProxy.isSupport(EditorCropImageView.class)) {
          obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), p2, p3, this, EditorCropImageView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c.getAttacher();
       a.o(obj, "mImageView.attacher");
       Matrix matrix = obj.p();
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(200);
       this.k = valueAnimato;
       EditorCropImageView$f uof = new EditorCropImageView$f(this, p2, p3, p0, p1, matrix);
       valueAnimato.addUpdateListener(v1);
       EditorCropImageView tk = this.k;
       a.o(tk, "mAnimator");
       return tk;
    }
    public final void c(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorCropImageView.class, "24")) {
          return;
       }
       p0.left = (float)Math.rint((double)p0.left);
       p0.top = (float)Math.rint((double)p0.top);
       p0.right = (float)Math.rint((double)p0.right);
       p0.bottom = (float)Math.rint((double)p0.bottom);
       return;
    }
    public final RectF d(RectF p0,RectF p1,float p2){
       RectF obj;
       if (PatchProxy.isSupport(EditorCropImageView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), this, EditorCropImageView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.isEmpty() || p1.isEmpty()) {
          Object[] objArray = new Object[0];
          a.D().A("EditorCropImageView", "getCropRectF: is empty", objArray);
          return new RectF(0, 0, 0x3f800000, 0x3f800000);
       }else {
          obj = new RectF(p0);
          p0 = new RectF(p1);
          float f = (float)2;
          float f1 = (obj.left + obj.right) / f;
          float f2 = (obj.top + obj.bottom) / f;
          Matrix matrix = new Matrix();
          matrix.setRotate((- p2), f1, f2);
          Object[] objArray1 = new Object[0];
          a.D().s("EditorCropImageView", "before mapRect cropRect="+obj+",mRotation="+p2+",matrix="+matrix, objArray1);
          this.c(obj);
          this.c(p0);
          matrix.mapRect(obj);
          matrix.mapRect(p0);
          Object[] objArray2 = new Object[0];
          a.D().s("EditorCropImageView", "after mapRect cropRect="+obj+",displayRect="+p0, objArray2);
          f1 = new RectF(obj);
          obj.left = (f1.left - p0.left) / p0.width();
          obj.top = (f1.top - p0.top) / p0.height();
          obj.right = (f1.width() / p0.width()) + obj.left;
          obj.bottom = (f1.height() / p0.height()) + obj.top;
          Object[] objArray3 = new Object[0];
          a.D().s("EditorCropImageView", "after [0,1] cropRect="+obj, objArray3);
          f1 = (float)0;
          if (obj.left - f1 < 0) {
             obj.left = 0;
          }
          if (obj.top - f1 < 0) {
             obj.top = 0;
          }
          if (obj.right - 0x3f800000 > 0) {
             obj.right = 0x3f800000;
          }
          if (obj.bottom - 0x3f800000 > 0) {
             obj.bottom = 0x3f800000;
          }
          objArray3 = new Object[0];
          a.D().w("EditorCropImageView", "getCropRectF :"+obj, objArray3);
          return obj;
       }
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "22")) {
          return;
       }
       this.n();
       this.o();
       this.e.setVisibility(0);
       this.e.c(null);
       return;
    }
    public final boolean f(){
       boolean b;
       RectF obj = PatchProxy.apply(null, this, EditorCropImageView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.c.getOriginalRect() != null) {
          obj = this.c.getOriginalRect();
          a.o(obj, "mImageView.originalRect");
          if (!obj.isEmpty()) {
             b = false;
          label_0032 :
             Object[] objArray = new Object[i];
             a.D().w("EditorCropImageView", "isImageNotReady\(\) called result="+b, objArray);
             return b;
          }
       }
       b = true;
       goto label_0032 ;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "16")) {
          return;
       }
       if (!this.e.getSelectionBoxRect().isEmpty() && this.c.getDisplayRect() != null) {
          RectF displayRect = this.c.getDisplayRect();
          String str = "mImageView.displayRect";
          a.o(displayRect, str);
          if (!displayRect.isEmpty()) {
             EditorCropImageView tj = this.j;
             if (tj != null) {
                RectF displayRect1 = this.c.getDisplayRect();
                a.o(displayRect1, str);
                tj.g(this.d(this.e.getSelectionBoxRect(), displayRect1, this.g));
             }
             return;
          }
       }
       Object[] objArray = new Object[0];
       a.D().A("EditorCropImageView", "onChangeCropRect: rect is not ready", objArray);
       return;
    }
    public final KwaiZoomImageView getImageView(){
       return this.c;
    }
    public final boolean getNeedShowReset(){
       return this.b;
    }
    public final ImageView getPlaceholderImageView(){
       return this.d;
    }
    public final View getResetButton(){
       return this.f;
    }
    public final CropSelectionBoxView getSelectionBoxView(){
       return this.e;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "14")) {
          return;
       }
       RectF originalRect = this.c.getOriginalRect();
       a.o(originalRect, "mImageView.originalRect");
       this.i(originalRect, (- this.g), 0, 0);
       this.g = 0;
       this.e.setRectRatio(0);
       this.e.h(this.h);
       this.c.o0();
       this.n();
       this.o();
       EditorCropImageView tj = this.j;
       if (tj != null) {
          tj.e();
       }
       return;
    }
    public final void i(RectF p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(EditorCropImageView.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, EditorCropImageView.class, "21")) {
          return;
       }
       Matrix matrix = new Matrix();
       matrix.setRotate(p1, p2, p3);
       matrix.mapRect(p0);
       return;
    }
    public final void j(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(EditorCropImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, EditorCropImageView.class, "5")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.setMargins(p0, p1, p2, p3);
       this.invalidate();
       return;
    }
    public final void k(boolean p0,boolean p1){
       if (PatchProxy.isSupport(EditorCropImageView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditorCropImageView.class, "6")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorCropImageView", "showResetButton show="+p0+",animate="+p1, objArray);
       EditorCropImageView ti = this.i;
       if (ti != null) {
          ti.dispose();
       }
       if (!p0) {
          this.l(p0, p1);
          return;
       }else {
          this.i = t.timer(200, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new EditorCropImageView$h(this, p0, p1), EditorCropImageView$i.b);
          return;
       }
    }
    public final void l(boolean p0,boolean p1){
       if (PatchProxy.isSupport(EditorCropImageView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditorCropImageView.class, "7")) {
          return;
       }
       int i = 0;
       int i1 = (!this.f.getVisibility())? 1: 0;
       EditorCropImageView tf = this.f;
       if (!p0) {
          i = 8;
       }
       tf.setVisibility(i);
       if (p1) {
          if (p0 && !i1) {
             this.f.startAnimation(AnimationUtils.loadAnimation(this.f.getContext(), R.anim.arg_RES_7f01004a));
          }else if(!p0 && i1){
             this.f.startAnimation(AnimationUtils.loadAnimation(this.f.getContext(), R.anim.arg_RES_7f01004c));
          }
       }
       return;
    }
    public final void m(boolean p0){
       if (PatchProxy.isSupport(EditorCropImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditorCropImageView.class, "20")) {
          return;
       }
       EditorCropImageView tk = this.k;
       if (tk != null) {
          tk.start();
          tk = this.j;
          if (tk != null) {
             tk.onAnimationStart();
          }
          if (p0) {
             this.k(false, false);
          }
       }
       return;
    }
    public final void n(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "23")) {
          return;
       }
       String str = "updateMinimumScale image not ready, return";
       int i = 0;
       if (this.f()) {
          objArray = new Object[i];
          a.D().A("EditorCropImageView", str, objArray);
          return;
       }else {
          RectF originalRect = this.c.getOriginalRect();
          String str1 = "mImageView.originalRect";
          a.o(originalRect, str1);
          if (originalRect.isEmpty()) {
             this.c.getHierarchy().k(this.c.getOriginalRect());
             Object[] objArray1 = new Object[i];
             a.D().w("EditorCropImageView", "updateMinimumScale: try get originalRect="+this.c.getOriginalRect(), objArray1);
             originalRect = this.c.getOriginalRect();
             a.o(originalRect, str1);
             if (originalRect.isEmpty()) {
                objArray = new Object[i];
                a.D().A("EditorCropImageView", str, objArray);
                return;
             }
          }
          float f = q.t(q.m((this.e.getSelectionBoxRect().width() / this.c.getOriginalRect().width()), (this.e.getSelectionBoxRect().height() / this.c.getOriginalRect().height())), (this.c.getMediumScale() - 0.10f));
          objArray = new Object[i];
          a.D().w("EditorCropImageView", "updateMinimumScale = "+f+",rectBox="+this.e.getSelectionBoxRect()+','+"rectImage="+this.c.getOriginalRect()+" , mediumScale="+this.c.getMediumScale(), objArray);
          this.c.setMinimumScale(f);
          return;
       }
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, EditorCropImageView.class, "13")) {
          return;
       }
       this.f.setTranslationY((this.e.getSelectionBoxRect().bottom - (float)a1.d(R.dimen.arg_RES_7f070315)));
       return;
    }
    public final void setAnimatorsListener(EditorCropImageView$e p0){
       this.j = p0;
    }
    public final void setNeedShowReset(boolean p0){
       this.b = p0;
    }
}
