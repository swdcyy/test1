package f22.l;
import erd.g;
import f22.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class l implements g	// class@00284f
{
    public final m b;

    public void l(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          b.B(LiveLogTag.GUEST_INVITE_FRIENDS, this.b.a+" setAutoInvitationSetting failed");
       }
       return;
    }
}
