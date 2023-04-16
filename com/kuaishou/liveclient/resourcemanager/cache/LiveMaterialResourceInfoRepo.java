package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import ftd.k0;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$NetworkInfoFetchState;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$f;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import er3.c;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$d;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$b;
import csd.b;
import dsd.e;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicyManager$a;
import java.util.Objects;
import java.lang.Number;
import com.kuaishou.liveclient.resourcemanager.preload.policy.PreloadPolicy;
import java.lang.System;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$e;
import java.util.List;
import java.util.Enumeration;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Collections;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$getResInfoASyncById$1;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import ar3.b;
import brd.t;
import ar3.b$a;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$g;
import erd.o;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$h;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$i;
import erd.g;
import crd.b;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$c;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;
import java.util.Collection;
import java.util.LinkedHashMap;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.Boolean;

public final class LiveMaterialResourceInfoRepo implements k0	// class@00106e
{
    public ConcurrentHashMap b;
    public CopyOnWriteArrayList c;
    public LiveMaterialResourceInfoRepo$NetworkInfoFetchState d;
    public CopyOnWriteArrayList e;
    public c f;
    public long g;
    public static final p h;
    public static final LiveMaterialResourceInfoRepo$a i;

    static {
       LiveMaterialResourceInfoRepo.i = new LiveMaterialResourceInfoRepo$a(null);
       LiveMaterialResourceInfoRepo.h = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveMaterialResourceInfoRepo$Companion$instance$2.INSTANCE);
    }
    public void LiveMaterialResourceInfoRepo(){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new CopyOnWriteArrayList();
       this.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Init;
       this.e = new CopyOnWriteArrayList();
       this.f = c.b("live_material_resource_info", new LiveMaterialResourceInfoRepo$f().getType());
    }
    public void LiveMaterialResourceInfoRepo(u p0){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new CopyOnWriteArrayList();
       this.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Init;
       this.e = new CopyOnWriteArrayList();
       this.f = c.b("live_material_resource_info", new LiveMaterialResourceInfoRepo$f().getType());
    }
    public synchronized final Object a(c p0){
       h oh;
       PreloadPolicyManager obj1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PreloadPolicyManager obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceInfoRepo.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.d == LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Fetching) {
          oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p0));
          this.e(new LiveMaterialResourceInfoRepo$d(oh));
          obj1 = oh.b();
          if (obj1 == b.h()) {
             e.c(p0);
          }
          return obj1;
       }else {
          obj = PreloadPolicyManager.c.a();
          Objects.requireNonNull(obj);
          Object obj2 = PatchProxy.apply(null, obj, PreloadPolicyManager.class, "2");
          if (obj2 != patchProxyRe) {
             l = obj2.longValue();
          }else {
             obj1 = obj.a;
             l = (obj1 != null)? obj1.getPreloadFreqCtrTimeInterval(): 300;
             l = (l * (long)60) * (long)1000;
          }
          if ((System.currentTimeMillis() - this.g) - l <= 0) {
             return this.b;
          }else {
             oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p0));
             this.g();
             this.e(new LiveMaterialResourceInfoRepo$e(oh));
             obj1 = oh.b();
             if (obj1 == b.h()) {
                e.c(p0);
             }
             return obj1;
          }
       }
    }
    public final List b(){
       Enumeration obj = PatchProxy.apply(null, this, LiveMaterialResourceInfoRepo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.keys();
       a.o(obj, "resInfoMemoCacheMap.keys\(\)");
       ArrayList uArrayList = Collections.list(obj);
       a.o(uArrayList, "java.util.Collections.list\(this\)");
       return uArrayList;
    }
    public final Object c(String p0,c p1){
       LiveMaterialResourceInfoRepo$getResInfoASyncById$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof LiveMaterialResourceInfoRepo$getResInfoASyncById$1) {
          obj = p1;
          LiveMaterialResourceInfoRepo$getResInfoASyncById$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             LiveMaterialResourceInfoRepo$getResInfoASyncById$1 result = obj.result;
             Object obj1 = b.h();
             LiveMaterialResourceInfoRepo$getResInfoASyncById$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == 1) {
                   LiveMaterialResourceInfoRepo$getResInfoASyncById$1 l$0 = obj.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                MaterialDetailInfoItem materialDeta1 = this.b.get(p0);
                if (materialDeta1 != null) {
                   return materialDeta1;
                }else {
                   obj.L$0 = p0;
                   obj.label = 1;
                   result = this.a(obj);
                   if (result == obj1) {
                      return obj1;
                   }
                }
             }
             MaterialDetailInfoItem materialDeta = (result != null)? result.get(l$0): null;
             return materialDeta;
          }
       }
       obj = new LiveMaterialResourceInfoRepo$getResInfoASyncById$1(this, p1);
       goto label_0025 ;
    }
    public final MaterialDetailInfoItem d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceInfoRepo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resourceId");
       return this.b.get(p0);
    }
    public final void e(LiveMaterialResourceInfoRepo$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceInfoRepo.class, "3")) {
          return;
       }
       this.e.add(p0);
       this.f();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceInfoRepo.class, "4")) {
          return;
       }
       if (this.d == LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Complete || this.d == LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Failed) {
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.b);
          }
          this.e.clear();
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceInfoRepo.class, "8")) {
          return;
       }
       this.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Fetching;
       b.a.a("LIVE_PRELOAD_RESOURCE_FILE").flatMap(LiveMaterialResourceInfoRepo$g.b).subscribe(new LiveMaterialResourceInfoRepo$h(this), new LiveMaterialResourceInfoRepo$i(this));
       return;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceInfoRepo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceInfoRepo$c(CoroutineExceptionHandler.u0));
    }
    public final void h(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceInfoRepo.class, "15")) {
          return;
       }
       this.c.clear();
       this.c.addAll(p0);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.c.addAll(p0);
          List briefInfoLis = iterator.next().getBriefInfoList();
          if (briefInfoLis != null) {
             Iterator iterator1 = briefInfoLis.iterator();
             while (iterator1.hasNext()) {
                MaterialDetailInfoItem materialDeta = iterator1.next();
                String materialId = materialDeta.getMaterialId();
                if (materialId != null) {
                   linkedHashMa.put(materialId, materialDeta);
                }else {
                   continue ;
                }
             }
          }
       }
       this.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Complete;
       this.i(linkedHashMa, true);
       if (!PatchProxy.applyVoidOneRefs(linkedHashMa, this, LiveMaterialResourceInfoRepo.class, "14")) {
          a.f(this, null, null, new LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1(this, linkedHashMa, null), 3, null);
       }
       return;
    }
    public synchronized final void i(Map p0,boolean p1){
       LiveMaterialResourceInfoRepo liveMaterial = LiveMaterialResourceInfoRepo.class;
       if (PatchProxy.isSupport(liveMaterial) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveMaterial, "16")) {
          return;
       }
       a.p(p0, "resInfoMap");
       if (this.b.isEmpty() || p1) {
          this.b.clear();
          this.b.putAll(p0);
       }
       return;
    }
}
