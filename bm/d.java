package bm.d;
import java.lang.Runnable;
import com.hhh.liveeventbus.a;
import androidx.lifecycle.Observer;
import java.lang.Object;

public final class d implements Runnable	// class@000288
{
    public final a b;
    public final Observer c;

    public void d(a p0,Observer p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.l(this.c);
    }
}
