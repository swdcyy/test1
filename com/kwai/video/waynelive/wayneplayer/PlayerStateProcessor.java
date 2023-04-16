package com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.LivePlayerState;
import com.kwai.video.waynelive.wayneplayer.PlayerStateTracker;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor$mOnErrorListener$1;
import com.kwai.video.waynelive.wayneplayer.PlayerStateProcessor$mOnPreparedListener$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.kwai.video.waynelive.debug.DebugLog;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;

public final class PlayerStateProcessor extends AbsWayneProcessor	// class@000e32
{
    public LivePlayerState mInnerPlayerState;
    public final LivePlayerErrorListener mOnErrorListener;
    public final IMediaPlayer$OnPreparedListener mOnPreparedListener;
    public LivePlayerState mPlayerState;
    public final Set mPlayerStateChangedListeners;
    public final PlayerStateTracker mPlayerStateTracker;

    public void PlayerStateProcessor(){
       super();
       LivePlayerState iDLE = LivePlayerState.IDLE;
       this.mPlayerState = iDLE;
       this.mPlayerStateTracker = new PlayerStateTracker();
       this.mPlayerStateChangedListeners = new CopyOnWriteArraySet();
       this.mInnerPlayerState = iDLE;
       this.mOnErrorListener = new PlayerStateProcessor$mOnErrorListener$1(this);
       this.mOnPreparedListener = new PlayerStateProcessor$mOnPreparedListener$1(this);
    }
    public final LivePlayerState getInnerState(){
       return this.mInnerPlayerState;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, PlayerStateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getTag()+"::PlayerStateProcessor": "PlayerStateProcessor";
       return obj;
    }
    public final LivePlayerState getState(){
       return this.mPlayerState;
    }
    public final void notifyStateChanged(LivePlayerState p0,boolean p1){
       PlayerStateProcessor playerStateP = PlayerStateProcessor.class;
       if (PatchProxy.isSupport(playerStateP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, playerStateP, "6")) {
          return;
       }
       a.p(p0, "state");
       if (!this.isAttach()) {
          if (p0 == LivePlayerState.DESTROY) {
             this.mInnerPlayerState = p0;
          }
          return;
       }else if(p0 != this.mInnerPlayerState){
          this.mPlayerStateTracker.track(p0, this.getLogTag());
          this.mInnerPlayerState = p0;
       }
       if (p0 != this.mPlayerState && !p1) {
          this.mPlayerState = p0;
          DebugLog.i(this.getLogTag(), "notifyStateChanged:"+this.mPlayerState+" size:"+this.mPlayerStateChangedListeners.size());
          Iterator iterator = this.mPlayerStateChangedListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onStateChange(p0);
          }
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, PlayerStateProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().addLivePlayerErrorListener(this.mOnErrorListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, PlayerStateProcessor.class, "3")) {
          return;
       }
       this.mPlayerStateChangedListeners.clear();
       return;
    }
    public final void registerPlayerStateChangedListener(LivePlayerStateChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.mPlayerStateChangedListeners.add(p0);
       return;
    }
    public final void unregisterPlayerStateChangedListener(LivePlayerStateChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.mPlayerStateChangedListeners.remove(p0);
       return;
    }
}
