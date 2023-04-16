package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$b;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NasaSimilarPhotoAutoPlayPresenter$b implements g	// class@0018b6
{
    public final NasaSimilarPhotoAutoPlayPresenter b;

    public void NasaSimilarPhotoAutoPlayPresenter$b(NasaSimilarPhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSimilarPhotoAutoPlayPresenter$b.class, "1")) {
       }else {
          a.o(p0, "isSeeking");
          this.b.L9(p0.booleanValue(), 6);
          PatchProxy.onMethodExit(NasaSimilarPhotoAutoPlayPresenter$b.class, "1");
       }
       return;
    }
}
