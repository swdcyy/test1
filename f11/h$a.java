package f11.h$a;
import java.lang.Runnable;
import f11.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import g11.e;

public class h$a implements Runnable	// class@002273
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       h$a tb = this.b;
       tb.i = false;
       h e = tb.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoid(null, e, e.class, "3") && e.c == null) {
          e.e = null;
          e.b = 0;
          e.b();
       }
       return;
    }
}
