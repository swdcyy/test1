package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class SlideVerticalAtlasExpandPresenter$b extends a	// class@00192b
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void SlideVerticalAtlasExpandPresenter$b(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       SlideVerticalAtlasExpandPresenter v0;
       if (PatchProxy.applyVoid(null, this, SlideVerticalAtlasExpandPresenter$b.class, "2")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter$b tb = this.b;
       tb.U0 = false;
       if ((v0 = tb.V0) != null) {
          v0.setText("");
       }
       return;
    }
    public void i2(){
       SlideVerticalAtlasExpandPresenter v0;
       if (PatchProxy.applyVoid(null, this, SlideVerticalAtlasExpandPresenter$b.class, "1")) {
          return;
       }
       SlideVerticalAtlasExpandPresenter$b tb = this.b;
       tb.U0 = true;
       PhotoDetailLogger photoDetailL = SlideVerticalAtlasExpandPresenter.R8(tb).get();
       if (photoDetailL != null) {
          photoDetailL.enterAtlasCoverMode();
       }
       if ((v0 = this.b.V0) != null) {
          v0.setText("");
       }
       return;
    }
}
