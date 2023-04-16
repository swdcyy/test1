package com.kuaishou.live.core.voiceparty.core.shared.a$a;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import com.kwai.statechart.a;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$q;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$n;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$p;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$o;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$l;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$m;
import com.kwai.statechart.StateChart$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import trd.d1;
import com.kuaishou.live.core.voiceparty.core.shared.KtvOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$c;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.shared.KtvClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$d;
import com.kuaishou.live.core.voiceparty.core.shared.TheaterOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$e;
import com.kuaishou.live.core.voiceparty.core.shared.TheaterClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$f;
import com.kuaishou.live.core.voiceparty.core.shared.TeamPkOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$g;
import com.kuaishou.live.core.voiceparty.core.shared.TeamPkClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$h;
import com.kuaishou.live.core.voiceparty.core.shared.CrossRoomPkOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$i;
import com.kuaishou.live.core.voiceparty.core.shared.CrossRoomPkClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$j;
import com.kuaishou.live.core.voiceparty.core.shared.GridChatOpen;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$k;
import com.kuaishou.live.core.voiceparty.core.shared.GridChatClose;
import com.kuaishou.live.core.voiceparty.core.shared.a$a$b;

public abstract class a$a	// class@0013f9
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;

    public void a$a(a p0){
       this.i = p0;
       super();
       this.a = new a("VoicePartyBlank");
       this.b = new a$a$a(this, "AudioChat");
       this.c = new a$a$q(this, "VideoChat");
       this.d = new a$a$n(this, "Ktv");
       this.e = new a$a$p(this, "Theater");
       this.f = new a$a$o(this, "TeamPk");
       this.g = new a$a$l(this, "CrossRoomPk");
       this.h = new a$a$m(this, "GridChat");
    }
    public void a(StateChart$b p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, a$a.class, "2")) {
          return;
       }
       a.p(obj, "builder");
       a[] uoaArray = new a[]{this.i(),this.g(),this.f(),this.b(),this.h(),this.d()};
       StateChart$b uob = p0;
       uob.i("open_ktv", d1.u(uoaArray), this.e(), KtvOpen.class, a$a$c.a);
       uob.h("close_ktv", this.e(), this.i(), KtvClose.class, a$a$d.a);
       uoaArray = new a[]{this.i(),this.f(),this.e(),this.b(),this.h(),this.d()};
       uob = p0;
       uob.i("open_theater", d1.u(uoaArray), this.g(), TheaterOpen.class, a$a$e.a);
       uob.h("close_theater", this.g(), this.i(), TheaterClose.class, a$a$f.a);
       uoaArray = new a[]{this.i(),this.g(),this.e(),this.b(),this.h(),this.d()};
       uob = p0;
       uob.i("open_team_pk", d1.u(uoaArray), this.f(), TeamPkOpen.class, a$a$g.a);
       uob.h("close_team_pk", this.f(), this.i(), TeamPkClose.class, a$a$h.a);
       uoaArray = new a[]{this.i(),this.b()};
       uob = p0;
       uob.i("open_cross_pk", d1.u(uoaArray), this.c(), CrossRoomPkOpen.class, a$a$i.a);
       uob.h("close_cross_pk", this.c(), this.b(), CrossRoomPkClose.class, a$a$j.a);
       uoaArray = new a[]{this.i(),this.g(),this.f(),this.b(),this.h(),this.e()};
       uob = p0;
       uob.i("open_grid_chat", d1.u(uoaArray), this.d(), GridChatOpen.class, a$a$k.a);
       uob.h("close_grid_chat", this.d(), this.i(), GridChatClose.class, a$a$b.a);
       return;
    }
    public a b(){
       return this.b;
    }
    public a c(){
       return this.g;
    }
    public a d(){
       return this.h;
    }
    public a e(){
       return this.d;
    }
    public a f(){
       return this.f;
    }
    public a g(){
       return this.e;
    }
    public a h(){
       return this.c;
    }
    public a i(){
       return this.a;
    }
}
