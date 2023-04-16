package cy0.e$a;
import java.lang.Runnable;
import cy0.e;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.PopupWindow;

public class e$a implements Runnable	// class@001ea3
{
    public WeakReference b;

    public void e$a(e p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e uoe = this.b.get();
       if (uoe == null) {
          return;
       }
       if (!PatchProxy.applyVoid(null, uoe, e.class, "9")) {
          e v = uoe.v;
          if (v != null) {
             v.dismiss();
             uoe.v = null;
          }
       }
       return;
    }
}
