package com.kwai.video.player.loader.PlayerLibraryAemon;
import com.kwai.video.player.loader.PlayerLibrary;
import com.kwai.video.player.KsPlayerCore;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter;
import com.kwai.video.player.KlogObserver$KlogParam;
import com.kwai.video.player.KsSoLoader;
import java.lang.Integer;
import java.lang.System;
import com.kwai.video.aemonplayer.AemonHotfix;

public class PlayerLibraryAemon extends PlayerLibrary	// class@000b55
{
    public final KsPlayerCore core;
    public final Map params;

    public void PlayerLibraryAemon(KsPlayerCore p0){
       super();
       this.params = new HashMap();
       this.core = p0;
    }
    public String getDvaName(){
       return "aemon_player";
    }
    public boolean isEnabled(){
       return true;
    }
    public void onInstall(){
    }
    public synchronized void onLoaded(){
       if (PatchProxy.applyVoid(null, this, PlayerLibraryAemon.class, "2")) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibraryAemon.class, "1")) {
          return;
       }
       if (this.isLoaded == null) {
          this.params.put(p0, p1);
          return;
       }else if(TextUtils.equals(p0, "KEY_PARAMS_LIVE_ENCRYPT_KEY")){
          AemonMediaPlayerAdapter.getStaticMethod(this.core).setPlayerEncryptLiveDebugInfoKey(p1);
       }
       if (TextUtils.equals(p0, "KEY_PARAMS_LOG_PARAM")) {
          AemonMediaPlayerAdapter.getStaticMethod(this.core).native_setKlogParam(p1);
       }
       if (TextUtils.equals(p0, "KEY_PARAMS_DEBUG_INFO_AUTH")) {
          AemonMediaPlayerAdapter.getStaticMethod(this.core).setPlayerNativeDebugInfoAuthKey(p1);
       }
       return;
    }
    public void tryLoadLibraryBuiltIn(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryAemon.class, "5")) {
          return;
       }
       p0.loadLibrary("AemonPlayer");
       return;
    }
    public void tryLoadLibraryDva(String p0,int p1){
       if (PatchProxy.isSupport(PlayerLibraryAemon.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayerLibraryAemon.class, "4")) {
          return;
       }
       System.loadLibrary("AemonPlayer_dva");
       return;
    }
    public void tryLoadLibraryDvaBefore(String p0,int p1){
       if (PatchProxy.isSupport(PlayerLibraryAemon.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayerLibraryAemon.class, "3")) {
          return;
       }
       AemonHotfix.install();
       return;
    }
    public void tryLoadLibrarySdcard(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryAemon.class, "6")) {
          return;
       }
       p0.loadLibrary("AemonPlayer");
       return;
    }
}
