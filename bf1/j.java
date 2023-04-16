package bf1.j;
import te1.b;
import java.lang.Object;
import bf1.i;
import android.view.View;
import te1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import df1.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.MotionEvent;
import te1.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import ef1.c;
import ef1.e;
import xp5.i;
import lp3.c;
import lp3.e;
import android.content.Context;
import s51.c;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;
import ok.x;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import ekd.k1;
import z1.a;
import java.lang.Boolean;
import ff1.a;

public abstract class j implements b	// class@000378
{
    public boolean a;
    public x b;
    public e c;
    public Context d;
    public a e;
    public a f;

    public void j(){
       super();
       this.a = false;
       this.b = i.b;
    }
    public void a(View p0){
       a.b(this, p0);
    }
    public final View b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       if (p0 instanceof c && this.a != null) {
          b = false;
       }
       if (b) {
          return null;
       }else if(this.q(p0)){
          b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessageHandler.onCreateView intercepted by biz");
          return null;
       }else {
          return this.h(p0);
       }
    }
    public void c(Object p0){
       a.d(this, p0);
    }
    public void d(Object p0){
       a.a(this, p0);
    }
    public void e(Object p0,MotionEvent p1){
       a.c(this, p0, p1);
    }
    public void f(d p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "4")) {
          return;
       }
       if (this.g() && p0 != null) {
          p0 = p0.d;
          if (p0 instanceof c) {
             e.a(p0, this.i(), this.j());
          }
       }
       return;
    }
    public boolean g(){
       return true;
    }
    public abstract View h(c p0);
    public final ClientContent$LiveStreamPackage i(){
       Object obj = PatchProxy.apply(null, this, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(i.class).Bb();
    }
    public final ClientContent$LiveVoicePartyPackageV2 j(){
       Object obj = PatchProxy.apply(null, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(i.class).l3();
    }
    public final Context k(){
       return this.d;
    }
    public final c l(){
       Object obj = PatchProxy.apply(null, this, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(c.class);
    }
    public final e m(){
       return this.c;
    }
    public final LiveAudienceDelayInfosResponse$HighFluencyStyle n(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
    public final void o(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.i();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.j();
       if (!PatchProxy.applyVoidThreeRefs(p0, liveStreamPa, liveVoicePar, null, e.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_FREQUENTLY_ACTION_GUIDE_BUBBLE";
          i3 oi3 = i3.f();
          oi3.d("biz_id", p0.a());
          oi3.c("count", Integer.valueOf(p0.b()));
          oi3.d("style", p0.d());
          oi3.d("business_params", p0.e());
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          if (liveVoicePar != null) {
             uContentPack.liveVoicePartyPackage = liveVoicePar;
          }
          int i = p0.f();
          if (i > 0) {
             ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
             uContentPack.giftPackage = giftPackage;
             giftPackage.identity = String.valueOf(i);
          }
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       k1.n(this);
       this.a = false;
       return;
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "7")) {
          return;
       }
       j tf = this.f;
       if (tf != null) {
          tf.accept(p0);
       }
       return;
    }
    public boolean q(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.e.a(p0) ^ 0x01);
    }
}
