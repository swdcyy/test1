package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class OperationDanmakuSwitch$3 extends Lambda implements a	// class@001476
{
    public final OperationDanmakuSwitch this$0;

    public void OperationDanmakuSwitch$3(OperationDanmakuSwitch p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, OperationDanmakuSwitch$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.this$0.E()) {
          obj = a1.p(R.string.arg_RES_7f100ec4);
          a.o(obj, "CommonUtil.string\(R.stri¡­back_not_support_danmaku\)");
       }else if(this.this$0.Y()){
          obj = a1.p(R.string.arg_RES_7f1046c1);
       }else {
          obj = a1.p(R.string.arg_RES_7f1046c0);
       }
       a.o(obj, "if \(isDanmakuSwitchOpen\(¡­se_safe_closed\)\n        }");
       return obj;
    }
}
