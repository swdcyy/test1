package kz9.b;
import w4.j;
import kz9.c;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import js7.o;
import java.util.Objects;
import pp7.b;

public final class b implements j	// class@002d2b
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(CollectElement.n0(this.a.b).isCollected()){
          o oo = this.a.b.E();
          Objects.requireNonNull(oo);
          if (!PatchProxy.applyVoidOneRefs(p0, oo, o.class, "13")) {
             oo.j.f(p0);
          }
          this.a.b.E().n(true);
          CollectElement.s0(this.a.b, false, false, 2, null);
       }
       return;
    }
}
