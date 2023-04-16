package gp2.j;
import erd.o;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class j implements o	// class@002b7b
{
    public final a b;

    public void j(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       j oj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          oj = this.b;
       }
       return oj;
    }
}
