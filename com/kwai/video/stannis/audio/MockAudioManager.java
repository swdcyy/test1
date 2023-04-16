package com.kwai.video.stannis.audio.MockAudioManager;
import com.kwai.video.stannis.audio.AudioManagerInterface;
import java.lang.Object;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.AudioDeviceInfo;
import java.lang.String;

public class MockAudioManager implements AudioManagerInterface	// class@000c09
{

    public void MockAudioManager(){
       super();
    }
    public int abandonAudioFocus(AudioManager$OnAudioFocusChangeListener p0){
       return 0;
    }
    public AudioDeviceInfo[] getDevices(int p0){
       AudioDeviceInfo[] uAudioDevice = new AudioDeviceInfo[0];
       return uAudioDevice;
    }
    public int getMode(){
       return 0;
    }
    public String getParameters(String p0){
       return null;
    }
    public int getStreamMaxVolume(int p0){
       return 0;
    }
    public int getStreamVolume(int p0){
       return 0;
    }
    public boolean isBluetoothScoOn(){
       return false;
    }
    public boolean isMicrophoneMute(){
       return false;
    }
    public boolean isSpeakerphoneOn(){
       return false;
    }
    public boolean isWiredHeadsetOn(){
       return false;
    }
    public int requestAudioFocus(AudioManager$OnAudioFocusChangeListener p0,int p1,int p2){
       return 0;
    }
    public void setBluetoothScoOn(boolean p0){
    }
    public void setMicrophoneMute(boolean p0){
    }
    public void setMode(int p0){
    }
    public void setParameters(String p0){
    }
    public void setRouting(int p0,int p1,int p2){
    }
    public void setSpeakerphoneOn(boolean p0){
    }
    public void startBluetoothSco(){
    }
    public void stopBluetoothSco(){
    }
}
