package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import java.util.Map;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import er3.c;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1 extends SuspendLambda implements p	// class@00106d
{
    public final Map $resMap;
    public int label;
    public final LiveMaterialResourceInfoRepo this$0;

    public void LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1(LiveMaterialResourceInfoRepo p0,Map p1,c p2){
       this.this$0 = p0;
       this.$resMap = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1(this.this$0, this.$resMap, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceInfoRepo$writeCacheResInfoMapToDisk$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       this.this$0.f.c(this.$resMap);
       return l1.a;
    }
}