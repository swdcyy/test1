package k21.e;
import aq5.b;
import k21.k;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import oq5.b;

public final class e implements b	// class@002c69
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.VOICE_PARTY) {
          tb.B = false;
          if (p1) {
             tb.p.b();
          }
       }
       if (p0 == AudienceBizRelation.GAME_INTERACTIVE) {
          if (p1 && tb.Y8()) {
             tb.W8();
          }else {
             tb.V8();
          }
       }
       return;
    }
}
