package boc.v;
import java.lang.Runnable;
import boc.b;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.n;

public final class v implements Runnable	// class@000451
{
    public final b b;

    public void v(b p0){
       this.b = p0;
    }
    public final void run(){
       n.f(this.b);
    }
}
