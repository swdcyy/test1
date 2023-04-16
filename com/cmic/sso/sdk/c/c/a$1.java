package com.cmic.sso.sdk.c.c.a$1;
import com.cmic.sso.sdk.c.d.c;
import com.cmic.sso.sdk.c.c.a;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.c.c.d;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.os.SystemClock;
import com.cmic.sso.sdk.e.r;
import com.cmic.sso.sdk.c.d.a;
import org.json.JSONObject;
import com.cmic.sso.sdk.auth.c;
import com.cmic.sso.sdk.c.d.b;
import java.lang.Exception;

public class a$1 implements c	// class@000f4e
{
    public final c a;
    public final a b;
    public final d c;
    public final a d;

    public void a$1(a p0,c p1,a p2,d p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public final void a(){
       if (!(this.a.a()).contains("uniConfig")) {
          r.c(this.b, String.valueOf((SystemClock.elapsedRealtime() - this.a.i())));
       }
       return;
    }
    public void a(a p0){
       if (this.a.g()) {
          this.a();
          r.b(this.b, String.valueOf(p0.a()));
          this.c.a(String.valueOf(p0.a()), p0.b(), c.a(String.valueOf(p0.a()), p0.b()));
       }
       return;
    }
    public void a(b p0){
       String str = "resultcode";
       if (this.a.g()) {
          try{
             this.a();
             JSONObject jSONObject = new JSONObject(p0.c());
             String str1 = (jSONObject.has(str))? jSONObject.getString(str): jSONObject.getString("resultCode");
             r.b(this.b, str1);
             this.c.a(str1, jSONObject.optString("desc"), jSONObject);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             this.a(a.a(0x18f4f));
          }
       }
    }
}
