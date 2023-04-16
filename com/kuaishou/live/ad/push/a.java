package com.kuaishou.live.ad.push.a;
import erd.g;
import com.kuaishou.live.ad.push.c;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.ad.push.LiveAnchorBuyPushResponse;
import java.util.Objects;
import com.kuaishou.live.ad.push.LiveAnchorBuyPushResponse$LiveAnchorBuyPushRealtimeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.FansTopNoticeBubbleView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fq5.b;
import sr5.b;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import lnc.a1;
import yl0.f;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@0009e9
{
    public final c b;
    public final String c;

    public void a(c p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          LiveAnchorBuyPushResponse$LiveAnchorBuyPushRealtimeInfo mNoticeConte = p0.mPushRealtimeInfo.mNoticeContent;
          if (!PatchProxy.applyVoidOneRefs(mNoticeConte, tb, c.class, "6")) {
             if (tb.s == null) {
                FansTopNoticeBubbleView uFansTopNoti = new FansTopNoticeBubbleView(tb.getContext());
                tb.s = uFansTopNoti;
                uFansTopNoti.setNoticeIconRes(R.drawable.arg_RES_7f08144e);
                if (!tb.p.b().A0().r2(AnchorBizRelation.VOICE_PARTY)) {
                   tb.S8();
                }
                tb.s.setShrinkModeText(a1.p(R.string.arg_RES_7f101da8));
             }
             tb.s.setNoticeText(mNoticeConte);
          }
          k1.s(new f(tb, tc), tb, p0.mPollIntervalMs);
       }
       return;
    }
}
