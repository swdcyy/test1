package ked.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ked.a;
import ked.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import ked.g;
import erd.r;
import ked.e;
import erd.g;
import crd.b;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.result.skyredpocket.model.SearchSkyFallInfo;
import nfd.k1;
import android.app.Dialog;
import jed.h;
import lnc.b9;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class h extends PresenterV2	// class@001771
{
    public String p;
    public h q;
    public SearchResultExtParams r;
    public SearchResultFragment s;
    public b t;
    public String u;
    public boolean v;
    public DialogInterface$OnDismissListener w;
    public q x;

    public void h(){
       super();
       this.u = "";
       this.w = new a(this);
       this.x = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.s.q().h(this.x);
       this.X7(this.s.Vg().j().filter(g.b).subscribe(new e(this)));
       return;
    }
    public void H8(){
       h tr;
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       if (this.v != null) {
          tr = this.r;
          if (tr != null) {
             SearchResultExtParams mReceiveSkyF = tr.mReceiveSkyFallInfo;
             if (mReceiveSkyF != null) {
                k1.a(mReceiveSkyF.mCouponId, "search_sky_fall_leave_after_receive", true);
             }
          }
       }
       tr = this.q;
       if (tr != null && tr.isShowing()) {
          this.q.dismiss();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.s.q().f(this.x);
       b9.a(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       return;
    }
}
