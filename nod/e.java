package nod.e;
import uv8.o$b;
import nod.e$b;
import nod.e$a;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.j;
import nod.d;

public final class e extends o$b	// class@001ea5
{
    public final e$b f;
    public final e$a g;

    public void e(){
       super();
       this.f = new e$b(this);
       this.g = new e$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "editorActivity");
       super.a(p0);
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "bindActivity", objArray);
       this.b.o0().d(this.g);
       return;
    }
    public BaseEditor e(){
       d uod = PatchProxy.apply(null, this, e.class, "3");
       if (uod != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("TextEditorV3Factory", "newInstance", objArray);
          o$b ta = this.a;
          a.o(ta, "mEditorActivity");
          uod = new d(ta);
       }
       return uod;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TextEditorV3Factory", "unbindActivity", objArray);
       this.b.o0().c(this.g);
       super.f();
       return;
    }
}
