package com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor$Companion;
import nsd.u;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.waynelive.wayneplayer.ErrorRetryProcessor$onKernelPlayerCreated$1;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer;

public final class ErrorRetryProcessor extends AbsWayneProcessor	// class@000e21
{
    public final Set mLivePlayerErrorListenerList;
    public static final ErrorRetryProcessor$Companion Companion;

    static {
       ErrorRetryProcessor.Companion = new ErrorRetryProcessor$Companion(null);
    }
    public void ErrorRetryProcessor(){
       super();
       this.mLivePlayerErrorListenerList = new CopyOnWriteArraySet();
    }
    public final void addErrorListener(LivePlayerErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.mLivePlayerErrorListenerList.add(p0);
       return;
    }
    public final void disPatchError(int p0,int p1){
       ErrorRetryProcessor uErrorRetryP = ErrorRetryProcessor.class;
       if (PatchProxy.isSupport(uErrorRetryP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uErrorRetryP, "5")) {
          return;
       }
       Iterator iterator = this.mLivePlayerErrorListenerList.iterator();
       while (iterator.hasNext()) {
          LivePlayerErrorListener livePlayerEr = iterator.next();
          DebugLog.i(this.getLogTag(), "disPatchError listener "+livePlayerEr+" what "+p0+" extra "+p1);
          livePlayerEr.onError(p0, p1);
       }
       return;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, ErrorRetryProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getTag()+"::ErrorRetryProcessor": "ErrorRetryProcessor";
       return obj;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "2")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "onAttach");
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "4")) {
          return;
       }
       this.mLivePlayerErrorListenerList.clear();
       return;
    }
    public void onKernelPlayerCreated(){
       if (PatchProxy.applyVoid(null, this, ErrorRetryProcessor.class, "3")) {
          return;
       }
       super.onKernelPlayerCreated();
       DebugLog.i(this.getLogTag(), "onKernelPlayerCreated");
       LivePlayerStatusMonitorImpl mLiveMediaPl = this.getMediaPlayer().mLiveMediaPlayer;
       if (mLiveMediaPl != null) {
          mLiveMediaPl.setOnErrorListener(new ErrorRetryProcessor$onKernelPlayerCreated$1(this));
       }
       return;
    }
    public final void removeErrorListener(LivePlayerErrorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorRetryProcessor.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.mLivePlayerErrorListenerList.remove(p0);
       return;
    }
}
