package dg2.r;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.k;
import dg2.d;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.k$c;

public final class r implements Runnable	// class@00251f
{
    public final k b;
    public final d c;

    public void r(k p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r tb = this.b;
       r tc = this.c;
       if (tb.i != null) {
          tb.i.d(tc);
       }
       return;
    }
}
