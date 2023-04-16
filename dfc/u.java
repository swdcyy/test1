package dfc.u;
import java.lang.Runnable;
import dfc.v$a;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import java.lang.Object;
import dfc.v;
import mrd.a;

public final class u implements Runnable	// class@0021b3
{
    public final v$a b;
    public final NewsEntranceResponse c;

    public void u(v$a p0,NewsEntranceResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c.B.onNext(this.c);
    }
}
