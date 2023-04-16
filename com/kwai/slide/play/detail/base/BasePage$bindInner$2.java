package com.kwai.slide.play.detail.base.BasePage$bindInner$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import qp7.w0;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import qp7.b;
import qp7.d;
import qp7.t0;
import rp7.a;
import qp7.c;
import com.kwai.slide.play.detail.biz.ElementCategoryLayoutInfo;
import android.view.ViewGroup;
import qp7.x0;
import android.view.View;
import android.view.ViewParent;
import java.lang.Exception;

public final class BasePage$bindInner$2 extends FunctionReferenceImpl implements l	// class@001736
{
    public static final BasePage$bindInner$2 INSTANCE;

    static {
       BasePage$bindInner$2.INSTANCE = new BasePage$bindInner$2();
    }
    public void BasePage$bindInner$2(){
       super(1, w0.class, "bind", "bind\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w0 p0){
       d uod;
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$bindInner$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       Objects.requireNonNull(p0);
       w0 ow0 = w0.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, p0, ow0, "7")) {
          if (p0.g == null) {
             w0 e = p0.e;
             if (e == null) {
                a.S("singleElement");
             }
             if (!e instanceof DispatchBaseElement || !e.G()) {
                e.c0();
             }
             e.m = false;
             e.n();
             p0.g = true;
             if (!PatchProxy.applyVoid(objArray, p0, ow0, "14")) {
                ow0 = p0.e;
                if (ow0 == null) {
                   a.S("singleElement");
                }
                if (ow0.M()) {
                   ow0 = p0.e;
                   if (ow0 == null) {
                      a.S("singleElement");
                   }
                   if (ow0.C() == null) {
                      ow0 = p0.e;
                      if (ow0 == null) {
                         a.S("singleElement");
                      }
                      uod = ow0.q();
                      Objects.requireNonNull(uod, "null cannot be cast to non-null type com.kwai.slide.play.detail.base.BaseElementView<com.kwai.slide.play.detail.base.BaseViewModel, com.kwai.slide.play.detail.base.BaseElementEventBus>");
                      w0 b = p0.b;
                      if (b == null) {
                         a.S("config");
                      }
                      uod.s(b);
                      b = p0.e;
                      if (b == null) {
                         a.S("singleElement");
                      }
                      uod.u(b.x().c());
                      b = p0.e;
                      if (b == null) {
                         a.S("singleElement");
                      }
                      uod.t(b.x().d());
                      b = p0.j;
                      w0 e1 = p0.e;
                      if (e1 == null) {
                         a.S("singleElement");
                      }
                      c uoc = e1.A();
                      w0 e2 = p0.e;
                      if (e2 == null) {
                         a.S("singleElement");
                      }
                      int bottomMargin = e2.x().a().getBottomMargin();
                      w0 e3 = p0.e;
                      if (e3 == null) {
                         a.S("singleElement");
                      }
                      uod.h(b, uoc, bottomMargin, e3.x().a().getWidthRatio());
                      b = p0.e;
                      if (b == null) {
                         a.S("singleElement");
                      }
                      uod.g(b.E());
                      b = p0.e;
                      if (b == null) {
                         a.S("singleElement");
                      }
                      b.Y(uod);
                   }
                   ow0 = p0.e;
                   if (ow0 == null) {
                      a.S("singleElement");
                   }
                   uod = ow0.C();
                   a.m(uod);
                   view = uod.p();
                   if (view.getParent() == null) {
                      p0.e(view);
                   }
                   ow0 = p0.e;
                   if (ow0 == null) {
                      a.S("singleElement");
                   }
                   uod = ow0.C();
                   if (uod != null) {
                      view = uod.p();
                      if (view != null) {
                         view.setVisibility(false);
                      }
                   }
                   p0 = p0.e;
                   if (p0 == null) {
                      a.S("singleElement");
                   }
                   p0.m = true;
                }else {
                   ow0 = p0.e;
                   if (ow0 == null) {
                      a.S("singleElement");
                   }
                   uod = ow0.C();
                   if (uod != null) {
                      view = uod.p();
                      if (view != null) {
                         view.setVisibility(8);
                      }
                   }
                   p0 = p0.e;
                   if (p0 == null) {
                      a.S("singleElement");
                   }
                   p0.m = false;
                }
             }
          }else {
             throw new Exception("Already bind");
          }
       }
       return;
    }
}
