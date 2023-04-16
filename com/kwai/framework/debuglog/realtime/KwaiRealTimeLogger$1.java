package com.kwai.framework.debuglog.realtime.KwaiRealTimeLogger$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q87.d;
import r87.j;
import r87.b;
import com.kwai.framework.debuglog.realtime.a;

public class KwaiRealTimeLogger$1 extends BroadcastReceiver	// class@001517
{

    public void KwaiRealTimeLogger$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiRealTimeLogger$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.a(j.c("KwaiRealTimeLogger", 4, "KwaiRealTimeLogger", p1.getStringExtra("TRIGGER_TYPE"), objArray), null);
       return;
    }
}
