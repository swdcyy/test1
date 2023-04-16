package q6.d;
import p6.e;
import s6.a;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import org.json.JSONObject;
import java.util.Map;
import android.content.Context;
import p6.b;

public class d extends e	// class@002973
{

    public void d(){
       super();
    }
    public String a(a p0){
       HashMap hashMap = new HashMap();
       hashMap.put("api_name", "/sdk/log");
       hashMap.put("api_version", "1.0.0");
       HashMap hashMap1 = new HashMap();
       hashMap1.put("log_v", "1.0");
       return this.c(p0, hashMap, hashMap1);
    }
    public String b(a p0,String p1,JSONObject p2){
       return p1;
    }
    public Map d(boolean p0,String p1){
       HashMap hashMap = new HashMap();
       hashMap.put("msp-gzip", String.valueOf(p0));
       hashMap.put("content-type", "application/octet-stream");
       hashMap.put("des-mode", "CBC");
       return hashMap;
    }
    public JSONObject e(){
       return null;
    }
    public b h(a p0,Context p1,String p2){
       return this.i(p0, p1, p2, "https://mcgw.alipay.com/sdklog.do", true);
    }
}
