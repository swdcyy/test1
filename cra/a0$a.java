package cra.a0$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cra.a0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i89.f;
import i89.e;
import com.yxcorp.gifshow.model.response.dialog.KemDialog9Response;
import cra.z;
import brd.t;
import crd.b;
import com.kwai.framework.model.user.QCurrentUser;
import epa.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public final class a0$a implements PopupInterface$h	// class@002372
{
    public final a0 b;

    public void a0$a(a0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       e.a().b(this.b.b.b().mActivityId).subscribe();
       KemDialog9Response kemDialog9Re = this.b.b.b();
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       boolean b = mE.isLogined();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(kemDialog9Re, Integer.valueOf(138), Boolean.valueOf(b), null, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CYCLE_ACTIVITY_POPUP";
          i3 oi3 = i3.f();
          oi3.d("day", kemDialog9Re.mBottomTips);
          oi3.c("pop_id", Integer.valueOf(138));
          oi3.d("cash_cnt", kemDialog9Re.mAmount);
          oi3.a("is_login", Boolean.valueOf(b));
          uElementPack.params = oi3.e();
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.type = 4;
          showEvent.elementPackage = uElementPack;
          u1.u0(4, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
