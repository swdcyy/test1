package com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout$a;
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
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Point;
import com.yxcorp.utility.n;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutTopLimitType;
import com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutBottomLimitType;
import android.animation.AnimatorListenerAdapter;
import java.lang.Boolean;
import java.lang.Long;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout$b;
import t36.f$a;
import java.lang.Float;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import faa.a;
import q87.c;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import toc.b;
import java.lang.Enum;
import java.lang.StringBuilder;
import xv9.b;

public final class EditorPreviewContainerLayout extends BaseEditorPreviewContainerLayout	// class@000d53
{
    public c d;
    public f e;
    public final Matrix f;
    public final RectF g;
    public int h;
    public int i;
    public final Matrix j;
    public final RectF k;
    public final Matrix l;
    public final RectF m;
    public final Matrix n;
    public final RectF o;
    public final Map p;
    public final Map q;
    public FlexScreenStatusData r;
    public HashMap s;
    public static final EditorPreviewContainerLayout$a t;

    static {
       EditorPreviewContainerLayout.t = new EditorPreviewContainerLayout$a(null);
    }
    public void EditorPreviewContainerLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void EditorPreviewContainerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void EditorPreviewContainerLayout(Context p0,AttributeSet p1,int p2){
       c uoc = this;
       TypedArray obj = p0;
       Object obj1 = p1;
       a.p(obj, "context");
       super(p0, p1, p2);
       c uoc1 = new c(null, null, null, 7, null);
       uoc.d = v3;
       uoc.e = new f();
       uoc.f = new Matrix();
       RectF rectF = new RectF();
       uoc.g = rectF;
       uoc.j = new Matrix();
       uoc.k = new RectF();
       uoc.l = new Matrix();
       uoc.m = new RectF();
       uoc.n = new Matrix();
       uoc.o = new RectF();
       uoc.p = new LinkedHashMap();
       uoc.q = new LinkedHashMap();
       FlexScreenStatusData uFlexScreenS = new FlexScreenStatusData(false, false, false, false, false, 0, 0, 0, 0, 0, 0, 2047, null);
       uoc.r = uoc1;
       if (PatchProxy.applyVoidOneRefs(obj, uoc, EditorPreviewContainerLayout.class, "7")) {
       }else {
          Point point = n.s(p0);
          rectF.set(0, 0, (float)point.x, (float)point.y);
          uoc.h = point.x;
          uoc.i = point.y;
       }
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uoc, EditorPreviewContainerLayout.class, "4")) {
          obj = obj.obtainStyledAttributes(obj1, c$b.u0);
          a.o(obj, "context.obtainStyledAttr¡­orPreviewContainerLayout\)");
          int integer = obj.getInteger(13, 0);
          int integer1 = obj.getInteger(1, 0);
          uoc.d.a().k(FlexLayoutTopLimitType.values()[integer]);
          uoc.d.a().d(FlexLayoutBottomLimitType.values()[integer1]);
          uoc.d.a().i(FlexLayoutTopLimitType.values()[obj.getInteger(11, integer)]);
          uoc.d.a().h(FlexLayoutBottomLimitType.values()[obj.getInteger(9, integer1)]);
          uoc.d.a().j(obj.getDimensionPixelSize(12, 0));
          uoc.d.a().d = obj.getDimensionPixelSize(10, 0);
          uoc.d.a().f(obj.getDimensionPixelSize(3, 0));
          uoc.d.a().c(obj.getDimensionPixelSize(0, 0));
          uoc.d.a().g(obj.getDimensionPixelSize(8, 0));
          uoc.d.a().e(obj.getDimensionPixelSize(2, 0));
          uoc.d.b().set((float)obj.getDimensionPixelSize(5, 0), (float)obj.getDimensionPixelSize(7, 0), (float)obj.getDimensionPixelSize(6, 0), (float)obj.getDimensionPixelSize(4, 0));
          integer = obj.getDimensionPixelSize(15, 0);
          integer1 = obj.getDimensionPixelSize(17, 0);
          int dimensionPix = obj.getDimensionPixelSize(16, 0);
          uoc.d.c().set((float)integer, (float)integer1, (float)dimensionPix, (float)obj.getDimensionPixelSize(14, 0));
       }
       uoc.g(uoc.d);
       return;
    }
    public void EditorPreviewContainerLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       float f5;
       float f6;
       float f7;
       int this;
       EditorPreviewContainerLayout uEditorPrevi = this;
       object oobject = p0;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(EditorPreviewContainerLayout.class)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayout.class, "23")) {
             return;
          }
       }
       a.p(oobject, "customTransRect");
       uEditorPrevi.d.c().set(oobject);
       RectF rectF = new RectF(oobject);
       float f = (float)i1;
       if (rectF.width() - f <= 0 || rectF.height() - f <= 0) {
          EditorPreviewContainerLayout m = uEditorPrevi.m;
          rectF.set(m.left, m.top, m.width(), uEditorPrevi.m.height());
       }
       this.setPivotY(0);
       this.setPivotX((uEditorPrevi.m.width() / (float)i));
       float f1 = rectF.width() / uEditorPrevi.m.width();
       float f2 = rectF.height() / uEditorPrevi.m.height();
       float f3 = rectF.centerX() - uEditorPrevi.m.centerX();
       float f4 = rectF.top - uEditorPrevi.m.top;
       uEditorPrevi.n.reset();
       uEditorPrevi.n.postScale(f1, f2, uEditorPrevi.m.centerX(), uEditorPrevi.m.top);
       uEditorPrevi.n.postTranslate(f3, f4);
       uEditorPrevi.n.mapRect(uEditorPrevi.o, uEditorPrevi.m);
       if (!p3) {
          f5 = rectF.centerY() - uEditorPrevi.m.centerY();
          f6 = rectF.centerX() - uEditorPrevi.m.centerX();
          f = 0x3f800000;
          f7 = 0x3f800000;
       }else {
          f7 = f1;
          f = f2;
          f6 = f3;
          f5 = f4;
       }
       if (p1) {
          if (p3) {
             this.f(f7, f, f6, f5, p2, p4);
          }else {
             this.f(this.getScaleX(), this.getScaleY(), f6, f5, p2, p4);
             this.getLayoutParams().width = (int)p0.width();
             this.getLayoutParams().height = (int)p0.height();
          }
       }else if(p3){
          this.setScaleX(f7);
          this.setScaleY(f);
       }else {
          this.getLayoutParams().width = (int)p0.width();
          this.getLayoutParams().height = (int)p0.height();
       }
       this.setTranslationX(f6);
       this.setTranslationY(f5);
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
          uEditDecorat.M0(f3, f4, f1, f2);
          uEditDecorat.S0(f7);
       }
       return;
    }
    public void b(FlexScreenStatusData p0,Size p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorPreviewContainerLayout.class, "25")) {
          return;
       }
       a.p(p0, "flexScreenStatusData");
       this.setMFlexScreenStatusData(p0);
       this.g(this.d);
       return;
    }
    public void c(e p0,Size p1){
       Object obj = this;
       e obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, EditorPreviewContainerLayout.class, "21")) {
          return;
       }
       if (obj1 != null) {
          EditorPreviewContainerLayout d = obj.d;
          e a = obj1.a;
          e b = obj1.b;
          e c = obj1.c;
          e d1 = obj1.d;
          e e = obj1.e;
          e f = obj1.f;
          e g = obj1.g;
          e h = obj1.h;
          e i = obj1.i;
          e j = obj1.j;
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             Object[] objArray = new Object[10];
             objArray[0] = a;
             objArray[1] = b;
             objArray[2] = Integer.valueOf(c);
             objArray[3] = Integer.valueOf(d1);
             objArray[4] = Integer.valueOf(e);
             objArray[5] = f;
             objArray[6] = g;
             objArray[7] = Integer.valueOf(h);
             objArray[8] = Integer.valueOf(i);
             objArray[9] = Integer.valueOf(j);
             obj1 = PatchProxy.apply(objArray, obj1, uoe, "5");
             if (obj1 != PatchProxyResult.class) {
             label_0096 :
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoidOneRefs(obj1, d, c.class, "1")) {
                   a.p(obj1, "<set-?>");
                   d.a = obj1;
                }
                obj.g(obj.d);
             }
          }
          a.p(a, "topLimitType");
          a.p(b, "subTopLimitType");
          a.p(f, "bottomLimitType");
          a.p(g, "subBottomLimitType");
          uoe = new e(a, b, c, d1, e, f, g, h, i, j);
          goto label_0096 ;
       }
       return;
    }
    public void d(boolean p0,boolean p1){
       EditorPreviewContainerLayout tm;
       if (PatchProxy.isSupport(EditorPreviewContainerLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, EditorPreviewContainerLayout.class, "15")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       int i = 0;
       float f = (float)i;
       if (this.m.width() - f <= 0 || this.m.height() - f <= 0) {
          layoutParams.width = (int)this.k.width();
          layoutParams.height = (int)this.k.height();
       }else {
          layoutParams.width = (int)this.m.width();
          layoutParams.height = (int)this.m.height();
       }
       if (p0) {
          Context context = this.getContext();
          Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
          if (layoutParams.height > n.j(context)) {
             tm = this.m;
             RectF top = tm.top;
             int i1 = (int)top;
             layoutParams.setMargins((int)tm.left, i1, i, (int)top);
          label_008f :
             this.setLayoutParams(this.getLayoutParams());
             if (p1) {
                this.e.s0(new EditorPreviewContainerLayout$b(this, layoutParams, p0, p1));
             }
             return;
          }
       }
       tm = this.m;
       layoutParams.setMargins((int)tm.left, (int)tm.top, i, i);
       goto label_008f ;
    }
    public final void f(float p0,float p1,float p2,float p3,AnimatorListenerAdapter p4,long p5){
       if (PatchProxy.isSupport(EditorPreviewContainerLayout.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),p4,Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayout.class, "24")) {
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
    public final void g(c p0){
       boolean i2;
       int i4;
       Object[] obj2;
       int hasSafeArea;
       int bottomBarHei;
       Integer integer;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, EditorPreviewContainerLayout.class, "5")) {
          return;
       }
       a.p(obj1, "editorPreviewContainerLayoutData");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, EditorPreviewContainerLayout.class, "8")) {
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, EditorPreviewContainerLayout.class, "9")) {
             obj.p.put(p0.a().a, Integer.valueOf(p0.a().b()));
             obj.p.put(p0.a().b, Integer.valueOf(p0.a().a()));
             obj.p.put(FlexLayoutTopLimitType.FROM_DEFAULT_POSITION, Integer.valueOf(p0.a().e));
             obj.q.put(p0.a().f, Integer.valueOf(p0.a().b()));
             obj.q.put(p0.a().g, Integer.valueOf(p0.a().a()));
             obj.q.put(FlexLayoutBottomLimitType.FROM_DEFAULT_POSITION, Integer.valueOf(p0.a().j));
          }
          EditorPreviewContainerLayout p = obj.p;
          Map$Entry uEntry = PatchProxy.applyOneRefs(p, obj, EditorPreviewContainerLayout.class, "10");
          String str = 4;
          Object[] objArray = 3;
          int i = 0;
          if (uEntry != patchProxyRe) {
          }else {
             Iterator iterator1 = p.entrySet().iterator();
             uEntry = null;
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                FlexLayoutTopLimitType key1 = uEntry.getKey();
                int i5 = uEntry.getValue().intValue();
                if (PatchProxy.isSupport(EditorPreviewContainerLayout.class)) {
                   obj2 = PatchProxy.applyTwoRefs(key1, Integer.valueOf(i5), obj, EditorPreviewContainerLayout.class, "12");
                   if (obj2 != patchProxyRe) {
                      uEntry = obj2;
                   }else {
                   label_0102 :
                      i2 = this.getMFlexScreenStatusData().getHasHole();
                      hasSafeArea = this.getMFlexScreenStatusData().getHoleHeight();
                      bottomBarHei = this.getMFlexScreenStatusData().getStatusBarHeight();
                      i4 = b.a[key1.ordinal()];
                      if (i4 != 1) {
                         if (i4 != 2) {
                            if (i4 != objArray) {
                               if (i4 != str) {
                                  uEntry = Integer.valueOf(i5);
                               }else {
                                  i5 = i5 + bottomBarHei;
                                  uEntry = Integer.valueOf(i5);
                               }
                            }else if(i2){
                               i5 = i5 + hasSafeArea;
                               uEntry = Integer.valueOf(i5);
                            }
                         }else {
                            uEntry = Integer.valueOf(i5);
                         }
                      }else if(i2){
                         uEntry = Integer.valueOf(i5);
                      }
                      uEntry = null;
                   }
                }else {
                   goto label_0102 ;
                }
                if (uEntry != null) {
                   Object[] objArray2 = new Object[i];
                   a.D().w("EditorPreviewContainer", "current topLimitType = "+key1, objArray2);
                   break ;
                }
                obj2 = new Object[i];
                a.D().w("EditorPreviewContainer", "topLimitType = "+key1+" is not match", obj2);
             }
          }
          int i1 = (uEntry != null)? uEntry.intValue(): 0;
          EditorPreviewContainerLayout q = obj.q;
          Map$Entry uEntry1 = PatchProxy.applyOneRefs(q, obj, EditorPreviewContainerLayout.class, "11");
          if (uEntry1 != patchProxyRe) {
          }else {
             Iterator iterator = q.entrySet().iterator();
             uEntry1 = null;
             while (iterator.hasNext()) {
                uEntry1 = iterator.next();
                FlexLayoutBottomLimitType key = uEntry1.getKey();
                i4 = uEntry1.getValue().intValue();
                if (PatchProxy.isSupport(EditorPreviewContainerLayout.class)) {
                   obj2 = PatchProxy.applyTwoRefs(key, Integer.valueOf(i4), obj, EditorPreviewContainerLayout.class, "13");
                   if (obj2 != patchProxyRe) {
                      uEntry1 = obj2;
                   }else {
                   label_01e0 :
                      i2 = this.getMFlexScreenStatusData().getHasBottomBar();
                      hasSafeArea = this.getMFlexScreenStatusData().getHasSafeArea();
                      bottomBarHei = this.getMFlexScreenStatusData().getBottomBarHeight();
                      i = b.b[key.ordinal()];
                      if (i != 1) {
                         if (i != 2) {
                            if (i != objArray) {
                               if (i != str) {
                                  integer = Integer.valueOf(i4);
                               }else if(hasSafeArea){
                                  integer = Integer.valueOf(i4);
                               }else {
                               label_022d :
                                  uEntry1 = null;
                               }
                            }else if(i2){
                               integer = Integer.valueOf(i4);
                            }else {
                               goto label_022d ;
                            }
                         }else if(hasSafeArea){
                            i4 = i4 + 0;
                            integer = Integer.valueOf(i4);
                         }else {
                            goto label_022d ;
                         }
                      }else if(i2){
                         i4 = i4 + bottomBarHei;
                         integer = Integer.valueOf(i4);
                      }else {
                         goto label_022d ;
                      }
                      uEntry1 = integer;
                   }
                }else {
                   goto label_01e0 ;
                }
                if (uEntry1 != null) {
                   objArray = new Object[0];
                   a.D().w("EditorPreviewContainer", "current bottomLimitType = "+key, objArray);
                   break ;
                }
                Object[] objArray1 = new Object[0];
                a.D().w("EditorPreviewContainer", "bottomLimitType = "+key+" is not adapt", objArray1);
                i = 0;
             }
          }
          i2 = 0;
          i = (uEntry1 != null)? uEntry1.intValue(): 0;
          EditorPreviewContainerLayout i3 = obj.i;
          obj.j.reset();
          obj.j.postScale(0x3f800000, ((float)((i3 - i1) - i) / (float)i3));
          obj.j.postTranslate(0, (float)i1);
          obj.j.mapRect(obj.k, obj.g);
       }
       this.h(p0);
       return;
    }
    public RectF getCustomTransformRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayout.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.o);
    }
    public RectF getLimitRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayout.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.k);
    }
    public final f getMEditorPreviewChangeListeners(){
       return this.e;
    }
    public final c getMEditorPreviewContainerLayoutData(){
       return this.d;
    }
    public FlexScreenStatusData getMFlexScreenStatusData(){
       return this.r;
    }
    public RectF getOriginLayoutRect(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewContainerLayout.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RectF(this.m);
    }
    public final void h(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayout.class, "14")) {
          return;
       }
       RectF rectF = p0.b();
       float f = (float)0;
       if (rectF.width() - f <= 0 || rectF.height() - f <= 0) {
          rectF.set(0, 0, this.k.width(), this.k.height());
       }
       this.l.reset();
       this.l.postScale((rectF.width() / this.k.width()), (rectF.height() / this.k.height()));
       this.l.postTranslate(rectF.left, rectF.top);
       this.l.mapRect(this.m, this.k);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(EditorPreviewContainerLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditorPreviewContainerLayout.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public final void setMEditorPreviewChangeListeners(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayout.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void setMEditorPreviewContainerLayoutData(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayout.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public void setMFlexScreenStatusData(FlexScreenStatusData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayout.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.r = p0;
       return;
    }
    public void setOriginLayoutRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorPreviewContainerLayout.class, "22")) {
          return;
       }
       a.p(p0, "originLayoutRect");
       this.d.b().set(p0);
       this.h(this.d);
       this.g(this.d);
       return;
    }
}
