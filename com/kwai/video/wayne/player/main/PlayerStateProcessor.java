package com.kwai.video.wayne.player.main.PlayerStateProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.main.PlayerStateTracker;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnErrorListener$1;
import com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnCompletionListener$1;
import com.kwai.video.wayne.player.main.PlayerStateProcessor$mOnPreparedListener$1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.main.PlayerStateProcessor$onAttach$1;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import com.kwai.video.wayne.player.main.PlayerStateProcessor$onAttach$2;
import java.util.Set;

public final class PlayerStateProcessor extends AbsKpMidProcessor	// class@000d88
{
    public PlayerState mInnerPlayerState;
    public final IMediaPlayer$OnCompletionListener mOnCompletionListener;
    public final IMediaPlayer$OnErrorListener mOnErrorListener;
    public final IMediaPlayer$OnPreparedListener mOnPreparedListener;
    public PlayerState mPlayerState;
    public final Set mPlayerStateChangedListeners;
    public final PlayerStateTracker mPlayerStateTracker;
    public boolean mStartOnPrepared;

    public void PlayerStateProcessor(){
       super();
       PlayerState idle = PlayerState.Idle;
       this.mPlayerState = idle;
       this.mPlayerStateTracker = new PlayerStateTracker();
       this.mPlayerStateChangedListeners = new CopyOnWriteArraySet();
       this.mInnerPlayerState = idle;
       this.mOnErrorListener = new PlayerStateProcessor$mOnErrorListener$1(this);
       this.mOnCompletionListener = new PlayerStateProcessor$mOnCompletionListener$1(this);
       this.mOnPreparedListener = new PlayerStateProcessor$mOnPreparedListener$1(this);
    }
    public final PlayerState getInnerState(){
       return this.mInnerPlayerState;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, PlayerStateProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getLogTag()+"::PlayerStateProcessor": "PlayerStateProcessor";
       return obj;
    }
    public final PlayerState getState(){
       return this.mPlayerState;
    }
    public final void notifyStateChanged$kp_mid_release(PlayerState p0,boolean p1){
       PlayerStateProcessor playerStateP = PlayerStateProcessor.class;
       if (PatchProxy.isSupport(playerStateP) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, playerStateP, "6")) {
          return;
       }
       a.p(p0, "state");
       if (!this.isAttach()) {
          return;
       }
       if (p0 != this.mInnerPlayerState) {
          if (p0 == PlayerState.Error || p0 == PlayerState.Idle) {
             PlayerLoadingProcessor processor = this.getMediaPlayer().getProcessor(PlayerLoadingProcessor.class);
             if (processor != null) {
                processor.resetState();
             }
          }
          this.mPlayerStateTracker.track(p0, this.getLogTag());
          this.mInnerPlayerState = p0;
       }
       if (p0 != this.mPlayerState && !p1) {
          this.mPlayerState = p0;
          Iterator iterator = this.mPlayerStateChangedListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onStateChanged(p0);
          }
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, PlayerStateProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().addOnErrorListener(this.mOnErrorListener);
       this.getMediaPlayer().addCompletionListenerInterceptor(new PlayerStateProcessor$onAttach$1(this, this.mOnCompletionListener));
       this.getMediaPlayer().addPreparedListenerInterceptor(new PlayerStateProcessor$onAttach$2(this, this.mOnPreparedListener));
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, PlayerStateProcessor.class, "3")) {
          return;
       }
       this.mPlayerStateChangedListeners.clear();
       return;
    }
    public final void registerPlayerStateChangedListener(OnPlayerStateChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.mPlayerStateChangedListeners.add(p0);
       return;
    }
    public final void setStartOnPrepared$kp_mid_release(boolean p0){
       this.mStartOnPrepared = p0;
    }
    public final void unregisterPlayerStateChangedListener(OnPlayerStateChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerStateProcessor.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.mPlayerStateChangedListeners.remove(p0);
       return;
    }
}
