package com.cmic.sso.sdk.c.c.b;
import com.cmic.sso.sdk.c.c.c;
import java.lang.String;
import com.cmic.sso.sdk.c.b.e;
import com.cmic.sso.sdk.c.b.g;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.e.q;
import com.cmic.sso.sdk.c.b.a;
import java.lang.Object;
import com.cmic.sso.sdk.e.c;
import org.json.JSONObject;

public class b extends c	// class@000f50
{
    public final e b;
    public boolean c;

    public void b(String p0,e p1,String p2,String p3){
       super(p0, p1, p2, p3);
       this.c = false;
       this.b = p1;
    }
    public void a(a p0){
       if (this.c == null) {
          String str = q.a(true);
          String str1 = q.b(true);
          p0.a("ipv4_list", str);
          p0.a("ipv6_list", str1);
          a uoa = this.b.c();
          if (!p0.b("isCloseIpv4", false)) {
             uoa.s(str);
          }
          if (!p0.b("isCloseIpv6", false)) {
             uoa.t(str1);
          }
          c.b("GetPrePhonescripParam", uoa.toString());
          uoa.p(uoa.w(p0.b("appkey")));
          this.b.a(uoa);
          this.b.a(true);
          this.a = this.b.b().toString();
          this.c = true;
       }
       return;
    }
}
