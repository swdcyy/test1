package com.kuaishou.live.audience.component.gift.gift.b;
import qr5.b$a;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.audience.component.gift.gift.b$a;
import az0.c;
import az0.e;
import az0.d;
import com.kuaishou.live.audience.component.gift.gift.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import az0.h;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mq5.h;
import mq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import m91.b;
import sr5.a;
import u53.b;
import java.util.Objects;
import bm1.b;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import qr5.b;
import lp3.c;
import lp3.i;
import eg1.e;
import lz2.c;
import tj3.o;
import tj3.e;
import ry1.b;
import brd.t;
import az0.f;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e93.f;
import java.util.List;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import az0.g;
import java.lang.Runnable;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.robust.PatchProxyResult;
import az0.k;
import java.util.Map;
import ag1.e;
import co2.f2;

public class b extends i implements b$a	// class@000b6e
{
    public final List U0;
    public f2 V0;
    public Boolean W0;
    public e X;
    public final c X0;
    public e Y;
    public final o Y0;
    public a0 Z;
    public final h Z0;
    public Set a1;
    public final b b1;
    public i0 c1;
    public b d1;
    public static String sLivePresenterClassName = "LiveAudienceGiftFeedPresenter";

    public void b(){
       super();
       this.U0 = new CopyOnWriteArrayList();
       this.X0 = new b$a(this);
       this.Y0 = new c(this);
       this.Z0 = new e(this);
       this.b1 = new d(this);
       this.c1 = new b$b(this);
    }
    public void E8(){
       i tD;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          uob = this.Z;
          if (uob.h != null) {
             uob.y2.P4(new h(this));
          }
       }
       this.Z.D2.Km(this.Z0);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.Z.Y0.u5(this.b1, uoaArray);
       if (b.g(this.Z)) {
          tD = this.D;
          Objects.requireNonNull(tD);
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tD, uob1, "8")) {
             tD.b.setIsGzone(1);
          }
       }
       tD = this.F;
       if (tD != null) {
          uob = tD.a(b.class);
          this.d1 = uob;
          uob.oi(this);
       }
       tD = this.F;
       if (tD != null) {
          tD.a(e.class).B0(this.X0);
       }
       this.Y.c(this.Y0);
       this.X7(this.F.a(b.class).W().subscribe(new f(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.J8();
       this.Z.D2.le(this.Z0);
       a[] uoaArray = new a[0];
       this.Z.Y0.G5(this.b1, uoaArray);
       b td1 = this.d1;
       if (td1 != null) {
          td1.j8(this);
          f.g(this);
       }
       i tF = this.F;
       if (tF != null) {
          tF.a(e.class).g1(this.X0);
       }
       this.Y.B(this.Y0);
       this.U0.clear();
       return;
    }
    public void O7(LiveFlvStream$LiveFlvStreamMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = p0.facePointInfo;
       if (liveFlvStrea != null && liveFlvStrea.facePointArray != null) {
          f.k("updateLocalRendererFacePointInfo", new g(this, p0), this, 400);
       }
       return;
    }
    public boolean S8(){
       a0 e = this.Z.e;
       boolean b = false;
       if (e != null && e.mPatternType == 2) {
          b = true;
       }
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b.class, new k());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.X = this.q8(e.class);
       this.Y = this.r8("LIVE_LOG_REPORTER");
       this.Z = this.q8(a0.class);
       this.V0 = this.s8(f2.class);
       return;
    }
    public boolean z1(int p0){
       boolean b = (16 == p0)? true: false;
       return b;
    }
}
