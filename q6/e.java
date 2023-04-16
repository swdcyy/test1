package q6.e;
import p6.e;
import s6.a;
import java.lang.String;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import p6.b;
import u6.c;
import java.nio.charset.Charset;
import n6.b;
import s6.b;
import java.lang.Object;
import o6.a$a;
import o6.a$b;
import o6.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.RuntimeException;

public class e extends e	// class@002974
{

    public void e(){
       super();
    }
    public String b(a p0,String p1,JSONObject p2){
       return p1;
    }
    public Map d(boolean p0,String p1){
       return new HashMap();
    }
    public JSONObject e(){
       return null;
    }
    public b h(a p0,Context p1,String p2){
       boolean b;
       byte[] uobyteArray;
       String str = "mspl";
       c.f(str, "mdap post");
       HashMap hashMap = new HashMap();
       hashMap.put("utdId", b.d().c());
       hashMap.put("logHeader", "RAW");
       hashMap.put("bizCode", "alipaysdk");
       hashMap.put("productId", "alipaysdk_android");
       hashMap.put("Content-Encoding", "Gzip");
       hashMap.put("productVersion", "15.8.05");
       a$b uob = a.a(p1, new a$a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", hashMap, b.a(p2.getBytes(Charset.forName("UTF-8")))));
       c.f(str, "mdap got "+uob);
       if (uob == null) {
          throw new RuntimeException("Response is null");
       }
       b = e.j(uob);
       try{
          uob = uob.c;
          if (b) {
             uobyteArray = b.b(uob);
          }
          return new b("", new String(uobyteArray, Charset.forName("UTF-8")));
       }catch(java.lang.Exception e5){
          c.c(e5);
          return null;
       }
    }
}
