package m02.g;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.e;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.live.core.basic.activity.e$b;

public final class g implements Runnable	// class@0030bc
{
    public final e b;

    public void g(e p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       if (tb.b.getActivity() != null) {
          tb.i(tb.b.getActivity());
       }
       return;
    }
}
