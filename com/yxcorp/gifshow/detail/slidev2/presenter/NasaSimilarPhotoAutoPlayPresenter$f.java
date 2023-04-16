package com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter$f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSimilarPhotoAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class NasaSimilarPhotoAutoPlayPresenter$f implements Observer	// class@0018ba
{
    public final NasaSimilarPhotoAutoPlayPresenter b;

    public void NasaSimilarPhotoAutoPlayPresenter$f(NasaSimilarPhotoAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaSimilarPhotoAutoPlayPresenter$f.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.L9(p0.booleanValue(), 7);
       }
       return;
    }
}
