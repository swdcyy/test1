package fca.b;
import uv8.o$b;
import fca.b$a;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import fca.a;

public class b extends o$b	// class@0022f9
{
    public r0 f;

    public void b(){
       super();
       this.f = new b$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       super.a(p0);
       this.b.o0().d(this.f);
       return;
    }
    public BaseEditor e(){
       a uoa = PatchProxy.apply(null, this, b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.o0().c(this.f);
       super.f();
       this.f = null;
       return;
    }
}
