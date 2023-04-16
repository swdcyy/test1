package com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import bl.p;
import com.kwai.feature.api.corona.fastgson.CoronaTypeAdapterRuntimeTypeWrapper;
import com.google.gson.stream.a;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import java.util.Iterator;

public class CoronaFastCollectionAdapter extends TypeAdapter	// class@000de3
{
    public final TypeAdapter a;
    public final p b;

    public void CoronaFastCollectionAdapter(Gson p0,Type p1,TypeAdapter p2,p p3){
       super();
       this.a = new CoronaTypeAdapterRuntimeTypeWrapper(p0, p2, p1);
       this.b = p3;
    }
    public Collection a(a p0){
       Collection obj = PatchProxy.applyOneRefs(p0, this, CoronaFastCollectionAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          return null;
       }else {
          obj = this.b.a();
          p0.a();
          while (p0.l()) {
             obj.add(this.a.read(p0));
          }
          p0.g();
          return obj;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaFastCollectionAdapter.class, "2")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.c();
          p1 = p1.iterator();
          while (p1.hasNext()) {
             this.a.write(p0, p1.next());
          }
          p0.g();
       }
       return;
    }
}
