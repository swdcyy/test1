package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$f;
import jm5.c;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import jm5.b;
import com.kwai.feature.api.danmaku.params.DanmakuSendType;
import nm5.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import e17.i;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.util.Objects;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.Triple;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;

public final class AdDanmakuElement$f implements c	// class@0016fc
{
    public boolean a;
    public final AdDanmakuElement b;

    public void AdDanmakuElement$f(AdDanmakuElement p0){
       this.b = p0;
       super();
    }
    public void G(boolean p0,boolean p1){
       b.j(this, p0, p1);
    }
    public void H(boolean p0,DanmakuSendType p1,p p2){
       if (PatchProxy.isSupport(AdDanmakuElement$f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, AdDanmakuElement$f.class, "2")) {
          return;
       }
       a.p(p1, "type");
       if (!p0) {
          return;
       }
       e player = AdDanmakuElement.p0(this.b).getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPaused()) {
          this.b.B0();
       }
       DanmakuSwitchUtils h = DanmakuSwitchUtils.h;
       if (!h.d()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101eb0);
          h.a(true);
       }
       return;
    }
    public void I(){
    }
    public void L(BaseEditorFragment$g p0){
       b.d(this, p0);
    }
    public void S(float p0,float p1){
       b.a(this, p0, p1);
    }
    public void V(){
    }
    public void e0(){
       b.i(this);
    }
    public void f0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDanmakuElement$f.class, "3")) {
          return;
       }
       e player = AdDanmakuElement.p0(this.b).getPlayer();
       a.o(player, "mPlayModule.player");
       if (!player.isPlaying()) {
          return;
       }
       this.a = true;
       AdDanmakuElement$f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, AdDanmakuElement.class, "15")) {
          a uoa = a.d();
          AdDanmakuElement v = tb.v;
          if (v == null) {
             a.S("mPhoto");
          }
          uoa.k(new PlayEvent(v, PlayEvent$Status.PAUSE, true, "AdDanmakuElement"));
       }
       return;
    }
    public void j0(){
       b.c(this);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$f.class, "4")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       this.a = false;
       this.b.B0();
       return;
    }
    public void v0(boolean p0){
       b.h(this, p0);
    }
    public void w0(Triple p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDanmakuElement$f.class, "1")) {
          return;
       }
       a.p(p0, "triple");
       AdDanmakuElement c = this.b.C;
       if (c == null) {
          a.S("mMilanoEventBus");
       }
       c.u.onNext(p0);
       return;
    }
}
