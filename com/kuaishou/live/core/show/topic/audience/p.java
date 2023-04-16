package com.kuaishou.live.core.show.topic.audience.p;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;
import com.kuaishou.live.core.show.topic.audience.o;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ql2.o0;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.topic.a;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import io.reactivex.subjects.PublishSubject;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.live.core.show.topic.audience.p$a;
import java.util.Objects;
import ql2.a;
import tx1.d;
import wj2.r0;

public class p implements LiveAudienceTopicDetailRecommendView$b	// class@001212
{
    public final o a;

    public void p(o p0){
       this.a = p0;
       super();
    }
    public void a(UserInfo p0,int p1){
       o p;
       Object obj = this;
       Object obj1 = p0;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, op, "1")) {
          return;
       }
       p = obj.a.p;
       o0 c = p.c;
       String value = p.d.getValue();
       UserInfo mId = obj1.mId;
       o0 a = obj.a.p.a;
       boolean b = p0.isLiving();
       a uoa = a.class;
       int i = 5;
       int i1 = 4;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(c),value,mId,Integer.valueOf(p1),a,Boolean.valueOf(b)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "20")) {
          label_00be :
             if (p0.isLiving()) {
                obj.a.p.i.onNext(obj1.mId);
             }else {
                p = obj.a.p;
                UserProfile userProfile = new UserProfile(obj1);
                LiveStreamClickType uNKNOWN = LiveStreamClickType.UNKNOWN;
                p$a uoa1 = new p$a(obj);
                int i2 = 170;
                Objects.requireNonNull(p);
                c = o0.class;
                if (PatchProxy.isSupport(c)) {
                   Object[] objArray1 = new Object[]{userProfile,uNKNOWN,Integer.valueOf(0),Boolean.TRUE,uoa1,Integer.valueOf(i2)};
                   if (!PatchProxy.applyVoid(objArray1, p, c, "5")) {
                   }
                }else {
                }
             }
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_REFEREAL_AUCHOR";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(c));
       oi3.d("tag_name", value);
       oi3.d("referral_anchor_id", mId);
       oi3.c("index", Integer.valueOf(p1));
       oi3.d("anchor_user_id", r1.U1(a));
       oi3.d("live_stream_id", r1.n1(a));
       oi3.d("server_exp_tag", r1.I1(a));
       oi3.a("is_living", Boolean.valueOf(b));
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       goto label_00be ;
    }
    public void b(UserInfo p0,int p1){
       o p;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "2")) {
          return;
       }
       p = this.a.p;
       o0 c = p.c;
       String value = p.d.getValue();
       UserInfo mId = p0.mId;
       o0 a = this.a.p.a;
       boolean b = p0.isLiving();
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(c),value,mId,Integer.valueOf(p1),a,Boolean.valueOf(b)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "19")) {
          label_00b8 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_REFEREAL_AUCHOR";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(c));
       oi3.d("tag_name", value);
       oi3.d("referral_anchor_id", mId);
       oi3.c("index", Integer.valueOf(p1));
       oi3.d("anchor_user_id", r1.U1(a));
       oi3.d("live_stream_id", r1.n1(a));
       oi3.d("server_exp_tag", r1.I1(a));
       oi3.a("is_living", Boolean.valueOf(b));
       uElementPack.params = oi3.e();
       u1.u0(3, uElementPack, null);
       goto label_00b8 ;
    }
}
