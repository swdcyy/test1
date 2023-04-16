package laa.l0$a;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;

public final class l0$a implements o	// class@002d8e
{
    public final c b;
    public final c c;
    public final l d;

    public void l0$a(c p0,c p1,l p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       l0$a obj = PatchProxy.applyOneRefsWithListener(p0, this, l0$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = this.b;
          a.o(obj, "with");
          obj = this.d.invoke(obj);
          PatchProxy.onMethodExit(l0$a.class, "1");
       }
       return obj;
    }
}
