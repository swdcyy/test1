package com.kwai.framework.abtest.kmonkey.ABTestInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import d86.c;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import org.json.JSONObject;
import android.util.Base64;
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroup;
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroup$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.AbstractMessageLite;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.Response$Builder;

public class ABTestInterceptor implements Interceptor	// class@000b0d
{

    public void ABTestInterceptor(){
       super();
    }
    public final String a(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ABTestInterceptor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a();
       if (q.h(obj)) {
          return p0;
       }
       try{
          Map map = c.c(p0);
          Iterator iterator = obj.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object obj1 = obj.get(str);
             JSONObject jSONObject = map.get(str);
             if (jSONObject != null) {
                jSONObject.put("value", obj1);
                if (jSONObject.has("policy") && true == jSONObject.optInt("policy")) {
                   jSONObject.put("policy", 0);
                }
             }else {
                jSONObject = new JSONObject();
                jSONObject.put("value", obj1);
                jSONObject.put("policy", 0);
                map.put(str, jSONObject);
             }
          }
          p0 = new JSONObject(map).toString();
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public final String b(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ABTestInterceptor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a();
       if (q.h(obj)) {
          return p0;
       }
       int i = 0;
       try{
          ABTestGroupProtos$ABTestGroup uABTestGroup = ABTestGroupProtos$ABTestGroup.parseFrom(Base64.decode(p0, i));
          Map map = c.c(uABTestGroup.getAppStart());
          Map map1 = c.c(uABTestGroup.getImmediately());
          Map map2 = c.c(uABTestGroup.getLazyLoad());
          Map map3 = c.c(uABTestGroup.getLoginChange());
          Iterator iterator = obj.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             Object obj1 = obj.get(str);
             JSONObject jSONObject = map.get(str);
             if (jSONObject != null) {
                jSONObject.put("value", obj1);
             }else {
                jSONObject = map1.get(str);
                if (jSONObject != null) {
                   jSONObject.put("value", obj1);
                }else {
                   jSONObject = map2.get(str);
                   if (jSONObject != null) {
                      jSONObject.put("value", obj1);
                   }else {
                      jSONObject = map3.get(str);
                      if (jSONObject != null) {
                         jSONObject.put("value", obj1);
                         map3.remove(str);
                         map.put(str, jSONObject);
                      }else {
                         jSONObject = new JSONObject();
                         jSONObject.put("value", obj1);
                         map.put(str, jSONObject);
                      }
                   }
                }
             }
          }
          return new String(Base64.encode(ABTestGroupProtos$ABTestGroup.newBuilder(uABTestGroup).setAppStart(new JSONObject(map).toString()).setImmediately(new JSONObject(map1).toString()).setLazyLoad(new JSONObject(map2).toString()).setLoginChange(new JSONObject(map3).toString()).build().toByteArray(), i));
       }catch(java.lang.Exception e0){
          return p0;
       }
    }
    public Response intercept(Interceptor$Chain p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ABTestInterceptor uABTestInter = ABTestInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, uABTestInter, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       if (!("/rest/n/system/abtest/config").equals(obj.url().url().getPath())) {
          return p0.proceed(obj);
       }
       Response response = p0.proceed(p0.request());
       ResponseBody responseBody = response.body();
       if (responseBody != null) {
          try{
             MediaType mediaType = responseBody.contentType();
             String str = responseBody.string();
             String str1 = "data2";
             String str2 = "data";
             String obj1 = PatchProxy.applyOneRefs(str, this, uABTestInter, "2");
             if (obj1 != patchProxyRe) {
                str = obj1;
             }else if(TextUtils.isEmpty(str)){
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(str1)) {
                   obj1 = jSONObject.getString(str1);
                   if (!TextUtils.isEmpty(obj1)) {
                      str2 = this.b(obj1);
                      if (!TextUtils.isEmpty(str2) && !obj1.equals(str2)) {
                         jSONObject.put(str1, str2);
                         str = jSONObject.toString();
                      }
                   }
                }
                if (jSONObject.has(str2) && jSONObject.getJSONObject(str2).length() > 0) {
                   obj1 = jSONObject.getJSONObject(str2).toString();
                   str1 = this.a(obj1);
                   if (TextUtils.isEmpty(str1) && !obj1.equals(str1)) {
                      jSONObject.put(str2, str1);
                      str = jSONObject.toString();
                   }
                }
             }
          label_00b0 :
             response = response.newBuilder().body(ResponseBody.create(mediaType, str)).build();
          }catch(java.lang.Exception e0){
          }
       }
    }
}
