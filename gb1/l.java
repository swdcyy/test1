package gb1.l;
import z1.a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import java.lang.Object;
import bb1.d;
import java.lang.String;
import java.lang.Throwable;

public final class l implements a	// class@002472
{
    public final UserInfo a;
    public final boolean b;
    public final LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig c;

    public void l(UserInfo p0,boolean p1,LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       p0.e(this.a.mId, true, null, 2, this.b, this.c.mDurationMS);
    }
}
