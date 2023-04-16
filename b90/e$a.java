package b90.e$a;
import java.lang.Runnable;
import b90.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;

public final class e$a implements Runnable	// class@000af6
{
    public boolean b;
    public final int c;
    public final int d;
    public final e e;

    public void e$a(e p0,int p1,int p2){
       this.e = p0;
       super();
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "3")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       e$a te = this.e;
       e d = te.d;
       int i = 0;
       int i1 = (d < (this.c - 1))? d + 1: 0;
       te.d = i1;
       d = te.e;
       if (d < (this.d - 1)) {
          i = d + 1;
       }
       te.e = i;
       k1.r(this, 2000);
       return;
    }
}
