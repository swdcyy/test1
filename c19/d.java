package c19.d;
import c19.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import qvb.q;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d extends a	// class@0004c4
{
    public BaseFragment r;
    public SlidePlayViewModel s;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.s = SlidePlayViewModel.B0(this.r);
       super.E8();
       return;
    }
    public Object P8(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj != null) {
          objArray = obj.X0();
       }
       return objArray;
    }
    public void R8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "pageListObserver");
       d ts = this.s;
       if (ts != null) {
          ts.e(p0);
       }
       return;
    }
    public void S8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "pageListObserver");
       d ts = this.s;
       if (ts != null) {
          ts.b(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.t8("FRAGMENT");
       return;
    }
}
