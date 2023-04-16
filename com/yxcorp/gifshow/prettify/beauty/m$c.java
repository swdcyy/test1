package com.yxcorp.gifshow.prettify.beauty.m$c;
import q0c.z1;
import com.yxcorp.gifshow.prettify.beauty.m;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xyb.a;
import q87.c;
import android.view.View;
import com.yxcorp.gifshow.prettify.makeup.e0;
import s0c.d;
import java.util.Objects;
import q0c.j2;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t;
import com.yxcorp.gifshow.prettify.beauty.w;
import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import u0c.a;
import q0c.w0;
import java.lang.Runnable;
import ekd.k1;
import h16.k;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import q0c.v0;
import q0c.x0;
import q0c.u0;

public class m$c implements z1	// class@001111
{
    public BeautifyConfig a;
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void a(BeautyFilterItem p0,BeautifyConfig p1){
       this.a = p1;
    }
    public void b(){
       m l;
       List list;
       if (PatchProxy.applyVoid(null, this, m$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("BeautifyPresenter", "beauty item list onBackBtnClick", objArray);
       m$c tb = this.b;
       int i1 = 1;
       tb.H = i1;
       tb.I = "";
       e0.b(tb.r, tb.p);
       tb = this.b;
       tb.B.x1(tb.w);
       tb = this.b;
       int i2 = 2;
       if (tb.J == i2) {
          l = tb.L;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoid(null, l, j2.class, "5")) {
             j2 m = l.m;
             if (m != null) {
                View[] viewArray = new View[i2];
                viewArray[i] = l.b;
                j2 e = l.e;
                if (e == null) {
                   a.S("mResetViewLayout");
                }
                viewArray[i1] = e;
                list = CollectionsKt__CollectionsKt.L(viewArray);
                List list1 = t.k(m);
                e = l.i;
                if (e == null) {
                   a.S("mBeautyPartsTabAdapter");
                }
                e.X0(i);
                e0.c(list, l.b, null, m, list1);
                j2 j = l.j;
                if (j != null) {
                   j.f();
                }
             }
          }
       }
       this.b.M.clear();
       this.b.c9();
       this.b.W8();
       l = this.b.E;
       if (l != null) {
          l.k0();
       }
       return;
    }
    public void c(BeautyFilterItem p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$c.class, "3")) {
          return;
       }
       m$c tb = this.b;
       m w = tb.w;
       if (w != null) {
          m b = tb.B;
          if (b != null) {
             b.F(w, p0);
          }
       }
       return;
    }
    public void d(BeautyFilterItem p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$c.class, "2")) {
          return;
       }
       if (p0.getItemId() == -1 || p0.getItemId() == -2) {
          this.b.w.copyFilterValue(p1);
          this.b.C.j(p1);
       }
       p1.I = p0.getLoggerName();
       k1.r(new w0(this, p0), 10);
       m$c tb = this.b;
       if (tb.J == 2) {
          m l = tb.L;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoidOneRefs(p0, l, j2.class, "3")) {
             a.p(p0, "item");
             j2 l1 = l.l;
             if (l1 != null) {
                int i = l1.a(p0.getItemId());
                l1 = l.c;
                if (l1 == null) {
                   a.S("mBeautyPartsTabList");
                }
                l1.x(i);
                j2 i1 = l.i;
                if (i1 == null) {
                   a.S("mBeautyPartsTabAdapter");
                }
                i1.X0(i);
             }
          }
       }
       return;
    }
    public void e(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "6")) {
          return;
       }
       m w = this.b.w;
       if (w != null) {
          w.copyFilterValue(p0);
          this.b.C.j(p0);
          p0.I = "";
          k1.r(new v0(this), 10);
       }
       return;
    }
    public void f(BeautyFilterItem p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$c.class, "5")) {
          return;
       }
       this.b.w.copyFilterValue(p1);
       this.b.C.j(p1);
       k1.r(new x0(this, p0), 10);
       return;
    }
    public void g(BeautyFilterItem p0,BeautifyConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$c.class, "4")) {
          return;
       }
       this.b.w.copyFilterValue(p1);
       this.b.C.k(p1, false);
       k1.r(new u0(this), 10);
       return;
    }
}
