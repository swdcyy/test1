package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$f;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class PhotoAdRotatePresenter$f implements g	// class@0015b0
{
    public final PhotoAdRotatePresenter b;

    public void PhotoAdRotatePresenter$f(PhotoAdRotatePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdRotatePresenter$f.class, "1")) {
       }else {
          this.b.S8((p0.booleanValue() ^ 0x01));
       }
       return;
    }
}
