package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1;
import com.google.android.material.tabs.TabLayout$d;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import com.yxcorp.utility.Log;
import android.view.View;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;
import wq6.h;
import wq6.f;
import yq6.d;
import qn5.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1$onTabReselected$refresh$1;
import java.lang.Boolean;
import yq6.a;
import msd.l;
import tsa.a;
import wq6.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1$a;
import z1.a;
import com.kwai.kcube.TabIdentifier;
import xr6.c;
import xr6.c$a;
import xr6.c$b;
import zq6.b;
import rn5.a;
import zq6.p;
import sn5.e;
import java.lang.CharSequence;
import sn5.g;
import jr6.b;
import gr6.b;
import lr6.f;
import rsa.b;
import java.util.Objects;
import kotlin.Pair;
import mrd.a;

public final class BottomActionBarPresenter$mOnTabSelectedListener$1 implements TabLayout$d	// class@00174b
{
    public TabLayout$f b;
    public long c;
    public final BottomActionBarPresenter d;

    public void BottomActionBarPresenter$mOnTabSelectedListener$1(BottomActionBarPresenter p0){
       this.d = p0;
       super();
    }
    public void H7(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter$mOnTabSelectedListener$1.class, "2")) {
          return;
       }
       a.p(p0, "tab");
       return;
    }
    public void sf(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter$mOnTabSelectedListener$1.class, "3")) {
          return;
       }
       a.p(p0, "tab");
       int i = p0.c();
       if (p0 == this.b && (SystemClock.elapsedRealtime() - this.c) - (long)1000 < 0) {
          Log.g("BottomActionBarPresenter", "onTabReselected Throttled");
          return;
       }else {
          this.b = p0;
          this.c = SystemClock.elapsedRealtime();
          BottomTabView uBottomTabVi = p0.a();
          h oh = p0.d();
          if (oh != null) {
             a c = a.c;
             a.o(c, "HomeBottomActionId.BOTTOM_TAB_RESELECT");
             if (this.d.X8().d().d(oh, c, BottomActionBarPresenter$mOnTabSelectedListener$1$onTabReselected$refresh$1.INSTANCE, Boolean.FALSE).booleanValue()) {
                BottomActionBarPresenter.R8(this.d).d(i, uBottomTabVi, this.d.X8().j());
             }
          }
          return;
       }
    }
    public void ua(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter$mOnTabSelectedListener$1.class, "1")) {
          return;
       }
       a.p(p0, "tab");
       int i = p0.c();
       View view = p0.a();
       h oh = p0.d();
       a.m(oh);
       a b = a.b;
       a.o(b, "HomeBottomActionId.BOTTOM_TAB_SELECT");
       this.d.X8().d().b(oh, b, new BottomActionBarPresenter$mOnTabSelectedListener$1$a(this, view, i));
       f uof = this.d.X8();
       TabIdentifier tabIdentifie = oh.M2();
       c$b e = c.e;
       String str = (this.d.p == i)? "tabClick": "userScroll";
       uof.V(tabIdentifie, e.c(str).a());
       BottomActionBarPresenter$mOnTabSelectedListener$1 td = this.d;
       if (td.p != i) {
          BottomActionBarPresenter.R8(td).b(i, false, view, this.d.X8().U(i));
       }
       if (this.d.Z8(view) && BottomActionBarPresenter.R8(this.d).c()) {
          b uob = this.d.X8().y();
          p i1 = a.i;
          a.o(i1, "HomeBottomStateId.TAB_BADGE");
          e uoe = uob.e(oh, i1);
          if (uoe != null && (uoe.a != null && !uoe.e())) {
             e uoe1 = e.d();
             a.o(uoe1, "BottomTabBadge.hide\(\)");
             a.m(view);
             BottomActionBarPresenter.R8(this.d).a(i, view, oh, view.getCurrentBadgeStatus(), view.getText(), uoe1);
             view.a(e.d());
          }
       label_00d5 :
          i1 = a.k;
          a.o(i1, "HomeBottomStateId.TAB_BUBBLE_STATE");
          g og = uob.e(oh, i1);
          if (og != null && og.a != null) {
             og = g.a();
             a.o(og, "BottomTabBubbleState.hide\(\)");
             BottomActionBarPresenter.R8(this.d).e(i, view, oh, og);
             b uob1 = BottomActionBarPresenter.P8(this.d).c();
             Objects.requireNonNull(uob1);
             if (!PatchProxy.applyVoidTwoRefs(view, og, uob1, b.class, "2")) {
                a.p(og, "hideBubbleState");
                uob1.d.onNext(new Pair(view, og));
             }
          }
       }
    label_0123 :
       return;
    }
}
