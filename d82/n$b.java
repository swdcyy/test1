package d82.n$b;
import androidx.fragment.app.c$b;
import d82.n;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage;
import lnc.a1;
import java.lang.CharSequence;
import iv1.b;
import iv1.a;

public class n$b extends c$b	// class@002498
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n$b.class, "1")) {
          return;
       }
       n$b ta = this.a;
       if (ta.t != null) {
          ta.t = false;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, n.class, "8")) {
             LiveConfigStartupResponse$LiveEscrowNoticeConfig liveEscrowNo = a.n(LiveConfigStartupResponse$LiveEscrowNoticeConfig.class);
             LiveConfigStartupResponse$LiveEscrowNoticeConfig mTopBannerNo = (liveEscrowNo != null)? liveEscrowNo.mTopBannerNoticeShowDurationMs: 0x4e20;
             LiveCommonNotificationMessage liveCommonNo = new LiveCommonNotificationMessage();
             liveCommonNo.u0(a1.p(R.string.arg_RES_7f101e25));
             liveCommonNo.i0(mTopBannerNo);
             ta.r.a(liveCommonNo, null);
          }
       }
       return;
    }
}
