package m02.l0;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import vy6.a;
import lnc.c1;
import android.os.SystemClock;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import rh5.a;
import rh5.b;
import qrd.l1;

public final class l0 implements a	// class@0030c9
{
    public final LivePlayFragment b;

    public void l0(LivePlayFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, DetailSlidePlayFragment.class, "9")) {
       }else {
          Iterator iterator = tb.u.iterator();
          String str = "DetailSlidePlayFragment.AttachListenersTag";
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             uoa.i2();
             new c1(str, false).c(uoa.getClass().getName());
          }
          if (tb.v != null) {
             tb.v.t1().o(tb, str);
             a uoa1 = new a();
             uoa1.mFunctionName = "DetailSlidePlayFragment - callBecomesAttachedOnPageSelectedListener";
             uoa1.mContainer = "DetailSlidePlayFragment";
             uoa1.mStartTime = SystemClock.currentThreadTimeMillis();
             uoa1.mEndTime = SystemClock.currentThreadTimeMillis();
             b.b("FEATURED_PAGE").a(uoa1);
          }
       }
       return l1.a;
    }
}
