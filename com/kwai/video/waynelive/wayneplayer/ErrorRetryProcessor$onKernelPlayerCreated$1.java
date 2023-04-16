package com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor$onKernelPlayerCreated$1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.Iterator;
import java.util.Set;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.kwai.video.waynelive.mediaplayer.LivePlayerConfigProvider;
import com.kwai.video.waynelive.LivePlayerInitModule;
import ai7.d;
import com.kwai.video.player.kwai_player.Util;
import java.lang.Exception;

public final class ErrorRetryProcessor$onKernelPlayerCreated$1 implements IMediaPlayer$OnErrorListener	// class@000e20
{
    public final ErrorRetryProcessor this$0;

    public void ErrorRetryProcessor$onKernelPlayerCreated$1(ErrorRetryProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       Object obj;
       boolean this;
       boolean b;
       if (PatchProxy.isSupport(ErrorRetryProcessor$onKernelPlayerCreated$1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ErrorRetryProcessor$onKernelPlayerCreated$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "mp");
       DebugLog.i(this.this$0.getLogTag(), "mediaPlayer onError what "+p1+" extra "+p2);
       try{
          obj = 1;
          this = false;
          if (this.this$0.getMediaPlayer().getInnerState() == LivePlayerState.PREPARING || this.this$0.getMediaPlayer().getInnerState() == LivePlayerState.PLAYING) {
             b = true;
          label_006e :
             Iterator iterator = this.this$0.mLivePlayerErrorListenerList.iterator();
             int i = 0;
             while (iterator.hasNext()) {
                i = i | iterator.next().onError(p1, p2);
             }
             this.this$0.getMediaPlayer().updatePlayDuration();
             DebugLog.i(this.this$0.getLogTag(), "isCriticalError "+i+" shouldHandlerError "+b);
             LivePlayerConfigProvider config = LivePlayerInitModule.getConfig();
             a.o(config, "LivePlayerInitModule.getConfig\(\)");
             boolean booleanx = config.getSwitchProvider().getBoolean("fullErrorRetry", this);
             if (!Util.isKSecurityErrorInMediaPlayer(p1, p2) && (Util.isCriticalErrorInMediaPlayer(p1, p2) || (booleanx && b))) {
                p0.setOnErrorListener(null);
                if (!i) {
                   DebugLog.i(this.this$0.getLogTag(), "trySwitchUrlWhenPlayerCriticalError what "+p1+" extra "+p2);
                   this.this$0.getMediaPlayer().trySwitchUrlWhenPlayerCriticalError(p1, p2);
                }
             }
          }else {
             b = false;
             goto label_006e ;
          }
       }catch(java.lang.Exception e9){
          DebugLog.e(this.this$0.getLogTag(), e9.getMessage());
       }
       return obj;
    }
}
