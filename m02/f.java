package m02.f;
import java.lang.Runnable;
import java.lang.Object;

public final class f implements Runnable	// class@0030b9
{
    public final Runnable b;

    public void f(Runnable p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
