package g19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import w85.a;
import g19.o0;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import com.yxcorp.gifshow.ad.detail.presenter.side.a;
import g19.c0;
import com.yxcorp.gifshow.ad.detail.presenter.side.k;
import g19.k;
import le5.f;
import g19.m;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import com.yxcorp.gifshow.ad.detail.presenter.side.c;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import g19.q0;
import g19.q;
import g19.p0;
import g19.n0;

public class a extends PresenterV2	// class@0023ad
{

    public void a(NasaBizParam p0,a p1){
       super();
       this.U7(new o0());
       this.U7(new MilanoItemProfileSidePresenter());
       this.U7(new a());
       this.U7(new c0());
       this.U7(new k());
       if (p1.o()) {
          this.U7(new k());
       }
       if (f.o()) {
          this.U7(new m());
          this.U7(new ThanosSideTKPresenter());
       }else {
          this.U7(new c());
       }
       this.U7(new SlidePlayAutoPlayNextPresenter());
       this.U7(new q0());
       this.U7(new q());
       this.U7(new p0());
       this.U7(new n0());
       return;
    }
}
