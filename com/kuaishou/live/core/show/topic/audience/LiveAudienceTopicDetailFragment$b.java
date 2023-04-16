package com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql2.o0;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.topic.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LiveAudienceTopicDetailFragment$b extends m	// class@0011ee
{
    public final LiveAudienceTopicDetailFragment c;

    public void LiveAudienceTopicDetailFragment$b(LiveAudienceTopicDetailFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceTopicDetailFragment$b.class, "1")) {
          return;
       }
       this.c.F.e.onNext(Boolean.TRUE);
       LiveAudienceTopicDetailFragment f = this.c.F;
       o0 c = f.c;
       String value = f.d.getValue();
       o0 a = this.c.F.a;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(c), value, a, null, a.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_MORE_TOPIC";
          i3 oi3 = i3.f();
          oi3.c("tag_id", Long.valueOf(c));
          oi3.d("tag_name", value);
          oi3.d("anchor_user_id", r1.U1(a));
          oi3.d("live_stream_id", r1.n1(a));
          oi3.d("server_exp_tag", r1.I1(a));
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
