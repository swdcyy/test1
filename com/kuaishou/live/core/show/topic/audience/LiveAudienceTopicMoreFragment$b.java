package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicMoreFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import y8c.g;
import java.util.List;
import g9c.a;
import com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo;
import t02.a0;
import ql2.o0;
import fq5.b;
import p91.m;
import com.kuaishou.live.core.show.topic.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LiveAudienceTopicMoreFragment$b extends RecyclerView$r	// class@0011f6
{
    public final LiveAudienceTopicMoreFragment a;

    public void LiveAudienceTopicMoreFragment$b(LiveAudienceTopicMoreFragment p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAudienceTopicMoreFragment$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveAudienceTopicMoreFragment$b.class, "1")) {
          return;
       }
       LiveAudienceTopicMoreFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveAudienceTopicMoreFragment.class, "8")) {
          p1 = ta.h0().getLayoutManager().i0();
          int i = ta.h0().getLayoutManager().c();
          if (ta.g7().Q0().size() >= i) {
             while (p1 <= i) {
                LiveTopicItemInfo liveTopicIte = ta.g7().N0(p1);
                if (liveTopicIte != null && liveTopicIte.mHasShown == null) {
                   liveTopicIte.mHasShown = true;
                   m om = ta.F.o0().b();
                   String str = om.d();
                   String liveStreamId = om.getLiveStreamId();
                   String str1 = om.t();
                   if (!PatchProxy.applyVoidFourRefs(str, liveStreamId, str1, liveTopicIte, null, a.class, "17")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_TOPIC_ITEM";
                      i3 oi3 = i3.f();
                      oi3.c("tag_id", Long.valueOf(liveTopicIte.mTopicId));
                      oi3.d("tag_name", liveTopicIte.mTopicName);
                      oi3.d("audience_number", liveTopicIte.mWatchCountDescription);
                      oi3.d("anchor_user_id", str);
                      oi3.d("live_stream_id", liveStreamId);
                      oi3.d("server_exp_tag", str1);
                      uElementPack.params = oi3.e();
                      u1.u0(3, uElementPack, null);
                   }
                }
                p1++;
             }
          }
       }
       return;
    }
}
