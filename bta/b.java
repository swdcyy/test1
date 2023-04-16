package bta.b;
import zq6.i;
import bta.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import zq6.p;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kwai.feature.api.feed.home.kcubehome.widget.TriangleView;
import android.view.View;
import bo5.a;
import co5.p;
import co5.p$a;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import java.lang.Boolean;
import java.lang.Integer;
import android.animation.ValueAnimator;
import eo5.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import eo5.b;
import eo5.c;
import eo5.d;
import java.lang.Float;
import co5.c;

public final class b implements i	// class@000465
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "values");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p key = uEntry.getKey();
          this.d(key, uEntry.getValue());
       }
       return;
    }
    public void b(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "value");
       this.d(p0, p1);
       return;
    }
    public final Object c(p p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.d().cast(p1);
       Objects.requireNonNull(p0);
       a.o(p0, "Objects.requireNonNull\(s¡­d.valueClass.cast\(value\)\)");
       return p0;
    }
    public final void d(p p0,Object p1){
       p b;
       ValueAnimator valueAnimato;
       long l;
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, str)) {
          return;
       }
       b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       String str1 = "2";
       View view = PatchProxy.apply(objArray, ta, c.class, str1);
       if (view != PatchProxyResult.class) {
       }else {
          view = ta.s.findViewById(0x7f0a407f);
       }
       if (view != null) {
          b = a.B;
          if (a.g(b, p0)) {
             a.o(b, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
             p0 = this.c(b, p1);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(view, p0, p.class, str)) {
                if (p0.a != null) {
                   p0 = p0.b;
                   if (p0 != null) {
                      if (!PatchProxy.applyVoidOneRefs(view, p0, p$a.class, str1)) {
                         p1 = p0.a;
                         if (p1 != Integer.MIN_VALUE) {
                            view.setTriangleColor(p1);
                         }
                         p1 = p0.b;
                         b = 0xcf000000;
                         if (p1 - b) {
                            if (!p1 - 0x3f800000) {
                               view.setUpTriangleAlpha(0);
                               view.setTriangleDirection(IconifyTextViewNew$a.a);
                            }
                            view.setTriangleAlpha(p0.b);
                            p1 = p0.e;
                            if (p1 - b) {
                               if (!p1 - (float)IconifyTextViewNew$a.a) {
                                  view.setTriangleAlpha(p0.b);
                                  view.setUpTriangleAlpha(0);
                                  view.setTriangleDirection(IconifyTextViewNew$a.a);
                               }else {
                                  view.setUpTriangleAlpha(p0.b);
                                  view.setTriangleAlpha(0);
                                  view.setTriangleDirection(IconifyTextViewNew$a.b);
                               }
                            }
                         }
                         view.setTriangleWidth(p0.c);
                         view.setUpTriangleWidth(p0.c);
                         view.setTriangleHeight(p0.d);
                         view.setUpTriangleHeight(p0.d);
                         view.b();
                      }
                      view.b();
                   }
                }
                if (!PatchProxy.applyVoid(objArray, view, TriangleView.class, "8")) {
                   view.a(1, false);
                }
             }
          }else {
             b = a.D;
             if (a.g(b, p0)) {
                a.o(b, "HomeTopStateId.TAB_ROTATE_DEGREES");
                p0 = this.c(b, p1);
                a.o(p0, "castTo\(HomeTopStateId.TAB_ROTATE_DEGREES, value\)");
                if (p0.booleanValue() && (!PatchProxy.isSupport(TriangleView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(false), view, TriangleView.class, "10") && view.i == null))) {
                   TriangleView h = view.h;
                   if (h == IconifyTextViewNew$a.a) {
                      valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                      a.o(valueAnimato, "valueAnimator");
                      l = (long)false;
                      valueAnimato.setDuration(l);
                      valueAnimato.start();
                      valueAnimato.addUpdateListener(new a(view));
                      valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      a.o(valueAnimato, "upAnimator");
                      valueAnimato.setDuration(l);
                      valueAnimato.start();
                      valueAnimato.addUpdateListener(new b(view));
                   }else if(h == IconifyTextViewNew$a.b){
                      valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      a.o(valueAnimato, "valueAnimator");
                      l = (long)false;
                      valueAnimato.setDuration(l);
                      valueAnimato.start();
                      valueAnimato.addUpdateListener(new c(view));
                      valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                      a.o(valueAnimato, "upAnimator");
                      valueAnimato.setDuration(l);
                      valueAnimato.start();
                      valueAnimato.addUpdateListener(new d(view));
                   }
                }
             }else {
                b = a.E;
                if (a.g(b, p0)) {
                   a.o(b, "HomeTopStateId.TAB_TRIANGLE_ALPHA");
                   Float uFloat = this.c(b, p1);
                   if (a.e(uFloat, 0x3f800000)) {
                      view.setUpTriangleAlpha(0);
                      view.setTriangleDirection(IconifyTextViewNew$a.a);
                   }
                   a.o(uFloat, "alpha");
                   view.setTriangleAlpha(uFloat.floatValue());
                   view.invalidate();
                }else {
                   b = a.F;
                   if (a.g(b, p0)) {
                      a.o(b, "HomeTopStateId.TAB_TRIANGLE_ALPHA_WITH_DIRECTION");
                      c uoc = this.c(b, p1);
                      view.setTriangleDirection(uoc.b);
                      if (uoc.b == IconifyTextViewNew$a.b) {
                         view.setUpTriangleAlpha(uoc.a);
                         view.setTriangleAlpha(0);
                      }else {
                         view.setTriangleAlpha(uoc.a);
                         view.setUpTriangleAlpha(0);
                      }
                      view.invalidate();
                   }else {
                      b = a.C;
                      if (a.g(b, p0)) {
                         a.o(b, "HomeTopStateId.TAB_TRIANGLE_COLOR");
                         Integer integer = this.c(b, p1);
                         a.o(integer, "color");
                         view.setTriangleColor(integer.intValue());
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
