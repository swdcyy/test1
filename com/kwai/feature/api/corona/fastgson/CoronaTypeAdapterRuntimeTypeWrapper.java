package com.kwai.feature.api.corona.fastgson.CoronaTypeAdapterRuntimeTypeWrapper;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.b;
import java.lang.reflect.TypeVariable;
import el.a;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt;

public final class CoronaTypeAdapterRuntimeTypeWrapper extends TypeAdapter	// class@000de9
{
    public final Gson a;
    public final TypeAdapter b;
    public final Type c;

    public void CoronaTypeAdapterRuntimeTypeWrapper(Gson p0,TypeAdapter p1,Type p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Object read(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaTypeAdapterRuntimeTypeWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.read(p0);
    }
    public void write(b p0,Object p1){
       CoronaTypeAdapterRuntimeTypeWrapper uCoronaTypeA = CoronaTypeAdapterRuntimeTypeWrapper.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCoronaTypeA, "2")) {
          return;
       }
       CoronaTypeAdapterRuntimeTypeWrapper tb = this.b;
       CoronaTypeAdapterRuntimeTypeWrapper tc = this.c;
       uCoronaTypeA = PatchProxy.applyTwoRefs(tc, p1, this, uCoronaTypeA, "3");
       if (uCoronaTypeA != PatchProxyResult.class) {
       }else if(p1 != null && (tc != Object.class && (tc instanceof TypeVariable || tc instanceof Class))){
          tc = p1.getClass();
       }
       uCoronaTypeA = tc;
       if (uCoronaTypeA != this.c) {
          tb = this.a.j(a.get(uCoronaTypeA));
          if (tb instanceof CoronaFastCollectionAdapterKt) {
             uCoronaTypeA = this.b;
             if (!uCoronaTypeA instanceof CoronaFastCollectionAdapterKt) {
                tb = uCoronaTypeA;
             }
          }
       }
       tb.write(p0, p1);
       return;
    }
}
