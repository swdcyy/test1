package kod.a$f;
import java.lang.Runnable;
import kod.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnTouchListener;
import android.view.View;

public final class a$f implements Runnable	// class@0017fd
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "1")) {
          return;
       }
       this.b.K();
       a i = this.b.i;
       if (i != null) {
          i.setOnTouchListener(null);
       }
       return;
    }
}
