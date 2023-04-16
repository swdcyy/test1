package a37.e;
import java.lang.Runnable;
import com.kwai.link.extensions.HttpTransaction;
import com.kwai.link.extensions.HttpTransaction$Method;
import java.lang.Object;

public final class e implements Runnable	// class@000040
{
    public final HttpTransaction b;
    public final HttpTransaction$Method c;

    public void e(HttpTransaction p0,HttpTransaction$Method p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       HttpTransaction.t(this.b, this.c);
    }
}
