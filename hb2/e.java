package hb2.e;
import java.lang.Runnable;
import hb2.g;
import java.lang.Object;
import hb2.a;

public final class e implements Runnable	// class@002d44
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       if (tb.B != null) {
          tb.C.B();
       }
       return;
    }
}
