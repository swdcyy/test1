package bq6.a;
import io.reactivex.g;
import bq6.l;
import com.kwai.imsdk.d;
import java.util.Set;
import java.lang.Object;
import brd.v;
import java.lang.String;
import com.kwai.imsdk.model.attachment.KwaiIMAttachmentDao;
import cp6.p;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.model.attachment.KwaiIMAttachmentDao$Properties;
import java.lang.Integer;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.List;
import brd.g;

public final class a implements g	// class@000570
{
    public final l b;
    public final d c;
    public final long d;
    public final long e;
    public final Set f;

    public void a(l p0,d p1,long p2,long p3,Set p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       a tc = this.c;
       a tf = this.f;
       int tarType = tc.getTargetType();
       WhereCondition[] whereConditi = new WhereCondition[0];
       WhereCondition[] whereConditi1 = new WhereCondition[0];
       Property messageId = KwaiIMAttachmentDao$Properties.MessageId;
       WhereCondition[] whereConditi2 = new WhereCondition[0];
       whereConditi2 = new WhereCondition[0];
       QueryBuilder queryBuilder = this.b.b.a().queryBuilder().where(KwaiIMAttachmentDao$Properties.TargetType.eq(Integer.valueOf(tarType)), whereConditi).where(KwaiIMAttachmentDao$Properties.Target.eq(tc.getTarget()), whereConditi1).where(messageId.ge(Long.valueOf(this.d)), whereConditi2).where(messageId.le(Long.valueOf(this.e)), whereConditi2);
       if (!b.c(tf)) {
          whereConditi2 = new WhereCondition[0];
          queryBuilder.where(KwaiIMAttachmentDao$Properties.Type.in(tf), whereConditi2);
       }
       Property[] propertyArra = new Property[]{messageId};
       queryBuilder.orderAsc(propertyArra);
       p0.onNext(queryBuilder.list());
       p0.onComplete();
       return;
    }
}
