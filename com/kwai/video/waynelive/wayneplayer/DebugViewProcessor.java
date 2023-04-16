package com.kwai.video.waynelive.wayneplayer.DebugViewProcessor;
import com.kwai.video.waynelive.wayneplayer.AbsWayneProcessor;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.String;
import mw7.a;
import com.kwai.video.waynelive.LivePlayerState;
import com.kwai.player.debuginfo.IDebugView;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;

public class DebugViewProcessor extends AbsWayneProcessor	// class@000e1e
{
    public String TAG;
    public IDebugView mVodDebugInfoView;
    public LivePlayerStateChangeListener stateChangeListener;

    public void DebugViewProcessor(){
       super();
       String str = "::DebugViewProcessor";
       if (this.isAttach()) {
          str = this.getMediaPlayer().getTag()+str;
       }
       this.TAG = str;
       this.stateChangeListener = new a(this);
       return;
    }
    public static void a(DebugViewProcessor p0,LivePlayerState p1){
       p0.lambda$new$0(p1);
    }
    private void lambda$new$0(LivePlayerState p0){
       DebugViewProcessor tmVodDebugIn = this.mVodDebugInfoView;
       if (tmVodDebugIn != null) {
          if (p0 == LivePlayerState.PREPARING) {
             tmVodDebugIn.stopMonitor();
             this.mVodDebugInfoView.startMonitor(this.getMediaPlayer().getLiveMediaPlayer());
          }else if(p0 == LivePlayerState.PLAYING){
             tmVodDebugIn.startMonitor(this.getMediaPlayer().getLiveMediaPlayer());
          }else if(p0 == LivePlayerState.STOP){
             tmVodDebugIn.stopMonitor();
          }
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, DebugViewProcessor.class, "2")) {
          return;
       }
       this.getMediaPlayer().addStateChangeListener(this.stateChangeListener);
       return;
    }
    public void onDetach(){
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
