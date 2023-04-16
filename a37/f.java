package a37.f;
import java.lang.Runnable;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.String;
import java.lang.Object;

public final class f implements Runnable	// class@000041
{
    public final HttpTransaction b;
    public final String c;

    public void f(HttpTransaction p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       HttpTransaction.p(this.b, this.c);
    }
}
