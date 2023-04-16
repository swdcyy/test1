package bp6.x;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.q;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import cp6.n;
import java.util.Objects;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.ArrayList;
import com.kwai.imsdk.KwaiConversationDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.KwaiConversationDao$Properties;
import java.lang.Integer;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.imsdk.d;
import java.lang.StringBuilder;
import l85.b;
import java.lang.Boolean;

public final class x implements Callable	// class@00055c
{
    public final q b;
    public final List c;
    public final int d;

    public void x(q p0,List p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       x tc = this.c;
       x td = this.d;
       n on = n.i(this.b.f);
       Objects.requireNonNull(on);
       on.c(td);
       if (!b.c(tc)) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          while (i < tc.size()) {
             WhereCondition[] whereConditi = new WhereCondition[0];
             whereConditi = new WhereCondition[]{KwaiConversationDao$Properties.Target.eq(tc.get(i).getTarget())};
             List list = on.o().queryBuilder().where(KwaiConversationDao$Properties.Category.eq(Integer.valueOf(td)), whereConditi).where(KwaiConversationDao$Properties.TargetType.eq(Integer.valueOf(tc.get(i).getTargetType())), whereConditi).list();
             if (!b.c(list)) {
                d uod = list.get(0);
                uod.e0(tc.get(i).A());
                uArrayList.add(uod);
             }
             i = i + 1;
          }
          on.a(uArrayList, 0);
       }
       return Boolean.valueOf(1);
    }
}
