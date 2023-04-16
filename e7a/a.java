package e7a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.a$a;
import nsd.u;
import crd.a;
import e7a.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;

public abstract class a extends PresenterV2	// class@00207a
{
    public BaseFragment p;
    public QPhoto q;
    public SlidePlayViewModel r;
    public a s;
    public final a t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(){
       super();
       this.s = new a();
       this.t = new a$b(this);
    }
    public void E8(){
       a tp;
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       StringBuilder str = "onBind: "+this;
       String str1 = "currentPhotoFragment";
       if (this.r == null) {
          tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
          a.o(slidePlayVie, "SlidePlayViewModel.get\(c¡­oFragment.parentFragment\)");
          this.r = slidePlayVie;
       }
       tp = this.r;
       if (tp == null) {
          a.S("slidePlayViewModel");
       }
       a tp1 = this.p;
       if (tp1 == null) {
          a.S(str1);
       }
       tp.P(tp1, this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       "onCreate: "+this;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       "onDestroy: "+this;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       StringBuilder str = "onUnbind: "+this;
       a tr = this.r;
       if (tr == null) {
          a.S("slidePlayViewModel");
       }
       a tp = this.p;
       if (tp == null) {
          a.S("currentPhotoFragment");
       }
       tr.D(tp, this.t);
       return;
    }
    public final void P8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       a.p(p0, "disposable");
       this.s.c(p0);
       return;
    }
    public final QPhoto R8(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("currentPhoto");
       }
       return obj;
    }
    public final BaseFragment S8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("currentPhotoFragment");
       }
       return obj;
    }
    public abstract void V8();
    public abstract void W8();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "rootView");
       "doBindView: "+this;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       "doInject: "+this;
       return;
    }
    public final SlidePlayViewModel p0(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("slidePlayViewModel");
       }
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.hashCode());
    }
}
