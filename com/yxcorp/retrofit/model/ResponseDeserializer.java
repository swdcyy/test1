package com.yxcorp.retrofit.model.ResponseDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import njd.a;
import com.google.gson.JsonObject;
import java.lang.reflect.ParameterizedType;
import java.lang.String;
import ekd.k0;
import com.yxcorp.retrofit.model.Region;

public class ResponseDeserializer implements b	// class@0013e3
{
    public static boolean a = true;

    public void ResponseDeserializer(){
       super();
    }
    public a a(JsonElement p0,Type p1,a p2){
       a uoa;
       String str3;
       ResponseDeserializer responseDese;
       Region region;
       JsonElement jsonElement = p0;
       JsonObject jsonObject = jsonElement;
       int i = 0;
       object oobject = p1.getActualTypeArguments()[i];
       int i1 = k0.f(jsonObject, "result", i);
       String str = null;
       String str1 = k0.h(jsonObject, "error_msg", str);
       String str2 = k0.h(jsonObject, "error_url", str);
       long l = 0;
       long l1 = k0.g(jsonObject, "policyExpireMs", l);
       long l2 = k0.g(jsonObject, "nextRequestSleepMs", l);
       JsonElement jsonElement1 = k0.e(jsonObject, "costInfo");
       if (jsonElement1 != null) {
          uoa = p2;
          str3 = jsonElement1.toString();
          responseDese = this;
       }else {
          responseDese = this;
          uoa = p2;
          str3 = str;
       }
       Object obj = responseDese.b(uoa, jsonElement, oobject);
       JsonElement jsonElement2 = jsonObject.e0("region");
       if (jsonElement2 != null && jsonElement2.E()) {
          JsonObject jsonObject1 = jsonElement2.r();
          String str4 = "";
          region = new Region(k0.h(jsonObject1, "uid", str4), k0.h(jsonObject1, "name", str4), k0.h(jsonObject1, "ticket", str4));
       }else {
          region = 0;
       }
       long l3 = k0.g(jsonObject, "notRetryTimeMs", 0);
       long l4 = k0.g(jsonObject, "serverTimestamp", 0);
       int i2 = k0.f(jsonObject, "kcv", 0);
       int i3 = k0.f(jsonObject, "keyconfig_pull_strategy", 2);
       JsonElement jsonElement3 = (ResponseDeserializer.a)? p0: null;
       a uoa1 = new a(obj, i1, str1, str3, str2, l1, l2, region, l3, l4, i2, i3, jsonElement3);
       return jsonObject;
    }
    public Object b(a p0,JsonElement p1,Type p2){
       String str = (p2 == String.class)? p1.toString(): p0.c(p1, p2);
       return str;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.a(p0, p1, p2);
    }
}
