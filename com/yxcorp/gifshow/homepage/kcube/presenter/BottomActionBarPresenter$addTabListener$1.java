package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1;
import jr6.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import wq6.f;
import wq6.h;
import wq6.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$a;
import android.view.View$OnClickListener;
import zq6.b;
import rn5.a;
import zq6.p;
import java.lang.Boolean;
import android.view.GestureDetector;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$addTab$detector$1;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$b;
import android.view.View$OnTouchListener;

public final class BottomActionBarPresenter$addTabListener$1 implements a	// class@001746
{
    public final BottomActionBarPresenter a;

    public void BottomActionBarPresenter$addTabListener$1(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void a(TabLayout$f p0,View p1,int p2){
       if (PatchProxy.isSupport(BottomActionBarPresenter$addTabListener$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, BottomActionBarPresenter$addTabListener$1.class, "1")) {
          return;
       }
       a.p(p0, "tab");
       a.p(p1, "tabView");
       h oh = this.a.X8().U(p2);
       View view = p0.a();
       if (view != null) {
          a.o(view, "it");
          oh.r("KEY_BOTTOM_TAB_CUSTOM_VIEW", view);
       }
       p1.setOnClickListener(new BottomActionBarPresenter$addTabListener$1$a(this, p2, p0));
       p h = a.h;
       a.o(h, "HomeBottomStateId.TAB_SUPPORT_GESTURES");
       Boolean uBoolean = this.a.X8().y().e(oh, h);
       if (a.g(Boolean.TRUE, uBoolean)) {
          p1.setOnTouchListener(new BottomActionBarPresenter$addTabListener$1$b(p0, new GestureDetector(this.a.getContext(), new BottomActionBarPresenter$addTabListener$1$addTab$detector$1(this, p1, oh))));
       }
       return;
    }
}
