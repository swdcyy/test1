package com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.w;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel$Mode;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel$a;
import eo3.i;
import eo3.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class RedPacketPendantBaseViewModel extends RedPacketBaseViewModel	// class@000f3f
{
    public RedPacketPendantBaseViewModel$Mode k;
    public MutableLiveData l;
    public final n m;

    public void RedPacketPendantBaseViewModel(w p0){
       super(p0);
       this.k = RedPacketPendantBaseViewModel$Mode.CountDown;
       this.l = new MutableLiveData();
       RedPacketPendantBaseViewModel$a uoa = new RedPacketPendantBaseViewModel$a(this);
       this.m = uoa;
       this.A0();
       this.d.d().f(uoa);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, RedPacketPendantBaseViewModel.class, "1")) {
          return;
       }
       RedPacketPendantBaseViewModel$Mode mode = this.C0();
       this.k = mode;
       this.l.setValue(mode);
       return;
    }
    public abstract RedPacketPendantBaseViewModel$Mode C0();
    public abstract void D0();
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, RedPacketPendantBaseViewModel.class, "2")) {
          return;
       }
       super.onCleared();
       this.d.d().d(this.m);
       return;
    }
}
