package com.kwai.android.register.KuaiShouRegister$linkPushTokenListener$1;
import o75.c0;
import java.lang.Object;
import java.lang.String;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.ext.StringExtKt;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.register.TokenManager;

public final class KuaiShouRegister$linkPushTokenListener$1 implements c0	// class@0009d1
{
    public static final KuaiShouRegister$linkPushTokenListener$1 INSTANCE;

    static {
       KuaiShouRegister$linkPushTokenListener$1.INSTANCE = new KuaiShouRegister$linkPushTokenListener$1();
    }
    public void KuaiShouRegister$linkPushTokenListener$1(){
       super();
    }
    public final void onLinkPushToken(String p0){
       PushLogcat.INSTANCE.i("KwaiPushSDK", "klink notify token has changed: "+StringExtKt.toUndercover(p0));
       TokenManager.uploadToken$default(Channel.KS, p0, false, 4, null);
    }
}
