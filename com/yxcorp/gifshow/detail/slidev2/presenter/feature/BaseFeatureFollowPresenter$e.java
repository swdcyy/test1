package com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter$e;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.BaseFeatureFollowPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Boolean;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.graphics.Rect;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import android.view.TouchDelegate;

public final class BaseFeatureFollowPresenter$e extends a	// class@001909
{
    public final BaseFeatureFollowPresenter a;

    public void BaseFeatureFollowPresenter$e(BaseFeatureFollowPresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       BaseFeatureFollowPresenter$e uoe = BaseFeatureFollowPresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "1")) {
          return;
       }
       uoe = this.a;
       boolean b = (!p0 - null)? true: false;
       uoe.A = b;
       Objects.requireNonNull(uoe);
       BaseFeatureFollowPresenter uBaseFeature = BaseFeatureFollowPresenter.class;
       if (!PatchProxy.isSupport(uBaseFeature) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoe, uBaseFeature, "16")) {
          if (!b) {
             uoe.V8();
          }else {
             BaseFeatureFollowPresenter x = uoe.x;
             ViewParent viewParent = null;
             ViewParent parent = (x != null)? x.getParent(): viewParent;
             if (parent != null) {
                Rect rect = new Rect();
                BaseFeatureFollowPresenter x1 = uoe.x;
                if (x1 != null) {
                   x1.getHitRect(rect);
                }
                int i = n.c(a.B, 7.00f);
                rect.top = rect.top - i;
                rect.bottom = rect.bottom + i;
                x1 = uoe.x;
                if (x1 != null) {
                   viewParent = x1.getParent();
                }
                Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.View");
                viewParent.setTouchDelegate(new TouchDelegate(rect, uoe.x));
             }
          }
       }
       return;
    }
}
