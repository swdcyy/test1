package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoAdRotatePresenter$g implements g	// class@0015b1
{
    public final PhotoAdRotatePresenter b;

    public void PhotoAdRotatePresenter$g(PhotoAdRotatePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdRotatePresenter$g.class, "1")) {
       }else {
          a.o(p0, "open");
          this.b.C = p0.booleanValue();
          if (p0.booleanValue()) {
             this.b.S8(false);
          }
       }
       return;
    }
}
