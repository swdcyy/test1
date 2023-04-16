package e29.a$c;
import erd.g;
import e29.a;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import js7.o;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a$c implements g	// class@002130
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "1")) {
       }else {
          this.b.o0();
          this.b.E().l(a.n0(this.b).isCollected());
          this.b.E().m(a.n0(this.b).numberOfCollects());
          PatchProxy.onMethodExit(a$c.class, "1");
       }
       return;
    }
}
