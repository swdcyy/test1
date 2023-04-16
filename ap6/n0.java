package ap6.n0;
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
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;

public final class n0 implements g	// class@000354
{
    public final b b;
    public final String c;
    public final String d;

    public void n0(b p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       n0 tc = this.c;
       n0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          int i = 0;
          WhereCondition[] whereConditi = new WhereCondition[i];
          p0 = d.a(tb.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (p0 != null) {
             p0.setNickName(td);
             d.a(tb.b).e().update(p0);
          }
          WhereCondition[] whereConditi1 = new WhereCondition[]{KwaiGroupMemberDao$Properties.UserId.eq(y2.c()),KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()))};
          p0 = d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi1).unique();
          if (p0 != null) {
             p0.setNickName(td);
             d.a(tb.b).f().update(p0);
          }
       }
       return;
    }
}
