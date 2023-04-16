package com.kwai.slide.play.detail.base.BasePage$t1;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Float;
import tr7.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.t0;
import kotlin.jvm.internal.a;
import usd.q;
import com.kwai.slide.play.detail.base.BasePage$a;
import pq7.a;
import qp7.w0;
import android.view.View;
import qp7.d;
import qp7.b;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import tr7.a;
import android.view.ViewGroup;
import qp7.e;
import dq7.a;
import msd.a;
import java.lang.Integer;
import java.lang.Number;
import sp7.b;
import fq7.b;
import qp7.g;
import io.reactivex.subjects.PublishSubject;
import zs7.b;
import zs7.c;
import android.view.ViewGroup$MarginLayoutParams;
import qp7.c1;
import pq7.c;
import fq7.e;
import fq7.c;
import pp7.b;
import uq7.b;
import com.kwai.slide.play.detail.event.CleanType;
import lq7.b;
import java.lang.Boolean;
import bq7.f;
import bs7.a;
import ys7.a;
import bq7.c;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import xq7.a;

public final class BasePage$t1 implements Observer	// class@00178a
{
    public final BasePage b;

    public void BasePage$t1(BasePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Float uFloat;
       View view;
       ViewGroup$LayoutParams layoutParams;
       int i4;
       c uoc1;
       c1 uoc1;
       boolean b1;
       float f5;
       ViewGroup viewGroup3;
       Object obj = this;
       BasePage$t1 obj1 = p0;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BasePage$t1.class, "1")) {
       }else {
          String str = "progress";
          int i = 1;
          int i1 = 2;
          if (obj.b.U().g()) {
             a.o(obj1, str);
             uFloat = Float.valueOf(q.m(0, (((float)i1 * obj1.floatValue()) - (float)i)));
          }else {
             uFloat = obj1;
          }
          BasePage$a u = BasePage.U;
          String str1 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
          Object[] objArray = null;
          if (u.b() > 0) {
             a uoa = obj.b.F();
             if (uoa != null) {
                view = PatchProxy.apply(objArray, uoa, w0.class, "5");
                if (view != patchProxyRe) {
                }else {
                   w0 e = uoa.e;
                   if (e == null) {
                      a.S("singleElement");
                   }
                   d uod = e.C();
                   if (uod != null) {
                      view = uod.p();
                   }else {
                      view = objArray;
                   }
                }
                if (view != null) {
                   a.o(obj1, str);
                   int i2 = (int)((float)u.b() * ((float)i - obj1.floatValue())) + a1.d(0x7f07030d);
                   layoutParams = view.getLayoutParams();
                   Objects.requireNonNull(layoutParams, str1);
                   if (layoutParams.rightMargin != i2) {
                      layoutParams.rightMargin = i2;
                      view.setLayoutParams(layoutParams);
                      view.requestLayout();
                   }
                }
             }
          label_00a2 :
             ViewGroup viewGroup = obj.b.M().u();
             float f = (float)i;
             a.o(obj1, str);
             int i3 = (int)((float)u.b() * (f - obj1.floatValue()));
             ViewGroup$LayoutParams layoutParams1 = viewGroup.getLayoutParams();
             Objects.requireNonNull(layoutParams1, str1);
             if (layoutParams1.rightMargin != i3) {
                layoutParams1.rightMargin = i3;
                viewGroup.setLayoutParams(layoutParams1);
                viewGroup.requestLayout();
             }
             viewGroup = obj.b.A().u();
             i4 = (int)((float)u.b() * (f - obj1.floatValue()));
             ViewGroup$LayoutParams layoutParams2 = viewGroup.getLayoutParams();
             Objects.requireNonNull(layoutParams2, str1);
             if (layoutParams2.rightMargin != i4) {
                layoutParams2.rightMargin = i4;
                viewGroup.setLayoutParams(layoutParams2);
                viewGroup.requestLayout();
             }
          }
          t0 k = obj.b.U().k;
          String str2 = "2";
          if (k != null) {
             Integer integer = k.invoke();
             if (integer != null) {
                a.o(obj1, str);
                i4 = Integer.valueOf((int)((float)integer.intValue() * obj1.floatValue())).intValue();
                ViewGroup[] viewGroupArr = new ViewGroup[i1];
                viewGroupArr[0] = obj.b.v().u();
                viewGroupArr[i] = obj.b.W().u();
                int i5 = 0;
                while (i5 < i1) {
                   object oobject = viewGroupArr[i5];
                   ViewGroup$LayoutParams layoutParams3 = oobject.getLayoutParams();
                   Objects.requireNonNull(layoutParams3, str1);
                   if (layoutParams3.bottomMargin != i4) {
                      layoutParams3.bottomMargin = i4;
                      oobject.requestLayout();
                   }
                   i5 = i5 + 1;
                   i1 = 2;
                   RelativeLayout$LayoutParams layoutParams4 = null;
                }
                uoc1 = obj.b.M().s();
                Objects.requireNonNull(uoc1);
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i4), uoc1, uoc, str2)) {
                   uoc1.a.onNext(Integer.valueOf(i4));
                }
             }
          }
          b uob = obj.b.o0();
          if (uob != null) {
             c uoc2 = uob.s();
             a.o(obj1, str);
             float f1 = obj1.floatValue();
             Objects.requireNonNull(uoc2);
             c uoc3 = c.class;
             if (!PatchProxy.isSupport(uoc3) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f1), uoc2, uoc3, str2)) {
                uoc2.a.onNext(Float.valueOf(f1));
             }
             ViewGroup viewGroup1 = uob.u();
             ViewGroup$LayoutParams layoutParams5 = viewGroup1.getLayoutParams();
             str1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
             Objects.requireNonNull(layoutParams5, str1);
             i4 = layoutParams5.getMarginEnd();
             uoc1 = obj.b.U().p();
             int i6 = (uoc1 != null)? uoc1.a(): 0;
             float f2 = (float)i;
             viewGroup1.setTranslationX(((float)(i4 - i6) * (f2 - obj1.floatValue())));
             c1 uoc11 = obj.b.U().p();
             i4 = (uoc11 != null)? uoc11.c(): 0;
             layoutParams = viewGroup1.getLayoutParams();
             Objects.requireNonNull(layoutParams, str1);
             viewGroup1.setTranslationY(((float)(i4 - layoutParams.topMargin) * (f2 - obj1.floatValue())));
          }
          a uoa1 = obj.b.F();
          if (uoa1 != null) {
             uoc1 = uoa1.j();
             if (uoc1 != null) {
                a.o(obj1, str);
                float f3 = obj1.floatValue();
                if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f3), uoc1, c.class, str2)) {
                   uoc1.a.onNext(Float.valueOf(f3));
                }
             }
          }
          uoc1 = obj.b.M().s();
          a.o(obj1, str);
          float f4 = obj1.floatValue();
          Objects.requireNonNull(uoc1);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f4), uoc1, uoc, "4")) {
             uoc1.b.onNext(Float.valueOf(f4));
          }
          obj.b.i0().s().c(obj1.floatValue());
          obj.b.i0().u().setVisibility(0);
          obj.b.X0(((float)i - obj1.floatValue()), obj.b.i0().u());
          b uob1 = obj.b.e0().a();
          str = "alpha";
          if (uob1 != null && !uob1.b()) {
             uob1 = obj.b.e0().a();
             CleanType uCleanType = (uob1 != null)? uob1.a(): null;
             if (uCleanType == CleanType.TYPE_NASA && !obj.b.u0()) {
                a.o(uFloat, str);
                obj.b.T0(obj1.floatValue(), uFloat.floatValue());
             }
             if (obj.b.l()) {
                a.o(uFloat, str);
                obj.b.X0(uFloat.floatValue(), obj.b.W().u());
             }
             obj.b.W().s().c(obj1.floatValue());
          }else {
             uob1 = obj.b.C();
             if (uob1 != null) {
                ViewGroup viewGroup2 = uob1.u();
                if (viewGroup2 != null) {
                   obj.b.X0(obj1.floatValue(), viewGroup2);
                }
             }
             a.o(uFloat, str);
             obj.b.X0(uFloat.floatValue(), obj.b.A().u());
             BasePage$t1 b = obj.b;
             Objects.requireNonNull(b);
             Object obj2 = PatchProxy.apply(null, b, BasePage.class, "43");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                f uof = b.I.a();
                if (uof == null || uof.d != i) {
                   i = 0;
                }
                b1 = i;
             }
             if (b1 && !obj.b.u0()) {
                obj.b.T0(obj1.floatValue(), uFloat.floatValue());
             }
             if (!obj.b.u0()) {
                obj.b.T0(obj1.floatValue(), uFloat.floatValue());
             }
             obj.b.X0(uFloat.floatValue(), obj.b.v().u());
             obj.b.X0(uFloat.floatValue(), obj.b.P().u());
             obj.b.X0(uFloat.floatValue(), obj.b.k0().u());
             if (obj.b.l()) {
                obj.b.X0(uFloat.floatValue(), obj.b.W().u());
             }
             if (obj.b.s0()) {
                obj1 = obj.b;
                f5 = uFloat.floatValue();
                c uoc4 = obj.b.x();
                viewGroup3 = (uoc4 != null)? uoc4.u(): null;
                a.m(viewGroup3);
                obj1.X0(f5, viewGroup3);
             }else if(obj.b.v0()){
                obj1 = obj.b;
                f5 = uFloat.floatValue();
                PlcStrongGroup plcStrongGro = obj.b.Y();
                viewGroup3 = (plcStrongGro != null)? plcStrongGro.u(): null;
                a.m(viewGroup3);
                obj1.X0(f5, viewGroup3);
             }else if(!obj.b.u0()){
                obj.b.X0(uFloat.floatValue(), obj.b.N().u());
             }
          }
       }
       return;
    }
}
