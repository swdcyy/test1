package com.yxcorp.gifshow.push.vivo.VivoPushReceiver$onReceiveRegId$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.ext.StringExtKt;
import com.kwai.android.register.TokenManager;

public final class VivoPushReceiver$onReceiveRegId$1 extends Lambda implements a	// class@0016a0
{
    public final String $regId;

    public void VivoPushReceiver$onReceiveRegId$1(String p0){
       this.$regId = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PushLogcat iNSTANCE = PushLogcat.INSTANCE;
       Channel vIVO = Channel.VIVO;
       StringBuilder str = vIVO+" onReceiveRegId token -> ";
       VivoPushReceiver$onReceiveRegId$1 t$regId = this.$regId;
       String str1 = (t$regId != null)? StringExtKt.toUndercover(t$regId): null;
       iNSTANCE.i("KwaiPushSDK", str+str1);
       TokenManager.uploadToken$default(vIVO, this.$regId, false, 4, null);
       return;
    }
}
