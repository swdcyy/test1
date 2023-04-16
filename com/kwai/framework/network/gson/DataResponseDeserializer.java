package com.kwai.framework.network.gson.DataResponseDeserializer;
import com.yxcorp.retrofit.model.ResponseDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import njd.a;
import ib6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import ekd.k0;

public class DataResponseDeserializer extends ResponseDeserializer	// class@000c0c
{

    public void DataResponseDeserializer(){
       super();
    }
    public a a(JsonElement p0,Type p1,a p2){
       return this.c(p0, p1, p2);
    }
    public Object b(a p0,JsonElement p1,Type p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DataResponseDeserializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1 = k0.e(p1, "data");
       JsonObject jsonObject = (p1 != null)? p1.r(): new JsonObject();
       String str = (p2 == String.class)? jsonObject.toString(): p0.c(jsonObject, p2);
       return str;
    }
    public a c(JsonElement p0,Type p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DataResponseDeserializer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(super.a(p0, p1, p2));
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.c(p0, p1, p2);
    }
}
