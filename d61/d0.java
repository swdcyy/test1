package d61.d0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;

public class d0	// class@001f15
{

    public void d0(){
       super();
    }
    public static String a(String p0,String p1){
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, null, d0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       if (!TextUtils.x(p0)) {
          obj.c0("activityInfo", p0);
       }
       if (!TextUtils.x(p1)) {
          obj.c0("searchExtraInfo", p1);
       }
       return obj.toString();
    }
}
