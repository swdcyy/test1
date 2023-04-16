package g19.z;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.util.Objects;
import java.util.BitSet;
import b95.a;
import w85.a;

public final class z implements b$b	// class@0023e3
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void z(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void d(int p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == 3) {
          tb.Y = false;
          tb.T.clear(5);
          if (tb.b9()) {
             tb.d9();
          }
          tb.H.n().b();
       }else if(p0 == 4){
          tb.T.set(5);
          tb.e9();
       }
       return;
    }
}
