package com.kwai.video.player.KsMediaPlayerAemonImpl$14;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kwai.video.player.KsMediaPlayerAemonImpl;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;

public class KsMediaPlayerAemonImpl$14 implements KsMediaPlayer$OnAudioProcessPCMListener	// class@000adf
{
    public final KsMediaPlayerAemonImpl this$0;

    public void KsMediaPlayerAemonImpl$14(KsMediaPlayerAemonImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onAudioProcessPCMAvailable(IMediaPlayer p0,ByteBuffer p1,long p2,int p3,int p4,int p5,double p6){
       KsMediaPlayerAemonImpl$14 u14 = this;
       KsMediaPlayerAemonImpl$14 u141 = KsMediaPlayerAemonImpl$14.class;
       if (PatchProxy.isSupport(u141)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, u141, "1")) {
             return;
          }
       }
       KsMediaPlayerAemonImpl$14 this$0 = u14.this$0;
       KsMediaPlayerAemonImpl mOnAudioProc = this$0.mOnAudioProcessPCMListenerOutside;
       if (mOnAudioProc != null) {
          mOnAudioProc.onAudioProcessPCMAvailable(this$0, p1, p2, p3, p4, p5, p6);
       }
       return;
    }
}
