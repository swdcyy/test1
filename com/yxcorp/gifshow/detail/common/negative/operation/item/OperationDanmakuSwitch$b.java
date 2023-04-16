package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import java.lang.Object;
import lm5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import kf5.g;
import mf5.w0;

public final class OperationDanmakuSwitch$b implements g	// class@001478
{
    public final OperationDanmakuSwitch b;

    public void OperationDanmakuSwitch$b(OperationDanmakuSwitch p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationDanmakuSwitch$b.class, "1")) {
       }else if(p0.a == null){
          a.i(a.a, "OperationDanmakuSwitch", "订阅的 DanmakuSwitchSuccessfulEvent 收到消息，OperationDanmakuSwitch 自动变化", this.b.D, null, "onShow", null, 40, null);
          p0 = this.b;
          p0.W(p0.Y(), this.b.q());
       }
       return;
    }
}
