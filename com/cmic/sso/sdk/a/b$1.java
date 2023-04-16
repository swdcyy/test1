package com.cmic.sso.sdk.a.b$1;
import com.cmic.sso.sdk.c.c.d;
import com.cmic.sso.sdk.a.b;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.a.b$a;
import java.lang.Exception;

public class b$1 implements d	// class@000f1e
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,JSONObject p2){
       try{
          if (("103000").equals(p0)) {
             b.a(this.a, p2);
             k.a("sdk_config_version", "quick_login_android_9.5.1");
             b$1 ta = this.a;
             b.a(ta, b.a(ta));
             if (b.b(this.a) != null) {
                b.b(this.a).a(b.c(this.a));
             }
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       b.a(this.a, false);
       return;
    }
}
