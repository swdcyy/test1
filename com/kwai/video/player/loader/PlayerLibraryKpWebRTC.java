package com.kwai.video.player.loader.PlayerLibraryKpWebRTC;
import com.kwai.video.player.loader.PlayerLibrary;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.player.KsSoLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.System;

public class PlayerLibraryKpWebRTC extends PlayerLibrary	// class@000b58
{
    public final Map params;

    public void PlayerLibraryKpWebRTC(){
       super();
       this.params = new HashMap();
    }
    public String getDvaName(){
       return "kpwebrtc";
    }
    public boolean isEnabled(){
       return true;
    }
    public void onInstall(){
    }
    public synchronized void onLoaded(){
    }
    public void onParamChanged(String p0,Object p1){
    }
    public void tryLoadLibraryBuiltIn(KsSoLoader p0){
    }
    public void tryLoadLibraryDva(String p0,int p1){
       if (PatchProxy.isSupport(PlayerLibraryKpWebRTC.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayerLibraryKpWebRTC.class, "1")) {
          return;
       }
       System.loadLibrary("RtcMediaTransport");
       System.loadLibrary("kpwebrtc");
       return;
    }
    public void tryLoadLibraryDvaBefore(String p0,int p1){
    }
    public void tryLoadLibrarySdcard(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryKpWebRTC.class, "2")) {
          return;
       }
       p0.loadLibrary("RtcMediaTransport");
       p0.loadLibrary("kpwebrtc");
       return;
    }
}
