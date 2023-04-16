package com.kuaishou.live.core.show.conditionredpacket.grab.base.i$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import b62.n;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import j62.a;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import p91.m;
import u52.t;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import com.kwai.framework.model.user.User;
import t02.a0;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import y41.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u52.u;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import xp5.i;
import tw1.d;

public class i$a extends m	// class@000a89
{
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       LiveConditionRedPacketInfo b;
       ClientEvent$ElementPackage uElementPack;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       i$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, i.class, "10")) {
          n on = new n(tc);
          LiveFollowExtParams$a uoa = new LiveFollowExtParams$a();
          uoa.e(tc.q.b);
          uoa.f(tc.q.a);
          LiveFollowExtParams liveFollowEx = uoa.a();
          if (!tc.C.e() && (tc.p.g != null && tc.getActivity() instanceof GifshowActivity)) {
             i$a uoa1 = new i$a(tc.getActivity(), tc.C.getLiveStreamId());
             uoa1.o(tc.C.I());
             uoa1.m(e.j(tc.p.g.c));
             uoa1.n(tc.S8());
             uoa1.r(1);
             uoa1.g(liveFollowEx);
             uoa1.e(on);
             uoa1.f(b.c(tc.C.r5().mEntity));
             uoa1.a().c();
             BaseFragment uBaseFragmen = tc.C.b();
             ClientContent$LiveStreamPackage liveStreamPa1 = tc.C.a();
             i q = tc.q;
             a b1 = q.b;
             switch (q.a){
                 case 14:
                   i = 9;
                   break;
                 case 15:
                   i = 2;
                   break;
                 case 16:
                   i = 10;
                   break;
                 default:
                   i = 0;
             }
             if (!PatchProxy.isSupport(u.class) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, liveStreamPa1, b1, Integer.valueOf(i), null, u.class, "12")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RED_PACK_PANEL_FOLLOW_BUTTON";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa1;
                ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
                redPackPacka.redPackId = b1;
                redPackPacka.redPackType = i;
                uContentPack.redPackage = redPackPacka;
                u1.L("", uBaseFragmen, 1, uElementPack, uContentPack);
             }
          }
       }
       tc = this.c;
       i d = tc.D;
       if (d != null && d.b == 39) {
          e0 page = tc.p.h.getPage();
          ClientContent$LiveStreamPackage liveStreamPa = this.c.p.h.a();
          i d1 = this.c.D;
          LiveConditionRedPacketInfo c = d1.c;
          b = d1.b;
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(page, liveStreamPa, c, Integer.valueOf(b), null, d.class, "15")) {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RED_PACK_PANEL_FOLLOW_BUTTON";
             u1.L("", page, 1, uElementPack, d.a(liveStreamPa, c, b));
          }
       }
       return;
    }
}
