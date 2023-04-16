package gb1.k;
import z1.a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Throwable;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig;
import java.lang.Object;
import bb1.d;
import java.lang.String;

public final class k implements a	// class@00246f
{
    public final UserInfo a;
    public final Throwable b;
    public final boolean c;
    public final LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig d;

    public void k(UserInfo p0,Throwable p1,boolean p2,LiveAdminAbilityExtInfo$LiveAdminForbidCommentConfig p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void accept(Object p0){
       p0.e(this.a.mId, false, this.b, 2, this.c, this.d.mDurationMS);
    }
}
