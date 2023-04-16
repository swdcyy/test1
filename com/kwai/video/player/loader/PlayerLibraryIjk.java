package com.kwai.video.player.loader.PlayerLibraryIjk;
import com.kwai.video.player.loader.PlayerLibrary;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.player.KlogObserver$KlogParam;
import com.kwai.video.player.KsSoLoader;
import java.lang.Integer;
import java.lang.System;

public class PlayerLibraryIjk extends PlayerLibrary	// class@000b57
{
    public final boolean builtIn;
    public final Map params;

    public void PlayerLibraryIjk(boolean p0){
       super();
       this.params = new HashMap();
       this.builtIn = p0;
    }
    public String getDvaName(){
       return "kwai_player";
    }
    public boolean isEnabled(){
       if (this.builtIn != null) {
          return false;
       }
       return true;
    }
    public void onInstall(){
       if (PatchProxy.applyVoid(null, this, PlayerLibraryIjk.class, "3")) {
          return;
       }
       PlayerLibraryLoader.getInstance().log("[KsMediaPlayerInitConfig.init] to KwaiMediaPlayer.native_init start");
       KwaiMediaPlayer.native_init_install();
       PlayerLibraryLoader.getInstance().log("[KsMediaPlayerInitConfig.init] to KwaiMediaPlayer.native_init end");
       return;
    }
    public synchronized void onLoaded(){
       if (PatchProxy.applyVoid(null, this, PlayerLibraryIjk.class, "2")) {
          return;
       }
       if (this.params.containsKey("KEY_PARAMS_LIVE_ENCRYPT_KEY")) {
          this.onParamChanged("KEY_PARAMS_LIVE_ENCRYPT_KEY", this.params.get("KEY_PARAMS_LIVE_ENCRYPT_KEY"));
       }
       if (this.params.containsKey("KEY_PARAMS_LOG_PARAM")) {
          this.onParamChanged("KEY_PARAMS_LOG_PARAM", this.params.get("KEY_PARAMS_LOG_PARAM"));
       }
       if (this.params.containsKey("KEY_PARAMS_DEBUG_INFO_AUTH")) {
          this.onParamChanged("KEY_PARAMS_DEBUG_INFO_AUTH", this.params.get("KEY_PARAMS_DEBUG_INFO_AUTH"));
       }
       this.params.clear();
       return;
    }
    public synchronized void onParamChanged(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibraryIjk.class, "1")) {
          return;
       }
       if (this.isLoaded == null) {
          this.params.put(p0, p1);
          return;
       }else if(TextUtils.equals(p0, "KEY_PARAMS_LIVE_ENCRYPT_KEY")){
          KwaiMediaPlayer.setPlayerEncryptLiveDebugInfoKey(p1);
       }
       if (TextUtils.equals(p0, "KEY_PARAMS_DEBUG_INFO_AUTH")) {
          KwaiMediaPlayer.setPlayerNativeDebugInfoAuthKey(p1);
       }
       if (TextUtils.equals(p0, "KEY_PARAMS_LOG_PARAM")) {
          KwaiMediaPlayer.native_setKlogParam(p1);
       }
       return;
    }
    public void tryLoadLibraryBuiltIn(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryIjk.class, "5")) {
          return;
       }
       p0.loadLibrary("kwaiplayer");
       return;
    }
    public void tryLoadLibraryDva(String p0,int p1){
       if (PatchProxy.isSupport(PlayerLibraryIjk.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayerLibraryIjk.class, "4")) {
          return;
       }
       System.loadLibrary("kwaiplayer_dva");
       return;
    }
    public void tryLoadLibraryDvaBefore(String p0,int p1){
    }
    public void tryLoadLibrarySdcard(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryIjk.class, "6")) {
          return;
       }
       p0.loadLibrary("kwaiplayer");
       return;
    }
}
