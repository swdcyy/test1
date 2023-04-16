package com.kwai.video.stannis.observers.PhoneStatusMonitor$StannisPhoneStateListener;
import android.telephony.PhoneStateListener;
import com.kwai.video.stannis.observers.PhoneStatusMonitor;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusListener;
import android.content.Context;
import com.kwai.video.stannis.observers.PhoneStatusTools;

public class PhoneStatusMonitor$StannisPhoneStateListener extends PhoneStateListener	// class@000c60
{
    public final PhoneStatusMonitor this$0;

    public void PhoneStatusMonitor$StannisPhoneStateListener(PhoneStatusMonitor p0){
       this.this$0 = p0;
       super();
    }
    public void onCallStateChanged(int p0,String p1){
       PhoneStatusMonitor mPhoneStatus;
       PhoneStatusMonitor$StannisPhoneStateListener tthis$01;
       if (PatchProxy.isSupport(PhoneStatusMonitor$StannisPhoneStateListener.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PhoneStatusMonitor$StannisPhoneStateListener.class, "1")) {
          return;
       }
       boolean b = false;
       String str = "PhoneStatusMonitor";
       if (p0) {
          int i = 1;
          if (p0 != i) {
             if (p0 == 2) {
                Log.i(str, "onCallStateChanged CALL_STATE_OFFHOOK");
                PhoneStatusMonitor$StannisPhoneStateListener tthis$0 = this.this$0;
                tthis$0.mIsCalling = i;
                mPhoneStatus = tthis$0.mPhoneStatusListener;
                if (mPhoneStatus != null) {
                   mPhoneStatus.onCallStateChanged(2009);
                }
             }
          }else {
             Log.i(str, "onCallStateChanged CALL_STATE_RINGING");
             tthis$01 = this.this$0;
             if (tthis$01.mIsCalling != null && !PhoneStatusTools.isCalling(tthis$01.mContext)) {
                tthis$01 = this.this$0;
                tthis$01.mIsCalling = b;
                mPhoneStatus = tthis$01.mPhoneStatusListener;
                if (mPhoneStatus != null) {
                   mPhoneStatus.onCallStateChanged(2008);
                }
             }
          }
       }else {
          Log.i(str, "onCallStateChanged CALL_STATE_IDLE");
          tthis$01 = this.this$0;
          if (tthis$01.mIsCalling != null && !PhoneStatusTools.isCalling(tthis$01.mContext)) {
             tthis$01 = this.this$0;
             tthis$01.mIsCalling = b;
             mPhoneStatus = tthis$01.mPhoneStatusListener;
             if (mPhoneStatus != null) {
                mPhoneStatus.onCallStateChanged(2010);
             }
          }
       }
       super.onCallStateChanged(p0, p1);
       return;
    }
}
