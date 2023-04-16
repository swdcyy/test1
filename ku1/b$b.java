package ku1.b$b;
import java.lang.Runnable;
import ku1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class b$b implements Runnable	// class@002e03
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       b.e3(this.b).setVisibility(8);
       return;
    }
}
