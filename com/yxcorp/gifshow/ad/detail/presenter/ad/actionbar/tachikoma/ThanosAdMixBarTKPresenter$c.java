package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.StringBuilder;
import yx.j0;
import lnc.a1;
import nz8.d;

public final class ThanosAdMixBarTKPresenter$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00157b
{
    public final ThanosAdMixBarTKPresenter b;

    public void ThanosAdMixBarTKPresenter$c(ThanosAdMixBarTKPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosAdMixBarTKPresenter$c.class, "1")) {
          return;
       }
       ThanosAdMixBarTKPresenter y = this.b.y;
       if (y != null) {
          ViewTreeObserver viewTreeObse = y.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.removeOnGlobalLayoutListener(this);
          }
       }
       Rect rect = new Rect();
       Rect rect1 = new Rect();
       ThanosAdMixBarTKPresenter x = this.b.x;
       if (x != null) {
          x.getGlobalVisibleRect(rect);
       }
       x = this.b.y;
       if (x != null) {
          x.getGlobalVisibleRect(rect1);
       }
       int i = rect1.top - rect.top;
       ThanosAdMixBarTKPresenter x1 = this.b.x;
       ViewGroup$LayoutParams layoutParams = (x1 != null)? x1.getLayoutParams(): objArray;
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       Object[] objArray1 = new Object[0];
       j0.f("TachikomaMixBarPresenter", " offsetContainer mix bar rect "+rect+" infoRect "+rect1+"  bottomMargin "+layoutParams.bottomMargin, objArray1);
       layoutParams.bottomMargin = (- i) + a1.e(64.00f);
       ThanosAdMixBarTKPresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ThanosAdMixBarTKPresenter.class, "3")) {
          ThanosAdMixBarTKPresenter x2 = tb.x;
          if (x2 != null) {
             ViewTreeObserver viewTreeObse1 = x2.getViewTreeObserver();
             if (viewTreeObse1 != null) {
                viewTreeObse1.addOnGlobalLayoutListener(new d(tb));
             }
          }
       }
       y = this.b.x;
       if (y != null) {
          y.setLayoutParams(layoutParams);
       }
       return;
    }
}
