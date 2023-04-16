package com.kwai.library.kwaiplayerkit.domain.play.PlayModule$onInfo$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Object;
import mx6.c;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PlayModule$onInfo$1 extends Lambda implements l	// class@000850
{
    public final int $extra;
    public final IMediaPlayer $mp;
    public final int $what;

    public void PlayModule$onInfo$1(IMediaPlayer p0,int p1,int p2){
       this.$mp = p0;
       this.$what = p1;
       this.$extra = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       a.p(p0, "$receiver");
       p0.onInfo(this.$mp, this.$what, this.$extra);
    }
}
