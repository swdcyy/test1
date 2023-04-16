package com.yxcorp.experiment.d;
import java.lang.String;
import java.lang.Object;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import org.json.JSONObject;
import com.yxcorp.experiment.c;
import wu8.a;
import java.util.HashMap;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.experiment.ABConfig;
import java.lang.Class;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.yxcorp.experiment.exception.ParseABConfigException;
import java.lang.Throwable;
import xu8.a;
import java.lang.Boolean;
import wu8.l;
import java.lang.Runnable;
import yb7.p;
import com.yxcorp.experiment.d$a;
import bv8.a;
import wu8.q;
import yb7.c;

public class d	// class@0011e3
{
    public String a;

    public void d(String p0){
       super();
       this.a = p0;
    }
    public void a(String p0,ApiRequestTiming p1){
       Integer[] integerArray;
       int i3;
       if (p0 != null && !p0.isEmpty()) {
          JSONObject jSONObject = new JSONObject(p0);
          int i = 0;
          ApiRequestTiming uApiRequestT = (jSONObject.has("data2") && c.h().f())? 1: null;
          int i1 = (uApiRequestT && p1 == ApiRequestTiming.COLD_START)? 1: 0;
          HashMap hashMap = new HashMap();
          if (uApiRequestT) {
             int i2 = 2;
             if (p1 == ApiRequestTiming.COLD_START && c.h().m == null) {
                integerArray = new Integer[]{Integer.valueOf(i2)};
                hashMap = a.b(jSONObject, Arrays.asList(integerArray), i);
             }else {
                integerArray = new Integer[]{Integer.valueOf(i),Integer.valueOf(1),Integer.valueOf(i2),Integer.valueOf(i3)};
                i3 = 3;
                hashMap = a.b(jSONObject, Arrays.asList(integerArray), i);
             }
          }else {
             String str = "data";
             if (jSONObject.has(str)) {
                jSONObject = jSONObject.getJSONObject(str);
             }
             Iterator iterator = jSONObject.keys();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                String str2 = jSONObject.getString(str1);
                try{
                   ABConfig uABConfig = a.a.h(str2, ABConfig.class);
                   if (uABConfig.getValueJsonElement() != null) {
                      uABConfig.setKey(str1);
                      uABConfig.setValueRawString(str2);
                      hashMap.put(str1, uABConfig);
                   }
                }catch(java.lang.Exception e6){
                   a.a(new ParseABConfigException(str1, str2, e6));
                   goto label_008b ;
                }
             }
          }
          if (!hashMap.isEmpty()) {
             c.h().n(this.a, hashMap, Boolean.valueOf((i1 ^ 0x01)));
          }
          p.d(new l(p0));
       }
       return;
    }
    public void b(ApiRequestTiming p0){
       c.h().k.c().a(new d$a(this, p0), p0);
    }
}
