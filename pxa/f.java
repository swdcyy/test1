package pxa.f;
import a76.c;
import java.lang.Object;
import o56.a;
import android.content.Context;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;
import android.app.Application;
import qxa.i;
import java.lang.StringBuilder;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ju5.g;
import qxa.j;
import p80.m;
import qxa.g;
import qxa.m;
import qxa.h;
import qxa.k;
import qxa.b;
import qxa.e;
import qxa.c;
import qxa.f;
import qxa.l;
import qxa.d;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qxa.a;

public class f implements c	// class@002216
{
    public final a a;

    public void f(){
       i oi;
       super();
       String str = SystemUtil.r(a.B);
       String packageName = a.B.getPackageName();
       if (packageName.equals(str)) {
          oi = new i();
       }else if(str != null && (str.startsWith(packageName+":") && str.length() > packageName.length())){
          int i = 1;
          str = str.substring((packageName.length() + i));
          Objects.requireNonNull(str);
          switch (str.hashCode()){
              case 0x86afbda2:
                if (str.equals("sogame0")) {
                   i = 0;
                }
                break;
              case 0x86afbda3:
                if (str.equals("sogame1")) {
                }
                break;
              case 0x86afbda4:
                if (str.equals("sogame2")) {
                   i = 2;
                }
                break;
              case 0x86afbda5:
                if (str.equals("sogame3")) {
                   i = 3;
                }
                break;
              case 0x86afbda6:
                if (str.equals("sogame4")) {
                   i = 4;
                }
                break;
              case 0x86afbda7:
                if (str.equals("sogame5")) {
                   i = 5;
                }
                break;
              case 0x9b39ead3:
                if (str.equals("messagesdk")) {
                   i = 6;
                }
                break;
              case 0xc84af846:
                if (str.equals("remote")) {
                   i = 7;
                }
                break;
              case 0xca89cc4e:
                if (str.equals("sogame")) {
                   i = 8;
                }
                break;
              case 0xdbba6cf2:
                if (str.equals("protector")) {
                   i = 9;
                }
                break;
              case 0xe6a207a7:
                if (str.equals("cloudgame")) {
                   i = 10;
                }
                break;
              case 0xf2e635c2:
                if (str.equals("push_v3")) {
                   i = 11;
                }
                break;
              case 2594:
                if (str.equals("QS")) {
                   i = 12;
                }
                break;
              case 0x34af1a:
                if (str.equals("push")) {
                   i = 13;
                }
                break;
              case 0x314a51f1:
                if (str.equals("dpbenchmark")) {
                   i = 14;
                }
                break;
              case 0x3f3c935c:
                if (str.equals("suicide_notification")) {
                   i = 15;
                }
                break;
              case 0x77cdc570:
                if (str.equals("compatibility")) {
                   i = 16;
                }
                break;
              default:
             label_0054 :
                i = -1;
          }
          switch (i){
              case 0:
              case 2:
              case 3:
              case 4:
              case 5:
              case 8:
              case 1:
                oi = new l();
                break;
              case 6:
                oi = new f();
                break;
              case 7:
              case 14:
              case 16:
                oi = new c();
                break;
              case 9:
              case 12:
                oi = new e();
                break;
              case 10:
                oi = new b();
                break;
              case 11:
                oi = new k();
                break;
              case 13:
                oi = new h();
                break;
              case 15:
                oi = new m();
                break;
              default:
                int i1 = 0x6ea0c3d0;
                if (d.a(i1).isAvailable() && d.a(i1).isMiniProcess(a.B)) {
                   oi = new j();
                }else if(d.a(-1717725018).UD(a.B)){
                   oi = new g();
                }
          }
       }
       oi = null;
       if (oi == null) {
          oi = new d();
       }
       this.a = oi;
       return;
    }
    public Collection a(){
       Object obj = PatchProxy.applyWithListener(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(f.class, "1");
       return this.a.d();
    }
    public Object get(){
       return this.a();
    }
}
