package mp1.b;
import rd1.d;
import mp1.a;
import mp1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fh3.f;

public final class b implements d	// class@0031db
{
    public final a b;
    public final c c;

    public void b(a p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void jd(int p0,boolean p1,String p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "2")) {
          return;
       }
       this.c.g(p0);
       this.b.V2(this.c);
       return;
    }
    public void p9(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.b;
       b tc = this.c;
       Objects.requireNonNull(uob);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(p0), uob, uoa, "5")) {
          b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite rejectInvitationInner", "onInviteExtra", tc, "endReason", Integer.valueOf(p0));
          uob.k.reject(tc.e(), null);
       }
       return;
    }
}
