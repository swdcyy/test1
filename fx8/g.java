package fx8.g;
import java.lang.Runnable;
import brd.v;
import java.lang.String;
import java.lang.Object;
import brd.g;

public final class g implements Runnable	// class@00237e
{
    public final v b;
    public final String c;

    public void g(v p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       tb.onNext(this.c);
       tb.onComplete();
    }
}
