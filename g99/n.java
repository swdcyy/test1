package g99.n;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xk9.g;
import uw9.b;
import java.util.Set;
import com.yxcorp.gifshow.entity.QPhoto;
import g99.w;
import g99.n$a;
import im8.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m99.f;

public class n extends e	// class@00244b
{
    public f A;
    public b B;
    public Set C;
    public n$a D;
    public f z;
    public static final int E;

    static {
       n.E = a1.d(0x7f070fdf);
    }
    public void n(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       super.J8();
       n tD = this.D;
       if (tD != null) {
          this.B.f(tD);
          this.C.remove(this.D);
       }
       return;
    }
    public boolean P8(QPhoto p0){
       return true;
    }
    public void R8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       if (this.D == null) {
          this.w.u0(0);
          n$a uoa = new n$a(this);
          this.D = uoa;
          this.B.a(uoa);
          this.C.add(this.D);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       super.j8();
       this.z = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.A = this.q8(f.class);
       this.B = this.q8(b.class);
       this.C = this.r8("DETAIL_SCROLL_LISTENERS");
       return;
    }
}
