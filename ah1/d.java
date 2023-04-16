package ah1.d;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ah1.d$a;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class d extends MutableLiveData	// class@00009d
{
    public final AtomicInteger a;
    public boolean b;

    public void d(){
       super();
       this.a = new AtomicInteger(-1);
    }
    public void d(Object p0){
       super(p0);
       this.a = new AtomicInteger(-1);
    }
    public void observe(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       super.observe(p0, this.q(p1, this.a.get()));
       return;
    }
    public void observeForever(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.observeForever(this.q(p0, this.a.get()));
       return;
    }
    public final d$a q(Observer p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d$a(this, p0, p1);
    }
    public void removeObserver(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       if (p0.getClass().isAssignableFrom(d$a.class)) {
          super.removeObserver(p0);
       }else {
          super.removeObserver(this.q(p0, -1));
       }
       return;
    }
    public void setValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.a.getAndIncrement();
       super.setValue(p0);
       return;
    }
}
