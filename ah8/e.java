package ah8.e;
import java.lang.Runnable;
import com.mini.plcmanager.live.a;
import android.app.Activity;
import java.lang.Object;
import hh8.i;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;

public final class e implements Runnable	// class@000099
{
    public final a b;
    public final Activity c;

    public void e(a p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       tb.c.destroy();
       tb.c.e(this.c.getWindow().getDecorView());
    }
}
