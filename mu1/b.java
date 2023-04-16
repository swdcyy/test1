package mu1.b;
import com.yxcorp.gifshow.widget.m;
import mu1.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mu1.f$b;
import mu1.f;
import mu1.k;

public class b extends m	// class@003219
{
    public final a c;

    public void b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.o.u0(new f$b());
       return;
    }
}
