package com.kwai.video.stannis.audio.AudioDevice;
import java.lang.Object;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import android.media.projection.MediaProjection;

public abstract class AudioDevice	// class@000bf7
{

    public void AudioDevice(){
       super();
    }
    public abstract void enableInnerCapDump(boolean p0);
    public abstract int getDeviceType();
    public abstract int getPlayBackCallbackOffset();
    public abstract boolean initPlayout(AudioDeviceConfig p0);
    public abstract int initRecording(AudioDeviceConfig p0,int p1);
    public abstract boolean isInnerCapInstanceExist();
    public abstract boolean isPlaying();
    public abstract boolean isRecording();
    public abstract boolean startAudioInnerCap(int p0,int p1,MediaProjection p2);
    public abstract boolean startPlayout();
    public abstract boolean startRecording();
    public abstract void stopInnerCap();
    public abstract boolean stopPlayout();
    public abstract boolean stopRecording();
}
