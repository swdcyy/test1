package o61.e;
import java.lang.Runnable;
import com.kuaishou.live.bottombar.component.widget.c;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import qp.b;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import androidx.lifecycle.MutableLiveData;
import android.view.ViewGroup;
import o61.b;
import java.util.HashMap;
import z61.b;
import z61.i;
import java.util.Set;
import java.util.Map$Entry;
import a71.d;

public final class e implements Runnable	// class@003482
{
    public final c b;
    public final String c;
    public final int d;
    public final List e;
    public final List f;
    public final Map g;

    public void e(c p0,String p1,int p2,List p3,List p4,Map p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       List list1;
       Iterator iterator;
       b uob;
       Map$Entry uEntry;
       Integer key;
       HashMap hashMap;
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       e tg = this.g;
       c i = tb.i;
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{tc,i,Integer.valueOf(td),te,tf,tg};
          if (!PatchProxy.applyVoid(objArray, tb, c.class, "8")) {
          label_003b :
             if (tb.n != null) {
                b.f("LiveBaseBottomBarWidget", " innerUpdateBottomBarInfo but widget is release ", "updateLog : ", tc, "widget ", tb);
             }else {
                tb.k = td;
                ArrayList uArrayList = PatchProxy.applyTwoRefs(i, te, tb, c.class, "9");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   if (!q.f(te)) {
                      iterator = te.iterator();
                      while (iterator.hasNext()) {
                         MutableLiveData mutableLiveD = iterator.next();
                         if (mutableLiveD == null) {
                            continue ;
                         }else {
                            b uob3 = tb.D(i, mutableLiveD);
                            if (uob3 != null) {
                               uArrayList.add(uob3);
                            }
                         }
                      }
                   }
                }
                Object obj = uArrayList;
                tb.h = tb.B(obj, tf);
                List list = null;
                if (!PatchProxy.applyVoidThreeRefs(i, obj, tg, tb, c.class, "11")) {
                   list1 = PatchProxy.applyThreeRefs(i, obj, tg, tb, c.class, "13");
                   if (list1 != PatchProxyResult.class) {
                   }else if(q.f(obj) || q.h(tg)){
                      list1 = list;
                   }else {
                      list1 = list;
                      int i1 = 0;
                      while (i1 < obj.size()) {
                         uob = obj.get(i1);
                         if (uob != null) {
                            uob = tb.C(uob);
                            if (uob != null) {
                               i oi = tg.get(Integer.valueOf(uob.mFeatureId));
                               if (oi != null && oi.a() != null) {
                                  b uob1 = tb.D(i, oi.a());
                                  if (uob1 != null) {
                                     b uob2 = tb.C(uob1);
                                     if (uob2 != null) {
                                        uob2.mIsRightAlign = uob.mIsRightAlign;
                                     }
                                     obj.set(i1, uob1);
                                     if (oi.b != null) {
                                        if (list1 == null) {
                                           hashMap = new HashMap();
                                        }
                                        hashMap.put(Integer.valueOf(oi.a), oi.b);
                                     }
                                  }
                               }
                            }
                         }
                         i1 = i1 + 1;
                      }
                   }
                   if (!PatchProxy.applyVoidOneRefs(list1, tb, c.class, "12")) {
                      if (!q.h(tb.g)) {
                         iterator = tb.g.entrySet().iterator();
                         while (iterator.hasNext()) {
                            uEntry = iterator.next();
                            key = uEntry.getKey();
                            d value = uEntry.getValue();
                            if (key == null || (value != null && (list1 == null || !list1.containsKey(key)))) {
                               value.D();
                            }
                         }
                      }
                      if (q.h(list1)) {
                         tb.g = list;
                      }else {
                         c g = tb.g;
                         if (g == null) {
                            tb.g = new HashMap();
                         }else {
                            g.clear();
                         }
                         tb.g.putAll(list1);
                      }
                   }
                }
                list1 = PatchProxy.applyOneRefs(obj, tb, c.class, "10");
                if (list1 != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   iterator = obj.iterator();
                   while (iterator.hasNext()) {
                      uob = tb.C(iterator.next());
                      if (uob != null) {
                         uArrayList.add(Integer.valueOf(uob.mFeatureId));
                      }
                   }
                   iterator = tb.e.entrySet().iterator();
                   while (iterator.hasNext()) {
                      uEntry = iterator.next();
                      key = uEntry.getKey();
                      uob = uEntry.getValue();
                      if (key == null || (uob != null && !uArrayList.contains(key))) {
                         if (list == null) {
                            list = new ArrayList();
                         }
                         list.add(uob);
                         iterator.remove();
                      }
                   }
                   list1 = list;
                }
                tb.j = obj;
                tb.H(0, obj, list1);
             }
          }
       }else {
          goto label_003b ;
       }
       return;
    }
}
