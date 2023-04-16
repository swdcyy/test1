package com.kwai.video.player.loader.LibraryBuiltIn;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.PlayerLibraryLoader$FindBestParam;
import com.kwai.video.player.KsPlayerCore;
import java.lang.Boolean;
import com.kwai.video.player.PlayerLibraryLoader;
import java.lang.Integer;
import java.lang.StringBuilder;
import ai7.d;
import com.kwai.video.player.KsMediaPlayerInitConfig;

public abstract class LibraryBuiltIn	// class@000b50
{

    public void LibraryBuiltIn(){
       super();
    }
    public static String getDvaPriority(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LibraryBuiltIn.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || !p0.contains("-priority")) {
          return "INIT";
       }
       if (p0.contains("-priority=ui")) {
          return "UI";
       }
       if (p0.contains("-priority=normal")) {
          return "NORMAL";
       }
       if (p0.contains("-priority=pre")) {
          return "PRE";
       }
       if (p0.contains("-priority=enqueue")) {
          return "ENQUEUE";
       }
       if (p0.contains("-priority=init")) {
          return "INIT";
       }
       return "NORMAL";
    }
    public abstract KsPlayerCore findCore(PlayerLibraryLoader$FindBestParam p0);
    public abstract KsPlayerCore getCoreBuiltIn();
    public abstract int getPlayerAliveCnt();
    public boolean isAemonBizSupported(PlayerLibraryLoader$FindBestParam p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LibraryBuiltIn.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mIsLive != null) {
          if (p0.mIsWebRTC != null && !PlayerLibraryLoader.isUseAemonWebRTC()) {
             return false;
          }else if(p0.mIsPaidLive != null && p1.contains("-disablePaidLive")){
             return false;
          }else if(p0.mIsPrivateLive != null && p1.contains("-disablePrivateLive")){
             return false;
          }
       }
       if (p0.mIsKsMediaplayer != null && p1.contains("-disableKsMediaPlayer")) {
          return false;
       }else {
          return true;
       }
    }
    public abstract boolean isAemonLoaded();
    public boolean isAppVersionMatch(String p0,int p1){
       LibraryBuiltIn libraryBuilt = LibraryBuiltIn.class;
       if (PatchProxy.isSupport(libraryBuilt)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, libraryBuilt, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (!p1) {
          return b;
       }else if(p0.contains("-appablack\(ver") && p0.contains("-appablack\(ver="+p1+"\)")){
          return false;
       }else if(p0.contains("-app\(ver")){
          return p0.contains("-app\(ver="+p1+"\)");
       }else {
          return b;
       }
    }
    public boolean isDvaVersionMatch(String p0,int p1){
       LibraryBuiltIn libraryBuilt = LibraryBuiltIn.class;
       if (PatchProxy.isSupport(libraryBuilt)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, libraryBuilt, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0.contains("-dvablack\(ver") && p0.contains("-dvablack\(ver="+p1+"\)")) {
          return false;
       }else if(p0.contains("-dva\(ver")){
          return p0.contains("-dva\(ver="+p1+"\)");
       }else {
          return true;
       }
    }
    public abstract boolean isKwaiplayerLoaded();
    public abstract boolean isWebRTCLoaded();
    public void loadAemon(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryBuiltIn.class, "2")) {
          return;
       }
       PlayerLibraryLoader.getInstance().setDvaPriority("AemonPlayerDVA", LibraryBuiltIn.getDvaPriority(p0));
       PlayerLibraryLoader.getInstance().loadSoFromDva("AemonPlayerDVA");
       return;
    }
    public abstract void loadFromSdcard();
    public void loadIjk(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LibraryBuiltIn.class, "3")) {
          return;
       }
       PlayerLibraryLoader.getInstance().setDvaPriority("KwaiplayerDVA", LibraryBuiltIn.getDvaPriority(p0));
       PlayerLibraryLoader.getInstance().loadSoFromDva("KwaiplayerDVA");
       return;
    }
    public abstract void loadWebRTC(String p0);
    public void preloadCore(){
       if (PatchProxy.applyVoid(null, this, LibraryBuiltIn.class, "1")) {
          return;
       }
       d playerSwitch = KsMediaPlayerInitConfig.getPlayerSwitchProvider();
       if (playerSwitch == null) {
          return;
       }
       PlayerLibraryLoader$FindBestParam uFindBestPar = new PlayerLibraryLoader$FindBestParam();
       uFindBestPar.mProvider = playerSwitch;
       this.findCore(uFindBestPar);
       return;
    }
}
