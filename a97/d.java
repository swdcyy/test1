package a97.d;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonElement;
import zk.g;

public class d	// class@000081
{
    public static final c a;

    static {
       d.a = new c();
    }
    public static long a(JsonObject p0,String p1,long p2){
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement != null && (jsonElement.F() && jsonElement.N())) {
          p2 = jsonElement.t();
       }
    label_0019 :
       return p2;
    }
    public static String b(JsonObject p0,String p1,String p2){
       JsonElement jsonElement = p0.e0(p1);
       String str = (jsonElement != null && jsonElement.F())? jsonElement.w(): null;
       return str;
    }
}
