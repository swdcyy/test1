package lz1.c;
import lz1.e$b;
import bo1.h;
import lz1.c$a;
import nsd.u;
import lz1.e;
import sz1.e;
import mz1.b;
import xp5.g;
import lz1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import lz1.f;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveStageLayoutConfigHashMessage;
import com.kuaishou.live.livestage.g;
import com.kuaishou.live.livestage.f;
import je3.i;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Integer;
import fe3.b;
import java.util.List;
import java.lang.Number;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import bo1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;
import com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiFallbackEvent;
import lnc.i3;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Enum;
import k2b.u1;
import ke3.g;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer;
import je3.g;

public final class c extends h implements e$b	// class@00308c
{
    public Pair b;
    public Pair c;
    public int d;
    public String e;
    public LayoutConfig f;
    public final e g;
    public final e h;
    public final b i;
    public final g j;
    public final d k;
    public static final c$a l;

    static {
       c.l = new c$a(null);
    }
    public void c(e p0,e p1,b p2,g p3,d p4){
       a.p(p0, "detector");
       a.p(p1, "multiInteractManager");
       a.p(p3, "liveInfoManager");
       a.p(p4, "config");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       Long longx = Long.valueOf(0);
       this.b = new Pair(null, longx);
       this.c = new Pair(null, longx);
       this.d = 2;
    }
    public void b(long p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoc, "5")) {
          return;
       }
       if (p1 - (long)this.k.a() >= 0) {
          int i = this.d - 1;
          this.d = i;
          if (i <= 0) {
             this.n();
             this.o();
          }
       }
       return;
    }
    public void c(long p0,long p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, c.class, "7")) {
          return;
       }
       this.l();
       return;
    }
    public void d(long p0,long p1,long p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, c.class, "6")) {
          return;
       }
       if (p2 - (long)this.k.a() >= 0) {
          int i = this.d - 1;
          this.d = i;
          if (i <= 0) {
             this.n();
             this.o();
          }
       }
       return;
    }
    public void g(LiveFlvStream$LiveFlvStreamMessage p0){
       f uof;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       a.p(p0, "message");
       f.f(this, p0);
       p0 = p0.liveStageLayoutConfigHash;
       if (p0 != null) {
          LiveFlvStream$LiveStageLayoutConfigHashMessage layoutConfig = p0.layoutConfigHash;
          LiveFlvStream$LiveStageLayoutConfigHashMessage bizType = p0.bizType;
          g og = this.h.vi();
          String str = null;
          if (og != null) {
             uof = og.g();
             if (uof == null) {
             label_002b :
                c ti = this.i;
                if (ti != null) {
                   og = ti.Z3();
                   if (og != null) {
                      uof = og.g();
                   }
                }
                uof = str;
             }
          }else {
             goto label_002b ;
          }
          if (uof != null) {
             i oi = uof.e();
             if (oi != null) {
                LayoutConfig layoutConfig1 = oi.j();
                if (layoutConfig1 != null && (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(layoutConfig1, Long.valueOf(layoutConfig), Integer.valueOf(bizType), this, c.class, "4"))) {
                   if (a.g(this.c.getFirst(), layoutConfig1) ^ 0x01) {
                      if (a.g(this.e, layoutConfig1.b().a()) ^ 0x01) {
                         this.e = str;
                      }
                      Pair pair = (this.k.b.contains(Integer.valueOf(layoutConfig1.b().b())))? new Pair(layoutConfig1, Long.valueOf(layoutConfig1.f())): new Pair(str, Long.valueOf(0));
                      this.c = pair;
                   }
                   if (layoutConfig > 0 && !layoutConfig - this.c.getSecond().longValue()) {
                      LayoutConfig first = this.c.getFirst();
                      if (first != null) {
                         b uob = first.b();
                         if (uob != null && bizType == uob.b()) {
                            if (a.g(this.b.getFirst(), layoutConfig1) ^ 0x01) {
                               this.b = new Pair(layoutConfig1, Long.valueOf(layoutConfig));
                            }
                         }
                      }
                   }
                   this.l();
                }
             }
          }
       }
    label_0104 :
       return;
    }
    public void h(long p0){
       f.e(this, p0);
    }
    public void i(LiveStageProto$LayoutConfig p0,long p1){
       f.d(this, p0, p1);
    }
    public boolean j(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "config");
       b.Z(LiveLogTag.LIVE_INTERACT_WATCH_DOG, "[SeiFallback] start plugin: config="+this.k);
       this.g.a(this);
       return true;
    }
    public boolean k(LiveInteractWatchDogPluginStopReason p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "reason");
       b.Z(LiveLogTag.LIVE_INTERACT_WATCH_DOG, "[SeiFallback] stop plugin");
       this.g.e(this);
       return true;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.b = new Pair(null, Long.valueOf(0));
       this.d = 2;
       this.f = null;
       return;
    }
    public final void m(LayoutConfig p0,long p1,LiveAudienceSeiFallbackEvent p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, c.class, "11")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("liveStreamId", this.j.getLiveStreamId());
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       oi3.d("currentUserId", qCurrentUser.getId());
       oi3.c("liveInteractBizType", Integer.valueOf(p0.b().b()));
       oi3.d("liveInteractBizId", p0.b().a());
       oi3.c("seiFallbackEvent", Integer.valueOf(p2.ordinal()));
       oi3.c("seiFallbackLayoutHash", Long.valueOf(p1));
       String str = oi3.e();
       b.Z(LiveLogTag.LIVE_INTERACT_WATCH_DOG, "[LiveStage][SeiFallback] Report event:"+str);
       u1.R("LIVE_INTERACT_WATCH_DOG_SEI_FALLBACK", str, 3);
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       LayoutConfig first = this.c.getFirst();
       if (first != null && (a.g(first.b().a(), this.e) ^ 0x01)) {
          this.e = first.b().a();
          this.m(first, 0, LiveAudienceSeiFallbackEvent.FALLBACK_SEI_ERROR);
       }
       return;
    }
    public final void o(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "9")) {
          return;
       }
       LayoutConfig first = this.b.getFirst();
       if (first != null && (a.g(this.f, first) ^ 0x01)) {
          LiveStreamSEI$MetaDataContainer first1 = g.a.a(first).getFirst();
          b.Z(LiveLogTag.LIVE_INTERACT_WATCH_DOG, "[LiveStage][SeiFallback] USE fallback layoutConfig: "+first);
          g og = this.h.vi();
          f uof = (og != null)? og.g(): objArray;
          if (uof != null) {
             og = this.h.vi();
             if (og != null) {
                og = og.getPlayer();
                if (og != null) {
                   og.c(first1);
                }
             }
          }
          c ti = this.i;
          if (ti != null) {
             og = ti.Z3();
             if (og != null) {
                objArray = og.g();
             }
          }
          if (objArray != null) {
             g player = this.i.Z3().getPlayer();
             if (player != null) {
                player.c(first1);
             }
          }
          this.f = first;
          this.m(first, this.b.getSecond().longValue(), LiveAudienceSeiFallbackEvent.FALLBACK_LAYOUT_UPDATE);
       }
       return;
    }
}
