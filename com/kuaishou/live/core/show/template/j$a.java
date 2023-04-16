package com.kuaishou.live.core.show.template.j$a;
import hl2.j;
import com.kuaishou.live.core.show.template.j;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.template.i;
import brd.t;
import java.util.concurrent.TimeUnit;
import hl2.p;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import bp6.a;
import erd.g;
import crd.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import n92.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class j$a implements j	// class@001188
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void a(UserInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "1")) {
          return;
       }
       if (this.a.getActivity() != null && this.a.getActivity() instanceof GifshowActivity) {
          b.d0(LiveLogTag.LIVE_GUEST_ACTIVITY, "follow this user", "user_name", p0.mName, "user_id", p0.mId);
          this.a.X7(t.just(new Object()).delaySubscription(this.a.O, TimeUnit.MILLISECONDS).subscribe(new p(this, p0, i.a), new a()));
          ClientContent$LiveStreamPackage liveStreamPa = this.a.K.Z2.a();
          if (!PatchProxy.applyVoidThreeRefs(liveStreamPa, p0, p1, null, c.class, "2")) {
             u1.u(1, c.b(p1, "KWAI_ACTIVE_FOLLOW_CARD"), c.a(liveStreamPa, p0));
          }
       }
       return;
    }
}
