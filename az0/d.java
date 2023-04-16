package az0.d;
import aq5.b;
import com.kuaishou.live.audience.component.gift.gift.b;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.common.core.component.gift.gift.i;
import bm1.b;

public final class d implements b	// class@0002d2
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.VOICE_PARTY) {
          tb.D.d(p1);
       }
       return;
    }
}
