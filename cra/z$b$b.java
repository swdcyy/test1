package cra.z$b$b;
import android.view.View$OnClickListener;
import cra.z$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemDialog9Response;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import epa.a;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class z$b$b implements View$OnClickListener	// class@002397
{
    public final z$b b;
    public final c c;

    public void z$b$b(z$b p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, z$b$b.class, "1")) {
          return;
       }
       this.c.q(3);
       z$b c = this.b.c;
       KemDialog9Response mBottomTips = c.mBottomTips;
       KemDialog9Response mAmount = c.mAmount;
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       boolean b = mE.isLogined();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(mBottomTips, Integer.valueOf(138), mAmount, Boolean.valueOf(b), null, a.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_CYCLE_ACTIVITY_POPUP";
          i3 oi3 = i3.f();
          oi3.d("day", mBottomTips);
          oi3.c("pop_id", Integer.valueOf(138));
          oi3.d("cash_cnt", mAmount);
          oi3.a("is_login", Boolean.valueOf(b));
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, null);
       }
       PatchProxy.onMethodExit(z$b$b.class, "1");
       return;
    }
}
