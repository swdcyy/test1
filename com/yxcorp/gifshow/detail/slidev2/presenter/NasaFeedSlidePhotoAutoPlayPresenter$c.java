package com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter$c;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class NasaFeedSlidePhotoAutoPlayPresenter$c implements g	// class@0018b3
{
    public final NasaFeedSlidePhotoAutoPlayPresenter b;

    public void NasaFeedSlidePhotoAutoPlayPresenter$c(NasaFeedSlidePhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeedSlidePhotoAutoPlayPresenter$c.class, "1")) {
       }else if(p0 != null){
          if (p0.booleanValue()) {
             this.b.T.set(18);
             this.b.G9();
          }else {
             this.b.T.clear(18);
             if (this.b.n9()) {
                this.b.F9();
             }
          }
       }
       return;
    }
}
