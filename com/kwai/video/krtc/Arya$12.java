package com.kwai.video.krtc.Arya$12;
import android.content.BroadcastReceiver;
import com.kwai.video.krtc.Arya;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class Arya$12 extends BroadcastReceiver	// class@00064b
{
    public final Arya this$0;

    public void Arya$12(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$12.class, "1")) {
          return;
       }
       int rssi = p0.getSystemService("wifi").getConnectionInfo().getRssi();
       Log.i("Arya", "multiNic rssiReceiver RSSI changed, "+rssi);
       Arya.e(this.this$0, rssi);
       return;
    }
}
