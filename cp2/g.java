package cp2.g;
import zo2.a0;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import sj3.b;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import m91.b;
import sj3.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.i;
import zo2.a0$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zo2.a0$a;
import sj3.a;
import java.util.Iterator;
import java.lang.Iterable;
import zo2.a0$c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import pp.c;
import hp2.b;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController$getLatestAACExtraData$1;
import msd.l;
import yx2.e;
import java.lang.Throwable;
import java.util.Collection;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;

public final class g implements a0, LivePlayerEventListener, LivePlayerBufferListener, b	// class@0023c1
{
    public final i b;
    public final i c;
    public final i d;
    public final VoicePartyPlayerController e;
    public final b f;
    public final l g;

    public void g(VoicePartyPlayerController p0,b p1,l p2){
       a.p(p0, "livePlayerController");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.b = new i();
       this.c = new i();
       this.d = new i();
       p0.i(this);
       p0.h(this);
       if (p2 != null) {
          p2.b(this);
       }
       return;
    }
    public void a(a0$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.b.remove(p0);
       return;
    }
    public void b(a0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       this.c.remove(p0);
       return;
    }
    public void c(){
       a.a(this);
    }
    public void d(a0$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       this.b.add(p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       a.b(this, p0, p1);
    }
    public void f(a0$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       a.p(p0, "listener");
       this.d.remove(p0);
       return;
    }
    public void g(a0$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "10")) {
          return;
       }
       a.p(p0, "listener");
       this.d.add(p0);
       return;
    }
    public void h(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "16")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "14")) {
          b.Z(b.a(), "ktv enable player");
          og = this.f;
          if (og != null) {
             og.yj(AudienceBizRelation.VOICE_PARTY_GUEST);
          }
       }
       return;
    }
    public byte[] i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, g.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, VoicePartyPlayerController.class, "41");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.b(VoicePartyPlayerController$getLatestAACExtraData$1.INSTANCE);
       }
       return obj1;
    }
    public void j(a0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.c.add(p0);
       return;
    }
    public void onBufferEnd(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onBufferEnd();
       }
       return;
    }
    public void onBufferStart(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().onBufferStart();
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(this, p0);
    }
    public void onLiveEventChange(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       try{
          if (p0 != null && (this.b.isEmpty() ^ 0x01)) {
             LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = LiveFlvStream$LiveFlvStreamMessage.parseFrom(p0);
             Iterator iterator = this.b.iterator();
             while (iterator.hasNext()) {
                a.o(liveFlvStrea, "message");
                iterator.next().onEvent(liveFlvStrea);
             }
          }
          return;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       this.e.u(this);
       this.e.t(this);
       g tg = this.g;
       if (tg != null) {
          tg.c(this);
       }
       return;
    }
    public void stopPlay(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "15")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "13")) {
          b.Z(b.a(), "ktv disable player");
          og = this.f;
          if (og != null) {
             og.Pj(AudienceBizRelation.VOICE_PARTY_GUEST);
          }
       }
       return;
    }
}
