package ntd.k;
import ntd.i;
import java.lang.Runnable;
import ntd.j;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import ftd.o0;

public final class k extends i	// class@001eec
{
    public final Runnable d;

    public void k(Runnable p0,long p1,j p2){
       super(p1, p2);
       this.d = p0;
    }
    public void run(){
       this.d.run();
       this.c.f();
    }
    public String toString(){
       return "Task["+o0.a(this.d)+'@'+o0.b(this.d)+", "+this.b+", "+this.c+']';
    }
}
