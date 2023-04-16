package com.kwai.slide.play.detail.negative.feedback.content.a;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.negative.feedback.content.f;
import java.lang.Object;
import com.kwai.slide.play.detail.negative.feedback.content.g$a;
import java.util.Objects;
import com.kwai.slide.play.detail.negative.feedback.content.l;
import com.kwai.slide.play.detail.negative.feedback.content.h$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.negative.feedback.content.FeedbackAnim;
import es7.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.negative.feedback.content.h$b;
import es7.r;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.negative.feedback.content.c;
import es7.s;
import qp7.d;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import es7.b;
import es7.d;
import qp7.t0;
import com.kwai.slide.play.detail.negative.feedback.content.b;
import es7.a;
import es7.l;
import es7.q;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import com.kwai.slide.play.detail.model.MoreOperationItem;
import java.lang.Integer;
import es7.g;
import es7.j;
import com.kwai.slide.play.detail.negative.feedback.content.e;
import es7.f;
import es7.i;
import es7.h;
import es7.k;
import es7.t;
import es7.w;
import es7.x;
import com.kwai.slide.play.detail.negative.feedback.content.d;
import es7.u;
import es7.m;
import es7.v;
import es7.c;
import es7.e;
import com.kwai.slide.play.detail.negative.feedback.content.h;
import es7.p;
import java.lang.Float;
import lnc.ja;
import android.view.ViewGroup;
import com.kwai.slide.play.detail.negative.feedback.content.l$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.res.Resources;
import android.content.res.Configuration;
import lnc.a1;
import ds7.d;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.slide.play.detail.negative.feedback.content.i;
import com.kwai.slide.play.detail.negative.feedback.content.l$c;
import es7.a0;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import es7.o;
import com.kwai.slide.play.detail.negative.feedback.content.j;
import com.kwai.slide.play.detail.negative.feedback.content.l$b;
import android.view.animation.LinearInterpolator;

public final class a implements Observer	// class@00182f
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       f uof;
       PatchProxyResult patchProxyRe1;
       int i;
       f this;
       int i2;
       int i3;
       l ol1;
       int i4;
       FrameLayout$LayoutParams layoutParams;
       Object obj;
       float f;
       float g;
       l d1;
       float h;
       int i7;
       int i8;
       c this1;
       d this1;
       int i9;
       String str3;
       String str4;
       d obj3;
       Object[] objArray1;
       String str5;
       MoreOperationItem moreOperatio;
       e uoe;
       e uoe1;
       MoreOperationItem moreOperatio1;
       a b = this.b;
       g$a uoa = p0;
       Objects.requireNonNull(b);
       l ol = l.class;
       h$a uoa1 = h$a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (uoa.b() == FeedbackAnim.SHOW) {
          h$a uoa2 = new h$a();
          z oz = z.class;
          uof = f.class;
          if (PatchProxy.applyVoidTwoRefs(uoa2, uoa, b, uof, "4")) {
          label_0047 :
             p0 = ol;
          }else {
             int i5 = 0x7f0820c7;
             if (uoa.x != null) {
                if (PatchProxy.applyVoidTwoRefs(uoa2, uoa, b, uof, "6")) {
                   goto label_0047 ;
                }else if(!uoa.j() && (uoa.m() && (uoa.d() > 0 && uoa.a()))){
                   uoa2.a(new h$b(i5, R.string.arg_RES_7f1036cd, new r(b)));
                   i7 = 1;
                }else {
                   i7 = 0;
                }
                if (uoa.k() && i7 < uoa.d()) {
                   i8 = i7 + 1;
                   c uoc = v3;
                   this1 = v3;
                   p0 = ol;
                   uoc = new c(b, 0, null, new s(b), uoa);
                   if (uoa.l()) {
                      i5 = (uoa.l() && !uoa.h())? true: false;
                      this1.f(i5);
                   }
                   uoa2.a(this1);
                   i7 = i8;
                }else {
                   p0 = ol;
                   i2 = 2;
                }
                if (i7 < uoa.d()) {
                   i7 = i7 + 1;
                   this1 = b.i;
                   Objects.requireNonNull(this1);
                   if (!PatchProxy.applyVoid(null, this1, oz, "40")) {
                      this1.t.onNext(Boolean.TRUE);
                   }
                   uoa2.a(new h$b(R.drawable.arg_RES_7f0820a8, 0x7f10515d, new b(b)));
                }
                if (i7 < uoa.d() && uoa.e()) {
                   b.i.d(uoa.i());
                   i7 = (uoa.i() && !uoa.n())? 0x7f0809de: 0x7f0809dd;
                   uoa2.a(new h$b(i7, R.string.arg_RES_7f10484e, new d(b, uoa)));
                }
             }else {
                p0 = ol;
                if (b.b.s != null) {
                   if (!PatchProxy.applyVoidTwoRefs(uoa2, uoa, b, uof, "5")) {
                      if (uoa.k()) {
                         i8 = 0x7f082097;
                         i9 = 0x7f100f19;
                         b uob = new b(b, 0, 0, new a(b), uoa);
                         if (uoa.l()) {
                            i5 = (uoa.l() && !uoa.h())? true: false;
                            v0.f(i5);
                         }
                         uoa2.a(v0);
                      }else {
                         i9 = 0x7f100f19;
                         i8 = 0x7f082097;
                      }
                      if (uoa.g()) {
                         uoa2.a(new h$b(i8, i9, new l(b)));
                      }else {
                         uoa2.a(new h$b(R.drawable.arg_RES_7f0820e0, i9, new q(b)));
                      }
                   }
                }else {
                   String str1 = 0x7f100f19;
                   String str2 = "提取文案";
                   if (uoa.o != null) {
                      if (!PatchProxy.applyVoidTwoRefs(uoa2, uoa, b, uof, "8") && !q.f(uoa.f())) {
                         this = null;
                         while (this < uoa.f().size()) {
                            MoreOperationItem obj1 = PatchProxy.apply(null, uoa2, uoa1, "2");
                            i7 = (obj1 != patchProxyRe)? obj1.intValue(): uoa2.a.size();
                            if (i7 < uoa.d()) {
                               Object obj2 = uoa.f().get(this);
                               if (obj2 == null) {
                                  str3 = str2;
                               }else if(PatchProxy.isSupport(uof)){
                                  str3 = str2;
                                  obj3 = obj2;
                                  if (!PatchProxy.applyVoidFourRefs(uoa2, uoa, obj2, Integer.valueOf(this), b, f.class, "9")) {
                                  }
                               }else {
                                  str3 = str2;
                                  obj3 = obj2;
                               }
                               patchProxyRe1 = patchProxyRe;
                               str4 = str3;
                               i = 1;
                            label_0372 :
                               this++;
                               patchProxyRe = patchProxyRe1;
                               str2 = str4;
                               obj3 = 2;
                            }
                         }
                      }
                   }else {
                      str4 = str2;
                      patchProxyRe1 = patchProxyRe;
                      g$a d = 0x7f0820c7;
                      i = 1;
                      String str6 = "7";
                      if (PatchProxy.applyVoidTwoRefs(uoa2, uoa, b, uof, str6)) {
                      label_052a :
                         this = b.l;
                         h oh = PatchProxy.apply(null, uoa2, uoa1, str);
                         PatchProxyResult patchProxyRe2 = patchProxyRe1;
                         if (oh != patchProxyRe2) {
                         }else {
                            oh = new h(uoa2);
                         }
                         g$a a = uoa.a;
                         g$a c = uoa.c;
                         d = uoa.d;
                         g$a b1 = uoa.b;
                         p op = new p(b);
                         Objects.requireNonNull(this);
                         int i1 = 5;
                         if (PatchProxy.isSupport(p0)) {
                            Object[] objArray = new Object[]{oh,Float.valueOf(a),Integer.valueOf(c),Integer.valueOf(d),Integer.valueOf(b1),op};
                            i2 = 0;
                            i3 = 3;
                            ol1 = p0;
                            if (!PatchProxy.applyVoid(objArray, this, ol1, "1")) {
                            }
                         }else {
                            ol1 = p0;
                            i2 = 0;
                            i3 = 3;
                            int i6 = 4;
                         }
                      }else if(uoa.y != null && uoa.d() > 0){
                         obj3 = b.i;
                         Objects.requireNonNull(obj3);
                         uoa2.a(new h$b(R.drawable.arg_RES_7f0820cf, 0x7f1015d8, new k(obj3)));
                         i5 = 1;
                      }else {
                         i5 = 0;
                      }
                      if (!uoa.j() && (uoa.m() && (i5 < uoa.d() && uoa.a()))) {
                         i5 = i5 + 1;
                         uoa2.a(new h$b(d, R.string.arg_RES_7f1036cd, new t(b)));
                      }
                   label_03e8 :
                      if (uoa.v != null && i5 < uoa.d()) {
                         i5 = i5 + 1;
                         uoa2.a(new h$b(R.drawable.arg_RES_7f0811b8, 0x7f104f05, new w(b)));
                      }
                      if (uoa.c() != null && i5 < uoa.d()) {
                         i5 = i5 + 1;
                         uoa2.a(new h$b(R.drawable.arg_RES_7f0820a2, uoa.c().intValue(), new x(b)));
                         d i10 = b.i;
                         Objects.requireNonNull(i10);
                         if (!PatchProxy.isSupport(oz) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, i10, oz, str6)) {
                            i10.d.onNext(Boolean.TRUE);
                         }
                      }
                      if (uoa.k() && i5 < uoa.d()) {
                         i9 = i5 + 1;
                         i3 = 0x7f10484e;
                         d uod = new d(b, 0, 0, new u(b), uoa);
                         if (uoa.l()) {
                            i5 = (uoa.l() && !uoa.h())? true: false;
                            obj3.f(i5);
                         }
                         uoa2.a(obj3);
                         i5 = i9;
                      }else {
                         i3 = 0x7f10484e;
                      }
                      if (uoa.z != null && i5 < uoa.d()) {
                         i5 = i5 + 1;
                         d i11 = b.i;
                         Objects.requireNonNull(i11);
                         uoa2.a(new h$b(R.drawable.arg_RES_7f0820d0, 0x7f1019bd, new m(i11)));
                      }
                      if (uoa.g() && i5 < uoa.d()) {
                         i5 = i5 + 1;
                         uoa2.a(new h$b(R.drawable.arg_RES_7f082097, str1, new v(b)));
                      }
                      if (uoa.i != null && i5 < uoa.d()) {
                         i5 = i5 + 1;
                         uoa2.a(new h$b(R.drawable.arg_RES_7f08209f, 0x7f100ef6, new c(b, i5)));
                         b.w(str4, i5, uoa);
                      }
                      if (i5 < uoa.d() && uoa.e()) {
                         b.i.d(uoa.i());
                         i7 = (uoa.i() && !uoa.n())? 0x7f0809de: 0x7f0809dd;
                         uoa2.a(new h$b(i7, i3, new e(b, uoa)));
                         goto label_052a ;
                      }else {
                         goto label_052a ;
                      }
                   }
                }
             }
          }
          patchProxyRe1 = patchProxyRe;
          i = 1;
          goto label_052a ;
       }else {
          ol1 = ol;
          if (uoa.b() == FeedbackAnim.HIDE) {
             uof = b.l;
             o oo = new o(b);
             Objects.requireNonNull(uof);
             if (!PatchProxy.applyVoidOneRefs(oo, uof, ol1, str)) {
                uof.a(0, 0, new j(uof, oo), new LinearInterpolator(), 200);
             }
          }
       }
       return;
    }
}
