package com.tencent.open.utils.g$1;
import java.lang.Runnable;
import com.tencent.open.utils.g;
import java.util.Map;
import java.lang.Object;
import com.tencent.open.a.a;
import java.lang.String;
import com.tencent.open.a.b;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.lang.Throwable;

public class g$1 implements Runnable	// class@000f7c
{
    public final Map a;
    public final g b;

    public void g$1(g p0,Map p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       String str = "openSDK_LOG.OpenConfig";
       try{
          b uob = a.a().a("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", this.a);
          String str1 = uob.a();
          SLog.i(str, "update: get config statusCode "+uob.d());
          JSONObject jSONObject = k.d(str1);
          g.a(this.b, jSONObject);
       }catch(java.lang.Exception e1){
          SLog.e(str, "get config error ", e1);
       }
       g.a(this.b, 0);
       return;
    }
}
