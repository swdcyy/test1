package com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter$c;
import iq5.b;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.BitSet;
import com.kwai.video.waynelive.LivePlayerController;
import y43.a;
import e57.a;
import java.util.Objects;

public class LiveGzoneAudienceActivityBannerPresenter$c extends b	// class@000c54
{
    public final LiveGzoneAudienceActivityBannerPresenter b;

    public void LiveGzoneAudienceActivityBannerPresenter$c(LiveGzoneAudienceActivityBannerPresenter p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveGzoneAudienceActivityBannerPresenter$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       LiveGzoneAudienceActivityBannerPresenter$c tb = this.b;
       if (tb.x == null || (!tb.I.cardinality() && !this.b.M.isSideBySideStream())) {
          boolean b = -1;
          a m = this.b.J.M;
          if (m != null) {
             b = m.k();
          }
          LiveGzoneAudienceActivityBannerPresenter$c tb1 = this.b;
          b = (b == true)? true: false;
          Objects.requireNonNull(tb1);
          LiveGzoneAudienceActivityBannerPresenter liveGzoneAud = LiveGzoneAudienceActivityBannerPresenter.class;
          if (!PatchProxy.isSupport(liveGzoneAud) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb1, liveGzoneAud, "3") && tb1.x != null)) {
             if (b) {
                if (tb1.S == 2) {
                   tb1.R8(1);
                }
             }else {
                tb1.R8(1);
             }
          }
       }
    label_006d :
       return false;
    }
}
