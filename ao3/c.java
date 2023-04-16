package ao3.c;
import nn3.c;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import ao3.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.i;
import eo3.n;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import mrd.c;
import crd.b;
import lnc.b9;
import ao3.b;
import erd.g;
import brd.t;
import ao3.c$b;
import ao3.c$b$a;
import eo3.a;
import om3.d;
import om3.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import rm3.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import h62.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u52.u;
import java.util.Map;
import nm3.c;
import ao3.c$b$b;
import java.util.Objects;
import t45.d;
import brd.z;
import ao3.a;

public class c extends c	// class@000289
{
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final n o;
    public b p;
    public b q;

    public void c(w p0){
       c uoc = c.class;
       super(p0);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.m = mutableLiveD;
       this.n = new MutableLiveData(Boolean.FALSE);
       c$a uoa = new c$a(this);
       this.o = uoa;
       if (PatchProxy.applyVoid(null, this, uoc, "6")) {
       }else {
          this.E0();
          mutableLiveD.setValue(a1.p(R.string.arg_RES_7f101fde));
       }
       this.d.d().f(uoa);
       if (!PatchProxy.applyVoid(null, this, uoc, "1")) {
          RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
          if (redPacketCon != null) {
             b9.a(this.q);
             this.q = redPacketCon.b().subscribe(new b(this, redPacketCon));
          }
       }
       return;
    }
    public void D0(c$b p0){
       c$b$a a;
       RedPacketConditionRedPackInfoWrapper redPacketCon;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       this.x0(p0);
       Object[] objArray = null;
       if (p0 instanceof c$b$a) {
          a = p0.a;
          if (!PatchProxy.applyVoidOneRefs(a, this, uoc, "5")) {
             this.d.f().e().a().D0();
             this.d.f().e().a().J0(a, "PASSWORD_RED_PACKET");
          }
          if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             redPacketCon = this.d.c();
             if (redPacketCon != null) {
                SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
                a uoa = this.d.f().e().a();
                u.i(uoa.i(), uoa.a(), uoa.B(), sCLiveCondit.redPackId, sCLiveCondit.redPackType, redPacketCon.l(), null);
                this.g.a(a.b(a.d(sCLiveCondit), sCLiveCondit.redPackId, sCLiveCondit.redPackType, LiveRedPacketAction.RED_PACK_POPUP_GRAB_CLICK).f());
             }
          }
       }else if(!p0 instanceof c$b$b || PatchProxy.applyVoid(objArray, this, uoc, "3")){
          redPacketCon = this.d.c();
          if (redPacketCon != null && !redPacketCon.m()) {
             SCLiveConditionRedPackInfo sCLiveCondit1 = redPacketCon.k();
             long l = a.d(sCLiveCondit1);
             c uoc1 = a.b(l, sCLiveCondit1.redPackId, sCLiveCondit1.redPackType, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW);
             Objects.requireNonNull(this.d.f().e());
             this.g.a(uoc1.f());
          }
       }
       return;
    }
    public final void E0(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
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
          c tp = this.p;
          if (tp != null) {
             tp.dispose();
          }
          this.p = redPacketCon.h().observeOn(d.a).subscribe(new a(this));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       super.onCleared();
       c tp = this.p;
       if (tp != null) {
          tp.dispose();
       }
       b9.a(this.q);
       this.d.d().d(this.o);
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.z0();
       this.E0();
       return;
    }
}
