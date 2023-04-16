package com.kwai.middleware.leia.handler.LeiaResponseAdapter;
import com.google.gson.b;
import zk.i;
import com.kwai.middleware.leia.handler.LeiaResponseAdapter$a;
import nsd.u;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import tb7.d;
import xa7.c;
import java.lang.reflect.ParameterizedType;
import kotlin.TypeCastException;
import com.kwai.middleware.leia.response.LeiaApiError;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import zk.h;
import kotlin.NotImplementedError;

public final class LeiaResponseAdapter implements b, i	// class@000f26
{
    public final int a;
    public static final LeiaResponseAdapter$a b;

    static {
       LeiaResponseAdapter.b = new LeiaResponseAdapter$a(null);
    }
    public void LeiaResponseAdapter(int p0){
       super();
       this.a = p0;
    }
    public final JsonObject a(JsonObject p0){
       return p0.m0("data");
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
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
       c uoc = new c();
       uoc.resultCode = i2;
       uoc.message = str1;
       if (uoc.a()) {
          LeiaResponseAdapter ta = this.a;
          if (ta != 1) {
             if (ta != i1) {
                if (jsonObject.s0("data")) {
                   jsonObject = this.a(jsonObject);
                }
             }else {
                jsonObject = this.a(jsonObject);
             }
          }
          if (jsonObject != null && jsonObject.E()) {
             if (p1 != null) {
                object oobject = p1.getActualTypeArguments()[i];
                if (oobject == String.class) {
                   str = jsonObject.toString();
                }else if(p2 != null){
                   str = p2.c(jsonObject, oobject);
                }
                uoc.data = str;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
             }
          }
          return uoc;
       }else {
          LeiaApiError leiaApiError = new LeiaApiError("API", 0, 0, uoc.resultCode, uoc.message, jsonObject, null, 70, null);
          throw i;
       }
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       throw new NotImplementedError("The azeroth response haven\'t support serialize to json");
    }
}
