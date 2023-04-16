package p45.f;
import p45.b;
import p45.f$a;
import nsd.u;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import kotlin.Pair;
import java.util.List;
import com.google.gson.JsonObject;
import com.kwai.android.common.ext.JsonObjectExtKt;
import com.google.gson.Gson;
import p45.b$a;
import java.lang.Exception;
import android.util.Log;
import trd.t0;
import com.kwai.android.common.ext.MutableMapExtKt;

public final class f extends b	// class@002161
{
    public static final f$a d;

    static {
       f.d = new f$a(null);
    }
    public void f(Map p0){
       a.p(p0, "channelVersionMap");
       super(p0);
    }
    public static void g(f p0,String p1,String p2,Throwable p3,Pair[] p4,int p5,Object p6){
       p2 = (p5 & 0x02)? "": null;
       if (p5 & 0x04) {
          p3 = null;
       }
       p0.f(p1, p2, p3, p4);
       return;
    }
    public final void e(boolean p0,List p1){
       String str = "channelList";
       try{
          a.p(p1, str);
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "notify_center_setting", String.valueOf(p0));
          String str1 = "notify_channels";
          String str2 = new Gson().q(p1);
          if (str2 == null) {
             str2 = "none";
          }
          JsonObjectExtKt.set(jsonObject, str1, str2);
          JsonObjectExtKt.set(jsonObject, "session_id", b.c.a());
          b.d(this, "push_status", jsonObject, 0, 4, null);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void f(String p0,String p1,Throwable p2,Pair[] p3){
       a.p(p0, "tag");
       a.p(p1, "reason");
       try{
          a.p(p3, "pairs");
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "reason", p1);
          JsonObjectExtKt.set(jsonObject, "tag", p0);
          JsonObjectExtKt.set(jsonObject, "throwable", Log.getStackTraceString(p2));
          p0 = "simpleMessage";
          Gson gson = null;
          String message = (p2 != null)? p2.getMessage(): gson;
          JsonObjectExtKt.set(jsonObject, p0, message);
          JsonObjectExtKt.set(jsonObject, "param", MutableMapExtKt.toJson$default(t0.J0(t0.H0(p3)), gson, 1, gson));
          b.d(this, "sdk_internal_error", jsonObject, 0, 4, null);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       return;
    }
    public final void h(String p0,String p1,Pair[] p2){
       String str = "tag";
       a.p(p0, str);
       a.p(p1, "reason");
       try{
          a.p(p2, "pairs");
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "reason", p1);
          JsonObjectExtKt.set(jsonObject, str, p0);
          JsonObjectExtKt.set(jsonObject, "param", MutableMapExtKt.toJson$default(t0.J0(t0.H0(p2)), null, 1, null));
          b.d(this, "sdk_internal_info", jsonObject, 0, 4, null);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       return;
    }
    public final void i(String p0,String p1,Throwable p2,Pair[] p3){
       String str = "tag";
       a.p(p0, str);
       a.p(p1, "reason");
       try{
          a.p(p3, "pairs");
          JsonObject jsonObject = new JsonObject();
          JsonObjectExtKt.set(jsonObject, "reason", p1);
          JsonObjectExtKt.set(jsonObject, str, p0);
          JsonObjectExtKt.set(jsonObject, "throwable", Log.getStackTraceString(null));
          JsonObjectExtKt.set(jsonObject, "simpleMessage", null);
          JsonObjectExtKt.set(jsonObject, "param", MutableMapExtKt.toJson$default(t0.J0(t0.H0(p3)), null, 1, null));
          b.d(this, "sdk_internal_warning", jsonObject, 0, 4, null);
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       return;
    }
}
