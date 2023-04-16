package b77.o;
import mw1.d;
import b77.q;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class o implements d	// class@0003e6
{
    public final q a;

    public void o(q p0){
       this.a = p0;
    }
    public final void a(){
       o ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, q.class, "6")) {
       }else {
          q u = ta.u;
          if (u != null) {
             u.setTranslationX(0);
             ta.u.setTranslationY(ta.t.getY());
          }
       }
       return;
    }
}
