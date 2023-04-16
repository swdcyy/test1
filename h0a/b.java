package h0a.b;
import ok.o;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.commoninsertcard.entity.d;

public final class b implements o	// class@00252a
{
    public final NasaMilanoSlidePlayContainerFragment b;

    public void b(NasaMilanoSlidePlayContainerFragment p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b = (!this.b.C.getNasaSlideParam().isFromNewsEntrance() || (!r1.r3(p0.mEntity) && (r1.k3(p0.mEntity) || d.a(p0.mEntity))))? true: false;
       return b;
    }
}
