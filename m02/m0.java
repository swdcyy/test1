package m02.m0;
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
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import qrd.l1;

public final class m0 implements a	// class@0030cc
{
    public final LivePlayFragment b;

    public void m0(LivePlayFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, DetailSlidePlayFragment.class, "10")) {
       }else {
          Iterator iterator = tb.u.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             uoa.F1();
             new c1("DetailSlidePlayFragment.DetachListenersTag", false).c(uoa.getClass().getName());
          }
          DetailSlidePlayFragment v = tb.v;
          if (v != null) {
             v.t1().s(tb, "DetailSlidePlayFragment.DetachListenersTag");
          }
       }
       return l1.a;
    }
}
