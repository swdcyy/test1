package ap6.r2;
import erd.o;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.lang.Boolean;
import brd.t;

public final class r2 implements o	// class@00036a
{
    public final g b;
    public final String c;
    public final String d;

    public void r2(g p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       r2 tb = this.b;
       r2 td = this.d;
       WhereCondition[] whereConditi = new WhereCondition[0];
       p0 = d.a(tb.c).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(this.c), whereConditi).unique();
       if (p0 != null) {
          p0.setDescription(td);
          d.a(tb.c).e().update(p0);
       }
       return t.just(Boolean.TRUE);
    }
}