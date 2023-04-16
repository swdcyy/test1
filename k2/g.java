package k2.g;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle;

public class g implements LifecycleOwner	// class@002464
{
    public LifecycleRegistry b;

    public void g(){
       super();
       this.b = null;
    }
    public void a(Lifecycle$Event p0){
       this.b.handleLifecycleEvent(p0);
    }
    public void b(){
       if (this.b == null) {
          this.b = new LifecycleRegistry(this);
       }
       return;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public Lifecycle getLifecycle(){
       this.b();
       return this.b;
    }
}
