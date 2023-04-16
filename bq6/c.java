package bq6.c;
import io.reactivex.g;
import bq6.l;
import java.util.concurrent.atomic.AtomicLong;
import com.kwai.imsdk.d;
import java.util.concurrent.atomic.AtomicBoolean;
import l85.c;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import pq6.a;
import java.lang.String;
import bq6.y2;
import java.lang.Integer;
import op6.a;
import cp6.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.kwailink.client.c0;
import uo6.b;
import ih0.a$a;
import rp6.k0;
import to6.a;
import brd.t;
import to6.p;
import to6.q;
import erd.o;
import to6.o;
import bq6.f;
import erd.g;
import com.kwai.imsdk.callback.KwaiIMException;
import java.lang.Throwable;
import xp6.m;
import brd.z;
import bq6.h;
import bq6.d;
import crd.b;
import java.util.Iterator;
import java.util.Set;
import aq6.d;
import brd.g;

public final class c implements g	// class@000578
{
    public final l b;
    public final AtomicLong c;
    public final d d;
    public final AtomicBoolean e;
    public final c f;

    public void c(l p0,AtomicLong p1,d p2,AtomicBoolean p3,c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       long l;
       b a;
       a$a c;
       a$a uoa1;
       t ot;
       c uoc = this;
       c b = uoc.b;
       c d = uoc.d;
       c e = uoc.e;
       c f = uoc.f;
       Objects.requireNonNull(b);
       uoc.c.set(a.b());
       Object[] objArray = new Object[]{b.a,y2.a(),Integer.valueOf(d.getTargetType()),d.getTarget()};
       int i = 0;
       a uoa = h.c(3004, String.format("%s_key_attachment_sync_offset_%s_%s_%s", objArray));
       String str = (uoa != null)? uoa.d(): "";
       if (TextUtils.isEmpty(str)) {
          e.set(1);
       }else {
          e.set(i);
       }
       String str1 = null;
       try{
          l = Long.parseLong(str);
       }catch(java.lang.Exception e0){
          l = str1;
       }
       long l1 = f.e().g().j() - l;
       a = b.f(b.a).a;
       if (a != null) {
          c = a.C;
          if (c - str1 > 0) {
          label_0082 :
             if (l1 - (c * 1000) > 0) {
                i = 1;
             }
             if (i) {
                long l2 = k0.a(b.a).b(d.getTarget(), d.getTargetType());
                a = b.f(b.a).a;
                if (a != null) {
                   c = a.D;
                   if (c > null) {
                      uoa1 = c;
                   label_00b3 :
                      c uoc1 = new c("KwaiIMAttachmentManager#fetchAttachmentsBetweenMessagesFromServer");
                      if (l2 - str1 > 0) {
                         l c1 = b.c;
                         Objects.requireNonNull(c1);
                         a uoa2 = new a(d, 0, l2, uoa1);
                         ot = t.create(v15).flatMap(new p(c1, d)).map(new o(d, new c("KwaiIMAttachmentClient#fetchAttachmentsBetweenMessagesFromServer"))).doOnError(new f(uoc1));
                      }else {
                         ot = t.error(new KwaiIMException(1009, "maxSeq must > minSeq"));
                      }
                      ot.subscribeOn(m.e).subscribe(new h(b, f, d), new d(f));
                   }
                }
                uoa1 = 50;
                goto label_00b3 ;
             }
             Iterator iterator = b.d.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if (uod != null) {
                   uod.a(d);
                }
             }
             p0.onNext(str);
             p0.onComplete();
             return;
          }
       }
       c = 0x2a300;
       goto label_0082 ;
    }
}
