package by7.b;
import ay7.a;
import by7.b$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import org.json.JSONObject;
import com.kwai.yoda.event.d;
import com.kwai.yoda.function.FunctionResultParams$a;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaException;

public class b extends a	// class@0003a0
{
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(){
       super();
    }
    public String c(){
       return "dispatchEvent";
    }
    public String d(){
       return "event";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       Object[] objArray;
       String str1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       YodaException yodaExceptio = null;
       int i = 1;
       JSONObject jSONObject = (p1 == null || !p1.length())? 1: null;
       String str = "java.lang.String.format\(format, *args\)";
       if (!jSONObject) {
          try{
             jSONObject = new JSONObject(p1);
             p1 = jSONObject.optString("type");
             int i1 = (p1 == null || !p1.length())? 1: 0;
             if (!i1) {
                d.f().e(null, p1, jSONObject.optString("data"));
                return FunctionResultParams.Companion.b();
             }else {
                objArray = new Object[i];
                objArray[yodaExceptio] = "type";
                str1 = String.format("The Input [%s] can NOT be null.", Arrays.copyOf(objArray, i));
                a.h(str1, str);
                throw new YodaException(0x1e84f, str1);
             }
          }catch(org.json.JSONException e0){
             throw new YodaException(0x1e84f, "The Input parameter is invalid.");
          }
       }else {
          objArray = new Object[i];
          objArray[yodaExceptio] = "type";
          str1 = String.format("The Input [%s] can NOT be null.", Arrays.copyOf(objArray, i));
          a.h(str1, str);
          throw new YodaException(0x1e84f, str1);
       }
    }
}
