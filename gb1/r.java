package gb1.r;
import erd.g;
import gb1.s;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import e17.i;
import gb1.l;
import z1.a;
import eb1.e;

public final class r implements g	// class@002484
{
    public final s b;
    public final UserInfo c;
    public final boolean d;
    public final LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig e;

    public void r(s p0,UserInfo p1,boolean p2,LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       tb.i(new l(this.c, this.d, this.e));
    }
}
