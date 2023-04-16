package com.kwai.middleware.azeroth.net.AzerothResponseAdapter;
import com.google.gson.b;
import zk.i;
import com.kwai.middleware.azeroth.net.AzerothResponseAdapter$a;
import nsd.u;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.String;
import java.lang.reflect.Type;
import com.google.gson.a;
import tb7.d;
import v97.b;
import xa7.c;
import java.lang.reflect.ParameterizedType;
import kotlin.TypeCastException;
import com.kwai.middleware.azeroth.net.response.AzerothApiError;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import zk.h;
import kotlin.NotImplementedError;

public final class AzerothResponseAdapter implements b, i	// class@000f0a
{
    public final int a;
    public static final AzerothResponseAdapter$a b;

    static {
       AzerothResponseAdapter.b = new AzerothResponseAdapter$a(null);
    }
    public void AzerothResponseAdapter(int p0){
       super();
       this.a = p0;
    }
    public final JsonElement a(JsonObject p0){
       return p0.e0("data");
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       AzerothResponseAdapter uAzerothResp = this;
       a uoa = p2;
       if (p0 == null || !p0.E()) {
          throw new IllegalArgumentException("The response is invalid");
       }
       JsonObject jsonObject = p0;
       int i = 0;
       int i1 = 2;
       String str = null;
       int i2 = d.f(jsonObject, "result", i, i1, str);
       String str1 = d.h(jsonObject, "error_msg", str, i1, str);
       if (str1 == null) {
          str1 = "";
       }
       String str2 = str1;
       b uob = new b();
       uob.resultCode = i2;
       uob.message = str2;
       if (uob.a()) {
          AzerothResponseAdapter a = uAzerothResp.a;
          if (a != 1) {
             if (a != i1) {
                if (jsonObject.s0("data")) {
                   jsonObject = uAzerothResp.a(jsonObject);
                }
             }else {
                jsonObject = uAzerothResp.a(jsonObject);
             }
          }
          if (jsonObject != null) {
             if (p1 != null) {
                object oobject = p1.getActualTypeArguments()[i];
                if (oobject == String.class) {
                   str = jsonObject.toString();
                }else if(uoa){
                   str = uoa.c(jsonObject, oobject);
                }
                uob.data = str;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
             }
          }
          return uob;
       }else {
          AzerothApiError uAzerothApiE = new AzerothApiError("API", 0, null, i2, str2, null, null, 102, null);
          throw uoa;
       }
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       throw new NotImplementedError("The azeroth response haven\'t support serialize to json");
    }
}
