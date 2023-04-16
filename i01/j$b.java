package i01.j$b;
import x52.a;
import i01.j;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import kg1.i;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import k2b.u1;
import java.util.Objects;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import i01.i;
import i01.f;
import y41.i$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import erd.g;
import y41.i;

public class j$b implements a	// class@0027e3
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.p.Z2.a();
       j$b ta = this.a;
       j x = ta.x;
       String str = ta.p.Z2.d();
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, Boolean.valueOf(x), str, "GIFT_PANEL", null, i.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "JOIN_FANS_GROUP_BUTTON_CLICK";
          i3 oi3 = i3.f();
          oi3.c("is_flash_join", Integer.valueOf(x));
          oi3.d("panel_source", "GIFT_PANEL");
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.imGroupSessionPackage = i.a(str);
          u1.u(true, uElementPack, uContentPack);
       }
       j$b ta1 = this.a;
       Objects.requireNonNull(ta1);
       j oj = j.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta1, oj, "6")) {
          if (!PatchProxy.applyVoid(null, ta1, oj, "9")) {
             oj = ta1.u;
             if (oj != null) {
                oj.yh();
             }
          }
          if (p0.isFollowingOrFollowRequesting()) {
             ta1.X8();
          }else {
             i$a uoa = new i$a(ta1.getActivity(), ta1.p.Z2.getLiveStreamId());
             uoa.o(p0);
             uoa.m(e.j(ta1.p.c));
             uoa.n(136);
             uoa.r(true);
             uoa.j(new i(ta1, p0));
             uoa.i(new f(ta1)).a().c();
          }
       }
       return;
    }
}
