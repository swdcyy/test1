package gj0.j;
import java.lang.Runnable;
import sj0.b;
import java.lang.Object;
import com.kuaishou.krn.instance.KrnReactInstanceState;

public final class j implements Runnable	// class@0024f8
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void run(){
       this.b.o(KrnReactInstanceState.BUSINESS_LOADING);
    }
}
