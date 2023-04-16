package com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.AudioManagerInterface;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.media.AudioManager;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.stannis.audio.MockAudioManager;
import android.media.AudioDeviceInfo;
import java.lang.Integer;
import android.os.Build$VERSION;
import com.kwai.video.stannis.utils.Log;
import java.lang.Boolean;

public class AudioManagerProxy implements AudioManagerInterface	// class@000c07
{
    public AudioManager audioManager;
    public boolean enableMock;
    public MockAudioManager mockAudioManager;

    public void AudioManagerProxy(){
       super();
       this.enableMock = false;
    }
    public void AudioManagerProxy(Context p0){
       super();
       this.enableMock = false;
       this.audioManager = p0.getSystemService("audio");
    }
    public int abandonAudioFocus(AudioManager$OnAudioFocusChangeListener p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioManagerProxy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.abandonAudioFocus(p0);
       }
       return this.audioManager.abandonAudioFocus(p0);
    }
    public AudioDeviceInfo[] getDevices(int p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioManage, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.getDevices(p0);
       }else if(Build$VERSION.SDK_INT >= 23){
          return this.audioManager.getDevices(p0);
       }else {
          Log.w("AudioManagerProxy", "[AudioManagerProxy] getDevices not support.");
          return null;
       }
    }
    public int getMode(){
       Object obj = PatchProxy.apply(null, this, AudioManagerProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.getMode();
       }
       return this.audioManager.getMode();
    }
    public String getParameters(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioManagerProxy.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.getParameters(p0);
       }
       return this.audioManager.getParameters(p0);
    }
    public int getStreamMaxVolume(int p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioManage, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.getStreamMaxVolume(p0);
       }else {
          try{
             return this.audioManager.getStreamMaxVolume(p0);
          }catch(java.lang.Exception e0){
             return -1;
          }
       }
    }
    public int getStreamVolume(int p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioManage, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.getStreamVolume(p0);
       }else {
          try{
             return this.audioManager.getStreamVolume(p0);
          }catch(java.lang.Exception e0){
             return -1;
          }
       }
    }
    public boolean isBluetoothScoOn(){
       Object obj = PatchProxy.apply(null, this, AudioManagerProxy.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.isBluetoothScoOn();
       }
       return this.audioManager.isBluetoothScoOn();
    }
    public boolean isMicrophoneMute(){
       Object obj = PatchProxy.apply(null, this, AudioManagerProxy.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.isMicrophoneMute();
       }
       return this.audioManager.isMicrophoneMute();
    }
    public boolean isSpeakerphoneOn(){
       Object obj = PatchProxy.apply(null, this, AudioManagerProxy.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.isSpeakerphoneOn();
       }
       return this.audioManager.isSpeakerphoneOn();
    }
    public boolean isWiredHeadsetOn(){
       Object obj = PatchProxy.apply(null, this, AudioManagerProxy.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.isWiredHeadsetOn();
       }
       return this.audioManager.isWiredHeadsetOn();
    }
    public int requestAudioFocus(AudioManager$OnAudioFocusChangeListener p0,int p1,int p2){
       if (PatchProxy.isSupport(AudioManagerProxy.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AudioManagerProxy.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.enableMock != null) {
          return this.mockAudioManager.requestAudioFocus(p0, p1, p2);
       }else {
          return this.audioManager.requestAudioFocus(p0, p1, p2);
       }
    }
    public void setBluetoothScoOn(boolean p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioManage, "7")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setBluetoothScoOn(p0);
       }else {
          this.audioManager.setBluetoothScoOn(p0);
       }
       return;
    }
    public void setMicrophoneMute(boolean p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioManage, "8")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setMicrophoneMute(p0);
       }else {
          this.audioManager.setMicrophoneMute(p0);
       }
       return;
    }
    public void setMode(int p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioManage, "4")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setMode(p0);
       }else {
          this.audioManager.setMode(p0);
       }
       return;
    }
    public void setParameters(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioManagerProxy.class, "19")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setParameters(p0);
       }else {
          this.audioManager.setParameters(p0);
       }
       return;
    }
    public void setRouting(int p0,int p1,int p2){
       if (PatchProxy.isSupport(AudioManagerProxy.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AudioManagerProxy.class, "12")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setRouting(p0, p1, p2);
       }else {
          this.audioManager.setRouting(p0, p1, p2);
       }
       return;
    }
    public void setSpeakerphoneOn(boolean p0){
       AudioManagerProxy uAudioManage = AudioManagerProxy.class;
       if (PatchProxy.isSupport(uAudioManage) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioManage, "11")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.setSpeakerphoneOn(p0);
       }else {
          this.audioManager.setSpeakerphoneOn(p0);
       }
       return;
    }
    public void startBluetoothSco(){
       if (PatchProxy.applyVoid(null, this, AudioManagerProxy.class, "5")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.startBluetoothSco();
       }else {
          this.audioManager.startBluetoothSco();
       }
       return;
    }
    public void stopBluetoothSco(){
       if (PatchProxy.applyVoid(null, this, AudioManagerProxy.class, "6")) {
          return;
       }
       if (this.enableMock != null) {
          this.mockAudioManager.stopBluetoothSco();
       }else {
          this.audioManager.stopBluetoothSco();
       }
       return;
    }
}
