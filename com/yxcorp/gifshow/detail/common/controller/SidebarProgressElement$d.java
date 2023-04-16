package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import kq7.k;
import rf5.u;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import de5.a;
import p5a.e;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.framework.player.core.b;
import com.kwai.component.photo.detail.core.helper.VideoPlayProgressHelper;
import v6a.m0;
import java.util.List;
import kq7.j;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qp7.c;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kq7.i;
import brd.t;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$b;
import qp7.g;
import fq7.c;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$d$c;

public final class SidebarProgressElement$d extends y0	// class@0013c8
{
    public a a;
    public final SidebarProgressElement b;

    public void SidebarProgressElement$d(SidebarProgressElement p0){
       this.b = p0;
       super();
       this.a = new a();
    }
    public void c(boolean p0){
       SidebarProgressElement$d uod = SidebarProgressElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       this.b.E().g(SidebarProgressElement.s0(this.b).q());
       return;
    }
    public void e(boolean p0){
       SidebarProgressElement$d uod = SidebarProgressElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       SidebarProgressElement.r0(this.b).g(this.b.R);
       this.a.dispose();
       this.a = new a();
       this.b.x0();
       SidebarProgressElement$d tb = this.b;
       tb.K = false;
       e player = SidebarProgressElement.p0(tb).getPlayer();
       if (player != null) {
          PhotoDetailLogger photoDetailL = SidebarProgressElement.o0(this.b).get();
          if (photoDetailL != null) {
             photoDetailL.putBizParam("leave_progress_duration", String.valueOf(((player.getCurrentPosition() * SidebarProgressElement.q0(this.b).getDuration()) / (long)0x2710)));
          }
       }
       SidebarProgressElement.n0(this.b).w.remove(this.b.U);
       this.b.b0();
       return;
    }
    public void f(boolean p0){
       j oj = j.class;
       SidebarProgressElement$d uod = SidebarProgressElement$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       SidebarProgressElement$d tb = this.b;
       long l = 0;
       tb.H = l;
       tb.E().h(l, this.b.L);
       int i = 1;
       if (SidebarProgressElement.p0(this.b).getPlayer() != null) {
          e player = SidebarProgressElement.p0(this.b).getPlayer();
          a.o(player, "mPlayModule.player");
          this.b.E().i((player.isPaused() ^ i));
       }else {
          this.b.E().i(i);
       }
       SidebarProgressElement.r0(this.b).i(this.b.R);
       tb = this.a;
       j oj1 = this.b.A();
       SidebarProgressElement$d$a uod$a = new SidebarProgressElement$d$a(this);
       g og = Functions.d();
       a.o(og, "Functions.emptyConsumer\(\)");
       Objects.requireNonNull(oj1);
       b uob = PatchProxy.applyTwoRefs(uod$a, og, oj1, oj, "6");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(uod$a, "consumer");
          a.p(og, "error");
          uob = oj1.c.doAfterNext(i.b).subscribe(uod$a, og);
          a.o(uob, "sidebarProgressSubject.d¡­ubscribe\(consumer, error\)");
       }
       tb.c(uob);
       tb = this.a;
       oj1 = this.b.A();
       SidebarProgressElement$d$b uod$b = new SidebarProgressElement$d$b(this);
       og = Functions.d();
       a.o(og, "Functions.emptyConsumer\(\)");
       Objects.requireNonNull(oj1);
       b uob1 = PatchProxy.applyTwoRefs(uod$b, og, oj1, oj, "3");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(uod$b, "consumer");
          a.p(og, "error");
          uob1 = oj1.a.subscribe(uod$b, og);
          a.o(uob1, "sidebarProgressTrackingS¡­ubscribe\(consumer, error\)");
       }
       tb.c(uob1);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, SidebarProgressElement.class, "14")) {
          if (tb.w0()) {
             SidebarProgressElement b = tb.B;
             if (b == null) {
                a.S("mSwipeToProfileFeedMovement");
             }
             if (b.w() && tb.v0()) {
                tb.c0();
                tb.E().j(i);
             }
          }
       label_0126 :
          tb.b0();
          tb.E().j(false);
       }
       this.b.E().g(SidebarProgressElement.s0(this.b).q());
       tb = this.a;
       c uoc = this.b.D();
       SidebarProgressElement$d$c uod$c = new SidebarProgressElement$d$c(this);
       g og1 = Functions.d();
       a.o(og1, "Functions.emptyConsumer\(\)");
       Objects.requireNonNull(uoc);
       b uob2 = PatchProxy.applyTwoRefs(uod$c, og1, uoc, c.class, "4");
       if (uob2 != PatchProxyResult.class) {
       }else {
          a.p(uod$c, "consumer");
          a.p(og1, "error");
          uob2 = uoc.c.subscribe(uod$c, og1);
          a.o(uob2, "swipeScreenProgressSubje¡­ubscribe\(consumer, error\)");
       }
       tb.c(uob2);
       SidebarProgressElement.n0(this.b).w.add(this.b.U);
       return;
    }
}
