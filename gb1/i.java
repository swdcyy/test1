package gb1.i;
import erd.g;
import gb1.s;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import sfc.a;
import gb1.k;
import z1.a;
import eb1.e;

public final class i implements g	// class@002469
{
    public final s b;
    public final UserInfo c;
    public final boolean d;
    public final LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig e;

    public void i(s p0,UserInfo p1,boolean p2,LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       new a().b(p0);
       tb.i(new k(this.c, p0, this.d, this.e));
    }
}
