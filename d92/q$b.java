package d92.q$b;
import java.lang.Runnable;
import d92.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;

public final class q$b implements Runnable	// class@0024ba
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q$b.class, "1")) {
          return;
       }
       n.W(this.b.c, 8, 1000);
       return;
    }
}
