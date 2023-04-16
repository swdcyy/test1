package d32.t;
import erd.g;
import d32.v;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import d32.u;
import java.lang.Runnable;
import yb7.p;

public final class t implements g	// class@00243b
{
    public final v b;

    public void t(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          LiveTimeConsumingUserStatusResponse mLiveAnnounc = p0.mLiveAnnounceInfo;
          if (mLiveAnnounc != null) {
             LiveAnnounceInfo mAnnounceId = mLiveAnnounc.mAnnounceId;
             if (tb.L - mAnnounceId) {
                tb.L = mAnnounceId;
                if (!TextUtils.isEmpty(mLiveAnnounc.mAnnounceContent)) {
                   p.f(new u(tb, p0), tb, v.N);
                }
             }
          }
       }
       return;
    }
}
