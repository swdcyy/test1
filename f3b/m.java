package f3b.m;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import java.lang.IllegalStateException;
import k2b.z1;
import java.util.List;
import com.google.common.collect.ImmutableMap$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.c;
import java.lang.RuntimeException;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import ok.s;
import ok.s$c;
import java.lang.IllegalArgumentException;
import zk.g;
import q2b.e;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Exception;
import org.json.JSONException;

public class m	// class@002888
{

    public void m(){
       super();
    }
    public static JsonObject a(String p0,String p1,String[] p2,JsonObject p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = p2.length - 2;
       while (i < i1) {
          try{
             if (p3.e0(p2[i]) != null) {
                p3 = p3.e0(p2[i]).r();
                i = i + 1;
             }
          }catch(java.lang.IllegalStateException e9){
             z1.d("urt", p0, p1, e9.getMessage());
          }
          p3 = null;
          break ;
       }
       return p3;
    }
    public static void b(String p0,String p1,List p2,String p3,ImmutableMap$b p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       m om = m.class;
       JsonElement obj = null;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,oobject2,p4};
          if (PatchProxy.applyVoid(objArray, obj, om, "3")) {
             return;
          }
       }
       if (TextUtils.x(p3)) {
          return;
       }else {
          try{
             obj = new c().a(oobject2);
          }catch(com.google.gson.JsonSyntaxException e0){
             z1.d("urt", p0, p1, e0.getMessage());
          }
          JsonElement jsonElement = obj;
          if (jsonElement == null) {
             return;
          }else {
             Iterator iterator = p2.iterator();
             while (iterator.hasNext()) {
                String[] stringArray = (iterator.next()).split(",");
                try{
                   JsonObject jsonObject = jsonElement.r();
                   if (stringArray.length <= 4 && stringArray.length > 1) {
                      int i = stringArray.length - 2;
                      i = stringArray.length - 1;
                      m.e(p0, p1, m.a(p0, p1, stringArray, jsonObject), stringArray[i], stringArray[i], p4);
                   }
                }catch(java.lang.IllegalStateException e0){
                   z1.d("urt", p0, p1, e0.getMessage());
                }
             }
             return;
          }
       }
    }
    public static void c(String p0,String p1,List p2,String p3,ImmutableMap$b p4){
       Iterator iterator;
       String[] stringArray;
       int i;
       int i1;
       String str;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, om, "2")) {
             return;
          }
       }
       HashMap hashMap = PatchProxy.applyThreeRefs(p0, p1, p3, null, m.class, "6");
       if (hashMap != PatchProxyResult.class) {
       }else {
          try{
             hashMap = new HashMap();
             if (!TextUtils.x(p3)) {
                hashMap = new HashMap(s.c("&").g().a().h("=").a(p3));
             }
          }catch(java.lang.IllegalArgumentException e14){
             z1.d("urt", p0, p1, e14.getMessage());
          }
       }
    }
    public static void d(String p0,String p1,e p2,MessageNano p3,ImmutableMap$b p4){
       ClientEvent$ClickEvent elementPacka;
       ClientEvent$ClickEvent urlPackage;
       ClientEvent$ClickEvent areaPackage;
       ClientEvent$ClickEvent contentPacka;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, om, "1")) {
             return;
          }
       }
       if (p3 instanceof ClientEvent$ClickEvent) {
          elementPacka = p3.elementPackage;
          urlPackage = p3.urlPackage;
          areaPackage = p3.areaPackage;
          contentPacka = p3.contentPackage;
       label_0050 :
          e mElpParams = p2.mElpParams;
          if (mElpParams != null && (mElpParams.size() > 0 && (elementPacka != null && !TextUtils.x(elementPacka.params)))) {
             if ("json".equals(p2.mElpParamsType)) {
                m.b(p0, p1, p2.mElpParams, elementPacka.params, p4);
             }else if("kv".equals(p2.mElpParamsType)){
                m.c(p0, p1, p2.mElpParams, elementPacka.params, p4);
             }
          }
          e mUlpParams = p2.mUlpParams;
          if (mUlpParams != null && (mUlpParams.size() > 0 && (urlPackage != null && !TextUtils.x(urlPackage.params)))) {
             if ("json".equals(p2.mUlpParamsType)) {
                m.b(p0, p1, p2.mUlpParams, urlPackage.params, p4);
             }else if("kv".equals(p2.mUlpParamsType)){
                m.c(p0, p1, p2.mUlpParams, urlPackage.params, p4);
             }
          }
          mUlpParams = p2.mApParams;
          if (mUlpParams != null && (mUlpParams.size() > 0 && (areaPackage != null && !TextUtils.x(areaPackage.params)))) {
             if ("json".equals(p2.mApParamsType)) {
                m.b(p0, p1, p2.mApParams, areaPackage.params, p4);
             }else if("kv".equals(p2.mApParamsType)){
                m.c(p0, p1, p2.mApParams, areaPackage.params, p4);
             }
          }
          mUlpParams = p2.mUserParams;
          if (mUlpParams != null && (mUlpParams.size() > 0 && contentPacka != null)) {
             ClientContent$ContentPackage userPackage = contentPacka.userPackage;
             if (userPackage != null && !TextUtils.x(userPackage.params)) {
                if ("json".equals(p2.mUserParamsType)) {
                   m.b(p0, p1, p2.mUserParams, contentPacka.userPackage.params, p4);
                }else if("kv".equals(p2.mUserParamsType)){
                   m.c(p0, p1, p2.mUserParams, contentPacka.userPackage.params, p4);
                }
             }
          }
       }else if(p3 instanceof ClientEvent$ShowEvent){
          elementPacka = p3.elementPackage;
          urlPackage = p3.urlPackage;
          areaPackage = p3.areaPackage;
          contentPacka = p3.contentPackage;
          goto label_0050 ;
       }else if(p3 instanceof ClientEvent$TaskEvent){
          elementPacka = p3.elementPackage;
          urlPackage = p3.urlPackage;
          areaPackage = p3.areaPackage;
          contentPacka = p3.contentPackage;
          goto label_0050 ;
       }
    label_0128 :
       return;
    }
    public static void e(String p0,String p1,JsonObject p2,String p3,String p4,ImmutableMap$b p5){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, om, "5")) {
             return;
          }
       }
       if (p2 != null) {
          JsonElement jsonElement = p2.e0(p3);
          if (jsonElement != null) {
             try{
                p0 = jsonElement.w();
             }catch(java.lang.UnsupportedOperationException e7){
                z1.d("urt", p0, p1, e7.getMessage());
                p0 = jsonElement.toString();
             }
             if (!TextUtils.x(p0)) {
                p5.c(p4, new g(m.f(p0)));
             }
          }
       }
       return;
    }
    public static String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, m.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.length() <= 100) {
          return p0;
       }
       int i = p0.length();
       int i1 = p0.length() - 100;
       if (!PatchProxy.isSupport(z1.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(i1), null, z1.class, "3")) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("content_type", "urt");
             jSONObject.put("content", p0);
             jSONObject.put("real_size", i);
             jSONObject.put("trim_size", i1);
             b.a(0x4b316083).logCustomEvent("v2_trace_trim_e", jSONObject.toString());
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
