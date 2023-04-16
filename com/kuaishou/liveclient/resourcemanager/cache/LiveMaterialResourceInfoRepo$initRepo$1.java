package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$initRepo$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
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
import java.util.Objects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import er3.c;
import java.lang.IllegalStateException;

public final class LiveMaterialResourceInfoRepo$initRepo$1 extends SuspendLambda implements p	// class@00106c
{
    public int label;
    public final LiveMaterialResourceInfoRepo this$0;

    public void LiveMaterialResourceInfoRepo$initRepo$1(LiveMaterialResourceInfoRepo p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo$initRepo$1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "completion");
       return new LiveMaterialResourceInfoRepo$initRepo$1(this.this$0, p1);
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo$initRepo$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceInfoRepo$initRepo$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0;
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, LiveMaterialResourceInfoRepo.class, "13");
       if (obj != patchProxyRe) {
       }else {
          p0 = p0.f.a(new ConcurrentHashMap());
          a.o(p0, "resourceInfoSpVariable.g¡­aterialDetailInfoItem>\(\)\)");
          obj = p0;
       }
       this.this$0.i(obj, false);
       return l1.a;
    }
}
