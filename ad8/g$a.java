package ad8.g$a;
import java.lang.Runnable;
import ad8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class g$a implements Runnable	// class@00007e
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       g$a tb = this.b;
       tb.v.setTranslationY(0);
       return;
    }
}
