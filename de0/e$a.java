package de0.e$a;
import androidx.lifecycle.Observer;
import de0.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e$a implements Observer	// class@001f82
{
    public final e b;
    public final Observer c;

    public void e$a(e p0,Observer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       if (this.b.a.compareAndSet(true, false)) {
          this.c.onChanged(p0);
       }
       return;
    }
}
