package com.kuaishou.android.model.feed.LiveStreamFeed;
import da6.c;
import wg3.b;
import ha6.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import wkd.b;
import ip.c;
import kp.s1;
import da6.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.LiveStreamModel;
import ha6.a;
import yp.w;
import java.util.Map;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.LivePushResolution;
import com.google.gson.JsonObject;
import zk.h;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class LiveStreamFeed extends BaseFeed implements c, b, e	// class@000b14
{
    public AccompanyInfo mAccompanyInfo;
    public PhotoAdvertisementPlaceHolder mAd;
    public LiveAuthorHeadIdentityTag mAuthorIdentityTag;
    public boolean mCanShowTvcTag;
    public CommonMeta mCommonMeta;
    public QLivePlayConfig mConfig;
    public CoronaInfo mCoronaInfo;
    public CoronaLiveMeta mCoronaLiveMeta;
    public int mCoverAdaptive;
    public CoverMeta mCoverMeta;
    public CoverPicRecommendedCropWindow mCoverPicRecommendedCropWindow;
    public DynamicEffectMarker mDynamicEffectMarker;
    public ExtMeta mExtMeta;
    public ExtendableModelMap mExtraMap;
    public HyperTag mHyperTag;
    public LiveStreamFeed$LiveCommentListModel mLiveCommentListModel;
    public float mLiveContentSize;
    public LiveStreamFeed$LiveLiteElementsSwitch mLiveLiteElementsSwitch;
    public LiveFansGroupRelationInfoResponse mLiveLiteFansGroupRelationInfo;
    public LivePushResolution mLivePushResolution;
    public LiveStreamFeed$LiveSideBarModel mLiveSideBarModel;
    public LiveSquareSideBarNoticeModel mLiveSquareSideBarNoticeModel;
    public LiveStreamModel mLiveStreamModel;
    public LiveStreamFeed$LiveTrafficReportConfig mLiveTrafficReportConfig;
    public LiveMerchantFeedData mMerchantData;
    public long mShowTimestamp;
    public LiveStreamFeedSwitchInfo mSwitchInfo;
    public Integer[] mTypeViewList;
    public User mUser;
    public VideoQualityInfo mVideoQualityInfo;
    public VoicePartyMeta mVoicePartyMeta;
    public final KSModelMetaExtContainer metaExtContainer;
    public static final long serialVersionUID = 0x193345c758555b;

    public void LiveStreamFeed(){
       super();
       this.metaExtContainer = new KSModelMetaExtContainer();
       this.mCanShowTvcTag = false;
       this.mLiveLiteElementsSwitch = new LiveStreamFeed$LiveLiteElementsSwitch();
       this.mExtraMap = new ExtendableModelMap();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveStreamFeed.class, "4")) {
          return;
       }
       super.afterDeserialize();
       LiveStreamFeed tmConfig = this.mConfig;
       if (tmConfig != null && tmConfig.mServerExpTag == null) {
          tmConfig.mServerExpTag = this.mCommonMeta.mServerExpTag;
       }
       if (this.mAd instanceof PhotoAdvertisementInterface) {
          b.a(0x188c3889).e(this.mAd);
       }
       s1.a(this);
       return;
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, LiveStreamFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public String getId(){
       return this.mLiveStreamModel.mLiveStreamId;
    }
    public a getMetaExt(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveStreamFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.metaExtContainer.getMetaExt(p0, p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeed.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeed.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveStreamFeed.class, new w());
       }else {
          obj.put(LiveStreamFeed.class, null);
       }
       return obj;
    }
    public boolean isLivePushResolutionVaild(){
       LiveStreamFeed obj = PatchProxy.apply(null, this, LiveStreamFeed.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLivePushResolution;
       boolean b = (obj != null && obj.isVaild())? true: false;
       return b;
    }
    public void jsonSerializeAllMetaExt(JsonObject p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamFeed.class, "3")) {
          return;
       }
       this.metaExtContainer.jsonSerializeAllMetaExt(p0, p1);
       return;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeed.class, "5")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
    public void setJsonObjectForMetaExt(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamFeed.class, "1")) {
          return;
       }
       this.metaExtContainer.setJsonObjectAndModel(p0, this);
       return;
    }
}
