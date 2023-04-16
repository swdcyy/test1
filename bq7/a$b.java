package bq7.a$b;
import java.lang.Runnable;
import bq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;
import qp7.g;
import bq7.b;
import bq7.g;

public final class a$b implements Runnable	// class@000440
{
    public final a b;
    public final Object c;

    public void a$b(a p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       if (tb.m != null) {
          tb.D().a(this.c);
       }
       return;
    }
}
