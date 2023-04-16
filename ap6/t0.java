package ap6.t0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;
import java.lang.Iterable;

public final class t0 implements g	// class@000372
{
    public final b b;
    public final String c;
    public final List d;

    public void t0(b p0,String p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       t0 tb = this.b;
       t0 tc = this.c;
       t0 td = this.d;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupMemberDao$Properties.UserId.in(td)};
          p0 = d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(tc), whereConditi).list();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             KwaiGroupMember kwaiGroupMem = iterator.next();
             if (kwaiGroupMem != null) {
                kwaiGroupMem.setStatus(3);
             }
          }
          d.a(tb.b).f().updateInTx(p0);
       }
       return;
    }
}
