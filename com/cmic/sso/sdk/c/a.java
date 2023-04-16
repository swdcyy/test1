package com.cmic.sso.sdk.c.a;
import java.lang.Object;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.d.b;
import com.cmic.sso.sdk.a;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.lang.String;
import com.cmic.sso.sdk.e.r;
import com.cmic.sso.sdk.c.b.c;
import com.cmic.sso.sdk.c.b.g;
import android.net.Network;
import com.cmic.sso.sdk.c.b.d;

public class a	// class@000f42
{
    public String a;
    public String b;

    public void a(){
       super();
    }
    public c a(c p0,b p1,a p2){
       List list;
       Map map = p1.b();
       if (TextUtils.isEmpty(this.a)) {
          list = map.get("pplocation");
          if (list != null && list.size() > 0) {
             this.a = list.get(0);
          }
       }
       r.b(p2, String.valueOf(p1.a()));
       String str = "Location";
       list = map.get(str);
       if (list == null || list.isEmpty()) {
          list = map.get(str.toLowerCase());
       }
       if (list != null && list.size() > 0) {
          str = list.get(0);
          this.b = str;
          if (!TextUtils.isEmpty(str)) {
             str = p2.b("operatortype", "0");
             if (("2").equals(str)) {
                r.a(p2, "getUnicomMobile");
             }else if(("3").equals(str)){
                r.a(p2, "getTelecomMobile");
             }else {
                r.a(p2, "NONE");
             }
          }
       }
       c uoc = this.a(this.b, p0.f(), "GET", new c(p0.k().a()));
       uoc.a(p0.h());
       return uoc;
    }
    public final c a(String p0,String p1,String p2,g p3){
       c uoc = new c(p0, p3, p2, p1);
       if (p2.equals("GET")) {
          uoc.a("Content-Type", "application/x-www-form-urlencoded");
       }
       return uoc;
    }
    public String a(){
       return this.a;
    }
    public c b(c p0,b p1,a p2){
       String str = p2.b("operatortype", "0");
       if (("2").equals(str)) {
          r.a(p2, "getNewUnicomPhoneNumberNotify");
       }else if(("3").equals(str)){
          r.a(p2, "getNewTelecomPhoneNumberNotify");
       }else {
          r.a(p2, "NONE");
       }
       r.b(p2, String.valueOf(p1.a()));
       d uod = new d(p0.k().a(), "1.0", p1.c());
       uod.c(p2.b("userCapaid"));
       if (p2.c("logintype") != 3) {
          uod.b("authz");
       }else {
          uod.b("pre");
       }
       c uoc = this.a(this.a, p0.f(), "POST", uod);
       uoc.a(p0.h());
       this.a = null;
       return uoc;
    }
}
