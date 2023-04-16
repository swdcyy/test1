package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$SubscribeStatus;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.Long;
import yl8.b;

public class GameZoneModels$GameInfo extends DefaultObservableAndSyncable	// class@0012c0
{
    public String mCategoryId;
    public String mCategoryName;
    public GameZoneModels$GzoneCompetitionCorner mCompetitionCorner;
    public String mCoverUrl;
    public int mDeath;
    public int mDefaultTab;
    public boolean mEnterLiveFeedPage;
    public String mGameDescription;
    public String mGameId;
    public String mGameName;
    public String mHeroName;
    public String mInitialedHeroName;
    public int mKill;
    public String mPhotoCount;
    public int mPosition;
    public String mRoomCount;
    public String mShortDescription;
    public String mShortGameName;
    public GameZoneModels$SubscribeStatus mSubscribeStatus;
    public long mSubscribedCount;
    public int mSurvival;
    public String mWatchingCount;
    public static final long serialVersionUID = 0x67fc876773f63798;

    public void GameZoneModels$GameInfo(){
       super();
       this.mSubscribeStatus = GameZoneModels$SubscribeStatus.unknown;
       this.mSurvival = -1;
       this.mKill = -1;
       this.mDeath = -1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GameZoneModels$GameInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof GameZoneModels$GameInfo && TextUtils.n(p0.mGameId, this.mGameId))? true: false;
       return b;
    }
    public String getBizId(){
       return this.mGameId;
    }
    public String getDisplayGameName(){
       Object obj = PatchProxy.apply(null, this, GameZoneModels$GameInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mShortGameName)) {
          return this.mShortGameName;
       }
       return this.mGameName;
    }
    public String getInitialedHeroName(){
       return this.mInitialedHeroName;
    }
    public GameZoneModels$SubscribeStatus getSubscribeStatus(){
       return this.mSubscribeStatus;
    }
    public long getSubscribedCount(){
       return this.mSubscribedCount;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, GameZoneModels$GameInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!TextUtils.x(this.mGameId)) {
          return (this.mGameId).hashCode();
       }
       return super.hashCode();
    }
    public void setInitialedHeroName(String p0){
       this.mInitialedHeroName = p0;
    }
    public void setSubscribedCount(long p0){
       if (PatchProxy.isSupport(GameZoneModels$GameInfo.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, GameZoneModels$GameInfo.class, "1")) {
          return;
       }
       GameZoneModels$GameInfo gameInfo = null;
       if (p0 - gameInfo < 0) {
          p0 = gameInfo;
       }
       if (!this.mSubscribedCount - p0) {
          return;
       }else {
          this.mSubscribedCount = p0;
          this.notifyChanged();
          return;
       }
    }
    public void sync(GameZoneModels$GameInfo p0){
       this.mSubscribeStatus = p0.mSubscribeStatus;
       this.mSubscribedCount = p0.mSubscribedCount;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public boolean updateSubscribeStatus(GameZoneModels$SubscribeStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GameZoneModels$GameInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mSubscribeStatus == p0) {
          return false;
       }
       this.mSubscribeStatus = p0;
       this.notifyChanged();
       return true;
    }
}
