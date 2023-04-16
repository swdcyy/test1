package a72.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.divertpush.c;
import com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import os5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import a72.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements View$OnClickListener	// class@000071
{
    public final c b;
    public final SCLiveActivityPushV2 c;

    public void a(c p0,SCLiveActivityPushV2 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(tc, tb, uoc, "10")) {
       }else {
          b.Z(LiveLogTag.LIVE_BROADCAST_BANNER, "Click divert push v2:"+tc);
          if (!TextUtils.n(tc.targetLiveStreamId, r1.n1(tb.L.mEntity))) {
             e uoe = d.a(-1835681758);
             GifshowActivity activity = tb.getActivity();
             LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
             uob.q(tc.targetLiveStreamId);
             uob.v("/rest/n/live/feed/innerPush/slide/more");
             uob.d(true);
             LivePassThruParamExtraInfo livePassThru = PatchProxy.applyOneRefs(tc, tb, uoc, "11");
             if (livePassThru != PatchProxyResult.class) {
             }else {
                livePassThru = new LivePassThruParamExtraInfo();
                livePassThru.mLivePathExtraInfo = tc.extraInfo;
             }
             uob.h(livePassThru);
             uob.o(105);
             uob.D(tc.targetLiveStreamId);
             uoe.eO(activity, uob.a(), 1025);
             ClientContent$LiveStreamPackage liveStreamPa = tb.O.a();
             if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tc, null, g.class, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_PUSH_POPUP";
                u1.u(true, uElementPack, g.a(liveStreamPa, tc));
             }
          }
       }
       return;
    }
}
