package com.yxcorp.gifshow.push.meizu.MeizuPushReceiver$onRegisterStatus$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import java.lang.Object;
import qrd.l1;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import java.lang.String;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.kwai.android.common.ext.StringExtKt;
import java.lang.Integer;
import com.kwai.android.register.TokenManager;

public final class MeizuPushReceiver$onRegisterStatus$1 extends Lambda implements a	// class@00167f
{
    public final RegisterStatus $registerStatus;

    public void MeizuPushReceiver$onRegisterStatus$1(RegisterStatus p0){
       this.$registerStatus = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       BasicPushStatus code;
       PushLogcat iNSTANCE = PushLogcat.INSTANCE;
       Channel mEIZU = Channel.MEIZU;
       StringBuilder str = mEIZU+": onRegisterStatus call code:";
       MeizuPushReceiver$onRegisterStatus$1 t$registerSt = this.$registerStatus;
       code = (t$registerSt != null)? t$registerSt.code: null;
       str = str+code+" msg:";
       t$registerSt = this.$registerStatus;
       code = (t$registerSt != null)? t$registerSt.message: null;
       str = str+code+" token:";
       t$registerSt = this.$registerStatus;
       String pushId = (t$registerSt != null)? t$registerSt.getPushId(): null;
       str = str+StringExtKt.toUndercover(pushId)+" Become invalid after ";
       t$registerSt = this.$registerStatus;
       Integer integer = (t$registerSt != null)? Integer.valueOf(t$registerSt.getExpireTime()): null;
       iNSTANCE.i("KwaiPushSDK", str+integer+" seconds");
       MeizuPushReceiver$onRegisterStatus$1 t$registerSt1 = this.$registerStatus;
       String pushId1 = (t$registerSt1 != null)? t$registerSt1.getPushId(): null;
       TokenManager.uploadToken$default(mEIZU, pushId1, false, 4, null);
       return;
    }
}
