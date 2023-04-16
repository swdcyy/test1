package djc.f1$b$a;
import java.lang.Runnable;
import djc.f1$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import djc.f1;

public final class f1$b$a implements Runnable	// class@0021e9
{
    public final f1$b b;
    public final boolean c;

    public void f1$b$a(f1$b p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, f1$b$a.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.b.c().setVisibility(0);
          this.b.b.a().setVisibility(4);
       }else {
          this.b.b.c().setVisibility(4);
          this.b.b.a().setVisibility(4);
       }
       PatchProxy.onMethodExit(f1$b$a.class, "1");
       return;
    }
}
