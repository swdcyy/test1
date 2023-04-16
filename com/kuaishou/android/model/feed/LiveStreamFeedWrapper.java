package com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import im8.g;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.d0;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.Number;
import com.kuaishou.android.model.feed.c0;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.kuaishou.android.model.feed.v;
import com.kuaishou.android.model.feed.b0;
import com.kuaishou.android.model.feed.a0;
import com.kuaishou.android.model.feed.u;
import com.kuaishou.android.live.model.LiveStreamModel$Live;
import java.lang.Enum;
import com.kuaishou.android.model.feed.t;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import yp.i0;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import wkd.b;
import ip.b;
import com.kuaishou.android.model.feed.y;
import java.util.List;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import com.kuaishou.android.live.model.LiveStreamModel$QuizLive;
import com.kuaishou.android.model.feed.x;
import com.kuaishou.android.model.feed.PhotoType;
import com.kwai.framework.model.user.User;
import kp.l1;
import com.kuaishou.android.model.feed.e0;
import com.kuaishou.android.model.feed.z;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import zp.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.feed.w;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import yp.b0;
import yp.g0;
import yp.y;
import yp.c0;
import yp.a0;
import yp.d0;
import yp.e0;
import yp.h0;
import yp.z;
import yp.f0;
import brd.t;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import erd.g;
import yl8.b;

public class LiveStreamFeedWrapper extends DefaultSyncable implements g	// class@000b17
{
    public LiveStreamFeed mEntity;
    public static final long serialVersionUID = 0xfe3644cad426d7a1;

    public void LiveStreamFeedWrapper(){
       super();
    }
    public void LiveStreamFeedWrapper(LiveStreamFeed p0){
       super();
       this.mEntity = p0;
    }
    public static Integer A(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getHeight$5(p0);
    }
    public static Boolean B(boolean p0,CommonMeta p1){
       return LiveStreamFeedWrapper.lambda$setFreeTraffic$2(p0, p1);
    }
    public static String C(String p0,LiveStreamModel p1){
       return LiveStreamFeedWrapper.lambda$setDisplayAudienceCount$8(p0, p1);
    }
    public static Integer D(int p0,CommonMeta p1){
       return LiveStreamFeedWrapper.lambda$setDirection$18(p0, p1);
    }
    public static Integer E(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getColor$6(p0);
    }
    public static Boolean F(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$expectFreeTraffic$0(p0);
    }
    public static String g(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getExpTag$10(p0);
    }
    public static Boolean h(boolean p0,QLivePlayConfig p1){
       return LiveStreamFeedWrapper.lambda$setFreeTraffic$1(p0, p1);
    }
    public static String i(String p0,CommonMeta p1){
       return LiveStreamFeedWrapper.lambda$setExpTag$12(p0, p1);
    }
    public static Boolean j(boolean p0,CommonMeta p1){
       return LiveStreamFeedWrapper.lambda$setShowed$17(p0, p1);
    }
    public static Boolean k(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$isShowed$16(p0);
    }
    public static String l(String p0,LiveStreamModel p1){
       return LiveStreamFeedWrapper.lambda$setLiveStreamId$14(p0, p1);
    }
    public static Boolean lambda$expectFreeTraffic$0(CommonMeta p0){
       return Boolean.valueOf(p0.mExpectFreeTraffic);
    }
    public static Integer lambda$getColor$6(CommonMeta p0){
       return Integer.valueOf(p0.mColor);
    }
    public static String lambda$getExpTag$10(CommonMeta p0){
       return p0.mExpTag;
    }
    public static Integer lambda$getHeight$5(CommonMeta p0){
       return Integer.valueOf(p0.mHeight);
    }
    public static String lambda$getListLoadSequenceID$15(CommonMeta p0){
       return p0.mListLoadSequenceID;
    }
    public static Integer lambda$getLiveBizType$20(LiveStreamModel p0){
       return Integer.valueOf(p0.mLiveBizType);
    }
    public static String lambda$getLiveStreamId$13(LiveStreamModel p0){
       return p0.mLiveStreamId;
    }
    public static Integer lambda$getPosition$19(CommonMeta p0){
       return Integer.valueOf(p0.mPosition);
    }
    public static String lambda$getServerExpTag$11(CommonMeta p0){
       return p0.mServerExpTag;
    }
    public static Integer lambda$getWidth$4(CommonMeta p0){
       return Integer.valueOf(p0.mWidth);
    }
    public static Boolean lambda$isShowed$16(CommonMeta p0){
       return Boolean.valueOf(p0.mShowed);
    }
    public static String lambda$setAudienceCount$7(String p0,LiveStreamModel p1){
       p1.mAudienceCount = p0;
       return p0;
    }
    public static Boolean lambda$setCloseLive$3(boolean p0,CommonMeta p1){
       p1.mIsCloseLive = p0;
       return Boolean.valueOf(p0);
    }
    public static Integer lambda$setDirection$18(int p0,CommonMeta p1){
       p1.mDirection = p0;
       return Integer.valueOf(p0);
    }
    public static String lambda$setDisplayAudienceCount$8(String p0,LiveStreamModel p1){
       p1.mDisplayAudienceCount = p0;
       return p0;
    }
    public static String lambda$setDisplayLikeCount$9(String p0,LiveStreamModel p1){
       p1.mDisplayLikeCount = p0;
       return p0;
    }
    public static String lambda$setExpTag$12(String p0,CommonMeta p1){
       p1.mExpTag = p0;
       return p0;
    }
    public static Boolean lambda$setFreeTraffic$1(boolean p0,QLivePlayConfig p1){
       p1.mExpectFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static Boolean lambda$setFreeTraffic$2(boolean p0,CommonMeta p1){
       p1.mExpectFreeTraffic = p0;
       return Boolean.valueOf(p0);
    }
    public static String lambda$setLiveStreamId$14(String p0,LiveStreamModel p1){
       p1.mLiveStreamId = p0;
       return p0;
    }
    public static Boolean lambda$setShowed$17(boolean p0,CommonMeta p1){
       p1.mShowed = p0;
       return Boolean.valueOf(p0);
    }
    public static String m(String p0,LiveStreamModel p1){
       return LiveStreamFeedWrapper.lambda$setDisplayLikeCount$9(p0, p1);
    }
    public static String n(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getServerExpTag$11(p0);
    }
    public static Integer o(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getPosition$19(p0);
    }
    public static Integer q(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getWidth$4(p0);
    }
    public static String t(String p0,LiveStreamModel p1){
       return LiveStreamFeedWrapper.lambda$setAudienceCount$7(p0, p1);
    }
    public static String w(LiveStreamModel p0){
       return LiveStreamFeedWrapper.lambda$getLiveStreamId$13(p0);
    }
    public static Integer x(LiveStreamModel p0){
       return LiveStreamFeedWrapper.lambda$getLiveBizType$20(p0);
    }
    public static Boolean y(boolean p0,CommonMeta p1){
       return LiveStreamFeedWrapper.lambda$setCloseLive$3(p0, p1);
    }
    public static String z(CommonMeta p0){
       return LiveStreamFeedWrapper.lambda$getListLoadSequenceID$15(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedWrapper.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof LiveStreamFeedWrapper) {
          return this.mEntity.equals(p0.mEntity);
       }
       return super.equals(p0);
    }
    public boolean expectFreeTraffic(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, d0.b);
    }
    public String getBizId(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.getBizId();
    }
    public int getColor(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, c0.b);
    }
    public CoverMeta getCoverMeta(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.D0(this.mEntity);
    }
    public String getExpTag(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, v.b);
    }
    public String getFullSource(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r1.R0(this.mEntity);
    }
    public int getHeight(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, b0.b);
    }
    public String getKsOrderId(){
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity != null) {
          LiveStreamFeed mCommonMeta = tmEntity.mCommonMeta;
          if (mCommonMeta != null) {
             return mCommonMeta.mKsOrderId;
          }
       }
       return null;
    }
    public String getListLoadSequenceID(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, a0.b);
    }
    public int getLiveBizType(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.i(this.mEntity, LiveStreamModel.class, u.b, Integer.valueOf(LiveStreamModel$Live.FREE_LIVE.ordinal())).intValue();
    }
    public QLivePlayConfig getLivePlayConfig(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(QLivePlayConfig.class);
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, LiveStreamModel.class, t.b);
    }
    public LiveMerchantFeedData getMerchantData(){
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity != null) {
          return tmEntity.mMerchantData;
       }
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedWrapper.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedWrapper.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveStreamFeedWrapper.class, new i0());
       }else {
          obj.put(LiveStreamFeedWrapper.class, null);
       }
       return obj;
    }
    public PhotoAdvertisementInterface getPhotoAdvertisement(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveStreamFeedWrapper.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isAd()) {
          return b.a(-570058679).k(this.mEntity);
       }
       return objArray;
    }
    public String getPhotoId(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.getId();
    }
    public int getPosition(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, y.b);
    }
    public final List getQuizNoticeTasks(){
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity != null) {
          LiveStreamFeed mLiveStreamM = tmEntity.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mSpecialLive = mLiveStreamM.mSpecialLive;
             if (mSpecialLive != null) {
                LiveStreamModel$SpecialLive mQuizLive = mSpecialLive.mQuizLive;
                if (mQuizLive != null) {
                   return mQuizLive.mInvitationTypes;
                }
             }
          }
       }
       return null;
    }
    public int getQuizNoticeTasksAmount(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = this.isQuizReviveCardEnable();
       if (this.isQuizGroupEnable()) {
          b = b + 1;
       }
       return b;
    }
    public String getServerExpTag(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, CommonMeta.class, x.b);
    }
    public int getType(){
       return PhotoType.fromFeed(this.mEntity).toInt();
    }
    public User getUser(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mEntity.a(User.class);
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, l1.b);
    }
    public String getUserName(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(this.mEntity, User.class, e0.b);
    }
    public int getWidth(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c(this.mEntity, CommonMeta.class, z.b);
    }
    public boolean isAd(){
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       boolean b = (obj != null && obj.get("AD") != null)? true: false;
       return b;
    }
    public boolean isGRPRCustomizedLive(){
       int i;
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       if (obj != null) {
          LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
          if (mLiveStreamM != null && mLiveStreamM.mIsGRPRCustomized != null) {
             i = 1;
          label_0023 :
             if (SystemUtil.K() && a.a().c()) {
                i = i | h.d();
             }
             return i;
          }
       }
       i = 0;
       goto label_0023 ;
    }
    public boolean isLiveStream(){
       return true;
    }
    public boolean isPaidShowLive(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mEntity.mLiveStreamModel.mLivePaidShowId) ^ 0x01);
    }
    public boolean isQuizGroupEnable(){
       List obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getQuizNoticeTasks();
       boolean b = (!q.f(obj) && obj.contains("group"))? true: false;
       return b;
    }
    public boolean isQuizLive(){
       boolean b;
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity != null) {
          LiveStreamFeed mLiveStreamM = tmEntity.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mSpecialLive = mLiveStreamM.mSpecialLive;
             if (mSpecialLive != null && mSpecialLive.mQuizLive != null) {
                b = true;
             label_0013 :
                return b;
             }
          }
       }
       b = false;
       goto label_0013 ;
    }
    public boolean isQuizReviveCardEnable(){
       List obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getQuizNoticeTasks();
       boolean b = (!q.f(obj) && obj.contains("reviveCard"))? true: false;
       return b;
    }
    public boolean isShowed(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.mEntity, CommonMeta.class, w.b);
    }
    public boolean isVideoText(){
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       int i = 1;
       if (obj != null) {
          LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mSpecialLive = mLiveStreamM.mSpecialLive;
             if (mSpecialLive != null) {
                LiveStreamModel$SpecialLive mOlympicLive = mSpecialLive.mOlympicLive;
                if (mOlympicLive != null && mOlympicLive.mLiveType == i) {
                label_002b :
                   if (SystemUtil.K() && a.a().c()) {
                      i = i | h.e();
                   }
                   return i;
                }
             }
          }
       }
       i = 0;
       goto label_002b ;
    }
    public boolean isWishLive(){
       boolean b;
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity != null) {
          LiveStreamFeed mLiveStreamM = tmEntity.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mSpecialLive = mLiveStreamM.mSpecialLive;
             if (mSpecialLive != null && mSpecialLive.mWishRoom != null) {
                b = true;
             label_0013 :
                return b;
             }
          }
       }
       b = false;
       goto label_0013 ;
    }
    public boolean isXStreamStudio(){
       int i;
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, LiveStreamFeedWrapper.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mEntity;
       if (obj != null) {
          LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
          if (mLiveStreamM != null) {
             LiveStreamModel mSpecialLive = mLiveStreamM.mSpecialLive;
             if (mSpecialLive != null) {
                LiveStreamModel$SpecialLive mOlympicLive = mSpecialLive.mOlympicLive;
                if (mOlympicLive != null && mOlympicLive.mLiveType == 2) {
                   i = 1;
                label_002c :
                   if (SystemUtil.K() && a.a().c()) {
                      i = i | h.f();
                   }
                   return i;
                }
             }
          }
       }
       i = 0;
       goto label_002c ;
    }
    public void setAudienceCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "12")) {
          return;
       }
       e.h(this.mEntity, LiveStreamModel.class, new b0(p0));
       return;
    }
    public void setCloseLive(boolean p0){
       if (PatchProxy.isSupport(LiveStreamFeedWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveStreamFeedWrapper.class, "3")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new g0(p0));
       return;
    }
    public void setDirection(int p0){
       if (PatchProxy.isSupport(LiveStreamFeedWrapper.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveStreamFeedWrapper.class, "24")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new y(p0));
       return;
    }
    public void setDisplayAudienceCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "13")) {
          return;
       }
       e.h(this.mEntity, LiveStreamModel.class, new c0(p0));
       return;
    }
    public void setDisplayLikeCount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "14")) {
          return;
       }
       e.h(this.mEntity, LiveStreamModel.class, new a0(p0));
       return;
    }
    public void setExpTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "17")) {
          return;
       }
       e.h(this.mEntity, CommonMeta.class, new d0(p0));
       return;
    }
    public void setFreeTraffic(boolean p0){
       if (PatchProxy.isSupport(LiveStreamFeedWrapper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveStreamFeedWrapper.class, "2")) {
          return;
       }
       LiveStreamFeedWrapper tmEntity = this.mEntity;
       if (tmEntity instanceof LiveStreamFeed) {
          e.h(tmEntity, QLivePlayConfig.class, new e0(p0));
       }else {
          e.h(tmEntity, CommonMeta.class, new h0(p0));
       }
       return;
    }
    public void setLiveStreamId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "19")) {
          return;
       }
       e.h(this.mEntity, LiveStreamModel.class, new z(p0));
       return;
    }
    public LiveStreamFeedWrapper setPosition(int p0){
       if (PatchProxy.isSupport(LiveStreamFeedWrapper.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveStreamFeedWrapper.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       r1.g5(this.mEntity, p0);
       return this;
    }
    public LiveStreamFeedWrapper setShowed(boolean p0){
       if (PatchProxy.isSupport(LiveStreamFeedWrapper.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveStreamFeedWrapper.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.h(this.mEntity, CommonMeta.class, new f0(p0));
       return this;
    }
    public void startSyncWithActivity(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "43")) {
          return;
       }
       this.mEntity.startSyncWithActivity(p0);
       return;
    }
    public void startSyncWithFragment(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "42")) {
          return;
       }
       this.mEntity.startSyncWithFragment(p0);
       return;
    }
    public void startSyncWithFragment(t p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamFeedWrapper.class, "41")) {
          return;
       }
       this.mEntity.startSyncWithFragment(p0, p1);
       return;
    }
    public void sync(LiveStreamFeedWrapper p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeedWrapper.class, "39")) {
          return;
       }
       this.mEntity.sync(p0.mEntity);
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
