package k2b.z1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import java.lang.Integer;
import f3b.s;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import org.json.JSONException;
import java.lang.Long;
import java.lang.Thread;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;

public class z1	// class@001bca
{
    public static boolean a;
    public static long b;
    public static long c;

    public void z1(){
       super();
    }
    public static long a(){
       Object obj = PatchProxy.apply(null, null, z1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long b = z1.b;
       if (b > 0) {
          return b;
       }
       b = n.A1().E();
       z1.b = b;
       return b;
    }
    public static void b(int p0,String p1){
       z1 oz1 = z1.class;
       if (PatchProxy.isSupport(oz1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oz1, "5")) {
          return;
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", p0);
             jSONObject.put("reason", p1);
             b.a(0x4b316083).f1("CONAN_TRACE_ADD_HEART_BEAT", jSONObject.toString(), 1);
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }
       }
    }
    public static void c(String p0,long p1){
       long l;
       z1 oz1 = z1.class;
       Object obj = null;
       if (PatchProxy.isSupport(oz1) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), obj, oz1, "12")) {
          return;
       }
       JSONObject obj1 = PatchProxy.apply(obj, obj, oz1, "2");
       if (obj1 != PatchProxyResult.class) {
          l = obj1.longValue();
       }else {
          l = z1.c;
          if (l - null <= 0) {
             l = n.A1().k();
             z1.c = l;
          }
       }
       if (s.a(l)) {
          try{
             obj1 = new JSONObject();
             obj1.put("type", "Performance");
             obj1.put("action", p0);
             obj1.put("thread_name", Thread.currentThread().getName());
             obj1.put("cost", p1);
             b.a(0x4b316083).logCustomEvent("v2_api_mt_p", obj1.toString());
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public static void d(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, z1.class, "8")) {
          return;
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("content_type", p0);
             jSONObject.put("page", p1);
             jSONObject.put("element", p2);
             jSONObject.put("reason", p3);
             b.a(0x4b316083).logCustomEvent("v2_trace_parse_e", jSONObject.toString());
          }catch(org.json.JSONException e7){
             e7.printStackTrace();
          }
       }
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z1.class, "15")) {
          return;
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("content_type", "RecoChannelConfig");
             jSONObject.put("reason", p1);
             b.a(0x4b316083).logCustomEvent(p0, jSONObject.toString());
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
       }
    }
    public static void f(String p0,String p1,String p2,String p3,int p4,int p5){
       z1 oz1 = z1.class;
       if (PatchProxy.isSupport(oz1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, oz1, "4")) {
             return;
          }
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("content_type", "stid");
             if (!TextUtils.isEmpty(p0)) {
                jSONObject.put("eventType", p0);
             }
             if (!TextUtils.isEmpty(p1)) {
                jSONObject.put("action", p1);
             }
             if (!TextUtils.isEmpty(p2)) {
                jSONObject.put("st", p2);
             }
             if (!TextUtils.isEmpty(p3)) {
                jSONObject.put("content", p3);
             }
             jSONObject.put("real_size", p4);
             jSONObject.put("trim_size", p5);
             b.a(0x4b316083).logCustomEvent("v2_trace_trim_e", jSONObject.toString());
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
    public static void g(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z1.class, "6")) {
          return;
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("content_type", p0);
             jSONObject.put("reason", p1);
             b.a(0x4b316083).logCustomEvent("v2_trace_decom_e", jSONObject.toString());
          }catch(org.json.JSONException e3){
             e3.printStackTrace();
          }
       }
    }
    public static void h(String p0,long p1){
       z1 oz1 = z1.class;
       if (PatchProxy.isSupport(oz1) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oz1, "10")) {
          return;
       }
       if (s.a(z1.a())) {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Performance");
             jSONObject.put("content_type", p0);
             jSONObject.put("cost", p1);
             b.a(0x4b316083).logCustomEvent("v2_trace_load_w_p", jSONObject.toString());
          }catch(org.json.JSONException e4){
             e4.printStackTrace();
          }
       }
    }
}
