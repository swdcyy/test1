package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import yw2.k;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import msd.a;
import mw2.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bx2.c;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import q00.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import yw2.l;
import com.kuaishou.live.core.voiceparty.theater.player.a$d;
import yw2.b;
import com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$2;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$3;
import msd.p;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class AudienceLiveTheaterPlayerController extends AudienceTheaterPlayerController	// class@0019de
{
    public final a A;
    public final a B;
    public final VoicePartyPlayerController C;
    public final RtcManager D;
    public final c u;
    public TheaterPlayer v;
    public final boolean w;
    public final k x;
    public final a y;
    public final boolean z;

    public void AudienceLiveTheaterPlayerController(k p0,a p1,boolean p2,a p3,a p4,VoicePartyPlayerController p5,RtcManager p6,d p7,t p8,t p9){
       int i = this;
       Object obj = p3;
       Object obj1 = p4;
       Object obj2 = p5;
       Object obj3 = p6;
       a.p(p0, "playerViewOwner");
       a.p(p1, "playSource");
       a.p(obj, "aryaSignFetcher");
       a.p(obj1, "reporterFactory");
       a.p(obj2, "playerController");
       a.p(obj3, "rtcManager");
       Object obj4 = p7;
       a.p(obj4, "syncCommandDispatcher");
       Object obj5 = p8;
       a.p(obj5, "offlineSignal");
       Object obj6 = p9;
       a.p(obj6, "appBackgroundSignal");
       super(p3, p6, obj4, obj5, obj6);
       i.x = p0;
       i.y = p1;
       boolean b = p2;
       i.z = b;
       i.A = obj;
       i.B = obj1;
       i.C = obj2;
       i.D = obj3;
       i.u = super();
       i.v = this.G(p6, p1, b, p4, p5);
       i.w = true;
    }
    public void C(b p0,boolean p1){
       AudienceLiveTheaterPlayerController uAudienceLiv = AudienceLiveTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceLiv) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAudienceLiv, "2")) {
          return;
       }
       if (this.z != null && p1) {
          this.H();
       }else {
          super.C(p0, p1);
       }
       return;
    }
    public final TheaterPlayer G(RtcManager p0,a p1,boolean p2,a p3,VoicePartyPlayerController p4){
       l obj;
       l ol;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AudienceLiveTheaterPlayerController uAudienceLiv = AudienceLiveTheaterPlayerController.class;
       int i = 4;
       int i1 = 1;
       int i2 = 5;
       if (PatchProxy.isSupport(uAudienceLiv)) {
          Object[] objArray = new Object[i2];
          objArray[0] = p0;
          objArray[i1] = p1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          obj = PatchProxy.apply(objArray, this, uAudienceLiv, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uAudienceLiv = this.u;
       Objects.requireNonNull(uAudienceLiv);
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = p0;
          objArray1[i1] = p1;
          objArray1[2] = Boolean.valueOf(p2);
          objArray1[3] = p3;
          objArray1[i] = p4;
          obj = PatchProxy.apply(objArray1, uAudienceLiv, c.class, "1");
          if (obj != patchProxyRe) {
          label_0089 :
             obj.h(this.x);
             obj.m(new AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$1(this));
             obj.n(new AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$2(this));
             obj.f(new AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$3(this));
             obj.d(new AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4(obj, this));
             if (obj.o() != null) {
                LiveQualityItem liveQualityI = obj.o();
                List qualityList = obj.getQualityList();
                if (qualityList == null) {
                   qualityList = CollectionsKt__CollectionsKt.E();
                }
                this.g(liveQualityI, qualityList);
             }
             return obj;
          }
       }
       a.p(p0, "rtcManager");
       a.p(p1, "source");
       a.p(p3, "reporterFactory");
       a.p(p4, "playerController");
       if (p2 && !p0.g()) {
          ol = new l(p4);
       }else if(p1 instanceof a$d){
          ol = new b(p1.d(), p1.c(), p3);
       }else {
          throw new IllegalArgumentException("unknown play source "+p1);
       }
       obj = ol;
       goto label_0089 ;
    }
    public final void H(){
       AudienceLiveTheaterPlayerController uAudienceLiv = AudienceLiveTheaterPlayerController.class;
       if (PatchProxy.applyVoid(null, this, uAudienceLiv, "4")) {
          return;
       }
       this.u.a(this.l());
       TheaterPlayer theaterPlaye = this.G(this.D, this.y, this.z, this.B, this.C);
       if (!PatchProxy.applyVoidOneRefs(theaterPlaye, this, uAudienceLiv, "1")) {
          a.p(theaterPlaye, "<set-?>");
          this.v = theaterPlaye;
       }
       this.B(0);
       return;
    }
    public TheaterPlayer l(){
       return this.v;
    }
    public boolean n(){
       return this.w;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, AudienceLiveTheaterPlayerController.class, "7")) {
          return;
       }
       super.q();
       this.x.hide();
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, AudienceLiveTheaterPlayerController.class, "6")) {
          return;
       }
       this.u.a(this.l());
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, AudienceLiveTheaterPlayerController.class, "5")) {
          return;
       }
       if (this.z == null) {
          this.H();
       }
       return;
    }
}
