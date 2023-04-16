package com.kwai.library.kwaiplayerkit.domain.play.PlayModule$dispatchProgressEvent$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Object;
import mx6.d;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class PlayModule$dispatchProgressEvent$1$1$1 extends Lambda implements l	// class@00084e
{
    public final IWaynePlayer $it;

    public void PlayModule$dispatchProgressEvent$1$1$1(IWaynePlayer p0){
       this.$it = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       a.p(p0, "$receiver");
       p0.a(this.$it.getCurrentPosition(), this.$it.getDuration());
    }
}
