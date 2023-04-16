package mr1.b$c;
import android.view.View$OnClickListener;
import j83.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sq1.f$h;
import sq1.f;

public final class b$c implements View$OnClickListener	// class@0031f0
{
    public final b b;
    public final int c;

    public void b$c(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       this.b.g(new f$h(this.c));
       return;
    }
}
