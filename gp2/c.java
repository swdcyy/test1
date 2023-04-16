package gp2.c;
import erd.c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;

public final class c implements c	// class@002b74
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public Object a(Object p0,Object p1){
       Pair pair = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          a.p(p1, "position");
          pair = new Pair(p0, p1);
       }
       return pair;
    }
}
