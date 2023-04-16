package com.yxcorp.gifshow.follow.init.plugin.live.a$a;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$a;
import com.yxcorp.gifshow.follow.init.plugin.live.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import oha.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public class a$a implements LiveCoverAnnexHelper$a	// class@0010e2
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.m8().performLongClick();
       return;
    }
    public void b(LiveCoverAnnex p0){
       CommonMeta mTransientCo;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       LiveCoverAnnex mExtraInfo = p0.mExtraInfo;
       if (mExtraInfo != null) {
          String str = mExtraInfo.get("logInfo");
          a c1 = this.a.c1;
          if (TextUtils.x(str)) {
             str = "";
          }
          c1.mTransientCommodityType = str;
          a$a ta = this.a;
          c1 = ta.c1;
          c1.mIsClickCommodityCard = true;
          c1.mCommodityJumpUrl = p0.mJumpUrl;
          mTransientCo = c1.mTransientCommodityType;
          HomeLiveAutoPlayPresenter s = ta.s;
          HomeLiveAutoPlayPresenter r = ta.r;
          if (!PatchProxy.applyVoidThreeRefs(mTransientCo, s, r, null, t.class, "6")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$PhotoPackage photoPackage = w1.f(r.mEntity);
             uContentPack.photoPackage = photoPackage;
             photoPackage.identity = r1.t1(r.getEntity());
             uContentPack.photoPackage.expTag = r1.M0(r.getEntity());
             ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             liveStreamPa.liveStreamId = r1.n1(r.getEntity());
             uContentPack.liveStreamPackage.serverExpTag = r1.I1(r.getEntity());
             uContentPack.liveStreamPackage.anchorUserId = r1.U1(r.getEntity());
             i3 oi3 = i3.f();
             oi3.d("merchant_card_type", mTransientCo);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_COVER_CARD";
             uElementPack.params = TextUtils.k(oi3.e());
             u1.B(new ClickMetaData().setLogPage(s).setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r.getFeedLogCtx()));
          }
       }
       this.a.m8().performClick();
       mTransientCo.mIsClickCommodityCard = false;
       return;
    }
}
