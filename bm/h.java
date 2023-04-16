package bm.h;
import java.lang.Runnable;
import com.hhh.liveeventbus.a;
import java.lang.Object;

public final class h implements Runnable	// class@00028c
{
    public final a b;
    public final Object c;

    public void h(a p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.n(this.c);
    }
}
