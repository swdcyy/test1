package bq6.j;
import erd.o;
import bq6.l;
import l85.c;
import com.kwai.imsdk.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import rh0.c$x;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import l85.b;
import op6.a;
import bq6.y2;
import java.lang.Integer;
import cp6.h;
import com.kwai.imsdk.internal.util.b;
import java.util.ArrayList;
import qo6.b;
import rh0.c$r;
import dq6.a;
import vo6.a;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.imsdk.model.attachment.KwaiIMAttachmentDao;
import cp6.p;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.model.attachment.KwaiIMAttachmentDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Long;
import org.greenrobot.greendao.query.Query;
import java.lang.Iterable;
import java.lang.Throwable;
import java.util.List;
import nq6.s;
import java.util.Set;
import aq6.d;
import com.kwai.middleware.azeroth.network.EmptyResponse;

public final class j implements o	// class@000594
{
    public final l b;
    public final c c;
    public final d d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicLong g;

    public void j(l p0,c p1,d p2,AtomicBoolean p3,AtomicBoolean p4,AtomicLong p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object apply(Object p0){
       Iterator iterator;
       j oj = this;
       j b = oj.b;
       j c = oj.c;
       j d = oj.d;
       j e = oj.e;
       j f = oj.f;
       j g = oj.g;
       c$x ox = p0;
       Objects.requireNonNull(b);
       b.a(c.d("sync attachment result: "+ox.b+", "+ox.c));
       Object[] objArray = new Object[]{b.a,y2.a(),Integer.valueOf(d.getTargetType()),d.getTarget()};
       int i = 0;
       h.d(new a(String.format("%s_key_attachment_sync_offset_%s_%s_%s", objArray), ox.c, 3004));
       if (!b.e(ox.a)) {
          b.a(c.d("sync attachment result.data: "+ox.a.length));
          ArrayList uArrayList = new ArrayList(ox.a.length);
          c$x a = ox.a;
          int len = a.length;
          int i1 = 0;
          while (i1 < len) {
             a uoa = a.a(d, a[i1]);
             if (uoa != null) {
                uArrayList.add(uoa);
             }
             i1 = i1 + 1;
          }
          b.a(c.d("updateAttachmentAndNotifyChange: "+d));
          if (!b.c(uArrayList)) {
             c uoc = new c("KwaiIMAttachmentManager#updateAttachmentAndNotifyChange");
             b.a(uoc.c());
             ArrayList uArrayList1 = new ArrayList();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                a uoa1 = iterator.next();
                Iterator iterator1 = iterator;
                i = 0;
                WhereCondition[] whereConditi = new WhereCondition[i];
                WhereCondition[] whereConditi1 = new WhereCondition[i];
                whereConditi1 = new WhereCondition[i];
                whereConditi1 = new WhereCondition[i];
                a uoa2 = b.b.a().queryBuilder().where(KwaiIMAttachmentDao$Properties.TargetType.eq(Integer.valueOf(uoa1.f())), whereConditi).where(KwaiIMAttachmentDao$Properties.Target.eq(uoa1.e()), whereConditi1).where(KwaiIMAttachmentDao$Properties.MessageId.eq(Long.valueOf(uoa1.d())), whereConditi1).where(KwaiIMAttachmentDao$Properties.Type.eq(Integer.valueOf(uoa1.g())), whereConditi1).build().forCurrentThread().unique();
                if (uoa2 == null || uoa1.c() - uoa2.c() > 0) {
                   uArrayList1.add(uoa1);
                }
                iterator = iterator1;
                String str = 1;
             }
             l b1 = b.b;
             Objects.requireNonNull(b1);
             c uoc1 = new c("KwaiIMAttachmentBiz#updateMessageAttachments");
             if (!b.c(uArrayList1)) {
                try{
                   b1.a().insertOrReplaceInTx(uArrayList1);
                   i = true;
                }catch(java.lang.Exception e0){
                   b.c(uoc1.e(e0));
                }
             }
          }
          s.t(b.a).m0(e.get(), f.get(), uArrayList.size(), g.get());
       }else {
          s.t(b.a).m0(e.get(), f.get(), 0, g.get());
       }
       e.set(true);
       if (ox.b == null) {
          iterator = b.d.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (uod != null) {
                uod.b(d);
             }
          }
       }
       return new EmptyResponse();
    }
}
