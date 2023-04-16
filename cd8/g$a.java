package cd8.g$a;
import java.lang.Runnable;
import cd8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.app.Activity;
import zi8.c;
import ic8.f;
import zi8.e0;
import cd8.f;
import cd8.f$a;

public class g$a implements Runnable	// class@0003f9
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
       tb.b.d(tb, e0.a(f.b(c.a(this.b.a), Activity.class)));
       return;
    }
}
