package a37.d;
import java.lang.Runnable;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.Object;

public final class d implements Runnable	// class@00003f
{
    public final HttpTransaction b;

    public void d(HttpTransaction p0){
       this.b = p0;
    }
    public final void run(){
       HttpTransaction.o(this.b);
    }
}
