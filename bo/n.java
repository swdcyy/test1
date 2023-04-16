package bo.n;
import java.lang.Runnable;
import bo.m;
import com.kuaishou.aegon.AegonRequestFinishedInfo;
import java.lang.Object;
import com.kuaishou.aegon.AegonLoggerDispatcher;

public final class n implements Runnable	// class@00031f
{
    public final m b;
    public final AegonRequestFinishedInfo c;

    public void n(m p0,AegonRequestFinishedInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a(this.c);
    }
}
