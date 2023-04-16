package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting$a;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting;
import kf5.g;
import java.lang.Object;
import ve5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sz9.w;
import mf5.w0;

public final class OperationSpeedSetting$a implements g	// class@00148b
{
    public final OperationSpeedSetting b;
    public final g c;

    public void OperationSpeedSetting$a(OperationSpeedSetting p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationSpeedSetting$a.class, "1")) {
       }else {
          this.b.H.updateSpeed(p0.a);
          this.c.c(this.b.A());
          this.c.a();
       }
       return;
    }
}
