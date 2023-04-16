package bq6.x2;
import bq6.x2$a;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import cp6.x;
import com.kwai.chat.sdk.signal.BizDispatcher;
import to6.u;
import ph0.a$a;
import com.kwai.imsdk.internal.util.b;
import java.util.Iterator;
import java.util.Set;
import aq6.c;
import java.util.ArrayList;
import rh0.c$d;
import fq6.a;
import ph0.a$b;
import java.util.Collection;
import l85.c;
import l85.b;
import com.kwai.imsdk.model.tag.KwaiIMConversationTagDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.model.tag.KwaiIMConversationTagDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Integer;
import org.greenrobot.greendao.query.Query;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.Iterable;
import java.lang.Throwable;
import java.util.Locale;
import j75.j;
import org.greenrobot.greendao.query.WhereCondition$StringCondition;
import mp6.d;
import org.greenrobot.greendao.query.DeleteQuery;
import aq6.b;
import java.util.List;
import brd.t;
import uo6.c;
import qo6.p;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import pq6.a;
import bq6.q2;
import io.reactivex.g;
import bq6.t2;
import erd.o;
import bq6.v2;
import erd.r;
import bq6.u2;
import bq6.s2;
import erd.g;

public class x2	// class@0005ce
{
    public final String a;
    public final x b;
    public final u c;
    public final Set d;
    public final Set e;
    public static final BizDispatcher f;

    static {
       x2.f = new x2$a();
    }
    public void x2(String p0){
       super();
       this.d = new CopyOnWriteArraySet();
       this.e = new CopyOnWriteArraySet();
       this.a = p0;
       this.b = x.b.get(p0);
       this.c = u.c.get(p0);
    }
    public static x2 b(String p0){
       return x2.f.get(p0);
    }
    public final int a(a$a[] p0){
       int i = 0;
       if (!b.e(p0)) {
          int len = p0.length;
          int i2 = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             object oobject = p0[i1];
             int i3 = (oobject == null || b.e(oobject.c))? 0: oobject.c.length;
             i2 = i2 + i3;
          }
          i = i2;
       }
       return i;
    }
    public final void c(int p0,String p1){
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc != null) {
             uoc.b(p0, p1);
          }
       }
       return;
    }
    public final void d(int p0,a$a[] p1){
       c$d b;
       a uoa;
       c uoc1;
       b uob;
       c uoc2;
       x2 ox2 = this;
       int i = p0;
       int i1 = p1;
       if (b.e(p1)) {
          return;
       }
       ArrayList uArrayList = new ArrayList(i1.length);
       int len = i1.length;
       int i2 = 0;
       int i3 = 0;
       while (i3 < len) {
          object oobject = i1[i3];
          if (oobject != null && !b.e(oobject.c)) {
             a$a c = oobject.c;
             int len1 = c.length;
             int i4 = 0;
             while (i4 < len1) {
                object oobject1 = c[i4];
                a$a a = oobject.a;
                c$d a1 = a.a;
                b = a.b;
                if (oobject1 == null) {
                   uoa = null;
                }else {
                   a uoa1 = new a();
                   uoa1.k(a1);
                   uoa1.l(b);
                   uoa1.j(oobject1.a);
                   uoa1.g(oobject1.b);
                   uoa1.i(oobject1.c);
                   uoa = uoa1;
                }
                if (uoa != null) {
                   uArrayList.add(uoa);
                }
                i4 = i4 + 1;
             }
          }
          i3 = i3 + 1;
       }
       if (!b.c(uArrayList) && !b.c(uArrayList)) {
          c uoc = new c("KwaiIMConversationTagManager#updateTagAndNotifyChange");
          b.a(uoc.c());
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          int i5 = 1;
          while (iterator.hasNext()) {
             a uoa2 = iterator.next();
             WhereCondition[] whereConditi = new WhereCondition[i2];
             WhereCondition[] whereConditi1 = new WhereCondition[i2];
             Object[] objArray = new Object[i5];
             objArray[i2] = Integer.valueOf(uoa2.d());
             WhereCondition[] whereConditi2 = new WhereCondition[i2];
             a uoa3 = ox2.b.a().queryBuilder().where(KwaiIMConversationTagDao$Properties.TargetId.eq(uoa2.e()), whereConditi).where(KwaiIMConversationTagDao$Properties.TargetType.eq(Integer.valueOf(uoa2.f())), whereConditi1).where(KwaiIMConversationTagDao$Properties.Tag.in(objArray), whereConditi2).build().forCurrentThread().unique();
             if (uoa3 == null || uoa2.c() - uoa3.c() > 0) {
                uArrayList1.add(uoa2);
             }
          }
          b.c(uoc.d("update conversation tag size: "+uArrayList1.size()));
          if (!b.c(uArrayList1)) {
             try{
                x2 ox21 = 2;
                if (i != ox21) {
                   try{
                      ox21 = ox2.b;
                      Objects.requireNonNull(ox21);
                      uoc1 = new c("KwaiIMConversationTagBiz#updateConversationTags");
                      if (!b.c(uArrayList1)) {
                         ox21.a().insertOrReplaceInTx(uArrayList1);
                      }
                   }catch(java.lang.Exception e0){
                      b.c(uoc1.e(e0));
                   }
                }else {
                   x2 b1 = ox2.b;
                   Objects.requireNonNull(b1);
                   uoc2 = new c("KwaiIMConversationTagBiz#deleteConversationTags");
                   if (!b.c(uArrayList1)) {
                      ArrayList uArrayList2 = new ArrayList();
                      Iterator iterator1 = uArrayList1.iterator();
                      while (iterator1.hasNext()) {
                         uoa = iterator1.next();
                         if (uoa != null) {
                            Object[] objArray1 = new Object[6];
                            objArray1[i2] = KwaiIMConversationTagDao$Properties.Tag.columnName;
                            objArray1[i5] = Integer.valueOf(uoa.d());
                            objArray1[ox21] = KwaiIMConversationTagDao$Properties.TargetId.columnName;
                            objArray1[3] = uoa.e();
                            objArray1[4] = KwaiIMConversationTagDao$Properties.TargetType.columnName;
                            objArray1[5] = Integer.valueOf(uoa.f());
                            uArrayList2.add(String.format(Locale.US, "\(%s=\'%d\' AND %s=\'%s\' AND %s=%d\)", objArray1));
                            Object[] objArray2 = 2;
                         }
                      }
                      String str = j.c(uArrayList2.toArray(), " OR ");
                      b.a(uoc2.d("delete sql: "+str));
                      WhereCondition$StringCondition stringCondit = new WhereCondition$StringCondition(str);
                      WhereCondition[] whereConditi3 = new WhereCondition[i2];
                      d.a(b1.a).g().queryBuilder().where(stringCondit, whereConditi3).buildDelete().executeDeleteWithoutDetachingEntities();
                   }
                }
                i2 = 1;
             }catch(java.lang.Exception e0){
                b.c(uoc2.e(e0));
             }
          }
       }
    label_0223 :
       return;
    }
    public t e(){
       EmptyResponse uEmptyRespon;
       x2 ta = this.a;
       c a = c.c().a;
       boolean b = false;
       if (a != null) {
          p l = a.L;
          if (l != null && l.contains(ta)) {
             uEmptyRespon = 1;
          label_0018 :
             if (!uEmptyRespon) {
                return t.just(new EmptyResponse());
             }else {
                AtomicBoolean uAtomicBoole = new AtomicBoolean(b);
                AtomicBoolean uAtomicBoole1 = new AtomicBoolean(b);
                AtomicLong uAtomicLong = new AtomicLong(a.b());
                a = new c("KwaiIMConversationTagManager#syncTags");
                b.a(a.c());
                Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   c uoc = iterator.next();
                   if (uoc != null) {
                      uoc.a();
                   }
                }
                x2 tc = this.c;
                Objects.requireNonNull(tc);
                u2 ou2 = new u2(this, a, uAtomicBoole1, uAtomicBoole, uAtomicLong);
                return t.create(new q2(this, uAtomicLong, uAtomicBoole)).repeat().flatMap(new t2(tc)).takeUntil(tc.b).map(v8).doOnError(super(this, a));
             }
          }
       }
       uEmptyRespon = null;
       goto label_0018 ;
    }
}
