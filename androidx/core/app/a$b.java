package androidx.core.app.a$b;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import l1.b;

public class a$b implements Runnable	// class@0006f5
{
    public final Activity b;

    public void a$b(Activity p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (!this.b.isFinishing() && !b.i(this.b)) {
          this.b.recreate();
       }
       return;
    }
}
