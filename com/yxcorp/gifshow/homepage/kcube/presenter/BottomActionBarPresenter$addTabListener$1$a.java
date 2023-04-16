package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import tsa.a;
import wq6.f;
import wq6.h;
import wq6.g;

public final class BottomActionBarPresenter$addTabListener$1$a implements View$OnClickListener	// class@001742
{
    public final BottomActionBarPresenter$addTabListener$1 b;
    public final int c;
    public final TabLayout$f d;

    public void BottomActionBarPresenter$addTabListener$1$a(BottomActionBarPresenter$addTabListener$1 p0,int p1,TabLayout$f p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter$addTabListener$1$a.class, "1")) {
          return;
       }
       BottomActionBarPresenter$addTabListener$1 a = this.b.a;
       a.p = this.c;
       BottomActionBarPresenter.R8(a).b(this.c, true, this.d.a(), this.b.a.X8().U(this.c));
       return;
    }
}
