package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1;
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
import com.google.gson.internal.bind.a;
import com.google.gson.JsonElement;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapter;
import com.google.gson.stream.a;
import com.google.gson.TypeAdapter;
import java.lang.IllegalStateException;

public final class CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1 extends SuspendLambda implements p	// class@000de4
{
    public int label;
    public k0 p$;
    public final CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 this$0;

    public void CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1(this.this$0, p1);
       obj.p$ = p0;
       PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label == null) {
          j0.n(p0);
          obj = this.this$0;
          CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1 this$0 = obj.this$0;
          this$0.$result.element[obj.$index] = this$0.this$0.this$0.a.read(new a(this.this$0.$item));
          PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "1");
          return l1.a;
       }else {
          PatchProxy.onMethodExit(CoronaFastCollectionAdapterKt$read$1$job$1$invokeSuspend$$inlined$forEachIndexed$lambda$1$1.class, "1");
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
    }
}
