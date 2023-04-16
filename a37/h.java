package a37.h;
import java.lang.Runnable;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.Object;

public final class h implements Runnable	// class@000043
{
    public final HttpTransaction b;
    public final byte[] c;

    public void h(HttpTransaction p0,byte[] p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       HttpTransaction.v(this.b, this.c);
    }
}
