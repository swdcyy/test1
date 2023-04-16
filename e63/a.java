package e63.a;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.kuaishou.live.gzone.v2.profile.a;
import java.lang.Object;
import brd.y;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import e63.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;

public final class a implements RefreshLayout$g	// class@00263e
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onRefresh(){
       a tb = this.b;
       tb.p.onNext(new Object());
       a r = tb.r;
       if (r != null) {
          ClientContent$LiveStreamPackage liveStreamPa = r.a();
          int b = y.d(tb.getActivity());
          l1 ol1 = l1.class;
          if (!PatchProxy.isSupport(ol1) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(b), null, ol1, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_WATCH_PROFILE_DOWN_REFRESH";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$ScreenPackage screenPackag = new ClientContent$ScreenPackage();
             b = (b)? 2: 1;
             screenPackag.orientation = b;
             uContentPack.screenPackage = screenPackag;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
