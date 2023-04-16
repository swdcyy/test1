package com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import yh3.a;
import eo3.w;
import zh3.c;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$State;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$a;
import eo3.a;
import nm3.b;
import nm3.c;
import eo3.b0;
import eo3.s;
import java.lang.Class;
import java.lang.String;
import eo3.i;
import eo3.n;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$c$b;
import java.lang.StringBuilder;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$c$a;

public class RedPacketBaseViewModel extends a	// class@000f3c
{
    public final String a;
    public final c b;
    public final MutableLiveData c;
    public w d;
    public final MutableLiveData e;
    public final b f;
    public final c g;
    public final b0 h;
    public final n i;
    public final s j;

    public void RedPacketBaseViewModel(w p0){
       super();
       this.b = new c();
       this.c = new MutableLiveData(RedPacketBaseViewModel$State.Normal);
       this.e = new MutableLiveData(Boolean.TRUE);
       RedPacketBaseViewModel$a uoa = new RedPacketBaseViewModel$a(this);
       this.i = uoa;
       this.d = p0;
       this.f = p0.f().b();
       this.g = this.d.f().d();
       this.h = this.d.h();
       this.j = this.d.f().f();
       this.a = this.getClass().getSimpleName();
       this.d.d().f(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, RedPacketBaseViewModel.class, "4")) {
          return;
       }
       super.onCleared();
       this.d.d().d(this.i);
       return;
    }
    public LiveEvent u0(){
       return this.b;
    }
    public LiveData v0(){
       return this.e;
    }
    public LiveData w0(){
       return this.c;
    }
    public void x0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketBaseViewModel.class, "2")) {
          return;
       }
       if (p0 instanceof RedPacketBaseViewModel$c$b) {
          this.y0(this.a, "mRootViewVisibilityLiveData = true, key = "+this.h);
          this.e.setValue(Boolean.TRUE);
       }else if(p0 instanceof RedPacketBaseViewModel$c$a){
          this.y0(this.a, "mRootViewVisibilityLiveData = false, key = "+this.h);
          this.e.setValue(Boolean.FALSE);
       }
       return;
    }
    public void y0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketBaseViewModel.class, "3")) {
          return;
       }
       this.f.i(p0, p1+", key = "+this.h);
       return;
    }
    public void z0(){
    }
}
