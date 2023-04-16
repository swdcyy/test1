package com.kuaishou.android.security.base.network.b;
import android.os.AsyncTask;
import com.kuaishou.android.security.base.network.e;
import com.kuaishou.android.security.base.network.d;
import com.kuaishou.android.security.base.network.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kuaishou.android.security.base.util.m;
import com.kuaishou.android.security.base.network.c;
import java.lang.Exception;
import java.lang.Thread;
import com.kuaishou.android.security.base.network.b$a;
import java.lang.Runnable;

public class b extends AsyncTask	// class@000eec
{
    public e a;
    public static String b;

    static {
       b.b = "b";
    }
    public void b(e p0){
       this.a = p0;
    }
    public static e a(b p0){
       return p0.a;
    }
    public f a(d[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 != null && p0.length > 0) {
             object oobject = p0[0];
             JSONObject jSONObject = m.a(oobject);
             if (jSONObject == null) {
                return new f(-1, "params is invalid");
             }
             return c.a(oobject.b(), jSONObject);
          }
       }catch(java.lang.Exception e4){
          e4.getMessage();
       }
    label_0034 :
       return null;
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       new Thread(new b$a(this, p0), "sec_http_resp_callback_thread").start();
       return;
    }
    public Object doInBackground(Object[] p0){
       return this.a(p0);
    }
    public void onPostExecute(Object p0){
       this.a(p0);
    }
}
