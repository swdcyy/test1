package com.kwai.video.krtc.Arya$AryaMicrophoneInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Arya$AryaMicrophoneInfo	// class@000664
{
    public int energy;
    public boolean mute;
    public int suggestedSysVolume;
    public int sysVolume;
    public int vad;

    public void Arya$AryaMicrophoneInfo(){
       super();
       this.mute = false;
       this.energy = 0;
       this.vad = -1;
       this.sysVolume = 0;
       this.suggestedSysVolume = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Arya$AryaMicrophoneInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AryaMicrophoneInfo{mute="+this.mute+", energy="+this.energy+", vad="+this.vad+", sysVolume="+this.sysVolume+", suggestedSysVolume="+this.suggestedSysVolume+'}';
    }
}
