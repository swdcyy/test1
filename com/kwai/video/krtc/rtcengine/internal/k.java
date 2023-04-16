package com.kwai.video.krtc.rtcengine.internal.k;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.util.Map;
import com.kwai.video.krtc.Arya;
import android.os.Handler;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioVolumeInfo;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.video.krtc.rtcengine.internal.k$1;
import com.kwai.video.krtc.Arya$AryaMicrophoneInfo;

public class k	// class@00087f
{
    public z a;
    public Arya b;
    public Map c;
    public Handler d;
    public Runnable e;
    public boolean f;
    public boolean g;

    public void k(z p0){
       super();
       this.f = false;
       this.g = false;
       this.a = p0;
       this.c = p0.b();
       this.b = p0.a();
       this.d = p0.j();
    }
    public static RtcEngineAudioVolumeInfo[] a(k p0){
       return p0.v();
    }
    public static z b(k p0){
       return p0.a;
    }
    public static Runnable c(k p0){
       return p0.e;
    }
    public static Handler d(k p0){
       return p0.d;
    }
    public int a(){
       Iterator obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "enableAudio");
       this.b.enableAudioEngine();
       obj = this.a.e().b().iterator();
       while (obj.hasNext()) {
          String str = obj.next();
          if (this.f == null) {
             this.b.enableAudioTx(str);
          }
          this.b.enableAudioRx(str);
       }
       if (this.f == null) {
          this.b.setMuteMicrophone(0);
       }
       if (this.g != null) {
          this.b.setEnableLocalRecording(true);
       }
       if (this.b.IsAudioMusicModeEnabled()) {
          this.b.setEnableAudioMusicMode(true);
       }
       return 0;
    }
    public int a(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "adjustRecordingVolume "+p0);
       this.b.setAudioInputVolume(this.c(p0));
       return 0;
    }
    public int a(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, k.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "enableAudioVolumeIndication");
       this.d(p0);
       return 0;
    }
    public int a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteAllRemoteAudioStreams channelId "+p0);
       this.b.muteAllRemoteAudioStreamsForCallId(p0);
       return 0;
    }
    public int a(String p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "adjustPlaybackVolume "+p0+" "+p1);
       this.b.setAudioRxVolume(p0, this.c(p1));
       return 0;
    }
    public int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteRemoteAudioStream "+p1+" channelId "+p0);
       if (p0 != null) {
          this.b.muteRemoteAudioStream(p0, p1);
       }
       return 0;
    }
    public int a(String p0,boolean p1,float p2){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, k.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "setRxStreamMixerGain uid = "+p0+" enable = "+p1+" gain = "+p2);
       this.b.setRxStreamMixerGain(p0, p1, p2);
       return 0;
    }
    public int a(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "setAudioFocusUser");
       this.b.setAudioFocusUser(p0);
       return 0;
    }
    public int a(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ok, "32");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "setEnableAudioMusicMode enable = "+p0);
       this.b.setEnableAudioMusicMode(p0);
       return 0;
    }
    public int b(){
       Iterator obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableAudio");
       obj = this.a.e().b().iterator();
       while (obj.hasNext()) {
          String str = obj.next();
          this.b.disableAudioTx(str);
          this.b.disableAudioRx(str);
       }
       this.b.disableAudioEngine();
       this.b.setMuteMicrophone(1);
       return 0;
    }
    public int b(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("RtcEngineCoreAudio", "adjustPlaybackVolume "+p0);
       this.b.setSpeakerVolume(this.c(p0));
       return 0;
    }
    public int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteAllRemoteAudioStreams channelId "+p0);
       this.b.unmuteAllRemoteAudioStreamsForCallId(p0);
       return 0;
    }
    public int b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteRemoteAudioStream "+p1+" channelId "+p0);
       if (p0 != null) {
          this.b.unmuteRemoteAudioStream(p0, p1);
       }
       return 0;
    }
    public final float c(int p0){
       return ((float)p0 / 100.00f);
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableAudioVolumeIndication");
       this.w();
       return 0;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "enableLocalAudio");
       this.g = false;
       this.b.setEnableLocalRecording(true);
       this.b.setMuteMicrophone(false);
       return false;
    }
    public final void d(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "33")) {
          return;
       }
       if (this.e == null) {
          k$1 u1 = new k$1(this, p0);
          this.e = u1;
          this.d.post(u1);
       }else {
          Log.i("RtcEngineCoreAudio", "startFetchAudioInfo but should stop first");
       }
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableLocalAudio");
       this.g = true;
       this.b.setEnableLocalRecording(false);
       this.b.setMuteMicrophone(true);
       return false;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteLocalAudioStream");
       this.b.setMuteMicrophone(1);
       this.f = true;
       return 0;
    }
    public int g(){
       Iterator obj = PatchProxy.apply(null, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteLocalAudioStream");
       this.b.setMuteMicrophone(0);
       obj = this.a.e().b().iterator();
       while (obj.hasNext()) {
          this.b.enableAudioTx(obj.next());
       }
       this.f = false;
       return 0;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteRecordingSignal");
       this.b.setStannisMuteMicrophone(1);
       return 0;
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteRecordingSignal");
       this.b.setStannisMuteMicrophone(0);
       return 0;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, k.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "enableLocalAudioComfortableNoise");
       this.b.setMuteMicrophone(2);
       return 0;
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableLocalAudioComfortableNoise");
       this.b.setMuteMicrophone(0);
       return 0;
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, k.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteAllRemoteAudioStreams");
       this.b.muteAllRemoteAudioStreams();
       return 0;
    }
    public int m(){
       Object obj = PatchProxy.apply(null, this, k.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteAllRemoteAudioStreams");
       this.b.unmuteAllRemoteAudioStreams();
       return 0;
    }
    public int n(){
       Object obj = PatchProxy.apply(null, this, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "muteSpeaker");
       this.b.setMuteSpeaker(true);
       return 0;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "unmuteSpeaker");
       this.b.setMuteSpeaker(false);
       return false;
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, k.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "setDefaultMuteAllRemoteAudioStreams");
       this.b.setDefaultMuteAllRemoteAudioStreams(true);
       return 0;
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, k.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "setDefaultUnmuteAllRemoteAudioStreams");
       this.b.setDefaultMuteAllRemoteAudioStreams(false);
       return false;
    }
    public int r(){
       Object obj = PatchProxy.apply(null, this, k.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "enableNoiseSuppression");
       this.b.setEnableNoiseSuppression(true);
       return 0;
    }
    public int s(){
       Object obj = PatchProxy.apply(null, this, k.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableNoiseSuppression");
       this.b.setEnableNoiseSuppression(false);
       return false;
    }
    public int t(){
       Object obj = PatchProxy.apply(null, this, k.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "enableRequestAudioFocus");
       this.b.setRequestAudioFocus(true);
       return 0;
    }
    public int u(){
       Object obj = PatchProxy.apply(null, this, k.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineCoreAudio", "disableRequestAudioFocus");
       this.b.setRequestAudioFocus(false);
       return false;
    }
    public final RtcEngineAudioVolumeInfo[] v(){
       ArrayList obj = PatchProxy.apply(null, this, k.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       a uoa = this.a.e();
       Arya$AryaMicrophoneInfo stannisMicro = this.b.getStannisMicrophoneInfo();
       Iterator iterator = uoa.a().iterator();
       while (iterator.hasNext()) {
          obj.add(new RtcEngineAudioVolumeInfo(iterator.next(), "0", stannisMicro.energy, stannisMicro.vad));
       }
       String[] activeSpeake = this.b.getActiveSpeakers();
       int len = activeSpeake.length;
       int i = 0;
       while (i < len) {
          object oobject = activeSpeake[i];
          if (!this.a.a(oobject)) {
             obj.add(new RtcEngineAudioVolumeInfo(uoa.b(oobject), oobject, this.b.getVoiceEnergy(oobject), 0));
          }
          i = i + 1;
       }
       RtcEngineAudioVolumeInfo[] rtcEngineAud = new RtcEngineAudioVolumeInfo[obj.size()];
       return obj.toArray(rtcEngineAud);
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, k.class, "35")) {
          return;
       }
       k te = this.e;
       if (te != null) {
          this.d.removeCallbacks(te);
          this.e = null;
       }
       return;
    }
}
