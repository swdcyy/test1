package e29.a$h;
import erd.g;
import e29.a;
import java.lang.Object;
import rd5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class a$h implements g	// class@002135
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          p0 = new Object[0];
          j0.f("AdCollectElement", "comment panel changed!", p0);
          p0.B = true;
       }
       return;
    }
}
