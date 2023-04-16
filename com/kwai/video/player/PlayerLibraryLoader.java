package com.kwai.video.player.PlayerLibraryLoader;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.video.player.loader.PlayerLoaderSdcardImpl;
import com.kwai.video.player.loader.LibraryBuiltInAemon;
import com.kwai.video.player.loader.PlayerLibraryAemon;
import com.kwai.video.player.KsPlayerCore;
import java.util.Map;
import com.kwai.video.player.loader.PlayerLibraryIjk;
import com.kwai.video.player.loader.PlayerLibraryKpWebRTC;
import com.kwai.video.player.loader.PlayerLibraryCommon;
import java.lang.String;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.loader.LibraryBuiltIn;
import java.lang.Enum;
import java.lang.Number;
import android.content.Context;
import com.kwai.video.player.KsSoLoader;
import com.kwai.video.player.kwai_player.Util;
import java.lang.StringBuilder;
import com.kwai.video.player.KlogObserver$KlogParam;
import java.lang.Boolean;
import ai7.d;
import com.kwai.video.player.loader.PlayerLibrary;
import com.kwai.video.player.PlayerLibraryLoader$DvaLoader;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.KlogObserver;

public class PlayerLibraryLoader	// class@000b06
{
    public int mAppVersionCode;
    public final LibraryBuiltIn mBuiltIn;
    public PlayerLibraryLoader$DvaLoader mDvaLoader;
    public final PlayerLoaderSdcardImpl mDvaLoaderFake;
    public boolean mEnableFakeDva;
    public boolean mEnableSdcardLoad;
    public final Map mLibraries;
    public final PlayerLoaderSdcardImpl mSdcardLoader;
    public boolean mUseAemonWebRTC;
    public KlogObserver$KlogParam mklogParam;
    public static PlayerLibraryLoader instance;

    public void PlayerLibraryLoader(){
       super();
       HashMap hashMap = new HashMap();
       this.mLibraries = hashMap;
       this.mSdcardLoader = new PlayerLoaderSdcardImpl();
       this.mDvaLoaderFake = new PlayerLoaderSdcardImpl(true);
       this.mBuiltIn = new LibraryBuiltInAemon();
       hashMap.put("AemonPlayerBuiltIn", new PlayerLibraryAemon(KsPlayerCore.PLAYER_CORE_AEMON));
       hashMap.put("KwaiplayerBuiltIn", new PlayerLibraryIjk(true));
       hashMap.put("AemonPlayerDVA", new PlayerLibraryAemon(KsPlayerCore.PLAYER_CORE_AEMON_HOTFIX));
       hashMap.put("KwaiplayerDVA", new PlayerLibraryIjk(false));
       hashMap.put("kpwebrtcDva", new PlayerLibraryKpWebRTC());
       hashMap.put("ffmpeg", new PlayerLibraryCommon("ffmpeg"));
       hashMap.put("hodor", new PlayerLibraryCommon("hodor"));
    }
    public static KsPlayerCore findCore(PlayerLibraryLoader$FindBestParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayerLibraryLoader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.findCore(p0);
    }
    public static int getCoreBuiltIn(){
       return PlayerLibraryLoader.getKsCoreBuiltIn().ordinal();
    }
    public static PlayerLibraryLoader getInstance(){
       PlayerLibraryLoader playerLibrar = PlayerLibraryLoader.class;
       Object obj = PatchProxy.apply(null, null, playerLibrar, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PlayerLibraryLoader.instance == null) {
          _monitor_enter(playerLibrar);
          if (PlayerLibraryLoader.instance == null) {
             PlayerLibraryLoader.instance = new PlayerLibraryLoader();
          }
          _monitor_exit(playerLibrar);
       }
       return PlayerLibraryLoader.instance;
    }
    public static KsPlayerCore getKsCoreBuiltIn(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.getCoreBuiltIn();
    }
    public static int getPlayerAliveCnt(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.getPlayerAliveCnt();
    }
    public static void initBuiltInLoad(Context p0,KsSoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlayerLibraryLoader.class, "6")) {
          return;
       }
       PlayerLibraryLoader.getInstance().mAppVersionCode = Util.getVersionCode(p0);
       PlayerLibraryLoader.getInstance().initFakeDva(p0);
       PlayerLibraryLoader.getInstance().initSdcardLoad(p0);
       PlayerLibraryLoader.getInstance().log("initBuiltInLoad: BUILT_IN_AEMON:true CODE:"+PlayerLibraryLoader.getInstance().mAppVersionCode);
       PlayerLibraryLoader.getInstance().loadSoBuiltIn("KwaiplayerBuiltIn", p1);
       PlayerLibraryLoader.getInstance().loadSoBuiltIn("AemonPlayerBuiltIn", p1);
       return;
    }
    public static void initBuiltInSetLog(KlogObserver$KlogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlayerLibraryLoader.class, "7")) {
          return;
       }
       PlayerLibraryLoader.initSetParam("KEY_PARAMS_LOG_PARAM", p0);
       PlayerLibraryLoader.getInstance().mklogParam = p0;
       return;
    }
    public static void initSetParam(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PlayerLibraryLoader.class, "16")) {
          return;
       }
       PlayerLibraryLoader.getInstance().setParam("KwaiplayerBuiltIn", p0, p1);
       PlayerLibraryLoader.getInstance().setParam("AemonPlayerBuiltIn", p0, p1);
       PlayerLibraryLoader.getInstance().setParam("KwaiplayerDVA", p0, p1);
       PlayerLibraryLoader.getInstance().setParam("AemonPlayerDVA", p0, p1);
       return;
    }
    public static boolean isAemonLoaded(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.isAemonLoaded();
    }
    public static boolean isKwaiplayerLoaded(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.isKwaiplayerLoaded();
    }
    public static boolean isUseAemonWebRTC(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().mUseAemonWebRTC;
    }
    public static boolean isWebRTCLoaded(){
       Object obj = PatchProxy.apply(null, null, PlayerLibraryLoader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlayerLibraryLoader.getInstance().mBuiltIn.isWebRTCLoaded();
    }
    public static void loadWebRTC(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlayerLibraryLoader.class, "13")) {
          return;
       }
       PlayerLibraryLoader.getInstance().mBuiltIn.loadWebRTC(p0);
       return;
    }
    public static void preloadAemon(){
       PlayerLibraryLoader.preloadCore();
    }
    public static void preloadCore(){
       if (PatchProxy.applyVoid(null, null, PlayerLibraryLoader.class, "15")) {
          return;
       }
       PlayerLibraryLoader.getInstance().mBuiltIn.preloadCore();
       return;
    }
    public static void preloadWebRTC(){
       if (PatchProxy.applyVoid(null, null, PlayerLibraryLoader.class, "11")) {
          return;
       }
       PlayerLibraryLoader.loadWebRTC("NORMAL");
       return;
    }
    public static void preloadWebRTCImmediate(){
       if (PatchProxy.applyVoid(null, null, PlayerLibraryLoader.class, "12")) {
          return;
       }
       PlayerLibraryLoader.loadWebRTC("UI");
       return;
    }
    public static void setPlayerSwitchProvider(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlayerLibraryLoader.class, "5")) {
          return;
       }
       PlayerLibraryLoader.getInstance().mEnableFakeDva = p0.getBoolean("debugPlayerEnableFakeDva", false);
       PlayerLibraryLoader.getInstance().mUseAemonWebRTC = p0.getBoolean("playerUseAemonWebRTC", false);
       return;
    }
    public int getDvaVersion(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayerLibraryLoader.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar == null) {
          return 0;
       }
       return playerLibrar.getDvaVersion();
    }
    public boolean hasError(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayerLibraryLoader.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar == null) {
          return false;
       }
       return playerLibrar.isDvaError();
    }
    public void initFakeDva(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryLoader.class, "18")) {
          return;
       }
       if (this.mEnableFakeDva != null) {
          this.mDvaLoaderFake.init(p0);
       }
       return;
    }
    public void initSdcardLoad(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryLoader.class, "17")) {
          return;
       }
       if (this.mEnableSdcardLoad != null) {
          boolean b = this.mSdcardLoader.init(p0);
          this.log("initSdcardLoad init ret:"+b);
          if (b) {
             PlayerLibraryLoader.getInstance().mBuiltIn.loadFromSdcard();
             this.log("initSdcardLoad loadFromSdcard");
          }
       }
       return;
    }
    public boolean isLoaded(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayerLibraryLoader.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar == null) {
          return false;
       }
       return playerLibrar.isLoaded();
    }
    public final void loadSoBuiltIn(String p0,KsSoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibraryLoader.class, "22")) {
          return;
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar == null || !playerLibrar.isEnabled()) {
          this.log("loadSoBuiltIn "+p0+" failed, return");
          return;
       }else {
          this.log("loadSoBuiltIn "+p0+" ret:"+playerLibrar.tryLoadLibrary(p1));
          return;
       }
    }
    public void loadSoFromDva(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryLoader.class, "21")) {
          return;
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       String str = "loadSoFromDva ";
       if (playerLibrar != null && (!playerLibrar.isEnabled() || this.mDvaLoader == null)) {
          this.log(str+p0+" failed, return");
          return;
       }else if(this.mEnableFakeDva != null){
          playerLibrar.loadFromLoader(this.mDvaLoaderFake);
          if (playerLibrar.isLoaded()) {
             this.log(str+p0+" mEnableFakeDva succ, return");
             return;
          }
       }
       this.log("loadSoFromDva key:"+p0+", fake:"+this.mEnableFakeDva+", ret:"+playerLibrar.loadFromLoader(this.mDvaLoader));
       return;
    }
    public void loadSoFromSdcard(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryLoader.class, "20")) {
          return;
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar != null && (this.mSdcardLoader == null || !playerLibrar.isEnabled())) {
          this.log("loadSoFromSdcard "+p0+" failed, return");
          return;
       }else {
          this.log("loadSoFromSdcard "+p0+" ret:"+playerLibrar.loadFromLoader(this.mSdcardLoader));
          return;
       }
    }
    public void log(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryLoader.class, "27")) {
          return;
       }
       PlayerLibraryLoader tmklogParam = this.mklogParam;
       if (tmklogParam != null && (tmklogParam.logCb != null && !TextUtils.isEmpty(p0))) {
          this.mklogParam.logCb.onLog(1, ("[PlayerLibrary] "+p0).getBytes());
       }
    label_0036 :
       return;
    }
    public void setDvaLoader(PlayerLibraryLoader$DvaLoader p0){
       this.mDvaLoader = p0;
    }
    public void setDvaPriority(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibraryLoader.class, "19")) {
          return;
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar != null && playerLibrar.isEnabled()) {
          if (this.mDvaLoader == null) {
             return;
          }else {
             this.log("setDvaPriority "+p0+" priority:"+p1);
             playerLibrar.setDvaPriority(this.mDvaLoader, p1);
          }
       }
       return;
    }
    public void setParam(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PlayerLibraryLoader.class, "26")) {
          return;
       }
       PlayerLibrary playerLibrar = this.mLibraries.get(p0);
       if (playerLibrar != null && playerLibrar.isEnabled()) {
          playerLibrar.setParam(p1, p2);
       }
       return;
    }
    public boolean shouldHijackLoad(String p0){
       return false;
    }
}
