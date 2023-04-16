package bp6.y;
import io.reactivex.g;
import com.kwai.imsdk.internal.q;
import com.kwai.imsdk.d;
import z1.i;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.lang.Throwable;
import java.lang.String;
import brd.g;
import cp6.n;
import android.util.Pair;
import java.lang.Long;
import java.lang.Boolean;
import lq6.c;
import java.util.ArrayList;
import org.greenrobot.greendao.query.QueryBuilder;
import com.kwai.imsdk.KwaiConversationDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.Query;
import java.util.List;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;

public final class y implements g	// class@00055f
{
    public final q b;
    public final int c;
    public final int d;
    public final d e;
    public final i f;

    public void y(q p0,int p1,int p2,d p3,i p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       Property updatedTime;
       WhereCondition[] whereConditi;
       Property[] propertyArra;
       y tb = this.b;
       y tc = this.c;
       y td = this.d;
       y te = this.e;
       y tf = this.f;
       Objects.requireNonNull(tb);
       if (!p0.isDisposed()) {
          if (tc < null) {
             p0.onError(new Throwable("categoryId is < 0"));
          }else if(td < null){
             p0.onError(new Throwable("countLimit is < 0"));
          }else {
             n on = n.i(tb.f);
             Objects.requireNonNull(on);
             long l = (te == null)? Long.MAX_VALUE: te.z();
             Pair pair = new Pair(Long.valueOf(l), Boolean.FALSE);
             c uoc = new c();
             boolean b = true;
             uoc.c = b;
             ArrayList uArrayList = new ArrayList();
             int i = 0;
             while (true) {
                if (i <= td) {
                   QueryBuilder queryBuilder = on.l(tc, false);
                   if (pair.second.booleanValue()) {
                      updatedTime = KwaiConversationDao$Properties.UpdatedTime;
                      whereConditi = new WhereCondition[false];
                      queryBuilder.where(updatedTime.gt(pair.first), whereConditi);
                      propertyArra = new Property[b];
                      propertyArra[0] = updatedTime;
                      queryBuilder.orderAsc(propertyArra);
                   }else {
                      updatedTime = KwaiConversationDao$Properties.UpdatedTime;
                      whereConditi = new WhereCondition[false];
                      queryBuilder.where(updatedTime.lt(pair.first), whereConditi);
                      propertyArra = new Property[b];
                      propertyArra[0] = updatedTime;
                      queryBuilder.orderDesc(propertyArra);
                   }
                   ArrayList uArrayList1 = new ArrayList();
                   List list = queryBuilder.build().list();
                   if (!b.c(list)) {
                      if (list.size() >= td) {
                         uArrayList1.addAll(list.subList(false, td));
                      }else {
                         uArrayList1.addAll(list);
                      }
                      on.e(uArrayList1);
                   }
                   uArrayList1 = b.a(uArrayList1);
                   if (!uArrayList1.size()) {
                   label_0107 :
                      b = false;
                   }else {
                      int i1 = uArrayList1.size();
                      int i2 = 0;
                      while (true) {
                         if (i2 < i1) {
                            if (tf.test(uArrayList1.get(i2))) {
                               uArrayList.add(uArrayList1.get(i2));
                               i = i + 1;
                               if (i >= td) {
                               }
                            }
                            i2 = i2 + 1;
                         }else {
                            i1 = i1 - 1;
                            pair = new Pair(Long.valueOf(uArrayList1.get(i1).z()), Boolean.FALSE);
                         }
                      }
                   }
                }else {
                   goto label_0107 ;
                }
             }
             uoc.c = b;
             uoc.a = uArrayList;
             p0.onNext(uoc);
             p0.onComplete();
          }
       }
       return;
    }
}
