package q6.b;
import p6.e;
import s6.a;
import java.util.HashMap;
import java.lang.String;
import h6.a;
import u6.a;
import org.json.JSONObject;
import java.lang.Object;
import com.alipay.sdk.m.q.b;
import k6.a;
import java.lang.Throwable;
import java.util.Map;
import java.lang.StringBuilder;
import u6.c;

public class b extends e	// class@002971
{

    public void b(){
       super();
    }
    public String c(a p0,HashMap p1,HashMap p2){
       String str = "ap_q";
       String str1 = "biz";
       try{
          HashMap hashMap = new HashMap();
          a uoa = a.a();
          JSONObject jSONObject = new JSONObject();
          String str2 = "";
          String str3 = (uoa != null)? uoa.a(): str2;
          jSONObject.put(str, str3);
          str3 = "ap_link_token";
          a d = (p0 != null)? p0.d: str2;
          jSONObject.put(str3, d);
          try{
             str3 = "user_id";
             jSONObject.put(str3, String.valueOf(b.s()));
             jSONObject.put("app_lock", String.valueOf(b.n(b.i())));
             hashMap.put("ap_req", jSONObject.toString());
             if (uoa != null) {
                str2 = uoa.a();
             }
             a.c(p0, str1, str, str2);
          }catch(java.lang.Exception e0){
             a.d(p0, str1, "APMEx1", e0);
          }
          p2.putAll(hashMap);
          c.f("mspl", "cf "+p2);
          return super.c(p0, p1, p2);
       }catch(java.lang.Exception e0){
       }
    }
    public JSONObject e(){
       return e.f("sdkConfig", "obtain");
    }
    public String k(){
       return "5.0.0";
    }
}
