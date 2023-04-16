package com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.kwai_player.KwaiBatteryInfoUtil;

public final class KwaiBatteryInfoUtil$1 extends BroadcastReceiver	// class@000b31
{

    public void KwaiBatteryInfoUtil$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiBatteryInfoUtil$1.class, "1")) {
          return;
       }
       int i = 0;
       KwaiBatteryInfoUtil.mBatteryTemperature = p1.getIntExtra("temperature", i);
       KwaiBatteryInfoUtil.mBatteryLevel = p1.getIntExtra("level", i);
       if (p1.getIntExtra("status", -1) == 2) {
          i = true;
       }
       KwaiBatteryInfoUtil.mIsCharging = i;
       return;
    }
}
