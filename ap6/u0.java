package ap6.u0;
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

public final class u0 implements g	// class@000376
{
    public final b b;
    public final String c;
    public final boolean d;

    public void u0(b p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       u0 tb = this.b;
       u0 tc = this.c;
       u0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          WhereCondition[] whereConditi = new WhereCondition[0];
          p0 = d.a(tb.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (p0 != null) {
             p0.setOnlyAdminRemindAll(td);
             d.a(tb.b).e().update(p0);
          }
       }
       return;
    }
}
