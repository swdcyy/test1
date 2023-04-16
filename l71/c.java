package l71.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.c$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import l02.e;
import lp3.c;
import l71.d;
import l02.e$a;
import csd.b;
import dsd.e;

public final class c extends AbstractLiveJsCommand	// class@002e92
{

    public void c(){
       super();
    }
    public Class a(){
       return c$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof c$a) {
          p0 = null;
       }
       if (p0 != null) {
          p0 = p0.currentUserTag;
          if (p0 != null) {
          label_0021 :
             h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
             if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, c.class, "2")) {
                this.g(e.class).Ke(p0, new d(oh));
             }
             p0 = oh.b();
             if (p0 == b.h()) {
                e.c(p2);
             }
             return p0;
          }
       }
       p0 = "";
       goto label_0021 ;
    }
}
