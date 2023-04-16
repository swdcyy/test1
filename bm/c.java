package bm.c;
import java.lang.Runnable;
import com.hhh.liveeventbus.a;
import androidx.lifecycle.Observer;
import java.lang.Object;

public final class c implements Runnable	// class@000287
{
    public final a b;
    public final Observer c;

    public void c(a p0,Observer p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.j(this.c);
    }
}
