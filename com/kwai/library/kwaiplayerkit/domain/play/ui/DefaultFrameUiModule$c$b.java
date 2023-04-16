package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$c$b;
import erd.g;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;

public final class DefaultFrameUiModule$c$b implements g	// class@000859
{
    public final PlayerKitContentFrame b;

    public void DefaultFrameUiModule$c$b(PlayerKitContentFrame p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a.p(p0, "bitmapWeakReference");
       p0 = p0.get();
       if (p0 != null) {
          this.b.I(p0);
       }
       return;
    }
}
