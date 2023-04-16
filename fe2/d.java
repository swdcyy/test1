package fe2.d;
import erd.g;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.airbnb.lottie.LottieAnimationView;

public final class d implements g	// class@00293a
{
    public final LivePkPeerInfoView b;

    public void d(LivePkPeerInfoView p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LivePkPeerInfoView.class, "12")) {
       }else if(p0.d != null){
          LivePkPeerInfoView h = tb.h;
          if (h != null && TextUtils.n(h.mId, p0.b)) {
             if (p0.c != null) {
                p0 = tb.e;
                if (p0 != null) {
                   p0.s();
                }
             }else {
                tb.c();
             }
          }
       }
       return;
    }
}
