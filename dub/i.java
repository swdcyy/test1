package dub.i;
import java.lang.Runnable;
import dub.k;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collections;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Iterator;
import xr4.a$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Long;
import k2b.f2;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;
import java.util.Map;
import dub.d;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import io.reactivex.subjects.PublishSubject;
import crd.b;
import lnc.b9;

public final class i implements Runnable	// class@002573
{
    public final k b;
    public final String c;
    public final List d;

    public void i(k p0,String p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       i oi = this;
       i b = oi.b;
       i c = oi.c;
       i d = oi.d;
       Objects.requireNonNull(b);
       k ok = k.class;
       List list = PatchProxy.applyOneRefs(d, b, ok, "8");
       int i = 2;
       int i1 = 0;
       if (list != PatchProxyResult.class) {
       }else {
          list = Collections.emptyList();
          if (b.d == null) {
             b.d = QCurrentUser.me().getId();
          }
          Iterator iterator = d.iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             if (uoa != null && TextUtils.n(b.d, String.valueOf(uoa.a))) {
                Object[] objArray3 = new Object[4];
                objArray3[i1] = Integer.valueOf(uoa.g);
                objArray3[1] = Long.valueOf(uoa.c);
                objArray3[i] = Long.valueOf(uoa.d);
                long l = uoa.c - uoa.d;
                objArray3[3] = Long.valueOf(l);
                f2.b("LocalNotifyDispatcher", "cacheRedDot: cache redDots, type :=%1$s, total := %2$s, waterline := %3$s, delta := %4$s", objArray3);
                if (b.b == null) {
                   b.b = Maps.q();
                }
                a$a uoa1 = b.b.get(Integer.valueOf(uoa.g));
                if (uoa1 == null || uoa.h - uoa1.h > 0) {
                   Object[] objArray4 = new Object[]{Integer.valueOf(uoa.g)};
                   f2.b("LocalNotifyDispatcher", "cacheRedDot: cache redDots, type :=%1$s", objArray4);
                   b.b.put(Integer.valueOf(uoa.g), uoa);
                   if (list.isEmpty()) {
                      if (d.size() == 1) {
                         list = q.g(d, d.a);
                      }else {
                         Integer[] integerArray = new Integer[]{Integer.valueOf(uoa.g)};
                         list = Lists.e(integerArray);
                      }
                   }else {
                      list.add(Integer.valueOf(uoa.g));
                   }
                }
             }
          label_00e9 :
             i = 2;
             i1 = 0;
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(c, list, b, ok, "9")) {
          k e = b.e;
          if (e != null) {
             if (!e.d()) {
                Object[] objArray = new Object[0];
                f2.b("LocalNotifyDispatcher", "notifyRedDot: no observers, destroy notify dispatcher", objArray);
                if (!PatchProxy.applyVoid(null, b, ok, "12")) {
                   b.e = null;
                   e = b.b;
                   if (e != null) {
                      e.clear();
                      b.b = null;
                   }
                   b.d = null;
                   b9.a(b.a);
                }
             }else if(q.f(list)){
                Object[] objArray1 = new Object[0];
                f2.b("LocalNotifyDispatcher", "notifyRedDot: redDotTypes is empty, does not need update", objArray1);
             }else {
                Object[] objArray2 = new Object[]{c,list};
                f2.b("LocalNotifyDispatcher", "notifyRedDot: from [%1$s], Dot[%2$s] is try to update", objArray2);
                b.e.onNext(list);
             }
          }
       }
       return;
    }
}
