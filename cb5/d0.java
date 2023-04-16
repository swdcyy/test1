package cb5.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.View;
import ekd.m1;
import java.lang.Integer;

public class d0 extends PresenterV2	// class@000446
{
    public RecyclerFragment p;
    public int q;
    public View r;

    public void d0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       int i = 0;
       this.p.h0().setScrollBarStyle(i);
       ViewGroup$MarginLayoutParams layoutParams = this.p.Ac().getLayoutParams();
       layoutParams.topMargin = this.q;
       this.p.Ac().setLayoutParams(layoutParams);
       this.p.Ac().setRefreshTargetOffset((float)a1.d(R.dimen.arg_RES_7f070fb3));
       d0 tr = this.r;
       if (tr != null) {
          tr.setVisibility(i);
          layoutParams = this.r.getLayoutParams();
          layoutParams.topMargin = this.q - a1.e(0x3f000000);
          this.r.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3c84);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("HOME_LOAD_SCAN_PADDING").intValue();
       return;
    }
}
