package ap6.q3;
import erd.o;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import lh0.a$l0;
import lh0.a$h0;
import java.util.List;
import yp6.c;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import java.lang.Iterable;
import org.greenrobot.greendao.AbstractDao;
import cp6.o;
import org.greenrobot.greendao.query.QueryBuilder;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Throwable;
import l85.b;
import java.util.Collections;
import brd.t;
import com.kwai.imsdk.internal.data.FailureException;

public final class q3 implements o	// class@000366
{
    public final g b;
    public final String c;

    public void q3(g p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       String str;
       q3 tb = this.b;
       q3 tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0.b() != null && x.b(p0)) {
          d.a(tb.c).f().insertOrReplaceInTx(c.e(p0.b().a, tc));
          p0 = o.a(tb.c);
          Objects.requireNonNull(p0);
          try{
             str = "KwaiGroupBiz";
             WhereCondition[] whereConditi = new WhereCondition[i];
             p0 = d.a(p0.a).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi).list();
          label_0068 :
             p0 = t.just(p0);
          }catch(java.lang.Exception e6){
             b.e(str, "getMemberListByGroupId", e6);
          }catch(java.lang.Error e6){
             b.e(str, "getMemberListByGroupId", e6);
          }
          p0 = Collections.emptyList();
          goto label_0068 ;
       }else {
          WhereCondition[] whereConditi1 = new WhereCondition[i];
          p0 = t.error(new FailureException(p0.c(), p0.a()).setValue(d.a(tb.c).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi1).list()));
       }
       return p0;
    }
}
