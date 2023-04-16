package com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$onReceiveRegisterResult$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.lang.Object;
import qrd.l1;
import java.util.List;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import com.kwai.android.common.bean.Channel;
import com.kwai.android.common.ext.StringExtKt;
import com.kwai.android.register.TokenManager;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver;
import com.yxcorp.gifshow.push.xiaomi.XiaomiPushReceiver$a;
import java.lang.Throwable;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;
import kotlin.Pair;
import java.lang.Enum;
import qrd.r0;

public final class XiaomiPushReceiver$onReceiveRegisterResult$1 extends Lambda implements a	// class@0016a9
{
    public final MiPushCommandMessage $message;

    public void XiaomiPushReceiver$onReceiveRegisterResult$1(MiPushCommandMessage p0){
       this.$message = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       List commandArgum = this.$message.getCommandArguments();
       if (TextUtils.equals("register", this.$message.getCommand())) {
          Channel obj = null;
          int i = 0;
          String str = (commandArgum != null && commandArgum.size() > 0)? commandArgum.get(i): obj;
          int i1 = 4;
          if (!this.$message.getResultCode() - null) {
             Channel xIAOMI = Channel.XIAOMI;
             PushLogcat.INSTANCE.i("KwaiPushSDK", xIAOMI+" onReceiveRegisterResult: Succeed to register token -> "+StringExtKt.toUndercover(str));
             TokenManager.uploadToken$default(xIAOMI, str, i, i1, obj);
          }else {
             obj = Channel.XIAOMI;
             XiaomiPushReceiver$a companion = XiaomiPushReceiver.Companion;
             PushLogcat.e$default(PushLogcat.INSTANCE, "KwaiPushSDK", obj+" onReceiveRegisterResult: Failed to register error ->"+companion.a(this.$message.getResultCode()), null, 4, null);
             String reason = this.$message.getReason();
             a.o(reason, "message.reason");
             Pair[] pairArray = new Pair[i1];
             pairArray[i] = r0.a("channel", obj.name());
             String str1 = companion.a(this.$message.getResultCode());
             pairArray[1] = r0.a("errorCodeDescription", str1);
             pairArray[2] = r0.a("resultCode", String.valueOf(this.$message.getResultCode()));
             pairArray[3] = r0.a("resultReason", this.$message.getReason());
             PushLogger.c().f("tag_error_token", reason, new RuntimeException("code:"+this.$message.getResultCode()+" reason:"+this.$message.getReason()), pairArray);
          }
       }
       return;
    }
}
