package com.yxcorp.gifshow.im_rtc.media.IMRTCVolumeAdjustController$VolumeChangedReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.im_rtc.media.IMRTCVolumeAdjustController;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import dc5.c;

public class IMRTCVolumeAdjustController$VolumeChangedReceiver extends BroadcastReceiver	// class@001930
{
    public final IMRTCVolumeAdjustController a;

    public void IMRTCVolumeAdjustController$VolumeChangedReceiver(IMRTCVolumeAdjustController p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMRTCVolumeAdjustController$VolumeChangedReceiver.class, "1")) {
          return;
       }
       int i = j0.b(p1, "android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
       if (("android.media.VOLUME_CHANGED_ACTION").equals(p1.getAction()) && 3 == i) {
          c.g("IMRTCVolume", "user set musicVolume");
          i.d = true;
       }
       return;
    }
}
