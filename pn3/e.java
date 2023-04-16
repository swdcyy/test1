package pn3.e;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import crd.b;
import brd.t;
import t45.d;
import brd.z;
import pn3.c;
import pn3.b;
import erd.g;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$CurrentInfoState;
import pn3.a;
import erd.a;
import pn3.d;
import lo3.c;
import lo3.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo;

public class e extends RedPacketBaseViewModel	// class@0039b6
{
    public final MutableLiveData k;
    public final MutableLiveData l;
    public b m;
    public b n;

    public void e(w p0){
       super(p0);
       this.k = new MutableLiveData();
       this.l = new MutableLiveData();
       this.E0();
    }
    public LiveData A0(){
       return this.k;
    }
    public LiveData C0(){
       return this.l;
    }
    public final void D0(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       this.G0(redPacketCon.f());
       e tm = this.m;
       if (tm != null) {
          tm.dispose();
       }
       this.m = redPacketCon.i().observeOn(d.a).subscribe(new c(this), new b(this));
       return;
    }
    public final void E0(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.l.setValue(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_CONDITON_PREPARE_NO_NET);
       this.D0();
       this.F0();
       return;
    }
    public final void F0(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       e tn = this.n;
       if (tn != null) {
          tn.dispose();
       }
       this.n = redPacketCon.e().f(RedPacketConditionRedPackInfoWrapper$CurrentInfoState.class).observeOn(d.a).doOnComplete(new a(this)).subscribe(new d(this));
       return;
    }
    public void G0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       if (p0 != null && p0.mCurrentInfo != null) {
          c uoc = new c(1);
          uoc.b = new a(p0.mCurrentInfo.mRedPacketTotalValue);
          this.k.setValue(uoc);
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.onCleared();
       e tm = this.m;
       if (tm != null) {
          tm.dispose();
       }
       tm = this.n;
       if (tm != null) {
          tm.dispose();
       }
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.E0();
       return;
    }
}
