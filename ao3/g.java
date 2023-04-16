package ao3.g;
import on3.c;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import brd.t;
import t45.d;
import brd.z;
import ao3.e;
import ao3.d;
import erd.g;
import crd.b;
import ao3.f;
import java.lang.Runnable;

public class g extends c	// class@00028d
{
    public final MutableLiveData m;
    public final MutableLiveData n;
    public b o;

    public void g(w p0){
       super(p0);
       this.m = new MutableLiveData();
       this.n = new MutableLiveData("");
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
       }else {
          this.E0();
       }
       return;
    }
    public final void E0(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
       if (redPacketCon == null) {
          return;
       }
       this.F0(redPacketCon.f());
       this.o = redPacketCon.i().observeOn(d.a).subscribe(new e(this), new d(this));
       return;
    }
    public final void F0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0.mCurrentInfo == null) {
          return;
       }
       d.c.d(new f(this, p0));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.onCleared();
       g to = this.o;
       if (to != null) {
          to.dispose();
       }
       return;
    }
    public void z0(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       super.z0();
       this.E0();
       return;
    }
}
