package ca7.l;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonElement;
import zk.g;
import tb7.d;

public class l	// class@00051f
{
    public static final c a;

    static {
       l.a = new c();
    }
    public static JsonElement a(JsonObject p0,String p1){
       JsonElement jsonElement;
       try{
          if (!p0.s0(p1)) {
          label_0011 :
             jsonElement = null;
          }else {
             jsonElement = p0.e0(p1);
             if (jsonElement.D()) {
                goto label_0011 ;
             }else if(jsonElement instanceof g){
                jsonElement = l.a.a(jsonElement.w());
             }
          }
          return jsonElement;
       }catch(com.google.gson.JsonSyntaxException e0){
       }
    }
    public static int b(JsonObject p0,String p1,int p2){
       return d.e(p0, p1, p2);
    }
    public static String c(JsonObject p0,String p1,String p2){
       return d.g(p0, p1, null);
    }
}
