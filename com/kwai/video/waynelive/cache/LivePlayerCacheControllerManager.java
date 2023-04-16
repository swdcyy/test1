package com.kwai.video.waynelive.cache.LivePlayerCacheControllerManager;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kwai.video.waynelive.cache.LivePlayerCacheController;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.cache.LivePlayerCacheType;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;
import java.lang.Integer;
import com.kwai.video.waynelive.cache.LiveTsptInfoCache;
import com.kwai.video.waynelive.util.SeiExtraData;

public class LivePlayerCacheControllerManager	// class@000ddd
{
    public boolean mIsStarted;
    public final Map mPlayerCacheControllerMap;

    public void LivePlayerCacheControllerManager(){
       super();
       this.mPlayerCacheControllerMap = new HashMap();
       this.mIsStarted = false;
    }
    public void end(){
       if (PatchProxy.applyVoid(null, this, LivePlayerCacheControllerManager.class, "3")) {
          return;
       }
       this.mIsStarted = false;
       Iterator iterator = this.mPlayerCacheControllerMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().end();
       }
       return;
    }
    public boolean isStarted(){
       return this.mIsStarted;
    }
    public void notifyAAC(LivePlayerEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "7")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.AAC);
       if (livePlayerCa != null) {
          livePlayerCa.notifyIfNeed(p0);
       }
       return;
    }
    public void notifyInterActiveTspt(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "5")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.INTER_ACTIVE_TSPT);
       if (livePlayerCa != null) {
          livePlayerCa.notifyIfNeed(p0);
       }
       return;
    }
    public void notifySeiInfo(IKwaiMediaPlayer$OnLiveSeiInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "4")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.SEI_INFO);
       if (livePlayerCa != null) {
          livePlayerCa.notifyIfNeed(p0);
       }
       return;
    }
    public void notifySrvTspt(IKwaiMediaPlayer$OnLiveSrvTsptInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "6")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.SRV_TSPT);
       if (livePlayerCa != null) {
          livePlayerCa.notifyIfNeed(p0);
       }
       return;
    }
    public void onAACChanged(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "9")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.AAC);
       if (livePlayerCa != null) {
          livePlayerCa.setDataIfNeed(p0);
       }
       return;
    }
    public void onInterActiveTsptInfoChanged(byte[] p0,int p1){
       LivePlayerCacheControllerManager livePlayerCa = LivePlayerCacheControllerManager.class;
       if (PatchProxy.isSupport(livePlayerCa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, livePlayerCa, "11")) {
          return;
       }
       LivePlayerCacheController livePlayerCa1 = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.INTER_ACTIVE_TSPT);
       if (livePlayerCa1 != null) {
          livePlayerCa1.setDataIfNeed(new LiveTsptInfoCache(p0, p1));
       }
       return;
    }
    public void onSeiExtraDataChanged(SeiExtraData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheControllerManager.class, "8")) {
          return;
       }
       LivePlayerCacheController livePlayerCa = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.SEI_INFO);
       if (livePlayerCa != null) {
          livePlayerCa.setDataIfNeed(p0);
       }
       return;
    }
    public void onSrvTsptInfoChanged(byte[] p0,int p1){
       LivePlayerCacheControllerManager livePlayerCa = LivePlayerCacheControllerManager.class;
       if (PatchProxy.isSupport(livePlayerCa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, livePlayerCa, "10")) {
          return;
       }
       LivePlayerCacheController livePlayerCa1 = this.mPlayerCacheControllerMap.get(LivePlayerCacheType.SRV_TSPT);
       if (livePlayerCa1 != null) {
          livePlayerCa1.setDataIfNeed(new LiveTsptInfoCache(p0, p1));
       }
       return;
    }
    public void registerCacheController(LivePlayerCacheType p0,LivePlayerCacheController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayerCacheControllerManager.class, "1")) {
          return;
       }
       this.mPlayerCacheControllerMap.put(p0, p1);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, LivePlayerCacheControllerManager.class, "2")) {
          return;
       }
       this.mIsStarted = true;
       Iterator iterator = this.mPlayerCacheControllerMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().start();
       }
       return;
    }
}
