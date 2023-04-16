package k.c$a;
import java.lang.Runnable;
import k.c;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;
import a.a.a.a.b.a.c;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import java.lang.System;
import a.a.a.a.b.f.a;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import java.lang.StringBuilder;
import okhttp3.Request$Builder;
import okhttp3.FormBody$Builder;
import android.util.Base64;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import java.lang.Throwable;
import okhttp3.ResponseBody;

public class c$a implements Runnable	// class@00244d
{
    public final String b;
    public final c c;

    public void c$a(c p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       String str1;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(c.j, b.b().l().appKPN());
       jSONObject.put(c.e, c.T);
       jSONObject.put(c.a, b.b().l().appVer());
       jSONObject.put(c.c, "1.0.0.107.3722af76");
       jSONObject.put(c.n, b.b().l().context().getPackageName());
       jSONObject.put(c.g, b.b().l().appkey());
       jSONObject.put(c.b, b.b().l().did());
       jSONObject.put(c.d, b.b().l().userId());
       jSONObject.put(c.o, "");
       jSONObject.put(c.p, "100101");
       jSONObject.put(c.q, this.b);
       jSONObject.put(c.s, "");
       jSONObject.put(c.t, "");
       jSONObject.put(c.r, System.currentTimeMillis());
       jSONObject.put(c.h, a.b());
       StringBuilder str = "report log begin ["+jSONObject;
       m$c.b(str+"]");
       Response response = m$f.a.newCall(new Request$Builder().url("https://kste.ksapisrv.com/rest/kste/report").post(new FormBody$Builder().add(c.s0, Base64.encodeToString(MXSec.get().getWrapper().atlasEncrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, 0, (jSONObject.toString()).getBytes()), 2)).add(c.t0, MXSec.get().getWrapper().atlasSign(KSTEContext.SDKNAME, KSTEContext.SDKID, 0, jSONObject.toString())).build()).build()).execute();
       if (response != null && (response.isSuccessful() && (response.code() >= 200 && (response.code() < 300 && response.body() != null)))) {
          m$c.b("report log https://kste.ksapisrv.com/rest/kste/report success");
          response.body().contentLength();
          JSONObject jSONObject1 = new JSONObject(response.body().string());
          if (jSONObject1.optInt("code") == 1) {
             byte[] uobyteArray = MXSec.get().getWrapper().atlasDecrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, 0, Base64.decode(jSONObject1.optString("data"), 0));
             if (!uobyteArray.length) {
                str1 = "resp data decrypt error";
             label_0190 :
                m$c.d(str1);
             }else {
                m$c.b("resp "+new String(uobyteArray));
             }
          }
       }else {
          str1 = "report log http error "+response.code();
          goto label_0190 ;
       }
       m$c.b("report log finish");
       return;
    }
}
