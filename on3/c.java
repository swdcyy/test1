package on3.c;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import on3.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import on3.c$b$b;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import eo3.a;
import om3.d;
import om3.a;
import eo3.b0;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper$CurrentInfoState;
import brd.t;
import t45.d;
import brd.z;
import on3.a;
import erd.a;
import on3.b;
import erd.g;

public class c extends RedPacketBaseViewModel	// class@003878
{
    public final MutableLiveData k;
    public b l;

    public void c(w p0){
       super(p0);
       this.k = new MutableLiveData(Boolean.FALSE);
       this.D0();
    }
    public LiveData A0(){
       return this.k;
    }
    public void C0(c$b p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       this.x0(p0);
       if (p0 instanceof c$b$b && !PatchProxy.applyVoid(null, this, uoc, "2")) {
          RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
          if (redPacketCon != null) {
             b0 uob0 = this.d.h();
             int i = uob0.b();
             redPacketCon.n(this.d.f().e().a().getLiveStreamId(), i, uob0.a());
          }
       }
       return;
    }
    public final void D0(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       c tl = this.l;
       if (tl != null) {
          tl.dispose();
       }
       this.l = redPacketCon.e().f(RedPacketConditionRedPackInfoWrapper$CurrentInfoState.class).observeOn(d.a).doOnComplete(new a(this)).subscribe(new b(this));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.onCleared();
       c tl = this.l;
       if (tl != null) {
          tl.dispose();
       }
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.D0();
       return;
    }
}
