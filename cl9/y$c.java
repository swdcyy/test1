package cl9.y$c;
import xk9.d;
import cl9.y;
import java.lang.Object;
import kk9.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import xk9.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;

public class y$c implements d	// class@000682
{
    public final y a;

    public void y$c(y p0){
       this.a = p0;
       super();
    }
    public void a(d p0,BaseEditorFragment p1){
       c.b(this, p0, p1);
    }
    public void b(d p0,BaseEditorFragment p1,BaseEditorFragment$g p2){
       c.a(this, p0, p1, p2);
    }
    public void c(d p0,BaseEditorFragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$c.class, "1")) {
          return;
       }
       y j = this.a.J;
       if (j != null) {
          j.o();
          j.J = null;
       }
       j = this.a.K;
       if (j != null) {
          j.o();
          j.K = null;
       }
       return;
    }
    public void d(d p0,BaseEditorFragment p1,BaseEditorFragment$m p2){
       c.f(this, p0, p1, p2);
    }
    public void e(d p0,BaseEditorFragment p1,BaseEditorFragment$h p2){
       c.d(this, p0, p1, p2);
    }
    public void f(d p0,BaseEditorFragment p1){
       c.e(this, p0, p1);
    }
}
