package bp3.g;
import java.lang.Runnable;
import com.kuaishou.live.rerank.d;
import java.util.List;
import java.lang.Object;

public final class g implements Runnable	// class@000411
{
    public final d b;
    public final List c;

    public void g(d p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b(this.c);
    }
}
