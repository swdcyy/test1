package fs2.m;
import android.view.View$OnClickListener;
import fs2.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import fs2.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import co2.q1;

public final class m implements View$OnClickListener	// class@0029b3
{
    public final n b;

    public void m(n p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       n n;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, n.class, "5")) {
          n = tb.n;
          if (n != null && n.r2(AudienceBizRelation.VOICE_PARTY_KTV) == true) {
             tb.p.a0(2);
          }
          q1.n(tb.k, tb.l.a(), 2);
       }
       PatchProxy.onMethodExit(m.class, "1");
       return;
    }
}
