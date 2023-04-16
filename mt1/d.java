package mt1.d;
import android.view.View$OnClickListener;
import lt1.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lt1.a$a;
import lt1.a;

public final class d implements View$OnClickListener	// class@003215
{
    public final j b;

    public void d(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.b.x0(a$a.a);
       return;
    }
}
