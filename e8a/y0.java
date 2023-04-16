package e8a.y0;
import lnc.j1$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter;
import java.lang.Object;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class y0 implements j1$b	// class@0020e4
{
    public final NasaUploadClick2EventPresenter a;

    public void y0(NasaUploadClick2EventPresenter p0){
       this.a = p0;
    }
    public final int a(){
       return (int)((long)(NasaUploadClick2EventPresenter.x * 1000) - this.a.r.getActualPlayDuration());
    }
}
