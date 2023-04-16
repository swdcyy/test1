package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import java.lang.Object;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.merchant.api.core.LiveMerchantSkin;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;

public class LiveMerchantBaseContext$Builder	// class@001500
{
    public String mCarrierId;
    public int mFansGroupLevel;
    public boolean mIsAnonymousLive;
    public String mJumpParams;
    public String mLiveAuthorId;
    public User mLiveAuthorUser;
    public BaseFeed mLiveFeed;
    public LiveMerchantSkin mLiveMerchantSkin;
    public String mLivePayload;
    public String mLiveStreamId;
    public ClientContent$LiveStreamPackage mLiveStreamPackage;
    public int mLiveType;
    public MerchantAudienceParams mMerchantAudienceParams;
    public MerchantLivePlayConfig mMerchantLivePlayConfig;
    public String mMerchantSessionId;
    public boolean mNeedDowngrade;
    public int mPlayerControllerHashCode;
    public String mServerExpTag;

    public void LiveMerchantBaseContext$Builder(){
       super();
    }
    public void LiveMerchantBaseContext$Builder(LiveMerchantBaseContext p0){
       super();
       this.mLiveStreamId = p0.mLiveStreamId;
       this.mLiveAuthorId = p0.mLiveAuthorId;
       this.mLiveStreamPackage = p0.mLiveStreamPackage;
       this.mLiveFeed = p0.mLiveFeed;
       this.mLiveMerchantSkin = p0.mLiveMerchantSkin;
       this.mLiveAuthorUser = p0.mLiveAuthorUser;
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
    public void LiveMerchantBaseContext$Builder(LiveMerchantBaseContext p0,LiveMerchantBaseContext$a p1){
       super(p0);
    }
    public LiveMerchantBaseContext build(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantBaseContext$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.checkLiveStreamId();
       this.checkLiveAuthorId();
       return new LiveMerchantBaseContext(this, null);
    }
    public final void checkLiveAuthorId(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantBaseContext$Builder.class, "3")) {
          return;
       }
       if (TextUtils.x(this.mLiveAuthorId)) {
          LiveMerchantBaseContext$Builder tmLiveStream = this.mLiveStreamPackage;
          if (tmLiveStream != null) {
             this.mLiveAuthorId = tmLiveStream.anchorUserId;
          }else {
             tmLiveStream = this.mLiveFeed;
             if (tmLiveStream instanceof LiveStreamFeed) {
                this.mLiveAuthorId = tmLiveStream.mUser.mId;
             }
          }
       }
       return;
    }
    public final void checkLiveStreamId(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantBaseContext$Builder.class, "2")) {
          return;
       }
       if (TextUtils.x(this.mLiveStreamId)) {
          LiveMerchantBaseContext$Builder tmLiveStream = this.mLiveStreamPackage;
          if (tmLiveStream != null) {
             this.mLiveStreamId = tmLiveStream.liveStreamId;
          }else {
             tmLiveStream = this.mLiveFeed;
             if (tmLiveStream instanceof LiveStreamFeed) {
                this.mLiveStreamId = tmLiveStream.getId();
             }
          }
       }
       return;
    }
    public LiveMerchantBaseContext$Builder setCarrierId(String p0){
       this.mCarrierId = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setFansGroupLevel(int p0){
       this.mFansGroupLevel = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setIsAnonymousLive(boolean p0){
       this.mIsAnonymousLive = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setJumpParams(String p0){
       this.mJumpParams = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveAuthorId(String p0){
       this.mLiveAuthorId = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveAuthorUser(User p0){
       this.mLiveAuthorUser = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveFeed(BaseFeed p0){
       this.mLiveFeed = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveMerchantSkin(LiveMerchantSkin p0){
       this.mLiveMerchantSkin = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLivePayload(String p0){
       this.mLivePayload = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveStreamId(String p0){
       this.mLiveStreamId = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveStreamPackage(ClientContent$LiveStreamPackage p0){
       this.mLiveStreamPackage = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setLiveType(int p0){
       this.mLiveType = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setMerchantAudienceParams(MerchantAudienceParams p0){
       this.mMerchantAudienceParams = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setMerchantLivePlayConfig(MerchantLivePlayConfig p0){
       this.mMerchantLivePlayConfig = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setMerchantSessionId(String p0){
       this.mMerchantSessionId = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setNeedDowngrade(boolean p0){
       this.mNeedDowngrade = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setPlayerControllerHashCode(int p0){
       this.mPlayerControllerHashCode = p0;
       return this;
    }
    public LiveMerchantBaseContext$Builder setServerExpTag(String p0){
       this.mServerExpTag = p0;
       return this;
    }
}
