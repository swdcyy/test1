package dt1.h;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import java.lang.Object;
import dt1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dt1.f$b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankEntryView;
import java.util.Objects;
import dt1.f$a;
import android.view.View;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;

public final class h implements Observer	// class@00201e
{
    public final LiveMultiPkCohesionRankVC b;

    public void h(LiveMultiPkCohesionRankVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, str)) {
       }else {
          h tb = this.b;
          if (a.g(p0, f$b.a)) {
             p0 = LiveMultiPkCohesionRankVC.V2(tb);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, LiveMultiPkCohesionRankEntryView.class, str)) {
                p0.L();
             }
          }else if(p0 instanceof f$a){
             f$a uoa = LiveMultiPkCohesionRankVC.V2(tb);
             p0 = p0.a;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidOneRefs(p0, uoa, LiveMultiPkCohesionRankEntryView.class, "3")) {
                uoa.C.setVisibility(8);
                uoa.D.p0(p0, HeadImageSize.ADJUST_MIDDLE, false);
                float f = 0x3f800000;
                uoa.D.setScaleX(f);
                uoa.D.setScaleY(f);
                uoa.E.setVisibility(false);
                p0 = uoa.B.getLayoutParams();
                if (p0 != null) {
                   p0.width = a1.e(67.00f);
                   uoa.B.setLayoutParams(p0);
                }
             }
          }
       }
       return;
    }
}
