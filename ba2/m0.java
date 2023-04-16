package ba2.m0;
import oq5.c;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.b;
import ks5.c;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;

public final class m0 implements c	// class@00039d
{
    public final h b;

    public void m0(h p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.orientation == 2) {
          tb.X8();
       }else if(tb.U0 == null || (!PatchProxy.applyVoid(null, tb, h.class, "41") && tb.r != null)){
          h f = tb.F;
          if (f != null) {
             tb.O.b(f);
             tb.J.A0().Pj(AudienceBizRelation.DISTRICT_RANK);
          }
       }
       return;
    }
}
