package cl9.m;
import java.lang.Runnable;
import cl9.y;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import cl9.x;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.content.Context;
import hl9.t;
import com.kwai.library.widget.popup.bubble.a;

public final class m implements Runnable	// class@00064a
{
    public final y b;

    public void m(y p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, y.class, "21")) {
       }else {
          Rect rect = new Rect();
          if (tb.getActivity() != null && tb.K == null) {
             y c = tb.C;
             if (c != null && (c.getGlobalVisibleRect(rect) && tb.C.hasWindowFocus())) {
                y j = tb.J;
                if (j == null || !j.K()) {
                   a uoa = new a(tb.getActivity());
                   uoa.K0(KwaiBubbleOption.e);
                   uoa.I0(0x272b);
                   uoa.C0(-25);
                   uoa.o0(tb.C);
                   uoa.D0(BubbleInterface$Position.TOP);
                   uoa.F0(a1.p(R.string.arg_RES_7f1005d7));
                   uoa.P(true);
                   uoa.z(true);
                   uoa.A(false);
                   uoa.T(3000);
                   uoa.M(new x(tb));
                   if (t.W8(tb.C.getContext())) {
                      uoa.p();
                   }else {
                      uoa.o();
                   }
                   tb.K = a.b0(0x7f110612, uoa);
                }
             }
          }
       }
       return;
    }
}
