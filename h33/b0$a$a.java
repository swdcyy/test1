package h33.b0$a$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import h33.b0$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import h33.b0;
import java.util.Objects;
import h33.y;
import h33.x;
import erd.g;

public class b0$a$a implements SlipSwitchButton$b	// class@002c1a
{
    public final b0$a a;

    public void b0$a$a(b0$a p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       b0$a$a uoa$a = b0$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa$a, "1")) {
          return;
       }
       b0 c = this.a.r.c;
       Objects.requireNonNull(c);
       y oy = y.class;
       if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidThreeRefs(p0, "not_share_live_stream_fragment", Boolean.valueOf(p1), c, y.class, "1")) {
          Object obj = null;
          if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidFourRefs(p0, "not_share_live_stream_fragment", Boolean.valueOf(p1), obj, c, y.class, "2")) {
             x ox = new x(c, "not_share_live_stream_fragment", p1, p0, p0.getSwitch(), null);
             c.c = v9;
             v9.apply(null);
          }
       }
       return;
    }
}
