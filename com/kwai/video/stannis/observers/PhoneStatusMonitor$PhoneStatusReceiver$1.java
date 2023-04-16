package com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusReceiver$1;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusReceiver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.observers.PhoneStatusMonitor;
import android.content.Context;
import com.kwai.video.stannis.observers.PhoneStatusTools;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusListener;

public class PhoneStatusMonitor$PhoneStatusReceiver$1 implements Runnable	// class@000c5d
{
    public final PhoneStatusMonitor$PhoneStatusReceiver this$1;

    public void PhoneStatusMonitor$PhoneStatusReceiver$1(PhoneStatusMonitor$PhoneStatusReceiver p0){
       this.this$1 = p0;
       super();
    }
    public void run(){
       PhoneStatusMonitor mPhoneStatus;
       if (PatchProxy.applyVoid(null, this, PhoneStatusMonitor$PhoneStatusReceiver$1.class, "1")) {
          return;
       }
       PhoneStatusMonitor$PhoneStatusReceiver this$0 = this.this$1.this$0;
       if (this$0.mIsCalling != null && !PhoneStatusTools.isCalling(this$0.mContext)) {
          this$0 = this.this$1.this$0;
          this$0.mIsCalling = false;
          mPhoneStatus = this$0.mPhoneStatusListener;
          if (mPhoneStatus != null) {
             mPhoneStatus.onCallStateChanged(2010);
          }
       }else {
          this$0 = this.this$1.this$0;
          if (this$0.mIsCalling == null && PhoneStatusTools.isCalling(this$0.mContext)) {
             this$0 = this.this$1.this$0;
             this$0.mIsCalling = true;
             mPhoneStatus = this$0.mPhoneStatusListener;
             if (mPhoneStatus != null) {
                mPhoneStatus.onCallStateChanged(2008);
             }
          }
       }
       return;
    }
}
