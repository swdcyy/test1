package nn3.c;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import crd.b;
import brd.t;
import t45.d;
import brd.z;
import nn3.a;
import nn3.b;
import erd.g;

public class c extends RedPacketBaseViewModel	// class@0036ae
{
    public final MutableLiveData k;
    public b l;

    public void c(w p0){
       super(p0);
       this.k = new MutableLiveData(Boolean.TRUE);
       this.C0();
    }
    public LiveData A0(){
       return this.k;
    }
    public final void C0(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
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
       this.l = redPacketCon.i().observeOn(d.a).subscribe(new a(this), new b(this));
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
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
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.C0();
       return;
    }
}
