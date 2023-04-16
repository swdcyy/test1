package com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onTransmissionMessage$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.vivo.push.model.UnvarnishedMessage;
import java.lang.Object;
import qrd.l1;
import com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onTransmissionMessage$1$1;
import com.kwai.android.common.ext.ContextExtKt;

public final class VivoPushReceiver$onTransmissionMessage$1 extends Lambda implements a	// class@0016a2
{
    public final UnvarnishedMessage $message;

    public void VivoPushReceiver$onTransmissionMessage$1(UnvarnishedMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       ContextExtKt.runOnUiThread(new VivoPushReceiver$onTransmissionMessage$1$1(this));
    }
}
