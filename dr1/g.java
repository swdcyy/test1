package dr1.g;
import w12.a;
import dr1.g$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import dr1.g$b;
import dr1.g$d;
import dr1.g$c;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import w12.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class g extends a	// class@00200a
{
    public final g$b f;
    public final g$d g;
    public final g$c h;
    public LiveMultiLineArenaLiveState i;
    public final g$a j;

    public void g(g$a p0){
       a.p(p0, "callback");
       super("LiveMultiLineArenaLineStateMachine", SystemUtil.I());
       this.j = p0;
       g$b uob = new g$b(this);
       this.f = uob;
       g$d uod = new g$d(this);
       this.g = uod;
       g$c uoc = new g$c(this);
       this.h = uoc;
       this.i = LiveMultiLineArenaLiveState.IDLE;
       this.f(uob);
       this.f(uod);
       this.f(uoc);
       this.s(uob);
    }
    public final LiveMultiLineArenaLiveState u(){
       return this.i;
    }
    public final void v(a$b p0,LiveMultiLineArenaLiveState p1,LiveMultiLineArenaLiveState p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g.class, "1")) {
          return;
       }
       this.t(p0);
       this.j.a(p1, p2, p3);
       return;
    }
}
