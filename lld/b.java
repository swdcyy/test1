package lld.b;
import uv8.o$b;
import lld.b$a;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t36.f;
import ooc.j0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kwai.robust.PatchProxyResult;
import lld.a;
import twc.a;
import uwc.a;
import java.util.List;
import java.util.Iterator;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class b extends o$b	// class@001c41
{
    public r0 f;

    public void b(){
       super();
       this.f = new b$a(this);
    }
    public void a(EditorActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.a(p0);
       this.b.o0().d(this.f);
       return;
    }
    public BaseEditor e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       a uoa = PatchProxy.apply(objArray, this, uob, "4");
       if (uoa != patchProxyRe) {
       }else {
          Object[] objArray1 = PatchProxy.apply(objArray, this, uob, "3");
          if (objArray1 != patchProxyRe) {
          }else {
             Iterator iterator = this.c().v0().iterator();
             while (iterator.hasNext()) {
                a uoa1 = iterator.next();
                if (uoa1 instanceof a) {
                   objArray = uoa1;
                }
             }
             objArray1 = objArray;
          }
          uoa = new a(objArray1.D());
       }
       return uoa;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.b.o0().c(this.f);
       super.f();
       this.f = null;
       return;
    }
}
