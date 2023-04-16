package g19.t;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.util.BitSet;

public final class t implements g	// class@0023dd
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void t(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.T.set(18);
          tb.e9();
       }else {
          tb.T.clear(18);
          if (tb.b9()) {
             tb.d9();
          }
       }
       return;
    }
}
