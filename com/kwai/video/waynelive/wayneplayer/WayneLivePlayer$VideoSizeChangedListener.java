package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$VideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import java.util.Iterator;
import java.util.List;
import mw7.i;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;

public class WayneLivePlayer$VideoSizeChangedListener implements IMediaPlayer$OnVideoSizeChangedListener	// class@000e4f
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$VideoSizeChangedListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$VideoSizeChangedListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public static void a(WayneLivePlayer$VideoSizeChangedListener p0,int p1,int p2,IMediaPlayer p3,int p4,int p5){
       p0.lambda$onVideoSizeChanged$0(p1, p2, p3, p4, p5);
    }
    private void lambda$onVideoSizeChanged$0(int p0,int p1,IMediaPlayer p2,int p3,int p4){
       WayneLivePlayer mPlayTexture = this.this$0.mPlayTextureView;
       if (mPlayTexture != null) {
          Objects.requireNonNull(mPlayTexture);
          if (!PatchProxy.isSupport(LivePlayTextureView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), mPlayTexture, LivePlayTextureView.class, "15")) {
             mPlayTexture.d.onVideoSizeChanged(p0, p1);
          }
       }
       Iterator iterator = this.this$0.mVideoSizeChangedListenerList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj != null) {
             obj.onVideoSizeChanged(p2, p0, p1, p3, p4);
          }
       }
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       WayneLivePlayer$VideoSizeChangedListener videoSizeCha = WayneLivePlayer$VideoSizeChangedListener.class;
       if (PatchProxy.isSupport(videoSizeCha)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, videoSizeCha, "1")) {
             return;
          }
       }
       if (!p1 || !p2) {
          DebugLog.i(this.this$0.getTag(), "mediaPlayer videoSizeChanged errorwidth "+p1+" height "+p2);
          return;
       }else {
          i oi = new i(this, p1, p2, p0, p3, p4);
          k1.o(v8);
          DebugLog.i(this.this$0.getTag(), "mediaPlayer videoSizeChangedwidth "+p1+" height "+p2+" mPlayTextureView "+this.this$0.mPlayTextureView);
          return;
       }
    }
}
