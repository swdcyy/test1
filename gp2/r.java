package gp2.r;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class r	// class@002b83
{
    public final a a;
    public final boolean b;
    public final RtcManager c;
    public final d d;
    public final t e;

    public void r(a p0,boolean p1,RtcManager p2,d p3,t p4){
       a.p(p0, "source");
       a.p(p2, "rtcManager");
       a.p(p3, "syncCommandDispatcher");
       a.p(p4, "offlineSignal");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final t a(){
       return this.e;
    }
    public final RtcManager b(){
       return this.c;
    }
    public final a c(){
       return this.a;
    }
    public final d d(){
       return this.d;
    }
}
