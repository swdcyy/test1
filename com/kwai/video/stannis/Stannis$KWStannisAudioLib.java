package com.kwai.video.stannis.Stannis$KWStannisAudioLib;
import com.kwai.video.stannis.Stannis;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.Stannis$AudioChangeParam;
import java.lang.Boolean;

public class Stannis$KWStannisAudioLib	// class@000bdb
{
    public int agc_increment;
    public int agc_max_gain;
    public int agc_target;
    public Stannis$AudioChangeParam audio_change_param;
    public int channel_num;
    public int current_reverb_level;
    public int current_vocal;
    public int current_voice_effect;
    public int enable_ns;
    public long nativeAgcPtr;
    public long nativeDspPtr;
    public boolean nativeInited;
    public long nativeTimbrePtr;
    public int ns_level;
    public int reverb_level;
    public int sample_rate;
    public final Stannis this$0;
    public int vocal;
    public int voice_effect;

    public void Stannis$KWStannisAudioLib(Stannis p0){
       this.this$0 = p0;
       super();
       this.nativeAgcPtr = 0;
       this.nativeDspPtr = 0;
       this.nativeTimbrePtr = 0;
       this.current_reverb_level = 0;
       this.current_voice_effect = 0;
       this.current_vocal = 0;
       this.sample_rate = 0;
       this.channel_num = 0;
       this.enable_ns = 1;
       this.ns_level = -8;
       this.agc_max_gain = 20;
       this.agc_increment = 12;
       this.agc_target = 0x7fff;
       this.reverb_level = 0;
       this.voice_effect = 0;
       this.vocal = 0;
       this.nativeInited = false;
    }
    public final void UpdateConfig(){
       if (PatchProxy.applyVoid(null, this, Stannis$KWStannisAudioLib.class, "3")) {
          return;
       }
       this.current_reverb_level = this.reverb_level;
       this.current_voice_effect = this.voice_effect;
       this.current_vocal = this.vocal;
       this.this$0.nativeAudioProcessSetAgcParam(this.nativeAgcPtr, this.enable_ns, this.ns_level, this.agc_max_gain, this.agc_increment, this.agc_target);
       this.this$0.nativeAudioProcessSetDspParam(this.nativeDspPtr, this.current_reverb_level, this.current_voice_effect);
       this.this$0.nativeAudioProcessSetVocalParam(this.nativeTimbrePtr, this.current_vocal);
       return;
    }
    public int getSamplePerFrame(){
       return ((this.sample_rate * this.channel_num) / 100);
    }
    public void initNative(){
       if (PatchProxy.applyVoid(null, this, Stannis$KWStannisAudioLib.class, "1")) {
          return;
       }
       this.nativeAgcPtr = this.this$0.nativeAudioProcessCreateAgcInterface(this.sample_rate, this.channel_num);
       this.nativeDspPtr = this.this$0.nativeAudioProcessCreateDspInterface(this.sample_rate, this.channel_num);
       this.nativeTimbrePtr = this.this$0.nativeAudioProcessCreateTimbreInterface(this.sample_rate, this.channel_num);
       this.nativeInited = true;
       return;
    }
    public boolean isNativeInited(){
       return this.nativeInited;
    }
    public void processData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis$KWStannisAudioLib.class, "6")) {
          return;
       }
       int i = ((this.sample_rate * this.channel_num) * 2) / 100;
       if (p0.length != i) {
          Log.i("Stannis", "Stannis AudioProcessLib ProcessData is not 10ms. length="+p0.length+", sr="+this.sample_rate+", ch="+this.channel_num);
       }else {
          Stannis$KWStannisAudioLib treverb_leve = this.reverb_level;
          if (this.current_reverb_level != treverb_leve || this.current_voice_effect != this.voice_effect) {
             this.current_reverb_level = treverb_leve;
             Stannis$KWStannisAudioLib tvoice_effec = this.voice_effect;
             this.current_voice_effect = tvoice_effec;
             this.this$0.nativeAudioProcessSetDspParam(this.nativeDspPtr, treverb_leve, tvoice_effec);
          }
          treverb_leve = this.vocal;
          if (this.current_vocal != treverb_leve) {
             this.current_vocal = treverb_leve;
             this.this$0.nativeAudioProcessSetVocalParam(this.nativeTimbrePtr, treverb_leve);
          }
          this.this$0.nativeAudioProcessData(this.nativeAgcPtr, this.nativeDspPtr, this.nativeTimbrePtr, p0, (i / 2));
       }
       return;
    }
    public void setAudioChangeParam(Stannis$AudioChangeParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis$KWStannisAudioLib.class, "5")) {
          return;
       }
       Stannis$KWStannisAudioLib tnativeDspPt = this.nativeDspPtr;
       if (tnativeDspPt - null) {
          this.this$0.nativeAudioProcessSetVcoParameters(tnativeDspPt, p0);
       }
       return;
    }
    public void setChannelNum(int p0){
       this.channel_num = p0;
    }
    public void setEnableNs(boolean p0){
       Stannis$KWStannisAudioLib kWStannisAud = Stannis$KWStannisAudioLib.class;
       if (PatchProxy.isSupport(kWStannisAud) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kWStannisAud, "4")) {
          return;
       }
       this.enable_ns = p0;
       Stannis$KWStannisAudioLib tnativeAgcPt = this.nativeAgcPtr;
       if (tnativeAgcPt) {
          this.this$0.nativeAudioProcessSetAgcParam(tnativeAgcPt, p0, this.ns_level, this.agc_max_gain, this.agc_increment, this.agc_target);
       }
       return;
    }
    public void setSampleRate(int p0){
       this.sample_rate = p0;
    }
    public void uninitNative(){
       if (PatchProxy.applyVoid(null, this, Stannis$KWStannisAudioLib.class, "2")) {
          return;
       }
       Stannis$KWStannisAudioLib tnativeAgcPt = this.nativeAgcPtr;
       if (tnativeAgcPt) {
          this.this$0.nativeAudioProcessDestroyAgcInterface(tnativeAgcPt);
          this.nativeAgcPtr = 0;
       }
       tnativeAgcPt = this.nativeDspPtr;
       if (tnativeAgcPt) {
          this.this$0.nativeAudioProcessDestroyDspInterface(tnativeAgcPt);
          this.nativeDspPtr = 0;
       }
       tnativeAgcPt = this.nativeTimbrePtr;
       if (tnativeAgcPt) {
          this.this$0.nativeAudioProcessDestroyTimbreInterface(tnativeAgcPt);
          this.nativeTimbrePtr = 0;
       }
       this.nativeInited = false;
       return;
    }
}
