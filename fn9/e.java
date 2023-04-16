package fn9.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import fn9.c;
import erd.g;
import crd.b;
import eda.n;
import fn9.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import jb5.d;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import cda.i;
import ln5.e;

public class e extends PresenterV2	// class@00233e
{
    public d p;
    public a q;
    public RecyclerFragment r;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       u1.a(this);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(l.class, mAIN).subscribe(new c(this)));
       this.X7(f.g(n.class, mAIN).subscribe(new d(this)));
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, e.class, "2");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, e.class, "10");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Iterator iterator = this.p.getItems().iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (p0.equals(qPhoto.getPhotoId())) {
             this.p.remove(qPhoto);
             break ;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_LIST");
       this.q = this.r8("HOME_REFRESH_CONTROLLER");
       this.r = this.r8("FRAGMENT");
       return;
    }
    public void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       if (p0.e != null && p0.g == null) {
          this.P8(p0.a);
       }
       return;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       this.P8(p0.a);
       return;
    }
}
