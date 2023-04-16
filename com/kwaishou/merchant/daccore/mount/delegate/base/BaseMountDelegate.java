package com.kwaishou.merchant.daccore.mount.delegate.base.BaseMountDelegate;
import i08.a;
import java.lang.Object;
import com.kwaishou.merchant.daccore.mount.delegate.base.BaseMountDelegate$tempPendantDelegates$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.System;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import java.lang.String;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import f08.f;
import kotlin.Pair;
import java.lang.Long;
import qrd.r0;
import java.util.Map;
import trd.t0;
import f08.f$a;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwaishou.merchant.daccore.mount.delegate.base.BaseMountDelegate$a;
import i08.a$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import e08.b;
import d08.a;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import nsd.u;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;

public class BaseMountDelegate implements a	// class@001329
{
    public final p a;

    public void BaseMountDelegate(){
       super();
       this.a = s.c(BaseMountDelegate$tempPendantDelegates$2.INSTANCE);
    }
    public boolean a(View p0,PendantMountInfo p1){
       int i1;
       Pair[] pairArray;
       View view = p0;
       PendantMountInfo pendantMount = p1;
       boolean b = true;
       try{
          int i = System.identityHashCode(p0);
          PendantUtil$Companion a = PendantUtil.a;
          String str = a.d(view, p1.getMaterialId(), b);
          if (this.e().containsKey(Integer.valueOf(i))) {
             pairArray = new Pair[b];
             pairArray[0] = r0.a("materialId", Long.valueOf(p1.getMaterialId()));
             f$a.s(f.a, p1.getLiveId(), str, "mount error: this view has mounted", null, t0.j0(pairArray), 8, null);
             return 0;
          }else {
             View view1 = a.i(view, pendantMount);
             a.g(view1, pendantMount);
             try{
                i1 = this;
                Pair pair = i1.d(str, view1, pendantMount);
                Object first = pair.getFirst();
                if (!pair.getSecond().booleanValue()) {
                   return 0;
                }
                if (first != null) {
                   this.e().put(Integer.valueOf(i), new BaseMountDelegate$a(str, first));
                }
                return b;
             }catch(java.lang.Exception e0){
             }
             pairArray = new Pair[b];
             pairArray[0] = r0.a("materialId", Long.valueOf(p1.getMaterialId()));
             f.a.r(p1.getLiveId(), PendantUtil.a.d(view, p1.getMaterialId(), b), "mount error", e0, t0.j0(pairArray));
             return 0;
          }
       }catch(java.lang.Exception e0){
          i1 = this;
          goto label_007f ;
       }
    }
    public boolean b(View p0,PendantMountInfo p1){
       String str = PendantUtil.a.d(p0, p1.getMaterialId(), false);
       try{
          BaseMountDelegate$a uoa = this.e().remove(Integer.valueOf(System.identityHashCode(p0)));
          uoa = (uoa != null)? uoa.b: null;
          boolean b = this.g(uoa, str, p1);
       }catch(java.lang.Exception e11){
          Pair[] pairArray = new Pair[]{r0.a("materialId", Long.valueOf(p1.getMaterialId()))};
          f.a.r(p1.getLiveId(), str, "unmount error", e11, t0.j0(pairArray));
       }
       return false;
    }
    public void c(Map p0,View p1,PendantMountInfo p2){
       a$a.a(this, p0, p1, p2);
    }
    public Pair d(String p0,View p1,PendantMountInfo p2){
       return new Pair(null, Boolean.FALSE);
    }
    public final ConcurrentHashMap e(){
       return this.a.getValue();
    }
    public final void f(PendantMountInfo p0,String p1){
       RxBus f;
       f$a.t(f.a, p0.getLiveId(), p1, "postUnmountEvent", null, false, false, 56, null);
       f = RxBus.f;
       a[] uoaArray = new a[1];
       long materialId = p0.getMaterialId();
       String str = (p1 != null)? p1: "";
       a uoa = new a(3, materialId, str, null, null, null, null, null, null, null, 0, 2016, null);
       uoaArray[0] = v19;
       f.b(new b(CollectionsKt__CollectionsKt.r(uoaArray), p0.getLiveId()));
       return;
    }
    public boolean g(Object p0,String p1,PendantMountInfo p2){
       return false;
    }
}
