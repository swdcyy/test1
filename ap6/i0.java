package ap6.i0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import bq6.y2;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;

public final class i0 implements g	// class@00033b
{
    public final b b;
    public final String c;

    public void i0(b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       i0 tc = this.c;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          WhereCondition[] whereConditi = new WhereCondition[0];
          p0 = d.a(tb.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (p0 != null) {
             p0.setMemberStatus(2);
             d.a(tb.b).e().update(p0);
          }
          whereConditi = new WhereCondition[]{KwaiGroupMemberDao$Properties.UserId.eq(y2.c())};
          p0 = d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (p0 != null) {
             p0.setStatus(2);
             d.a(tb.b).f().update(p0);
          }
       }
       return;
    }
}
