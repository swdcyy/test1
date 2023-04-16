package boc.u;
import java.lang.Runnable;
import boc.b;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.n;

public final class u implements Runnable	// class@000450
{
    public final b b;

    public void u(b p0){
       this.b = p0;
    }
    public final void run(){
       n.i(this.b);
    }
}
