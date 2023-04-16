package dv1.m;
import java.lang.Runnable;
import dv1.p;
import ks5.m;
import java.lang.Object;

public final class m implements Runnable	// class@002039
{
    public final p b;
    public final m c;

    public void m(p p0,m p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.f(this.c);
    }
}
