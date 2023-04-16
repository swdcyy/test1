package c8a.k;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import z3d.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class k implements g	// class@00057e
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void k(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlideAutoPlaySwitchPhotoPresenter.class, "4")) {
       }else if(tb.L == null){
          p0 = p0.a;
          if (p0 == 1) {
             tb.T.set(17);
             tb.G9();
          }else if(p0 == 2){
             tb.T.clear(17);
             tb.F9();
          }
       }
       return;
    }
}
