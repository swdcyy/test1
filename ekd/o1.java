package ekd.o1;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.utility.n;

public final class o1 implements Runnable	// class@000d66
{
    public final Activity b;

    public void o1(Activity p0){
       this.b = p0;
    }
    public final void run(){
       n.C(this.b);
    }
}
