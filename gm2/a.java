package gm2.a;
import aq5.b;
import gm2.b;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.common.core.component.watchtimer.b;
import java.lang.String;

public final class a implements b	// class@002b48
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.VOICE_PARTY) {
          b.e().a(tb.b9(), tb.a9());
       }
       return;
    }
}
