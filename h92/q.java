package h92.q;
import java.lang.Runnable;
import h92.s$a;
import h92.c;
import java.lang.Object;
import h92.s;
import java.util.HashSet;

public final class q implements Runnable	// class@002d21
{
    public final s$a b;
    public final c c;

    public void q(s$a p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a.W.add(this.c);
    }
}
