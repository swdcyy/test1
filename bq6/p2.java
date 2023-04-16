package bq6.p2;
import bq6.p2$a;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import cp6.u;
import com.kwai.chat.sdk.signal.BizDispatcher;
import cp6.w;
import to6.r;
import eq6.a;
import brd.t;
import java.util.Objects;
import cp6.v;
import io.reactivex.g;
import cp6.q;
import bq6.p1;
import brd.w;
import erd.c;
import com.kwai.imsdk.d;
import eq6.b;
import oh0.a$e;
import oh0.a$d;
import rh0.c$d;
import l85.c;
import l85.b;
import java.lang.StringBuilder;
import bq6.q0;
import erd.o;
import brd.a0;
import bq6.c1;
import bq6.s0;
import bq6.b0;
import oh0.a$a;
import bq6.k2;
import bq6.y0;
import com.kuaishou.gifshow.kuaishan.logic.s0;
import bq6.i1;
import bq6.l0;
import bq6.h1;
import bq6.a0;
import bq6.r0;
import bq6.d1;
import bq6.u0;
import bq6.c0;
import java.util.Set;
import bq6.m;
import bq6.p0;
import bq6.i2;
import bq6.i0;
import erd.a;
import bq6.q;
import erd.g;
import bq6.t0;
import bq6.r;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.query.QueryBuilder;
import com.kwai.imsdk.model.conversationfolder.KwaiConversationFolderDao$Properties;
import java.util.Collection;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.Query;
import cp6.e;
import bq6.f1;
import java.util.List;
import cp6.n;
import bq6.p;
import bq6.w1;
import bq6.x;
import bq6.a1;
import bq6.g1;
import bq6.b1;
import xp6.m;
import brd.z;
import bq6.a2;
import bq6.s;
import crd.b;
import com.kwai.imsdk.internal.util.b;
import java.util.Iterator;
import aq6.a;
import aq6.e;
import java.lang.Exception;
import java.lang.Iterable;
import bq6.g2;
import bq6.o0;

public class p2	// class@0005ad
{
    public final String a;
    public final u b;
    public final w c;
    public final r d;
    public boolean e;
    public final Set f;
    public final Set g;
    public static final BizDispatcher h;

    static {
       p2.h = new p2$a();
    }
    public void p2(String p0){
       super();
       this.e = false;
       this.f = new CopyOnWriteArraySet();
       this.g = new CopyOnWriteArraySet();
       this.a = p0;
       this.b = u.b.get(p0);
       this.c = w.b.get(p0);
       this.d = r.b.get(p0);
    }
    public static t a(p2 p0,a p1){
       p2 c = p0.c;
       Objects.requireNonNull(c);
       p0 = p0.b;
       Objects.requireNonNull(p0);
       return t.zip(t.create(new v(c, p1.c())), t.create(new q(p0, p1.c())), new p1(p1));
    }
    public static p2 d(String p0){
       return p2.h.get(p0);
    }
    public final void b(d p0,b p1){
       if ((p1.a()).equals(p0.getTarget()) && p1.b() == p0.getTargetType()) {
          p1.f(p0);
       }
       return;
    }
    public final b c(a$e p0,boolean p1){
       a$e a = p0.a;
       b uob = new b();
       uob.g(a.a.a);
       uob.h(a.a.b);
       uob.k(a.b);
       uob.j(p0.b);
       uob.i(p1);
       return uob;
    }
    public final t e(a$e[] p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderAddedList");
       b.a(uoc.c());
       b.a(uoc.d("sessionReferenceUpdateItems: "+p0.length));
       return t.fromArray(p0).map(new q0(this)).toList().w(new c1(this, uoc)).flatMap(new s0(this)).onErrorReturn(new b0(uoc));
    }
    public final t f(a$a[] p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderBasic");
       b.a(uoc.c());
       return t.fromArray(p0).map(k2.b).toList().w(new y0(this, uoc)).flatMap(s0.b).flatMap(new i1(this, uoc)).flatMap(new l0(this)).toList().w(new h1(this, uoc)).onErrorReturn(new a0(uoc));
    }
    public final t g(a$e[] p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderDeletedList");
       b.a(uoc.c());
       b.a(uoc.d("sessionReferenceUpdateItems: "+p0.length));
       return t.fromArray(p0).map(new r0(this)).toList().w(new d1(this, uoc)).flatMap(new u0(this)).onErrorReturn(new c0(uoc));
    }
    public final t h(Set p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderIDSet");
       b.a(uoc.c());
       if (p0.size() > 999) {
          return t.create(new m(p0)).flatMap(new p0(this)).toList().w(i2.b).doOnComplete(new i0(uoc)).doOnError(new q(uoc));
       }
       return this.i(p0).doOnComplete(new t0(uoc)).doOnError(new r(uoc));
    }
    public final t i(Set p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderIDSetUnit");
       b.a(uoc.c());
       p2 tb = this.b;
       Property folderId = KwaiConversationFolderDao$Properties.FolderId;
       WhereCondition[] whereConditi = new WhereCondition[0];
       Property[] propertyArra = new Property[]{folderId};
       t ot = tb.e(tb.b().queryBuilder().where(folderId.in(p0), whereConditi).orderAsc(propertyArra).build());
       return ot.flatMap(s0.b).flatMap(new l0(this)).toList().w(new f1(this, uoc));
    }
    public final t j(int p0,List p1){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderReferenceList");
       b.a(uoc.c());
       return n.i(this.a).w(p1).doOnError(new p(uoc)).flatMap(new w1(this, p1, uoc, p0));
    }
    public void k(byte[] p0){
       c uoc = new c("KwaiIMConversationFolderManager#handleConversationFolderUpdatePush");
       b.a(uoc.c());
       t.create(new x(p0)).flatMap(new a1(this, uoc)).flatMap(new g1(this, uoc)).flatMap(new b1(this, uoc)).subscribeOn(m.g).subscribe(new a2(uoc), new s(uoc));
    }
    public final void l(int p0,List p1){
       c uoc = new c("KwaiIMConversationFolderManager#notifyConversationFolderChange");
       b.a(uoc.d("changeType: "+p0+", folders: "+p1));
       if (!b.c(p1)) {
          b.a(uoc.d(p1.toString()));
          b.a(uoc.d("listeners.size: "+this.f.size()));
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             b.a(uoc.d("listener: "+uoa));
             if (uoa != null) {
                uoa.a(p0, p1);
             }
          }
       }
       return;
    }
    public final void m(int p0,List p1){
       c uoc = new c("KwaiIMConversationFolderManager#notifyConversationFolderReferenceChange");
       b.a(uoc.c());
       b.a(uoc.d("changeType: "+p0));
       if (!b.c(p1)) {
          b.a(uoc.d(p1.toString()));
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                uoa.b(p0, p1);
             }
          }
       }
       return;
    }
    public final void n(int p0,String p1){
       if (!b.c(this.g)) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (uoe != null) {
                try{
                   uoe.a(p0, p1);
                }catch(java.lang.Exception e1){
                   b.c(e1.getMessage());
                   goto label_000e ;
                }
             }
          }
       }
       return;
    }
    public final t o(List p0){
       return t.fromIterable(p0).map(g2.b).toList().w(new o0(this));
    }
}
