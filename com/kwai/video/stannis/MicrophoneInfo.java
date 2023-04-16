package com.kwai.video.stannis.MicrophoneInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MicrophoneInfo	// class@000bc2
{
    public int energy;
    public boolean mute;
    public int outEnergy;
    public int suggestedSysVolume;
    public int sysVolume;
    public int vad;

    public void MicrophoneInfo(){
       super();
       this.mute = false;
       this.energy = 0;
       this.vad = -1;
       this.sysVolume = 0;
       this.suggestedSysVolume = 0;
       this.outEnergy = 0;
    }
    public void MicrophoneInfo(boolean p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.mute = false;
       this.energy = 0;
       this.vad = -1;
       this.sysVolume = 0;
       this.suggestedSysVolume = 0;
       this.outEnergy = 0;
       this.mute = p0;
       this.energy = p1;
       this.vad = p2;
       this.sysVolume = p3;
       this.suggestedSysVolume = p4;
       this.outEnergy = p5;
    }
    public int getEnergy(){
       return this.energy;
    }
    public int getOutEnergy(){
       return this.outEnergy;
    }
    public int getSuggestedSysVolume(){
       return this.suggestedSysVolume;
    }
    public int getSysVolume(){
       return this.sysVolume;
    }
    public int getVad(){
       return this.vad;
    }
    public boolean isMute(){
       return this.mute;
    }
    public void setEnergy(int p0){
       this.energy = p0;
    }
    public void setMute(boolean p0){
       this.mute = p0;
    }
    public void setSuggestedSysVolume(int p0){
       this.suggestedSysVolume = p0;
    }
    public void setSysVolume(int p0){
       this.sysVolume = p0;
    }
    public void setVad(int p0){
       this.vad = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MicrophoneInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MicrophoneInfo{mute="+this.mute+", energy="+this.energy+", vad="+this.vad+", sysVolume="+this.sysVolume+", suggestedSysVolume="+this.suggestedSysVolume+", outEnergy="+this.outEnergy+'}';
    }
}
