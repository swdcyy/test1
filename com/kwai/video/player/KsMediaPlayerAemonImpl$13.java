package com.kwai.video.player.KsMediaPlayerAemonImpl$13;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class KsMediaPlayerAemonImpl$13 implements IMediaPlayer$OnVideoRawDataListener	// class@000ade
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$13(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onVideoRawDataAvailable(IMediaPlayer p0,byte[] p1,int p2,int p3,int p4,int p5){
       KsMediaPlayerAemonImpl$13 u13 = KsMediaPlayerAemonImpl$13.class;
       if (PatchProxy.isSupport(u13)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, u13, "1")) {
             return;
          }
       }
       KsMediaPlayerAemonImpl$13 tthis$0 = this.this$0;
       KsMediaPlayerAemonImpl mOnVideoRawD = tthis$0.mOnVideoRawDataListenerOutside;
       if (mOnVideoRawD != null) {
          mOnVideoRawD.onVideoRawDataAvailable(tthis$0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void onVideoRawDataSize(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       KsMediaPlayerAemonImpl$13 u13 = KsMediaPlayerAemonImpl$13.class;
       if (PatchProxy.isSupport(u13)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u13, "2")) {
             return;
          }
       }
       KsMediaPlayerAemonImpl$13 tthis$0 = this.this$0;
       KsMediaPlayerAemonImpl mOnVideoRawD = tthis$0.mOnVideoRawDataListenerOutside;
       if (mOnVideoRawD != null) {
          mOnVideoRawD.onVideoRawDataSize(tthis$0, p1, p2, p3, p4);
       }
       return;
    }
}
