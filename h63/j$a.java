package h63.j$a;
import c77.q;
import h63.j;
import java.lang.Object;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab$TabType;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.Objects;
import v53.f;
import c77.l;
import java.util.ArrayList;
import ekd.q;
import java.util.List;
import i63.b;
import java.lang.Boolean;
import v53.a;
import h63.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import java.lang.Number;

public class j$a implements q	// class@002c82
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public LiveGzoneTab a(LiveGzoneTab$TabType p0){
       LiveGzoneTab liveGzoneTab;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.w.values().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          liveGzoneTab = obj.next();
          if (liveGzoneTab.f() == p0) {
             break ;
          }
       }
       return liveGzoneTab;
    }
    public LiveGzoneTab b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.w.get(p0);
    }
    public void c(){
       LiveGzoneTab liveGzoneTab;
       b uob;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$a.class, "1")) {
          return;
       }
       j q = this.a.q;
       Objects.requireNonNull(q);
       f uof = f.class;
       if (!PatchProxy.applyVoid(objArray, q, uof, "20")) {
          q.w = q.n.c.a(LiveGzoneTab$TabType.CHAT);
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = q.n.c.e().iterator();
          while (iterator.hasNext()) {
             liveGzoneTab = iterator.next();
             if (liveGzoneTab.f != null) {
                uArrayList.add(liveGzoneTab);
             }
          }
          if (q.f(uArrayList)) {
             uArrayList = new ArrayList();
             LiveGzoneTab liveGzoneTab1 = LiveGzoneTab.a();
             q.w = liveGzoneTab1;
             uArrayList.add(liveGzoneTab1);
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             liveGzoneTab = iterator1.next();
             Iterator iterator2 = q.r.iterator();
             while (true) {
                if (iterator2.hasNext()) {
                   uob = iterator2.next();
                   if (uob.t().equals(liveGzoneTab)) {
                      iterator2.remove();
                   }
                }else {
                   uob = objArray;
                }
                if (uob != null) {
                   uArrayList1.add(uob);
                }else {
                   b uob1 = q.t(liveGzoneTab);
                   if (uob1 != null) {
                      uArrayList1.add(uob1);
                      continue ;
                   }else {
                      continue ;
                   }
                }
             }
          }
          b obj = PatchProxy.applyOneRefs(uArrayList1, q, uof, "21");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = q.d.z();
             if (obj != null) {
                String str = obj.t().e();
                iterator1 = uArrayList1.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (!TextUtils.n(str, iterator1.next().u().c())) {
                         continue ;
                      }
                   }else {
                      objArray = str;
                   }
                   if (objArray == null) {
                      b = true;
                   }
                }
             }
             b = false;
          }
          q.r.clear();
          q.r.addAll(uArrayList1);
          q.r(Math.max(1, (q.r.size() - 1)));
          uof = q.r;
          if (!PatchProxy.applyVoidOneRefs(uof, q, a.class, "4")) {
             q.d.B(uof);
             q.b.q();
          }
          if (b) {
             q.c.setCurrentItem(0);
          }
       }
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.w.size();
    }
    public Collection e(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.w.values();
    }
    public void f(LiveGzoneTab p0){
    }
}
