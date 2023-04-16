package dl9.r1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import java.util.Objects;
import ek9.l1;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import android.view.View;
import com.kwai.library.widget.popup.common.c$b;
import zf6.k;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class r1 implements Runnable	// class@001f9a
{
    public final u1 b;

    public void r1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       r1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!l1.e() && tb.C.mDisableAllBubbleGuide == null) {
          a$c uoc = new a$c(tb.getActivity());
          uoc.F0(a1.p(R.string.arg_RES_7f101850));
          uoc.o0(tb.s);
          uoc.C0(a1.e(5.00f));
          uoc.B0(a1.e(10.00f));
          uoc.T(3000);
          uoc.P(true);
          if (k.e()) {
             p.m(uoc);
          }else {
             p.n(uoc);
          }
          l1.h(true);
       }
       return;
    }
}
