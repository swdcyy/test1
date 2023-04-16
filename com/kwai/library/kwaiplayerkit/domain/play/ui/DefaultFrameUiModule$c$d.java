package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$d;
import erd.g;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DefaultFrameUiModule$c$d implements g	// class@00085b
{
    public final PlayerKitContentFrame b;

    public void DefaultFrameUiModule$c$d(PlayerKitContentFrame p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a.o(p0, "it");
       this.b.setSurfaceType(p0.intValue());
    }
}
