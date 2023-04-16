package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.TypeAdapter;
import bl.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.stream.a;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt$read$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;

public final class CoronaFastCollectionAdapterKt extends CoronaFastCollectionAdapter	// class@000de8
{

    public void CoronaFastCollectionAdapterKt(Gson p0,Type p1,TypeAdapter p2,p p3){
       a.p(p0, "context");
       a.p(p1, "elementType");
       a.p(p2, "elementTypeAdapter");
       a.p(p3, "constructor");
       super(p0, p1, p2, p3);
    }
    public Collection a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaFastCollectionAdapterKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reader");
       if (p0.J() != JsonToken.NULL) {
          return a.h(null, new CoronaFastCollectionAdapterKt$read$1(this, p0, null), 1, null);
       }
       p0.A();
       return null;
    }
    public Object read(a p0){
       return this.a(p0);
    }
}
