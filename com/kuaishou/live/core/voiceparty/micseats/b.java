package com.kuaishou.live.core.voiceparty.micseats.b;
import sfc.a;
import com.kuaishou.live.core.voiceparty.micseats.a;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ps2.i;

public final class b extends a	// class@001577
{
    public final a c;
    public final VoicePartyMicSeatData d;

    public void b(a p0,VoicePartyMicSeatData p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.applyTwoRefs(p0, td, tc, a.class, "27");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(i.a(p0)){
          tc.P(td, 8);
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return;
       }else {
          super.b(p0);
          return;
       }
    }
}
