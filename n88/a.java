package n88.a;
import n88.b;
import java.lang.Object;
import z98.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Queue;

public abstract class a	// class@0026ea
{
    public b mCF;

    public void a(b p0){
       super();
       this.mCF = p0;
       if (p0.v0() && this instanceof b) {
          Object obj = this;
          if (!PatchProxy.applyVoidOneRefs(obj, p0, b.class, "101")) {
             p0.H0.add(obj);
          }
       }
       return;
    }
}
