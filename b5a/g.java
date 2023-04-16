package b5a.g;
import java.lang.Runnable;
import b5a.h$a;
import java.lang.Object;
import b5a.h;
import b5a.l;
import com.yxcorp.gifshow.detail.nonslide.b$b;
import com.yxcorp.gifshow.detail.nonslide.b;

public final class g implements Runnable	// class@00036b
{
    public final h$a b;

    public void g(h$a p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       tb.a.q.run();
       tb.a.x.e();
       h$a a = tb.a;
       a.r.f(a.y);
    }
}
