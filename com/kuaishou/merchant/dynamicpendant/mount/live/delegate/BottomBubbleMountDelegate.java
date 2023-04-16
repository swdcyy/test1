package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate;
import i08.a;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$a;
import nsd.u;
import b14.b;
import lp3.i;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$tempPendantItems$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.System;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import java.util.Map;
import java.lang.Integer;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import f14.g;
import fw3.a;
import android.content.Context;
import gw3.d;
import bq5.h;
import lp3.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$b;
import f14.g$c;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.BottomBubbleMountDelegate$c;
import f14.g$b;
import f08.b;
import java.lang.StringBuilder;
import f08.b$a;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.animation.Animator;
import ot3.u0;
import js6.a;
import fg6.a;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import com.google.gson.Gson;
import com.yxcorp.gifshow.util.rx.RxBus;
import e08.b;
import d08.a;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;

public final class BottomBubbleMountDelegate implements a	// class@0016a3
{
    public final p a;
    public final b b;
    public final i c;
    public static final BottomBubbleMountDelegate$a d;

    static {
       BottomBubbleMountDelegate.d = new BottomBubbleMountDelegate$a(null);
    }
    public void BottomBubbleMountDelegate(b p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(BottomBubbleMountDelegate$tempPendantItems$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       View view;
       d uod;
       String this;
       boolean b1;
       Object obj = this;
       a obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantUtil$Companion obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, BottomBubbleMountDelegate.class, "2");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       int i = System.identityHashCode(p0);
       String liveId = p1.getLiveId();
       obj3 = PendantUtil.a;
       String str = obj3.d(obj1, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, liveId, str, "mount error: this bubble view has mounted", null, null, 24, null);
          return false;
       }else if(p1.getCheckAllowShowBubble() && !obj.b.c(p1.getBubbleScene())){
          f$a.s(f.a, liveId, str, "this bubble view not allowed to mount", null, null, 24, null);
          return false;
       }else {
          view = obj3.i(obj1, obj2);
          obj3.g(view, obj2);
          obj1 = PatchProxy.applyThreeRefs(str, view, p1, this, BottomBubbleMountDelegate.class, "7");
          if (obj1 != patchProxyRe) {
          }else if(p1.isAnchorYellowCar()){
             obj1 = new a(view.getContext(), view, obj2, str);
          }else {
             d uod1 = new d(this, view, p1, str, view.getContext());
             patchProxyRe.z(p1.getPriority());
             patchProxyRe.A(p1.getShowMills());
             patchProxyRe.x(p1.getMinShowMills());
             uod = patchProxyRe;
          label_00bd :
             if (uod != null) {
                g b = uod.b;
                if (b != null) {
                   b.setTag(R.id.dynamic_pendant_config_animatorSwitch, Boolean.valueOf(p1.getAnimationSwitch()));
                }
             }
             BottomBubbleMountDelegate c = obj.c;
             BottomBubbleMountDelegate obj4 = null;
             h oh = (c != null)? c.c(h.class): obj4;
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = obj4;
             BottomBubbleMountDelegate$b uob = patchProxyRe;
             obj4 = this;
             String str1 = liveId;
             this = str;
             BottomBubbleMountDelegate$b uob1 = patchProxyRe;
             h oh1 = oh;
             uob = new BottomBubbleMountDelegate$b(obj4, str1, this, uod, p1, oh1, objectRef);
             uod.b(uob1);
             BottomBubbleMountDelegate$c uoc = new BottomBubbleMountDelegate$c(obj4, str1, this, p1, objectRef, oh1, uod);
             uod.y(uob1);
             if (obj.b.b(p1.getBubbleScene(), uod)) {
                this.d().put(Integer.valueOf(i), uod);
                b1 = true;
             }else {
                obj.f(obj2, str);
                b1 = false;
             }
             return b1;
          }
          uod = obj1;
          goto label_00bd ;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       boolean b;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, BottomBubbleMountDelegate.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       g og = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (og != null) {
          og.d();
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       b$a this;
       String liveId;
       String str1;
       boolean b;
       f$a a3;
       String str3;
       Map map3;
       float f;
       long l1;
       Map map5;
       Map map = p0;
       View view = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BottomBubbleMountDelegate.class, "6")) {
          return;
       }
       Map map1 = null;
       try{
          this = b.a;
          StringBuilder str = "mountInfoChange:";
          if (map) {
             str1 = p0.toString();
          label_002c :
             b$a.e(this, str+str1, map1, 2, map1);
             if (!map || p0.isEmpty()) {
                return;
             }else {
                PendantUtil$Companion g a2 = PendantUtil.a;
                long materialId1 = (p2 != null)? p2.getMaterialId(): -1;
                b = false;
                String str2 = a2.d(view, materialId1, b);
                a2 = this.d().get(Integer.valueOf(System.identityHashCode(p1)));
                if (a2 == null) {
                   a3 = f.a;
                   str3 = (p2 != null)? p2.getLiveId(): map1;
                   f$a.t(a3, str3, str2, "mountInfoChange can not find bubble", null, false, false, 56, null);
                   return;
                }else {
                   Map map2 = map.get("width");
                   if (!map2 instanceof Number) {
                      map2 = map1;
                   }
                   map3 = map.get("height");
                   if (!map3 instanceof Number) {
                      map3 = map1;
                   }
                   Map map4 = map.get("marginTop");
                   if (!map4 instanceof Number) {
                      map4 = map1;
                   }
                   map = map.get("showMills");
                   if (!map instanceof Number) {
                      map = map1;
                   }
                   long l = (map != null)? map.longValue(): -1;
                   if (map2 != null || map3 != null) {
                      View view1 = a2.f();
                      int measuredWidt = (view1 != null)? view1.getMeasuredWidth(): -1;
                      View view2 = a2.f();
                      int i = (view2 != null)? view2.getMeasuredHeight(): -1;
                      int i1 = (map2 != null)? map2.intValue(): 0;
                      f = (float)i1;
                      int i2 = (map3 != null)? map3.intValue(): 0;
                      float f1 = (float)i2;
                      int i3 = (map4 != null)? map4.intValue(): 0;
                      float f2 = (float)i3;
                      float f3 = (float)b;
                      int i4 = ((v18 = f2 - f3) > 0)? n.c(p1.getContext(), f2): 0;
                      i1 = ((v20 = f - f3) > 0)? n.c(p1.getContext(), f): 0;
                      i2 = ((v21 = f1 - f3) > 0)? n.c(p1.getContext(), f1): 0;
                      if (i1 <= 0) {
                         i1 = measuredWidt;
                      }
                      if (i2 <= 0) {
                         i2 = i;
                      }
                      a3 = f.a;
                      str3 = (p2 != null)? p2.getLiveId(): map1;
                      int i5 = i;
                      l1 = l;
                      f$a.t(a3, str3, str2, a2.e()+" Bubble mountInfoChange:oriSize:"+measuredWidt+' '+i+" newSize:"+i1+' '+i2+" showMills:"+l, null, 0, 0, 56, 0);
                      g b1 = a2.b;
                      if (b1 instanceof ViewGroup && b1.getChildCount() > 0) {
                         ViewGroup$LayoutParams layoutParams = b1.getChildAt(b).getLayoutParams();
                         ViewGroup$LayoutParams layoutParams1 = b1.getLayoutParams();
                         if (v20 > 0) {
                            if (layoutParams != null) {
                               layoutParams.width = i1;
                            }
                            if (layoutParams1 != null) {
                               layoutParams1.width = i1;
                            }
                            b1.setTag(R.id.dynamic_pendant_config_width, Integer.valueOf(i1));
                         }
                         if (v21 > 0) {
                            if (layoutParams) {
                               layoutParams.height = i2;
                            }
                            if (layoutParams1) {
                               layoutParams1.height = i2;
                            }
                            b1.setTag(R.id.dynamic_pendant_config_height, Integer.valueOf(i2));
                         }
                         if (v18 > 0) {
                            b1.setTag(R.id.dynamic_pendant_config_marginTop, Integer.valueOf(i4));
                         }
                         b1.requestLayout();
                         if (!BottomBubbleMountDelegate.d.c(a2)) {
                            a2.t(i1, (i2 + i4), measuredWidt, i5, null);
                         }
                      }
                   }else {
                      l1 = l;
                   }
                label_01f0 :
                   long l2 = l1;
                   if (l2 > 0) {
                      a2.A(l2);
                      a2.B(u0.b());
                   }
                }
             }
          }else {
             map3 = map1;
             goto label_002c ;
          }
       }catch(java.lang.Exception e0){
          Throwable throwable = e0;
          f$a a = f.a;
          if (p2) {
             liveId = p2.getLiveId();
          }
          str1 = liveId;
          PendantUtil$Companion a1 = PendantUtil.a;
          long materialId = (p2)? p2.getMaterialId(): -1;
          f$a.s(a, str1, a1.d(view, materialId, true), "BottomBubbleMountDelegate mountInfoChange error", throwable, null, 16, null);
       }
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, BottomBubbleMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void e(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(BottomBubbleMountDelegate.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, BottomBubbleMountDelegate.class, "8")) {
          return;
       }
       f$a.t(f.a, p0, p1, "sendBubbleShowOrHideAnimateEventToRN:isShow:"+p2, null, false, false, 56, null);
       Pair[] pairArray = new Pair[]{r0.a("show", Boolean.valueOf(p2)),r0.a("pendantId", p1)};
       a.b.GO("KSMerchantDyBubbleAnimationChangeEvent", a.a.q(t0.W(pairArray)));
       return;
    }
    public final void f(PendantMountInfo p0,String p1){
       RxBus f;
       Object obj = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, BottomBubbleMountDelegate.class, "4")) {
          return;
       }
       f$a.t(f.a, p0.getLiveId(), p1, "bubble dismiss event post", null, false, false, 56, null);
       f = RxBus.f;
       a[] uoaArray = new a[1];
       int i = 0;
       long materialId = p0.getMaterialId();
       String str = (obj != null)? obj: "";
       a uoa = new a(3, materialId, str, null, null, null, null, null, null, null, 0, 2016, null);
       uoaArray[i] = v4;
       f.b(new b(CollectionsKt__CollectionsKt.r(uoaArray), p0.getLiveId()));
       return;
    }
}
