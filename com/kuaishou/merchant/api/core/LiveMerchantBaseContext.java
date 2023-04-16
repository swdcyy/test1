package com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeedLogContext;
import f3b.u;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import ur3.d;
import com.google.gson.Gson;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.CharSequence;

public class LiveMerchantBaseContext	// class@001504
{
    public final String mCarrierId;
    public final int mFansGroupLevel;
    public final boolean mIsAnonymousLive;
    public final String mJumpParams;
    public final String mLiveAuthorId;
    public final User mLiveAuthorUser;
    public final BaseFeed mLiveFeed;
    public final LiveMerchantSkin mLiveMerchantSkin;
    public final String mLivePayload;
    public final String mLiveStreamId;
    public final ClientContent$LiveStreamPackage mLiveStreamPackage;
    public String mLiveStreamPackageJson;
    public final int mLiveType;
    public final MerchantAudienceParams mMerchantAudienceParams;
    public final MerchantLivePlayConfig mMerchantLivePlayConfig;
    public final String mMerchantSessionId;
    public final boolean mNeedDowngrade;
    public int mPlayerControllerHashCode;
    public final String mServerExpTag;

    public void LiveMerchantBaseContext(LiveMerchantBaseContext$Builder p0){
       super();
       this.mLiveStreamId = p0.mLiveStreamId;
       this.mLiveAuthorId = p0.mLiveAuthorId;
       this.mLiveAuthorUser = p0.mLiveAuthorUser;
       this.mLiveStreamPackage = p0.mLiveStreamPackage;
       this.mLiveFeed = p0.mLiveFeed;
       this.mLiveMerchantSkin = p0.mLiveMerchantSkin;
       this.mJumpParams = p0.mJumpParams;
       this.mLiveType = p0.mLiveType;
       this.mServerExpTag = p0.mServerExpTag;
       this.mCarrierId = p0.mCarrierId;
       this.mFansGroupLevel = p0.mFansGroupLevel;
       this.mMerchantAudienceParams = p0.mMerchantAudienceParams;
       this.mNeedDowngrade = p0.mNeedDowngrade;
       this.mLivePayload = p0.mLivePayload;
       this.mIsAnonymousLive = p0.mIsAnonymousLive;
       this.mMerchantLivePlayConfig = p0.mMerchantLivePlayConfig;
       this.mMerchantSessionId = p0.mMerchantSessionId;
       this.mPlayerControllerHashCode = p0.mPlayerControllerHashCode;
    }
    public void LiveMerchantBaseContext(LiveMerchantBaseContext$Builder p0,LiveMerchantBaseContext$a p1){
       super(p0);
    }
    public final void fillFeedLogCtx(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantBaseContext.class, "5")) {
          return;
       }
       if (p0.feedLogCtx == null) {
          FeedLogCtx feedLogCtx = this.getFeedLogCtx();
          if (feedLogCtx != null) {
             p0.feedLogCtx = u.f(feedLogCtx);
          }
       }
       return;
    }
    public String getCarrierId(){
       return this.mCarrierId;
    }
    public int getCarrierType(){
       if (this.mLiveType == 4) {
          return 7;
       }
       return 0;
    }
    public int getFansGroupLevel(){
       return this.mFansGroupLevel;
    }
    public FeedLogCtx getFeedLogCtx(){
       LiveMerchantBaseContext obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLiveFeed;
       if (obj != null) {
          return r1.O0(obj);
       }
       return null;
    }
    public String getJumpParams(){
       return this.mJumpParams;
    }
    public String getLiveAuthorId(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mLiveAuthorId);
    }
    public User getLiveAuthorUser(){
       return this.mLiveAuthorUser;
    }
    public BaseFeed getLiveFeed(){
       return this.mLiveFeed;
    }
    public LiveMerchantSkin getLiveMerchantSkin(){
       return this.mLiveMerchantSkin;
    }
    public String getLivePayload(){
       return this.mLivePayload;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mLiveStreamId);
    }
    public ClientContent$LiveStreamPackage getLiveStreamPackage(){
       LiveMerchantBaseContext obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLiveStreamPackage;
       if (obj != null) {
          this.fillFeedLogCtx(obj);
          return this.mLiveStreamPackage;
       }else {
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.anchorUserId = this.mLiveAuthorId;
          liveStreamPa.liveStreamId = this.mLiveStreamId;
          this.fillFeedLogCtx(liveStreamPa);
          return liveStreamPa;
       }
    }
    public String getLiveStreamPackageStatJson(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mLiveStreamPackageJson == null) {
          this.mLiveStreamPackageJson = d.a.q(this.getLiveStreamPackage());
       }
       return this.mLiveStreamPackageJson;
    }
    public int getLiveType(){
       return this.mLiveType;
    }
    public MerchantAudienceParams getMerchantAudienceParams(){
       return this.mMerchantAudienceParams;
    }
    public MerchantLivePlayConfig getMerchantLivePlayConfig(){
       return this.mMerchantLivePlayConfig;
    }
    public String getMerchantSessionId(){
       return this.mMerchantSessionId;
    }
    public boolean getNeedDowngrade(){
       return this.mNeedDowngrade;
    }
    public int getPlayerControllerHashCode(){
       return this.mPlayerControllerHashCode;
    }
    public String getServerExpTag(){
       LiveMerchantBaseContext obj = PatchProxy.apply(null, this, LiveMerchantBaseContext.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mServerExpTag)) {
          obj = this.mLiveFeed;
          if (obj != null) {
             return r1.I1(obj);
          }
       }
       return this.mServerExpTag;
    }
    public boolean isAnonymousLive(){
       return this.mIsAnonymousLive;
    }
}
