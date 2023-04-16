package fia.k$a$a;
import erd.g;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import tga.e;

public final class k$a$a implements g	// class@002915
{
    public static final k$a$a b;

    static {
       k$a$a.b = new k$a$a();
    }
    public void k$a$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a$a.class, "1")) {
       }else {
          a.p(p0, "event");
          RxBus.f.b(new e(p0.b));
       }
       return;
    }
}
