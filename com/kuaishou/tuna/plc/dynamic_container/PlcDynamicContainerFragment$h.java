package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$h;
import java.lang.Runnable;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.dynamic_container.view.PlcDynamicContainerLayout;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$h$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.tuna.plc.dynamic_container.view.a;

public final class PlcDynamicContainerFragment$h implements Runnable	// class@000fd2
{
    public final PlcDynamicContainerFragment b;
    public final int c;

    public void PlcDynamicContainerFragment$h(PlcDynamicContainerFragment p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PlcDynamicContainerFragment$h.class, "1")) {
          return;
       }
       PlcDynamicContainerLayout plcDynamicCo = this.b.nh();
       int dragStatus2 = (plcDynamicCo != null)? plcDynamicCo.getDragStatus2(): 0;
       if (dragStatus2 != 7 && (dragStatus2 == 6 || !dragStatus2)) {
          this.b.kh(this.c);
       }else {
          plcDynamicCo = this.b.nh();
          if (plcDynamicCo != null) {
             PlcDynamicContainerFragment$h$a oh$a = new PlcDynamicContainerFragment$h$a(this);
             if (!PatchProxy.applyVoidOneRefs(oh$a, plcDynamicCo, PlcDynamicContainerLayout.class, "10")) {
                plcDynamicCo.f.j(oh$a);
             }
          }
       }
       return;
    }
}
