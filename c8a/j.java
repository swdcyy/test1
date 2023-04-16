package c8a.j;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import java.lang.Object;
import d0a.m;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class j implements g	// class@00057d
{
    public final SlideAutoPlaySwitchPhotoPresenter b;

    public void j(SlideAutoPlaySwitchPhotoPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SlideAutoPlaySwitchPhotoPresenter.class, "3")) {
       }else if(tb.L == null){
          p0 = p0.a;
          if (p0 == 1) {
             tb.T.set(16);
             tb.G9();
          }else if(p0 == 2){
             tb.T.clear(16);
             tb.F9();
          }
       }
       return;
    }
}
