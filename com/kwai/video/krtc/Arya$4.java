package com.kwai.video.krtc.Arya$4;
import android.content.BroadcastReceiver;
import com.kwai.video.krtc.Arya;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class Arya$4 extends BroadcastReceiver	// class@000653
{
    public final Arya this$0;

    public void Arya$4(Arya p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$4.class, "1")) {
          return;
       }
       int i = -1;
       int intExtra = p1.getIntExtra("level", i);
       int intExtra1 = p1.getIntExtra("scale", i);
       intExtra = (intExtra != i && intExtra1 != i)? (int)((float)(intExtra * 100) / (float)intExtra1): 0;
       int intExtra2 = p1.getIntExtra("status", 1);
       if (Arya.o(this.this$0) != intExtra || Arya.p(this.this$0) != intExtra2) {
          Log.d("Arya", "batteryInfoBroadcast level:"+intExtra+", batteryState:"+intExtra2);
          Arya$4 tthis$0 = this.this$0;
          Arya.a(tthis$0, Arya.c(tthis$0), intExtra, intExtra2);
          Arya.c(this.this$0, intExtra);
          Arya.d(this.this$0, intExtra2);
       }
       return;
    }
}
