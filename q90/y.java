package q90.y;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Integer;
import java.util.Iterator;
import android.view.View;

public final class y	// class@0029b2
{
    public int a;
    public ArrayList b;

    public void y(){
       super();
       this.b = new ArrayList();
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       a.p(p0, "views");
       this.b.addAll(p0);
       return;
    }
    public final void b(int p0,int p1){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oy, "2")) {
          return;
       }
       if (this.a == null) {
          this.a = p0;
       }
       float f = - (float)(this.a + p1);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          a.o(view, "view");
          if (!view.getVisibility()) {
             view.setTranslationY(f);
          }
       }
       return;
    }
}
