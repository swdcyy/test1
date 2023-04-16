package lt1.g$b;
import android.view.View$OnClickListener;
import lt1.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lt1.a$a;
import lt1.a;

public final class g$b implements View$OnClickListener	// class@00302a
{
    public final e b;

    public void g$b(e p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       this.b.x0(a$a.a);
       return;
    }
}
