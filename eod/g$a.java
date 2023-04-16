package eod.g$a;
import java.lang.Runnable;
import eod.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eod.e;
import android.view.ViewGroup;

public final class g$a implements Runnable	// class@000dbf
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       this.b.a.e.setAlpha(0x3f800000);
       return;
    }
}
