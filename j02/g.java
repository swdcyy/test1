package j02.g;
import androidx.lifecycle.Observer;
import j02.k;
import j02.o;
import java.lang.Object;
import k02.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements Observer	// class@002a1c
{
    public final k b;
    public final o c;

    public void g(k p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.a != null && p0.b != null) {
             p0.c(this.c);
          }
       }
       return;
    }
}
