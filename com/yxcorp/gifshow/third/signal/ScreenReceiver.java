package com.yxcorp.gifshow.third.signal.ScreenReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import kkc.c;

public final class ScreenReceiver extends BroadcastReceiver	// class@001d9a
{

    public void ScreenReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreenReceiver.class, "1")) {
          return;
       }
       if (p0 != null) {
          String action = (p1 != null)? p1.getAction(): null;
          if (action != null) {
             int i = action.hashCode();
             if (i != -2128145023) {
                if (i != -1454123155) {
                   if (i != 0x311a1d6c || !action.equals("android.intent.action.USER_PRESENT")) {
                   label_0050 :
                      return;
                   }
                }else if(action.equals("android.intent.action.SCREEN_ON")){
                }
             }else if(action.equals("android.intent.action.SCREEN_OFF")){
             }
             RxBus.f.b(new c());
             goto label_0050 ;
          }
       }else {
          goto label_0050 ;
       }
    }
}
