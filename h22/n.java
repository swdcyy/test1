package h22.n;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.activityredpacket.k;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o22.b;
import com.kuaishou.live.core.show.activityredpacket.a0$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h22.a;
import h22.h;

public class n extends m	// class@002c04
{
    public final k c;

    public void n(k p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       n tc = this.c;
       Objects.requireNonNull(tc);
       k ok = k.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ok, "17")) {
          if (!PatchProxy.applyVoid(objArray, tc, ok, "18")) {
             int i = 8;
             tc.r.setVisibility(i);
             tc.s.setVisibility(i);
          }
          ok = tc.H;
          if (ok != null) {
             ok.a(tc.C, true);
          }
       }
       h.c(this.c.F.a(), this.c.M.a(), this.c.M.d(), this.c.M.b(), "GET_USERINFO", this.c.M.c());
       return;
    }
}
