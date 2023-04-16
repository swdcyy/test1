package ab0.u;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import ab0.t;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ekd.k1;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.System;
import crd.b;
import tkd.b;
import tkd.d;
import gx5.d;
import brd.t;
import ab0.u$a;
import ab0.u$b;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class u implements SlipSwitchButton$b	// class@000056
{
    public final t a;

    public void u(t p0){
       this.a = p0;
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ou, "1")) {
          return;
       }
       if (k1.t(this.a.x) - 1000 < 0) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          t.P8(this.a).g(qCurrentUser.isEnableLocalIntelligenceAlbum(), false, false);
          return;
       }else {
          p0.x = System.currentTimeMillis();
          t w = this.a.w;
          if (w != null) {
             w.dispose();
          }
          w.w = d.a(-1188553266).jg("enable_local_intelligence_album", p1).subscribe(new u$a(p1), new u$b(this, p1));
          u ta = this.a;
          t w1 = ta.w;
          if (w1 != null) {
             ta.X7(w1);
          }
          return;
       }
    }
}
