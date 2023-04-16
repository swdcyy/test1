package com.kwai.android.register.KuaiShouRegister$refreshTokenReceiver$1;
import android.content.BroadcastReceiver;
import com.kwai.android.register.KuaiShouRegister;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KuaiShouRegister$refreshTokenReceiver$1 extends BroadcastReceiver	// class@0009d2
{
    public final KuaiShouRegister this$0;

    public void KuaiShouRegister$refreshTokenReceiver$1(KuaiShouRegister p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a.p(p0, "context");
       a.p(p1, "intent");
       if (a.g("com.action.kwai.force.refreshToken.ACTION", p1.getAction())) {
          this.this$0.refreshToken(p1.getBooleanExtra("ignoreRestrict", false));
       }
       return;
    }
}
