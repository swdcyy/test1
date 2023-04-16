package com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import java.lang.String;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mOnInfoListener$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$OnInfoExtraListener$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$prepareStartRunable$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$seekRunable$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mWayneErrorListener$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mOnSeekListener$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mPauseListener$1;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mStartListener$1;
import com.kwai.video.wayne.player.listeners.OnPlayerActualPlayingChangedListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Boolean;
import android.os.Handler;
import java.lang.Runnable;
import com.kwai.video.wayne.player.main.LoadingType;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.wayne.player.listeners.OnSeekListener;
import com.kwai.video.wayne.player.listeners.OnPauseListener;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.listeners.OnWayneErrorListener;

public final class PlayerLoadingProcessor extends AbsKpMidProcessor	// class@000d81
{
    public final IMediaPlayer$OnInfoExtraListener OnInfoExtraListener;
    public boolean isAudioRenderStart;
    public boolean isBuffering;
    public boolean isBufferingBeforePlay;
    public boolean isLastLoading;
    public boolean isSeeking;
    public boolean isVideoRenderStart;
    public int mAudioStreamCount;
    public final boolean mEnablePbDurationFix;
    public boolean mIsActualPlaying;
    public final IMediaPlayer$OnInfoListener mOnInfoListener;
    public final CopyOnWriteArrayList mOnPlayerActualPlayingChangedListener;
    public final CopyOnWriteArrayList mOnPlayerLoadingChangedListeners;
    public final PlayerLoadingProcessor$mOnSeekListener$1 mOnSeekListener;
    public final OnPauseListener mPauseListener;
    public final OnStartListener mStartListener;
    public int mVideoStreamCount;
    public final OnWayneErrorListener mWayneErrorListener;
    public final Runnable prepareStartRunable;
    public final Runnable seekRunable;

    public void PlayerLoadingProcessor(){
       super();
       this.mOnPlayerLoadingChangedListeners = new CopyOnWriteArrayList();
       this.mOnPlayerActualPlayingChangedListener = new CopyOnWriteArrayList();
       this.mEnablePbDurationFix = WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enablePbDurationFix", false);
       this.mOnInfoListener = new PlayerLoadingProcessor$mOnInfoListener$1(this);
       this.OnInfoExtraListener = new PlayerLoadingProcessor$OnInfoExtraListener$1(this);
       this.prepareStartRunable = new PlayerLoadingProcessor$prepareStartRunable$1(this);
       this.seekRunable = new PlayerLoadingProcessor$seekRunable$1(this);
       this.mWayneErrorListener = new PlayerLoadingProcessor$mWayneErrorListener$1(this);
       this.mOnSeekListener = new PlayerLoadingProcessor$mOnSeekListener$1(this);
       this.mPauseListener = new PlayerLoadingProcessor$mPauseListener$1(this);
       this.mStartListener = new PlayerLoadingProcessor$mStartListener$1(this);
    }
    public final void addOnPlayerActualPlayingChangedListener(OnPlayerActualPlayingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoadingProcessor.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnPlayerActualPlayingChangedListener.add(p0);
       return;
    }
    public final void addOnPlayerLoadingChangedListener(OnPlayerLoadingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoadingProcessor.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnPlayerLoadingChangedListeners.add(p0);
       return;
    }
    public final void checkIsActualPlaying(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "11")) {
          return;
       }
       IKwaiMediaPlayer kernelPlayer = this.getMediaPlayer().getKernelPlayer();
       boolean b = true;
       if (kernelPlayer == null || (kernelPlayer.isPlaying() != b || this.isLoading())) {
          b = false;
       }
       if (b == this.mIsActualPlaying) {
          return;
       }else {
          DebugLog.i(this.getLogTag(), "actual playing is changed: "+b);
          this.mIsActualPlaying = b;
          Iterator iterator = this.mOnPlayerActualPlayingChangedListener.iterator();
          while (iterator.hasNext()) {
             iterator.next().onChanged(Boolean.valueOf(b));
          }
          return;
       }
    }
    public final void firstFrame(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "3")) {
          return;
       }
       boolean b = false;
       this.isBufferingBeforePlay = b;
       this.isSeeking = b;
       this.getMediaPlayer().getHandler().removeCallbacks(this.prepareStartRunable);
       this.getMediaPlayer().getHandler().removeCallbacks(this.seekRunable);
       if (this.isVideoRenderStart == null) {
          this.notifyPlayerLoadingChanged(LoadingType.STATE_FIRSTFRAME, b);
       }
       this.isVideoRenderStart = true;
       return;
    }
    public final String getLogTag(){
       Object obj = PatchProxy.apply(null, this, PlayerLoadingProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isAttach()) {
          return this.getMediaPlayer().getLogTag()+"::PlayerLoadingProcessor";
       }
       return "PlayerLoadingProcessor";
    }
    public final boolean isActualPlaying(){
       return this.mIsActualPlaying;
    }
    public final boolean isAudioRenderStart(){
       return this.isAudioRenderStart;
    }
    public final boolean isBuffering(){
       return this.isBuffering;
    }
    public final boolean isLoading(){
       Object obj = PatchProxy.apply(null, this, PlayerLoadingProcessor.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isBufferingBeforePlay == null && (this.isBuffering != null || (this.isSeeking != null && !this.getMediaPlayer().isPaused())))? true: false;
       return b;
    }
    public final boolean isVideoRenderStart(){
       return this.isVideoRenderStart;
    }
    public final void notifyPlayerLoadingChanged(LoadingType p0,boolean p1){
       PlayerLoadingProcessor playerLoadin = PlayerLoadingProcessor.class;
       if (PatchProxy.isSupport(playerLoadin) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, playerLoadin, "9")) {
          return;
       }
       a.p(p0, "causeBy");
       if (this.getMediaPlayer().isPaused() && p1) {
          DebugLog.i(this.getLogTag(), "current state is pause, new = "+p1+", cause by:"+p0);
          return;
       }else if(p1 == this.isLastLoading){
          return;
       }else {
          DebugLog.i(this.getLogTag(), "loading state changed: old = "+this.isLastLoading+"; new = "+p1+", cause by: "+p0);
          this.isLastLoading = p1;
          Iterator iterator = this.mOnPlayerLoadingChangedListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onChanged(p1, p0);
          }
          this.checkIsActualPlaying();
          return;
       }
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "5")) {
          return;
       }
       this.getMediaPlayer().addOnInfoListener(this.mOnInfoListener);
       this.getMediaPlayer().addOnInfoExtraListener(this.OnInfoExtraListener);
       this.getMediaPlayer().addOnSeekListener(this.mOnSeekListener);
       this.getMediaPlayer().addOnPauseListener(this.mPauseListener);
       this.getMediaPlayer().addOnStartListener(this.mStartListener);
       this.getMediaPlayer().addOnWayneErrorListener(this.mWayneErrorListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "6")) {
          return;
       }
       this.getMediaPlayer().removeOnInfoListener(this.mOnInfoListener);
       this.getMediaPlayer().removeOnInfoExtraListener(this.OnInfoExtraListener);
       this.getMediaPlayer().removeOnSeekListener(this.mOnSeekListener);
       this.getMediaPlayer().removeOnPauseListener(this.mPauseListener);
       this.getMediaPlayer().removeOnStartListener(this.mStartListener);
       this.getMediaPlayer().removeOnWayneErrorListener(this.mWayneErrorListener);
       this.mOnPlayerLoadingChangedListeners.clear();
       this.mOnPlayerActualPlayingChangedListener.clear();
       return;
    }
    public final void prepareStart(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().getHandler().postDelayed(this.prepareStartRunable, 600);
       return;
    }
    public final void removeOnPlayerActualPlayingChangedListener(OnPlayerActualPlayingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoadingProcessor.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnPlayerActualPlayingChangedListener.remove(p0);
       return;
    }
    public final void removeOnPlayerLoadingChangedListener(OnPlayerLoadingChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoadingProcessor.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnPlayerLoadingChangedListeners.remove(p0);
       return;
    }
    public final void resetState(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "14")) {
          return;
       }
       this.isSeeking = false;
       this.isBufferingBeforePlay = false;
       this.isBuffering = false;
       this.isAudioRenderStart = false;
       this.isVideoRenderStart = false;
       this.getMediaPlayer().getHandler().removeCallbacks(this.prepareStartRunable);
       this.getMediaPlayer().getHandler().removeCallbacks(this.seekRunable);
       this.notifyPlayerLoadingChanged(LoadingType.STATE_RESET, false);
       return;
    }
    public final void seekComplete(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor.class, "4")) {
          return;
       }
       this.isSeeking = false;
       this.getMediaPlayer().getHandler().removeCallbacks(this.seekRunable);
       this.notifyPlayerLoadingChanged(LoadingType.STATE_SEEKEND, false);
       return;
    }
}
