package brd.z$b;
import crd.b;
import java.lang.Runnable;
import lrd.a;
import brd.z$c;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;

public final class z$b implements b, Runnable, a	// class@0002d9
{
    public final Runnable b;
    public final z$c c;
    public boolean d;

    public void z$b(Runnable p0,z$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void dispose(){
       this.d = true;
       this.c.dispose();
    }
    public Runnable getWrappedRunnable(){
       return this.b;
    }
    public boolean isDisposed(){
       return this.d;
    }
    public void run(){
       if (this.d == null) {
          this.b.run();
       }
       return;
    }
}
