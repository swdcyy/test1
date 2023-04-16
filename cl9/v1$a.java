package cl9.v1$a;
import xk9.d;
import cl9.v1;
import java.lang.Object;
import kk9.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import xk9.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.List;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;

public class v1$a implements d	// class@000674
{
    public final v1 a;

    public void v1$a(v1 p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v1$a.class, "1")) {
          return;
       }
       if (p1 instanceof EmotionFloatEditorFragment) {
          p1.ji(this.a.s);
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
