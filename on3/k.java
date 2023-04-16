package on3.k;
import on3.c;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import brd.t;
import t45.d;
import brd.z;
import on3.i;
import on3.h;
import erd.g;
import crd.b;
import on3.j;
import java.lang.Runnable;

public class k extends c	// class@003881
{
    public final MutableLiveData m;
    public final MutableLiveData n;
    public b o;

    public void k(w p0){
       super(p0);
       this.m = new MutableLiveData();
       this.n = new MutableLiveData("");
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
       }else {
          this.G0();
       }
       return;
    }
    public LiveData E0(){
       return this.n;
    }
    public LiveData F0(){
       return this.m;
    }
    public final void G0(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       this.H0(redPacketCon.f());
       this.o = redPacketCon.i().observeOn(d.a).subscribe(new i(this), new h(this));
       return;
    }
    public void H0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d.c.d(new j(this, p0));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       super.onCleared();
       k to = this.o;
       if (to != null) {
          to.dispose();
       }
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       super.z0();
       this.G0();
       return;
    }
}
