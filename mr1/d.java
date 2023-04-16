package mr1.d;
import java.lang.Runnable;
import mr1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class d implements Runnable	// class@0031f5
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.b.requestLayout();
       return;
    }
}
