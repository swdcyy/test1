package com.kwai.library.kwaiplayerkit.domain.play.PlayModule$attachListener$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Object;
import mx6.c;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PlayModule$attachListener$2$1 extends Lambda implements l	// class@00084c
{
    public final IWaynePlayer $p;

    public void PlayModule$attachListener$2$1(IWaynePlayer p0){
       this.$p = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       a.p(p0, "$receiver");
       p0.w(this.$p.isBuffering());
    }
}
