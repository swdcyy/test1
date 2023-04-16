package djc.f1$c$a;
import java.lang.Runnable;
import djc.f1$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import djc.f1;

public final class f1$c$a implements Runnable	// class@0021eb
{
    public final f1$c b;

    public void f1$c$a(f1$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, f1$c$a.class, "1")) {
          return;
       }
       this.b.b.a().setVisibility(0);
       this.b.b.c().setVisibility(4);
       PatchProxy.onMethodExit(f1$c$a.class, "1");
       return;
    }
}
