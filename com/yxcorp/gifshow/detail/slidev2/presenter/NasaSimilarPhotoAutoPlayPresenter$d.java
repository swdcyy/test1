package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$d;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class NasaSimilarPhotoAutoPlayPresenter$d implements g	// class@0018b8
{
    public final NasaSimilarPhotoAutoPlayPresenter b;

    public void NasaSimilarPhotoAutoPlayPresenter$d(NasaSimilarPhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaSimilarPhotoAutoPlayPresenter$d.class, "1")) {
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
