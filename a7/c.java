package a7.c;
import java.lang.Runnable;
import a7.b;
import java.lang.Object;
import java.lang.Throwable;
import a7.d;

public final class c implements Runnable	// class@0000fd
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       try{
          b.a(this.b);
          return;
       }catch(java.lang.Exception e0){
          d.a(e0);
          return;
       }
    }
}
