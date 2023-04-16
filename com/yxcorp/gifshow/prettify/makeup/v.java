package com.yxcorp.gifshow.prettify.makeup.v;
import f1c.e;
import f1c.d;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.utility.n;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.makeup.q;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.prettify.makeup.p;
import java.lang.Iterable;
import ok.o;
import qk.y;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.widget.RecycleViewWithIndicator;
import com.yxcorp.gifshow.prettify.makeup.r;
import android.view.View$OnClickListener;
import android.animation.Animator;
import com.yxcorp.gifshow.prettify.makeup.e0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.yxcorp.gifshow.prettify.makeup.v$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.prettify.makeup.v$c;
import p0c.f;
import p0c.f$c;
import android.view.ViewGroup;
import java.lang.Boolean;
import com.yxcorp.gifshow.prettify.makeup.v$a;
import hka.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.prettify.makeup.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.u;
import f1c.q0;
import com.yxcorp.gifshow.prettify.makeup.v$d;

public class v implements e	// class@00119d
{
    public ScrollToCenterRecyclerView a;
    public View b;
    public View c;
    public q d;
    public RecycleViewWithIndicator e;
    public final d f;
    public View g;
    public View h;
    public Animator i;
    public Animator j;
    public final List k;

    public void v(d p0){
       super();
       this.k = new ArrayList();
       this.f = p0;
    }
    public void a(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "18")) {
          Iterator iterator = this.k.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             Pair first = pair.first;
             pair = pair.second;
             if (first != null && pair != null) {
                first.getViewTreeObserver().removeOnGlobalLayoutListener(pair);
             }
          }
          this.k.clear();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.a.scrollToPosition(0);
       this.c.setVisibility(4);
       this.g.setVisibility(4);
       n.Y(this.f.m(), 0, true);
       return;
    }
    public MakeupPart c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       v obj = PatchProxy.apply(objArray, this, v.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, q.class, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.N0(obj.j);
       }
       return obj1;
    }
    public void d(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "8")) {
          return;
       }
       v td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(p0, td, q.class, "4")) {
          List parts = p0.getParts();
          y.q(parts, p.b);
          td.W0(parts);
          td.Z0(p0);
       }
       return;
    }
    public void doBindView(View p0){
       v ov = v.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ov, "9")) {
          return;
       }
       ViewStub viewStub = m1.f(p0, R.id.makeup_tabs_container_stub);
       if (viewStub != null) {
          viewStub.inflate();
       }
       this.a = m1.f(p0, 0x7f0a31c8);
       View view = m1.f(p0, R.id.prettify_tabs_container);
       this.c = view;
       view.bringToFront();
       this.e = m1.f(p0, 0x7f0a31c7);
       this.g = m1.f(p0, 0x7f0a31c3);
       this.h = m1.f(p0, 0x7f0a31c4);
       this.b = m1.f(p0, 0x7f0a31c2);
       if (!PatchProxy.applyVoid(null, this, ov, "16")) {
          v tg = this.g;
          if (tg != null) {
             tg.setOnClickListener(new r(this));
          }
       }
       return;
    }
    public void e(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "4")) {
          return;
       }
       this.a.scrollToPosition(0);
       if (this.f.m() != null) {
          v ti = this.i;
          if (ti != null && ti.isRunning()) {
             this.i.cancel();
          }
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          uArrayList.add(this.f.m());
          uArrayList1.add(this.c);
          if (this.c.findViewById(0x7f0a31c3) == null) {
             uArrayList1.add(this.g);
          }
          this.i = e0.e(uArrayList, this.f.m(), null, this.c, uArrayList1);
          this.d.Y0(this.c());
       }else {
          this.c.setVisibility(0);
       }
       this.d.k0();
       this.g.setVisibility(0);
       this.q();
       return;
    }
    public void f(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "7")) {
          return;
       }
       v ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.cancel();
       }
       ti = this.j;
       if (ti != null && ti.isRunning()) {
          this.j.cancel();
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       uArrayList.add(this.c);
       if (this.c.findViewById(0x7f0a31c3) == null) {
          uArrayList.add(this.g);
          i = 1;
       }else {
          i = 0;
       }
       uArrayList1.add(this.f.m());
       this.i = e0.c(uArrayList, this.c, objArray, this.f.m(), uArrayList1);
       uArrayList = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       uArrayList.add(this.f.n().getGoBackBtn());
       uArrayList.add(this.f.n().getFilterItemList());
       uArrayList2.add(this.f.c());
       Animator uAnimator = e0.c(uArrayList, this.f.n(), this.f.n().f, this.f.g(), uArrayList2);
       this.j = uAnimator;
       if (i) {
          uAnimator.addListener(new v$b(this));
       }
       if (this.f.d()) {
          this.j.addListener(new v$c(this));
       }
       if (this.f.b().j().a()) {
          n.Y(this.f.o(), 0, 0);
       }
       if (this.f.j() != null && (this.f.j().getVisibility() == 8 && this.f.k())) {
          n.Y(this.f.j(), 0, 0);
       }
    label_0107 :
       return;
    }
    public void g(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "1")) {
          return;
       }
       v tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
       }
       tj = this.i;
       if (tj != null && tj.isRunning()) {
          this.i.cancel();
       }
       n.Y(this.c, 4, false);
       n.Y(this.f.m(), false, false);
       return;
    }
    public void h(){
    }
    public void i(){
    }
    public void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v.class, "5")) {
          return;
       }
       v td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, q.class, "9")) {
          td.m0(td.j, Boolean.FALSE);
       }
       this.q();
       return;
    }
    public void k(MakeupSuite p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "3")) {
          return;
       }
       this.d.Z0(p0);
       return;
    }
    public void l(int[] p0){
    }
    public View m(){
       return this.a;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, v.class, "6")) {
          return;
       }
       this.d = new q(this.f.b(), new v$a(this), this.e);
       this.e.setRecyclerView(this.a);
       this.a.setAdapter(this.d);
       this.a.setLayoutManager(new LinearLayoutManager(this.f.a().getContext(), 0, 0));
       this.p(this.c, new t(this));
       this.p(this.f.n().f, new u(this));
       this.d.l = new q0(this);
       return;
    }
    public final boolean o(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       v obj = PatchProxy.apply(objArray, this, v.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, q.class, "8");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             MakeupSuite makeupSuite = obj.X0();
             b1 = (makeupSuite == null || makeupSuite.inPresetState(obj.g.a()))? true: false;
          }
          if (!b1) {
          label_0047 :
             return b;
          }
       }
       b = true;
       goto label_0047 ;
    }
    public final void p(View p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "19")) {
          return;
       }
       if (p0 != null) {
          if (p0.getWidth() > 0 && p0.getHeight() > 0) {
             p1.run();
             return;
          }else {
             v$d uod = new v$d(this, p0, p1);
             p0.getViewTreeObserver().addOnGlobalLayoutListener(uod);
             if (!PatchProxy.applyVoidTwoRefs(p0, uod, this, v.class, "17")) {
                this.k.add(new Pair(p0, uod));
             }
          }
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, v.class, "15")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       v th = this.h;
       float f = 0x3f333333;
       float f1 = (this.o())? 0x3f051eb8: 0x3f333333;
       th.setAlpha(f1);
       th = this.b;
       if (!this.o()) {
          f = 0x3f733333;
       }
       th.setAlpha(f);
       this.g.setEnabled((this.o() ^ 0x01));
       return;
    }
}
