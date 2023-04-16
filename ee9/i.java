package ee9.i;
import java.lang.Runnable;
import ee9.l;
import ee9.m;
import java.lang.Object;
import hc9.f;
import hc9.e;

public final class i implements Runnable	// class@00212a
{
    public final l b;
    public final m c;

    public void i(l p0,m p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       tb.q.l(this.c);
       tb.q.k(true);
    }
}
