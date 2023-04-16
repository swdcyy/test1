package hc.a$a;
import java.lang.Runnable;
import hc.a;
import java.lang.Object;
import android.graphics.drawable.Drawable;

public class a$a implements Runnable	// class@002119
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       a$a tb = this.b;
       tb.unscheduleSelf(tb.r);
       this.b.invalidateSelf();
    }
}
