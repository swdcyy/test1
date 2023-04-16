package bp6.o;
import java.lang.Runnable;
import iq6.j;
import java.lang.Object;
import com.kwai.imsdk.internal.o;
import brd.y;

public final class o implements Runnable	// class@000541
{
    public final j b;

    public void o(j p0){
       this.b = p0;
    }
    public final void run(){
       o.w.onNext(this.b);
    }
}
