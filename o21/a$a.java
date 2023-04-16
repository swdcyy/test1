package o21.a$a;
import aq5.b;
import o21.a;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;

public class a$a implements b	// class@00345b
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void e6(a p0,boolean p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 == AudienceBizRelation.VOICE_PARTY) {
          p0 = this.b.p;
          if (p0 != null) {
             RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
             int t = (p1)? a.t: a.s;
             layoutParams.topMargin = t;
             this.b.p.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
