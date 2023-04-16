package ef0.a$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class a$b implements Runnable	// class@00213c
{
    public final ViewGroup b;
    public final KemTaskPendant c;

    public void a$b(ViewGroup p0,KemTaskPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       this.b.removeView(this.c);
       return;
    }
}
