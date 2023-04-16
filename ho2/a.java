package ho2.a;
import android.graphics.drawable.Animatable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public final class a implements Animatable	// class@002ddd
{
    public boolean b;
    public final List c;

    public void a(){
       super();
       this.b = true;
       this.c = new ArrayList();
    }
    public final void a(Animatable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "anim");
       if (this.b != null) {
          p0.start();
       }else {
          p0.stop();
       }
       this.c.add(p0);
       return;
    }
    public boolean isRunning(){
       return this.b;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b = true;
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().start();
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.b = false;
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().stop();
       }
       return;
    }
}
