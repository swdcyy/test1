package d86.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Iterator;
import java.lang.StringBuilder;
import d86.d;
import e66.c;
import q87.c;
import lnc.c9;
import java.io.File;
import o56.c;
import o56.a;
import android.app.Application;
import qkd.b;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.util.Set;
import java.util.Map$Entry;
import d86.a;
import java.lang.Runnable;
import t45.c;

public class c	// class@001484
{
    public static final Object a;
    public static String b;

    static {
       c.a = new Object();
    }
    public void c(){
       super();
    }
    public static Map a(){
       String obj = PatchProxy.apply(null, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.f("abtest.json");
       if (TextUtils.x(obj)) {
          return null;
       }
       return c.d(obj);
    }
    public static Map b(){
       String obj = PatchProxy.apply(null, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.f("kswitch.json");
       if (TextUtils.x(obj)) {
          return null;
       }
       return c.d(obj);
    }
    public static Map c(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new HashMap();
          JSONObject jSONObject = new JSONObject(p0);
          Iterator iterator = jSONObject.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             obj.put(str, jSONObject.optJSONObject(str));
          }
       }catch(java.lang.Exception e4){
          "parseData2JSONObjectMap error, e = "+e4;
       }
       return obj;
    }
    public static Map d(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new HashMap();
          JSONObject jSONObject = new JSONObject(p0);
          Iterator iterator = jSONObject.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             obj.put(str, jSONObject.opt(str));
          }
       }catch(java.lang.Exception e4){
          "parseData2Map error, e = "+e4;
       }
       return obj;
    }
    public static d e(String p0){
       String str = "";
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          Object[] objArray = new Object[0];
          c.C().A("KMonkeyHelper", "KSAutomatorTaskData JSON is Empty!", objArray);
          return null;
       }else {
          try{
             obj = new JSONObject(p0);
             String str1 = obj.optString("ks_automator_task_id");
             obj = obj.optJSONObject("ks_automator_task_extra");
             String str2 = (obj != null)? obj.toString(): str;
             if (TextUtils.x(str1) && TextUtils.x(str2)) {
                return null;
             }else {
                return new d(str1, str2);
             }
          }catch(org.json.JSONException e0){
             return new d(p0, e0);
          }catch(java.lang.Exception e7){
             Object[] objArray1 = new Object[0];
             c.C().A("KMonkeyHelper", "parse KSAutomatorTaskData error, e = "+e7, objArray1);
             return null;
          }
       }
    }
    public static String f(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoc, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = PatchProxy.apply(null, null, uoc, "12");
       if (str != patchProxyRe) {
       }else if(c9.b()){
          String str1 = c9.a();
          if (!TextUtils.x(str1)) {
             str1 = File.separator;
             str = str1+str1+"ksmonkey"+str1+"share"+str1+a.a().a().getPackageName()+str1;
          }
       }
       str = null;
       if (TextUtils.x(str)) {
          Object[] objArray = new Object[0];
          c.C().A("KMonkeyHelper", "no monkey cache dir!", objArray);
          return null;
       }else {
          try{
             return b.g0(new File(str+p0), "utf-8");
          }catch(java.lang.Exception e0){
             c.C().z(obj, "read file "+p0+" failed, e = ", e0);
             return v2;
          }
       }
    }
    public static void g(JsonObject p0,String p1,String p2){
       Object[] objArray2;
       String key;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().A("KMonkeyHelper", "replace json begin key="+p1+",fileName="+p2, objArray);
       String str = c.f(p2);
       if (str != null) {
          try{
             JsonObject jsonObject = c.d(str).r();
             p0 = p0.m0(p1);
             Object[] objArray1 = new Object[0];
             c.C().A("KMonkeyHelper", "replace  updateJsonObject="+p0, objArray1);
             if (p0 != null) {
                Iterator iterator = jsonObject.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   key = uEntry.getKey();
                   JsonElement value = uEntry.getValue();
                   Object[] objArray3 = new Object[0];
                   c.C().A("KMonkeyHelper", "replace "+key+":"+value, objArray3);
                   p0.G(key, value);
                }
             }
          }catch(java.lang.Exception e9){
             c.C().z("KMonkeyHelper", "replace fail key="+p1+",fileName="+p2, e9);
          }
       }
    }
    public static void h(String p0){
       c uoc = c.class;
       Object[] obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoc, "1")) {
          return;
       }
       if (TextUtils.x(p0)) {
          obj = new Object[0];
          c.C().A("KMonkeyHelper", "deviceId is empty", obj);
          return;
       }else {
          _monitor_enter(uoc);
          if (p0.equals(c.b)) {
             _monitor_exit(uoc);
             return;
          }else {
             c.b = p0;
             _monitor_exit(uoc);
             if (c9.b()) {
                String str = c9.a();
                if (!TextUtils.x(str)) {
                   File uFile = new File(str+"."+a.a().a().getPackageName()+".did");
                   if (!PatchProxy.applyVoidTwoRefs(uFile, p0, obj, uoc, "2")) {
                      c.a(new a(uFile, p0));
                   }
                }
             }
             return;
          }
       }
    }
}
