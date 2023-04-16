package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedForNewPanel;
import java.lang.Object;
import ve5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sz9.w;

public final class OperationSpeedForNewPanel$a implements g	// class@001488
{
    public final OperationSpeedForNewPanel b;

    public void OperationSpeedForNewPanel$a(OperationSpeedForNewPanel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationSpeedForNewPanel$a.class, "1")) {
       }else {
          this.b.H.updateSpeed(p0.a);
       }
       return;
    }
}
