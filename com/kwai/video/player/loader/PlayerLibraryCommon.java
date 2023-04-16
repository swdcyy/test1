package com.kwai.video.player.loader.PlayerLibraryCommon;
import com.kwai.video.player.loader.PlayerLibrary;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.player.KsSoLoader;
import java.lang.Integer;
import java.lang.System;

public class PlayerLibraryCommon extends PlayerLibrary	// class@000b56
{
    public final String soname;

    public void PlayerLibraryCommon(String p0){
       super();
       this.soname = p0;
    }
    public String getDvaName(){
       Object obj = PatchProxy.apply(null, this, PlayerLibraryCommon.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "common_dva_"+this.soname;
    }
    public boolean isEnabled(){
       return true;
    }
    public void onInstall(){
    }
    public void onLoaded(){
    }
    public void onParamChanged(String p0,Object p1){
    }
    public void tryLoadLibraryBuiltIn(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryCommon.class, "2")) {
          return;
       }
       p0.loadLibrary(this.soname);
       return;
    }
    public void tryLoadLibraryDva(String p0,int p1){
       if (PatchProxy.isSupport(PlayerLibraryCommon.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayerLibraryCommon.class, "1")) {
          return;
       }
       System.loadLibrary(this.soname);
       return;
    }
    public void tryLoadLibraryDvaBefore(String p0,int p1){
    }
    public void tryLoadLibrarySdcard(KsSoLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibraryCommon.class, "3")) {
          return;
       }
       p0.loadLibrary(this.soname);
       return;
    }
}
