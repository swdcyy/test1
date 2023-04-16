package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$addTab$detector$1;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1;
import android.view.View;
import wq6.h;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import wq6.f;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import yq6.d;
import qn5.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$addTabListener$1$addTab$detector$1$onDoubleTap$1;
import yq6.a;
import msd.l;

public final class BottomActionBarPresenter$addTabListener$1$addTab$detector$1 extends GestureDetector$SimpleOnGestureListener	// class@001744
{
    public final BottomActionBarPresenter$addTabListener$1 b;
    public final View c;
    public final h d;

    public void BottomActionBarPresenter$addTabListener$1$addTab$detector$1(BottomActionBarPresenter$addTabListener$1 p0,View p1,h p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarPresenter$addTabListener$1$addTab$detector$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       a d = a.d;
       a.o(d, "HomeBottomActionId.BOTTOM_TAB_DOUBLE_TAP");
       return this.b.a.X8().d().d(this.d, d, BottomActionBarPresenter$addTabListener$1$addTab$detector$1$onDoubleTap$1.INSTANCE, Boolean.FALSE).booleanValue();
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarPresenter$addTabListener$1$addTab$detector$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarPresenter$addTabListener$1$addTab$detector$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       this.c.performClick();
       return true;
    }
}
