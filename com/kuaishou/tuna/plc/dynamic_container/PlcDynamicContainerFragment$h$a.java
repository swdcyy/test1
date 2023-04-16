package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$h$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;

public final class PlcDynamicContainerFragment$h$a extends AnimatorListenerAdapter	// class@000fd1
{
    public final PlcDynamicContainerFragment$h a;

    public void PlcDynamicContainerFragment$h$a(PlcDynamicContainerFragment$h p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerFragment$h$a.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       PlcDynamicContainerFragment$h$a ta = this.a;
       ta.b.kh(ta.c);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicContainerFragment$h$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       PlcDynamicContainerFragment$h$a ta = this.a;
       ta.b.kh(ta.c);
       return;
    }
}
