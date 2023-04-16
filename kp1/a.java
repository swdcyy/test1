package kp1.a;
import w12.a;
import vp1.b;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import kp1.a$c;
import kp1.a$a;
import kp1.a$b;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import w12.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends a	// class@002dc6
{
    public final a$c f;
    public final a$a g;
    public final a$b h;
    public MultiChatState i;
    public final b j;
    public final a k;

    public void a(b p0,a p1){
       a.p(p0, "stateMachineCallback");
       a.p(p1, "getCommonLog");
       super("LiveAudienceMultiChatStateMachine", SystemUtil.I());
       this.j = p0;
       this.k = p1;
       a$c uoc = new a$c(this);
       this.f = uoc;
       a$a uoa = new a$a(this);
       this.g = uoa;
       a$b uob = new a$b(this);
       this.h = uob;
       this.i = MultiChatState.IDLE;
       this.f(uoc);
       this.f(uoa);
       this.f(uob);
       this.s(uoc);
    }
    public final MultiChatState u(){
       return this.i;
    }
    public final void v(MultiChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.i = p0;
       return;
    }
    public final void w(a$b p0,MultiChatState p1,MultiChatState p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "2")) {
          return;
       }
       this.j.H0(p1, p2, p3);
       this.t(p0);
       this.j.h0(p1, p2, p3);
       return;
    }
}
