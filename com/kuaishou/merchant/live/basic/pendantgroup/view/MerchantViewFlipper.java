package com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper;
import android.widget.ViewFlipper;
import android.content.Context;
import z14.c;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper$b;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import android.util.AttributeSet;
import brd.v;
import java.lang.Object;
import java.util.Objects;
import brd.g;
import android.view.animation.Animation;
import z14.d;
import android.view.animation.Animation$AnimationListener;
import android.widget.ViewAnimator;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import bs3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import ks3.l0$a;
import java.lang.Integer;
import java.lang.Math;
import java.util.ArrayList;
import brd.t;
import z14.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import java.lang.Iterable;
import z14.b;
import erd.a;
import com.kuaishou.merchant.live.basic.pendantgroup.view.a;
import com.kuaishou.merchant.live.basic.pendantgroup.view.b;
import erd.g;
import crd.b;
import android.os.Handler;
import tb7.b;
import java.lang.Runnable;
import lnc.b9;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import android.view.MotionEvent;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper$a;

public class MerchantViewFlipper extends ViewFlipper	// class@0018b0
{
    public MerchantViewFlipper$b b;
    public GestureDetector c;
    public MerchantViewFlipper$a d;
    public Runnable e;
    public float f;
    public boolean g;
    public int h;
    public b i;
    public l0$a j;
    public static final int k;

    public void MerchantViewFlipper(Context p0){
       super(p0);
       this.e = new c(this);
       this.f = 0;
       this.g = false;
       this.b = new MerchantViewFlipper$b(p0, this);
       this.c = new GestureDetector(p0, this.b);
    }
    public void MerchantViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new c(this);
       this.f = 0;
       this.g = false;
       this.b = new MerchantViewFlipper$b(p0, this);
       this.c = new GestureDetector(p0, this.b);
    }
    public static void a(MerchantViewFlipper p0,boolean p1,v p2){
       Objects.requireNonNull(p0);
       if (p2.isDisposed()) {
          p2.onComplete();
       }else {
          Animation outAnimation = p0.getOutAnimation();
          if (outAnimation != null) {
             outAnimation.setAnimationListener(new d(p0, p2));
             if (p1) {
                super.showNext();
             }else {
                super.showPrevious();
             }
          }
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantViewFlipper.class, "7")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          ViewParent obj = PatchProxy.applyOneRefs(uob, this, MerchantViewFlipper.class, "9");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             int i = 0;
             while (i < this.getChildCount()) {
                if (uob.d == this.getChildAt(i)) {
                   b = true;
                   break ;
                }
                i = i + 1;
             }
          }
          if (!b) {
             obj = uob.d.getParent();
             if (obj instanceof ViewGroup) {
                obj.removeView(uob.d);
             }
             this.addView(uob.d);
          }
       }
       return;
    }
    public void c(int p0,boolean p1,l0$a p2){
       ArrayList uArrayList;
       boolean b;
       t ot;
       if (PatchProxy.isSupport(MerchantViewFlipper.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, MerchantViewFlipper.class, "18")) {
          return;
       }
       this.j = p2;
       this.g = p1;
       this.h = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "19")) {
          this.stopFlipping();
          if (this.h >= this.getChildCount()) {
             this.h = 0;
          }else if(this.h < null){
             this.h = this.getChildCount() - 1;
          }
          if (this.g != null) {
             if (!PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "20")) {
                p0 = this.h - this.getDisplayedChild();
                if (p0 < 0) {
                   this.g();
                }else {
                   this.f();
                }
                int i = Math.abs(p0);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.isSupport(MerchantViewFlipper.class)) {
                   uArrayList = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), this, MerchantViewFlipper.class, "21");
                   if (uArrayList != patchProxyRe) {
                   }
                }
                uArrayList = new ArrayList();
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   b = (p0 > 0)? true: false;
                   if (PatchProxy.isSupport(MerchantViewFlipper.class)) {
                      ot = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, MerchantViewFlipper.class, "22");
                      if (ot != patchProxyRe) {
                      label_00bd :
                         uArrayList.add(ot.observeOn(d.a));
                      }
                   }
                   ot = t.create(new a(this, b));
                   goto label_00bd ;
                }
                this.i = t.concat(uArrayList).doOnComplete(new b(this)).subscribe(a.b, b.b);
             }
          }else if(PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "23")){
             this.setInAnimation(objArray);
             this.setOutAnimation(objArray);
             this.setDisplayedChild(this.h);
             MerchantViewFlipper tj = this.j;
             if (tj != null) {
                tj.a();
             }
          }
          this.startFlipping();
       }
       return;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantViewFlipper.class, "8")) {
          return;
       }
       this.removeView(p0.d);
       if (this.getChildCount() <= 1) {
          this.stopFlipping();
       }
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "3")) {
          return;
       }
       this.f = 0;
       this.getParent().requestDisallowInterceptTouchEvent(false);
       if (!PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "5")) {
          b.d().removeCallbacks(this.e);
          b.d().postDelayed(this.e, 500);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "17")) {
          return;
       }
       this.setInAnimation(this.getContext(), R.anim.arg_RES_7f01009b);
       this.setOutAnimation(this.getContext(), R.anim.arg_RES_7f01009c);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "16")) {
          return;
       }
       this.setInAnimation(this.getContext(), R.anim.arg_RES_7f01009e);
       this.setOutAnimation(this.getContext(), R.anim.arg_RES_7f01009d);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "15")) {
          return;
       }
       try{
          super.onDetachedFromWindow();
          b9.a(this.i);
       }catch(java.lang.IllegalArgumentException e0){
          this.stopFlipping();
          a.l(MerchantCommonLogBiz.PRELOADER, "MerchantViewFlipper", "com.kuaishou.merchant.live.basic.pendantgroup.view", e0);
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantViewFlipper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action != 3) {
                label_003d :
                   return super.onInterceptTouchEvent(p0);
                }
             }else if(Math.abs((p0.getX() - this.f)) - 0x42480000 >= 0){
                return b;
             }else {
                return super.onInterceptTouchEvent(p0);
             }
          }
          this.e();
          goto label_003d ;
       }else {
          this.f = p0.getX();
          if (!PatchProxy.applyVoidOneRefs(p0, this, MerchantViewFlipper.class, "2")) {
             this.getParent().requestDisallowInterceptTouchEvent(b);
             this.onTouchEvent(p0);
          }
          return super.onInterceptTouchEvent(p0);
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantViewFlipper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.onTouchEvent(p0);
       int action = p0.getAction();
       if (action) {
          if (action == 1 || action == 3) {
             this.e();
          }
       }else if(PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "4")){
          b.d().removeCallbacks(this.e);
          this.stopFlipping();
       }
       return this.c.onTouchEvent(p0);
    }
    public void setCurrentViewCallback(MerchantViewFlipper$a p0){
       this.d = p0;
    }
    public void showNext(){
       if (PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "13")) {
          return;
       }
       super.showNext();
       MerchantViewFlipper td = this.d;
       if (td != null) {
          td.a(this.getDisplayedChild());
       }
       return;
    }
    public void showPrevious(){
       if (PatchProxy.applyVoid(null, this, MerchantViewFlipper.class, "14")) {
          return;
       }
       super.showPrevious();
       MerchantViewFlipper td = this.d;
       if (td != null) {
          td.a(this.getDisplayedChild());
       }
       return;
    }
    public void startFlipping(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantViewFlipper.class, "10")) {
          return;
       }
       this.setInAnimation(objArray);
       this.setOutAnimation(objArray);
       if (this.getChildCount() > 1) {
          super.startFlipping();
          this.f();
       }
       return;
    }
}
