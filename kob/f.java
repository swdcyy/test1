package kob.f;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.refresh.RefreshLayout;
import mkc.b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.CharSequence;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class f extends f	// class@00336b
{

    public void f(RecyclerFragment p0){
       super(p0);
    }
    public void d(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       this.a.s();
       if (p0) {
          if (this.s()) {
             f ta = this.a;
             ta.K(a.i(ta, b.d.a));
          }
          return;
       }else {
          this.f.g(true, null);
          return;
       }
    }
}
