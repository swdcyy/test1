package com.yxcorp.gifshow.action.c;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.events.realaction.RealAction;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import yv8.e;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.action.a;
import crd.b;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import com.kwai.robust.PatchProxyResult;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import yp.x;
import lnc.o5;
import com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kuaishou.android.model.mix.w;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import java.util.List;
import com.yxcorp.gifshow.log.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import f3b.o;
import java.lang.CharSequence;
import com.yxcorp.gifshow.action.b;

public class c	// class@001311
{
    public static FeedRealActionsBizConfig a;

    public void c(){
       super();
    }
    public static void a(int p0,BaseFeed p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoc, "1")) {
          return;
       }
       RealAction realAction = new RealAction(p0, p1);
       c.c(realAction);
       a.d().k(realAction);
       RxBus.f.b(realAction);
       return;
    }
    public static void b(int p0,BaseFeed p1,RealAction$ExtParams p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, c.class, "4")) {
          return;
       }
       RealAction realAction = new RealAction(p0, p1, p2);
       c.c(realAction);
       RxBus.f.b(realAction);
       return;
    }
    public static void c(RealAction p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "6")) {
          return;
       }
       t.fromCallable(new e(p0)).subscribeOn(d.c).subscribe(Functions.d(), a.b);
       return;
    }
    public static void d(String p0,int p1,BaseFeed p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, c.class, "2")) {
          return;
       }
       RealAction realAction = new RealAction(p0, p1, p2);
       c.c(realAction);
       RxBus.f.b(realAction);
       return;
    }
    public static void e(String p0,int p1,BaseFeed p2,RealAction$ExtParams p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, c.class, "3")) {
          return;
       }
       RealAction realAction = new RealAction(p0, p1, p2, p3);
       c.c(realAction);
       RxBus.f.b(realAction);
       return;
    }
    public static void f(String p0,int p1,BaseFeed p2,String p3,RealAction$ExtParams p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoc, "5")) {
             return;
          }
       }
       RealAction realAction = new RealAction(p0, p1, p2, p3, p4);
       c.c(uoc);
       RxBus.f.b(uoc);
       return;
    }
    public static RealActionFeed g(RealAction p0){
       RealActionFeed obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RealActionFeed();
       obj.mPage = p0.mPage;
       obj.mSource = p0.mSource;
       obj.mActionType = p0.mActionType;
       obj.mSubBizTag = TextUtils.k(r1.D1(p0.mFeed));
       obj.mLiveStreamBizType = x.l(p0.mFeed);
       RealAction mFeed = p0.mFeed;
       if (mFeed != null) {
          obj.mFeedId = TextUtils.k(mFeed.getId());
          if (r1.S2(p0.mFeed)) {
             obj.mAutoPlayWeight = r1.k1(p0.mFeed);
          }
          obj.mFeedType = c.h(p0.mFeed);
          obj.mAuthorId = o5.c(r1.U1(p0.mFeed));
          obj.mLlsid = TextUtils.k(r1.h1(p0.mFeed));
          obj.mFeedStreamType = r1.P0(p0.mFeed);
          RealActionFeed$RealActionExtParams realActionEx = new RealActionFeed$RealActionExtParams();
          RealAction mExtParams = p0.mExtParams;
          if (mExtParams != null) {
             realActionEx.mTimestamp = mExtParams.mTimestamp;
             RealAction$ExtParams mSharePanelE = mExtParams.mSharePanelElement;
             if (mSharePanelE != null) {
                realActionEx.mShareId = TextUtils.k(mSharePanelE.mId);
             }
             realActionEx.mActualPlayDuration = p0.mExtParams.mActualPlayDuration;
             realActionEx.mClientExpTag = TextUtils.k(r1.M0(p0.mFeed));
             mExtParams = p0.mExtParams;
             realActionEx.mCommentStayDuration = mExtParams.mCommentStayDuration;
             realActionEx.mHasReported = mExtParams.mHasReported;
             realActionEx.mIsBigCard = mExtParams.mIsBigCard;
             realActionEx.mNegativeType = mExtParams.mNegativeType;
             realActionEx.mNegativeDetailType = mExtParams.mNegativeDetailType;
             realActionEx.mRequestParams = mExtParams.mRequestParams;
             realActionEx.mTotalSendGiftPrice = mExtParams.mTotalSendGiftPrice;
             realActionEx.mHyperTagRecoLogInfo = mExtParams.mHyperTagRecoLogInfo;
             realActionEx.mIsPrefetch = mExtParams.mIsPrefetch;
             realActionEx.mIsFromCache = w.r0(p0.mFeed);
             realActionEx.mBizExtraParam = p0.mExtParams.mBizExtraParam;
          }
          obj.mExtParams = realActionEx;
       }
       return obj;
    }
    public static int h(BaseFeed p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new QPhoto(p0);
       CommonMeta uCommonMeta = null;
       if (obj.isVideoType() || obj.isImageType()) {
          uCommonMeta = 1;
       }else if(obj.isLiveStream()){
          uCommonMeta = 2;
       }else if(r1.c2(p0)){
          uCommonMeta = r1.w0(p0).mType;
       }
       return uCommonMeta;
    }
    public static String i(int p0){
       String obj;
       ClientEvent$UrlPackage page2;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       b uob = b.a(0x4b316083).l0();
       if (uob != null) {
          List list = uob.e();
          while (p0 > 0) {
             if (list.size() >= p0) {
                int i = list.size() - p0;
                page2 = list.get(i).C().page2;
                if (TextUtils.n(page2, o.i(46))) {
                }
             }
             p0--;
          }
       }
       return page2;
    }
    public static synchronized void j(){
       _monitor_enter(c.class);
       if (PatchProxy.applyVoid(null, null, c.class, "10")) {
          _monitor_exit(c.class);
          return;
       }else {
          t.fromCallable(b.b).subscribeOn(d.c).subscribe(Functions.d(), Functions.d());
          _monitor_exit(c.class);
          return;
       }
    }
}
