package f2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.HomeEnterCoordinatorLayout;
import com.kwai.nearby.local.presenter.secondary.d;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout$a;
import com.yxcorp.gifshow.widget.NestedCoordinatorLayout;
import com.yxcorp.gifshow.local.sub.entrance.kingkong.view.ClipLayout;

public class a extends PresenterV2	// class@00286f
{
    public HomeEnterCoordinatorLayout p;

    public void a(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       HomeEnterCoordinatorLayout homeEnterCoo = m1.f(p0, R.id.coordinator_layout_sub_entrance);
       this.p = homeEnterCoo;
       homeEnterCoo.setBubbleScrollOrderSupplier(d.a);
       this.p.setClipLayout(m1.f(p0, R.id.cliplayout));
       this.p.setRefreshLayout(m1.f(p0, R.id.refresh_layout));
       return;
    }
}
