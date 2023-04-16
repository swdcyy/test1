package c44.d$a;
import java.lang.Runnable;
import c44.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class d$a implements Runnable	// class@0004af
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, d$a.class, "1")) {
          return;
       }
       if (!this.b.c.getVisibility()) {
          this.b.c.setVisibility(8);
       }
       PatchProxy.onMethodExit(d$a.class, "1");
       return;
    }
}
