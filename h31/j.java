package h31.j;
import erd.g;
import h31.l;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h31.d;
import lnc.c3$a;
import lnc.c3;
import ms5.a;
import com.kuaishou.live.core.show.topbar.authorauthentication.LiveAudienceAuthorAuthentication;
import java.lang.Boolean;
import io.reactivex.subjects.ReplaySubject;

public final class j implements g	// class@002617
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveAudienceAuthorAuthentication;
       if (p0 == null) {
          if (!PatchProxy.applyVoid(null, tb, l.class, "9")) {
             c3.c(tb.P, new d(tb));
          }
       }else {
          tb.R = p0.convertToReinforceItem();
          tb.V.onNext(Boolean.TRUE);
       }
       return;
    }
}
