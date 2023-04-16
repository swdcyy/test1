package laa.l0$b;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class l0$b implements o	// class@002d8f
{
    public final c b;
    public final l c;

    public void l0$b(c p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       l0$b uob = PatchProxy.applyOneRefsWithListener(p0, this, l0$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = this.b;
          PatchProxy.onMethodExit(l0$b.class, "1");
       }
       return uob;
    }
}
