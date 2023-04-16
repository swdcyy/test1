package com.kwai.component.tabs.panel.TabsPanelHostFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.util.ArrayList;
import java.lang.Object;
import yg5.r0;
import yg5.c0;
import yg5.u0;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$a;
import com.kwai.component.tabs.panel.c;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kwai.component.tabs.panel.h;
import java.util.Objects;
import com.kwai.component.tabs.panel.h$b;
import com.kwai.component.tabs.panel.h$d;
import yg5.q0;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import ah5.c;
import ah5.e;
import bh5.c;
import dh5.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import android.content.Context;
import yg5.b0;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$g;
import android.view.animation.Interpolator;
import bh5.b;
import java.lang.Boolean;
import yg5.e0;
import com.kwai.component.tabs.panel.f;
import com.kwai.component.tabs.panel.e;
import java.lang.Integer;
import java.lang.Float;
import yg5.t0;
import com.kwai.library.widget.viewpager.tabstrip.a;
import yg5.o0;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.View;
import android.widget.TextView;
import lnc.a1;
import com.kwai.component.tabs.panel.a$a;
import o56.f;
import android.view.Window;
import android.app.Activity;
import lnc.i5;
import zf6.j;
import android.os.Bundle;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$c;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$d;
import android.view.View$OnClickListener;
import yg5.f0;
import android.view.View$OnTouchListener;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$e;
import android.view.ViewStub;
import yg5.g0;
import android.view.ViewStub$OnInflateListener;
import com.yxcorp.gifshow.recycler.widget.NestedScrollSafeViewPager;
import com.kwai.component.tabs.panel.widget.TabsPanelSafeViewPager;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yg5.o;
import lnc.g2;
import yg5.j0;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import com.kwai.component.tabs.panel.b;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$b;
import yg5.n;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$c;
import android.view.View$OnLayoutChangeListener;
import yg5.h;
import java.util.Map;
import yg5.i;
import yg5.j;
import yg5.k;
import java.lang.Runnable;
import com.kwai.component.tabs.panel.c$f;
import android.content.res.Configuration;
import rkd.b;
import yg5.h0;
import yg5.l;
import androidx.fragment.app.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import zf6.l;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.animation.ValueAnimator;
import com.kwai.component.tabs.panel.c$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver;
import com.yxcorp.utility.n;
import yg5.k0;
import android.view.ContextThemeWrapper;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.widget.HorizontalScrollView;
import i2b.a;
import com.kwai.component.tabs.panel.TabsPanelHostFragment$f;

public class TabsPanelHostFragment extends TabHostFragment implements g2$a	// class@000b6f
{
    public List B;
    public List C;
    public Object D;
    public boolean E;
    public a$a F;
    public r0 G;
    public t0 H;
    public TabsPanelConfig I;
    public o0 J;
    public u0 K;
    public View L;
    public c M;
    public c N;
    public c O;
    public View P;
    public boolean Q;
    public boolean R;
    public ViewPager$l S;
    public final c T;
    public final c$f U;
    public static final int V;

    public void TabsPanelHostFragment(){
       super();
       this.B = new ArrayList();
       this.C = new ArrayList();
       this.D = new Object();
       this.G = new r0();
       this.I = null;
       this.J = new c0();
       this.K = TabsPanelConfig.a();
       this.M = a.g();
       this.N = a.g();
       this.O = PublishSubject.g();
       this.Q = false;
       this.R = true;
       this.S = new TabsPanelHostFragment$a(this);
       this.T = new c();
       this.U = new TabsPanelHostFragment$b(this);
    }
    public int Ah(){
       return this.K.c;
    }
    public PresenterV2 B2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, TabsPanelHostFragment.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.Vh()) {
          PatchProxy.onMethodExit(TabsPanelHostFragment.class, "14");
          return new PresenterV2();
       }else {
          obj = new PresenterV2();
          Iterator iterator = this.B.iterator();
          while (iterator.hasNext()) {
             h oh = iterator.next();
             Objects.requireNonNull(oh);
             Object[] objArray1 = PatchProxy.apply(objArray, oh, h.class, "1");
             if (objArray1 != patchProxyRe) {
             }else {
                oh = oh.h;
                objArray1 = (oh == null)? objArray: oh.a();
             }
             if (objArray1 != null) {
                obj.U7(objArray1);
             }
          }
          TabsPanelHostFragment tI = this.I;
          if (tI != null) {
             TabsPanelConfig b = tI.b;
             if (b != null) {
                obj.U7(b.a(tI));
             }
          }
          tI = this.I;
          if (tI != null && (tI.b() == TabsPanelConfig$Style.STYLE1 || this.I.b() == TabsPanelConfig$Style.STYLE2)) {
             obj.U7(new c());
          }
          if (!this.B.isEmpty()) {
             obj.U7(new e());
          }
          PatchProxy.onMethodExit(TabsPanelHostFragment.class, "14");
          return obj;
       }
    }
    public int Bh(){
       return this.K.b;
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment.class, "3")) {
          return;
       }
       if (c.b) {
          this.v = new b(this.getActivity(), this.getChildFragmentManager());
       }else {
          super.Ch();
       }
       return;
    }
    public final b0 Qh(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabsPanelHostFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TabsPanelHostFragment$g(this, p0);
    }
    public final Interpolator Rh(){
       b obj = PatchProxy.apply(null, this, TabsPanelHostFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       b uob = obj;
       uob.a(0, 0, 0.11f, 0, 0.30f, 0x3ecdd2f2, 0.46f, 0x3f19999a);
       uob.a(0.46f, 0x3f19999a, 0x3f147ae1, 0x3f6bc6a8, 0x3f1f7cee, 0x3f78d4fe, 0x3f800000, 0x3f800000);
       return obj;
    }
    public final boolean Sh(){
       Object obj = PatchProxy.apply(null, this, TabsPanelHostFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.I.r != null && c.a())? true: false;
       return b;
    }
    public final e0 Th(){
       e a;
       TabsPanelConfig obj = PatchProxy.apply(null, this, TabsPanelHostFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I.e;
       if (obj == null) {
          if (this.Sh()) {
             return f.a;
          }else {
             a = e.a;
          }
       }
       return a;
    }
    public boolean Uh(){
       Object obj = PatchProxy.apply(null, this, TabsPanelHostFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.T.c();
    }
    public boolean Vh(){
       boolean b = (this.I == null)? true: false;
       return b;
    }
    public void Wh(int p0,int p1,int p2,float p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(TabsPanelHostFragment.class)) {
          Object[] objArray = new Object[5];
          objArray[i] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, TabsPanelHostFragment.class, "21")) {
             return;
          }
       }
       TabsPanelHostFragment tC = this.C;
       if (tC != null) {
          Iterator iterator = tC.iterator();
          while (iterator.hasNext()) {
             iterator.next().wd(p0, p1, p2, p3, p4);
          }
       }
       TabsPanelHostFragment tH = this.H;
       if (tH != null) {
          tH.wd(p0, p1, p2, p3, p4);
       }
       while (i < this.v.j()) {
          if (this.v.a(i) instanceof t0) {
             this.v.a(i).wd(p0, p1, p2, p3, p4);
          }
          i = i + 1;
       }
       return;
    }
    public final void Xh(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment.class, "23")) {
          return;
       }
       TabsPanelConfig d = this.I.d;
       int i = (d == null)? this.J.a(this.B, this.G): d.a(this.B, this.G);
       if (i < 0) {
          i = 0;
       }
       TabHostFragment tu = this.u;
       if (tu != null) {
          tu.setCurrentItem(i);
       }else {
          this.Mh(i);
       }
       return;
    }
    public void Yh(int p0){
       if (PatchProxy.isSupport(TabsPanelHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabsPanelHostFragment.class, "9")) {
          return;
       }
       if (this.t.getTabsContainer() != null && this.t.getTabsContainer().getChildCount()) {
          int i = 0;
          while (i < this.t.getTabsContainer().getChildCount()) {
             TextView childAt = this.t.getTabsContainer().getChildAt(i);
             if (childAt != null) {
                if (i == p0) {
                   childAt.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f71));
                   childAt.setSelected(true);
                   childAt.invalidate();
                }else {
                   childAt.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f70));
                   childAt.setSelected(0);
                   childAt.invalidate();
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void Zh(List p0){
       this.C = p0;
    }
    public void ai(a$a p0){
       this.F = p0;
    }
    public void bi(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment.class, "17")) {
          return;
       }
       if (this.Vh()) {
          return;
       }
       if (this.T.c()) {
          if (this.Sh()) {
             this.T.g(320, this.Rh());
          }else {
             this.T.f();
          }
          if (f.b(this.requireActivity()) && this.requireActivity().getWindow() != null) {
             i5.j(this.requireActivity().getWindow(), 0xff000000);
          }
       }
    label_0053 :
       return;
    }
    public void ci(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment.class, "16")) {
          return;
       }
       if (this.Vh()) {
          return;
       }
       if (!this.T.c()) {
          if (p0 != null) {
             this.G = p0;
          }
          this.Xh();
          if (this.Sh()) {
             this.T.i(320, this.Rh());
          }else {
             this.T.h();
          }
          if (f.b(this.requireActivity()) && (this.requireActivity().getWindow() != null && this.getView() != null)) {
             i5.j(this.requireActivity().getWindow(), j.d(this.getView(), R.color.arg_RES_7f0617b3));
          }
       }
    label_0068 :
       return;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TabsPanelHostFragment.class, "8")) {
          return;
       }
       super.fh(p0, p1);
       if (this.Vh()) {
          return;
       }
       TabHostFragment tt = this.t;
       boolean b = (this.v.j() > 1)? true: false;
       tt.v(b);
       if (this.v.j() > 1) {
          this.t.setOnPageChangeListener(new TabsPanelHostFragment$c(this));
       }
       this.Xh();
       View view = p0.findViewById(this.K.d);
       if (view != null) {
          view.setOnClickListener(new TabsPanelHostFragment$d(this));
          if (this.I.h != null) {
             p0.setOnTouchListener(new f0(p0));
             p0.setOnClickListener(new TabsPanelHostFragment$e(this));
          }
       }
       TabsPanelConfig j = this.I.j;
       if (j > null) {
          this.u.setOffscreenPageLimit(j);
       }
       this.P = p0.findViewById(0x7f0a3cba);
       this.u.addOnPageChangeListener(this.S);
       ViewStub viewStub = p0.findViewById(this.K.a());
       if (viewStub != null) {
          viewStub.setOnInflateListener(new g0(this));
       }
       tt = this.u;
       if (tt instanceof NestedScrollSafeViewPager) {
          tt.setDefaultSwitchItemNoAnimation(this.I.m);
       }
       p0.setBackgroundColor(this.I.o);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d15aa;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.Vh()) {
          return;
       }
       o oo = new o();
       oo.c = this;
       oo.b = this.t.getTabsContainer();
       oo.d = this.B;
       oo.e = this.u;
       oo.f = this.K;
       oo.g = this.L;
       oo.h = this.M;
       oo.i = this.I;
       h oh = null;
       oo.k = this.Qh(oh);
       oo.j = this.O;
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = oo;
       int i1 = 1;
       objArray[i1] = this.D;
       new g2(this, this).b(objArray);
       TabsPanelHostFragment tT = this.T;
       e0 uoe0 = this.Th();
       TabsPanelConfig f = this.I.f;
       if (f == null) {
          f = j0.a;
       }
       Objects.requireNonNull(tT);
       if (!PatchProxy.applyVoidThreeRefs(this, uoe0, f, tT, c.class, "1")) {
          tT.a = this.getActivity();
          tT.m = uoe0;
          tT.n = f;
          TabsPanelNestedParentRelativeLayout tabsPanelNes = this.getView().findViewById(R.id.content_nest);
          tT.b = tabsPanelNes;
          tabsPanelNes.getLayoutParams().height = tT.m.a(tT.a);
          tT.b.setOffsetFromInitPosition(tT.m.a(tT.a));
          tT.b.setOnDragListener(new b(tT));
          tT.b.setOnTopChangeListener(new n(tT));
          tT.k();
          tT.b.addOnLayoutChangeListener(tT.q);
          tT.b.requestLayout();
          if (!PatchProxy.applyVoid(oh, tT, c.class, "6")) {
             tT.i.put(Integer.valueOf(i1), new h(tT));
             tT.i.put(Integer.valueOf(i), new i(tT));
             tT.i.put(Integer.valueOf(3), new j(tT));
             tT.i.put(Integer.valueOf(4), new k(tT));
          }
          tT.j = 0;
          if (!PatchProxy.applyVoid(oh, tT, c.class, "11")) {
             c f1 = tT.f;
             if (f1 != null) {
                f1.run();
             }
             tT.f = oh;
          }
       }
       this.T.e(this.U);
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment.class, "24")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (b.g() && this.T != null) {
          if (b.c()) {
             TabsPanelHostFragment tF = this.F;
             if (tF != null) {
                tF.onPanelCloseEvent(3);
             }
          }
          TabsPanelHostFragment tT = this.T;
          e0 uoe0 = this.Th();
          h0 oh0 = new h0(this, p0, 2);
          Objects.requireNonNull(tT);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(2), uoe0, oh0, tT, c.class, "2")) {
             tT.m = uoe0;
             if (tT.b != null) {
                tT.k();
                p0.height = tT.m.a(tT.a);
                tT.b.requestLayout();
                tT.b.post(new l(tT, 2, oh0));
             }
          }
       }
    label_0078 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelHostFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.Vh()) {
          this.K = TabsPanelConfig.a();
          e uoe = this.getFragmentManager().beginTransaction();
          uoe.u(this);
          uoe.m();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TabsPanelHostFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I.q == null) {
          p0 = l.x(p0);
       }
       View view = super.onCreateView(p0, p1, p2);
       ViewStub viewStub = view.findViewById(R.id.tabs_panel_container_stub);
       viewStub.setLayoutResource(this.K.a);
       this.L = viewStub.inflate();
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, TabsPanelHostFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       if (this.Vh()) {
          return;
       }
       TabsPanelHostFragment tT = this.T;
       Objects.requireNonNull(tT);
       boolean b = false;
       if (!PatchProxy.applyVoid(null, tT, c.class, "8")) {
          tT.f = null;
          c g = tT.g;
          if (g != null) {
             g.cancel();
          }
          g = tT.h;
          int i = 1;
          if (g != null) {
             if (!PatchProxy.applyVoid(null, g, c$e.class, "2")) {
                g.e = i;
                g.b.removeOnPreDrawListener(g);
             }
             tT.h = null;
          }
          tT.l = b;
          if (tT.c != null) {
             int i1 = tT.j + i;
             c uoc = 4;
             while (i1 <= uoc) {
                if (i1 == uoc) {
                   tT.c.u(n.j(tT.a), tT.m.a(tT.a), n.j(tT.a), 0, 1);
                }
                tT.d(i1);
                i1 = i1 + 1;
             }
          }
          tT.a = null;
          g = tT.b;
          if (g != null) {
             g.setOnTopChangeListener(null);
             tT.b.removeOnLayoutChangeListener(tT.q);
          }
          tT.b = null;
       }
       this.T.e(null);
       this.E = b;
       this.u.removeOnPageChangeListener(this.S);
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          h oh = iterator.next();
          if (oh.c() != null) {
             oh.c().b = null;
          }
       }
       return;
    }
    public LayoutInflater onGetLayoutInflater(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabsPanelHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.I.p != null) {
          return super.onGetLayoutInflater(p0).cloneInContext(new ContextThemeWrapper(this.getContext(), this.I.p));
       }
       return super.onGetLayoutInflater(p0);
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(TabsPanelHostFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TabsPanelHostFragment.class, "11")) {
          return;
       }
       TabsPanelHostFragment tT = this.T;
       Objects.requireNonNull(tT);
       if (!PatchProxy.applyVoid(null, tT, c.class, "17") && tT.l != null) {
          tT.h();
       }
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, TabsPanelHostFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Vh()) {
          return new ArrayList();
       }
       obj = new ArrayList();
       Iterator iterator = this.B.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(obj1.g(), a.d(this.zh().getContext(), obj1.b, this.zh().getTabsContainer(), false));
          int i = this.I.m ^ 0x01;
          uod.g(i);
          b0 uob0 = this.Qh(obj1);
          if (obj1.c() != null) {
             obj1.c().b = uob0;
          }
          TabsPanelHostFragment$f uof = new TabsPanelHostFragment$f(this, uod, obj1.a, obj1.c, obj1);
          obj.add(uob0);
       }
       return obj;
    }
}
