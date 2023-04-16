package com.xiaomi.push.service.n;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import ws8.p4;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import rs8.c;
import ws8.n5;
import java.lang.CharSequence;
import android.text.TextUtils;
import ws8.v1;
import ws8.b5;
import ws8.r1;
import java.lang.Exception;
import ws8.p5;
import com.xiaomi.push.e;
import com.xiaomi.push.service.bg$b;
import com.xiaomi.push.service.bg;
import com.xiaomi.push.service.bg$c;
import ws8.o5;
import com.xiaomi.push.service.g0;
import java.lang.Integer;
import ws8.a3;
import com.xiaomi.push.ey;
import ws8.n4;
import ws8.d3;
import ws8.g3;
import ys8.e0;
import ws8.y2;
import android.app.Service;
import ws8.h3;
import android.content.Context;
import ws8.f2;
import java.util.Date;
import com.xiaomi.push.service.t;
import com.xiaomi.push.service.XMPushService$j;
import ws8.f3;
import ws8.a;
import ws8.l3;
import ws8.e3;
import ws8.b6;
import java.lang.System;

public class n	// class@001188
{
    public XMPushService a;

    public void n(XMPushService p0){
       this.a = p0;
    }
    public void a(p4 p0){
       if (5 != p0.a()) {
          this.f(p0);
       }
       try{
          this.d(p0);
       }catch(java.lang.Exception e0){
          c.n("handle Blob chid = "+p0.a()+" cmd = "+p0.b()+" packetid = "+p0.x()+" failure ", e0);
       }
       return;
    }
    public final void b(n5 p0){
       String str = p0.i();
       if (!TextUtils.isEmpty(str)) {
          String[] stringArray = str.split(";");
          r1 or1 = v1.h().g(b5.b(), false);
          if (or1 != null && stringArray.length > 0) {
             or1.o(stringArray);
             this.a.a(20, null);
             this.a.a(true);
          }
       }
       return;
    }
    public void c(p5 p0){
       if (!("5").equals(p0.m())) {
          this.e(p0);
       }
       String str = p0.m();
       if (TextUtils.isEmpty(str)) {
          str = "1";
          p0.p(str);
       }
       if (str.equals("0")) {
          c.l("Received wrong packet with chid = 0 : "+p0.d());
       }
       if (p0 instanceof e) {
          n5 on5 = p0.f("kick");
          if (on5 != null) {
             String str1 = p0.o();
             String str2 = on5.d("type");
             String str3 = on5.d("reason");
             c.l("kicked by server, chid="+str+" res="+bg$b.e(str1)+" type="+str2+" reason="+str3);
             if (("wait").equals(str2)) {
                bg$b uob = bg.c().b(str, str1);
                if (uob != null) {
                   this.a.a(uob);
                   uob.k(bg$c.a, 3, 0, str3, str2);
                }
             }else {
                this.a.a(str, str1, 3, str3, str2);
                bg.c().n(str, str1);
             }
             return;
          }
       }else if(p0 instanceof o5){
          o5 oo5 = p0;
          if (("redir").equals(oo5.A())) {
             n5 on51 = oo5.f("hosts");
             if (on51 != null) {
                this.b(on51);
             }
             return;
          }
       }
       this.a.b().j(this.a, str, p0);
       return;
    }
    public void d(p4 p0){
       String str2;
       bg$c uoc;
       int i1;
       StringBuilder str = p0.b();
       n on = null;
       int i = 0;
       if (p0.a()) {
          String str1 = Integer.toString(p0.a());
          if (("SECMSG").equals(p0.b())) {
             if (!p0.m()) {
                this.a.b().i(this.a, str1, p0);
             }else {
                str = "Recv SECMSG errCode = "+p0.p()+" errStr = ";
                str2 = p0.u();
             label_0319 :
                str2 = str+str2;
             label_0320 :
                c.l(str2);
             }
          }else {
             String str3 = "wait";
             String str4 = " reason=";
             if (("BIND").equals(str)) {
                a3 uoa3 = a3.n(p0.n());
                String str5 = p0.z();
                bg$b uob = bg.c().b(str1, str5);
                if (uob == null) {
                   return;
                }else if(uoa3.o()){
                   c.l("SMACK: channel bind succeeded, chid="+p0.a());
                   uob.k(bg$c.c, 1, 0, null, null);
                }else {
                   String str6 = uoa3.j();
                   if (("auth").equals(str6)) {
                      if (("invalid-sig").equals(uoa3.p())) {
                         c.l("SMACK: bind error invalid-sig token = "+uob.c+" sec = "+uob.i);
                         n4.d(i, ey.T.a(), 1, on, i);
                      }
                      uoc = bg$c.a;
                      i1 = 5;
                   label_00f0 :
                      uob.k(uoc, 1, i1, uoa3.p(), str6);
                      bg.c().n(str1, str5);
                   }else if(("cancel").equals(str6)){
                      uoc = bg$c.a;
                      i1 = 7;
                      goto label_00f0 ;
                   }else if(str3.equals(str6)){
                      this.a.a(uob);
                      uob.k(bg$c.a, 1, 7, uoa3.p(), str6);
                   }
                   str2 = "SMACK: channel bind failed, chid="+str1+str4+uoa3.p();
                   goto label_0320 ;
                }
             }else if(("KICK").equals(str)){
                d3 uod3 = d3.m(p0.n());
                str2 = p0.z();
                String str7 = uod3.j();
                String str8 = uod3.o();
                c.l("kicked by server, chid="+str1+" res= "+bg$b.e(str2)+" type="+str7+str4+str8);
                if (str3.equals(str7)) {
                   bg$b uob1 = bg.c().b(str1, str2);
                   if (uob1 != null) {
                      this.a.a(uob1);
                      uob1.k(bg$c.a, 3, 0, str8, str7);
                   }
                }else {
                   this.a.a(str1, str2, 3, str8, str7);
                   bg.c().n(str1, str2);
                }
             }
          }
       }else if(("PING").equals(str)){
          byte[] uobyteArray = p0.n();
          if (uobyteArray != null && uobyteArray.length > 0) {
             g3 og3 = g3.o(uobyteArray);
             if (og3.q()) {
                e0.h().j(og3.k());
             }
          }
          if (!("com.xiaomi.xmsf").equals(this.a.getPackageName())) {
             this.a.a();
          }
          if (("1").equals(p0.x())) {
             c.l("received a server ping");
          }else {
             n4.j();
          }
          this.a.b();
       }else if(("SYNC").equals(str)){
          if (("CONF").equals(p0.q())) {
             e0.h().j(y2.m(p0.n()));
          }else if(TextUtils.equals("U", p0.q())){
             h3 oh3 = h3.q(p0.n());
             f2.c(this.a).f(oh3.k(), oh3.t(), new Date(oh3.j()), new Date(oh3.s()), (oh3.x() * 1024), oh3.A());
             p4 op4 = new p4();
             op4.g(i);
             op4.j(p0.b(), "UCA");
             op4.i(p0.x());
             n ta = this.a;
             ta.a(new t(ta, op4));
          }else if(TextUtils.equals("P", p0.q())){
             f3 uof3 = f3.m(p0.n());
             p4 op41 = new p4();
             op41.g(i);
             op41.j(p0.b(), "PCA");
             op41.i(p0.x());
             f3 uof31 = new f3();
             if (uof3.n()) {
                uof31.k(uof3.j());
             }
             op41.l(uof31.h(), on);
             n ta1 = this.a;
             ta1.a(new t(ta1, op41));
             str = "ACK msgP: id = ";
             str2 = p0.x();
             goto label_0319 ;
          }
       }else if(("NOTIFY").equals(p0.b())){
          e3 uoe3 = e3.n(p0.n());
          str = "notify by server err = "+uoe3.q()+" desc = ";
          str2 = uoe3.j();
          goto label_0319 ;
       }
       return;
    }
    public final void e(p5 p0){
       String str = p0.o();
       String str1 = p0.m();
       if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str1)) {
          bg$b uob = bg.c().b(str1, str);
          if (uob != null) {
             b6.j(this.a, uob.a, (long)b6.b(p0.d()), true, true, System.currentTimeMillis());
          }
       }
       return;
    }
    public final void f(p4 p0){
       String str = p0.z();
       String str1 = Integer.toString(p0.a());
       if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str1)) {
          bg$b uob = bg.c().b(str1, str);
          if (uob != null) {
             b6.j(this.a, uob.a, (long)p0.t(), true, true, System.currentTimeMillis());
          }
       }
       return;
    }
}
