package bm.a;
import java.lang.Runnable;
import com.hhh.liveeventbus.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.lang.Object;

public final class a implements Runnable	// class@000285
{
    public final a b;
    public final LifecycleOwner c;
    public final Observer d;

    public void a(a p0,LifecycleOwner p1,Observer p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.k(this.c, this.d);
    }
}
