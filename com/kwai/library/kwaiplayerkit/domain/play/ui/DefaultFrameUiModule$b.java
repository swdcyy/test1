package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$b;
import vx6.d;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;

public final class DefaultFrameUiModule$b implements d	// class@000857
{
    public final PlayerKitContentFrame a;

    public void DefaultFrameUiModule$b(PlayerKitContentFrame p0){
       a.p(p0, "contentFrame");
       super();
       this.a = p0;
    }
    public int getHeight(){
       return this.a.getHeight();
    }
    public int getWidth(){
       return this.a.getWidth();
    }
}
