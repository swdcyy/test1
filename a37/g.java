package a37.g;
import java.lang.Runnable;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.String;
import java.lang.Object;

public final class g implements Runnable	// class@000042
{
    public final HttpTransaction b;
    public final String c;
    public final String d;

    public void g(HttpTransaction p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       HttpTransaction.r(this.b, this.c, this.d);
    }
}
