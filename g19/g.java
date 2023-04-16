package g19.g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import java.lang.Object;
import java.lang.Float;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public final class g implements g	// class@0023b9
{
    public final MilanoItemProfileSidePresenter b;

    public void g(MilanoItemProfileSidePresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       if (tb.W == null) {
       }else if(!p0.floatValue()){
          r1.R4(tb.G.mEntity, true);
       }
       tb.P8(p0.floatValue());
       return;
    }
}
