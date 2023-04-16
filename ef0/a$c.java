package ef0.a$c;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class a$c implements Runnable	// class@00213d
{
    public final ViewGroup b;
    public final KemTaskPendant c;

    public void a$c(ViewGroup p0,KemTaskPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, a$c.class, "1")) {
          return;
       }
       this.b.removeView(this.c);
       PatchProxy.onMethodExit(a$c.class, "1");
       return;
    }
}
