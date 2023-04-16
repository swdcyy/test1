package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomAreaMountDelegate;
import i08.a;
import pq5.c;
import java.lang.Object;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.RightBottomAreaMountDelegate$tempPendantDelegates$2;
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
import rq5.a;
import gw3.u;
import i08.a$a;
import java.lang.StringBuilder;
import js6.a;
import fg6.a;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import com.google.gson.Gson;

public final class RightBottomAreaMountDelegate implements a	// class@0016ac
{
    public final p a;
    public c b;

    public void RightBottomAreaMountDelegate(c p0){
       super();
       this.b = p0;
       this.a = s.c(RightBottomAreaMountDelegate$tempPendantDelegates$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       View view;
       Object obj = this;
       u obj1 = p0;
       Object obj2 = p1;
       PendantUtil$Companion obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, RightBottomAreaMountDelegate.class, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3.booleanValue();
       }
       int i = System.identityHashCode(p0);
       obj3 = PendantUtil.a;
       String str = obj3.d(obj1, p1.getMaterialId(), true);
       if (this.d().containsKey(Integer.valueOf(i))) {
          f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, null, 24, null);
          return false;
       }else {
          view = obj3.i(obj1, obj2);
          obj3.g(view, obj2);
          obj1 = PatchProxy.applyThreeRefs(str, view, p1, this, RightBottomAreaMountDelegate.class, "5");
          if (obj1 != PatchProxyResult.class) {
          }else {
             obj1 = new u(obj, obj2, view, str);
          }
          obj.b.eo(obj1);
          this.d().put(Integer.valueOf(i), obj1);
          return true;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, RightBottomAreaMountDelegate.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       a uoa = this.d().remove(Integer.valueOf(System.identityHashCode(p0)));
       if (uoa == null) {
          return false;
       }
       this.b.g9(uoa);
       return true;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       long this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RightBottomAreaMountDelegate.class, "4")) {
          return;
       }
       try{
          a$a.a(this, p0, p1, p2);
          String str1 = (p0 == null || p0.isEmpty())? 1: null;
          if (str1) {
             return;
          }else {
             p0 = p0.get("makePendantTopLayer");
             if (p0 != null) {
                this.b.Jn(p0.booleanValue());
             }
             this.b.C2(0x3f800000);
          }
       }catch(java.lang.Exception e10){
          Throwable throwable = e10;
          f$a a = f.a;
          String liveId = (p2)? p2.getLiveId(): null;
          String str = liveId;
          PendantUtil$Companion a1 = PendantUtil.a;
          this = (p2)? p2.getMaterialId(): -1;
          f$a.s(a, str, a1.d(p1, this, 1), "RightBottomAreaMountDelegate mountInfoChange error", throwable, null, 16, null);
       }
       return;
    }
    public final Map d(){
       Object obj = PatchProxy.apply(null, this, RightBottomAreaMountDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void e(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(RightBottomAreaMountDelegate.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, RightBottomAreaMountDelegate.class, "7")) {
          return;
       }
       f$a.t(f.a, p0, p1, "send right bottom show state to RN,isShow:"+p2, null, false, false, 56, null);
       Pair[] pairArray = new Pair[]{r0.a("show", Boolean.valueOf(p2)),r0.a("pendantId", p1)};
       a.b.GO("KSMerchantDyRightBottomPendantShowChangeEvent", a.a.q(t0.W(pairArray)));
       return;
    }
}
