package dl9.m$f;
import java.lang.Runnable;
import dl9.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class m$f implements Runnable	// class@001f7f
{
    public final m b;

    public void m$f(m p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, m$f.class, "1")) {
          return;
       }
       if (this.b.p.performLongClick()) {
          this.b.D = true;
       }
       this.b.p.setPressed(false);
       return;
    }
}
