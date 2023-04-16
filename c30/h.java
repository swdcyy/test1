package c30.h;
import q07.a;
import com.kuaishou.cover.container.loader.b;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.cover.Link;
import com.kuaishou.cover.b;
import z20.a;

public class h extends a	// class@0002eb
{
    public final b c;

    public void h(b p0,int p1,FragmentActivity p2){
       this.c = p0;
       super(p1, p2);
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       if (Link.h().m() != null && (Link.h().m().b() != null && Link.h().m().b().a())) {
          this.c.i();
       }
    label_003a :
       return;
    }
}
