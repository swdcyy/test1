package com.kwai.video.player.loader.PlayerLibrary;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.PlayerLibraryLoader$DvaLoader;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.player.loader.PlayerLibrary$1;
import com.kwai.video.player.PlayerLibraryLoader$DvaListener;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.player.KsSoLoader;

public abstract class PlayerLibrary	// class@000b54
{
    public int dvaRetryCount;
    public int dvaVersion;
    public boolean isDvaError;
    public boolean isDvaLoading;
    public boolean isLoaded;
    public boolean isTriggerInstall;
    public boolean isTriggerOnLoad;

    public void PlayerLibrary(){
       super();
    }
    public abstract String getDvaName();
    public int getDvaVersion(){
       return this.dvaVersion;
    }
    public void install(){
       if (PatchProxy.applyVoid(null, this, PlayerLibrary.class, "4")) {
          return;
       }
       this.triggerInstall();
       this.isLoaded = true;
       this.triggerOnLoad();
       return;
    }
    public boolean isDvaError(){
       return this.isDvaError;
    }
    public abstract boolean isEnabled();
    public boolean isLoaded(){
       return this.isLoaded;
    }
    public synchronized int loadFromLoader(PlayerLibraryLoader$DvaLoader p0){
       PlayerLibrary obj = PatchProxy.applyOneRefs(p0, this, PlayerLibrary.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.isEnabled()) {
          return -1;
       }
       if (this.isLoaded != null) {
          return -2;
       }
       if (this.isDvaLoading != null) {
          return -3;
       }
       obj = this.dvaRetryCount;
       if (obj > 5) {
          return -4;
       }
       this.dvaRetryCount = obj + 1;
       this.isDvaLoading = true;
       p0.load(this, new PlayerLibrary$1(this, p0));
       return 0;
    }
    public void log(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLibrary.class, "8")) {
          return;
       }
       PlayerLibraryLoader.getInstance().log(p0);
       return;
    }
    public abstract void onInstall();
    public abstract void onLoaded();
    public abstract void onParamChanged(String p0,Object p1);
    public final void setDvaPriority(PlayerLibraryLoader$DvaLoader p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibrary.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setPriority(this.getDvaName(), p1);
       return;
    }
    public synchronized void setParam(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLibrary.class, "1")) {
          return;
       }
       this.onParamChanged(p0, p1);
       return;
    }
    public final void triggerInstall(){
       if (PatchProxy.applyVoid(null, this, PlayerLibrary.class, "6")) {
          return;
       }
       if (this.isTriggerInstall != null) {
          return;
       }
       this.onInstall();
       this.isTriggerInstall = true;
       return;
    }
    public final void triggerOnLoad(){
       if (PatchProxy.applyVoid(null, this, PlayerLibrary.class, "5")) {
          return;
       }
       if (this.isTriggerOnLoad != null) {
          return;
       }
       this.onLoaded();
       this.isTriggerOnLoad = true;
       return;
    }
    public int tryLoadLibrary(KsSoLoader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayerLibrary.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       _monitor_enter(this);
       if (this.isLoaded != null) {
          _monitor_exit(this);
          return -2;
       }else {
          this.tryLoadLibraryBuiltIn(p0);
          this.install();
          _monitor_exit(this);
          return 0;
       }
    }
    public abstract void tryLoadLibraryBuiltIn(KsSoLoader p0);
    public abstract void tryLoadLibraryDva(String p0,int p1);
    public abstract void tryLoadLibraryDvaBefore(String p0,int p1);
    public abstract void tryLoadLibrarySdcard(KsSoLoader p0);
}
