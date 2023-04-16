package dg2.s;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.k;
import dg2.d;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.k$c;

public final class s implements Runnable	// class@002520
{
    public final k b;
    public final d c;

    public void s(k p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s tb = this.b;
       s tc = this.c;
       if (tb.i != null) {
          tb.i.c(tc);
       }
       return;
    }
}
