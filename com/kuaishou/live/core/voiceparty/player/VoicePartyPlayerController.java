package com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import yx2.e;
import com.kwai.video.waynelive.LivePlayerController;
import fu2.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$renderOnSurface$1;
import msd.l;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$addBufferListener$1;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$addLiveEventListener$1;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$addLiveInterActiveTsptListener$1;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$addLivePlayerTypeChangeListener$1;
import java.util.List;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$addOnVideoSizeChangedListener$1;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getCurrentLiveStreamType$1;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getVideoHeight$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getVideoWidth$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$isDestroyed$1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeBufferListener$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeLiveEventListener$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeLiveInterActiveTsptListener$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeLivePlayerTypeChangeListener$1;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$removeOnVideoSizeChangedListener$1;

public class VoicePartyPlayerController extends e	// class@001835
{
    public final List f;
    public final LivePlayerController g;
    public final f h;

    public void VoicePartyPlayerController(LivePlayerController p0,f p1){
       a.p(p1, "viewRenderDelegate");
       super(p0, null, 2, null);
       this.g = p0;
       this.h = p1;
       this.f = new ArrayList();
    }
    public static void y(VoicePartyPlayerController p0,LivePlayTextureView p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       Objects.requireNonNull(p0);
       VoicePartyPlayerController voicePartyPl = VoicePartyPlayerController.class;
       if (!PatchProxy.isSupport(voicePartyPl) || !PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), p0, voicePartyPl, "15")) {
          p0.a(new VoicePartyPlayerController$renderOnSurface$1(p0, p1, p2));
       }
       return;
    }
    public void c(Object p0){
       this.r(p0);
    }
    public void e(Object p0){
       this.s(p0);
    }
    public final void h(LivePlayerBufferListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "11")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$addBufferListener$1(p0));
       return;
    }
    public final void i(LivePlayerEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$addLiveEventListener$1(p0));
       return;
    }
    public final void j(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$addLiveInterActiveTsptListener$1(p0));
       return;
    }
    public final void k(LivePlayerTypeChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$addLivePlayerTypeChangeListener$1(p0));
       if (this.m() == null) {
          this.f.add(p0);
       }
       return;
    }
    public final void l(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$addOnVideoSizeChangedListener$1(p0));
       return;
    }
    public final LivePlayerController m(){
       return this.g;
    }
    public final Integer n(){
       Object obj = PatchProxy.apply(null, this, VoicePartyPlayerController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(VoicePartyPlayerController$getCurrentLiveStreamType$1.INSTANCE);
    }
    public int o(){
       Integer obj = PatchProxy.apply(null, this, VoicePartyPlayerController.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b(VoicePartyPlayerController$getVideoHeight$1.INSTANCE);
       int i = (obj != null)? obj.intValue(): 0;
       return i;
    }
    public int p(){
       Integer obj = PatchProxy.apply(null, this, VoicePartyPlayerController.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b(VoicePartyPlayerController$getVideoWidth$1.INSTANCE);
       int i = (obj != null)? obj.intValue(): 0;
       return i;
    }
    public final boolean q(){
       Boolean obj = PatchProxy.apply(null, this, VoicePartyPlayerController.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b(VoicePartyPlayerController$isDestroyed$1.INSTANCE);
       boolean b = (obj != null)? obj.booleanValue(): false;
       return b;
    }
    public void r(LivePlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "17")) {
          return;
       }
       a.p(p0, "instance");
       super.c(p0);
       this.h.a();
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().onLiveTypeChange(p0.getCurrentLiveStreamType());
       }
       this.f.clear();
       return;
    }
    public void s(LivePlayerController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "18")) {
          return;
       }
       this.h.onRelease();
       return;
    }
    public final void t(LivePlayerBufferListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$removeBufferListener$1(p0));
       return;
    }
    public final void u(LivePlayerEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$removeLiveEventListener$1(p0));
       return;
    }
    public final void v(IKwaiMediaPlayer$OnLiveInterActiveListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$removeLiveInterActiveTsptListener$1(p0));
       return;
    }
    public final void w(LivePlayerTypeChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$removeLivePlayerTypeChangeListener$1(p0));
       if (this.m() == null) {
          this.f.remove(p0);
       }
       return;
    }
    public final void x(IMediaPlayer$OnVideoSizeChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyPlayerController.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.a(new VoicePartyPlayerController$removeOnVideoSizeChangedListener$1(p0));
       return;
    }
}
