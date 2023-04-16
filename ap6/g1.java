package ap6.g1;
import erd.o;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import lh0.a$j0;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;
import lh0.a$h0;
import java.lang.Long;
import yp6.c;
import brd.t;
import com.kwai.imsdk.internal.data.FailureException;
import java.lang.Throwable;

public final class g1 implements o	// class@000332
{
    public final b b;
    public final String c;
    public final String d;

    public void g1(b p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       g1 tb = this.b;
       g1 tc = this.c;
       g1 td = this.d;
       Objects.requireNonNull(tb);
       int i = 0;
       int i1 = 2;
       if (p0.b() != null && (x.b(p0) && p0.b().a != null)) {
          WhereCondition[] whereConditi = new WhereCondition[i1];
          whereConditi[i] = KwaiGroupMemberDao$Properties.UserId.eq(td);
          whereConditi[1] = KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()));
          KwaiGroupMember kwaiGroupMem = d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (kwaiGroupMem != null) {
             kwaiGroupMem.setAntiDisturbing(p0.b().a.c);
             kwaiGroupMem.setSilenceDeadline(Long.valueOf(p0.b().a.k));
             kwaiGroupMem.setCreateTime(Long.valueOf(p0.b().a.g));
             kwaiGroupMem.setInvitedUserId(String.valueOf(p0.b().a.e));
             kwaiGroupMem.setJoinTime(Long.valueOf(p0.b().a.f));
             kwaiGroupMem.setNickName(p0.b().a.b);
             kwaiGroupMem.setRole(p0.b().a.i);
             kwaiGroupMem.setStatus(p0.b().a.d);
             kwaiGroupMem.setUpdateTime(Long.valueOf(p0.b().a.h));
             d.a(tb.b).f().update(kwaiGroupMem);
          }else {
             kwaiGroupMem = c.c(tc, p0.b().a);
             d.a(tb.b).f().insertOrReplace(kwaiGroupMem);
          }
          p0 = t.just(kwaiGroupMem);
       }else {
          WhereCondition[] whereConditi1 = new WhereCondition[i1];
          whereConditi1[i] = KwaiGroupMemberDao$Properties.UserId.eq(td);
          whereConditi1[1] = KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()));
          p0 = d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi1).unique();
          p0 = (p0 == null)? t.error(new FailureException(-200, "")): t.just(p0);
       }
       return p0;
    }
}
