package com.yxcorp.gifshow.camera.record.breakpoint.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.breakpoint.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointBar;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointHandle;
import com.yxcorp.gifshow.camera.record.breakpoint.a$a;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import o36.g;
import com.kwai.robust.PatchProxyResult;
import j36.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import j36.d;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.a;
import oc9.w;
import rc9.a;
import com.yxcorp.gifshow.camera.record.base.g;
import com.kwai.video.player.KsMediaPlayer;
import sc9.d;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.AbstractMediaPlayer;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.camera.record.widget.SingleLineLyricWordView;
import ekd.y0;
import android.widget.RelativeLayout;
import sc9.g;
import sc9.h;
import android.graphics.drawable.Drawable;
import a2.i0;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.content.Context;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public class b$a extends m	// class@000daf
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       BreakpointPanel g;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       String str = "3";
       if (!PatchProxy.applyVoid(objArray, tc, b.class, str)) {
          b c = tc.c;
          Objects.requireNonNull(c);
          a uoa = a.class;
          if (!PatchProxy.applyVoid(objArray, c, uoa, "26")) {
             if (c.s == null) {
                BreakpointPanel uBreakpointP = c.t.b(R.id.breakpoint_panel);
                c.s = uBreakpointP;
                Objects.requireNonNull(uBreakpointP);
                if (!PatchProxy.applyVoidOneRefs(c, uBreakpointP, BreakpointPanel.class, str)) {
                   uBreakpointP.h = c;
                   uBreakpointP.e();
                   BreakpointPanel g1 = uBreakpointP.g;
                   uBreakpointP = uBreakpointP.h;
                   Objects.requireNonNull(g1);
                   if (!PatchProxy.applyVoidOneRefs(uBreakpointP, g1, BreakpointBar.class, str)) {
                      g1.g = uBreakpointP.p;
                      BreakpointBar c1 = g1.c;
                      c1.g = uBreakpointP;
                      c1.h = g1;
                   }
                }
                BaseFragment uBaseFragmen = c.d.f();
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                g og = g.class;
                Object[] objArray1 = PatchProxy.applyOneRefs(uBaseFragmen, objArray, og, "5");
                if (objArray1 != patchProxyRe) {
                }else if(uBaseFragmen == null){
                   objArray1 = objArray;
                   BaseFragment uBaseFragmen1 = uBaseFragmen;
                   while (objArray1 == null && uBaseFragmen1 != null) {
                      if (uBaseFragmen1 instanceof g) {
                         objArray1 = uBaseFragmen1.z4();
                      }
                      uBaseFragmen1 = uBaseFragmen1.getParentFragment();
                   }
                   if (objArray1 == null) {
                      FragmentActivity activity = uBaseFragmen.getActivity();
                      Object obj = PatchProxy.applyOneRefs(activity, objArray, og, "6");
                      if (obj != patchProxyRe) {
                         objArray1 = obj;
                      }else if(activity != null && activity instanceof g){
                         objArray1 = activity.z4();
                      }
                   }
                }
                objArray1 = objArray;
                c.x = new a$a(objArray1, c.s);
                d.c().e(c.x);
             }
             a s = c.s;
             Objects.requireNonNull(s);
             String str1 = "4";
             if (!PatchProxy.applyVoid(objArray, s, BreakpointPanel.class, str1) && s.i == null) {
                s.i = true;
                BreakpointPanel h = s.h;
                Objects.requireNonNull(h);
                if (!PatchProxy.applyVoid(objArray, h, uoa, "14")) {
                   h.p.b(h.d.b().getRecordDuration(), h.d);
                   h.p.j = false;
                   h.h2();
                   uoa = h.q;
                   a s1 = h.s;
                   Objects.requireNonNull(uoa);
                   if (!PatchProxy.applyVoidOneRefs(s1, uoa, a.class, "2")) {
                      uoa.doBindView(s1);
                   }
                   g og2 = h.d.c(g.class);
                   s1 = h.q;
                   Objects.requireNonNull(s1);
                   if (!PatchProxy.applyVoidOneRefs(og2, s1, a.class, str)) {
                      s1.c = og2;
                      if (og2 != null) {
                         KsMediaPlayer ksMediaPlaye = og2.h1();
                         s1.f = ksMediaPlaye;
                         if (ksMediaPlaye != null) {
                            s1.g = s1.c.K1();
                            s1.f.setOnCompletionListener(new d(s1));
                         }
                      }
                   }
                   a p = h.p;
                   b = (og2 != null)? true: false;
                   p.g = b;
                   uoa = h.q;
                   Objects.requireNonNull(uoa);
                   if (!PatchProxy.applyVoid(objArray, uoa, a.class, str1)) {
                      if (!uoa.c(true)) {
                         uoa.b.a(objArray);
                      }else {
                         uoa.f.setLooping(0);
                         uoa.b.a(uoa.c.m1());
                         if (uoa.f.isPlaying()) {
                            uoa.f(0);
                            uoa.h.d();
                         }else {
                            uoa.b.d(0);
                            uoa.a(0);
                         }
                         uoa.c.g();
                      }
                   }
                   if (h.x != null) {
                      d.c().h(h.x);
                   }
                }
                s.setVisibility(0);
                g = s.g;
                Objects.requireNonNull(g);
                if (!PatchProxy.applyVoid(objArray, g, BreakpointBar.class, "7")) {
                   g og1 = (g.g.g != null)? new g(): new h();
                   g.h = og1;
                   i0.v0(g.d, og1);
                   g.e.setText(DateUtils.p(0));
                   g.f.setText(DateUtils.p((long)g.g.a));
                   g.c();
                   g.d();
                   g.e();
                }
                s.c();
                s.animate().translationY(0).setListener(objArray);
                RxBus.f.b(new PanelShowEvent(CameraPageType.VIDEO, PanelShowEvent$PanelType.BREAKPOINT, s.getContext(), true));
             }
             CameraLogger.i(406, "click_timer_pause_point");
          }
       }
       return;
    }
}
