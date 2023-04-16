package id.m0$b$a;
import java.lang.Runnable;
import id.m0$b;
import android.util.Pair;
import java.lang.Object;
import id.i;
import id.c0;
import id.m0;

public class m0$b$a implements Runnable	// class@0021b9
{
    public final Pair b;
    public final m0$b c;

    public void m0$b$a(m0$b p0,Pair p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       m0$b$a tb = this.b;
       this.c.c.b(tb.first, tb.second);
    }
}
