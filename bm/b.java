package bm.b;
import java.lang.Runnable;
import com.hhh.liveeventbus.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Object;

public final class b implements Runnable	// class@000286
{
    public final a b;
    public final LifecycleOwner c;
    public final Observer d;

    public void b(a p0,LifecycleOwner p1,Observer p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.m(this.c, this.d);
    }
}
