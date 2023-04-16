package com.kwai.video.wayne.player.WaynePlayerInitor;
import com.kwai.video.wayne.player.WaynePlayerInitor$Builder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.wayne.player.WaynePlayerInitor$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.hodor.HodorConfig;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule;
import bi7.d;
import bi7.a;
import com.kwai.video.wayne.player.WaynePlayerInitor$APP;
import com.kwai.video.wayne.player.WayneContext;
import com.kwai.video.wayne.player.util.PreferenceUtil;
import com.kwai.video.wayne.player.util.LocalDebugConfigPreference;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.util.DebugLog$LogInterface;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.logreport.LogReport;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import com.kwai.video.player.KlogObserver$KlogParam;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import com.kwai.video.wayne.debug.WayneDebug;
import com.kwai.video.wayne.debug.WayneDebug$Companion;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import com.kwai.video.cache.AwesomeCacheInitConfig;
import com.kwai.video.wayne.player.WaynePlayerInitor$2;
import com.kwai.video.player.KsSoLoader;

public class WaynePlayerInitor	// class@000cb8
{
    public AwesomeCacheParamsModule awesomeCacheParamsModule;
    public KlogObserver$KlogParam hodorKLogParam;
    public IKSLogReport loggerImpl;
    public KSConfigGetInterface mConfigGetImpl;
    public KlogObserver$KlogParam playerkLogParam;
    public WaynePlayerInitor$VodSoLoader sInjectedSoLoader;
    public AtomicBoolean sIsInitialized;
    public a vppResourceDownloader;
    public DebugLog$LogInterface wayneLogimpl;
    public static Context APP_CONTEXT;
    public static WaynePlayerInitor$Builder mBuilder;

    public void WaynePlayerInitor(WaynePlayerInitor$Builder p0){
       super();
       this.sIsInitialized = new AtomicBoolean(false);
       this.awesomeCacheParamsModule = p0.awesomeCacheParamsModule;
       this.sInjectedSoLoader = p0.sInjectedSoLoader;
       this.playerkLogParam = p0.playerkLogParam;
       this.hodorKLogParam = p0.hodorKLogParam;
       this.vppResourceDownloader = p0.vppResourceDownloader;
       this.wayneLogimpl = p0.wayneLogimpl;
       this.loggerImpl = p0.loggerImpl;
       this.mConfigGetImpl = p0.configGetImpl;
    }
    public void WaynePlayerInitor(WaynePlayerInitor$Builder p0,WaynePlayerInitor$1 p1){
       super(p0);
    }
    public static synchronized WaynePlayerInitor$Builder getBuilder(){
       _monitor_enter(WaynePlayerInitor.class);
       Object obj = PatchProxy.apply(null, null, WaynePlayerInitor.class, "10");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(WaynePlayerInitor.class);
          return obj;
       }else if(WaynePlayerInitor.mBuilder == null){
          WaynePlayerInitor.mBuilder = new WaynePlayerInitor$Builder(null);
       }
       _monitor_exit(WaynePlayerInitor.class);
       return WaynePlayerInitor.mBuilder;
    }
    public static boolean isApkInDebug(){
       Object obj = PatchProxy.apply(null, null, WaynePlayerInitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (WaynePlayerInitor.APP_CONTEXT.getApplicationInfo().flags & 0x02) {
             b = true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isSoLoadCompleted(){
       Object obj = PatchProxy.apply(null, null, WaynePlayerInitor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KsMediaPlayerInitConfig.isSoLibInited();
    }
    public void initAfterSoDown(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayerInitor.class, "3")) {
          return;
       }
       if (this.sIsInitialized.get()) {
          return;
       }
       this.initSo(p0);
       WaynePlayerInitor thodorKLogPa = this.hodorKLogParam;
       if (thodorKLogPa != null) {
          HodorConfig.setKlogParam(thodorKLogPa);
       }
       String str = "KwaiGiveMe";
       PlayerLibraryLoader.initSetParam("KEY_PARAMS_DEBUG_INFO_AUTH", str);
       HodorConfig.setHodorNativeDebugInfoAuthKey(str);
       this.setAwesomeCacheParams(this.awesomeCacheParamsModule);
       if (this.vppResourceDownloader != null) {
          d.c().e(this.vppResourceDownloader);
       }
       this.sIsInitialized.set(true);
       return;
    }
    public void initBeforeSoDown(Context p0,WaynePlayerInitor$APP p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayerInitor.class, "2")) {
          return;
       }
       WayneContext.app = p1;
       p0 = p0.getApplicationContext();
       WaynePlayerInitor.APP_CONTEXT = p0;
       PreferenceUtil.init(p0);
       LocalDebugConfigPreference.init(WaynePlayerInitor.APP_CONTEXT);
       WaynePlayerConfigImpl.init(p1);
       WaynePlayerConfigImpl.updateConfigImpl();
       WaynePlayerInitor tmConfigGetI = this.mConfigGetImpl;
       if (tmConfigGetI != null) {
          WaynePlayerConfigImpl.injectConfigGetImpl(tmConfigGetI);
       }
       tmConfigGetI = this.wayneLogimpl;
       if (tmConfigGetI != null) {
          DebugLog.setImpl(tmConfigGetI);
       }
       if (this.loggerImpl != null) {
          LogReport.get().setLogger(this.loggerImpl);
       }
       tmConfigGetI = this.playerkLogParam;
       if (tmConfigGetI != null) {
          KsMediaPlayerInitConfig.setPlayerKlogParam(tmConfigGetI);
       }
       PlayerConfigDebugInfo.KpMidVersion = "5.3.7.15.3854.dc0ae64.4589";
       if (WaynePlayerInitor.isApkInDebug()) {
          WayneDebug.Companion.getInstance().initialize();
       }
       return;
    }
    public final void initSo(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayerInitor.class, "6")) {
          return;
       }
       AwesomeCacheInitConfig.setSoLoader(new WaynePlayerInitor$1(this));
       AwesomeCacheInitConfig.init(p0);
       KsMediaPlayerInitConfig.setSoLoader(new WaynePlayerInitor$2(this));
       KsMediaPlayerInitConfig.init(p0);
       return;
    }
    public void initialize(Context p0,WaynePlayerInitor$APP p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayerInitor.class, "1")) {
          return;
       }
       if (this.sIsInitialized.get()) {
          return;
       }
       this.initBeforeSoDown(p0, p1);
       this.initAfterSoDown(p0);
       this.sIsInitialized.set(true);
       return;
    }
    public final boolean isDebugOrTest(){
       Object obj = PatchProxy.apply(null, this, WaynePlayerInitor.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (WaynePlayerInitor.isApkInDebug())? true: false;
       return b;
    }
    public boolean isInitialized(){
       Object obj = PatchProxy.apply(null, this, WaynePlayerInitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.sIsInitialized.get();
    }
    public final void setAwesomeCacheParams(AwesomeCacheParamsModule p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayerInitor.class, "9")) {
          return;
       }
       if (p0 != null) {
          HodorConfig.setCacheV2ScopeMaxBytes(p0.getAcheV2ScopeMaxBytes());
          HodorConfig.setSpeedKbpsThresholdForScopeSize(p0.getSpeedKbpsThresholdForScopeSize());
          HodorConfig.setScopeSizeAdjustConfig(p0.getHodorScopeSizeAdjustConfig());
          HodorConfig.setScopeMaxDownloadCnt(p0.getScopeMaxDownloadCnt());
          HodorConfig.setNetworkConnectWaitMs(p0.getNetworkConnectWaitMs());
          HodorConfig.setPreloadCronInterval(p0.getPreloadCronInterval());
          HodorConfig.enableBriefCDNLog(p0.isEnableBriefCDNLog());
          HodorConfig.setSocketBufSizeKbForPreload(p0.getSocketBufSizeKbForPreload());
          HodorConfig.setMediaCacheBytesLimit(p0.getMediaCacheBytesLimit());
       }
       return;
    }
}
