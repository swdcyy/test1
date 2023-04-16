package com.kwai.logger.upload.internal.ResponseGsons$ResponseDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.kwai.logger.upload.internal.ResponseGsons$a;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import java.lang.reflect.ParameterizedType;
import java.lang.String;
import zk.g;
import a97.d;
import v87.b;

public class ResponseGsons$ResponseDeserializer implements b	// class@000ec8
{

    public void ResponseGsons$ResponseDeserializer(){
       super();
    }
    public void ResponseGsons$ResponseDeserializer(ResponseGsons$a p0){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       JsonObject jsonObject = p0;
       object oobject = p1.getActualTypeArguments()[0];
       JsonElement jsonElement = jsonObject.e0("result");
       int i = (jsonElement != null && (jsonElement.F() && jsonElement.N()))? jsonElement.p(): 0;
       String str = d.b(jsonObject, "error_msg", null);
       String str1 = d.b(jsonObject, "error_url", null);
       long l = d.a(jsonObject, "policyExpireMs", 0);
       long l1 = d.a(jsonObject, "nextRequestSleepMs", 0);
       String str2 = (oobject == String.class)? p0.toString(): p2.c(jsonObject, oobject);
       b uob = new b(str2, i, str, str1, l, l1);
       return str2;
    }
}
