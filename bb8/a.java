package bb8.a;
import erd.g;
import z98.b;
import na8.a;
import ma8.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.d;
import crd.b;
import java.lang.Throwable;
import zi8.f1;
import fc8.g;

public class a extends a implements g, b	// class@000324
{
    public b d;
    public g e;
    public boolean f;

    public void a(i p0){
       super(p0);
    }
    public final void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.f == null) {
          this.f = true;
          this.b.b(this, true);
       }
       return;
    }
    public final void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.d != null) {
          if (d.f()) {
             d.a("#jsOnError#", "取消监听 onError: ");
          }
          this.d.dispose();
          this.d = null;
       }
       return;
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
       }else {
          this.B();
          if (this.e != null) {
             if (d.f()) {
                d.a("#jsOnError#", "收到 JS onError 并发送事件: ");
             }
             this.e.b(f1.a(p0));
          }
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.B();
       this.C();
       a te = this.e;
       if (te != null) {
          te.g();
       }
       return;
    }
}
