package dub.j;
import java.lang.Runnable;
import dub.k;
import java.util.List;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public final class j implements Runnable	// class@002574
{
    public final k b;
    public final List c;

    public void j(k p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tc = this.c;
       k e = this.b.e;
       if (e != null) {
          e.onNext(tc);
       }
       return;
    }
}
