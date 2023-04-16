package f69.i;
import java.lang.Runnable;
import f69.s;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import f69.k;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import f69.t;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class i implements Runnable	// class@0022b8
{
    public final s b;
    public final String c;

    public void i(s p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, s.class, "11")) {
       }else if(tb.getActivity() == null || tb.y != null){
          int[] ointArray = a$c.f0(tb.A, BubbleInterface$Position.LEFT);
          a uoa = new a(tb.getActivity());
          uoa.K0(KwaiBubbleOption.g);
          uoa.n0(ointArray[0], ointArray[1]);
          uoa.F0(tc);
          uoa.v(1);
          uoa.J(new k(tb));
          uoa.M(new t(tb));
          tb.x = p.h(uoa);
       }
       return;
    }
}
