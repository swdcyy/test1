package h6a.m1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import io.reactivex.subjects.PublishSubject;

public final class m1 implements g	// class@0025a2
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void m1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.F.c.x1.onNext(LikeAnimationEnum.DISLIKE_TO_LIKE);
    }
}
