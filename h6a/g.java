package h6a.g;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import io.reactivex.subjects.PublishSubject;

public final class g implements g	// class@00258c
{
    public final SlidePage b;

    public void g(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.x1.onNext(LikeAnimationEnum.DISLIKE_TO_LIKE);
    }
}
