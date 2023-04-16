package c8a.g;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class g implements g	// class@00057a
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void g(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.T.set(1);
          tb.G9();
       }else {
          tb.T.clear(1);
          tb.F9();
       }
       return;
    }
}
