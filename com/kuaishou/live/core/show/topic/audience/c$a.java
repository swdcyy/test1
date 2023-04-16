package com.kuaishou.live.core.show.topic.audience.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql2.o0;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.show.topic.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class c$a extends m	// class@0011fa
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c p = this.c.p;
       o0 c = p.c;
       String value = p.d.getValue();
       c$a tc = this.c;
       o0 a = tc.p.a;
       QPhoto qPhoto = tc.q.mEntity;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(c), value, a, qPhoto, null, a.class, "11")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_LIVE_CARD";
          i3 oi3 = i3.f();
          oi3.c("tag_id", Long.valueOf(c));
          oi3.d("tag_name", value);
          oi3.d("anchor_user_id", r1.U1(a));
          oi3.d("live_stream_id", r1.n1(a));
          oi3.d("server_exp_tag", r1.I1(a));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = x.e(qPhoto, 2);
          u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(qPhoto)));
       }
       this.c.P8(188);
       return;
    }
}
