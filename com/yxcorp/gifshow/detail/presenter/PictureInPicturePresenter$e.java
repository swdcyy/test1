package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$e;
import jta.a;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public final class PictureInPicturePresenter$e extends a	// class@0016b6
{
    public final PictureInPicturePresenter a;

    public void PictureInPicturePresenter$e(PictureInPicturePresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       PictureInPicturePresenter$e ta = this.a;
       boolean b = (!p0)? true: false;
       ta.z = b;
       return;
    }
    public void d(float p0){
       PictureInPicturePresenter$e uoe = PictureInPicturePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "1")) {
          return;
       }
       p0.z = true;
       return;
    }
}
