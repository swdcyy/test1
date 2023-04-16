package com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import java.lang.String;
import com.kwai.video.wayne.player.datasource.WayneDatasourceProvider;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.wayne.player.builder.StartPlayBlockInfo;
import java.lang.Float;
import com.kwai.video.wayne.player.danmakumask.KSDanamkuMaskType;
import com.kwai.video.wayne.player.builder.WayneBuildData$CreatePlayerInterceptor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;
import java.util.List;
import java.lang.Number;
import com.kwai.player.KwaiRepresentation;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import com.kwai.video.player.misc.IMediaDataSource;
import java.lang.Integer;
import com.kwai.video.wayne.player.builder.ISelectManifestRep;
import com.kwai.video.player.mid.multisource.switcher.Switcher;
import com.kwai.video.wayne.player.danmakumask.KSDanmakuMaskListener;
import com.kwai.video.wayne.player.danmakumask.KSDanmakuMaskRender;
import tv.acfun.core.player.mask.view.MaskPathRender;
import tv.acfun.core.player.mask.view.DanmakuMaskLayout;
import java.lang.Boolean;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.datasource.KwaiManifestDatasource;
import com.kwai.video.wayne.player.datasource.CDNListDatasource;
import com.kwai.video.hodor.util.Timber;
import java.lang.IllegalArgumentException;
import com.kwai.video.wayne.player.decision.DecisionParams;
import java.util.Map;
import com.kwai.video.wayne.player.config.hw_codec.VodMediaCodecConfig;
import com.kwai.video.wayne.player.datasource.MediaDatasource;
import com.kwai.video.wayne.player.datasource.NormalUrlDatasource;
import com.kwai.video.wayne.player.builder.WayneVideoContext;

public class WayneBuildData extends PlayerCommonBuildData	// class@000cc4
{
    public boolean disableHodorCache;
    public DataSourceFetcher fetcher;
    public int mAbLoopCount;
    public long mAbLoopEndMs;
    public long mAbLoopStartMs;
    public int mAdaptiveNetworkType;
    public long mAppPredictedWatchTimeMs;
    public String mBizExtra;
    public String mBizFt;
    public String mBizType;
    public String mCacheKey;
    public String mCdnLogExtraMsg;
    public WayneBuildData$CreatePlayerInterceptor mCreatePlayerInterceptor;
    public DanmakuMaskLayout mDanmakuMaskLayout;
    public IDatasource mDataSourceModule;
    public DecisionParams mDecisionParams;
    public boolean mDisableSeekAtStart;
    public boolean mEnableAPJoySound;
    public boolean mEnableAPSpeedChanger;
    public boolean mEnableAccurateSeek;
    public boolean mEnableAutoRetry;
    public boolean mEnableCacheSeek;
    public boolean mEnableDanmakuMask;
    public boolean mEnableDccAlg;
    public boolean mEnableLowPerfMode;
    public boolean mEnableLowVVPlayOpt;
    public boolean mEnableNewRefluxOpt;
    public boolean mEnableSeekContinuous;
    public boolean mEnableSoftwareDecodeLimit;
    public boolean mEnableVideoRawDataCallback;
    public Map mExtraHeaders;
    public boolean mForceDisableVodP2sp;
    public boolean mForceSystemPlayer;
    public boolean mHasSetPreload;
    public int mHdrAdaptiveMode;
    public Map mHttpHeaders;
    public String mIndexContentPrePath;
    public KSDanamkuMaskType mKSDanamkuMaskType;
    public KSDanmakuMaskListener mKwaiDanmakuMaskListener;
    public KwaiManifest mKwaiManifest;
    public long mLastPlayPos;
    public Float mLeftVolume;
    public boolean mLutRenderEnable;
    public MaskPathRender mMaskPathRender;
    public int mMaxSpeedKbps;
    public VodMediaCodecConfig mMediaCodecConfig;
    public IMediaDataSource mMediaDataSource;
    public String mModelPath;
    public String mMp4AbrModelPath;
    public Integer mOverlayFormat;
    public boolean mPlayFromHistory;
    public int mPlayIndex;
    public int mPlayerAudioFadeInMs;
    public int mPlayerScene;
    public int mPlayerType;
    public int mPlaylistCachePolicy;
    public int mPrefetchedFileSizePercent;
    public List mQualityTypeAdaptiveBlackList;
    public List mQualityTypeAdaptiveWhiteList;
    public int mRepresentationId;
    public String mRequestUrl;
    public Float mRightVolume;
    public int mSelectManifestRepId;
    public ISelectManifestRep mSelectManifestRepIdListener;
    public long mServerPredictedWatchTimeMs;
    public boolean mShouldPauseWhenInit;
    public float mSpeed;
    public StartPlayBlockInfo mStartPlayBlockInfo;
    public long mStartPosition;
    public int mSwitchStrategy;
    public Switcher mSwitcher;
    public boolean mUseMediaCodecOesSurface;
    public boolean mUseMediaCodecSetSurfaceWithoutReconfig;
    public boolean mUseMediaCodecSurfaceView;
    public boolean mUseVodP2sp;
    public int mVideoAlphaType;
    public WayneVideoContext mVideoContext;
    public int mViewHeight;
    public int mViewWidth;
    public int mVodDataSourceType;
    public int mVodManifestMaxResolution;
    public int mWayneSwitchStrategy;
    public boolean misPreload;
    public WayneDatasourceProvider provider;
    public static String logTag = "WayneBuildData";

    public void WayneBuildData(String p0){
       super();
       this.provider = new WayneDatasourceProvider(null);
       this.mVodDataSourceType = 0;
       this.mBizType = "KpMidUnknown";
       this.mBizFt = "";
       this.mBizExtra = "";
       this.mVodManifestMaxResolution = -1;
       this.mPlayIndex = 1;
       this.mSpeed = 0;
       this.mUseMediaCodecOesSurface = false;
       this.mStartPosition = -1;
       this.mUseVodP2sp = false;
       this.mForceDisableVodP2sp = false;
       this.mEnableDccAlg = true;
       this.mServerPredictedWatchTimeMs = -1;
       this.mAppPredictedWatchTimeMs = -1;
       this.mEnableLowVVPlayOpt = false;
       this.mEnableNewRefluxOpt = false;
       this.mSelectManifestRepId = -100;
       this.mMaxSpeedKbps = -1;
       this.mPlaylistCachePolicy = 0;
       this.mPrefetchedFileSizePercent = -1;
       this.mAdaptiveNetworkType = 0;
       this.mEnableCacheSeek = false;
       this.mEnableSeekContinuous = false;
       this.disableHodorCache = false;
       this.mModelPath = "";
       this.mMp4AbrModelPath = "";
       this.mVideoAlphaType = 0;
       this.mAbLoopStartMs = 0;
       this.mAbLoopEndMs = 0;
       this.mAbLoopCount = -1;
       this.mDisableSeekAtStart = false;
       this.mHdrAdaptiveMode = 0;
       this.mEnableAPJoySound = false;
       this.mSwitchStrategy = 0;
       this.mOverlayFormat = null;
       this.mStartPlayBlockInfo = new StartPlayBlockInfo(0, 0, 0);
       this.mUseMediaCodecSetSurfaceWithoutReconfig = false;
       this.mUseMediaCodecSurfaceView = false;
       this.mRepresentationId = -1;
       this.mEnableAPSpeedChanger = false;
       this.mEnableAccurateSeek = true;
       Float uFloat = Float.valueOf(0x3f800000);
       this.mLeftVolume = uFloat;
       this.mRightVolume = uFloat;
       this.mEnableAutoRetry = false;
       this.mShouldPauseWhenInit = true;
       this.mHasSetPreload = false;
       this.misPreload = false;
       this.mEnableSoftwareDecodeLimit = false;
       this.mPlayerScene = 1;
       this.mKSDanamkuMaskType = KSDanamkuMaskType.TYPE_UNKNOWN;
       this.mPlayerType = 1;
       this.mEnableDanmakuMask = false;
       this.mEnableVideoRawDataCallback = false;
       this.mPlayFromHistory = false;
       this.mWayneSwitchStrategy = 0;
       this.mBizType = p0;
    }
    public boolean enableAutoRetry(){
       return this.mEnableAutoRetry;
    }
    public WayneBuildData enableDanmakuMask(boolean p0){
       this.mEnableDanmakuMask = p0;
       return this;
    }
    public WayneBuildData enableEnableAccurateSeek(boolean p0){
       this.mEnableAccurateSeek = p0;
       return this;
    }
    public WayneBuildData enableLowPerformanceMode(boolean p0){
       this.mEnableLowPerfMode = p0;
       return this;
    }
    public boolean enableLowVVPlayOpt(){
       return this.mEnableLowVVPlayOpt;
    }
    public boolean enableNewRefluxOpt(){
       return this.mEnableNewRefluxOpt;
    }
    public WayneBuildData enableVideoRawDataCallback(boolean p0){
       this.mEnableVideoRawDataCallback = p0;
       return this;
    }
    public long getAppPredictedWatchTimeMs(){
       return this.mAppPredictedWatchTimeMs;
    }
    public String getBizType(){
       return this.mBizType;
    }
    public String getCdnLogExtraMsg(){
       return this.mCdnLogExtraMsg;
    }
    public WayneBuildData$CreatePlayerInterceptor getCreatePlayerInterceptor(){
       return this.mCreatePlayerInterceptor;
    }
    public String getDataSource(){
       WayneBuildData obj = PatchProxy.apply(null, this, WayneBuildData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDataSourceModule;
       if (obj == null) {
          return null;
       }
       return obj.getDatasourceStrUrl();
    }
    public IDatasource getDataSourceModule(){
       return this.mDataSourceModule;
    }
    public DataSourceFetcher getFetcher(){
       return this.fetcher;
    }
    public String getIndexContentPrePath(){
       return this.mIndexContentPrePath;
    }
    public int getInitRepresentationId(List p0){
       WayneBuildData obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (!this.isManifestV2()) {
          return i;
       }
       obj = this.mRepresentationId;
       if (obj != i) {
          return obj;
       }
       int i1 = 0;
       while (i1 < p0.size()) {
          KwaiRepresentation kwaiRepresen = p0.get(i1);
          KwaiRepresentation id = kwaiRepresen.id;
          if (!i1) {
             i = id;
          }
          if (kwaiRepresen.defaultSelect != null) {
             i = id;
             break ;
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public KwaiManifest getKwaiManifest(){
       return this.mKwaiManifest;
    }
    public IMediaDataSource getMediaDataSource(){
       return this.mMediaDataSource;
    }
    public int getMediaType(){
       Object obj = PatchProxy.apply(null, this, WayneBuildData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mDataSourceModule.getKpmidMediaType();
    }
    public Integer getOverlayFormat(){
       return this.mOverlayFormat;
    }
    public int getPlayIndex(){
       return this.mPlayIndex;
    }
    public int getPlaylistCachePolicy(){
       return this.mPlaylistCachePolicy;
    }
    public WayneDatasourceProvider getProvider(){
       return this.provider;
    }
    public List getQualityTypeAdaptiveBlackList(){
       return this.mQualityTypeAdaptiveBlackList;
    }
    public List getQualityTypeAdaptiveWhiteList(){
       return this.mQualityTypeAdaptiveWhiteList;
    }
    public String getRequestUrl(){
       return this.mRequestUrl;
    }
    public int getSelectManifestRepId(){
       return this.mSelectManifestRepId;
    }
    public ISelectManifestRep getSelectManifestRepIdListener(){
       return this.mSelectManifestRepIdListener;
    }
    public long getServerPredictedWatchTimeMs(){
       return this.mServerPredictedWatchTimeMs;
    }
    public StartPlayBlockInfo getStartPlayBlockInfo(){
       return this.mStartPlayBlockInfo;
    }
    public long getStartPosition(){
       return this.mStartPosition;
    }
    public int getSwitchStrategy(){
       return this.mSwitchStrategy;
    }
    public Switcher getSwitcher(){
       return this.mSwitcher;
    }
    public int getVodDataSourceType(){
       return this.mVodDataSourceType;
    }
    public int getVodManifestHdrAdaptiveMode(){
       return this.mHdrAdaptiveMode;
    }
    public int getWayneDataSourceType(){
       WayneBuildData obj = PatchProxy.apply(null, this, WayneBuildData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mDataSourceModule;
       if (obj == null) {
          return 0;
       }
       return obj.getWayneDataSourceType();
    }
    public final int getWayneMediaType(int p0){
       int i = 2;
       if (p0 != 1 && (p0 != i && p0 != 3)) {
          if (p0 != 4 && p0 != 6) {
             i = 0;
          }
       }else {
          i = 1;
       }
       return i;
    }
    public int getWayneSwitchStrategy(){
       return this.mWayneSwitchStrategy;
    }
    public boolean hasSetPreload(){
       return this.mHasSetPreload;
    }
    public WayneBuildData initDM(KSDanamkuMaskType p0,KSDanmakuMaskListener p1){
       this.mKSDanamkuMaskType = p0;
       this.mKwaiDanmakuMaskListener = p1;
       return this;
    }
    public WayneBuildData initDM(KSDanamkuMaskType p0,KSDanmakuMaskRender p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WayneBuildData.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mKSDanamkuMaskType = p0;
       if (p1 != null) {
          this.mMaskPathRender = p1.getInternalMaskRender();
       }
       return this;
    }
    public WayneBuildData initDM(KSDanamkuMaskType p0,DanmakuMaskLayout p1){
       this.mKSDanamkuMaskType = p0;
       this.mDanmakuMaskLayout = p1;
       return this;
    }
    public boolean isDataSourceTypeValid(){
       WayneBuildData obj = PatchProxy.apply(null, this, WayneBuildData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mDataSourceModule;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.getWayneDataSourceType() != 7 && (this.mDataSourceModule.getWayneDataSourceType() != 6 && (this.mDataSourceModule.getWayneDataSourceType() != 1 && (this.mDataSourceModule.getWayneDataSourceType() == 8 || this.mDataSourceModule.getWayneDataSourceType() == 2)))) {
          b = true;
       }
       return b;
    }
    public boolean isDisableHodorCache(){
       return this.disableHodorCache;
    }
    public boolean isEnableSeekContinuous(){
       return this.mEnableSeekContinuous;
    }
    public boolean isEnableSoftwareDecodeLimit(){
       return this.mEnableSoftwareDecodeLimit;
    }
    public boolean isKwaiManifestSource(){
       boolean b = (this.mKwaiManifest != null)? true: false;
       return b;
    }
    public boolean isLutRenderEnable(){
       return this.mLutRenderEnable;
    }
    public boolean isManifestV2(){
       Object obj = PatchProxy.apply(null, this, WayneBuildData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getWayneDataSourceType() == 6 || this.getWayneDataSourceType() == 8)? true: false;
       return b;
    }
    public boolean isPlayable(){
       Object obj = PatchProxy.apply(null, this, WayneBuildData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isDataSourceTypeValid()) {
          DebugLog.i(WayneBuildData.logTag, "data source isDataSourceTypeValid");
          return b;
       }else if(this.mVodDataSourceType == 7){
          DebugLog.i(WayneBuildData.logTag, "mMediaDataSource : "+this.mMediaDataSource);
          if (this.mMediaDataSource != null) {
             b = true;
          }
          return b;
       }else {
          return (TextUtils.isEmpty(this.getDataSource()) ^ 1);
       }
    }
    public boolean isPreload(){
       return this.misPreload;
    }
    public final void parseBasicInfoFromKwaiManifest(KwaiManifest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneBuildData.class, "19")) {
          return;
       }
       DebugLog.i(WayneBuildData.logTag, "parseBasicInfoFromKwaiManifest "+p0);
       this.setDatasourceModule(new KwaiManifestDatasource(p0));
       return;
    }
    public WayneBuildData setAbLoopCount(long p0,long p1,int p2){
       this.mAbLoopStartMs = p0;
       this.mAbLoopEndMs = p1;
       this.mAbLoopCount = p2;
       return this;
    }
    public WayneBuildData setAbLoopCount(long p0,long p1,int p2,boolean p3){
       this.mAbLoopStartMs = p0;
       this.mAbLoopEndMs = p1;
       this.mAbLoopCount = p2;
       this.mDisableSeekAtStart = p3;
       return this;
    }
    public WayneBuildData setAdaptiveNetworkType(int p0){
       this.mAdaptiveNetworkType = p0;
       return this;
    }
    public WayneBuildData setBizExtra(String p0){
       this.mBizExtra = p0;
       return this;
    }
    public WayneBuildData setBizFt(String p0){
       this.mBizFt = p0;
       return this;
    }
    public WayneBuildData setBizStrategyData(int p0,long p1){
       if (!p0) {
          this.mServerPredictedWatchTimeMs = p1;
       }else if(p0 == 1){
          this.mAppPredictedWatchTimeMs = p1;
       }
       return this;
    }
    public WayneBuildData setBizType(String p0){
       this.mBizType = p0;
       return this;
    }
    public WayneBuildData setCDNList(List p0,int p1){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, wayneBuildDa, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i(WayneBuildData.logTag, "setCDNList "+p0);
       this.setDatasourceModule(new CDNListDatasource(p0, p1));
       return this;
    }
    public WayneBuildData setCacheKey(String p0){
       this.mCacheKey = p0;
       return this;
    }
    public WayneBuildData setCdnLogExtraMsg(String p0){
       this.mCdnLogExtraMsg = p0;
       return this;
    }
    public void setCreatePlayerInterceptor(WayneBuildData$CreatePlayerInterceptor p0){
       this.mCreatePlayerInterceptor = p0;
    }
    public final void setDataSourceType(int p0){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, wayneBuildDa, "21")) {
          return;
       }
       DebugLog.i(WayneBuildData.logTag, "setDataSourceType: "+p0);
       wayneBuildDa = this.mVodDataSourceType;
       if (wayneBuildDa != null && wayneBuildDa != p0) {
          Object[] objArray = new Object[]{Integer.valueOf(wayneBuildDa),Integer.valueOf(p0)};
          Timber.w("[setDataSourceType] different type setted, origin dataSourceType:%d, new dataSourceType:%d", objArray);
       }
       this.mVodDataSourceType = p0;
       return;
    }
    public WayneBuildData setDatasourceModule(IDatasource p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setDatasourceModule"+p0);
       this.mDataSourceModule = p0;
       this.setDataSourceType(this.wayenDataType2Vod(p0));
       this.provider.setDatasource(p0);
       return this;
    }
    public WayneBuildData setDatasourceProvider(WayneDatasourceProvider p0){
       p0 = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "29");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       DebugLog.e(WayneBuildData.logTag, "setDatasourceProvider is deprecated!");
       throw new IllegalArgumentException("setDatasourceProvider is not valid!!!");
    }
    public WayneBuildData setDecisionParams(DecisionParams p0){
       this.mDecisionParams = p0;
       return this;
    }
    public WayneBuildData setDisableHodorCache(boolean p0){
       this.disableHodorCache = p0;
       return this;
    }
    public WayneBuildData setEnableAPJoySound(boolean p0){
       this.mEnableAPJoySound = p0;
       return this;
    }
    public WayneBuildData setEnableAPSpeedChanger(boolean p0){
       this.mEnableAPSpeedChanger = p0;
       return this;
    }
    public WayneBuildData setEnableAutoRetry(boolean p0){
       this.mEnableAutoRetry = p0;
       return this;
    }
    public WayneBuildData setEnableCacheSeek(boolean p0){
       this.mEnableCacheSeek = p0;
       return this;
    }
    public WayneBuildData setEnableDccAlg(boolean p0){
       this.mEnableDccAlg = p0;
       return this;
    }
    public WayneBuildData setEnableLowVVPlayOpt(boolean p0){
       this.mEnableLowVVPlayOpt = p0;
       return this;
    }
    public WayneBuildData setEnableNewRefluxOpt(boolean p0){
       this.mEnableNewRefluxOpt = p0;
       return this;
    }
    public WayneBuildData setEnableSeekContinuous(boolean p0){
       this.mEnableSeekContinuous = p0;
       return this;
    }
    public WayneBuildData setEnableSoftwareDecodeLimit(boolean p0){
       this.mEnableSoftwareDecodeLimit = p0;
       return this;
    }
    public WayneBuildData setExtraHeaders(Map p0){
       this.mExtraHeaders = p0;
       return this;
    }
    public WayneBuildData setFetcher(DataSourceFetcher p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.fetcher = p0;
       this.provider.setFetcher(p0);
       return this;
    }
    public WayneBuildData setForceDisableVodP2sp(boolean p0){
       this.mForceDisableVodP2sp = p0;
       return this;
    }
    public WayneBuildData setForceSystemPlayer(boolean p0){
       this.mForceSystemPlayer = p0;
       this.mPlayerType = (p0)? 2: 1;
       return this;
    }
    public WayneBuildData setHlsIndexContent(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, WayneBuildData.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setHlsIndexContent "+p0+" indexContentPrePath: "+p1+" requestUrl: "+p2);
       this.setDataSourceType(5);
       this.mIndexContentPrePath = p1;
       if (TextUtils.isEmpty(p2)) {
          p2 = "";
       }
       this.mRequestUrl = p2;
       return this;
    }
    public WayneBuildData setHttpHeaders(Map p0){
       this.mHttpHeaders = p0;
       return this;
    }
    public WayneBuildData setInitRepresentationId(int p0){
       this.mRepresentationId = p0;
       return this;
    }
    public WayneBuildData setIsPreload(boolean p0){
       this.misPreload = p0;
       this.mHasSetPreload = true;
       return this;
    }
    public WayneBuildData setKwaiManifest(KwaiManifest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setKwaiManifest(p0, false);
       return this;
    }
    public WayneBuildData setKwaiManifest(KwaiManifest p0,boolean p1){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, wayneBuildDa, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i(WayneBuildData.logTag, "setKwaiManifest "+p0+" useRandomUrlStrategy: "+p1);
       if (p1) {
          p0.shuffleUrlList();
       }
       p0.executeRepresentationFilter();
       this.mKwaiManifest = p0;
       this.parseBasicInfoFromKwaiManifest(p0);
       return this;
    }
    public WayneBuildData setLastPlayPos(long p0){
       this.mLastPlayPos = p0;
       return this;
    }
    public WayneBuildData setLutRenderEnable(boolean p0){
       this.mLutRenderEnable = p0;
       return this;
    }
    public WayneBuildData setManifest(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setManifest(p0, false);
       return this;
    }
    public WayneBuildData setManifest(String p0,boolean p1){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, wayneBuildDa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i(WayneBuildData.logTag, "setManifest "+p0+" useRandomUrlStrategy: "+p1);
       KwaiManifest kwaiManifest = KwaiManifest.from(p0);
       if (kwaiManifest == null) {
          return this;
       }else {
          this.setKwaiManifest(kwaiManifest, p1);
          return this;
       }
    }
    public WayneBuildData setManifestSelectPrefetchedRepThreshold(int p0){
       this.mPrefetchedFileSizePercent = p0;
       return this;
    }
    public WayneBuildData setMaxSpeedKbps(int p0){
       this.mMaxSpeedKbps = p0;
       return this;
    }
    public WayneBuildData setMediaCodecConfig(VodMediaCodecConfig p0){
       this.mMediaCodecConfig = p0;
       return this;
    }
    public WayneBuildData setMediaDataSource(IMediaDataSource p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setMediaDataSource "+p0);
       this.mMediaDataSource = p0;
       this.setDatasourceModule(new MediaDatasource(p0));
       return this;
    }
    public WayneBuildData setModelPath(String p0){
       this.mModelPath = p0;
       return this;
    }
    public WayneBuildData setMp4AbrModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setMp4AbrModelPath "+p0);
       this.mMp4AbrModelPath = p0;
       return this;
    }
    public WayneBuildData setNormalUrl(String p0,int p1){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, wayneBuildDa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i(WayneBuildData.logTag, "setNormalUrl"+p0+" datasourceType "+p1);
       if (p1 == 1 || p1 == 4) {
          this.setDatasourceModule(new NormalUrlDatasource(p0, this.getWayneMediaType(p1)));
          this.mKwaiManifest = null;
          return this;
       }else {
          throw new IllegalArgumentException("invalid VodDataSourceType:"+p1);
       }
    }
    public WayneBuildData setNormalUrl(String p0,int p1,String p2){
       NormalUrlDatasource obj;
       if (PatchProxy.isSupport(WayneBuildData.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, WayneBuildData.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DebugLog.i(WayneBuildData.logTag, "setNormalUrl "+p0+" mediatype "+p1);
       obj = new NormalUrlDatasource(p0, p1);
       obj.setCacheKey(p2);
       this.setDatasourceModule(obj);
       return this;
    }
    public WayneBuildData setNormalUrlWithMediaType(String p0,int p1){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, wayneBuildDa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.setNormalUrl(p0, p1, null);
    }
    public WayneBuildData setOverlayFormat(int p0){
       WayneBuildData wayneBuildDa = WayneBuildData.class;
       if (PatchProxy.isSupport(wayneBuildDa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, wayneBuildDa, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mOverlayFormat = Integer.valueOf(p0);
       return this;
    }
    public WayneBuildData setPlayFromHistory(boolean p0){
       this.mPlayFromHistory = p0;
       return this;
    }
    public WayneBuildData setPlayIndex(int p0){
       this.mPlayIndex = p0;
       return this;
    }
    public WayneBuildData setPlaySpeed(float p0){
       this.mSpeed = p0;
       return this;
    }
    public WayneBuildData setPlayVideoContext(WayneVideoContext p0){
       this.mVideoContext = p0;
       return this;
    }
    public WayneBuildData setPlayerAudioFadeInMs(int p0){
       this.mPlayerAudioFadeInMs = p0;
       return this;
    }
    public WayneBuildData setPlayerSceneType(int p0){
       this.mPlayerScene = p0;
       return this;
    }
    public WayneBuildData setPlaylistCachePolicy(int p0){
       this.mPlaylistCachePolicy = p0;
       return this;
    }
    public WayneBuildData setQualityTypeAdaptiveBlackList(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setQualityTypeAdaptiveBlackList "+p0);
       this.mQualityTypeAdaptiveBlackList = p0;
       return this;
    }
    public WayneBuildData setQualityTypeAdaptiveWhiteList(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setQualityTypeAdaptiveWhiteList "+p0);
       this.mQualityTypeAdaptiveWhiteList = p0;
       return this;
    }
    public WayneBuildData setSelectManifestRepId(int p0){
       this.mSelectManifestRepId = p0;
       return this;
    }
    public WayneBuildData setSelectManifestRepIdListener(ISelectManifestRep p0){
       this.mSelectManifestRepIdListener = p0;
       return this;
    }
    public WayneBuildData setShouldPauseWhenInit(boolean p0){
       this.mShouldPauseWhenInit = p0;
       return this;
    }
    public WayneBuildData setStartPlayBlockInfo(StartPlayBlockInfo p0){
       this.mStartPlayBlockInfo = p0;
       return this;
    }
    public WayneBuildData setStartPosition(long p0){
       this.mStartPosition = p0;
       return this;
    }
    public WayneBuildData setSwitchStrategy(int p0){
       this.mSwitchStrategy = p0;
       return this;
    }
    public WayneBuildData setSwitcher(Switcher p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       DebugLog.i(WayneBuildData.logTag, "setSwitcher "+p0);
       if (p0 == null) {
          return this;
       }
       DebugLog.i(WayneBuildData.logTag, "setSwitcher  urlcount =  "+p0.getUrlCount());
       this.mSwitcher = p0;
       p0.injectDataSource(this);
       return this;
    }
    public WayneBuildData setUseMediaCodecOesSurface(boolean p0){
       this.mUseMediaCodecOesSurface = p0;
       return this;
    }
    public WayneBuildData setUseMediaCodecSetSurfaceWithoutReconfig(boolean p0){
       this.mUseMediaCodecSetSurfaceWithoutReconfig = p0;
       return this;
    }
    public WayneBuildData setUseMediaCodecSurfaceView(boolean p0){
       this.mUseMediaCodecSurfaceView = p0;
       return this;
    }
    public WayneBuildData setUseVodP2sp(boolean p0){
       this.mUseVodP2sp = p0;
       return this;
    }
    public WayneBuildData setVideoAlphaType(int p0){
       this.mVideoAlphaType = p0;
       return this;
    }
    public WayneBuildData setViewSize(int p0,int p1){
       this.mViewWidth = p0;
       this.mViewHeight = p1;
       return this;
    }
    public WayneBuildData setVodManifestHdrAdaptiveMode(int p0){
       this.mHdrAdaptiveMode = p0;
       return this;
    }
    public WayneBuildData setVodManifestMaxResolution(int p0){
       this.mVodManifestMaxResolution = p0;
       return this;
    }
    public WayneBuildData setVolume(Float p0,Float p1){
       this.mLeftVolume = p0;
       this.mRightVolume = p1;
       return this;
    }
    public WayneBuildData setWayneSwitchStrategy(int p0){
       this.mWayneSwitchStrategy = p0;
       return this;
    }
    public boolean shouldPauseWhenInit(){
       return this.mShouldPauseWhenInit;
    }
    public boolean useMediaCodecSetSurfaceWithoutReconfig(){
       return this.mUseMediaCodecSetSurfaceWithoutReconfig;
    }
    public boolean useMediaCodecSurfaceView(){
       return this.mUseMediaCodecSurfaceView;
    }
    public final int wayenDataType2Vod(IDatasource p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WayneBuildData.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (p0 == null) {
          return i;
       }
       p0.getWayneDataSourceType();
       int wayneDataSou = p0.getWayneDataSourceType();
       int kpmidMediaTy = p0.getKpmidMediaType();
       if (p0 instanceof CDNListDatasource) {
          if (kpmidMediaTy == 2) {
             i = 4;
          }
          return i;
       }else {
          StringBuilder str = 6;
          if (wayneDataSou != i) {
             if (wayneDataSou != str && wayneDataSou != 8) {
                i = p0.getWayneDataSourceType();
             }else if(kpmidMediaTy == 2){
                i = 6;
             }else {
                i = 3;
             }
          }else if(kpmidMediaTy == 2){
             i = 4;
          }
          DebugLog.i(WayneBuildData.logTag, "wayneDataSourceType= "+wayneDataSou+"mediaType="+kpmidMediaTy+"wayenDataType2Vod= "+i);
          return i;
       }
    }
}
