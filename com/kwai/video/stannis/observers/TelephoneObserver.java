package com.kwai.video.stannis.observers.TelephoneObserver;
import java.lang.Object;
import android.content.Context;
import com.kwai.video.stannis.audio.StannisAudioManagerInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.observers.TelephoneObserver$MyPhoneStatusListener;
import com.kwai.video.stannis.observers.TelephoneObserver$1;
import com.kwai.video.stannis.observers.PhoneStatusMonitor;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusListener;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;

public class TelephoneObserver	// class@000c79
{
    public static boolean mPhoneInterruptFlag;
    public static PhoneStatusMonitor$PhoneStatusListener mPhoneStatusListener;
    public static PhoneStatusMonitor mPhoneStatusMonitor;
    public static StannisAudioManagerInterface stannisAudioManager;

    public void TelephoneObserver(){
       super();
    }
    public static void addTelephoneObserver(Context p0,StannisAudioManagerInterface p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, TelephoneObserver.class, "1")) {
          return;
       }
       if (TelephoneObserver.mPhoneStatusListener == null) {
          TelephoneObserver.mPhoneStatusListener = new TelephoneObserver$MyPhoneStatusListener(obj);
       }
       if (TelephoneObserver.mPhoneStatusMonitor == null) {
          TelephoneObserver.mPhoneStatusMonitor = new PhoneStatusMonitor(p0, TelephoneObserver.mPhoneStatusListener);
       }
       TelephoneObserver.stannisAudioManager = p1;
       Log.i("TelephoneObserver", "addTelephoneObserver"+p1);
       return;
    }
    public static boolean getPhoneInterruptFlag(){
       return TelephoneObserver.mPhoneInterruptFlag;
    }
    public static void removeTelephoneObserver(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, TelephoneObserver.class, "2")) {
          return;
       }
       TelephoneObserver.mPhoneInterruptFlag = false;
       PhoneStatusMonitor mPhoneStatus = TelephoneObserver.mPhoneStatusMonitor;
       if (mPhoneStatus != null) {
          mPhoneStatus.uninit();
          TelephoneObserver.mPhoneStatusMonitor = objArray;
       }
       TelephoneObserver.mPhoneStatusListener = objArray;
       TelephoneObserver.stannisAudioManager = objArray;
       Log.i("TelephoneObserver", "removeTelephoneObserver");
       return;
    }
    public static void resetPhoneInterruptFlag(){
       TelephoneObserver.mPhoneInterruptFlag = false;
    }
}
