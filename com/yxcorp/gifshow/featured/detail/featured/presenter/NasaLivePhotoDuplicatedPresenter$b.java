package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaLivePhotoDuplicatedPresenter$b;
import qw6.b;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaLivePhotoDuplicatedPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.SystemClock;
import kp.r1;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class NasaLivePhotoDuplicatedPresenter$b extends b	// class@000f66
{
    public final NasaLivePhotoDuplicatedPresenter b;

    public void NasaLivePhotoDuplicatedPresenter$b(NasaLivePhotoDuplicatedPresenter p0){
       this.b = p0;
       super();
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, NasaLivePhotoDuplicatedPresenter$b.class, "2")) {
          return;
       }
       NasaLivePhotoDuplicatedPresenter p = this.b.p;
       if (p != null) {
          r1.m5(p.getEntity(), SystemClock.elapsedRealtime());
          this.b.p = null;
       }
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, NasaLivePhotoDuplicatedPresenter$b.class, "1")) {
          return;
       }
       QPhoto currentPhoto = NasaLivePhotoDuplicatedPresenter.P8(this.b).getCurrentPhoto();
       if (currentPhoto != null) {
          if (!currentPhoto.isLiveStream()) {
             return;
          }else {
             this.b.p = currentPhoto;
          }
       }
       return;
    }
}
