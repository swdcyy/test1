package d5c.u;
import java.lang.Runnable;
import d5c.g0;
import java.lang.Object;
import java.util.Objects;
import s1c.o;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ki5.b;
import java.lang.String;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import d5c.h0;
import d5c.d0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import k07.g;
import com.kwai.library.widget.popup.bubble.a;
import z5c.u;

public final class u implements Runnable	// class@002112
{
    public final g0 b;

    public void u(g0 p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (!o.n()) {
          tb.Z0 = u.h(tb.getActivity(), tb.s, tb.X0, b.b().c(0x7f104953), BubbleInterface$Position.TOP, new h0(tb), 3000, 9.00f, new d0(tb));
       }
       return;
    }
}
