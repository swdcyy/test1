package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$i;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class VodTheaterPlayer$i implements Runnable	// class@0019cf
{
    public final VodTheaterPlayer b;

    public void VodTheaterPlayer$i(VodTheaterPlayer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer$i.class, "1")) {
          return;
       }
       VodTheaterPlayer$i tb = this.b;
       tb.g = false;
       tb.v(true, "stopAudioPlayer");
       return;
    }
}
