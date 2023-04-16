package cra.z$b$a;
import android.view.View$OnClickListener;
import android.view.View;
import cra.z$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
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
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;

public final class z$b$a implements View$OnClickListener	// class@002396
{
    public final View b;
    public final z$b c;
    public final c d;

    public void z$b$a(View p0,z$b p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, z$b$a.class, "1")) {
          return;
       }
       z$b c = this.c.c;
       KemDialog9Response mBottomTips = c.mBottomTips;
       int i = 138;
       KemDialog9Response mAmount = c.mAmount;
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       boolean b = mE.isLogined();
       KemDialog9Response mMainButtonT = this.c.c.mMainButtonText;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{mBottomTips,Integer.valueOf(i),mAmount,Boolean.valueOf(b),mMainButtonT};
          if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
          label_008b :
             if (!TextUtils.isEmpty(this.c.c.mJumpUrl)) {
                Intent intent = b.a(0x66dce92a).a(this.b.getContext(), Uri.parse(this.c.c.mJumpUrl));
                if (intent != null) {
                   c.i(this.b.getContext(), intent);
                }
             }
             this.d.q(4);
             PatchProxy.onMethodExit(z$b$a.class, "1");
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 4;
       uElementPack.action2 = "CYCLE_ACTIVITY_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("day", mBottomTips);
       oi3.c("pop_id", Integer.valueOf(i));
       oi3.d("cash_cnt", mAmount);
       oi3.d("button_name", mMainButtonT);
       oi3.a("is_login", Boolean.valueOf(b));
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       goto label_008b ;
    }
}
