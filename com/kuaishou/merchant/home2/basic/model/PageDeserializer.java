package com.kuaishou.merchant.home2.basic.model.PageDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bx3.c;
import com.google.gson.JsonObject;
import fg6.a;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import bx3.a;
import java.lang.Integer;
import java.util.HashMap;

public class PageDeserializer implements b	// class@0008f2
{

    public void PageDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       HomePage homePage = PatchProxy.applyThreeRefs(p0, p1, p2, this, PageDeserializer.class, "2");
       if (homePage != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = p0.r();
          HomePage homePage1 = a.a.c(p0, HomePage.class);
          if (!PatchProxy.applyVoidTwoRefs(jsonObject, homePage1, this, PageDeserializer.class, "3")) {
             HomePage mComponentCo = homePage1.mComponentConfigs;
             if (mComponentCo != null) {
                Iterator iterator = mComponentCo.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa == null || (uoa.b() != null && uoa.b().intValue() == 2)) {
                      String str = uoa.a();
                      if (jsonObject.e0(str) != null) {
                         homePage1.mComponentDataMap.put(str, jsonObject.e0(str).toString());
                      }
                   }
                }
             }
          }
          homePage = homePage1;
       }
       return homePage;
    }
}
