package com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$d;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$d$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class BaseFeatureFollowPresenter$d extends a	// class@001908
{
    public final BaseFeatureFollowPresenter b;

    public void BaseFeatureFollowPresenter$d(BaseFeatureFollowPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter$d.class, "2")) {
          return;
       }
       BaseFeatureFollowPresenter$d tb = this.b;
       tb.y = false;
       BaseFeatureFollowPresenter x = tb.x;
       if (x != null) {
          x.b();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, BaseFeatureFollowPresenter$d.class, "1")) {
          return;
       }
       BaseFeatureFollowPresenter$d tb = this.b;
       tb.y = true;
       tb.V8();
       BaseFeatureFollowPresenter x = this.b.x;
       if (x != null) {
          x.setOnClickListener(new BaseFeatureFollowPresenter$d$a(this));
       }
       return;
    }
}
