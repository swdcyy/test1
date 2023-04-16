package com.yxcorp.gifshow.longinus.LonginusDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.longinus.LonginusInfo;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;

public final class LonginusDeserializer implements b	// class@001b66
{

    public void LonginusDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       LonginusInfo longinusInfo = PatchProxy.applyThreeRefs(p0, p1, p2, this, LonginusDeserializer.class, "1");
       if (longinusInfo != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          a.p(p2, "context");
          p0 = p0.r().e0("self");
          Gson gson = null;
          JsonObject jsonObject = (p0 != null)? p0.r(): gson;
          if (jsonObject != null) {
             longinusInfo = new Gson().d(jsonObject, p1);
          }else {
             longinusInfo = gson;
          }
       }
       return longinusInfo;
    }
}
