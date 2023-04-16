package ap6.j0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import cp6.o;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import ca7.u;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.lang.Throwable;
import l85.b;

public final class j0 implements g	// class@000340
{
    public final b b;
    public final String c;
    public final int d;

    public void j0(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       j0 tc = this.c;
       j0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          p0 = o.a(tb.b);
          Objects.requireNonNull(p0);
          WhereCondition[] whereConditi = new WhereCondition[0];
          KwaiGroupInfo kwaiGroupInf = d.a(p0.a).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(u.a(tc)), whereConditi).limit(1).unique();
          if (kwaiGroupInf != null) {
             kwaiGroupInf.setInvitePermission(td);
             d.a(p0.a).e().update(kwaiGroupInf);
          }
       }
       return;
    }
}
