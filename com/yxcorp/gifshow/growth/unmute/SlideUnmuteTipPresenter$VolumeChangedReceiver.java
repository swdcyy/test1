package com.yxcorp.gifshow.growth.unmute.SlideUnmuteTipPresenter$VolumeChangedReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ekd.j0;
import bra.a;

public final class SlideUnmuteTipPresenter$VolumeChangedReceiver extends BroadcastReceiver	// class@00158a
{
    public a a;

    public void SlideUnmuteTipPresenter$VolumeChangedReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlideUnmuteTipPresenter$VolumeChangedReceiver.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       if (a.g("android.media.VOLUME_CHANGED_ACTION", p1.getAction()) && j0.b(p1, "android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
          SlideUnmuteTipPresenter$VolumeChangedReceiver ta = this.a;
          if (ta != null) {
             ta.a();
          }
       }
       return;
    }
}
