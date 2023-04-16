package gz2.g;
import java.lang.Runnable;
import gz2.h$a;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import gz2.h;
import my2.a$a;

public final class g implements Runnable	// class@002bda
{
    public final h$a b;
    public final View c;
    public final MotionEvent d;

    public void g(h$a p0,View p1,MotionEvent p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       g tc = this.c;
       g td = this.d;
       h e = this.b.b.e;
       if (e != null) {
          e.onTouch(tc, td);
       }
       return;
    }
}
