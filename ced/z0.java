package ced.z0;
import erd.r;
import com.yxcorp.plugin.search.result.hashtag.presenters.v;
import java.lang.Object;
import xdd.d;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;

public final class z0 implements r	// class@000593
{
    public final v b;

    public void z0(v p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       int i;
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a;
       a obj = PatchProxy.apply(null, tb, v.class, "6");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = tb.t.getAdapter();
          if (obj instanceof a) {
             Fragment uFragment = obj.a(tb.t.getCurrentItem());
             if (uFragment != null) {
                i = uFragment.hashCode();
             }
          }
          i = 0;
       }
       if (p0 == i) {
          b = true;
       }
       return b;
    }
}
