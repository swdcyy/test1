package ap6.k0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import com.kwai.imsdk.internal.client.i;
import com.kwai.imsdk.d;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;

public final class k0 implements g	// class@000345
{
    public final b b;
    public final String c;
    public final int d;

    public void k0(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       k0 tc = this.c;
       k0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          p0 = i.t(tb.b);
          d uod = new d(4, tc);
          boolean b = true;
          boolean b1 = (2 == td)? true: false;
          p0.D(uod, b1);
          WhereCondition[] whereConditi = new WhereCondition[0];
          p0 = d.a(tb.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.eq(tc), whereConditi).unique();
          if (p0 != null) {
             if (td != 2) {
                b = false;
             }
             p0.setAntiDisturbing(b);
             d.a(tb.b).e().update(p0);
          }
       }
       return;
    }
}
