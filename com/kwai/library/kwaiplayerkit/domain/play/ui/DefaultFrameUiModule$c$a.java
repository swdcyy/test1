package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$a;
import erd.g;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import java.lang.Object;
import sc6.g;
import com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class DefaultFrameUiModule$c$a implements g	// class@000858
{
    public final PlayerKitContentFrame b;

    public void DefaultFrameUiModule$c$a(PlayerKitContentFrame p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Objects.requireNonNull(DefaultFrameViewModel.h);
       if (a.g(p0, DefaultFrameViewModel.g)) {
          this.b.setPlayerInterface(null);
       }else {
          this.b.setPlayerInterface(p0);
       }
       return;
    }
}
