package nn3.i;
import nn3.c;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import nn3.i$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import android.content.Context;
import eo3.i;
import eo3.n;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import mrd.c;
import crd.b;
import lnc.b9;
import nn3.h;
import erd.g;
import brd.t;
import eo3.a;
import om3.d;
import om3.a;
import eo3.b0;
import g62.c;
import g62.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import nn3.f;
import com.gifshow.tuna.player.poi.e;
import wkd.b;
import i62.a;
import nn3.i$b;
import nn3.i$b$a;
import nn3.i$b$b;
import nn3.g;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u52.u;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import rm3.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import h62.c;
import java.util.Map;
import nm3.c;
import java.util.Objects;

public class i extends c	// class@0036ba
{
    public final MutableLiveData m;
    public final MutableLiveData n;
    public b o;
    public final n p;
    public b q;
    public b r;

    public void i(w p0){
       i oi = i.class;
       super(p0);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.m = mutableLiveD;
       this.n = new MutableLiveData(Boolean.FALSE);
       i$a uoa = new i$a(this);
       this.p = uoa;
       if (PatchProxy.applyVoid(null, this, oi, "8")) {
       }else {
          this.F0();
          mutableLiveD.setValue(this.d.b().getString(R.string.arg_RES_7f1012b6));
       }
       this.d.d().f(uoa);
       if (!PatchProxy.applyVoid(null, this, oi, "10")) {
          RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
          if (redPacketCon != null) {
             b9.a(this.r);
             this.r = redPacketCon.b().subscribe(new h(this, redPacketCon));
          }
       }
       return;
    }
    public final void D0(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "7")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       d uod = this.d.f().e();
       b0 uob0 = this.d.h();
       i = uob0.b();
       this.o = b.b().d(uod.a().getLiveStreamId(), uod.a().d(), i, uob0.a()).map(new e()).observeOn(d.a).subscribe(new f(redPacketCon), e.b);
       b.a(0x4c63d520).a(this.d.h().a());
       return;
    }
    public void E0(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.x0(p0);
       if (p0 instanceof i$b$a) {
          this.D0();
          this.G0();
       }
       if (p0 instanceof i$b$b) {
          this.H0();
       }
       return;
    }
    public void F0(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       if (redPacketCon.m()) {
          this.n.setValue(Boolean.FALSE);
       }else {
          this.n.setValue(Boolean.TRUE);
          i tq = this.q;
          if (tq != null) {
             tq.dispose();
          }
          this.q = redPacketCon.h().observeOn(d.a).subscribe(new g(this));
       }
       return;
    }
    public void G0(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       a uoa = this.d.f().e().a();
       e0 uoe0 = uoa.i();
       ClientContent$LiveStreamPackage liveStreamPa = uoa.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = uoa.B();
       u.i(uoe0, liveStreamPa, liveVoicePar, this.d.h().a(), this.d.h().b(), redPacketCon.l(), this.d.j());
       SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
       long l = a.d(sCLiveCondit);
       c uoc = a.b(l, sCLiveCondit.redPackId, sCLiveCondit.redPackType, LiveRedPacketAction.RED_PACK_POPUP_GRAB_CLICK);
       this.g.a(uoc.f());
       return;
    }
    public void H0(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       if (redPacketCon.m()) {
          return;
       }
       SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
       long l = a.d(sCLiveCondit);
       c uoc = a.b(l, sCLiveCondit.redPackId, sCLiveCondit.redPackType, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW);
       Objects.requireNonNull(this.d.f().e());
       this.g.a(uoc.f());
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       super.onCleared();
       i to = this.o;
       if (to != null) {
          to.dispose();
       }
       to = this.q;
       if (to != null) {
          to.dispose();
       }
       this.d.d().d(this.p);
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       super.z0();
       this.F0();
       return;
    }
}
