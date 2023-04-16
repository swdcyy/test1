package bdc.f;
import erd.g;
import bdc.h;
import qvb.i;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import bdc.b;
import bdc.c;
import kp.r1;
import bdc.e;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;

public final class f implements g	// class@000456
{
    public final h b;
    public final i c;

    public void f(h p0,i p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          List items = this.c.getItems();
          a.o(items, "pageList.items");
          RealAction mFeed = p0.mFeed;
          a.o(mFeed, "action.mFeed");
          boolean b = this.b.j(mFeed);
          int i = 0;
          if (b) {
             objArray = new Object[i];
             this.b.h().j("Shown photo has read, try find fist cacheable photo", objArray);
             if (this.b.k(items)) {
                objArray1 = new Object[i];
                this.b.h().j("Cacheable photo found, do not need observe until next refresh", objArray1);
                p0.j = i;
             }
          }else {
             int i1 = y.o(items, new e(r1.t1(p0.mFeed)));
             Object[] objArray2 = new Object[i];
             this.b.h().j("Shown photo is unread, try find next unread cacheable photo", objArray2);
             f tb = this.b;
             Objects.requireNonNull(tb);
             h oh = h.class;
             boolean b1 = true;
             if (PatchProxy.isSupport(oh)) {
                QPhoto obj = PatchProxy.applyTwoRefs(items, Integer.valueOf(i1), tb, oh, "5");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(i1 >= 0){
                   i1 = i1 + b1;
                   if (i1 < items.size()) {
                      obj = null;
                      i1 = items.subList(i1, items.size()).iterator();
                      while (i1.hasNext()) {
                         QPhoto qPhoto = i1.next();
                         QPhoto mEntity = qPhoto.mEntity;
                         a.o(mEntity, "nextPhoto.mEntity");
                         if (tb.j(mEntity)) {
                            break ;
                         }
                      }
                      if (obj != null) {
                         tb.l(obj);
                      }
                   }
                }
                b1 = false;
             }else {
                goto label_0090 ;
             }
             if (b1) {
                objArray1 = new Object[i];
                this.b.h().j("Cacheable unread photo found, continue monitor unread consumed.", objArray1);
             }else {
                objArray = new Object[i];
                this.b.h().j("No next unread cacheable photo, use first unread instead temp.", objArray);
                this.b.k(items);
             }
          }
       }
       return;
    }
}
