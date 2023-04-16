package com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$e;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfa.a;
import q87.c;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import android.view.ViewGroup;
import pfa.b;

public final class SecondFloorControlPresenter$e extends AnimatorListenerAdapter	// class@001004
{
    public final SecondFloorControlPresenter a;
    public final long b;

    public void SecondFloorControlPresenter$e(SecondFloorControlPresenter p0,long p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SecondFloorControlPresenter$e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("SecondFloorControlPresenter", "startCollapseAnimation end", objArray);
       SecondFloorControlPresenter$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, SecondFloorControlPresenter.class, "13")) {
          SecondFloorControlPresenter q = ta.q;
          if (q == null) {
             a.S("mRefreshLayout");
          }
          q.setEnteringFirstFloor(0);
          q = ta.q;
          if (q == null) {
             a.S("mRefreshLayout");
          }
          q.setInSecondFloor(0);
          q = ta.q;
          if (q == null) {
             a.S("mRefreshLayout");
          }
          q.h1 = false;
          q.i1 = false;
          q.j1 = false;
          q.m1 = false;
          SecondFloorControlPresenter q1 = ta.q;
          if (q1 == null) {
             a.S("mRefreshLayout");
          }
          q1.setEnabled(true);
       }
       ta = this.a;
       ta.u = false;
       SecondFloorControlPresenter.S8(ta).k(0);
       SecondFloorControlPresenter.S8(this.a).f(0);
       PatchProxy.onMethodExit(SecondFloorControlPresenter$e.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SecondFloorControlPresenter$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("SecondFloorControlPresenter", "startCollapseAnimation start", objArray);
       SecondFloorControlPresenter$e ta = this.a;
       ta.u = true;
       SecondFloorControlPresenter.P8(ta).setEnteringFirstFloor(true);
       PatchProxy.onMethodExit(SecondFloorControlPresenter$e.class, "1");
       return;
    }
}
