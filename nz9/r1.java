package nz9.r1;
import java.lang.Runnable;
import nz9.u1;
import java.lang.Object;
import nz9.u1$c;

public final class r1 implements Runnable	// class@003242
{
    public final u1 b;

    public void r1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       u1 h = this.b.h;
       if (h != null) {
          h.a();
       }
       return;
    }
}
