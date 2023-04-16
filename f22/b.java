package f22.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e17.i;

public final class b implements g	// class@002844
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, "AutoInviteFriendsGuidingPanel setAutoInvitationSetting succeed");
          i.a(R.style.arg_RES_7f11066a, 0x7f102306);
       }
       return;
    }
}
