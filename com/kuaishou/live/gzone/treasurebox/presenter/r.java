package com.kuaishou.live.gzone.treasurebox.presenter.r;
import f37.b0;
import com.kuaishou.live.gzone.treasurebox.presenter.r$a;
import com.kuaishou.live.gzone.treasurebox.presenter.r$b;
import p53.j1;
import com.kuaishou.live.gzone.treasurebox.presenter.r$c;
import tkd.b;
import tkd.d;
import f37.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import r53.a;
import oq5.c;
import oq5.a;
import mq5.h;
import mq5.b;
import m53.b;
import com.kuaishou.live.gzone.treasurebox.presenter.r$d;
import s53.d;
import m53.b$b;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.gzone.treasurebox.presenter.q;
import erd.g;
import crd.b;
import brd.t;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import k67.b;
import android.view.View;
import android.content.Context;
import i2b.a;
import com.kuaishou.live.gzone.treasurebox.i;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import p53.o1;
import android.view.View$OnClickListener;
import lnc.a1;
import p53.n1;
import p53.l1;
import com.kuaishou.live.gzone.treasurebox.presenter.r$e;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import x57.e;
import x57.a;
import n57.a;
import p53.m1;
import com.kwai.live.gzone.treasure.box.bean.PanelVisibilityType;
import r53.b;
import com.kwai.library.widget.popup.common.c;
import java.util.ArrayList;
import k07.f;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import zf6.j;
import android.app.Activity;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a$c;
import u53.a;
import p53.k1;
import k07.h;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import va1.n0;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import java.util.HashMap;
import java.util.Map;
import com.kwai.live.gzone.widget.e;
import y67.g;
import com.kuaishou.live.gzone.treasurebox.presenter.r$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import ekd.m1;
import d61.f0;
import p53.g1;
import p53.h1;
import mrd.a;
import mrd.c;
import y43.a;

public class r extends b0	// class@001c99
{
    public PanelVisibilityType A;
    public a B;
    public PagerSlidingTabStrip$d C;
    public ViewPager D;
    public HorizontalPageIndicator E;
    public View F;
    public View G;
    public View H;
    public TextView I;
    public TextView J;
    public ViewGroup K;
    public ViewGroup L;
    public View M;
    public ViewGroup N;
    public KwaiEmptyStateView O;
    public e P;
    public View Q;
    public b R;
    public ViewPager$i S;
    public i T;
    public a$a U;
    public c V;
    public a W;
    public boolean q;
    public View r;
    public View s;
    public a t;
    public final h u;
    public a v;
    public d w;
    public a x;
    public a y;
    public c z;
    public static String sLivePresenterClassName = "LiveGzoneTreasureSubPanelPresenter";

    public void r(){
       super();
       this.u = new r$a(this);
       this.S = new r$b(this);
       this.V = new j1(this);
       this.W = new r$c(this);
       this.q = true;
       this.U7(d.a(0x6fa7b5d6).D(78));
    }
    public void E8(){
       int b;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "4")) {
          return;
       }
       int i = 0;
       if (this.q != null) {
          this.K.setVisibility(8);
          this.L.setVisibility(i);
       }else {
          this.K.setVisibility(i);
          this.L.setVisibility(8);
       }
       this.v.o.H6(this.V);
       this.v.n.Km(this.u);
       b uob = new b(this.w, this.v, new r$d(this));
       this.R = uob;
       this.D.setAdapter(uob);
       this.D.addOnPageChangeListener(this.S);
       r ty = this.y;
       if (!PatchProxy.applyVoidOneRefs(ty, this, or, "12")) {
          this.X7(ty.subscribe(new q(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "8")) {
          if (this.Q != null) {
             or = this.v;
             Objects.requireNonNull(or);
             Object obj = PatchProxy.apply(objArray, or, a.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a j = or.j;
                b = (j != null)? j.S2(): false;
             }
             if (b) {
                this.Q.setVisibility(8);
             }else {
                this.Q.setVisibility(i);
             }
          }
          if (this.T == null) {
             b = 0x7f0d0bf5;
             ty = this.N;
             if (ty == null) {
                this.N = a.d(this.getContext(), b, objArray, i);
             }else if(!ty.getChildCount()){
                r tN = this.N;
                tN.addView(a.i(tN, b));
                this.N.setVisibility(i);
             }
             i oi = new i();
             this.T = oi;
             oi.f(this.N);
             objArray = new Object[]{this.v,this.V8()};
             this.T.i(objArray);
          }
          this.r.setOnClickListener(new o1(this));
       }
       Objects.requireNonNull(this.v);
       this.m8().setVisibility(8);
       View view = this.m8().findViewById(R.id.live_treasure_box_popup_view);
       if (view != null) {
          Objects.requireNonNull(this.v);
          view.setBackgroundColor(a1.a(R.color.arg_RES_7f061403));
       }
       this.X7(this.x.subscribe(new n1(this)));
       this.X7(this.z.subscribe(new l1(this)));
       Objects.requireNonNull(this.v);
       if (this.B != null) {
          or = this.C;
          if (or != null) {
             r$e uoe = new r$e(this, or.c());
             this.U = uoe;
             this.B.e(uoe);
          }
       }
       a.a().a("LiveGzoneTreasureSubPanelPresenter", this.W);
       this.X7(this.V8().k.subscribe(new m1(this)));
       return;
    }
    public void J8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "11")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, or, "23")) {
          a f = this.v.f;
          boolean b = false;
          if (f != null) {
             f.c(this.A, b);
          }
          or = this.U;
          if (or != null) {
             r tB = this.B;
             if (tB != null) {
                tB.d(or);
             }
          }
          this.v.f.p().r(b);
          this.R = objArray;
          or = this.D;
          if (or != null) {
             or.setAdapter(objArray);
             this.D.removeOnPageChangeListener(this.S);
          }
          or = this.T;
          if (or != null) {
             or.destroy();
             this.T = objArray;
          }
          this.v.o.Q0(this.V);
       }
       or = this.u;
       if (or != null) {
          this.v.n.le(or);
       }
       a.a().b("LiveGzoneTreasureSubPanelPresenter");
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       r tP = this.P;
       if (tP != null) {
          tP.o();
       }
       return;
    }
    public TreasureBoxCommonModel V8(){
       Object obj = PatchProxy.apply(null, this, r.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.f.p();
    }
    public final void W8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "21")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new f(a1.f(R.drawable.arg_RES_7f081385), a1.p(R.string.arg_RES_7f102486)));
       uArrayList.add(new f(j.n(this.getContext(), R.drawable.arg_RES_7f08055a, 0x7f061dc4), a1.p(R.string.arg_RES_7f102488)));
       a$c uoc = a.a(this.getActivity(), uArrayList, p0);
       uoc.y0(new k1(this));
       uoc.C0(a1.e(-12.00f));
       uoc.B0(a1.e(12.00f));
       uoc.A0(1);
       l.c(uoc, R.layout.arg_RES_7f0d059b);
       return;
    }
    public void X8(){
       int i;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "24")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, or, "29") || (this.getActivity() != null && this.C == null)) {
          int b = a.b(this.A);
          this.R.z(b);
          if (b) {
             b = n.j(this.getActivity());
             i = a1.d(R.dimen.arg_RES_7f070804);
             this.J.getLayoutParams().topMargin = a1.e(12.00f);
          }else {
             b = a1.e(354.00f);
             i = n0.f();
             this.J.getLayoutParams().topMargin = a1.e(8.00f);
          }
          this.m8().getLayoutParams().height = b;
          this.m8().getLayoutParams().width = i;
          this.m8().requestLayout();
       }
    label_0082 :
       this.Y8();
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, r.class, "25")) {
          return;
       }
       this.D.setCurrentItem(0);
       this.E.setPageIndex(0);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, r.class, "6")) {
          return;
       }
       a u = this.v.u;
       if (u != null) {
          e uoe = u.a("LiveGzoneBoxHistory", "LiveGzoneTurntableHistory", new HashMap(), false, false);
          this.P = uoe;
          if (uoe != null) {
             uoe.i0(new r$f(this));
             r tP = this.P;
             tP.Z();
             this.P8(tP);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a1633);
       this.Q = m1.f(p0, 0x7f0a26f0);
       this.E = m1.f(p0, 0x7f0a1634);
       this.F = m1.f(p0, 0x7f0a162b);
       this.I = m1.f(p0, 0x7f0a1f98);
       this.K = m1.f(p0, 0x7f0a1fb9);
       this.L = m1.f(p0, 0x7f0a1631);
       this.r = m1.f(p0, 0x7f0a108d);
       this.s = m1.f(p0, 0x7f0a108e);
       this.G = m1.f(p0, 0x7f0a1f9b);
       this.H = m1.f(p0, 0x7f0a2bfc);
       this.J = m1.f(p0, 0x7f0a1f9a);
       f0.i(this.I, p0.getContext());
       this.G.setOnClickListener(new g1(this));
       this.H.setOnClickListener(new h1(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.v = this.q8(a.class);
       this.w = this.r8("TREASURE_BOX_PANEL_LISTENER");
       this.x = this.r8("TREASURE_BOX_LIST_RESPONSE_SUBJECT");
       this.y = this.r8("TREASURE_BOX_TIPS_STATUS_SUBJECT");
       this.z = this.r8("TREASURE_BOX_SCROLL_TO_TOP_SUBJECT");
       this.A = this.r8("PARAM_PANEL_VISIBILITY_TYPE");
       this.B = this.s8(a.class);
       this.C = this.t8("LIVE_GZONE_TAB");
       this.t = this.q8(a.class);
       return;
    }
}
