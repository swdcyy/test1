package g19.s;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import im8.f;
import java.util.BitSet;

public final class s implements g	// class@0023dc
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void s(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       tb.X8().set(p0);
       if (p0.booleanValue()) {
          tb.T.set(3);
          tb.e9();
       }else {
          tb.T.clear(3);
          if (tb.b9()) {
             tb.d9();
          }
       }
       return;
    }
}
