package as1.k;
import w12.a;
import as1.k$b;
import nsd.u;
import as1.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import as1.k$c;
import as1.k$e;
import as1.k$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import w12.a$b;
import as1.k$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class k extends a	// class@0002a6
{
    public final k$c f;
    public final k$e g;
    public final k$a h;
    public LiveMultiLinePuzzleState i;
    public final m j;
    public static final k$b k;

    static {
       k.k = new k$b(null);
    }
    public void k(m p0){
       a.p(p0, "callback");
       super("LiveMultiLinePuzzleStateMachine", SystemUtil.I());
       this.j = p0;
       k$c uoc = new k$c(this);
       this.f = uoc;
       k$e uoe = new k$e(this);
       this.g = uoe;
       k$a uoa = new k$a(this);
       this.h = uoa;
       this.i = LiveMultiLinePuzzleState.IDLE;
       this.f(uoc);
       this.f(uoe);
       this.f(uoa);
       this.s(uoc);
    }
    public final LiveMultiLinePuzzleState u(){
       return this.i;
    }
    public final boolean v(k$d p0,k$d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.j.a(p0.e(), p1.e());
       this.t(p1);
       this.j.b(p0.e(), p1.e());
       return true;
    }
}
