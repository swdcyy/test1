package djc.t0$a;
import android.view.View$OnClickListener;
import djc.t0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import djc.s0;
import java.lang.CharSequence;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class t0$a implements View$OnClickListener	// class@002220
{
    public final t0 b;
    public final View c;

    public void t0$a(t0 p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t0$a.class, "1")) {
          return;
       }
       t0$a uoa = (this.b.a().a().length() > 0)? 1: null;
       if (uoa) {
          KwaiYodaWebViewActivity.L3(this.b.b.getActivity(), this.b.a().a());
          uoa = this.b;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, t0.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHARE_DATA_REWARD_BANNER";
             u1.u(1, uElementPack, null);
          }
       }
       PatchProxy.onMethodExit(t0$a.class, "1");
       return;
    }
}
