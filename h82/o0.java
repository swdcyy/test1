package h82.o0;
import u61.b;
import u61.c;
import com.kuaishou.live.bottombar.component.widget.d;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h82.n0;
import msd.a;
import k51.b;
import h82.k0;
import h82.l0;
import java.util.Objects;
import android.view.View$OnClickListener;
import h82.m0;
import android.widget.ImageView;
import h82.o0$a;
import h82.m;
import h82.p0;
import z61.b;
import h82.b0;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import f82.c;
import lnc.a1;
import d61.c0;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import h82.j0;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.show.fansgroup.b;
import h82.l;
import android.animation.Animator;
import android.animation.ValueAnimator;
import h82.b;
import h82.r0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import h82.h;
import android.animation.Animator$AnimatorListener;
import h82.i0;
import com.airbnb.lottie.LottieAnimationView;
import h82.d0;
import h82.c0;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import h82.h0;
import u61.c$a;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;

public class o0 extends d implements b, c	// class@002ce2
{
    public boolean k;
    public b0 l;
    public k0 m;
    public c$a n;

    public void o0(){
       super();
    }
    public View C(Context p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b("LiveAudienceFollowBottomBarViewItem::createView", new n0(p0, p1));
    }
    public void D(View p0){
       k0 ok0 = k0.class;
       o0 oo0 = o0.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, oo0, str)) {
          return;
       }
       k0 ok01 = new k0(p0);
       this.m = ok01;
       l0 ol0 = new l0(this);
       Objects.requireNonNull(ok01);
       if (!PatchProxy.applyVoidOneRefs(ol0, ok01, ok0, str)) {
          ok01.b.setOnClickListener(ol0);
       }
       o0 tm = this.m;
       m0 om0 = new m0(this);
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoidOneRefs(om0, tm, ok0, "1")) {
          tm.d.setOnClickListener(om0);
       }
       tm.w = new o0$a(this);
       tm = this.m;
       p0 op0 = PatchProxy.apply(null, this, oo0, "6");
       if (op0 != PatchProxyResult.class) {
       }else {
          op0 = new p0(this);
       }
       tm.x = op0;
       return;
    }
    public void F(b p0){
       ValueAnimator valueAnimato;
       k0 c;
       String str1;
       String str2;
       b0 uob0 = this;
       b0 obj = p0;
       k0 ok0 = k0.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(obj, uob0, o0.class, str)) {
          return;
       }
       if (!obj instanceof b0) {
          return;
       }
       uob0.l = obj;
       o0 m = uob0.m;
       m.r = obj.k;
       obj = obj.i;
       Objects.requireNonNull(m);
       if (!PatchProxy.isSupport(ok0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(obj), m, ok0, "27")) {
          m.q = obj;
          if (obj == null) {
             m.i();
          }
       }
       o0 m1 = uob0.m;
       m = uob0.l;
       m1.o = m.c;
       b0 d = m.d;
       Objects.requireNonNull(m1);
       if (!PatchProxy.isSupport(ok0) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(d), m1, ok0, "7") && (d > null && m1.p < d))) {
          m1.p = d;
          str1 = String.valueOf(d);
          m1.h.setText(str1);
          m1.m.setText(str1);
       }
    label_0077 :
       m1 = uob0.l;
       boolean b = false;
       if (m1.j != null) {
          m1.j = b;
          return;
       }else {
          m1 = uob0.m;
          Objects.requireNonNull(m1);
          Object[] objArray = null;
          int i = 8;
          if (!PatchProxy.applyVoid(objArray, m1, ok0, "28")) {
             m1.j.setImageDrawable(objArray);
             m1.j.setVisibility(i);
          }
          m1 = uob0.m;
          o0 l = uob0.l;
          b0 g = l.g;
          b0 e = l.e;
          b0 f = l.f;
          Objects.requireNonNull(m1);
          if (PatchProxy.isSupport(ok0)) {
             i = 2;
             if (PatchProxy.applyVoidThreeRefs(Integer.valueOf(g), Integer.valueOf(e), Integer.valueOf(f), m1, k0.class, "9")) {
             label_0140 :
                if (uob0.k == null) {
                   m1 = uob0.m;
                   m = uob0.l;
                   b0 g1 = m.g;
                   d = m.a;
                   Objects.requireNonNull(m1);
                   if (!PatchProxy.isSupport(ok0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(g1), d, m1, ok0, str)) {
                      m1.n = g1;
                      m1.k();
                      m1.d.L(d);
                      if (m1.n == i) {
                         m1.f();
                      }
                   }
                   uob0.k = true;
                }else {
                   m1 = uob0.m;
                   o0 l1 = uob0.l;
                   b0 g2 = l1.g;
                   b0 h = l1.h;
                   Objects.requireNonNull(m1);
                   if (!PatchProxy.isSupport(ok0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(g2), Boolean.valueOf(h), m1, ok0, "4")) {
                      if (g2 == m1.n) {
                         m1.k();
                      }else {
                         k0 y = m1.y;
                         if (y != null) {
                            y.b();
                         }
                         m1.n = g2;
                         if (g2 == null && h != null) {
                            m1.b();
                            if (!PatchProxy.applyVoid(objArray, m1, ok0, "26")) {
                               m1.d.setVisibility(b);
                               m1.i.setVisibility(8);
                               m1.f.setVisibility(8);
                               m1.e.setVisibility(b);
                               m1.e.setImageResource(R.drawable.arg_RES_7f08132e);
                               m1.j();
                               if (m1.v == null) {
                                  ok0 = m1.b;
                                  int i1 = m1.d();
                                  int i2 = m1.e();
                                  k0 w = m1.w;
                                  if (PatchProxy.isSupport(l.class)) {
                                     valueAnimato = PatchProxy.applyFourRefs(ok0, Integer.valueOf(i1), Integer.valueOf(i2), w, null, l.class, "2");
                                     if (valueAnimato != PatchProxyResult.class) {
                                     label_0231 :
                                        m1.v = valueAnimato;
                                        valueAnimato.addListener(new i0(m1));
                                        m1.v.start();
                                     }
                                  }
                                  int[] ointArray = new int[i];
                                  ointArray[b] = i1;
                                  ointArray[1] = i2;
                                  valueAnimato = ValueAnimator.ofInt(ointArray);
                                  valueAnimato.addUpdateListener(new b(ok0, w));
                                  valueAnimato.addListener(new h(ok0, i2, w));
                                  valueAnimato.setDuration(300);
                                  valueAnimato.start();
                                  goto label_0231 ;
                               }
                            }
                         }else if(g2 != null && h != null){
                            m1.b();
                            if (!PatchProxy.applyVoid(objArray, m1, ok0, "10")) {
                               if (!m1.i.p()) {
                                  if (!PatchProxy.applyVoid(objArray, m1, ok0, "16")) {
                                     c = m1.n;
                                     if (c != null) {
                                        str1 = (c != true)? "/udata/pkg/kwai-client-image/live_fans_group/live_bottom_bar_follow_has_fans_group.json": "/udata/pkg/kwai-client-image/live_fans_group/live_bottom_bar_follow_has_not_fans_group.json";
                                        m1.i.setAnimationFromUrl(c0.a.b(str1));
                                        m1.i.a(new d0(m1));
                                     }
                                  }
                                  m1.i.a(new c0(m1));
                                  m1.i.s();
                               }
                               if (m1.s == null) {
                                  c = m1.c;
                                  if (!PatchProxy.applyVoidOneRefs(c, m1, ok0, "25")) {
                                     PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[true];
                                     propertyValu[b] = j.b(new float[i]{0x3f800000,0x3e99999a});
                                     ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(c, propertyValu);
                                     m1.s = objectAnimat;
                                     objectAnimat.setDuration(100);
                                     m1.s.addListener(new h0(m1));
                                  }
                                  m1.s.start();
                               }
                            }
                         }else if(g2 == 3){
                            m1.a();
                         }else {
                            m1.b();
                            m1.k();
                         }
                      }
                   }
                }
                return;
             }
          }else {
             i = 2;
          }
          if (e != null) {
             m1.g(m1.h);
             m1.g(m1.m);
          }else {
             m1.h(m1.h);
             m1.h(m1.m);
          }
          m1.h.setTextColor(a1.a(c.h(f, e)));
          m1.m.setTextColor(a1.a(c.h(f, e)));
          if (g == i) {
             str2 = (e == null)? c0.a.b("/udata/pkg/kwai-client-image/live_fansgroup/live_audience_fans.webp"): c.e(f, e);
          }else {
             str2 = c.e(f, e);
          }
          if (!PatchProxy.applyVoidOneRefs(str2, m1, ok0, "32")) {
             if (FansGroupKswitchUtil.a()) {
                m1.g.a0(e0.h(str2), new j0(m1));
             }else {
                m1.g.L(str2);
             }
          }
          m1.l.L(c.f(e));
          goto label_0140 ;
       }
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o0.class, "5")) {
          return;
       }
       super.a();
       this.k = false;
       o0 tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, k0.class, "5")) {
          tm.n = 0;
          tm.b();
          tm.a();
          tm.i();
       }
       return;
    }
    public void p(c$a p0){
       this.n = p0;
    }
    public int t(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       o0 obj = PatchProxy.apply(objArray, this, o0.class, "4");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.m;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, k0.class, "6");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.b.getLayoutParams().width;
       return i;
    }
}
