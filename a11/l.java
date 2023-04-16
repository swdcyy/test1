package a11.l;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;
import a11.m;
import androidx.lifecycle.LiveData;
import java.lang.Integer;

public class l	// class@000025
{
    public final LiveAudienceGiftBoxVipGradeBarView a;
    public final LifecycleOwner b;
    public m c;

    public void l(LiveAudienceGiftBoxVipGradeBarView p0,LifecycleOwner p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "4")) {
          return;
       }
       l ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveAudienceGiftBoxVipGradeBarView.class, "9")) {
          b.c0(LiveLogTag.LIVE_VIP_GRADE, "hideAndRecordUserRightsInfoRedDot", "mUserRightsId", ta.r);
          LiveUserRightsInfoHelper.a(ta.l, ta.r);
       }
       return;
    }
    public final void b(){
       l ol = l.class;
       if (PatchProxy.applyVoid(null, this, ol, "5")) {
          return;
       }
       Integer value = this.c.h.getValue();
       Integer value1 = this.c.i.getValue();
       if (value != null) {
          this.a.setScoreProgress(value.intValue());
          if (value1 != null) {
             int i = value.intValue() + value1.intValue();
             if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, ol, "6")) {
                if (i > 0) {
                   this.a.setPredictedScoreProgress(i);
                   this.a.setPredictedScoreProgressBarVisibility(0);
                }else {
                   this.a.setPredictedScoreProgressBarVisibility(8);
                }
             }
          }
       }
       return;
    }
}
