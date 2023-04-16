package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$eventListener$1$a;
import z1.a;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Object;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class KpMidPlayerController$eventListener$1$a implements a	// class@001b76
{
    public final IMediaPlayer a;
    public final int b;
    public final int c;

    public void KpMidPlayerController$eventListener$1$a(IMediaPlayer p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$eventListener$1$a.class, "1")) {
       }else {
          p0.b("mp="+this.a+", what="+this.b+", extra="+this.c+'}');
       }
       return;
    }
}
