package it1.b;
import w12.a;
import it1.a;
import java.lang.String;
import it1.b$a;
import it1.b$d;
import it1.b$c;
import it1.b$b;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import w12.a$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Enum;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b extends a	// class@002998
{
    public final a f;
    public final a$b g;
    public final a$b h;
    public final a$b i;
    public final a$b j;
    public MultiPkGameState k;

    public void b(a p0){
       super("LiveMultiPkGameStateMachine", true);
       b$a uoa = new b$a(this);
       this.g = uoa;
       b$d uod = new b$d(this);
       this.h = uod;
       b$c uoc = new b$c(this);
       this.i = uoc;
       b$b uob = new b$b(this);
       this.j = uob;
       this.k = MultiPkGameState.IDLE;
       this.f(uoa);
       this.f(uod);
       this.f(uoc);
       this.f(uob);
       this.s(uoa);
       this.f = p0;
    }
    public boolean u(a$b p0,MultiPkGameState p1,MultiPkGameState p2,Object p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.d0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkGameStateMachinetransitionState", "fromState", p1.name(), "toState", p2.name());
       this.f.g(p1, p2, p3);
       this.t(p0);
       this.f.d(p1, p2, p3);
       return true;
    }
}
