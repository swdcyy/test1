package nj0.o;
import java.lang.Runnable;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import com.kuaishou.krn.delegate.KrnDelegate;
import sj0.b;
import lj0.c;
import com.kuaishou.krn.instance.KrnReactInstanceState;

public final class o implements Runnable	// class@00333c
{
    public final k b;

    public void o(k p0){
       this.b = p0;
    }
    public final void run(){
       this.b.e.i().o(KrnReactInstanceState.BUSINESS_LOADING);
    }
}
