package dfc.j;
import java.lang.Runnable;
import dfc.m;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import dfc.h;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import dfc.k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class j implements Runnable	// class@0021a7
{
    public final m b;

    public void j(m p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       if (tb.getActivity() != null && tb.s == null) {
          Activity activity = tb.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, tb, m.class, "3")) {
             int[] ointArray = a$c.f0(tb.q, BubbleInterface$Position.BOTTOM);
             a uoa = new a(activity);
             uoa.I0(0x2716);
             uoa.K0(KwaiBubbleOption.g);
             uoa.n0(ointArray[0], ointArray[1]);
             uoa.F0(a1.p(R.string.arg_RES_7f10492b));
             uoa.C0(a1.e(-12.00f));
             uoa.T(3000);
             uoa.J(new h(tb));
             uoa.M(new k(tb));
             if (tb.p.Vg().c()) {
                tb.s = p.d(uoa);
             }
          }
       }
       return;
    }
}
