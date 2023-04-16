package eja.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import dha.l;
import eja.t0$a;
import kga.c;
import erd.g;
import crd.b;
import lga.a;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout;

public final class t0 extends PresenterV2	// class@0026f9
{
    public RefreshLayout p;
    public l q;

    public void t0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "6")) {
          return;
       }
       t0 tq = this.q;
       if (tq == null) {
          a.S("mUserLoginState");
       }
       this.X7(tq.b().subscribe(new t0$a(this), c.a));
       if (a.a()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             tq = this.p;
             if (tq == null) {
                a.S("mRefreshLayout");
             }
             tq.setEnabled(false);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       Object obj = this.q8(RefreshLayout.class);
       a.o(obj, "inject\(RefreshLayout::class.java\)");
       this.p = obj;
       obj = this.r8("FOLLOW_FEEDS_STATE_USER_LOGIN");
       a.o(obj, "inject\(FollowAccessIds.F¡­W_FEEDS_STATE_USER_LOGIN\)");
       this.q = obj;
       return;
    }
}
