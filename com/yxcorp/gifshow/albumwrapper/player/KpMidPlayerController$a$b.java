package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a$b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a;
import brd.c0;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import com.kwai.video.wayne.player.main.IPlayerListener;

public final class KpMidPlayerController$a$b implements IMediaPlayer$OnPreparedListener	// class@001b71
{
    public final KpMidPlayerController$a b;
    public final c0 c;

    public void KpMidPlayerController$a$b(KpMidPlayerController$a p0,c0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$a$b.class, "1")) {
          return;
       }
       this.c.onSuccess("");
       KpMidPlayerController e = this.b.a.e;
       if (e != null) {
          e.removeOnPreparedListener(this);
       }
       return;
    }
}
