package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$h;
import wz8.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.e;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.o;

public final class BrokenFramePresenter$h implements f	// class@0015d6
{
    public final BrokenFramePresenter a;

    public void BrokenFramePresenter$h(BrokenFramePresenter p0){
       this.a = p0;
       super();
    }
    public void onClick(){
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter$h.class, "1")) {
          return;
       }
       BrokenFramePresenter$h ta = this.a;
       BrokenFramePresenter c = ta.C;
       if (c != null) {
          BrokenFramePresenter q = ta.q;
          if (q == null) {
             a.S("mPhoto");
          }
          c.a(q, this.a.getActivity(), new e(174));
       }
       return;
    }
}
