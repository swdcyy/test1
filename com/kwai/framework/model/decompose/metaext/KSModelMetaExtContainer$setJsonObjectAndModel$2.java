package com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$setJsonObjectAndModel$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer$b;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.google.gson.JsonObject;
import ha6.e;
import java.lang.IllegalStateException;

public final class KSModelMetaExtContainer$setJsonObjectAndModel$2 extends SuspendLambda implements p	// class@0016a7
{
    public final KSModelMetaExtContainer$b $holder;
    public int label;
    public k0 p$;
    public final KSModelMetaExtContainer this$0;

    public void KSModelMetaExtContainer$setJsonObjectAndModel$2(KSModelMetaExtContainer p0,KSModelMetaExtContainer$b p1,c p2){
       this.this$0 = p0;
       this.$holder = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       KSModelMetaExtContainer$setJsonObjectAndModel$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtContainer$setJsonObjectAndModel$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new KSModelMetaExtContainer$setJsonObjectAndModel$2(this.this$0, this.$holder, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KSModelMetaExtContainer$setJsonObjectAndModel$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSModelMetaExtContainer$setJsonObjectAndModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       this.this$0.unsafeRunDiffInCurrentThread(this.$holder.b(), this.$holder.a(), true);
       return l1.a;
    }
}