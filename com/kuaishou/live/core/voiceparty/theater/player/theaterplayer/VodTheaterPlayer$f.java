package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$f;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import msd.l;
import qrd.l1;

public final class VodTheaterPlayer$f implements IMediaPlayer$OnVideoSizeChangedListener	// class@0019cb
{
    public final VodTheaterPlayer b;

    public void VodTheaterPlayer$f(VodTheaterPlayer p0){
       this.b = p0;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(VodTheaterPlayer$f.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VodTheaterPlayer$f.class, "1")) {
             return;
          }
       }
       VodTheaterPlayer j = this.b.j;
       if (j != null) {
          j.invoke(TheaterPlayer$Event.VIDEO_SIZE_CHANGE);
       }
       return;
    }
}
