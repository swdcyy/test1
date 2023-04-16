package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.Ref$ObjectRef;
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
import java.lang.Iterable;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import dsd.a;
import java.lang.Number;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.IllegalStateException;

public final class CoronaFastCollectionAdapterKt$read$1$job$1 extends SuspendLambda implements p	// class@000de6
{
    public final JsonElement $items;
    public final Ref$ObjectRef $result;
    public int label;
    public k0 p$;
    public final CoronaFastCollectionAdapterKt$read$1 this$0;

    public void CoronaFastCollectionAdapterKt$read$1$job$1(CoronaFastCollectionAdapterKt$read$1 p0,JsonElement p1,Ref$ObjectRef p2,c p3){
       this.this$0 = p0;
       this.$items = p1;
       this.$result = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       CoronaFastCollectionAdapterKt$read$1$job$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new CoronaFastCollectionAdapterKt$read$1$job$1(this.this$0, this.$items, this.$result, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, CoronaFastCollectionAdapterKt$read$1$job$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.p$;
       int i = 0;
       obj = this.$items.iterator();
       while (obj.hasNext()) {
          Object obj1 = obj.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 oread$1$job$ = new CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1(obj1, a.f(i).intValue(), null, this, p0);
          a.f(p0, 0, 0, v10, 3, null);
          i = i1;
       }
       return l1.a;
    }
}
