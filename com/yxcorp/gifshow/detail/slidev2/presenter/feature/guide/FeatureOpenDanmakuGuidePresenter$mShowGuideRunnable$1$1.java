package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;
import sm5.d;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import oe6.g;

public final class FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1 extends Lambda implements a	// class@001951
{
    public final FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1 this$0;

    public void FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1(FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1$1.class, "1")) {
          return;
       }
       FeatureOpenDanmakuGuidePresenter x = this.this$0.b.x;
       if (x == null) {
          a.S("mHasShownGuide");
       }
       x.set(Boolean.TRUE);
       x = this.this$0.b.r;
       if (x == null) {
          a.S("mCanClearScreen");
       }
       x.set(Boolean.FALSE);
       if (d.b(FeatureOpenDanmakuGuidePresenter.P8(this.this$0.b)) && !PatchProxy.applyVoid(objArray, objArray, d.class, "10")) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          g.a(d.a.edit().putInt(d.d+mE.getId(), (d.h.f() + 1)));
       }
       d.k(FeatureOpenDanmakuGuidePresenter.P8(this.this$0.b));
       return;
    }
}
