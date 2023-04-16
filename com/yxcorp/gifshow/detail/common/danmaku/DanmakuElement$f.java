package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$f;
import jm5.c;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import com.kwai.feature.api.danmaku.params.DanmakuSendType;
import nm5.p;
import kotlin.jvm.internal.a;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import brd.y;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import e17.i;
import zm5.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import jm5.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import java.util.Objects;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import kotlin.Triple;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;

public final class DanmakuElement$f implements c	// class@0013de
{
    public boolean a;
    public boolean b;
    public final DanmakuElement c;

    public void DanmakuElement$f(DanmakuElement p0){
       this.c = p0;
       super();
    }
    public void G(boolean p0,boolean p1){
       DanmakuElement$f uof = DanmakuElement$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "1")) {
          return;
       }
       if (p0) {
          return;
       }
       SlideGuideManager.m.a().e(p1);
       return;
    }
    public void H(boolean p0,DanmakuSendType p1,p p2){
       if (PatchProxy.isSupport(DanmakuElement$f.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, DanmakuElement$f.class, "4")) {
          return;
       }
       a.p(p1, "type");
       if (!p0) {
          return;
       }
       e player = DanmakuElement.p0(this.c).getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPaused()) {
          this.c.D0();
       }else if(this.a()){
          DanmakuElement$f tc = this.c;
          if (tc.R == null) {
             DanmakuElement.q0(tc).onNext(Boolean.TRUE);
          }
       }
       DanmakuSwitchUtils h = DanmakuSwitchUtils.h;
       if (!h.d()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101eb0);
          h.a(true);
       }
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$f.class, "8")) {
          return;
       }
       DanmakuElement$f tc = this.c;
       if (tc.X0 != null) {
          return;
       }
       DanmakuElement.r0(tc).b(true, 6);
       return;
    }
    public void L(BaseEditorFragment$g p0){
       b.d(this, p0);
    }
    public void S(float p0,float p1){
       b.a(this, p0, p1);
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$f.class, "7")) {
          return;
       }
       DanmakuElement$f tc = this.c;
       if (tc.X0 != null) {
          return;
       }
       DanmakuElement.r0(tc).b(false, 6);
       return;
    }
    public final boolean a(){
       e obj = PatchProxy.apply(null, this, DanmakuElement$f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = DanmakuElement.p0(this.c).getPlayer();
       a.o(obj, "mPlayModule.player");
       boolean b = false;
       if (!obj.isPrepared() && (!DanmakuElement.o0(this.c).isImageType() || (j.h(b.b(DanmakuElement.o0(this.c))) && (DanmakuElement.o0(this.c).isSinglePhoto() || DanmakuElement.o0(this.c).isAtlasPhotos())))) {
          b = true;
       }
    label_0061 :
       return b;
    }
    public void e0(){
       b.i(this);
    }
    public void f0(){
       DanmakuElement$f tc;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DanmakuElement$f.class, "5")) {
          return;
       }
       e player = DanmakuElement.p0(this.c).getPlayer();
       a.o(player, "mPlayModule.player");
       if (player.isPlaying()) {
          this.a = true;
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, DanmakuElement.class, "16")) {
             a uoa = a.d();
             DanmakuElement v = tc.v;
             if (v == null) {
                a.S("mPhoto");
             }
             uoa.k(new PlayEvent(v, PlayEvent$Status.PAUSE, true, "DanmakuElement"));
          }
       }else if(this.a()){
          tc = this.c;
          if (tc.R != null) {
             this.b = true;
             DanmakuElement.q0(tc).onNext(Boolean.TRUE);
          }
       }
       return;
    }
    public void j0(){
       b.c(this);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$f.class, "6")) {
          return;
       }
       boolean b = false;
       if (this.a != null) {
          this.a = b;
          this.c.D0();
       }else if(this.b != null){
          this.b = b;
          DanmakuElement.q0(this.c).onNext(Boolean.TRUE);
       }
       return;
    }
    public void v0(boolean p0){
       DanmakuElement$f uof = DanmakuElement$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       SlideGuideManager.m.a().e(p0);
       return;
    }
    public void w0(Triple p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuElement$f.class, "3")) {
          return;
       }
       a.p(p0, "triple");
       DanmakuElement e = this.c.E;
       if (e == null) {
          a.S("mMilanoEventBus");
       }
       e.u.onNext(p0);
       return;
    }
}
