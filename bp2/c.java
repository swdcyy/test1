package bp2.c;
import ip2.a;
import qu2.a;
import co2.f2;
import hf3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bp2.a;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;
import lf3.g;
import bp2.b;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;

public final class c extends a	// class@000427
{
    public final h c;
    public final a d;
    public final f2 e;

    public void c(a p0,f2 p1,a p2){
       a.p(p0, "liveBaseContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "longConnection");
       super();
       this.d = p0;
       this.e = p1;
       this.c = new h(p2);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.c.b();
       return;
    }
    public void f(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          this.c.a(841, SCLiveVoicePartyPkStatistic.class, new a(this));
          this.c.a(844, SCLiveVoicePartyPkOpMicSeats.class, new b(this));
       }
       return;
    }
}
