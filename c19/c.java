package c19.c;
import c19.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qvb.n0;
import qvb.q;
import qvb.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jb5.a;

public final class c extends a	// class@0004c3
{
    public a r;

    public void c(){
       super();
    }
    public Object P8(){
       c obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("pageList");
       }
       return obj.L0();
    }
    public void R8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.p(p0, "pageListObserver");
       c tr = this.r;
       if (tr == null) {
          a.S("pageList");
       }
       tr.h(p0);
       return;
    }
    public void S8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       a.p(p0, "pageListObserver");
       c tr = this.r;
       if (tr == null) {
          a.S("pageList");
       }
       tr.f(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.r = obj;
       return;
    }
}
