package dec.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import dec.a$a;
import qvb.q;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import dec.a$b;
import erd.r;
import dec.a$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import mp.b;
import qvb.i;
import com.yxcorp.gifshow.reminder.friend.data.a;
import qvb.n0;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import u07.t$a;
import android.app.Activity;
import u07.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class a extends PresenterV2	// class@002197
{
    public BaseFragment p;
    public q q;
    public SlidePlayViewModel r;
    public boolean s;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (!b.a(-1578665399).F()) {
          return;
       }
       a tp = this.p;
       String str = "fragment";
       if (tp == null) {
          a.S(str);
       }
       this.r = SlidePlayViewModel.B0(tp);
       a$a uoa = new a$a(this);
       this.q = uoa;
       a tr = this.r;
       if (tr != null) {
          tr.e(uoa);
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       this.X7(tp.Vg().i().filter(new a$b(this)).subscribe(new a$c(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          a tr = this.r;
          if (tr != null) {
             tr.b(tq);
          }
       }
       this.q = null;
       this.r = null;
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       boolean b = true;
       b.f(b);
       a tr = this.r;
       i oi = (tr != null)? tr.X0(): objArray;
       if (oi instanceof a) {
          objArray = oi;
       }
       if (objArray != null) {
          FriendSlidePlayFeedResponse uFriendSlide = objArray.L0();
          if (uFriendSlide != null && uFriendSlide.mEnableShowGlobalRemovedDialog == b) {
             Activity activity = this.getActivity();
             a.m(activity);
             t$a uoa = new t$a(activity);
             uoa.y0(R.string.arg_RES_7f10319c);
             uoa.x0(17);
             uoa.W0(R.string.arg_RES_7f10319d);
             uoa.B0(R.drawable.arg_RES_7f082210);
             uoa.S0(R.string.arg_RES_7f101812);
             a.b(uoa).X();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
