package com.kwai.video.wayne.player.debugview.DebugViewProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.String;
import com.kwai.video.wayne.player.debugview.DebugViewProcessor$1;
import dw7.a;
import com.kwai.video.wayne.player.debugview.DebugViewProcessor$2;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.player.debuginfo.IDebugView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.listeners.OnStartListener;
import com.kwai.video.wayne.player.listeners.OnStopListener;

public class DebugViewProcessor extends AbsKpMidProcessor	// class@000d24
{
    public String TAG;
    public IDebugView mVodDebugInfoView;
    public IMediaPlayer$OnPreparedListener onPreparedListener;
    public OnStartListener onStartListener;
    public OnStopListener onStopListener;

    public void DebugViewProcessor(){
       super();
       String str = "::DebugViewProcessor";
       if (this.isAttach()) {
          str = this.getMediaPlayer().getLogTag()+str;
       }
       this.TAG = str;
       this.onPreparedListener = new DebugViewProcessor$1(this);
       this.onStartListener = new a(this);
       this.onStopListener = new DebugViewProcessor$2(this);
       return;
    }
    public static void a(DebugViewProcessor p0){
       p0.lambda$new$0();
    }
    private void lambda$new$0(){
       DebugViewProcessor tmVodDebugIn = this.mVodDebugInfoView;
       if (tmVodDebugIn != null) {
          tmVodDebugIn.startMonitor(this.getMediaPlayer().getKernelPlayer());
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, DebugViewProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().addOnPreparedListener(this.onPreparedListener);
       this.getMediaPlayer().addOnStartListener(this.onStartListener);
       this.getMediaPlayer().addOnStopListener(this.onStopListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, DebugViewProcessor.class, "3")) {
          return;
       }
       this.getMediaPlayer().removeOnPreparedListener(this.onPreparedListener);
       this.getMediaPlayer().removeOnStopListener(this.onStopListener);
       this.getMediaPlayer().removeOnStartListener(this.onStartListener);
       return;
    }
    public void setVodDebugView(IDebugView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugViewProcessor.class, "1")) {
          return;
       }
       this.mVodDebugInfoView = p0;
       p0.show();
       return;
    }
}
