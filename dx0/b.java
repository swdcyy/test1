package dx0.b;
import aq5.b;
import dx0.f;
import java.lang.Object;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.widget.ImageView;

public final class b implements b	// class@002050
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       b tb = this.b;
       if (tb.O != null && (p0 == AudienceBizRelation.VOICE_PARTY || p0 == AudienceBizRelation.CHAT_CENTER_STATUS_VIEW)) {
          if (p1) {
             tb.c9();
             tb.L.setVisibility(4);
             tb.K.setVisibility(4);
          }else {
             tb.L.setVisibility(0);
             tb.K.setVisibility(0);
             tb.a9();
             tb.b9();
          }
       }
       return;
    }
}
