package com.kwai.library.kwaiplayerkit.domain.play.PlayModule$onStateChanged$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Object;
import mx6.c;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PlayModule$onStateChanged$1 extends Lambda implements l	// class@000851
{
    public final PlayerState $state;

    public void PlayModule$onStateChanged$1(PlayerState p0){
       this.$state = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       a.p(p0, "$receiver");
       p0.r0(this.$state);
    }
}
