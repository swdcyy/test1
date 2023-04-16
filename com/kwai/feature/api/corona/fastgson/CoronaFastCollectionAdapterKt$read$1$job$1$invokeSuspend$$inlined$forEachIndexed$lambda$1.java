package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.google.gson.JsonElement;
import asd.c;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1;
import ftd.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

public final class CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 extends SuspendLambda implements p	// class@000de5
{
    public final int $index;
    public final JsonElement $item;
    public final k0 $this_launch$inlined;
    public Object L$0;
    public int label;
    public k0 p$;
    public final CoronaFastCollectionAdapterKt$read$1$job$1 this$0;

    public void CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1(JsonElement p0,int p1,c p2,CoronaFastCollectionAdapterKt$read$1$job$1 p3,k0 p4){
       this.$item = p0;
       this.$index = p1;
       this.this$0 = p3;
       this.$this_launch$inlined = p4;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 oread$1$job$ = new CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1(this.$item, this.$index, p1, this.this$0, this.$this_launch$inlined);
       obj.p$ = p0;
       PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "1");
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (a.i(z0.e(), new CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1(this, null), this) == obj) {
             PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "1");
             return obj;
          }
       }
       PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1.class, "1");
       return l1.a;
    }
}
