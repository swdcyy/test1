package com.yxcorp.gifshow.detail.slidev2.presenter.feature.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import android.widget.TextView;

public final class n implements Runnable	// class@0019ac
{
    public final SlideVerticalAtlasExpandPresenter$f b;

    public void n(SlideVerticalAtlasExpandPresenter$f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter w = this.b.b.w;
       if (w != null) {
          w.performClick();
       }
       return;
    }
}
