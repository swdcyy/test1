package androidx.recyclerview.widget.d$a$b;
import java.lang.Runnable;
import androidx.recyclerview.widget.d$a;
import androidx.recyclerview.widget.h$e;
import java.lang.Object;
import androidx.recyclerview.widget.d;
import java.util.List;

public class d$a$b implements Runnable	// class@0008f5
{
    public final h$e b;
    public final d$a c;

    public void d$a$b(d$a p0,h$e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       d$a$b tc = this.c;
       d$a f = tc.f;
       if (f.g == tc.d) {
          f.b(tc.c, this.b, tc.e);
       }
       return;
    }
}
