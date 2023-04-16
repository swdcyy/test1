package ed.n;
import eb.c;
import ed.w;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import ed.n$b;
import ed.r;
import ed.x;
import ed.n$a;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.memory.BasePool;
import fb.c;

public class n	// class@001537
{
    public final c a;
    public final n$b b;

    public void n(c p0,w p1){
       super();
       boolean b = (p1.h > null)? true: false;
       e.a(Boolean.valueOf(b));
       this.b = new n$b(p0, p1, r.h());
       this.a = new n$a(this);
       return;
    }
    public a a(int p0){
       return a.p(this.b.get(p0), this.a);
    }
}
