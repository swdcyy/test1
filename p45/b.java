package p45.b;
import p45.b$a;
import nsd.u;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.google.gson.JsonObject;
import com.kwai.android.common.config.PushConfigManager;
import java.lang.RuntimeException;
import java.lang.StackTraceElement;
import java.lang.Class;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Float;
import java.lang.Number;
import com.kwai.android.common.ext.JsonObjectExtKt;
import com.google.gson.Gson;
import com.kwai.android.common.ext.MutableMapExtKt;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.Throwable;
import android.util.Log;
import com.google.gson.JsonElement;
import java.lang.Exception;

public class b	// class@00215c
{
    public final Map a;
    public static final String b;
    public static final b$a c;

    static {
       b.c = new b$a(null);
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       b.b = str;
    }
    public void b(Map p0){
       a.p(p0, "channelVersionMap");
       super();
       this.a = p0;
    }
    public static void d(b p0,String p1,JsonObject p2,float p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = PushConfigManager.INSTANCE.getLoggerReportRatio();
       }
       p0.c(p1, p2, p3);
       return;
    }
    public final String a(){
       object oobject;
       StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
       int len = stackTrace.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "unknown";
          }
          oobject = stackTrace[i];
          a.o(oobject, "trace");
          int i1 = a.g(this.getClass().getCanonicalName(), oobject.getClassName()) ^ 0x01;
          if (i1) {
             i1 = a.g(b.class.getCanonicalName(), oobject.getClassName()) ^ 0x01;
             if (i1) {
                break ;
             }
          }
          i = i + 1;
       }
       String className = oobject.getClassName();
       a.o(className, "trace.className");
       return StringsKt__StringsKt.d5(className, ".", "unknown");
    }
    public final String b(){
       object oobject;
       StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
       int len = stackTrace.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "unknown";
          }
          oobject = stackTrace[i];
          a.o(oobject, "trace");
          int i1 = a.g(this.getClass().getCanonicalName(), oobject.getClassName()) ^ 0x01;
          if (i1) {
             i1 = a.g(b.class.getCanonicalName(), oobject.getClassName()) ^ 0x01;
             if (i1) {
                break ;
             }
          }
          i = i + 1;
       }
       String methodName = oobject.getMethodName();
       a.o(methodName, "trace.methodName");
       return methodName;
    }
    public final void c(String p0,JsonObject p1,float p2){
       AzerothCodeAdapter b;
       a.p(p0, "key");
       String str = "json";
       try{
          a.p(p1, str);
          JsonObjectExtKt.set(p1, "ratio", Float.valueOf(p2));
          JsonObjectExtKt.set(p1, "sdk_version", MutableMapExtKt.toJson$default(this.a, null, 1, null));
          JsonObjectExtKt.set(p1, "session_id", b.b);
          JsonObjectExtKt.set(p1, "class", this.a());
          JsonObjectExtKt.set(p1, "method", this.b());
          b = AzerothCodeAdapter.b;
          if (!b.isDebugMode()) {
             JsonObjectExtKt.set(p1, "call_stack", Log.getStackTraceString(new RuntimeException()));
          }
          String str1 = p1.toString();
          a.o(str1, "json.toString\(\)");
          b.addCustomStatEvent(p2, p0, str1);
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
}
