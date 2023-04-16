package c8a.h;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class h implements g	// class@00057b
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void h(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.T.set(18);
          tb.G9();
       }else {
          tb.T.clear(18);
          tb.F9();
       }
       return;
    }
}
