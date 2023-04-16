package bc9.l$h;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.widget.q;

public final class l$h implements i	// class@0003fa
{
    public final l a;

    public void l$h(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$h.class, "1")) {
       }else {
          a.p(p0, "newState");
          if (p0.e()) {
             if (this.a.s != p0.f()) {
                this.a.s = p0.f();
                p0 = this.a;
                if (p0.s != null) {
                   p0.g2().l().c(false);
                }else {
                   p0.g2().l().d(false);
                }
             }
          }else if(this.a.s != p0.f()){
             this.a.s = p0.f();
             p0 = this.a;
             if (p0.s == null) {
                p0.g2().l().d(false);
             }
          }
       }
       return;
    }
}
