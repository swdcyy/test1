package a76.o;
import erd.a;
import java.util.concurrent.FutureTask;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class o implements a	// class@00003c
{
    public final FutureTask b;

    public void o(FutureTask p0){
       this.b = p0;
    }
    public final void run(){
       c.g(this.b);
    }
}
