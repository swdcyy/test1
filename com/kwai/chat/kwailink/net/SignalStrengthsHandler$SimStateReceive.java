package com.kwai.chat.kwailink.net.SignalStrengthsHandler$SimStateReceive;
import android.content.BroadcastReceiver;
import com.kwai.chat.kwailink.net.SignalStrengthsHandler;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.a;

public class SignalStrengthsHandler$SimStateReceive extends BroadcastReceiver	// class@000a61
{
    public final SignalStrengthsHandler a;

    public void SignalStrengthsHandler$SimStateReceive(SignalStrengthsHandler p0){
       this.a = p0;
       super();
    }
    public final void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SignalStrengthsHandler$SimStateReceive.class, "1")) {
          return;
       }
       a.e("SignalStrengthsHandler", "sim state changed");
       if ((p1.getAction()).equals("android.intent.action.SIM_STATE_CHANGED")) {
          this.a.j();
       }
       return;
    }
}
