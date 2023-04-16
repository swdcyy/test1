package h6a.p0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import io.reactivex.subjects.PublishSubject;

public final class p0 implements g	// class@0025ad
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void p0(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.F.c.x1.onNext(LikeAnimationEnum.DISLIKE_TO_LIKE);
    }
}
