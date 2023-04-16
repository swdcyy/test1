package b8a.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.nasa.NasaRefreshView;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.a1;
import tkd.b;
import tkd.d;
import ida.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ekd.m1;

public class b0 extends PresenterV2	// class@000391
{
    public NasaRefreshView p;
    public ViewStub q;
    public BaseFragment r;

    public void b0(){
       super();
    }
    public void E8(){
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob0, "4")) {
          if (this.p == null) {
             uob0 = this.q;
             if (uob0 != null) {
                this.p = uob0.inflate();
             }
          }
          if (this.p != null) {
             this.p.getLayoutParams().topMargin = (i.c())? n.A(this.getContext()): 0;
             this.p.setRefreshInitialOffset(0);
             this.p.setRefreshTargetOffset((float)(a1.d(R.dimen.arg_RES_7f070fb5) - 1));
             d.a(-859095268).n00(this.r, this.p);
          }
       }
    label_0073 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3537);
       this.q = m1.f(p0, 0x7f0a353d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       return;
    }
}
