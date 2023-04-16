package d5c.n0;
import erd.g;
import d5c.t0;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.String;
import a3c.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import x5c.b;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.tab.DynamicScrollViewPager;
import android.view.View;
import d5c.j0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$e;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;

public final class n0 implements g	// class@002103
{
    public final t0 b;

    public void n0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       List list = a.c(p0, "TAB_IDS");
       boolean i = a.b(p0, "LOCATE_TAB_ID");
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidTwoRefs(list, Integer.valueOf(i), tb, ot0, "6")) {
          b adapter = tb.u.getAdapter();
          if (adapter != null && !q.f(list)) {
             int i1 = tb.s.mh();
             String str = null;
             if (adapter.b(i1) != null) {
                str = adapter.b(i1).c();
             }
             boolean b = true;
             if (adapter.j()) {
                if (adapter.j() == list.size()) {
                   i = PatchProxy.applyTwoRefs(adapter, list, tb, ot0, "8");
                   if (i != PatchProxyResult.class) {
                      i = i.booleanValue();
                   }else if(adapter.j() != list.size()){
                      i = 0;
                      while (true) {
                         if (i < adapter.j()) {
                            if (tb.P8(adapter.b(i).c(), list)) {
                               i++;
                            }
                         }else {
                            i = true;
                         }
                      }
                   }
                   i = false;
                   if (i) {
                   label_00d6 :
                      tb.V8();
                      if (tb.w != null) {
                         i = (list.size() > 4)? 1: null;
                         ot0 = tb.w;
                         int i2 = (i && tb.B != null)? 0: 8;
                         ot0.setVisibility(i2);
                         if (i) {
                            j0 oj0 = new j0(tb);
                            tb.y = oj0;
                            tb.v.a(oj0);
                         }
                      }
                      i = tb.v;
                      if (tb.D == 2 && list.size() <= b) {
                         b = false;
                      }
                      i.v(b);
                   }
                }
                tb.s.vh(tb.S8(list));
                if (!tb.P8(str, list)) {
                   tb.s.uh(0);
                   goto label_00d6 ;
                }else if(!TextUtils.x(str)){
                   i = tb.s.rh(str);
                   if (i >= 0) {
                      tb.s.uh(i);
                      goto label_00d6 ;
                   }else {
                      goto label_00d6 ;
                   }
                }else {
                   goto label_00d6 ;
                }
             }else if(i > 0){
                tb.u.setInitSelectItem(i);
             }
             tb.s.vh(tb.S8(list));
             goto label_00d6 ;
          }
       }
       return;
    }
}
