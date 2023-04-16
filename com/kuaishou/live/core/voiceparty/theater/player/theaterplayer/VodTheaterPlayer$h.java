package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$h;
import com.kwai.video.player.KsMediaPlayer$OnAudioProcessPCMListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Double;
import java.lang.String;
import java.nio.Buffer;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$h$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class VodTheaterPlayer$h implements KsMediaPlayer$OnAudioProcessPCMListener	// class@0019ce
{
    public final VodTheaterPlayer a;

    public void VodTheaterPlayer$h(VodTheaterPlayer p0){
       this.a = p0;
       super();
    }
    public final void onAudioProcessPCMAvailable(IMediaPlayer p0,ByteBuffer p1,long p2,int p3,int p4,int p5,double p6){
       object oobject = p1;
       VodTheaterPlayer$h oh = VodTheaterPlayer$h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,oobject,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
             return;
          }
       }else {
          int i1 = this;
       }
       int i = p1.remaining();
       if (i <= 0) {
          return;
       }else {
          byte[] uobyteArray = new byte[i];
          try{
             p1.rewind();
             p1.get(uobyteArray);
             VodTheaterPlayer$h$a oh$a = new VodTheaterPlayer$h$a(this, uobyteArray, p4, p3, p2);
             k1.o(oobject);
             return;
          }catch(java.nio.BufferUnderflowException e0){
             b.I(LiveVoicePartyLogTag.THEATER, "onAudioProcessPCMAvailable", e0);
             return;
          }
       }
    }
}
