package c59.f;
import lnc.g2$a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import d59.r;
import d59.y;
import d59.t;
import d59.u;
import d59.v;

public final class f implements g2$a	// class@0004e6
{
    public final AdtkFragment b;

    public void f(AdtkFragment p0){
       this.b = p0;
       super();
    }
    public final PresenterV2 B2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.applyWithListener(objArray, this, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, obj, AdtkFragment.class, "4");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new r());
          presenterV2.U7(new y());
          presenterV2.U7(new t());
          presenterV2.U7(new u());
          presenterV2.U7(new v());
          PatchProxy.onMethodExit(AdtkFragment.class, "4");
       }
       PatchProxy.onMethodExit(f.class, "1");
       return presenterV2;
    }
}
