package dv1.n;
import java.lang.Runnable;
import dv1.p;
import java.lang.Object;

public final class n implements Runnable	// class@00203a
{
    public final p b;
    public final boolean c;

    public void n(p p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e(this.c);
    }
}
