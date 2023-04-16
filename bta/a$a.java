package bta.a$a;
import zq6.i;
import bta.a;
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
import bo5.a;
import co5.f;
import wq6.h;
import com.yxcorp.gifshow.image.KwaiImageView;
import co5.f$a;
import android.graphics.Bitmap;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import hn5.n;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import java.lang.Float;
import bta.a$b;
import android.view.View;
import co5.l;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewStub;
import android.view.ViewParent;
import co5.h;
import com.yxcorp.gifshow.widget.TabDoubleImageRotateView;
import java.util.List;
import android.widget.FrameLayout;
import co5.q;
import com.yxcorp.gifshow.widget.TabTripleImageRotateView;

public final class a$a implements i	// class@000462
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "value");
       this.d(p0, p1);
       return;
    }
    public final Object c(p p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.d().cast(p1);
       Objects.requireNonNull(p0);
       a.o(p0, "Objects.requireNonNull\(s¡­d.valueClass.cast\(value\)\)");
       return p0;
    }
    public final void d(p p0,Object p1){
       KwaiImageView kwaiImageVie;
       h oh1;
       int i1;
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, str)) {
          return;
       }
       p g = a.G;
       if (a.g(g, p0)) {
          a.o(g, "HomeTopStateId.TAB_AVATAR");
          f uof = this.c(g, p1);
          p1 = this.a;
          a t = p1.t;
          p1 = a.P8(p1);
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidTwoRefs(t, p1, uof, f.class, "4")) {
             if (uof.a != null) {
                kwaiImageVie = t.b();
                f b = uof.b;
                if (b != null) {
                   kwaiImageVie.setImageBitmap(b);
                }
                kwaiImageVie.setVisibility(0);
             }else {
                kwaiImageVie = t.a();
                if (kwaiImageVie != null) {
                   kwaiImageVie.setVisibility(8);
                }
             }
             d.a(-1883158055).dh(uof.a, a.c(p1.M2()));
          }
       }else {
          g = a.H;
          if (a.g(g, p0)) {
             a.o(g, "HomeTopStateId.TAB_AVATAR_SCALE");
             Float uFloat = this.c(g, p1);
             if (this.a.t.a() == null && a.e(uFloat, 0x3f800000)) {
                return;
             }else {
                p1 = this.a.t.b();
                a.o(uFloat, "scale");
                p1.setScaleX(uFloat.floatValue());
                p1.setScaleY(uFloat.floatValue());
             }
          }else {
             g = a.I;
             if (a.g(g, p0)) {
                a.o(g, "HomeTopStateId.TAB_LOTTIE");
                l ol = this.c(g, p1);
                p1 = a.R8(this.a);
                Objects.requireNonNull(ol);
                if (!PatchProxy.applyVoidOneRefs(p1, ol, l.class, str)) {
                   int i = 0x7f0a0f9c;
                   if (ol.a != null) {
                      LottieAnimationView lottieAnimat = p1.b().findViewById(i);
                      if (lottieAnimat == null) {
                         p1 = p1.b().findViewById(R.id.follow_tab_lottie_view_stub);
                         if (p1 != null && p1.getParent() != null) {
                            p1.setLayoutResource(R.layout.arg_RES_7f0d0473);
                            lottieAnimat = p1.inflate();
                         }
                      }
                      if (lottieAnimat != null) {
                         lottieAnimat.setVisibility(0);
                         lottieAnimat.setRepeatCount(ol.b);
                         lottieAnimat.s();
                      }
                   }else {
                      LottieAnimationView lottieAnimat1 = p1.b().findViewById(i);
                      if (lottieAnimat1 != null) {
                         if (lottieAnimat1.p()) {
                            lottieAnimat1.f();
                         }
                         lottieAnimat1.setVisibility(8);
                      }
                   }
                }
             }else {
                g = a.J;
                if (a.g(g, p0)) {
                   a.o(g, "HomeTopStateId.TAB_DOUBLE_AVATAR");
                   h oh = this.c(g, p1);
                   p1 = a.R8(this.a);
                   oh1 = a.P8(this.a);
                   Objects.requireNonNull(oh);
                   if (!PatchProxy.applyVoidTwoRefs(p1, oh1, oh, h.class, str)) {
                      i1 = 0x7f0a0f97;
                      if (oh.a != null) {
                         TabDoubleImageRotateView tabDoubleIma = p1.b().findViewById(i1);
                         if (tabDoubleIma == null) {
                            p1 = p1.b().findViewById(R.id.follow_tab_double_image_group_stub);
                            if (p1 != null && p1.getParent() != null) {
                               p1.setLayoutResource(R.layout.arg_RES_7f0d0471);
                               tabDoubleIma = p1.inflate();
                            }
                         }
                         if (tabDoubleIma != null) {
                            tabDoubleIma.a(oh.b);
                            tabDoubleIma.e();
                            tabDoubleIma.setVisibility(0);
                            d.a(-1883158055).dh(true, a.c(oh1.M2()));
                         }
                      }else {
                         TabDoubleImageRotateView tabDoubleIma1 = p1.b().findViewById(i1);
                         if (tabDoubleIma1 != null) {
                            tabDoubleIma1.f();
                            tabDoubleIma1.b();
                            tabDoubleIma1.setVisibility(8);
                            d.a(-1883158055).dh(0, a.c(oh1.M2()));
                         }
                      }
                   }
                }else {
                   g = a.K;
                   if (a.g(g, p0)) {
                      a.o(g, "HomeTopStateId.TAB_TRIPLE_AVATAR");
                      q oq = this.c(g, p1);
                      p1 = a.R8(this.a);
                      oh1 = a.P8(this.a);
                      Objects.requireNonNull(oq);
                      if (!PatchProxy.applyVoidTwoRefs(p1, oh1, oq, q.class, str)) {
                         i1 = 0x7f0a0f9f;
                         if (oq.a != null) {
                            TabTripleImageRotateView tabTripleIma = p1.b().findViewById(i1);
                            if (tabTripleIma == null) {
                               p1 = p1.b().findViewById(R.id.follow_tab_triple_image_group_stub);
                               if (p1 != null && p1.getParent() != null) {
                                  p1.setLayoutResource(R.layout.arg_RES_7f0d0474);
                                  tabTripleIma = p1.inflate();
                               }
                            }
                            if (tabTripleIma != null) {
                               tabTripleIma.a(oq.b);
                               tabTripleIma.f();
                               tabTripleIma.setVisibility(0);
                               d.a(-1883158055).dh(true, a.c(oh1.M2()));
                            }
                         }else {
                            TabTripleImageRotateView tabTripleIma1 = p1.b().findViewById(i1);
                            if (tabTripleIma1 != null) {
                               tabTripleIma1.g();
                               tabTripleIma1.c();
                               tabTripleIma1.setVisibility(8);
                               d.a(-1883158055).dh(0, a.c(oh1.M2()));
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
