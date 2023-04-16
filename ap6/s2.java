package ap6.s2;
import erd.o;
import com.kwai.imsdk.group.g;
import java.lang.String;
import com.kwai.imsdk.internal.db.GroupLocation;
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

public final class s2 implements o	// class@00036f
{
    public final g b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final GroupLocation g;
    public final String h;

    public void s2(g p0,String p1,String p2,String p3,String p4,GroupLocation p5,String p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final Object apply(Object p0){
       s2 tb = this.b;
       s2 td = this.d;
       s2 te = this.e;
       s2 tf = this.f;
       s2 tg = this.g;
       s2 th = this.h;
       WhereCondition[] whereConditi = new WhereCondition[0];
       p0 = d.a(tb.c).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(this.c), whereConditi).unique();
       if (p0 != null) {
          if (td != null) {
             p0.setGroupName(td);
          }
          if (te != null) {
             p0.setGroupHeadUrl(te);
          }
          if (tf != null) {
             p0.setTag(tf);
          }
          if (tg != null) {
             p0.setLocation(tg);
          }
          if (th != null) {
             p0.setIntroduction(th);
          }
          d.a(tb.c).e().update(p0);
       }
       return t.just(Boolean.TRUE);
    }
}
