package a93.f;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.background.b;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.util.Objects;
import android.view.View;

public final class f implements LivePlayerStateChangeListener	// class@000087
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final void onStateChange(LivePlayerState p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == LivePlayerState.STOP) {
          tb.m.setVisibility(8);
       }
       return;
    }
}
