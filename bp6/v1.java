package bp6.v1;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.Integer;
import qo6.p;
import java.lang.String;
import mp6.d;
import com.kwai.imsdk.KwaiConversationDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.KwaiConversationDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.Collection;
import org.greenrobot.greendao.query.DeleteQuery;

public class v1 implements Runnable	// class@000555
{
    public final v b;

    public void v1(v p0){
       this.b = p0;
       super();
    }
    public void run(){
       p w = v.w;
       int i = 0;
       Integer integer = Integer.valueOf(8);
       if (w != null && w.A != null) {
          WhereCondition[] whereConditi = new WhereCondition[]{KwaiConversationDao$Properties.Target.notIn(v.w.A)};
          d.a(this.b.a).b().queryBuilder().where(KwaiConversationDao$Properties.TargetType.eq(integer), whereConditi).buildDelete().executeDeleteWithoutDetachingEntities();
       }else if(w != null){
          WhereCondition[] whereConditi1 = new WhereCondition[i];
          d.a(this.b.a).b().queryBuilder().where(KwaiConversationDao$Properties.TargetType.eq(integer), whereConditi1).buildDelete().executeDeleteWithoutDetachingEntities();
       }
       return;
    }
}
