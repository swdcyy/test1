package dp2.i$a;
import erd.i;
import java.lang.Object;
import kotlin.Pair;
import com.kuaishou.live.core.voiceparty.model.VoicePartySingerAcceptInviteResponse;
import njd.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class i$a implements i	// class@002573
{
    public static final i$a a;

    static {
       i$a.a = new i$a();
    }
    public void i$a(){
       super();
    }
    public Object a(Object p0,Object p1,Object p2,Object p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "pair");
          a.p(p1, "<anonymous parameter 1>");
          a.p(p2, "<anonymous parameter 2>");
          a.p(p3, "<anonymous parameter 3>");
       }
       return p0;
    }
}
