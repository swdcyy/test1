package com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState$VolumeChangedReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState$a;

public class PhoneVolumeState$VolumeChangedReceiver extends BroadcastReceiver	// class@000779
{
    public final PhoneVolumeState a;

    public void PhoneVolumeState$VolumeChangedReceiver(PhoneVolumeState p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhoneVolumeState$VolumeChangedReceiver.class, "1")) {
          return;
       }
       if (("android.media.VOLUME_CHANGED_ACTION").equals(p1.getAction())) {
          int i = -1;
          if (j0.b(p1, "android.media.EXTRA_VOLUME_STREAM_TYPE", i) == 3) {
             PhoneVolumeState$VolumeChangedReceiver ta = this.a;
             boolean b = (!j0.b(p1, "android.media.EXTRA_VOLUME_STREAM_VALUE", i))? true: false;
             Objects.requireNonNull(ta);
             PhoneVolumeState phoneVolumeS = PhoneVolumeState.class;
             if (!PatchProxy.isSupport(phoneVolumeS) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ta, phoneVolumeS, "3")) {
                Iterator iterator = ta.d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(b);
                }
             }
          }
       }
       return;
    }
}
