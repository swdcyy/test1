package c8a.l;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import bxb.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class l implements g	// class@00057f
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void l(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlideAutoPlaySwitchPhotoPresenter.class, "5")) {
       }else if(p0.a == 1){
          tb.T.set(14);
          tb.G9();
       }else {
          tb.T.clear(14);
          tb.F9();
       }
       return;
    }
}
