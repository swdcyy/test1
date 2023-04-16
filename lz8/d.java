package lz8.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pz8.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import nz8.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import g09.d;

public class d extends PresenterV2	// class@002dd3
{

    public void d(){
       super();
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
       }else {
          this.U7(new j());
          this.U7(new ThanosAdActionBarTKPresenter());
          this.U7(new g());
          this.U7(new ThanosAdMixBarTKPresenter());
          this.U7(new d());
       }
       return;
    }
}
