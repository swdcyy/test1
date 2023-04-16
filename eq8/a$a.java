package eq8.a$a;
import eq8.a$b;
import com.tachikoma.core.component.e;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.TKBaseNativeModule;
import eq8.a;
import java.util.Map;
import eq8.a$c;

public final class a$a extends a$b	// class@002229
{
    public final e c;
    public final WeakReference d;

    public void a$a(int p0,e p1,WeakReference p2){
       this.c = p1;
       this.d = p2;
       super(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if (this.c.isDestroy()) {
          return;
       }
       super.run();
       e uoe = this.d.get();
       if (uoe != null) {
          Class class = uoe.getClass();
          Map b = a.b;
          _monitor_enter(b);
          a$c uoc = a.b.get(class);
          if (uoc == null) {
             uoc = new a$c(4);
             a.b.put(class, uoc);
          }
          _monitor_exit(b);
          a.a(uoc, uoe, class);
       }
       return;
    }
}
