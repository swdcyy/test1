package f22.k;
import erd.g;
import f22.m;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class k implements g	// class@00284e
{
    public final m b;

    public void k(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, this.b.a+" setAutoInvitationSetting succeed");
       }
       return;
    }
}
