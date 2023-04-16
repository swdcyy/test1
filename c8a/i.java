package c8a.i;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class i implements g	// class@00057c
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void i(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       if (tb.L == null) {
       }else if(p0.booleanValue()){
          tb.T.set(13);
          tb.G9();
       }else {
          tb.T.clear(13);
          tb.F9();
       }
       return;
    }
}
