package bca.a$w;
import erd.g;
import bca.a;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.g;

public final class a$w implements g	// class@000460
{
    public final a b;
    public final v c;

    public void a$w(a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$w.class, "1")) {
       }else {
          a.o(p0, "response");
          this.c.onNext(this.b.j(p0));
       }
       return;
    }
}
