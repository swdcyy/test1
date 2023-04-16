package dd9.c;
import erd.g;
import dd9.g;
import java.lang.Object;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.KsMediaPlayer;

public final class c implements g	// class@001f0d
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "24")) {
       }else {
          float f = 0x3f800000 / p0.a;
          tb.y = f;
          tb.r.setSpeed(f);
       }
       return;
    }
}
