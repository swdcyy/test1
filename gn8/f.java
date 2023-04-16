package gn8.f;
import java.lang.Runnable;
import gn8.g;
import java.lang.Object;

public class f implements Runnable	// class@00249c
{
    public final g b;

    public void f(g p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.f();
    }
}
