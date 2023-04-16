package tb.b$a;
import java.lang.Runnable;
import tb.b;
import java.lang.Object;
import java.util.ArrayList;
import tb.a$a;

public class b$a implements Runnable	// class@0024a1
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       b b = this.b.b;
       _monitor_enter(b);
       b$a tb = this.b;
       b e = tb.e;
       b d = tb.d;
       tb.e = d;
       tb.d = e;
       _monitor_exit(b);
       int i1 = d.size();
       for (int i = 0; i < i1; i = i + 1) {
          this.b.e.get(i).release();
       }
       this.b.e.clear();
       return;
    }
}
