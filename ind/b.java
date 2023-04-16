package ind.b;
import uv8.o$b;
import ind.b$b;
import ind.b$a;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.j;
import ind.a;

public final class b extends o$b	// class@00102e
{
    public final b$b f;
    public final b$a g;

    public void b(){
       super();
       this.f = new b$b(this);
       this.g = new b$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "editorActivity");
       super.a(p0);
       this.b.o0().d(this.g);
       return;
    }
    public BaseEditor e(){
       a uoa = PatchProxy.apply(null, this, b.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          o$b ta = this.a;
          a.o(ta, "mEditorActivity");
          uoa = new a(ta);
       }
       return uoa;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.b.o0().c(this.g);
       super.f();
       return;
    }
}
