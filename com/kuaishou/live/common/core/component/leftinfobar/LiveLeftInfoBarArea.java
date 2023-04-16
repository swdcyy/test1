package com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea;
import dp3.a;
import android.widget.FrameLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea$mAlphaValueAnimator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea$mBottomMarginValueAnimator$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import dp3.e;
import android.animation.Animator;
import ec1.a;
import dp3.g;
import bq5.b;
import android.view.View;
import java.lang.Runnable;
import eo1.a;
import fo1.a;
import zr5.a;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import va1.e;
import eo1.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import eo1.c;
import android.animation.Animator$AnimatorListener;
import java.lang.Number;
import eo1.d;
import va1.b0;

public final class LiveLeftInfoBarArea extends a	// class@00144f
{
    public final p g;
    public final p h;
    public int i;
    public Runnable j;
    public int k;
    public final int l;

    public void LiveLeftInfoBarArea(FrameLayout p0,boolean p1){
       int i1;
       a.p(p0, "container");
       super(p0);
       this.g = s.c(LiveLeftInfoBarArea$mAlphaValueAnimator$2.INSTANCE);
       this.h = s.c(LiveLeftInfoBarArea$mBottomMarginValueAnimator$2.INSTANCE);
       int i = (p1)? 8: 4;
       this.l = i;
       if (!PatchProxy.applyVoid(null, this, LiveLeftInfoBarArea.class, "9")) {
          ViewGroup$MarginLayoutParams marginLayout = this.l();
          marginLayout = (marginLayout != null)? marginLayout.bottomMargin: 0;
          this.i = marginLayout;
          ViewGroup view = this.getView();
          a.o(view, "view");
          view.setVisibility(i);
          b.c0(LiveCommonLogTag.LEFT_INFO_BAR, "initOriginMarginBottom", "OriginMarginBottom", Integer.valueOf(this.i));
       }
       return;
    }
    public void J(e p0,int p1,int p2,int p3,int p4,Animator p5){
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, LiveLeftInfoBarArea.class, "8")) {
             return;
          }
       }
       if (p0 instanceof a && (!PatchProxy.isSupport(LiveLeftInfoBarArea.class) || !PatchProxy.applyVoidTwoRefs(p5, Integer.valueOf(p2), this, LiveLeftInfoBarArea.class, "13"))) {
          p2 = p2 + this.i;
          b.c0(LiveCommonLogTag.LEFT_INFO_BAR, "onBubbleHeightChange", "endBottomMargin", Integer.valueOf(p2));
          this.n(p5, p2);
       }
       return;
    }
    public void K(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLeftInfoBarArea.class, "4")) {
          return;
       }
       if (p0 instanceof a && p1 instanceof b) {
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, LiveLeftInfoBarArea.class, "11")) {
             View view = p1.getView();
             if (view != null) {
                a.o(view, "widget.view ?: return");
                view.removeCallbacks(this.j);
                a uoa = new a(this, p1, view, p2);
                this.j = uoa;
                view.post(uoa);
             }
          }
       }else if(p0 instanceof a){
          this.m(p2, 0);
       }
       return;
    }
    public void L(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLeftInfoBarArea.class, "5")) {
          return;
       }
       if (p0 instanceof a && p1 instanceof b) {
          if (!PatchProxy.applyVoidOneRefs(p2, this, LiveLeftInfoBarArea.class, "12")) {
             LiveLeftInfoBarArea ti = this.i;
             b.c0(LiveCommonLogTag.LEFT_INFO_BAR, "onBubbleRemove", "endBottomMargin", Integer.valueOf(ti));
             this.n(p2, ti);
          }
       }else if(p0 instanceof a){
          this.m(p2, 0x3f800000);
       }
       return;
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftInfoBarArea.class, "6")) {
       }else {
          super.a(p0);
          this.k = this.k + 1;
          if (this.i()) {
             ViewGroup view = this.getView();
             a.o(view, "view");
             view.setVisibility(0);
          }
       }
       return;
    }
    public void b(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftInfoBarArea.class, "7")) {
       }else {
          super.b(p0);
          this.k = this.k - 1;
          if (!this.i()) {
             ViewGroup view = this.getView();
             a.o(view, "view");
             view.setVisibility(this.l);
          }
       }
       return;
    }
    public void g(int p0){
       LiveLeftInfoBarArea tl;
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLeftInfoBarArea.class, "21")) {
          return;
       }
       ViewGroup view = this.getView();
       a.o(view, "view");
       p0 = (p0 == 1 && this.i())? 0: this.l;
       view.setVisibility(p0);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveLeftInfoBarArea.class, "3")) {
          return;
       }
       this.p(this.i);
       ViewGroup view = this.getView();
       a.o(view, "view");
       view.setAlpha(0x3f800000);
       view = this.getView();
       a.o(view, "view");
       view.setVisibility(0);
       return;
    }
    public final boolean i(){
       boolean b = (this.k > null)? true: false;
       return b;
    }
    public final ValueAnimator j(){
       Object obj = PatchProxy.apply(null, this, LiveLeftInfoBarArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final ValueAnimator k(){
       Object obj = PatchProxy.apply(null, this, LiveLeftInfoBarArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final ViewGroup$MarginLayoutParams l(){
       Object[] objArray = null;
       ViewGroup obj = PatchProxy.apply(objArray, this, LiveLeftInfoBarArea.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getView();
       a.o(obj, "view");
       ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          objArray = layoutParams;
       }
       return objArray;
    }
    public final void m(Animator p0,float p1){
       ViewGroup view;
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, LiveLeftInfoBarArea.class, "18")) {
          return;
       }
       String str = "view";
       if (p0 != null) {
          if (!PatchProxy.isSupport(LiveLeftInfoBarArea.class) || !PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, LiveLeftInfoBarArea.class, "19")) {
             e.a.b(this.j(), p0);
             view = this.getView();
             a.o(view, str);
             float alpha = view.getAlpha();
             float f = p1 - alpha;
             b.d0(LiveCommonLogTag.LEFT_INFO_BAR, "startAreaAlphaAnimator", "startAlpha", Float.valueOf(alpha), "endAlpha", Float.valueOf(p1));
             this.j().addUpdateListener(new b(this, alpha, f));
             this.j().addListener(new c(this, f, p1));
             this.j().start();
          }
       }else {
          view = this.getView();
          a.o(view, str);
          view.setAlpha(p1);
          this.o(p1);
       }
       return;
    }
    public final void n(Animator p0,int p1){
       int i;
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveLeftInfoBarArea.class, "14")) {
          return;
       }
       if (p0 != null) {
          if (!PatchProxy.isSupport(LiveLeftInfoBarArea.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveLeftInfoBarArea.class, "15")) {
             e.a.b(this.k(), p0);
             p0 = PatchProxy.apply(null, this, LiveLeftInfoBarArea.class, "16");
             if (p0 != PatchProxyResult.class) {
                i = p0.intValue();
             }else {
                ViewGroup$MarginLayoutParams marginLayout = this.l();
                marginLayout = (marginLayout != null)? marginLayout.bottomMargin: 0;
             }
             p1 = p1 - i;
             b.c0(LiveCommonLogTag.LEFT_INFO_BAR, "startAreaBottomMarginAnimator", "marginDiff", Integer.valueOf(p1));
             this.k().addUpdateListener(new d(this, i, p1));
             this.k().start();
          }
       }else {
          this.p(p1);
       }
       return;
    }
    public final void o(float p0){
       ViewGroup view;
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveLeftInfoBarArea.class, "20")) {
          return;
       }
       if (!b0.a()) {
          int i = 0;
          if (p0 - (float)i > 0 && this.i()) {
             view = this.getView();
             a.o(view, "view");
             view.setVisibility(i);
          label_0043 :
             return;
          }
       }
       view = this.getView();
       a.o(view, "view");
       view.setVisibility(this.l);
       goto label_0043 ;
    }
    public final void p(int p0){
       if (PatchProxy.isSupport(LiveLeftInfoBarArea.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLeftInfoBarArea.class, "17")) {
          return;
       }
       ViewGroup$MarginLayoutParams marginLayout = this.l();
       if (marginLayout != null) {
          marginLayout.bottomMargin = p0;
          ViewGroup view = this.getView();
          a.o(view, "view");
          view.setLayoutParams(marginLayout);
          this.getView().requestLayout();
          b.d0(LiveCommonLogTag.LEFT_INFO_BAR, "updateAreaMarginBottom", "marginBottom", Integer.valueOf(p0), "view", this.getView());
       }
       return;
    }
}
