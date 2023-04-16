package h0a.a;
import ok.o;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class a implements o	// class@002529
{
    public final NasaMilanoSlidePlayContainerFragment b;

    public void a(NasaMilanoSlidePlayContainerFragment p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = (this.b.C.getNasaSlideParam().isFromNewsEntrance() && r1.r3(p0.mEntity))? true: false;
       return b;
    }
}
