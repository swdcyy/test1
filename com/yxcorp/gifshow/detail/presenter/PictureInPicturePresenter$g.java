package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$g;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import rd5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m3a.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;

public final class PictureInPicturePresenter$g implements g	// class@0016b8
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$g(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$g.class, "1")) {
       }else {
          p0 = q.a;
          PictureInPicturePresenter x = this.b.x;
          QPhoto currentPhoto = (x != null)? x.getCurrentPhoto(): null;
          p0.a(currentPhoto, PictureInPicturePresenter.P8(this.b), "RESUME");
       }
       return;
    }
}
