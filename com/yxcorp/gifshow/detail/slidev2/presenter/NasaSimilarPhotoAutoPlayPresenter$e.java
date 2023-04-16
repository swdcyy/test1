package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.util.BitSet;

public final class NasaSimilarPhotoAutoPlayPresenter$e implements g	// class@0018b9
{
    public final NasaSimilarPhotoAutoPlayPresenter b;

    public void NasaSimilarPhotoAutoPlayPresenter$e(NasaSimilarPhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaSimilarPhotoAutoPlayPresenter$e.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.T.set(3);
             this.b.G9();
          }else {
             this.b.T.clear(3);
             if (this.b.n9()) {
                this.b.F9();
             }
          }
       }
       return;
    }
}
