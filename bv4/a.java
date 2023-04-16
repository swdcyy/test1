package bv4.a;
import java.lang.Object;
import com.kuaishou.bowl.event.utils.StageName;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import yz7.e;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import pv.b;
import java.lang.Enum;
import java.lang.Exception;
import java.lang.System;
import java.lang.Long;
import bv4.a$a;
import java.lang.Runnable;
import f97.d;

public class a	// class@0003d3
{

    public void a(){
       super();
    }
    public static void a(StageName p0,Map p1){
       JsonObject jsonObject;
       Object obj = p1;
       String str = "resourceType";
       String str1 = "triggerType";
       String str2 = "pageName";
       String str3 = "pageId";
       String str4 = "liveType";
       String str5 = "liveStreamId";
       String str6 = "liveId";
       String str7 = "liveContext";
       String str8 = null;
       String str9 = "token";
       String str10 = "componentName";
       if (PatchProxy.applyVoidTwoRefs(p0, obj, str8, a.class, "1")) {
          return;
       }
       try{
          HashMap hashMap = new HashMap();
          if (obj == null) {
             return;
          }else if(obj.get(str7) != null){
             str7 = e.f(obj.get(str7));
             try{
                JSONObject jSONObject = new JSONObject(str7);
                hashMap.put(str6, jSONObject.getString(str6));
                hashMap.put(str5, jSONObject.getString(str5));
                JSONObject jSONObject1 = jSONObject.getJSONObject("author");
                if (jSONObject1 != null) {
                   hashMap.put("authorName", jSONObject1.get("name"));
                }
                hashMap.put(str4, jSONObject.getString(str4));
                hashMap.put(str3, jSONObject.getString(str3));
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public static void b(StageName p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "2")) {
          return;
       }
       try{
          HashMap hashMap = new HashMap();
          hashMap.put("pageName", p1);
          hashMap.put("dyType", "PageDy");
          hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
          hashMap.put("value", Long.valueOf(System.currentTimeMillis()));
          if (p3 != null) {
             hashMap.putAll(p3);
          }
          d.b(new a$a(p0, hashMap, p2));
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
}
