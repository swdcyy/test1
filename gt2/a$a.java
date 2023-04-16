package gt2.a$a;
import co2.r;
import gt2.a;
import msd.s;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import java.lang.System;
import yt2.b;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import kotlin.jvm.internal.a;

public final class a$a implements r	// class@002ba3
{
    public int b;
    public long c;
    public final a d;
    public final s e;

    public void a$a(a p0,s p1){
       this.d = p0;
       this.e = p1;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       q.a(this, p0, p1);
    }
    public void c(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (this.d.d != null) {
          this.e.invoke(Long.valueOf(this.c), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.d.i.a()), Integer.valueOf(this.b), Integer.valueOf(p0));
       }
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$a.class, "1")) {
          return;
       }
       a.p(p2, "micSeatInfo");
       this.b = p0;
       this.c = System.currentTimeMillis();
       return;
    }
}
