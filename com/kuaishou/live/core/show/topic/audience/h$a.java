package com.kuaishou.live.core.show.topic.audience.h$a;
import com.kuaishou.live.core.show.topic.audience.h$b;
import com.kuaishou.live.core.show.topic.audience.h;
import java.lang.Object;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ql2.k;
import ql2.l;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ql2.r;
import java.lang.Runnable;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ql2.o0;
import com.kuaishou.live.core.show.topic.a;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;

public class h$a implements h$b	// class@001202
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(LiveAudienceTopicDetailHeaderView p0,LiveTopicHeaderInfo p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, str)) {
          return;
       }
       h$a ta = this.a;
       ta.q = p1;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, h.class, "3")) {
          h q = ta.q;
          if (q != null) {
             k ok = new k(ta);
             l ol = new l(ta, p0);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidThreeRefs(q, ok, ol, p0, LiveAudienceTopicDetailHeaderView.class, "1")) {
                p0.B.U(q.mTopicCoverUrls);
                p0.C.post(new r(p0, q));
                p0.D.setText(q.mTopicName);
                p0.E.setText(q.mWatchCountDescription);
                LiveAudienceTopicDetailHeaderView f = p0.F;
                int i = 0;
                int i1 = (q.mNeedShowJoinButton != null)? 0: 8;
                f.setVisibility(i1);
                f = p0.G;
                if (q.mNeedShowFollowButton == null) {
                   i = 8;
                }
                f.setVisibility(i);
                p0.L(q.mIsFollowing);
                p0.K = ok;
                p0.L = ol;
             }
             h q1 = ta.q;
             LiveTopicHeaderInfo mTopicId = q1.mTopicId;
             q = q1.mTopicName;
             LiveTopicHeaderInfo mIsFollowing = q1.mIsFollowing;
             o0 a = ta.p.a;
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(mTopicId), q, Boolean.valueOf(mIsFollowing), a, null, a.class, "15")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "LIVE_TOPIC_CIRCLE_FOLLOW_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("tag_id", Long.valueOf(mTopicId));
                oi3.d("tag_name", q);
                if (mIsFollowing == null) {
                   str = "0";
                }
                oi3.d("type", str);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = x.e(a, 2);
                u1.u0(6, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
}
