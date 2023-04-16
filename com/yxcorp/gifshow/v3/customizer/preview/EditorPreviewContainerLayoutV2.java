package com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayoutV2;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayoutV2$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import toc.c;
import toc.e;
import android.graphics.RectF;
import t36.f;
import android.graphics.Matrix;
import android.app.Activity;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import lnc.u6;
import android.graphics.Point;
import com.yxcorp.utility.n;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.animation.AnimatorListenerAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import toc.a;
import java.lang.Float;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import faa.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import xv9.b;

public final class EditorPreviewContainerLayoutV2 extends BaseEditorPreviewContainerLayout	// class@000d55
{
    public c d;
    public f e;
    public int f;
    public int g;
    public final RectF h;
    public final RectF i;
    public RectF j;
    public final Matrix k;
    public final RectF l;
    public FlexScreenStatusData m;
    public HashMap n;
    public static final EditorPreviewContainerLayoutV2$a o;

    static {
       EditorPreviewContainerLayoutV2.o = new EditorPreviewContainerLayoutV2$a(null);
    }
    public void EditorPreviewContainerLayoutV2(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void EditorPreviewContainerLayoutV2(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void EditorPreviewContainerLayoutV2(Context p0,AttributeSet p1,int p2){
       FlexScreenStatusData uFlexScreenS;
       EditorPreviewContainerLayoutV2 uEditorPrevi = this;
       Point obj = p0;
       a.p(obj, "context");
       super(p0, p1, p2);
       c uoc = new c(null, null, null, 7, null);
       uEditorPrevi.d = v2;
       uEditorPrevi.e = new f();
       RectF rectF = new RectF();
       uEditorPrevi.h = rectF;
       uEditorPrevi.i = new RectF();
       uEditorPrevi.j = new RectF();
       uEditorPrevi.k = new Matrix();
       uEditorPrevi.l = new RectF();
       if (obj instanceof Activity) {
          uFlexScreenS = u6.a(obj, 0);
       }else {
          FlexScreenStatusData uFlexScreenS1 = new FlexScreenStatusData(false, false, false, false, false, 0, 0, 0, 0, 0, 0, 2047, null);
       }
       uEditorPrevi.m = uFlexScreenS;
       obj = n.s(p0);
       rectF.set(0, 0, (float)obj.x, (float)obj.y);
       uEditorPrevi.f = obj.x;
       uEditorPrevi.g = obj.y;
       uEditorPrevi.d.b().set(0, 0, 0, 0);
       uEditorPrevi.d.c().set(0, 0, 0, 0);
       uEditorPrevi.g(uEditorPrevi.d, true, null);
       return;
    }
    public void EditorPreviewContainerLayoutV2(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void a(RectF p0,boolean p1,AnimatorListenerAdapter p2,boolean p3,long p4){
       float f7;
       float f8;
       int this;
       EditorPreviewContainerLayoutV2 uEditorPrevi = this;
       object oobject = p0;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayoutV2.class, "15")) {
             return;
          }
       }
       a.p(oobject, "customTransRect");
       uEditorPrevi.d.c().set(oobject);
       RectF rectF = new RectF(oobject);
       float f = (float)i1;
       if (rectF.width() - f <= 0 || rectF.height() - f <= 0) {
          EditorPreviewContainerLayoutV2 j = uEditorPrevi.j;
          rectF.set(j.left, j.top, j.width(), uEditorPrevi.j.height());
       }
       this.setPivotY(0);
       this.setPivotX((uEditorPrevi.j.width() / (float)i));
       float f1 = rectF.width() / uEditorPrevi.j.width();
       float f2 = rectF.height() / uEditorPrevi.j.height();
       float f3 = (f1 - f <= 0)? 0x3f800000: f1;
       float f4 = (f2 - f <= 0)? 0x3f800000: f2;
       float f5 = rectF.centerX() - uEditorPrevi.j.centerX();
       float f6 = rectF.top - uEditorPrevi.j.top;
       uEditorPrevi.k.reset();
       uEditorPrevi.k.postScale(f3, f4, uEditorPrevi.j.centerX(), uEditorPrevi.j.top);
       uEditorPrevi.k.postTranslate(f5, f6);
       uEditorPrevi.k.mapRect(uEditorPrevi.l, uEditorPrevi.j);
       if (!p3) {
          f7 = rectF.centerY() - uEditorPrevi.j.centerY();
          f2 = rectF.centerX() - uEditorPrevi.j.centerX();
          f = 0x3f800000;
          f8 = 0x3f800000;
       }else {
          f8 = f3;
          f = f4;
          f2 = f5;
          f7 = f6;
       }
       if (p1) {
          if (p3) {
             this.f(f8, f, f2, f7, p2, p4);
          }else {
             this.f(this.getScaleX(), this.getScaleY(), f2, f7, p2, p4);
             this.getLayoutParams().width = (int)p0.width();
             this.getLayoutParams().height = (int)p0.height();
          }
       }else if(p3){
          this.setScaleX(f8);
          this.setScaleY(f);
       }else {
          this.getLayoutParams().width = (int)p0.width();
          this.getLayoutParams().height = (int)p0.height();
       }
       this.setTranslationX(f2);
       this.setTranslationY(f7);
       this = 0x7f0a2db3;
       View view = this.findViewById(this);
       EditDecorationContainerViewV2 uEditDecorat = null;
       if (view == null) {
          ViewParent parent = this.getParent();
          if (!parent instanceof View) {
             parent = uEditDecorat;
          }
          if (parent != null) {
             view = parent.findViewById(this);
          }else {
             view = uEditDecorat;
          }
       }
       if (view instanceof EditDecorationContainerViewV2) {
          uEditDecorat = view;
       }
       if (uEditDecorat != null) {
          uEditDecorat.M0(f5, f6, f3, f4);
          uEditDecorat.S0(f8);
       }
       return;
    }
    public void b(FlexScreenStatusData p0,Size p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorPreviewContainerLayoutV2.class, "17")) {
          return;
       }
       a.p(p0, "flexScreenStatusData");
       this.setMFlexScreenStatusData(p0);
       this.g(this.d, true, p1);
       return;
    }
    public void c(e p0,Size p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorPreviewContainerLayoutV2.class, "13")) {
          return;
       }
       this.g(this.d, true, p1);
       return;
    }
    public void d(boolean p0,boolean p1){
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditorPreviewContainerLayoutV2.class, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       a.g(this.getMFlexScreenStatusData(), this.j, this.i, layoutParams);
       this.setLayoutParams(this.getLayoutParams());
       return;
    }
    public final void f(float p0,float p1,float p2,float p3,AnimatorListenerAdapter p4,long p5){
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4,Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayoutV2.class, "16")) {
             return;
          }
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       if (p4 != null) {
          uAnimatorSet.addListener(p4);
       }
       float[] uofloatArray = new float[]{this.getScaleX(),p0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, "ScaleX", uofloatArray).setDuration(p5);
       a.o(objectAnimat, "ObjectAnimator.ofFloat\(t¡­uration\(animatorDuration\)");
       float[] uofloatArray1 = new float[]{this.getScaleY(),p1};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this, "ScaleY", uofloatArray1).setDuration(p5);
       a.o(objectAnimat1, "ObjectAnimator.ofFloat\(t¡­uration\(animatorDuration\)");
       uofloatArray1 = new float[]{this.getTranslationX(),p2};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this, "TranslationX", uofloatArray1).setDuration(p5);
       a.o(objectAnimat2, "ObjectAnimator.ofFloat\(t¡­uration\(animatorDuration\)");
       uofloatArray1 = new float[]{this.getTranslationY(),p3};
       ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(this, "TranslationY", uofloatArray1).setDuration(p5);
       a.o(objectAnimat3, "ObjectAnimator.ofFloat\(t¡­uration\(animatorDuration\)");
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,objectAnimat3};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       Object[] objArray1 = new Object[0];
       a.D().w("EditorPreviewContainer", "doTransformAnimation", objArray1);
       return;
    }
    public final void g(c p0,boolean p1,Size p2){
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, EditorPreviewContainerLayoutV2.class, "4")) {
          return;
       }
       a.p(p0, "editorPreviewContainerLayoutData");
       if (p1) {
          this.i.set(a.a(this.getMFlexScreenStatusData(), p2));
       }
       this.h(p0, p1);
       return;
    }
    public RectF getCustomTransformRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayoutV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.l);
    }
    public RectF getLimitRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayoutV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.i);
    }
    public final f getMEditorPreviewChangeListeners(){
       return this.e;
    }
    public final c getMEditorPreviewContainerLayoutData(){
       return this.d;
    }
    public FlexScreenStatusData getMFlexScreenStatusData(){
       return this.m;
    }
    public final int getMScreenHeight(){
       return this.g;
    }
    public final int getMScreenWidth(){
       return this.f;
    }
    public RectF getOriginLayoutRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayoutV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.j);
    }
    public final void h(c p0,boolean p1){
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditorPreviewContainerLayoutV2.class, "6")) {
          return;
       }
       if (p1) {
          RectF rectF = new RectF(this.i);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(rectF, p0, c.class, "2")) {
             a.p(rectF, "<set-?>");
             p0.b = rectF;
          }
          this.j = new RectF(this.i);
       }else {
          this.j = new RectF(p0.b());
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(EditorPreviewContainerLayoutV2.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayoutV2.class, "5")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public final void setMEditorPreviewChangeListeners(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayoutV2.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setMEditorPreviewContainerLayoutData(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayoutV2.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public void setMFlexScreenStatusData(FlexScreenStatusData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayoutV2.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.m = p0;
       return;
    }
    public final void setMScreenHeight(int p0){
       this.g = p0;
    }
    public final void setMScreenWidth(int p0){
       this.f = p0;
    }
    public void setOriginLayoutRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayoutV2.class, "14")) {
          return;
       }
       a.p(p0, "originLayoutRect");
       this.d.b().set(p0);
       this.h(this.d, false);
       this.g(this.d, false, null);
       return;
    }
}
