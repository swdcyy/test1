package bx0.d$d;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import bx0.d;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Enum;

public class d$d implements LivePlayerStateChangeListener	// class@000429
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
          return;
       }
       if (p0.equals(LivePlayerState.PLAYING)) {
          this.b.P8();
       }
       return;
    }
}
