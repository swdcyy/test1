package com.kwai.video.stannis.audio.StannisAudioManagerInterface;
import java.lang.String;
import com.kwai.video.stannis.StannisDeviceInfo;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import android.media.projection.MediaProjection;

public interface abstract StannisAudioManagerInterface	// class@000c0b
{

    void SetEnableRecordState(boolean p0);
    void addAudioTelephoneObserver();
    void closeDeviceHeaphoneMonitor();
    void enableInnerCapDump(boolean p0);
    String getCurRecordingDeviceName();
    StannisDeviceInfo getCurrentDevice(int p0);
    AudioDeviceConfig getDeviceConfig();
    StannisDeviceInfo[] getDevices(int p0);
    int getOutputType();
    int[] getOutputTypes();
    int getPlayBackCallbackOffset();
    int getPlugin(int p0);
    int getSpeakerDeviceVolume(int p0);
    boolean getSpeakerOn();
    int getUserSetOutputType();
    boolean hasStartedAudioInnerCap();
    void initOutputType(int p0);
    boolean isEnableHeadphoneMonitor();
    boolean isHeadphoneWithMic();
    boolean isHeadsetConnected();
    boolean isPlayOut();
    boolean isRecording();
    boolean isSupportHeaphoneMonitor();
    boolean isSupportVendorHeadphoneMonitor();
    boolean isUsbConnected();
    boolean isUserEnableHeadphoneMonitor();
    void onPhoneInterrupt(int p0);
    boolean openDeviceHeaphoneMonitor();
    void removeAudioTelephoneObserver();
    void resetAudioProcess();
    void resetDevice(int p0,String p1,boolean p2);
    void resetDevice(String p0,boolean p1);
    void resetRoundTripLatencyWithDelay(int p0);
    void resumeDeviceHeadphoneMonitor(boolean p0);
    void setAudioDeviceStatusListener(StannisAudioDeviceStatusObserver p0);
    void setAudioRouteListener(Stannis$AudioRouteListener p0);
    void setAudioSession();
    void setDefaultToReceiver(boolean p0);
    void setDeviceType(int p0);
    void setHeadphoneMonitorReverbLevel(int p0);
    void setHeadphoneMonitorVolume(float p0);
    void setKtvVendorSupport(boolean p0);
    boolean setOutputType(int p0,int p1);
    void setRequestAudioFocus(boolean p0);
    void setServerConfigStr(String p0);
    void setSpeakerOn(boolean p0);
    void setStereoCaptureAndProcess(boolean p0);
    void setUseSoftHeadphoneMonitor(boolean p0);
    void setUsingBuiltinMic(boolean p0);
    void setUsingLocalHeadphoneMonitorSetting(boolean p0);
    void startAudioDeviceCheckThread();
    boolean startAudioInnerCap(int p0,int p1,MediaProjection p2);
    boolean startPlayout(int p0);
    boolean startRecording(int p0,int p1);
    void stopAudioDeviceCheckThread();
    void stopInnerCap();
    boolean stopPlayout();
    boolean stopRecording();
    boolean stopRecording(boolean p0);
    void updateAudioDeviceConfig(int p0);
}