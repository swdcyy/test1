package fx9.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jy5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.components.feedmodel.SummaryInfo;
import com.kuaishou.android.model.mix.w;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;

public class k extends PresenterV2	// class@002376
{
    public RecyclerFragment p;
    public QPhoto q;
    public View r;
    public boolean s;
    public final PresenterV2 t;

    public void k(boolean p0){
       super();
       this.t = new a();
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       k tq = this.q;
       if (tq != null && w.c0(tq.getEntity()) != null) {
          this.p.ia().P0(this.P8());
          Object[] objArray = new Object[]{this.q};
          this.t.i(objArray);
          this.P8().setPadding(a1.e(19.00f), a1.e(0), a1.e(19.00f), this.P8().getPaddingBottom());
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       this.t.destroy();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       if (w.e0(this.q)) {
          this.p.ia().m1(this.P8());
          this.t.unbind();
       }
       this.r = null;
       return;
    }
    public final View P8(){
       Object obj = PatchProxy.apply(null, this, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = a.a(this.getContext(), 0x7f0d01ee);
       }
       return this.r;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.t.f(this.P8());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
