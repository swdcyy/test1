package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$a;
import qc6.k;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VodTheaterPlayer$a implements k	// class@0019c6
{
    public final KwaiManifest a;

    public void VodTheaterPlayer$a(KwaiManifest p0){
       this.a = p0;
       super();
    }
    public final t request(){
       Object obj = PatchProxy.apply(null, this, VodTheaterPlayer$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(this.a);
    }
}
