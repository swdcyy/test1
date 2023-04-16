package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$d;
import qp7.y0;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import java.lang.Boolean;
import java.util.Objects;
import sm5.b;
import kotlin.jvm.internal.a;
import ok.x;
import im5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import tw6.e;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import jta.c;
import g19.l;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b;
import java.lang.Runnable;
import ekd.k1;
import crd.a;
import crd.b;
import lnc.b9;
import jm5.c;
import rm5.a;

public final class AdDanmakuElement$d extends y0	// class@0016f9
{
    public boolean a;
    public final AdDanmakuElement b;

    public void AdDanmakuElement$d(AdDanmakuElement p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$d.class, "1")) {
          return;
       }
       if (DanmakuExperimentUtils.U.Q()) {
          this.a = this.b.A0();
       }
       return;
    }
    public void e(boolean p0){
       AdDanmakuElement$d uod = AdDanmakuElement$d.class;
       String str = "3";
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, str)) {
          return;
       }
       AdDanmakuElement$d tb = this.b;
       boolean b = false;
       tb.T = b;
       AdDanmakuElement$d ta = this.a;
       Objects.requireNonNull(tb);
       AdDanmakuElement uAdDanmakuEl = AdDanmakuElement.class;
       if (!PatchProxy.isSupport(uAdDanmakuEl) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), tb, uAdDanmakuEl, str)) {
          b a = b.a;
          AdDanmakuElement z = tb.z;
          if (z == null) {
             a.S("mLogger");
          }
          AdDanmakuElement s = tb.S;
          AdDanmakuElement v = tb.v;
          if (v == null) {
             a.S("mPhoto");
          }
          a.a(z, s, v, tb.U, ta);
          AdDanmakuElement b1 = tb.B;
          if (b1 == null) {
             a.S("mSlidePlayViewModel");
          }
          b1.d0(tb.U0);
          b1 = tb.I;
          if (b1 != null) {
             b1.remove(tb.L);
          }
          b1 = tb.J;
          if (b1 != null) {
             b1.c(tb.M);
          }
          if (!PatchProxy.applyVoid(null, tb, uAdDanmakuEl, "25")) {
             tb.y0("releaseAndReset", "enter");
             uAdDanmakuEl = tb.w;
             if (uAdDanmakuEl == null) {
                a.S("mPlayModule");
             }
             uAdDanmakuEl.getPlayer().removeOnPreparedListener(tb.Z);
             k1.m(tb.u0());
             tb.V = b;
             tb.P = null;
             tb.N.d();
             b[] uobArray = new b[]{tb.Q,tb.R};
             b9.b(uobArray);
             tb.Q = null;
             tb.R = null;
             AdDanmakuElement s1 = tb.S;
             if (s1 != null) {
                s1.x(tb.X0);
             }
             tb.s0(1);
             tb.S = null;
             tb.O.a();
          }
       }
       return;
    }
    public void f(boolean p0){
       AdDanmakuElement$d uod = AdDanmakuElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       p0.T = true;
       if (DanmakuExperimentUtils.U.Q()) {
          return;
       }
       this.a = this.b.A0();
       return;
    }
}
