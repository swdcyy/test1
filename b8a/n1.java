package b8a.n1;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Boolean;
import im8.f;
import java.util.BitSet;

public final class n1 implements g	// class@0003cc
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void n1(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n1 tb = this.b;
       tb.c9().set(p0);
       if (p0.booleanValue()) {
          tb.T.set(3);
          tb.G9();
       }else {
          tb.T.clear(3);
          if (tb.n9()) {
             tb.F9();
          }
       }
       return;
    }
}
