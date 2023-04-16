package nmd.f0$b;
import com.yxcorp.gifshow.v3.EditorManager$b;
import nmd.f0;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yld.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import ooc.c1;

public final class f0$b implements EditorManager$b	// class@001e55
{
    public final f0 a;

    public void f0$b(f0 p0){
       this.a = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
          return;
       }
       if (p0 != this.a.H()) {
          this.a.I().R();
       }
       return;
    }
    public void e(){
       c1.b(this);
    }
    public void f(){
       c1.a(this);
    }
}
