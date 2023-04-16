package fia.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import fv5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class m extends PresenterV2	// class@002921
{
    public w p;
    public QPhoto q;
    public final a r;

    public void m(){
       super();
       this.r = new m$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "4")) {
          return;
       }
       m tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.E(this.r);
       }
       tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          objArray = slidePlayVie.getCurrentPhoto();
       }
       this.q = objArray;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       a uoa = b.a(0x46e56f43);
       a.o(uoa, "guideProvider");
       if (!uoa.g() && this.R8(this.q)) {
          uoa.f(3);
       }
       m tp = this.p;
       if (tp == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.g0(this.r);
       }
       return;
    }
    public final w P8(){
       m obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       return obj;
    }
    public final boolean R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null && (p0.isVideoType() == b || (p0 != null && (p0.isImageType() != b && (p0 == null || p0.isKtv() != b))))) {
          b = false;
       }
    label_002e :
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       Object obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.p = obj;
       return;
    }
}
