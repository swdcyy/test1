package ou1.j;
import com.yxcorp.gifshow.widget.m;
import ou1.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ou1.v$a;
import ou1.v;

public final class j extends m	// class@00359f
{
    public final g c;

    public void j(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.c.D0(v$a.a);
       return;
    }
}
