package mg.r1$a;
import java.lang.Runnable;
import mg.r1;
import p55.a;
import java.lang.Object;
import f55.g;

public final class r1$a implements Runnable	// class@002655
{
    public final r1 b;
    public final a c;
    public final Object d;
    public final g e;

    public void r1$a(r1 p0,a p1,Object p2,g p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       this.b.e(this.c, this.d, this.e);
    }
}
