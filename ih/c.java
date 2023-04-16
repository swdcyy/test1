package ih.c;
import ih.c$a;
import ih.c$b;
import ih.c$c;
import ih.c$d;
import java.lang.Math;
import java.lang.Object;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.SampleRateInfo;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class c	// class@0021ee
{
    public static SampleRateInfo a;
    public static final ThreadLocal b;
    public static final ThreadLocal c;
    public static final ThreadLocal d;
    public static final ThreadLocal e;
    public static final float f;
    public static float g;

    static {
       c.b = new c$a();
       c.c = new c$b();
       c.d = new c$c();
       c.e = new c$d();
       c.f = (float)(Math.sqrt(2.00f) / 2.00f);
       c.g = 0xbf800000;
    }
    public void c(){
       super();
    }
    public static void a(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "2")) {
          return;
       }
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e3){
             throw e3;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static SampleRateInfo b(){
       SampleRateInfo obj = PatchProxy.apply(null, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SampleRateInfo();
       obj.merchant_animation = 0x3f50624de0000000;
       return obj;
    }
    public static String c(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Type[] typeArray = new Type[]{String.class,Object.class};
          return new Gson().r(p0, a.getParameterized(Map.class, typeArray).getType());
       }catch(java.lang.Exception e0){
          return "get upload info error";
       }
    }
    public static SampleRateInfo d(){
       Object obj = PatchProxy.apply(null, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.a == null) {
          try{
             c.a = a.t().getValue("merchantDySampleRate", SampleRateInfo.class, c.b());
          }catch(java.lang.Exception e0){
             c.a = c.b();
          }
       }
    }
    public static boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.matches("\(https?|ftp|file\)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]");
    }
}
