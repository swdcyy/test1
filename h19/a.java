package h19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import h19.d;
import rf5.q;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import h19.f;
import h19.e;

public class a extends PresenterV2	// class@002533
{

    public void a(PhotoDetailParam p0,NasaBizParam p1,ThanosDetailBizParam p2){
       super();
       this.U7(new d());
       this.U7(new q());
       if (p0.getBizType() == 4 && (p1 != null && p1.getNasaSlideParam().isDetailPage())) {
          this.U7(new f());
          if (p1.getNasaSlideParam().mEnableSwipeDownBack != null) {
             this.U7(new e());
          }
       }else if(p2 != null && p2.mEnableExitShrink != null){
          this.U7(new e());
          this.U7(new f());
       }
       return;
    }
}
