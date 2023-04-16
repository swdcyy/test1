package com.yxcorp.gateway.pay.retrofit.b;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pv8.b;
import com.google.gson.JsonObject;
import lv8.c;
import java.lang.reflect.ParameterizedType;

public class b implements b	// class@001275
{

    public void b(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       b uob = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = p0.r();
          String str = c.d(jsonObject, "code", "");
          ParameterizedType parameterize = c.d(jsonObject, "msg", "");
          object oobject = p1.getActualTypeArguments()[0];
          String str1 = (oobject == String.class)? p0.toString(): p2.c(jsonObject, oobject);
          uob = new b(str, parameterize, str1);
       }
       return uob;
    }
}
