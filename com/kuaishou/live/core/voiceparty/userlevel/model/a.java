package com.kuaishou.live.core.voiceparty.userlevel.model.a;
import hf3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.h;
import wa1.i;
import com.kuaishou.live.core.voiceparty.userlevel.model.a$a;
import com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpNotice;
import java.lang.Class;
import lf3.g;
import com.kuaishou.live.core.voiceparty.userlevel.model.a$b;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kwai.robust.PatchProxy;
import msd.l;
import java.util.Iterator;
import xx2.e;

public final class a	// class@001ad0
{
    public final h a;
    public final i b;

    public void a(a p0){
       a.p(p0, "liveLongConnection");
       super();
       h oh = new h(p0);
       this.a = oh;
       this.b = new i();
       oh.a(945, LiveVoicePartyMicSeatUserLevelUpNotice.class, new a$a(this));
       oh.a(510, SCActionSignal.class, new a$b(this));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.a.b();
       return;
    }
    public final void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          p0.invoke(iterator.next());
       }
       return;
    }
}
