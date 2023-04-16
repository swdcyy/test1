package nz9.s1;
import java.lang.Runnable;
import nz9.u1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import im8.f;
import android.os.Handler;

public final class s1 implements Runnable	// class@003245
{
    public final u1 b;

    public void s1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       s1 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, u1.class, "8")) {
       }else if(tb.d != null){
          u1 c = tb.c;
          if (c != null) {
             c.q(0);
             tb.c = objArray;
          }
          tb.f.set(Boolean.FALSE);
          tb.g.set(Boolean.TRUE);
          tb.d = true;
          tb.a.removeCallbacks(tb.m);
       }
       return;
    }
}
