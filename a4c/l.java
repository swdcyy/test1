package a4c.l;
import android.view.View$OnClickListener;
import a4c.m;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import y3c.y;
import s1c.r0;
import java.util.Objects;
import y3c.y$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class l implements View$OnClickListener	// class@000077
{
    public final m b;
    public final String c;

    public void l(m p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       l tb = this.b;
       c.i(tb.getActivity(), KwaiWebViewActivity.N3(tb.getActivity(), this.c).a());
       y$a a = y.a;
       r0 b = tb.r.b;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(b, a, y$a.class, "2")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MUSICIAN_CENTER_ENTER";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (b != null) {
             uContentPack.profilePackage = a.c(b);
          }
          u1.H("", 1, uElementPack, uContentPack, new ClientContentWrapper$ContentWrapper());
       }
       return;
    }
}
