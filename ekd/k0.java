package ekd.k0;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonElement;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import zk.g;

public class k0	// class@00155b
{
    public static final c a;

    static {
       k0.a = new c();
    }
    public static boolean a(JsonObject p0,String p1){
       boolean b = (p0.s0(p1) && !p0.e0(p1).D())? true: false;
       return b;
    }
    public static void b(JsonObject p0,JsonObject p1){
       Iterator iterator = p1.w0().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (p0.s0(str) && p0.e0(str).E()) {
             k0.b(p0.m0(str), p1.m0(str));
          }else {
             p0.G(str, p1.e0(str));
          }
       }
       return;
    }
    public static boolean c(JsonObject p0,String p1,boolean p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && (jsonElement.F() && jsonElement.G())) {
          p2 = jsonElement.d();
       }
    label_0019 :
       return p2;
    }
    public static double d(JsonObject p0,String p1,double p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && (jsonElement.F() && jsonElement.N())) {
          p2 = jsonElement.m();
       }
    label_0019 :
       return p2;
    }
    public static JsonElement e(JsonObject p0,String p1){
       if (!p0.s0(p1)) {
          return null;
       }
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement.D()) {
          return null;
       }
       if (jsonElement instanceof g) {
          jsonElement = k0.a.a(jsonElement.w());
       }
       return jsonElement;
    }
    public static int f(JsonObject p0,String p1,int p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && (jsonElement.F() && jsonElement.N())) {
          p2 = jsonElement.p();
       }
    label_0019 :
       return p2;
    }
    public static long g(JsonObject p0,String p1,long p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && (jsonElement.F() && jsonElement.N())) {
          p2 = jsonElement.t();
       }
    label_0019 :
       return p2;
    }
    public static String h(JsonObject p0,String p1,String p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && jsonElement.F()) {
          p2 = jsonElement.w();
       }
       return p2;
    }
}
