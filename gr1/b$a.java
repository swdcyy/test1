package gr1.b$a;
import androidx.lifecycle.Observer;
import gr1.b;
import java.lang.Object;
import dr1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.util.Map;
import dr1.e;
import dr1.b;
import dr1.f;
import lnc.a1;
import java.lang.StringBuilder;
import dr1.a;
import er1.a;

public final class b$a implements Observer	// class@002567
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          b$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
             LiveMultiLineArenaLiveState liveMultiLin = (p0 != null)? p0.d(): null;
             if (liveMultiLin == LiveMultiLineArenaLiveState.SHOWING) {
                p0 = p0.c().get(tb.i);
                if (p0 != null) {
                   b c = tb.j.i().c;
                   if (c == null) {
                      c = a1.p(R.string.arg_RES_7f101df5);
                   }
                   Objects.requireNonNull(a.f);
                   tb.u0(0, null, c+' '+p0.a(), a.c);
                }
             }
          }
       }
       return;
    }
}
