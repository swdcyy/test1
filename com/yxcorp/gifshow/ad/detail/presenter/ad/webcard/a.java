package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver;
import java.util.Objects;
import java.lang.StringBuilder;
import yx.j0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g59.k0;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;

public final class a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00162c
{
    public final ThanosAdWebCardTachikomaPresenter$d b;

    public void a(ThanosAdWebCardTachikomaPresenter$d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter e = this.b.c.E;
       ViewParent parent = (e != null)? e.getParent(): objArray;
       if (!parent instanceof FrameLayout) {
          parent = objArray;
       }
       if (parent == null || (!parent.getWidth() || (parent != null && !parent.getHeight()))) {
          return;
       }else {
          e = this.b.c.E;
          if (e != null) {
             ViewTreeObserver viewTreeObse = e.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.removeOnGlobalLayoutListener(this);
             }
          }
          a tb = this.b;
          tb.b = objArray;
          ThanosAdWebCardTachikomaPresenter$d c = tb.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoid(objArray, c, ThanosAdWebCardTachikomaPresenter.class, "10")) {
             Object[] objArray1 = new Object[0];
             j0.l("TachikomaWebCard", "tachikoma initAndLoadWebCard "+c.K, objArray1);
             ThanosAdWebCardTachikomaPresenter e1 = c.E;
             if (e1 != null) {
                ViewParent parent1 = e1.getParent();
                Objects.requireNonNull(parent1, "null cannot be cast to non-null type android.widget.FrameLayout");
                int width = parent1.getWidth();
                ViewParent parent2 = e1.getParent();
                Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
                int height = parent2.getHeight();
                c.G = width;
                if (n.P(c.getActivity(), (float)k0.b(c.getActivity())) <= 360 && (width && height)) {
                   c.G = (int)((float)c.G / 0x3f5c28f6);
                   e1.getLayoutParams().width = (int)((float)width / 0x3f5c28f6);
                   float f = (float)height / 0x3f5c28f6;
                   e1.getLayoutParams().height = (int)f;
                   e1.setScaleX(0x3f5c28f6);
                   e1.setScaleY(0x3f5c28f6);
                   e1.setPivotX(0);
                   e1.setPivotY(f);
                }
             label_00d7 :
                e1.setTranslationX((- (float)c.G));
                e1.setVisibility(0);
                c.H = -1;
                c.I = false;
                e1.removeAllViews();
                c.c9();
             }
          }
          return;
       }
    }
}
