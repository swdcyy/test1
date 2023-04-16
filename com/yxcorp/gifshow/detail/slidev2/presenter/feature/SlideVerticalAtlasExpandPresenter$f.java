package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import bm5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.n;
import java.lang.Runnable;
import android.widget.TextView;

public final class SlideVerticalAtlasExpandPresenter$f implements g	// class@00192f
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void SlideVerticalAtlasExpandPresenter$f(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$f.class, "1")) {
       }else if((p0.a.getPhotoId()).equals(this.b.b9().getPhotoId()) && p0.b != null){
          p0 = this.b.w;
          if (p0 != null) {
             p0.post(new n(this));
          }
       }
       return;
    }
}
