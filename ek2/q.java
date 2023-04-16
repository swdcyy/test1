package ek2.q;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import java.lang.Integer;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoRecommendDialog;
import t02.a0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import ek2.p;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import g9c.a;
import tkd.b;
import tkd.d;
import os5.e;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class q extends c	// class@002759
{
    public QPhoto p;
    public m q;
    public a0 r;
    public BaseFragment s;
    public f t;
    public LiveAudienceStayInfoRecommendDialog u;
    public static String sLivePresenterClassName = "LiveAudienceStayInfoRecommendBaseItemPresenter";

    public void q(){
       super();
    }
    public void P8(){
       Object obj = this;
       String str = "4";
       if (PatchProxy.applyVoid(null, obj, q.class, str)) {
          return;
       }
       String str1 = obj.q.d();
       String liveStreamId = obj.q.getLiveStreamId();
       String userId = obj.p.getUserId();
       String liveStreamId1 = obj.p.getLiveStreamId();
       String serverExpTag = obj.p.getServerExpTag();
       int i = 1;
       long l = (long)(obj.t.get().intValue() + i);
       int i1 = obj.u.a().a();
       int i2 = obj.u.a().c();
       a0 l1 = obj.r.l;
       FeedLogCtx feedLogCtx = obj.p.getFeedLogCtx();
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = str1;
          objArray[i] = liveStreamId;
          objArray[2] = userId;
          objArray[3] = liveStreamId1;
          objArray[4] = serverExpTag;
          objArray[5] = Long.valueOf(l);
          objArray[6] = Integer.valueOf(i1);
          objArray[7] = Integer.valueOf(i2);
          objArray[8] = Integer.valueOf(l1);
          objArray[9] = feedLogCtx;
          if (PatchProxy.applyVoid(objArray, null, p.class, str)) {
          label_0104 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMENDED_LIVE_CARD";
       i3 oi3 = i3.f();
       oi3.d("anchor_user_id", str1);
       oi3.d("live_stream_id", liveStreamId);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.id = String.valueOf(i1);
       uContentPack.moreInfoPackage.type = String.valueOf(i2);
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = userId;
       liveStreamPa.liveStreamId = liveStreamId1;
       liveStreamPa.serverExpTag = serverExpTag;
       liveStreamPa.showIndexPlusOne = l;
       liveStreamPa.sourceTypeNew = l1;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(feedLogCtx));
       goto label_0104 ;
    }
    public void R8(){
       Object obj = this;
       String str = "3";
       if (PatchProxy.applyVoid(null, obj, q.class, str)) {
          return;
       }
       String str1 = obj.q.d();
       String liveStreamId = obj.q.getLiveStreamId();
       String userId = obj.p.getUserId();
       String liveStreamId1 = obj.p.getLiveStreamId();
       String serverExpTag = obj.p.getServerExpTag();
       int i = 1;
       long l = (long)(obj.t.get().intValue() + i);
       int i1 = obj.u.a().a();
       int i2 = obj.u.a().c();
       a0 l1 = obj.r.l;
       FeedLogCtx feedLogCtx = obj.p.getFeedLogCtx();
       if (PatchProxy.isSupport(p.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = str1;
          objArray[i] = liveStreamId;
          objArray[2] = userId;
          objArray[3] = liveStreamId1;
          objArray[4] = serverExpTag;
          objArray[5] = Long.valueOf(l);
          objArray[6] = Integer.valueOf(i1);
          objArray[7] = Integer.valueOf(i2);
          objArray[8] = Integer.valueOf(l1);
          objArray[9] = feedLogCtx;
          if (PatchProxy.applyVoid(objArray, null, p.class, str)) {
          label_00fe :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMENDED_LIVE_CARD";
       i3 oi3 = i3.f();
       oi3.d("anchor_user_id", str1);
       oi3.d("live_stream_id", liveStreamId);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       uContentPack.moreInfoPackage = moreInfoPack;
       moreInfoPack.id = String.valueOf(i1);
       uContentPack.moreInfoPackage.type = String.valueOf(i2);
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       liveStreamPa.anchorUserId = userId;
       liveStreamPa.liveStreamId = liveStreamId1;
       liveStreamPa.serverExpTag = serverExpTag;
       liveStreamPa.showIndexPlusOne = l;
       liveStreamPa.sourceTypeNew = l1;
       u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(feedLogCtx));
       goto label_00fe ;
    }
    public void S8(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "2")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       oq = this.u;
       Objects.requireNonNull(oq);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, oq, LiveAudienceStayInfoRecommendDialog.class, "8");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          LiveAudienceStayInfoRecommendDialog k = oq.k;
          if (k != null) {
             objArray = k.Q0();
          }
       }
       if (objArray == null) {
          return;
       }else {
          LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
          uob.o(p0);
          uob.n(0);
          uob.w(objArray);
          uob.C(this.p);
          d.a(-1835681758).b1(this.getActivity(), uob.a());
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("BASIC_CONTEXT");
       this.r = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.s = this.r8("LIVE_SQUARE_SLIDE_BAR_FRAGMENT");
       this.t = this.x8("ADAPTER_POSITION");
       this.u = this.r8("LIVE_SQUARE_SLIDE_BAR_NOTICE_DIALOG");
       return;
    }
}
