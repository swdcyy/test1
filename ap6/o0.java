package ap6.o0;
import erd.g;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import cp6.o;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import ca7.u;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;
import java.lang.Long;
import java.lang.Throwable;
import l85.b;

public final class o0 implements g	// class@000359
{
    public final b b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public void o0(b p0,String p1,String p2,boolean p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       o0 tc = this.c;
       o0 td = this.d;
       o0 te = this.e;
       o0 tf = this.f;
       Objects.requireNonNull(tb);
       if (x.b(p0)) {
          p0 = o.a(tb.b);
          Objects.requireNonNull(p0);
          WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupMemberDao$Properties.UserId.eq(u.a(td))};
          KwaiGroupMember kwaiGroupMem = d.a(p0.a).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(u.a(tc)), whereConditi).limit(1).unique();
          if (kwaiGroupMem != null) {
             if (te != null) {
                kwaiGroupMem.setSilenceDeadline(Long.valueOf(tf));
             }else {
                kwaiGroupMem.setSilenceDeadline(Long.valueOf(0));
             }
             d.a(p0.a).f().update(kwaiGroupMem);
          }
       }
       return;
    }
}
