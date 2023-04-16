package be8.s;
import java.lang.Object;
import com.google.gson.JsonObject;
import fc8.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fc8.c;
import java.util.Set;
import java.util.Iterator;
import com.google.gson.JsonElement;
import zk.g;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Double;

public class s	// class@000340
{

    public void s(){
       super();
    }
    public static i a(JsonObject p0){
       i obj = PatchProxy.applyOneRefs(p0, null, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.e();
       Iterator iterator = p0.w0().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          JsonElement jsonElement = p0.e0(str);
          if (jsonElement.E()) {
             obj.c(str, s.a(jsonElement.r()));
          }else if(jsonElement.F()){
             if (jsonElement.s().a0()) {
                obj.c(str, jsonElement.w());
             }else if(jsonElement.s().G()){
                obj.c(str, Boolean.valueOf(jsonElement.d()));
             }else if(jsonElement.s().N()){
                obj.c(str, Double.valueOf(jsonElement.u().doubleValue()));
             }
          }
       }
       return obj;
    }
}
