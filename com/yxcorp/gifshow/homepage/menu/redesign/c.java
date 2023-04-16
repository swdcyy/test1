package com.yxcorp.gifshow.homepage.menu.redesign.c;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import wkd.b;
import fo5.b;
import tta.h;
import xl8.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.menu.redesign.c$a;
import com.yxcorp.gifshow.homepage.menu.redesign.c$b;
import com.yxcorp.gifshow.homepage.menu.redesign.c$c;
import sta.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import java.util.List;
import android.view.View;
import tta.g;
import com.kwai.component.menudot.b;
import nc5.c;
import brd.t;
import tta.i;
import erd.g;
import crd.b;
import tta.j;
import wh5.c;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import qta.f0;
import tta.d;
import lnc.a1;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import tta.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import tta.f;
import androidx.recyclerview.widget.RecyclerView$l;
import fo5.c;
import com.yxcorp.gifshow.homepage.menu.redesign.b;
import androidx.core.widget.NestedScrollView$b;
import androidx.core.widget.NestedScrollView;
import tta.o;
import java.lang.Runnable;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.m;
import java.util.BitSet;
import uv8.n0;
import brd.y;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.gifshow.homepage.menu.redesign.c$d;
import android.view.View$OnClickListener;
import tta.n;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.homepage.menu.a;
import com.yxcorp.gifshow.homepage.menu.g;
import mrd.c;

public class c extends PresenterV2 implements g	// class@001782
{
    public g A;
    public a B;
    public b C;
    public c D;
    public f0 E;
    public List F;
    public b G;
    public final b H;
    public final c I;
    public d J;
    public View$OnClickListener K;
    public c L;
    public BitSet M;
    public final b N;
    public a O;
    public final Runnable P;
    public final Runnable Q;
    public int p;
    public View q;
    public View r;
    public KwaiImageView s;
    public SizeAdjustableTextView t;
    public View u;
    public TextView v;
    public NestedScrollView w;
    public RecyclerView x;
    public o y;
    public a z;

    public void c(){
       super();
       this.H = b.a(0xad3151d);
       this.I = new h(this);
       this.N = new b(Boolean.FALSE);
       this.O = new c$a(this);
       this.P = new c$b(this);
       this.Q = new c$c(this);
       this.U7(new g());
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          String str = this.H.o();
          if (!TextUtils.x(str)) {
             this.v.setText(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "14")) {
          if (HomeExperimentManager.a()) {
             this.p = this.H.q().size();
          }else if(this.H.m()){
             this.p = this.H.m();
          }else {
             this.p = 6;
          }
       }
       if (HomeExperimentManager.a()) {
          this.r.setVisibility(8);
       }
       this.D = new g(this);
       b.a(0x34c80eb4).r(1107, this.D);
       this.R8();
       this.X7(this.N.observable().subscribe(new i(this)));
       this.X7(this.C.observable().subscribe(new j(this)));
       if (c.b()) {
          this.q.setVisibility(8);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoc, "8")){
          uoc = this.J;
          if (uoc != null) {
             this.x.removeItemDecoration(uoc);
          }
          ViewGroup$MarginLayoutParams layoutParams = this.x.getLayoutParams();
          layoutParams.leftMargin = this.E.c(this.getActivity());
          layoutParams.rightMargin = this.E.c(this.getActivity());
          this.x.setLayoutParams(layoutParams);
          d uod = new d(this.E.b(this.getActivity()), a1.e(19.00f));
          this.J = uod;
          this.x.addItemDecoration(uod);
          this.x.setLayoutManager(new GridLayoutManager(this.getContext(), 3));
          k ok = new k(this, false);
          this.y = ok;
          ok.G0(true);
          this.x.setAdapter(this.y);
          this.x.setItemAnimator(new f((this.E.e(this.getActivity()) * 2)));
       }
       this.P8();
       this.H.j(this.I);
       this.w.setOnScrollChangeListener(b.b);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       c ty = this.y;
       if (ty != null) {
          ty.onDestroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.H.p(this.I);
       b.a(0x34c80eb4).s(1107, this.D);
       this.w.removeCallbacks(this.P);
       this.w.removeCallbacks(this.Q);
       return;
    }
    public void P8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          return;
       }
       ArrayList uArrayList = new ArrayList(this.H.q());
       int i = 8;
       if (q.f(uArrayList)) {
          this.q.setVisibility(i);
       }else {
          this.q.setVisibility(0);
       }
       if (!q.f(uArrayList)) {
          c tr = this.r;
          if (uArrayList.size() > this.p) {
             i = 0;
          }
          tr.setVisibility(i);
       }
       if (!q.f(uArrayList) && (uArrayList.size() <= this.p || this.N.a().booleanValue())) {
          this.y.r1(uArrayList);
          if (!HomeExperimentManager.a() && !PatchProxy.applyVoid(objArray, this, uoc, "16")) {
             this.w.post(this.Q);
          }
       }else {
          this.y.r1(uArrayList.subList(0, this.p));
          if (!PatchProxy.applyVoid(objArray, this, uoc, "15")) {
             this.w.post(this.P);
          }
       }
       return;
    }
    public void R8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       GifshowActivity obj = PatchProxy.apply(objArray, this, uoc, "6");
       int i = 1107;
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): b.a(0x34c80eb4).i(i);
       int i1 = 1028;
       if (b && !c.b()) {
          this.u.setVisibility(0);
          obj = this.getActivity();
          c tu = this.u;
          int i2 = 0;
          if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(obj, tu, Boolean.FALSE, null, m.class, "8")) {
             int[] ointArray = new int[]{46};
             m.l(obj, tu, String.valueOf(i), 1, true, i2, 1, ointArray);
          }
          uoc = this.M;
          if (uoc != null) {
             uoc.set(i1);
          }
       }else {
          n0.a(this.u);
          this.u.setVisibility(8);
          uoc = this.M;
          if (uoc != null) {
             uoc.clear(i1);
          }
       }
       uoc = this.L;
       if (uoc != null) {
          c tM = this.M;
          if (tM != null) {
             uoc.onNext(tM);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a2f49);
       this.q = p0.findViewById(0x7f0a2f4a);
       this.w = p0.findViewById(0x7f0a2ae1);
       this.r = p0.findViewById(0x7f0a0935);
       this.s = p0.findViewById(0x7f0a1321);
       this.t = p0.findViewById(0x7f0a3f5f);
       this.u = p0.findViewById(0x7f0a2e7f);
       this.v = p0.findViewById(0x7f0a2f4b);
       this.r.setOnClickListener(new c$d(this, false, 400));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new n());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.z = this.r8("HOME_MENU_CLOSE_HELPER");
       this.A = this.r8("HOME_MENU_LOGGER_V3");
       this.F = this.r8("HOME_PANEL_SLIDE_LISTENERS");
       this.E = this.r8("MENU_LAZY_DATA");
       this.C = this.r8("HOME_SLIDE_PANEL_STATE");
       this.G = this.r8("MENU_EDITOR_OPEN_STATE");
       this.L = this.t8("MENU_RED_DOT_SUBJECT");
       this.M = this.t8("MENU_RED_DOT_BIT_SET");
       return;
    }
}
