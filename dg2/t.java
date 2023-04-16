package dg2.t;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.k;
import dg2.d;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.k$c;

public final class t implements Runnable	// class@002521
{
    public final k b;
    public final d c;

    public void t(k p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       t tb = this.b;
       t tc = this.c;
       if (tb.i != null) {
          tb.i.b(tc);
       }
       return;
    }
}
