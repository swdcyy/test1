package com.kuaishou.security.kste.logic.report.LogProxy$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.StringBuilder;
import a.a.a.a.b.e.b$b;
import a.a.a.a.b.e.b;

public final class LogProxy$a implements Runnable	// class@000f19
{
    public final int a;
    public final String b;

    public void LogProxy$a(int p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LogProxy$a.class, "1")) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       try{
          String str = "errno";
          jSONObject.put(str, this.a);
          jSONObject.put("message", this.b);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       m$c.b("native report here "+jSONObject);
       b.a(b$b.a, jSONObject.toString(), 999);
       return;
    }
}
