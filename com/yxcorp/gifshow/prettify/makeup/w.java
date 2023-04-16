package com.yxcorp.gifshow.prettify.makeup.w;
import erd.g;
import com.yxcorp.gifshow.prettify.makeup.y;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xyb.a;
import java.lang.String;
import p0c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.prettify.makeup.j;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import f1c.d0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import f1c.w0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.StringBuilder;
import w46.b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.yxcorp.gifshow.prettify.makeup.i;
import f1c.i1;
import android.widget.LinearLayout;
import t16.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import f1c.c2;
import l16.b;
import java.lang.Boolean;
import p0c.e;
import oe6.e;
import q87.c;
import java.lang.Integer;
import g9c.a;
import f1c.e;
import p0c.f$c;
import android.view.View;
import com.yxcorp.gifshow.prettify.makeup.d;

public final class w implements g	// class@00119e
{
    public final y b;

    public void w(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y m;
       y d;
       w b = this.b;
       m om = p0;
       Objects.requireNonNull(b);
       boolean i = 0;
       Object[] objArray = new Object[i];
       a.D().E("MakeupPresenter", "[makeup][keypath][data] ", "initMakeupModel finish", objArray);
       y q = b.q;
       om.g = q.t;
       q.s = om;
       b.X8();
       Object[] objArray1 = null;
       List list = PatchProxy.apply(objArray1, om, m.class, "20");
       if (list != PatchProxyResult.class) {
       }else {
          m c = om.c;
          list = (c != null)? c.getGroupInfos(): objArray1;
       }
       int i1 = 1;
       int i2 = q.f(list) ^ i1;
       b.K = i2;
       if (i2) {
          if (!PatchProxy.applyVoid(objArray1, b, y.class, "16")) {
             m = b.R;
             if (m == null || (m.getVisibility() && b.N != null)) {
                m = b.R;
                if (m != null) {
                   m.setVisibility(i);
                }
                b.N.setAdapter(b.P);
                b.N.setLayoutManager(new LinearLayoutManager(b.getContext(), i, i));
                j oj = new j(b.A, b.D, b.N, b.P, b.p);
                b.M = m;
                b.A.n();
                m = b.Q;
                if (m != null) {
                   m.setOnClickListener(new w0(b));
                }
             }
          }
       label_00b0 :
          b.O.clear();
          b.O.addAll(list);
       }else {
          b.O.clear();
          q = b.R;
          if (q != null) {
             q.setVisibility(8);
          }
       }
       b.L.clear();
       b.L.addAll(om.j());
       b.D.r1(b.q.m(), b.K, b.L);
       b.a9();
       MakeupSuite makeupSuite = b.D.m1();
       b.d9(makeupSuite);
       m = b.M;
       if (m != null) {
          m.a(makeupSuite, i1);
       }
       String str = "guide wrong materialId ";
       if (b.q.e()) {
          Object obj = om.j().get(i1);
          int i3 = b.D.j1(obj);
          if (i3 < 0) {
             objArray = new Object[0];
             a.D().t("MakeupPresenter", str+b.q.i, objArray);
          }else {
             List list1 = i.k(obj);
             if (q.f(list1)) {
                b.A.m(i3);
                b.D.u1(i3);
             }else {
                i1 oi1 = new i1(b, i3);
                i1 oi11 = oi1;
                i1 oi12 = oi1;
                List list2 = list1;
                if (!PatchProxy.applyVoidThreeRefs(obj, list1, oi11, b, y.class, "21")) {
                   b.b9();
                   b.Y8();
                   b.Y8();
                   b.A.setVisibility(8);
                   i.f(new a(c2.d(b.q.h()), "inner_resource"), obj, false, list2, oi12);
                }
             }
             makeupSuite = obj;
          label_0189 :
             e obj1 = PatchProxy.apply(null, b, y.class, "22");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.booleanValue();
             }else {
                obj1 = b.q.d();
                if (obj1 == null || (obj1.c() == 3 && e.M())) {
                   i2 = b.D.j1(new MakeupSuite(String.valueOf(obj1.a())));
                   if (i2 < 0) {
                      Object[] objArray2 = new Object[0];
                      a.D().A("MakeupPresenter", str+obj1.a(), objArray2);
                   }else {
                      b.A.m(i2);
                      if (obj1.b() && i2 != b.D.n1()) {
                         d = b.D;
                         Objects.requireNonNull(d);
                         b0 uob0 = b0.class;
                         if (!PatchProxy.isSupport(uob0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), d, uob0, "16")) {
                            MakeupSuite makeupSuite1 = d.N0(i2);
                            boolean b1 = i.o(makeupSuite1);
                            if (q.f(i.k(makeupSuite1)) && b1) {
                               d.t1(i2);
                            }else {
                               d.j = i2;
                               d.m0(i2, Boolean.FALSE);
                            }
                         }
                      }
                      e.A0(false);
                      i = true;
                   }
                }
                i = false;
             }
             if (!i) {
                b.A.m(b.D.n1());
             }
             b.I.d(makeupSuite);
             if (!PatchProxy.applyVoid(null, b, y.class, "32") && b.z != null) {
                if (!b.q.j().a()) {
                   b.z.setVisibility(8);
                }else {
                   b.z.setSelected(d.a().b(b.q.h()).m());
                }
             }
          }
       }else {
          goto label_0189 ;
       }
       return;
    }
}
