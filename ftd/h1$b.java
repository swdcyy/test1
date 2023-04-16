package ftd.h1$b;
import ftd.h1$c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public final class h1$b extends h1$c	// class@000e8e
{
    public final Runnable e;

    public void h1$b(long p0,Runnable p1){
       super(p0);
       this.e = p1;
    }
    public void run(){
       this.e.run();
    }
    public String toString(){
       return super.toString()+this.e.toString();
    }
}
