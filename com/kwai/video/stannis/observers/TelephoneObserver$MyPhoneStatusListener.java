package com.kwai.video.stannis.observers.TelephoneObserver$MyPhoneStatusListener;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusListener;
import java.lang.Object;
import com.kwai.video.stannis.observers.TelephoneObserver$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.TelephoneObserver;
import com.kwai.video.stannis.audio.StannisAudioManagerInterface;

public class TelephoneObserver$MyPhoneStatusListener implements PhoneStatusMonitor$PhoneStatusListener	// class@000c78
{

    public void TelephoneObserver$MyPhoneStatusListener(){
       super();
    }
    public void TelephoneObserver$MyPhoneStatusListener(TelephoneObserver$1 p0){
       super();
    }
    public void onCallStateChanged(int p0){
       TelephoneObserver$MyPhoneStatusListener myPhoneStatu = TelephoneObserver$MyPhoneStatusListener.class;
       if (PatchProxy.isSupport(myPhoneStatu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, myPhoneStatu, "1")) {
          return;
       }
       Log.i("MyPhoneStatusListener", "onCallStateChanged, Callingtype:"+p0);
       StannisAudioManagerInterface stannisAudio = TelephoneObserver.stannisAudioManager;
       if (stannisAudio != null) {
          stannisAudio.onPhoneInterrupt(p0);
       }
       return;
    }
}
