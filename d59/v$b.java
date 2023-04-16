package d59.v$b;
import c59.n;
import d59.v;
import java.lang.Object;
import c59.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Double;
import a59.a;
import a59.a$a;

public final class v$b implements n	// class@002061
{
    public final v a;

    public void v$b(v p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       m.a(this, p0);
    }
    public void b(float p0,float p1){
       v$b uob = v$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       v z = this.a.z;
       if (z != null) {
          a$a.a(z, Double.valueOf((double)p1), null, 2, null);
       }
       return;
    }
}
