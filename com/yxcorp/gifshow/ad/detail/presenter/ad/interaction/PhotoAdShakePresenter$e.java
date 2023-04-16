package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoAdShakePresenter$e implements g	// class@0015b9
{
    public final PhotoAdShakePresenter b;

    public void PhotoAdShakePresenter$e(PhotoAdShakePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdShakePresenter$e.class, "1")) {
       }else {
          a.o(p0, "show");
          this.b.x = p0.booleanValue();
       }
       return;
    }
}
