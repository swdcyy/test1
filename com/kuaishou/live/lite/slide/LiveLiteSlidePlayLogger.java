package com.kuaishou.live.lite.slide.LiveLiteSlidePlayLogger;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.yxcorp.gifshow.log.d0;
import k2b.g3;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import q2b.h$b;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.slide.b;
import com.kuaishou.live.lite.slide.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.log.model.CommonParams;
import id3.g;
import kp.r1;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;

public class LiveLiteSlidePlayLogger extends SlidePlayLogger	// class@000b55
{
    public int mIndexInAdapter;
    public static final long serialVersionUID = 0x39d7e1abdccf0055;

    public void LiveLiteSlidePlayLogger(){
       super();
    }
    public static ClientContent$PhotoPackage a(QPhoto p0,int p1){
       ClientContent$PhotoPackage obj;
       if (PatchProxy.isSupport(LiveLiteSlidePlayLogger.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveLiteSlidePlayLogger.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = (p0 != null)? p0.mEntity: null;
       if (PatchProxy.isSupport(LiveLiteSlidePlayLogger.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveLiteSlidePlayLogger.class, "4");
          if (obj != PatchProxyResult.class) {
          }else if(p0 == null){
             obj = new ClientContent$PhotoPackage();
          }else {
             p1++;
             obj = w1.g(p0, p1);
             obj.type = 2;
             obj.index = (long)p1;
          }
       }else {
          goto label_003b ;
       }
       return obj;
    }
    public ClientEvent$ExpTagTrans buildExpTagTrans(QLivePlayConfig p0){
       ClientEvent$ExpTagTrans obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSlidePlayLogger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new ClientEvent$ExpTagTrans();
       obj.serverExpTag = TextUtils.I(p0.mServerExpTag);
       obj.clientExpTag = TextUtils.I(this.mClientExpTag);
       return obj;
    }
    public void logShowEvent(e0 p0,QPhoto p1,int p2,String p3,int p4,ClientEvent$ExpTagTransList p5,String p6){
       int i5;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       object oobject2 = p3;
       object oobject3 = p6;
       int i1 = 5;
       int i2 = 7;
       int i3 = 3;
       int i4 = 2;
       if (PatchProxy.isSupport(LiveLiteSlidePlayLogger.class)) {
          Object[] objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i4] = Integer.valueOf(p2);
          objArray[i3] = oobject2;
          objArray[4] = Integer.valueOf(p4);
          objArray[i1] = p5;
          objArray[6] = oobject3;
          if (PatchProxy.applyVoid(objArray, obj, LiveLiteSlidePlayLogger.class, "8")) {
             return;
          }
       }
       if (p1.isShowed()) {
          return;
       }else {
          oobject1.setShowed(1);
          if (i == 1) {
             i5 = 2;
          }else if(i == i4){
             i5 = 3;
          }else {
             i5 = 5;
          }
          BaseFeed entity = p1.getEntity();
          String str = (p4 == 1)? "FEATURED_PAGE": "THANOS_FIND";
          d0 uod0 = d0.g(entity, i5, str, p5, false, true, 3);
          g3.c();
          i3 oi3 = i3.f();
          oi3.c("session_index", Integer.valueOf(g3.a()));
          oi3.c("live_stream_session_gap", Integer.valueOf(g3.b()));
          g3.d();
          uod0.c(oi3.e());
          c0.q().n(uod0);
          if (!PatchProxy.applyVoidTwoRefs(oobject1, oobject, obj, LiveLiteSlidePlayLogger.class, "9")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "SHOW_PHOTO";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.g(oobject1.mEntity, (p1.getPosition() + 1));
             uContentPack.liveStreamPackage = x.e(oobject1.mEntity, 1);
             u1.B0(new ShowMetaData().setLogPage(oobject).setType(i3).setElementPackage(uElementPack1).setContentPackage(uContentPack).setFeedLogCtx(p1.getFeedLogCtx()));
          }
          if (!PatchProxy.applyVoidThreeRefs(p1, p0, p6, this, LiveLiteSlidePlayLogger.class, "10")) {
             i = x.n(oobject1.mEntity);
             if (i != 100) {
                i2 = 8;
             }
             h$b uob = h$b.e(i2, "RERANK_RESULT");
             super();
             this.liveStreamPackage = x.e(oobject1.mEntity, 1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RERANK_RESULT";
             oi3 = i3.f();
             oi3.c("fail_reason", Integer.valueOf(i));
             oi3.d("live_style", "LITE");
             oi3.d("livePlayBizSessionId", oobject3);
             uElementPack.params = oi3.e();
             uob.k(uElementPack);
             uob.h(this);
             uob.l(p1.getFeedLogCtx());
             u1.p0(null, oobject, uob);
          }
          RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
          QPhoto mEntity = oobject1.mEntity;
          if (mEntity instanceof LiveStreamFeed) {
             uExtParams.mHyperTagRecoLogInfo = k0.b(mEntity.mLiveStreamModel, b.a, a.a).orNull();
          }
          c.e(oobject2, 15, oobject1.mEntity, uExtParams);
          return;
       }
    }
    public void onButtonClicked(BaseFeed p0,String p1,int p2,int p3,int p4,int p5,String p6,CommonParams p7){
       String str;
       if (PatchProxy.isSupport(LiveLiteSlidePlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,p7};
          if (PatchProxy.applyVoid(objArray, this, LiveLiteSlidePlayLogger.class, "1")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p1;
       uElementPack.type = p2;
       uElementPack.status = 0;
       uElementPack.action = p5;
       QPhoto qPhoto = null;
       if (p0 instanceof LiveStreamFeed) {
          qPhoto = new QPhoto(p0);
       }
       if (p4 == 1) {
          str = "up";
       }else if(p4 == 2){
          str = "down";
       }else {
          str = "";
       }
       i3 oi3 = i3.f();
       oi3.d("swipe_gestures", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = PatchProxy.applyOneRefs(qPhoto, this, LiveLiteSlidePlayLogger.class, "7");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = new ClientContent$ContentPackage();
          if (qPhoto != null) {
             uContentPack.liveStreamPackage = g.a(qPhoto.mEntity, 1);
          }
          ClientContent$PhotoPackage photoPackage1 = (qPhoto != null)? w1.g(qPhoto.mEntity, 0): new ClientContent$PhotoPackage();
          photoPackage1.type = 2;
          uContentPack.photoPackage = photoPackage1;
       }
       ClientContent$ContentPackage photoPackage = uContentPack.photoPackage;
       if (photoPackage != null && p0 != null) {
          photoPackage.index = (long)(r1.y1(p0) + 1);
       }
       u1.x(p3, "", p4, uElementPack, uContentPack);
       return;
    }
    public ClientContent$ContentPackage onEnterLivePage(QPhoto p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSlidePlayLogger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = LiveLiteSlidePlayLogger.a(p0, this.mIndexInAdapter);
       if (p0 != null) {
          obj.liveStreamPackage = g.a(p0.mEntity, 1);
       }
       CharSequence uCharSequenc = (p0 == null)? null: p0.getKsOrderId();
       if (!TextUtils.x(uCharSequenc)) {
          obj.ksOrderInfoPackage = l0.a(uCharSequenc);
       }
       return obj;
    }
    public ClientContent$ContentPackage onExitLivePage(QPhoto p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSlidePlayLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = LiveLiteSlidePlayLogger.a(p0, this.mIndexInAdapter);
       CharSequence uCharSequenc = (p0 == null)? null: p0.getKsOrderId();
       if (!TextUtils.x(uCharSequenc)) {
          obj.ksOrderInfoPackage = l0.a(uCharSequenc);
       }
       return obj;
    }
    public void setIndexInAdapter(int p0){
       this.mIndexInAdapter = p0;
    }
    public void setLeaveAction(int p0){
    }
}
