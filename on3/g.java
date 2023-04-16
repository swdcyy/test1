package on3.g;
import on3.c;
import eo3.w;
import on3.g$a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.i;
import eo3.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lnc.a1;
import on3.c$b;
import on3.c$b$a;
import eo3.a;
import om3.d;
import om3.a;
import eo3.b0;
import m62.e;
import com.kuaishou.live.core.show.conditionredpacket.sender.LiveConditionRedPacketSendLogger$ShowPanelSource;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import uw1.i;
import tw1.d;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kwai.robust.PatchProxyResult;
import eo3.f;
import crd.b;
import brd.t;
import t45.d;
import brd.z;
import on3.e;
import on3.f;
import erd.g;
import java.lang.Boolean;
import on3.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import z52.a;

public class g extends c	// class@00387d
{
    public final n m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public b q;

    public void g(w p0){
       super(p0);
       g$a uoa = new g$a(this);
       this.m = uoa;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.n = mutableLiveD;
       this.o = new MutableLiveData();
       this.p = new MutableLiveData();
       this.d.d().f(uoa);
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "6")) {
       }else if(PatchProxy.applyVoid(objArray, this, og, "7")){
          mutableLiveD.setValue(a1.p(R.string.arg_RES_7f1040c4)+" >");
          this.G0(true);
       }
       this.H0();
       this.F0();
       return;
    }
    public void C0(c$b p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          return;
       }
       super.C0(p0);
       if (p0 instanceof c$b$a) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
             a uoa = this.d.f().e().a();
             uoa.D0();
             uoa.b(this.d.h().b(), e.a.a(this.d.h().b()));
             if (!PatchProxy.applyVoid(objArray, this, og, "10")) {
                d.h(this.d.f().e().a().a(), this.d.h().a(), i.c(this.d.h().b()));
             }
          }
       }
       return;
    }
    public String E0(RedPacketConditionRedPackInfoWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.q(0x7f1025f3, p0.g());
    }
    public final void F0(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          tq.dispose();
       }
       this.q = redPacketCon.i().observeOn(d.a).subscribe(new e(this), new f(this));
       return;
    }
    public void G0(boolean p0){
       boolean b;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "8")) {
          return;
       }
       if (this.d.h().b() == 45) {
          this.o.setValue(Boolean.FALSE);
          return;
       }else {
          SCLiveConditionRedPackInfo sCLiveCondit = k0.a(this.d.c(), d.a).orNull();
          if (sCLiveCondit != null) {
             Object obj = PatchProxy.applyOneRefs(sCLiveCondit, null, a.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(sCLiveCondit.redPackType == 39){
                if (sCLiveCondit.enableAppend != null && a.d(sCLiveCondit)) {
                label_0067 :
                   b = true;
                }
             }else if(sCLiveCondit.enableAppend != null && (a.d(sCLiveCondit) && a.b())){
                goto label_0067 ;
             }
             b = false;
             if (b) {
                this.o.setValue(Boolean.TRUE);
                if (p0 && !PatchProxy.applyVoid(null, this, og, "9")) {
                   d.i(this.d.f().e().a().a(), this.d.h().a(), i.c(this.d.h().b()));
                }
             }else {
             label_00c0 :
                this.o.setValue(Boolean.FALSE);
             }
          }else {
             goto label_00c0 ;
          }
          return;
       }
    }
    public void H0(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       this.p.setValue(this.E0(redPacketCon));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       super.onCleared();
       this.d.d().d(this.m);
       g tq = this.q;
       if (tq != null) {
          tq.dispose();
       }
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       super.z0();
       this.F0();
       return;
    }
}
