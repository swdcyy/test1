package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$f;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoAdShakePresenter$f implements g	// class@0015ba
{
    public final PhotoAdShakePresenter b;

    public void PhotoAdShakePresenter$f(PhotoAdShakePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdShakePresenter$f.class, "1")) {
       }else {
          a.o(p0, "open");
          this.b.C = p0.booleanValue();
          this.b.x = p0.booleanValue();
       }
       return;
    }
}
