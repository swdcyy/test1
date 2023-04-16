package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$b;
import android.view.View$OnTouchListener;
import com.google.android.material.tabs.TabLayout$f;
import android.view.GestureDetector;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class BottomActionBarPresenter$addTabListener$1$b implements View$OnTouchListener	// class@001745
{
    public final TabLayout$f b;
    public final GestureDetector c;

    public void BottomActionBarPresenter$addTabListener$1$b(TabLayout$f p0,GestureDetector p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, BottomActionBarPresenter$addTabListener$1$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.b.f() && this.c.onTouchEvent(p1))? true: false;
       return b;
    }
}
