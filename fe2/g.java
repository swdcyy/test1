package fe2.g;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$b;

public class g extends m	// class@00293d
{
    public final LivePkPeerInfoView c;

    public void g(LivePkPeerInfoView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, LivePkPeerInfoView.class, "9")) {
          LivePkPeerInfoView k = tc.k;
          if (k != null) {
             k.d(tc.h);
          }
       }
       return;
    }
}
