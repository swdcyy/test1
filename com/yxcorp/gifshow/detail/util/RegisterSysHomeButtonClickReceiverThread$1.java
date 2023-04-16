package com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.j0;
import k2b.u1;

public class RegisterSysHomeButtonClickReceiverThread$1 extends BroadcastReceiver	// class@001a28
{
    public final RegisterSysHomeButtonClickReceiverThread a;

    public void RegisterSysHomeButtonClickReceiverThread$1(RegisterSysHomeButtonClickReceiverThread p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RegisterSysHomeButtonClickReceiverThread$1.class, "1")) {
          return;
       }
       if (TextUtils.equals(p1.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS") && TextUtils.equals("homekey", j0.f(p1, "reason"))) {
          u1.K0(8);
       }
       return;
    }
}
