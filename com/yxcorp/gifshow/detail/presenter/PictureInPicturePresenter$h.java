package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$h;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import zca.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.event.PipModeStatus;
import java.util.BitSet;

public final class PictureInPicturePresenter$h implements g	// class@0016b9
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$h(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$h.class, "1")) {
       }else if(p0.a == PipModeStatus.ENABLE){
          this.b.B.clear(p0.a());
       }else {
          this.b.B.set(p0.a());
       }
       return;
    }
}
