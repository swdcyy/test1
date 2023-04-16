package fx9.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fx9.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.w;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;

public class l extends PresenterV2	// class@002377
{
    public RecyclerFragment p;
    public QPhoto q;
    public View r;
    public final PresenterV2 s;

    public void l(){
       super();
       this.s = new j();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       if (w.e0(this.q)) {
          this.p.ia().P0(this.P8());
          Object[] objArray = new Object[]{this.q};
          this.s.i(objArray);
          this.P8().setPadding(this.P8().getPaddingLeft(), a1.e(16.00f), this.P8().getPaddingRight(), this.P8().getPaddingBottom());
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.s.destroy();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       if (w.e0(this.q)) {
          this.p.ia().m1(this.P8());
          this.s.unbind();
       }
       this.r = null;
       return;
    }
    public final View P8(){
       Object obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = a.a(this.getContext(), 0x7f0d103d);
       }
       return this.r;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.s.f(this.P8());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
