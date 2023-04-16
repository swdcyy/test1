package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$d;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
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
import r7a.f;
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

public final class DanmakuElement$d extends y0	// class@0013da
{
    public boolean a;
    public final DanmakuElement b;

    public void DanmakuElement$d(DanmakuElement p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$d.class, "1")) {
          return;
       }
       if (DanmakuExperimentUtils.U.Q()) {
          this.a = this.b.B0();
       }
       return;
    }
    public void e(boolean p0){
       DanmakuElement$d uod = DanmakuElement$d.class;
       String str = "3";
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, str)) {
          return;
       }
       DanmakuElement$d tb = this.b;
       boolean b = false;
       tb.V0 = b;
       DanmakuElement$d ta = this.a;
       Objects.requireNonNull(tb);
       DanmakuElement uDanmakuElem = DanmakuElement.class;
       if (!PatchProxy.isSupport(uDanmakuElem) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), tb, uDanmakuElem, str)) {
          tb.z = null;
          b a = b.a;
          DanmakuElement a1 = tb.A;
          if (a1 == null) {
             a.S("mLogger");
          }
          DanmakuElement u0 = tb.U0;
          DanmakuElement v = tb.v;
          if (v == null) {
             a.S("mPhoto");
          }
          a.a(a1, u0, v, tb.W0, ta);
          DanmakuElement c = tb.C;
          if (c == null) {
             a.S("mSlidePlayViewModel");
          }
          c.d0(tb.c1);
          c = tb.O;
          if (c != null) {
             c.remove(tb.T);
          }
          c = tb.P;
          if (c != null) {
             c.c(tb.U);
          }
          if (!PatchProxy.applyVoid(null, tb, uDanmakuElem, "27")) {
             tb.z0("releaseAndReset", "enter");
             uDanmakuElem = tb.w;
             if (uDanmakuElem == null) {
                a.S("mPlayModule");
             }
             uDanmakuElem.getPlayer().removeOnPreparedListener(tb.b1);
             k1.m(tb.w0());
             tb.R = true;
             tb.X0 = b;
             tb.X = null;
             tb.V.d();
             b[] uobArray = new b[]{tb.Y,tb.Z};
             b9.b(uobArray);
             tb.Y = null;
             tb.Z = null;
             DanmakuElement u01 = tb.U0;
             if (u01 != null) {
                u01.x(tb.g1);
             }
             tb.u0(true);
             tb.U0 = null;
             tb.W.a();
          }
       }
       return;
    }
    public void f(boolean p0){
       DanmakuElement$d uod = DanmakuElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       p0.V0 = true;
       if (DanmakuExperimentUtils.U.Q()) {
          return;
       }
       this.a = this.b.B0();
       return;
    }
}
