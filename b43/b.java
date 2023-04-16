package b43.b;
import aq5.b;
import b43.f;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import android.view.ViewGroup$LayoutParams;
import android.widget.Space;
import lnc.a1;

public final class b implements b	// class@0002f4
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tb, uof, "19") && tb.q.e.mIsFromLiveMate != null)) {
          if (p0 == AudienceBizRelation.PK) {
             if (!p1) {
                tb.X8();
             }
          }else if(p0 == AudienceBizRelation.GAME_INTERACTIVE_PK){
             ViewGroup$LayoutParams layoutParams = tb.w.getLayoutParams();
             int i = (p1)? a1.e(36.00f): 0;
             layoutParams.height = i;
             tb.w.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
