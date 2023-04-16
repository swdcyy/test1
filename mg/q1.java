package mg.q1;
import java.lang.Runnable;
import java.io.File;
import java.lang.Object;
import com.feature.post.bridge.q;

public final class q1 implements Runnable	// class@00264f
{
    public final File b;
    public final long c;

    public void q1(File p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       q.a(this.b, this.c);
    }
}
