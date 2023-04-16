package cd8.d;
import java.lang.Runnable;
import cd8.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.inputmethodservice.KeyboardView;
import cd8.f;
import cd8.f$a;

public final class d implements Runnable	// class@0003f5
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "3")) {
       }else {
          e d = tb.d;
          if (d != null) {
             d.d(tb, tb.b.getHeight());
          }
       }
       return;
    }
}
