package im1.d;
import java.lang.Runnable;
import im1.e;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e3.l;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.ChangeBounds;

public final class d implements Runnable	// class@002949
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, tb, uoe, "19")) {
       }else {
          tb.d9(2);
          e uoe1 = PatchProxy.apply(null, tb, uoe, "10");
          if (uoe1 != patchProxyRe) {
          }else if(tb.N == null){
             tb.Z8();
             tb.N = l.d(tb.M, 0x7f0d0d7a, tb.getContext());
          }
          uoe1 = tb.N;
          uoe = PatchProxy.apply(null, tb, uoe, "8");
          if (uoe != patchProxyRe) {
          }else if(tb.K == null){
             TransitionSet transitionSe = new TransitionSet();
             transitionSe.l0(new ChangeBounds());
             transitionSe.r0(300);
             tb.K = transitionSe;
          }
          uoe = tb.K;
          tb.X8(uoe1, uoe);
          tb.e9();
       }
       return;
    }
}
