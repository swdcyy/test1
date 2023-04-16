package b90.h;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z80.b;

public final class h implements a	// class@000afb
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       b.a.b();
       return;
    }
}
