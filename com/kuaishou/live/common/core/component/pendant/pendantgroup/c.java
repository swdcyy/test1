package com.kuaishou.live.common.core.component.pendant.pendantgroup.c;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import p91.m;
import cw1.s;
import cw1.d0;
import cw1.o;
import cw1.j;
import cw1.k;
import cw1.l;
import cw1.m;
import cw1.h;
import cw1.i;
import cw1.q;
import cw1.p;
import cw1.n;
import cw1.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h47.b;
import aq5.d;
import fq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import mw1.d;
import lt5.b;
import oq5.c;
import ty1.c;
import ty1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import w37.a;
import java.lang.Long;
import java.util.Objects;
import cw1.c0;
import cw1.l0;
import java.util.Iterator;
import java.util.List;

public class c extends g	// class@001717
{
    public final m i;
    public final s j;
    public final b k;
    public final b l;
    public final b m;
    public final b n;
    public final b o;
    public final d p;
    public final b q;
    public final b r;
    public final c s;
    public final b t;
    public final a u;

    public void c(m p0,s p1,d0 p2){
       super(p2);
       this.k = new o(this);
       this.l = new j(this);
       this.m = new k(this);
       this.n = new l(this);
       this.o = new m(this);
       this.p = new h(this);
       i oi = new i(this);
       this.q = oi;
       this.r = new q(this);
       this.s = new p(this);
       this.t = new n(this);
       this.u = new r(this);
       this.i = p0;
       this.j = p1;
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
       }else {
          p1.Q1(oi);
       }
       return;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, c.class, "19")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_MULTI_PK};
       this.i.A0().G5(this.g, uoaArray);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.i.A0().G5(this.c, uoaArray);
       a[] uoaArray1 = new a[]{AudienceBizRelation.PK_SMALL_WINDOW};
       this.i.A0().G5(this.n, uoaArray1);
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, c.class, "26")) {
          return;
       }
       if (this.j.Z3()) {
          this.j.X0(this.p);
       }
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, c.class, "25")) {
          return;
       }
       this.j.R1(this.r);
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, c.class, "34")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.i.A0().G5(this.d, uoaArray);
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, c.class, "22")) {
          return;
       }
       this.j.Q0(this.s);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, c.class, "20")) {
          return;
       }
       if (this.i.w() == null) {
          return;
       }
       this.i.w().a(this.h);
       return;
    }
    public final boolean H(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.l();
    }
    public final boolean I(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.X3();
    }
    public final void J(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.I()) {
          this.d(LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE);
          this.c(LivePendantContainerScene.PLAY_CONFIG_PORTRAIT);
       }else {
          this.d(LivePendantContainerScene.PLAY_CONFIG_PORTRAIT);
          this.c(LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE);
       }
       this.c(LivePendantContainerScene.SCREEN_LANDSCAPE);
       this.c(LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "27")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT_NEW_STYLE_APPLY_ENTRANCE};
       this.i.A0().u5(this.l, uoaArray);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "31")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.MERCHANT_AUCTION_BUBBLE};
       this.i.A0().u5(this.o, uoaArray);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT_CENTER_STATUS_VIEW,AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW};
       this.i.A0().u5(this.k, uoaArray);
       uoaArray = new a[]{AudienceBizRelation.CHAT_VIDEO_VIEW};
       this.i.A0().u5(this.t, uoaArray);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.GUEST_ACTIVITY};
       this.i.A0().u5(this.m, uoaArray);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "29")) {
          return;
       }
       this.j.W3(this.u);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_LINE};
       this.i.A0().u5(this.e, uoaArray);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_MULTI_LINE};
       this.i.A0().u5(this.f, uoaArray);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_MULTI_PK};
       this.i.A0().u5(this.g, uoaArray);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       if (this.H()) {
          LivePendantContainerScene mULTI_TAB_ST = LivePendantContainerScene.MULTI_TAB_STYLE;
          g og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(mULTI_TAB_ST, Long.valueOf(600), this, og, "5")) {
             g tb = this.b;
             Objects.requireNonNull(tb);
             if (PatchProxy.isSupport(d0.class) && (!PatchProxy.applyVoidThreeRefs(mULTI_TAB_ST, Boolean.TRUE, Long.valueOf(600), tb, d0.class, "9") && tb.c(mULTI_TAB_ST, true))) {
                tb.a.c(600);
             }
          }
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.i.A0().u5(this.c, uoaArray);
       a[] uoaArray1 = new a[]{AudienceBizRelation.PK_SMALL_WINDOW};
       this.i.A0().u5(this.n, uoaArray1);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       if (this.I()) {
          this.d(LivePendantContainerScene.PLAY_CONFIG_LANDSCAPE);
       }
       if (this.j.Z3()) {
          this.j.Y3(this.p);
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, c.class, "24")) {
          return;
       }
       this.j.y2(this.r);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, c.class, "33")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.i.A0().u5(this.d, uoaArray);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       this.j.W0(this.s, true);
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       if (this.i.w() == null) {
          Iterator iterator = l0.a.iterator();
          while (iterator.hasNext()) {
             this.a.remove(iterator.next());
          }
          return;
       }else {
          this.i.w().b(this.h);
          return;
       }
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, c.class, "28")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT_NEW_STYLE_APPLY_ENTRANCE};
       this.i.A0().G5(this.l, uoaArray);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, c.class, "32")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.MERCHANT_AUCTION_BUBBLE};
       this.i.A0().G5(this.o, uoaArray);
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, c.class, "23")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_CENTER_STATUS_VIEW,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW};
       this.i.A0().G5(this.k, uoaArray);
       uoaArray = new a[]{AudienceBizRelation.CHAT_VIDEO_VIEW};
       this.i.A0().G5(this.t, uoaArray);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, c.class, "21")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.GUEST_ACTIVITY};
       this.i.A0().G5(this.m, uoaArray);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, c.class, "30")) {
          return;
       }
       this.j.x2(this.u);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_LINE};
       this.i.A0().G5(this.e, uoaArray);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, c.class, "18")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.LIVE_MULTI_LINE};
       this.i.A0().G5(this.f, uoaArray);
       return;
    }
}
