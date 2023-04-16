package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$h$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import kt.a;
import ht.c;

public final class VodTheaterPlayer$h$a implements Runnable	// class@0019cd
{
    public final VodTheaterPlayer$h b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final long f;

    public void VodTheaterPlayer$h$a(VodTheaterPlayer$h p0,byte[] p1,int p2,int p3,long p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VodTheaterPlayer$h$a.class, "1")) {
          return;
       }
       VodTheaterPlayer$h a = this.b.a;
       if (a.g != null) {
          a uoa = new a();
          VodTheaterPlayer$h$a tc = this.c;
          uoa.b = tc;
          uoa.d = tc.length;
          uoa.e = this.d;
          uoa.f = this.e;
          uoa.g = this.f;
          VodTheaterPlayer d = a.d;
          if (d != null) {
             d.i(uoa);
          }
       }
       return;
    }
}
