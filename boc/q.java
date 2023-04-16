package boc.q;
import java.lang.Runnable;
import boc.b;
import java.lang.Throwable;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.n;

public final class q implements Runnable	// class@00044c
{
    public final b b;
    public final Throwable c;

    public void q(b p0,Throwable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n.g(this.b, this.c);
    }
}
