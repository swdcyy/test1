package com.kwai.video.waynelive.wayneplayer.LiveDataSourceProvider;
import com.kwai.video.waynelive.mediaplayer.LivePlayerWebRTCParams;
import java.lang.Object;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.datasource.LiveUrlSwitchListener;
import com.kwai.video.waynelive.datasource.LiveDnsResolver;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import com.kuaishou.android.live.model.AdaptationSet;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.util.Set;
import com.kuaishou.android.live.model.LiveAdaptiveManifest$ManifestType;
import ekd.a1;
import java.lang.Number;
import com.kwai.video.waynelive.datasource.ILiveDatasource;
import java.lang.IllegalArgumentException;
import com.kwai.video.waynelive.datasource.LiveDataSourceResolver;
import com.kwai.video.waynelive.LivePlayerInitModule;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import com.kwai.video.waynelive.datasource.LiveRavenParam;
import ekd.p0;
import com.kwai.video.waynelive.qosmoniter.QosLowReason;
import java.lang.Integer;
import com.kwai.video.player.kwai_player.Util;

public class LiveDataSourceProvider	// class@000e29
{
    public a1 mAdaptiveManifestSwitcher;
    public String mAnchorId;
    public ILiveDatasource mLiveDataSource;
    public LiveUrlSwitchListener mLiveUrlSwitchListener;
    public int mSecurityErrorRetryCount;
    public final LivePlayerWebRTCParams mWebRTCParams;

    public void LiveDataSourceProvider(LivePlayerWebRTCParams p0){
       super();
       this.mSecurityErrorRetryCount = 0;
       this.mWebRTCParams = p0;
    }
    public void destroy(){
       this.mLiveUrlSwitchListener = null;
    }
    public final void dispatchReconnectFetchUrl(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDataSourceProvider.class, "13")) {
          return;
       }
       LiveDataSourceProvider tmLiveUrlSwi = this.mLiveUrlSwitchListener;
       if (tmLiveUrlSwi != null) {
          tmLiveUrlSwi.onUrlSwitchFail(p0);
       }
       return;
    }
    public final void dispatchUrlSwitch(LiveUrlSwitchReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDataSourceProvider.class, "12")) {
          return;
       }
       LiveDataSourceProvider tmLiveUrlSwi = this.mLiveUrlSwitchListener;
       if (tmLiveUrlSwi != null) {
          tmLiveUrlSwi.onUrlSwitchSuccess(p0);
       }
       return;
    }
    public final List dnsResolveAdaptiveManifest(LiveDnsResolver p0,LiveAdaptiveManifest p1,String p2){
       LiveAdaptiveManifest liveAdaptive = p1;
       String str = p2;
       List obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveDataSourceProvider.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.resolveDnsHost(str);
       String str1 = "LiveDataSourceProvider";
       DebugLog.i(str1, " dnsResolveAdaptiveManifest "+str+obj);
       if (q.f(obj)) {
          DebugLog.e(str1, str+" ipΩ‚Œˆ ß∞‹");
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             ResolvedIP resolvedIP = iterator.next();
             super();
             this.mGopDuration = liveAdaptive.mAdaptationSet.mGopDuration;
             this.mRepresentation = new ArrayList();
             Iterator iterator1 = liveAdaptive.mAdaptationSet.mRepresentation.iterator();
             while (iterator1.hasNext()) {
                AdaptationUrl uAdaptationU = iterator1.next();
                AdaptationUrl uAdaptationU1 = new AdaptationUrl((uAdaptationU.mUrl).replace(str, resolvedIP.mIP), uAdaptationU.mId, uAdaptationU.mBitrate, uAdaptationU.mQualityType, uAdaptationU.mName, uAdaptationU.mShortName, uAdaptationU.mLevel, uAdaptationU.mHidden, uAdaptationU.mEnableAdaptive, uAdaptationU.mDefaultSelect, uAdaptationU.mUrlType);
                this.mRepresentation.add(v8);
                iterator = iterator;
                iterator1 = iterator1;
                uArrayList = uArrayList;
                resolvedIP = resolvedIP;
             }
             LiveAdaptiveManifest liveAdaptive1 = new LiveAdaptiveManifest(liveAdaptive.mVersion, liveAdaptive.mType, liveAdaptive.mIsFreeTrafficCdn, Boolean.valueOf(p1.shouldHideAutoLiveQuality()), Boolean.valueOf(p1.shouldSelectAutoLiveQuality()), liveAdaptive.mBusinessType, liveAdaptive.mCdnFeature, this, p2, resolvedIP, liveAdaptive.mManifestType, p1.isTransformed());
             uArrayList = uArrayList;
             uArrayList.add(iterator);
             iterator = iterator;
             str = p2;
          }
          return uArrayList;
       }
    }
    public LiveAdaptiveManifest getAdaptiveManifest(){
       Object[] objArray = null;
       LiveDataSourceProvider obj = PatchProxy.apply(objArray, this, LiveDataSourceProvider.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAdaptiveManifestSwitcher;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public int getDatasourceType(){
       Object obj = PatchProxy.apply(null, this, LiveDataSourceProvider.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mLiveDataSource.getWayneDataSourceType();
    }
    public final void initAdaptiveManifestSwitcher(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDataSourceProvider.class, "7")) {
          return;
       }
       if (q.f(p0)) {
          DebugLog.e("LiveDataSourceProvider", new IllegalArgumentException("initManifestSwitcher, liveAdaptiveManifests is empty").getMessage());
          return;
       }else {
          LiveAdaptiveManifest$ManifestType fLV = LiveAdaptiveManifest$ManifestType.FLV;
          if (this.mLiveDataSource.getWayneDataSourceType() == 4) {
             fLV = LiveAdaptiveManifest$ManifestType.WebRTC;
          }else {
             this.mLiveDataSource.getWayneDataSourceType();
          }
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             LiveAdaptiveManifest liveAdaptive = iterator.next();
             if (!liveAdaptive.isTransformed()) {
                liveAdaptive.mManifestType = fLV;
             }
          }
          LiveDataSourceResolver liveDataSour = (fLV == LiveAdaptiveManifest$ManifestType.WebRTC)? null: LivePlayerInitModule.getLiveDataSourceResolver();
          p0 = this.resolveAdaptiveManifests(p0, liveDataSour);
          if (q.f(p0)) {
             return;
          }else {
             a1 uoa1 = new a1();
             this.mAdaptiveManifestSwitcher = uoa1;
             uoa1.a(p0);
             return;
          }
       }
    }
    public final boolean isLastPlayUrl(){
       LiveDataSourceProvider obj = PatchProxy.apply(null, this, LiveDataSourceProvider.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAdaptiveManifestSwitcher;
       int i = 1;
       if (obj == null || obj.c() != (this.mAdaptiveManifestSwitcher.e() - i)) {
          i = false;
       }
       return i;
    }
    public final List resolveAdaptiveManifests(List p0,LiveDataSourceResolver p1){
       LiveDataSourceProvider liveDataSour = this;
       Object obj = p1;
       Object obj1 = PatchProxy.applyTwoRefs(p0, obj, liveDataSour, LiveDataSourceProvider.class, "9");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       boolean b = LivePlayerInitModule.getConfig().shouldUseKLP();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveAdaptiveManifest liveAdaptive = iterator.next();
          LiveAdaptiveManifest mAdaptationS = liveAdaptive.mAdaptationSet;
          if (mAdaptationS != null) {
             if (q.f(mAdaptationS.mRepresentation)) {
                continue ;
             }else {
                String str = "LiveDataSourceProvider";
                DebugLog.i(str, "resolveAdaptiveManifests enableKLP"+b);
                int i = 0;
                if (!b) {
                   AdaptationUrl mUrl = liveAdaptive.mAdaptationSet.mRepresentation.get(i).mUrl;
                   if (mUrl != null && (mUrl.contains("&proto=klp") || mUrl.contains("&proto=cmtp"))) {
                   }
                }
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator1 = liveAdaptive.mAdaptationSet.mRepresentation.iterator();
                while (iterator1.hasNext()) {
                   uArrayList1.add(iterator1.next().mUrl);
                }
                LiveRavenParam liveRavenPar = new LiveRavenParam(uArrayList1, liveDataSour.mAnchorId);
                if (obj != null && obj.interceptResolveUrl(liveRavenPar)) {
                   DebugLog.i(str, "resolveAdaptiveManifests interceptResolveUrl");
                }else {
                   String str1 = p0.n(uArrayList1.get(i));
                   if (obj != null) {
                      List list = liveDataSour.dnsResolveAdaptiveManifest(obj, liveAdaptive, str1);
                      if (!q.f(list)) {
                         uArrayList.addAll(list);
                      }else {
                         DebugLog.e(str, "resolve dns empty");
                      }
                   }
                   LiveAdaptiveManifest liveAdaptive1 = new LiveAdaptiveManifest(liveAdaptive.mVersion, liveAdaptive.mType, liveAdaptive.mIsFreeTrafficCdn, Boolean.valueOf(liveAdaptive.shouldHideAutoLiveQuality()), Boolean.valueOf(liveAdaptive.shouldSelectAutoLiveQuality()), liveAdaptive.mBusinessType, liveAdaptive.mCdnFeature, liveAdaptive.mAdaptationSet, str1, null, liveAdaptive.mManifestType, liveAdaptive.isTransformed());
                   uArrayList.add(str);
                }
             }
          }
          liveDataSour = this;
          obj = p1;
       }
       return uArrayList;
    }
    public void setAnchorId(String p0){
       this.mAnchorId = p0;
    }
    public void setLiveDataSource(ILiveDatasource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDataSourceProvider.class, "1")) {
          return;
       }
       this.mLiveDataSource = p0;
       this.initAdaptiveManifestSwitcher(p0.getCurrentDatasource());
       return;
    }
    public void setLiveUrlSwitchListener(LiveUrlSwitchListener p0){
       this.mLiveUrlSwitchListener = p0;
    }
    public final boolean switchPlayUrl(){
       LiveDataSourceProvider obj = PatchProxy.apply(null, this, LiveDataSourceProvider.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isLastPlayUrl()) {
          return false;
       }
       obj = this.mAdaptiveManifestSwitcher;
       if (obj != null) {
          obj.d();
       }
       return true;
    }
    public void trySwitchPlayUrlWhenQosLow(QosLowReason p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDataSourceProvider.class, "4")) {
          return;
       }
       LiveUrlSwitchReason liveUrlSwitc = new LiveUrlSwitchReason();
       QosLowReason mReason = p0.mReason;
       liveUrlSwitc.mRetryReason = mReason;
       liveUrlSwitc.mEmptyDataDurationMs = p0.mEmptyDataDurationMs;
       if (mReason == 1) {
          liveUrlSwitc.mReleaseReason = 10;
       }else if(mReason == 2){
          liveUrlSwitc.mReleaseReason = 11;
       }
       if (this.switchPlayUrl()) {
          DebugLog.i("LiveDataSourceProvider", "lowQos switch to next url reason"+liveUrlSwitc);
          this.dispatchUrlSwitch(liveUrlSwitc);
       }else {
          DebugLog.i("LiveDataSourceProvider", "lowQos switch url fail reason"+liveUrlSwitc);
          this.dispatchReconnectFetchUrl(liveUrlSwitc);
       }
       return;
    }
    public void trySwitchUrlWhenPlayerCriticalError(int p0,int p1){
       LiveDataSourceProvider liveDataSour = LiveDataSourceProvider.class;
       if (PatchProxy.isSupport(liveDataSour) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, liveDataSour, "5")) {
          return;
       }
       LiveUrlSwitchReason liveUrlSwitc = new LiveUrlSwitchReason();
       liveUrlSwitc.mReleaseReason = 12;
       liveUrlSwitc.mRetryReason = p0;
       liveUrlSwitc.mEmptyDataDurationMs = 0;
       if (Util.isKSecurityErrorInMediaPlayer(p0, p1)) {
          DebugLog.i("LiveDataSourceProvider", "securityError occurred retryCount"+this.mSecurityErrorRetryCount+"what "+p0+"extra "+p1);
          if (this.mSecurityErrorRetryCount < 3) {
             this.dispatchReconnectFetchUrl(liveUrlSwitc);
             this.mSecurityErrorRetryCount = this.mSecurityErrorRetryCount + 1;
          }
       }else if(this.switchPlayUrl()){
          DebugLog.i("LiveDataSourceProvider", "error occurred switch to next url reason"+liveUrlSwitc);
          this.dispatchUrlSwitch(liveUrlSwitc);
       }else {
          DebugLog.i("LiveDataSourceProvider", "error occurred switch url fail reason"+liveUrlSwitc);
          this.dispatchReconnectFetchUrl(liveUrlSwitc);
       }
       return;
    }
    public void updateDataSource(ILiveDatasource p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveDataSourceProvider.class, "2")) {
          return;
       }
       this.mLiveDataSource = p0;
       p0.setSelectedQualityType(p1);
       this.initAdaptiveManifestSwitcher(this.mLiveDataSource.getCurrentDatasource());
       return;
    }
}
