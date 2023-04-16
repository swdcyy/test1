package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$d;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import msd.l;
import qrd.l1;

public final class VodTheaterPlayer$d implements IMediaPlayer$OnSeekCompleteListener	// class@0019c9
{
    public final VodTheaterPlayer a;

    public void VodTheaterPlayer$d(VodTheaterPlayer p0){
       this.a = p0;
       super();
    }
    public final void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer$d.class, "1")) {
          return;
       }
       VodTheaterPlayer j = this.a.j;
       if (j != null) {
          j.invoke(TheaterPlayer$Event.SEEK_COMPLETED);
       }
       return;
    }
}
