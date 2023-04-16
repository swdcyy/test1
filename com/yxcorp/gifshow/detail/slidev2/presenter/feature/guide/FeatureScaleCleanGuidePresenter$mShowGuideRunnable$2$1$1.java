package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import im8.f;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Integer;
import uw9.c;
import java.lang.System;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1 extends Lambda implements a	// class@001958
{
    public final FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1 this$0;

    public void FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1(FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       SharedPreferences$Editor uEditor;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2$1$1.class, "1")) {
          return;
       }
       FeatureScaleCleanGuidePresenter r = this.this$0.b.this$0.r;
       if (r == null) {
          a.S("mHasShownGuide");
       }
       r.set(Boolean.TRUE);
       r = this.this$0.b.this$0.s;
       if (r == null) {
          a.S("mCanClearScreen");
       }
       Boolean fALSE = Boolean.FALSE;
       r.set(fALSE);
       FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2 this$0 = this.this$0.b.this$0;
       Objects.requireNonNull(this$0);
       FeatureScaleCleanGuidePresenter uFeatureScal = FeatureScaleCleanGuidePresenter.class;
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
       if (!PatchProxy.applyVoid(objArray, this$0, uFeatureScal, "8")) {
          NasaFeatureGuideManager$a e = NasaFeatureGuideManager.e;
          NasaFeatureGuideManager nasaFeatureG1 = e.a();
          boolean b = false;
          Objects.requireNonNull(nasaFeatureG1);
          if (!PatchProxy.isSupport(nasaFeatureG) || !PatchProxy.applyVoidOneRefs(fALSE, nasaFeatureG1, nasaFeatureG, "31")) {
             uEditor = a.a.edit();
             uEditor.putBoolean("ShouldShowSlideScaleCleanHint", b);
             g.a(uEditor);
          }
          NasaFeatureGuideManager nasaFeatureG2 = e.a();
          int i = e.a().l() + 1;
          Objects.requireNonNull(nasaFeatureG2);
          if (!PatchProxy.isSupport(nasaFeatureG) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), nasaFeatureG2, nasaFeatureG, "33")) {
             uEditor = c.a.edit();
             uEditor.putInt("slideScaleCleanHintShownCount", i);
             g.a(uEditor);
          }
          nasaFeatureG2 = e.a();
          long l = System.currentTimeMillis();
          Objects.requireNonNull(nasaFeatureG2);
          if (!PatchProxy.isSupport(nasaFeatureG) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), nasaFeatureG2, nasaFeatureG, "35")) {
             uEditor = c.a.edit();
             uEditor.putLong("slideScaleCleanHintShownTime", l);
             g.a(uEditor);
          }
          if (!PatchProxy.applyVoid(objArray, this$0, uFeatureScal, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SIMPLIFY_SCREEN_GUIDE_GESTURE";
             i3 oi3 = i3.f();
             oi3.d("gesture_type", "DOUBLE_FINGER");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             FeatureScaleCleanGuidePresenter p = this$0.p;
             if (p == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.f(p.mEntity);
             uFeatureScal = this$0.v;
             if (uFeatureScal == null) {
                a.S("mFragment");
             }
             u1.D0("", uFeatureScal, 0, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
