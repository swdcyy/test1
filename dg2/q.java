package dg2.q;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.k;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.k$c;

public final class q implements Runnable	// class@00251e
{
    public final k b;
    public final int c;

    public void q(k p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       q tb = this.b;
       q tc = this.c;
       if (tb.i != null) {
          tb.i.a(tc);
       }
       return;
    }
}
