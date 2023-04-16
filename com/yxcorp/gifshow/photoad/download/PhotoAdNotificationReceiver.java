package com.yxcorp.gifshow.photoad.download.PhotoAdNotificationReceiver;
import android.content.BroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import nxb.h0;

public class PhotoAdNotificationReceiver extends BroadcastReceiver	// class@000f78
{
    public static AtomicBoolean a;

    static {
       PhotoAdNotificationReceiver.a = new AtomicBoolean(false);
    }
    public void PhotoAdNotificationReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdNotificationReceiver.class, "1")) {
          return;
       }
       if (TextUtils.equals(p1.getAction(), "com.yxcorp.gifshow.photoad.REINSTALL")) {
          h0.a().b(p1);
       }
       return;
    }
}
