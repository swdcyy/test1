package og.u;
import java.lang.Runnable;
import com.feature.post.bridge.util.d$b;
import java.lang.String;
import java.lang.Object;

public final class u implements Runnable	// class@0027c5
{
    public final d$b b;
    public final String c;

    public void u(d$b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.a(this.c);
    }
}
