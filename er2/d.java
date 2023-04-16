package er2.d;
import wp2.f;
import er2.d$a;
import android.util.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er2.a;
import er2.d$b;
import tp2.d;
import wp2.e;
import er2.g;
import com.kuaishou.live.core.voiceparty.a;
import co2.f2;
import ee1.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import lf3.g;
import java.util.Objects;
import java.util.List;

public class d extends f	// class@0027bc
{
    public d k;
    public g l;
    public final g m;

    public void d(){
       super();
       this.m = new d$a(this);
    }
    public Pair a(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Pair.create(a.class, new d$b(this));
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.k = this.f(d.class);
       return;
    }
    public void h(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4") && this.l == null) {
          this.l = new g(this.k.o(), this.k.r0(), this.k.p());
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          this.k.u().u0(844, SCLiveVoicePartyPkOpMicSeats.class, this.m);
       }
       return;
    }
    public void j(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          this.k.u().o(844, this.m);
       }
       uod = this.l;
       if (uod != null) {
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(objArray, uod, g.class, "6")) {
             uod.e = false;
             uod.d.clear();
          }
       }
       return;
    }
}
