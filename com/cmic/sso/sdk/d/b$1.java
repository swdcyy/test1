package com.cmic.sso.sdk.d.b$1;
import com.cmic.sso.sdk.c.c.d;
import com.cmic.sso.sdk.d.b;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.e.k;
import java.lang.System;

public class b$1 implements d	// class@000f57
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,JSONObject p2){
       a uoa = b.a(this.a).b();
       k$a uoa1 = k.a();
       if (!p0.equals("103000")) {
          if (uoa.l() && uoa.k()) {
             int i = k.a("logFailTimes", 0) + 1;
             if (i >= uoa.k()) {
                uoa1.a("logFailTimes", 0);
                uoa1.a("logCloseTime", System.currentTimeMillis());
             }else {
                uoa1.a("logFailTimes", i);
             }
          }
       }else {
          uoa1.a("logFailTimes", 0);
          uoa1.a("logCloseTime", 0);
       }
       uoa1.b();
       return;
    }
}
