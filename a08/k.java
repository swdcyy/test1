package a08.k;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.lang.Boolean;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.util.Map;
import trd.t0;
import o08.d;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import c08.a;
import java.lang.String;
import b08.a;
import o08.a$b;
import o08.a;

public final class k implements g	// class@000010
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.a;
       if (p0 != null) {
          RNLive b = p0.b;
          if (b != null) {
             b.c("getPendantConfig", t0.z(), new d(p0), a.c(DACKeyNode.DAC_FRAMEWORK, a.d(p0.d), null, 2, null));
          }
       }
       return;
    }
}
