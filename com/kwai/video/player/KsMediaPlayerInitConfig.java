package com.kwai.video.player.KsMediaPlayerInitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import android.content.Context;
import com.kwai.video.player.KsSoLoader;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.KsMediaPlayerInitConfig$3;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import com.kwai.video.player.KsMediaPlayerInitConfig$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.player.KsMediaPlayerInitConfig$2;
import wt6.b$b;
import wt6.b;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.KlogObserver$KlogParam;
import java.lang.Number;
import ai7.d;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.RuntimeException;
import android.content.pm.PackageManager$NameNotFoundException;
import com.kwai.video.hodor.util.Timber;
import com.kwai.player.network.KwaiNetworkMonitor;
import java.lang.Boolean;

public class KsMediaPlayerInitConfig	// class@000af2
{
    public static String packageName;
    public static String packageVersion;
    public static final AtomicBoolean sInitialized;
    public static KsSoLoader sInjectedSoLoader;
    public static KlogObserver$KlogParam sKlogParam;
    public static final AtomicBoolean sPreInitialized;
    public static final AtomicBoolean sSoLibInited;
    public static d sSwitchProvider;
    public static long sVVCount;

    static {
       KsMediaPlayerInitConfig.sSoLibInited = new AtomicBoolean(false);
       KsMediaPlayerInitConfig.sInitialized = new AtomicBoolean(false);
       KsMediaPlayerInitConfig.sPreInitialized = new AtomicBoolean(false);
       KsMediaPlayerInitConfig.sVVCount = -1;
    }
    public void KsMediaPlayerInitConfig(){
       super();
    }
    public static KsSoLoader CreateSoLoader(Context p0,KsSoLoader p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KsMediaPlayerInitConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsMediaPlayerInitConfig$3(p1, p0);
    }
    public static void builtInCheckDeps(Context p0,KsSoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KsMediaPlayerInitConfig.class, "4")) {
          return;
       }
       KSFFmpegAARDistribution.disableCheck();
       KSFFmpegAARDistribution.checkAbiAndLoadFFmpeg("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", new KsMediaPlayerInitConfig$1(p1, p0));
       b.a("v5.15.0.13", new KsMediaPlayerInitConfig$2(p1, p0));
       return;
    }
    public static void builtInLoad(Context p0,KsSoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KsMediaPlayerInitConfig.class, "5")) {
          return;
       }
       PlayerLibraryLoader.initBuiltInLoad(p0, p1);
       return;
    }
    public static void builtInSetKlogParam(KlogObserver$KlogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayerInitConfig.class, "6")) {
          return;
       }
       PlayerLibraryLoader.initBuiltInSetLog(p0);
       return;
    }
    public static int getPlayerAliveCnt(){
       Object obj = PatchProxy.apply(null, null, KsMediaPlayerInitConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!KsMediaPlayerInitConfig.isSoLibInited()) {
          return -1;
       }
       return PlayerLibraryLoader.getPlayerAliveCnt();
    }
    public static synchronized d getPlayerSwitchProvider(){
       _monitor_enter(KsMediaPlayerInitConfig.class);
       _monitor_exit(KsMediaPlayerInitConfig.class);
       return KsMediaPlayerInitConfig.sSwitchProvider;
    }
    public static synchronized long getVVCount(){
       _monitor_enter(KsMediaPlayerInitConfig.class);
       _monitor_exit(KsMediaPlayerInitConfig.class);
       return KsMediaPlayerInitConfig.sVVCount;
    }
    public static void init(Context p0){
       KsMediaPlayerInitConfig.initialize(p0, KsMediaPlayerInitConfig.sKlogParam, KsMediaPlayerInitConfig.sInjectedSoLoader);
    }
    public static void initPackageName(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayerInitConfig.class, "8")) {
          return;
       }
       PackageManager packageManag = p0.getPackageManager();
       try{
          PackageInfo packageInfo = packageManag.getPackageInfo(p0.getPackageName(), 0);
          if (packageInfo != null) {
             KsMediaPlayerInitConfig.packageName = packageInfo.packageName;
             KsMediaPlayerInitConfig.packageVersion = packageInfo.versionName;
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e3){
          e3.printStackTrace();
       }catch(java.lang.RuntimeException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static void initialize(Context p0,KlogObserver$KlogParam p1,KsSoLoader p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KsMediaPlayerInitConfig.class, "3")) {
          return;
       }
       AtomicBoolean sInitialized = KsMediaPlayerInitConfig.sInitialized;
       if (sInitialized.get()) {
          return;
       }
       Context applicationC = p0.getApplicationContext();
       KsSoLoader ksSoLoader = KsMediaPlayerInitConfig.CreateSoLoader(applicationC, p2);
       KsMediaPlayerInitConfig.builtInSetKlogParam(p1);
       ksSoLoader.loadLibrary("c++_shared");
       KsMediaPlayerInitConfig.builtInCheckDeps(applicationC, p2);
       KsMediaPlayerInitConfig.builtInLoad(applicationC, ksSoLoader);
       KsMediaPlayerInitConfig.sSoLibInited.set(true);
       Object[] objArray = new Object[0];
       Timber.v("[KsMediaPlayerInitConfig.init] to initPackageName", objArray);
       KsMediaPlayerInitConfig.initPackageName(p0);
       Object[] objArray1 = new Object[0];
       Timber.v("[KsMediaPlayerInitConfig.init] all finish", objArray1);
       KwaiNetworkMonitor.getInstance().startMonitoring(applicationC);
       sInitialized.set(true);
       return;
    }
    public static boolean isInitialized(){
       Object obj = PatchProxy.apply(null, null, KsMediaPlayerInitConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KsMediaPlayerInitConfig.sInitialized.get();
    }
    public static boolean isSoLibInited(){
       Object obj = PatchProxy.apply(null, null, KsMediaPlayerInitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KsMediaPlayerInitConfig.sSoLibInited.get();
    }
    public static void preInitialize(Context p0,KsSoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KsMediaPlayerInitConfig.class, "2")) {
          return;
       }
       AtomicBoolean sPreInitiali = KsMediaPlayerInitConfig.sPreInitialized;
       if (sPreInitiali.get()) {
          return;
       }
       p0 = p0.getApplicationContext();
       KsMediaPlayerInitConfig.builtInLoad(p0, KsMediaPlayerInitConfig.CreateSoLoader(p0, p1));
       sPreInitiali.set(true);
       return;
    }
    public static void setPlayerEncryptLiveDebugInfoKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayerInitConfig.class, "11")) {
          return;
       }
       PlayerLibraryLoader.initSetParam("KEY_PARAMS_LIVE_ENCRYPT_KEY", p0);
       return;
    }
    public static void setPlayerKlogParam(KlogObserver$KlogParam p0){
       KsMediaPlayerInitConfig.sKlogParam = p0;
    }
    public static synchronized void setPlayerSwitchProvider(d p0){
       _monitor_enter(KsMediaPlayerInitConfig.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, KsMediaPlayerInitConfig.class, "12")) {
          _monitor_exit(KsMediaPlayerInitConfig.class);
          return;
       }else {
          KsMediaPlayerInitConfig.sSwitchProvider = p0;
          PlayerLibraryLoader.setPlayerSwitchProvider(p0);
          _monitor_exit(KsMediaPlayerInitConfig.class);
          return;
       }
    }
    public static void setSoLoader(KsSoLoader p0){
       KsMediaPlayerInitConfig.sInjectedSoLoader = p0;
    }
    public static synchronized void setVVCount(long p0){
       _monitor_enter(KsMediaPlayerInitConfig.class);
       KsMediaPlayerInitConfig.sVVCount = p0;
       _monitor_exit(KsMediaPlayerInitConfig.class);
    }
}
