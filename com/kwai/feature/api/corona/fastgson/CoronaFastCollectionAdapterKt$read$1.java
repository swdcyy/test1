package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt;
import com.google.gson.stream.a;
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
import ftd.z1;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.google.gson.JsonElement;
import java.util.Collection;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapter;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonArray;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1$job$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;

public final class CoronaFastCollectionAdapterKt$read$1 extends SuspendLambda implements p	// class@000de7
{
    public final a $reader;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;
    public final CoronaFastCollectionAdapterKt this$0;

    public void CoronaFastCollectionAdapterKt$read$1(CoronaFastCollectionAdapterKt p0,a p1,c p2){
       this.this$0 = p0;
       this.$reader = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       CoronaFastCollectionAdapterKt$read$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaFastCollectionAdapterKt$read$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new CoronaFastCollectionAdapterKt$read$1(this.this$0, this.$reader, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaFastCollectionAdapterKt$read$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CoronaFastCollectionAdapterKt$read$1 obj = PatchProxy.applyOneRefs(p0, this, CoronaFastCollectionAdapterKt$read$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       CoronaFastCollectionAdapterKt$read$1 tlabel = this.label;
       CoronaFastCollectionAdapterKt$read$1 oread$1 = 1;
       if (tlabel != null) {
          if (tlabel == oread$1) {
             obj = this.L$3;
             tlabel = this.L$1;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          Collection uCollection = this.this$0.b.a();
          Object obj1 = TypeAdapters.X.read(this.$reader);
          if (obj1 instanceof JsonArray) {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             Object[] objArray = new Object[obj1.size()];
             objectRef.element = objArray;
             z1 oz1 = a.f(p0, null, null, new CoronaFastCollectionAdapterKt$read$1$job$1(this, obj1, objectRef, null), 3, null);
             this.L$0 = p0;
             this.L$1 = uCollection;
             this.L$2 = obj1;
             this.L$3 = objectRef;
             this.L$4 = oz1;
             this.label = oread$1;
             if (oz1.p(this) == obj) {
                return obj;
             }else {
                Ref$ObjectRef objectRef1 = objectRef;
             }
          }else {
          }
       }
       p0 = obj.element;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             tlabel.add(oobject);
          }
          i = i + 1;
       }
       return tlabel;
    }
}
