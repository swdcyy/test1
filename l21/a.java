package l21.a;
import aq5.b;
import l21.b;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.view.View;

public final class a implements b	// class@002e62
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.GUEST_ACTIVITY) {
          b q = tb.q;
          if (q != null) {
             if (p1) {
                q.setVisibility(8);
             }else {
                q.setVisibility(0);
             }
          }
       }
       return;
    }
}
