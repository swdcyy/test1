package xz7.a;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public abstract class a implements g	// class@003021
{
    public final Object b;

    public void a(Object p0){
       super();
       this.b = p0;
    }
    public abstract void a(Object p0);
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a(this.b);
       p0.onNext(this.b);
       p0.onComplete();
       return;
    }
}
