package gib.f;
import erd.o;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import p1c.a;
import p1c.d;
import q0c.y1;
import brd.t;
import cjd.e;

public final class f implements o	// class@002af2
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          y1 oy1 = y1.h();
          a.o(oy1, "BeautyVersionManager.instance\(\)");
          ot = d.a().j(oy1.b()).map(new e());
       }
       return ot;
    }
}
