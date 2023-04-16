package b53.k;
import a71.a;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import b53.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import java.lang.Number;
import e17.i;
import pm8.a;
import android.content.SharedPreferences;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import b53.e;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class k implements a	// class@000314
{
    public final h a;

    public void k(h p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       h g;
       e obj;
       int i1;
       s b;
       int i2;
       int i3;
       k ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, h.class, "18")) {
       }else {
          String str = 0x7f11066a;
          int i = 2;
          if (ta.s.l()) {
             g = ta.G;
             Objects.requireNonNull(g);
             obj = PatchProxy.apply(objArray, g, os, "2");
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                b = g.b;
                if (b != 1) {
                   if (b != i) {
                      i1 = 0x7f1023f7;
                      i2 = 1;
                   }else {
                      i1 = 0x7f1023f5;
                      i2 = 0;
                   }
                }else {
                   i1 = 0x7f1023f6;
                   i2 = 2;
                }
                i.a(str, i1);
                g.e(i2);
                g.g();
             label_0055 :
                i1 = i2;
             }
          }else {
             g = ta.G;
             Objects.requireNonNull(g);
             s obj1 = PatchProxy.apply(objArray, g, os, "3");
             if (obj1 != patchProxyRe) {
                i1 = obj1.intValue();
             }else if(g.c == null){
                g.c = a.a.getInt("live_open_barrage_setting_area_model", -1);
             }
             b = g.b;
             if (b == null) {
                obj1 = g.c;
                if (obj1 == null) {
                   i2 = 1;
                }
                i3 = 0x7f101eb0;
             }else {
                i3 = 0x7f101eaf;
                i2 = 0;
             }
             g.c = b;
             i.a(str, i3);
             g.e(obj1);
             g.g();
             goto label_0055 ;
          }
          ClientContent$LiveStreamPackage liveStreamPa = ta.s.Z2.a();
          obj = e.class;
          if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), liveStreamPa, objArray, obj, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHORTCUT_BULLET_SCREEN_BUTTON";
             i3 oi3 = i3.f();
             if (i1 != 1) {
                i = (i1 != i)? 3: 1;
             }
          label_00c9 :
             oi3.c("setting_state", Integer.valueOf(i));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return false;
    }
}
