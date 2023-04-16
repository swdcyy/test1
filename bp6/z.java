package bp6.z;
import io.reactivex.g;
import com.kwai.imsdk.internal.q;
import qo6.b;
import java.lang.Object;
import brd.v;
import java.lang.String;
import rp6.k0;
import l85.b;
import java.lang.Boolean;
import brd.g;
import cp6.k0;
import com.kwai.imsdk.msg.SupplementMsgRangeDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.msg.SupplementMsgRangeDao$Properties;
import java.lang.Integer;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.util.List;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import gq6.b;

public final class z implements g	// class@000562
{
    public final q b;
    public final b c;

    public void z(q p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       z tb = this.b;
       z tc = this.c;
       long l = k0.a(tb.f).b(tc.getTarget(), tc.getTargetType());
       if (l <= 0) {
          b.d("KwaiConversationManager", "isMessageIntegrate maxSeq <= 0");
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
       }else {
          WhereCondition[] whereConditi = new WhereCondition[]{SupplementMsgRangeDao$Properties.Target.eq(tc.getTarget())};
          Property[] propertyArra = new Property[]{SupplementMsgRangeDao$Properties.EndSeq};
          List list = k0.a(tb.f).b().queryBuilder().where(SupplementMsgRangeDao$Properties.TargetType.eq(Integer.valueOf(tc.getTargetType())), whereConditi).orderDesc(propertyArra).limit(1).list();
          if (b.c(list)) {
             p0.onNext(Boolean.FALSE);
             p0.onComplete();
          }else {
             p0.onNext(Boolean.valueOf(list.get(0).e(l)));
             p0.onComplete();
          }
       }
       return;
    }
}
