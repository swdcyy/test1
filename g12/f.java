package g12.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g12.f$a;
import g12.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.r3;
import hka.f;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import b51.d;
import tw6.a;
import com.kuaishou.live.basic.liveslide.a;
import cw6.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.util.Objects;
import f12.d;
import f12.c;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;

public class f extends PresenterV2	// class@002a2a
{
    public LiveSlideDetailContainerFragment p;
    public d q;
    public d r;
    public boolean s;
    public final f t;
    public final a u;
    public static String sLivePresenterClassName = "LiveSlideKeyEventPresenter";

    public void f(){
       super();
       this.s = true;
       this.t = new f$a(this);
       this.u = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().R(this.t);
       }
       f tq = this.q;
       if (tq != null) {
          tq.q().j0(this.u);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().G1(this.t);
       }
       f tq = this.q;
       if (tq != null) {
          tq.q().n0(this.u);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tq = this.q;
       if (tq == null || (this.p != null && this.s != null)) {
          int i = this.q.o().l0(tq.o().a0());
          int i1 = this.q.o().k0();
          if (i >= 0) {
             if (i == (i1 - 1)) {
                i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001cd));
                return;
             }else if(this.r == null){
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity);
                this.r = c.b(activity);
             }
             tq = this.r;
             tq.I((tq.getCurrentPosition() + 1), 1);
          }else {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001cd));
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f tq = this.q;
       if (tq == null || (this.p != null && this.s != null)) {
          int i = 1;
          if (this.q.o().l0(tq.o().a0()) < i) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1001ce));
             return;
          }else if(this.r == null){
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity);
             this.r = c.b(activity);
          }
          tq = this.r;
          tq.I((tq.getCurrentPosition() - i), i);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(LiveSlideDetailContainerFragment.class);
       this.q = this.q8(d.class);
       return;
    }
}
