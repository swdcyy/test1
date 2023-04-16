package com.yxcorp.gifshow.message.notification.outapp.IMClickPushButtonBroadcastReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.message.notification.outapp.a;

public class IMClickPushButtonBroadcastReceiver extends BroadcastReceiver	// class@001d80
{

    public void IMClickPushButtonBroadcastReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMClickPushButtonBroadcastReceiver.class, "1")) {
          return;
       }
       a.b(p0, p1);
       return;
    }
}
