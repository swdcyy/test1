package com.kwai.video.stannis.audio.AudioManagerInterface;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.AudioDeviceInfo;
import java.lang.String;

public interface abstract AudioManagerInterface	// class@000c06
{

    int abandonAudioFocus(AudioManager$OnAudioFocusChangeListener p0);
    AudioDeviceInfo[] getDevices(int p0);
    int getMode();
    String getParameters(String p0);
    int getStreamMaxVolume(int p0);
    int getStreamVolume(int p0);
    boolean isBluetoothScoOn();
    boolean isMicrophoneMute();
    boolean isSpeakerphoneOn();
    boolean isWiredHeadsetOn();
    int requestAudioFocus(AudioManager$OnAudioFocusChangeListener p0,int p1,int p2);
    void setBluetoothScoOn(boolean p0);
    void setMicrophoneMute(boolean p0);
    void setMode(int p0);
    void setParameters(String p0);
    void setRouting(int p0,int p1,int p2);
    void setSpeakerphoneOn(boolean p0);
    void startBluetoothSco();
    void stopBluetoothSco();
}
