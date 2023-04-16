package o1.f$a$a;
import java.lang.Runnable;
import o1.f$a;
import android.graphics.Typeface;
import java.lang.Object;

public class f$a$a implements Runnable	// class@00273f
{
    public final Typeface b;
    public final f$a c;

    public void f$a$a(f$a p0,Typeface p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.c.e(this.b);
    }
}
