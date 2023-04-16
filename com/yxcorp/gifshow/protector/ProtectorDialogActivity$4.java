package com.yxcorp.gifshow.protector.ProtectorDialogActivity$4;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.protector.ProtectorDialogActivity;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class ProtectorDialogActivity$4 extends BroadcastReceiver	// class@00160c
{
    public final ProtectorDialogActivity a;

    public void ProtectorDialogActivity$4(ProtectorDialogActivity p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProtectorDialogActivity$4.class, "1")) {
          return;
       }
       this.a.A.removeCallbacksAndMessages(null);
       this.a.finish();
       return;
    }
}
