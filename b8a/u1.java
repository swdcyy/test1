package b8a.u1;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.util.Objects;
import java.util.BitSet;
import b95.a;
import w85.a;

public final class u1 implements b$b	// class@0003fe
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void u1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void d(int p0){
       u1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 3) {
          tb.Y = false;
          tb.T.clear(5);
          if (tb.n9()) {
             tb.F9();
          }
          if (tb.H.n().b()) {
             tb.t9(true);
          }
       }else if(p0 == 4){
          tb.T.set(5);
          tb.G9();
       }
       return;
    }
}
