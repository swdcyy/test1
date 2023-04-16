package com.kwai.video.stannis.audio.impl.StannisAudioManager;
import android.bluetooth.BluetoothProfile$ServiceListener;
import android.media.AudioManager$OnAudioFocusChangeListener;
import com.kwai.video.stannis.audio.StannisAudioManagerInterface;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantLock;
import android.content.IntentFilter;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import java.lang.String;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$AudioDeviceCheckRunner;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$1;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.video.stannis.observers.TelephoneObserver;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$4;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$5;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$6;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.stannis.utils.Log;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.lang.RuntimeException;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$13;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.stannis.audio.AudioDevice;
import com.kwai.video.stannis.audio.AudioRecordListener;
import com.kwai.video.stannis.audio.support.LocalHeadphoneMonitor;
import com.kwai.video.stannis.StannisDeviceInfo;
import android.media.AudioDeviceInfo;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import com.kwai.video.stannis.audio.AudioDeviceJava;
import java.lang.StringBuffer;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$11;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$10;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$18;
import android.content.Intent;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$8;
import android.bluetooth.BluetoothProfile;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$2;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$3;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$9;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import java.lang.System;
import java.lang.Float;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$16;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$7;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$17;
import java.lang.Exception;
import java.lang.Thread;
import android.media.projection.MediaProjection;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$12;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$14;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$15;

public class StannisAudioManager extends BroadcastReceiver implements BluetoothProfile$ServiceListener, AudioManager$OnAudioFocusChangeListener, StannisAudioManagerInterface	// class@000c2b
{
    public StannisAudioCommon audioCommon;
    public StannisAudioManager$AudioDeviceCheckRunner audioDeviceCheckRunner;
    public Thread audioDeviceCheckThread;
    public ReentrantLock audioDeviceCheckThreadLock;
    public ReentrantLock audioDeviceLock;
    public StannisAudioDeviceStatusObserver audioDeviceStatusListener;
    public boolean audioFocusGain;
    public AudioManagerProxy audioManager;
    public AudioRecordListener audioRecordListener;
    public Stannis$AudioRouteListener audioRouteListener;
    public ReentrantLock audioRouterLock;
    public int checkScoIsNotConnectCount;
    public Thread checkScoIsNotConnectThread;
    public boolean checkScoIsNotConnectThreadRunning;
    public AudioDeviceConfig config;
    public Context context;
    public String curRecordingDeviceName;
    public int currentOutputType;
    public boolean defaultToReceiver;
    public AudioDevice device;
    public int deviceType;
    public ExecutorService executorService;
    public IntentFilter filter;
    public boolean forceReportRoute;
    public int innercap_channnels;
    public int innercap_samplerate;
    public boolean isBluetoothConnected;
    public boolean isBluetoothScoConnected;
    public boolean isEnableHeadphoneMonitor;
    public boolean isHeadsetConnected;
    public boolean isInitPlayout;
    public boolean isInitRecording;
    public boolean isInitialized;
    public boolean isKtvVendorSupport;
    public boolean isRegisterReceiver;
    public boolean isSetOutputTypeByStartAudioDevice;
    public boolean isSpeakerOn;
    public boolean isUsbConnected;
    public boolean isUseSoftHeadphoneMonitor;
    public int lastSpeakerOrReceiver;
    public BluetoothAdapter mAdapter;
    public MediaProjection mMediaProjection;
    public BluetoothProfile mProfile;
    public Handler mainLoopHandler;
    public boolean needForceUpdateRecordingDeviceName;
    public StannisNotifyObserver notifyObserver;
    public ReentrantLock profileLock;
    public boolean requestAudioFocus;
    public int savedAudioManagerMode;
    public boolean savedIsMicrophoneMute;
    public boolean savedIsSpeakerPhoneOn;
    public String serverConfigStr;
    public boolean setInnerCapStart;
    public int switchnum;
    public boolean userEnableHeadphoneMonitor;
    public int userSetOutputType;
    public boolean userSetSpeakerOn;
    public boolean usingBuiltinMic;
    public boolean usingLocalHeadphoneMonitorSetting;

    public void StannisAudioManager(Context p0,ExecutorService p1,long p2,StannisNotifyObserver p3){
       super();
       this.mainLoopHandler = new Handler(Looper.getMainLooper());
       this.audioDeviceLock = new ReentrantLock();
       this.isInitRecording = false;
       this.isInitPlayout = false;
       this.isInitialized = false;
       this.requestAudioFocus = false;
       this.audioFocusGain = false;
       this.isRegisterReceiver = false;
       this.savedAudioManagerMode = -2;
       this.savedIsSpeakerPhoneOn = false;
       this.savedIsMicrophoneMute = false;
       this.filter = new IntentFilter();
       this.isHeadsetConnected = false;
       this.isUsbConnected = false;
       this.isBluetoothConnected = false;
       this.isBluetoothScoConnected = false;
       this.isEnableHeadphoneMonitor = false;
       this.userEnableHeadphoneMonitor = false;
       this.isSpeakerOn = true;
       this.userSetSpeakerOn = true;
       this.isSetOutputTypeByStartAudioDevice = false;
       this.isKtvVendorSupport = true;
       this.deviceType = 0;
       this.isUseSoftHeadphoneMonitor = false;
       this.userSetOutputType = 0;
       this.currentOutputType = 0;
       this.audioDeviceCheckThreadLock = new ReentrantLock();
       this.lastSpeakerOrReceiver = 2;
       this.forceReportRoute = false;
       this.usingBuiltinMic = false;
       this.innercap_samplerate = 0;
       this.innercap_channnels = 0;
       this.mMediaProjection = null;
       this.setInnerCapStart = false;
       this.usingLocalHeadphoneMonitorSetting = false;
       this.mAdapter = null;
       this.mProfile = null;
       this.profileLock = new ReentrantLock();
       this.audioRouterLock = new ReentrantLock();
       this.curRecordingDeviceName = "unknown";
       this.serverConfigStr = "";
       this.needForceUpdateRecordingDeviceName = false;
       this.switchnum = 0;
       this.defaultToReceiver = false;
       this.checkScoIsNotConnectThreadRunning = false;
       this.checkScoIsNotConnectCount = 0;
       this.context = p0;
       this.executorService = p1;
       this.audioManager = new AudioManagerProxy(p0);
       this.audioCommon = new StannisAudioCommon(p2, p0, this.audioManager);
       this.notifyObserver = p3;
       this.filter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
       this.filter.addAction("android.intent.action.HEADSET_PLUG");
       this.filter.addAction("android.media.AUDIO_BECOMING_NOISY");
       this.filter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
       this.filter.addAction("android.media.VOLUME_CHANGED_ACTION");
       this.audioDeviceCheckRunner = new StannisAudioManager$AudioDeviceCheckRunner(this, null);
       p1.execute(new StannisAudioManager$1(this, p0));
    }
    public void SetEnableRecordState(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "95")) {
          return;
       }
       this.audioCommon.SetEnableRecordState(p0);
       return;
    }
    public void addAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "90")) {
          return;
       }
       TelephoneObserver.addTelephoneObserver(this.context, this);
       return;
    }
    public final void asyncGetBluetoothProfile(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "7")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$4(this));
       return;
    }
    public final void asyncResetDevice(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, StannisAudioManager.class, "11")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$5(this, p0, p1, p2));
       return;
    }
    public final void asyncSetDeviceName(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "12")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$6(this));
       return;
    }
    public boolean checkAndStartBluetoothSco(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.audioDeviceLock.isLocked()) {
          throw new RuntimeException("[StannisAudioManager] checkIfNeedStartBluetoothSco: unlocked");
       }
       boolean b = false;
       if (this.config == null) {
          Log.i("StannisAudioManager", "this.config is null");
          return b;
       }else {
          Log.i("StannisAudioManager", "[StannisAudioManager] checkIfNeedStartBluetoothSco start, mode = "+this.config.getAudioManagerMode()+", connect bt = "+this.isBluetoothConnected+"sco connect"+this.audioManager.isBluetoothScoOn());
          if (this.config.getAudioManagerMode() == 3 && this.isBluetoothConnected != null) {
             b = true;
          }
          if (b) {
             if (this.userSetOutputType == null || (this.userSetOutputType == 5 && !this.audioManager.isBluetoothScoOn())) {
                Log.i("StannisAudioManager", "[StannisAudioManager]SetScoOn Begin"+this.userSetOutputType);
                this.audioManager.startBluetoothSco();
                this.audioManager.setBluetoothScoOn(true);
                Log.i("StannisAudioManager", "[StannisAudioManager]SetScoOn End"+this.userSetOutputType);
             }
             if (this.userSetOutputType == null) {
                this.startCheckScoThread();
             }
          }
          Log.i("StannisAudioManager", "[StannisAudioManager] checkIfNeedStartBluetoothSco: "+b);
          return b;
       }
    }
    public boolean checkScoIsNotConnect(){
       StannisAudioManager obj = PatchProxy.apply(null, this, StannisAudioManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.config;
       if (obj == null) {
          Log.i("StannisAudioManager", "this.config is null");
          return false;
       }else if(obj.getAudioManagerMode() == 3 && (this.isBluetoothConnected != null && this.isBluetoothScoConnected == null)){
          return true;
       }else {
          return false;
       }
    }
    public void closeDeviceHeaphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "62")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$13(this));
       this.uploadDeviceInfo(this.getOutputType(), this.userSetOutputType);
       return;
    }
    public final int deviceInfoTypeToRouteType(int p0,int p1){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StannisAudioManager.class, "85");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == 1) {
          return this.inputDeviceInfoTypeToRouteType(p1);
       }else {
          return this.outputDeviceInfoTypeToRouteType(p1);
       }
    }
    public void enableInnerCapDump(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "32")) {
          return;
       }
       StannisAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.enableInnerCapDump(p0);
       }
       return;
    }
    public AudioRecordListener getAudioRecordListener(){
       return this.audioRecordListener;
    }
    public String getCurRecordingDeviceName(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] curRecordingDeviceName "+this.curRecordingDeviceName);
       return this.curRecordingDeviceName;
    }
    public AudioDeviceConfig getCurrentAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "74");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] getCurrentAudioDeviceConfig start");
       this.audioDeviceLock.lock();
       AudioDeviceConfig currentAudio = this.audioCommon.getCurrentAudioDeviceConfig(p0);
       if (currentAudio == null) {
          this.audioDeviceLock.unlock();
          Log.d("StannisAudioManager", "[StannisAudioManager] getCurrentAudioDeviceConfig end, this config is null");
          return null;
       }else if(this.audioCommon.isHeadsetConnected() || (this.audioCommon.isUsbConnected() && !this.isSupportVendorHeadphoneMonitor())){
          if (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport()) {
             Log.i("StannisAudioManager", "[StannisAudioManager] usingLocalHeadphoneMonitor");
             currentAudio.setDeviceType(LocalHeadphoneMonitor.getDeviceType());
             currentAudio.setRoundTripLatency(LocalHeadphoneMonitor.getRoundTripLatency());
          }else {
             currentAudio.setDeviceType(this.deviceType);
          }
       }else {
          currentAudio.setDeviceType(this.deviceType);
       }
       currentAudio.setUsingBuiltinMic(this.usingBuiltinMic);
       if (this.userSetOutputType != null) {
          currentAudio.setAudioMode(1);
       }
       this.audioDeviceLock.unlock();
       Log.d("StannisAudioManager", "[StannisAudioManager] getCurrentAudioDeviceConfig: "+currentAudio.toString());
       Log.d("StannisAudioManager", "[StannisAudioManager] getCurrentAudioDeviceConfig end");
       return currentAudio;
    }
    public StannisDeviceInfo getCurrentDevice(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "87");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       int i1 = 1;
       AudioDeviceInfo inputDevice = (p0 == i1)? this.getInputDevice(): this.getOutputDevice();
       if (inputDevice != null) {
          if (Build$VERSION.SDK_INT >= 23) {
             i = this.deviceInfoTypeToRouteType(p0, inputDevice.getType());
             StannisDeviceInfo stannisDevic = new StannisDeviceInfo(inputDevice.getId(), inputDevice.getProductName().toString(), i);
             String str = "Bluetooth";
             if (p0 == i1) {
                if (i) {
                   if (i != 20) {
                      if (i != 5) {
                         if (i != 6) {
                            stannisDevic.setName("unknown");
                         }else {
                            stannisDevic.setName("USB");
                         }
                      }else if(this.curRecordingDeviceName != "unknown"){
                         str = str+"\("+this.curRecordingDeviceName+"\)";
                      }
                      stannisDevic.setName(str);
                   }else {
                      stannisDevic.setName("BuiltinMic");
                   }
                }else {
                   stannisDevic.setName("HeadsetMic");
                }
             }else {
                switch (i){
                    case 0:
                      stannisDevic.setName("HeadSet");
                      break;
                    case 1:
                      stannisDevic.setName("Receiver");
                      break;
                    case 2:
                      stannisDevic.setName("HeadSetNoMic");
                      break;
                    case 3:
                      stannisDevic.setName("Speaker");
                      break;
                    case 4:
                      stannisDevic.setName("LoadSpeaker");
                      break;
                    case 5:
                      if (this.curRecordingDeviceName != "unknown") {
                         str = str+"\("+this.curRecordingDeviceName+"\)";
                      }
                      stannisDevic.setName(str);
                      break;
                    case 6:
                      stannisDevic.setName("USB");
                      break;
                    case 7:
                      stannisDevic.setName("Hdmi");
                      break;
                    default:
                      stannisDevic.setName("unknown");
                }
             }
             i = stannisDevic;
          }else {
             i = new StannisDeviceInfo(-1, "unknown", p0);
          }
       }
       return i;
    }
    public AudioDeviceConfig getDeviceConfig(){
       return this.config;
    }
    public StannisDeviceInfo[] getDevices(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "86");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       AudioDeviceInfo[] inputDevices = (p0 == 1)? this.getInputDevices(): this.getOutputDevices();
       if (inputDevices != null) {
          i = new StannisDeviceInfo[inputDevices.length];
          int i1 = 0;
          while (i1 < inputDevices.length) {
             object oobject = inputDevices[i1];
             i[i1] = (Build$VERSION.SDK_INT >= 23)? new StannisDeviceInfo(oobject.getId(), oobject.getProductName().toString(), this.deviceInfoTypeToRouteType(p0, oobject.getType())): new StannisDeviceInfo(-1, "unknown", p0);
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public AudioDeviceInfo getInputDevice(){
       Object[] objArray = null;
       StannisAudioManager obj = PatchProxy.apply(objArray, this, StannisAudioManager.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       obj = this.device;
       if (obj != null && !obj.getDeviceType()) {
          objArray = this.device.getInputDevice();
       }
       this.audioDeviceLock.unlock();
       return objArray;
    }
    public AudioDeviceInfo getInputDeviceInfo(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getInputDevice();
    }
    public AudioDeviceInfo[] getInputDevices(){
       Object[] objArray = null;
       StannisAudioManager obj = PatchProxy.apply(objArray, this, StannisAudioManager.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       obj = this.audioManager;
       if (obj != null) {
          objArray = obj.getDevices(1);
       }
       this.audioDeviceLock.unlock();
       return objArray;
    }
    public int getInputRouter(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (Build$VERSION.SDK_INT >= 23) {
          AudioDeviceInfo inputDeviceI = this.getInputDeviceInfo();
          if (inputDeviceI != null) {
             i = this.inputDeviceInfoTypeToRouteType(inputDeviceI.getType());
          }
       }
       return i;
    }
    public int getInputType(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       this.audioDeviceLock.lock();
       AudioDeviceInfo inputDevice = this.getInputDevice();
       if (inputDevice != null) {
          i = StannisAudioCommon.deviceInfoTypeToInputType(inputDevice);
       }
       this.audioDeviceLock.unlock();
       return i;
    }
    public int getMode(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Log.i("StannisAudioManager", "[StannisAudioManager] getMode start");
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getAudioMode();
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] getMode end");
       return i;
    }
    public AudioDeviceInfo getOutputDevice(){
       Object[] objArray = null;
       StannisAudioManager obj = PatchProxy.apply(objArray, this, StannisAudioManager.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       obj = this.device;
       if (obj != null && !obj.getDeviceType()) {
          objArray = this.device.getOutputDevice();
       }
       this.audioDeviceLock.unlock();
       return objArray;
    }
    public AudioDeviceInfo getOutputDeviceInfo(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getOutputDevice();
    }
    public AudioDeviceInfo[] getOutputDevices(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, StannisAudioManager.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] getOutputDevices start");
       this.audioDeviceLock.lock();
       StannisAudioManager taudioManage = this.audioManager;
       if (taudioManage != null) {
          objArray = taudioManage.getDevices(2);
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] getOutputDevices end");
       return objArray;
    }
    public int getOutputRouter(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (Build$VERSION.SDK_INT >= 23) {
          AudioDeviceInfo outputDevice = this.getOutputDeviceInfo();
          if (outputDevice != null) {
             i = this.outputDeviceInfoTypeToRouteType(outputDevice.getType());
          }
       }
       if (this.userSetOutputType != null && i == 4) {
          Log.i("StannisAudioManager", "[StannisAudioManager] choose device onRouteChange output =  "+i+"force set to line");
          i = 3;
       }
       return i;
    }
    public int getOutputType(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       this.audioDeviceLock.lock();
       if (this.device != null && Build$VERSION.SDK_INT >= 23) {
          AudioDeviceInfo outputDevice = this.getOutputDevice();
          if (outputDevice != null) {
             i = StannisAudioCommon.deviceInfoTypeToOutputType(outputDevice);
          }else {
             Log.d("StannisAudioManager", "[StannisAudioManager] getOutputTypeInternal deviceInfo is null");
          }
          if (this.userSetOutputType != null && i == 4) {
             i = 3;
          }
       }
    label_003e :
       this.audioDeviceLock.unlock();
       return i;
    }
    public int[] getOutputTypes(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.audioCommon.getOutputTypes();
    }
    public int getPlayBackCallbackOffset(){
       return 0;
    }
    public int getPlugin(int p0){
       Object[] obj;
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "73");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       int i1 = 0x10000;
       if (this.userSetOutputType != null) {
          StannisAudioManager tuserSetOutp = this.userSetOutputType;
          if (tuserSetOutp != i) {
             if (tuserSetOutp != 2) {
                if (tuserSetOutp != 3) {
                   if (tuserSetOutp != 4) {
                      if (tuserSetOutp == 5) {
                      label_003f :
                         i1 = 0x40000;
                      }
                   }else {
                   label_0042 :
                      i1 = 0x30000;
                   }
                }else {
                label_0045 :
                   i1 = 0x20000;
                }
             }else {
             label_0048 :
                i1 = 0x50000;
             }
          }
       }else if(this.isInitialized != null){
          if (this.isUsbConnected != null) {
             goto label_0042 ;
          }else if(this.isBluetoothConnected != null){
             goto label_003f ;
          }else if(this.isHeadsetConnected != null){
             goto label_0045 ;
          }else if(this.userSetSpeakerOn == null && this.ifReceiverAvailable(p0)){
             goto label_0048 ;
          }
       }else if(this.audioCommon.isUsbConnected()){
          goto label_0042 ;
       }else if(this.audioCommon.isBluetoothConnected()){
          goto label_003f ;
       }else if(this.audioCommon.isHeadsetConnected()){
          goto label_0045 ;
       }else if(this.userSetSpeakerOn == null && this.ifReceiverAvailable(p0)){
          goto label_0048 ;
       }
       obj = new Object[i];
       obj[0] = Integer.valueOf(i1);
       Log.d("StannisAudioManager", "[StannisAudioManager] getPluginType: "+String.format("%x", obj)+"£¬ isInitialized = "+this.isInitialized);
       return i1;
    }
    public int getSpeakerDeviceVolume(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 3;
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getStreamType();
       }else {
          Log.i("StannisAudioManager", "[StannisAudioManager] config is null");
       }
       this.audioDeviceLock.unlock();
       int b = StannisAudioCommon.isChatScene(p0);
       if (this.getPlugin(p0) == 0x40000 && b) {
          i = 6;
       }else if(this.currentOutputType != null){
          i = 0;
       }
       p0 = this.audioManager.getStreamVolume(i);
       i = this.audioManager.getStreamMaxVolume(i);
       b = -1;
       if (i) {
          int i1 = 100;
          p0 = (p0 * 100) / i;
          if (p0 <= i1) {
             i1 = p0;
          }
          if (i1 >= 0) {
             b = i1;
          }
       }
       return b;
    }
    public boolean getSpeakerOn(){
       boolean speakerOn;
       StannisAudioManager obj = PatchProxy.apply(null, this, StannisAudioManager.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.userSetSpeakerOn;
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null) {
          speakerOn = this.getSpeakerOn(tconfig.getScene());
       }else {
          Log.w("StannisAudioManager", "[StannisAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       return speakerOn;
    }
    public final boolean getSpeakerOn(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "68");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.userSetSpeakerOn == null && this.ifReceiverAvailable(p0)) {
          return false;
       }else {
          return true;
       }
    }
    public int getUserSetOutputType(){
       return this.userSetOutputType;
    }
    public boolean hasStartedAudioInnerCap(){
       StannisAudioManager obj = PatchProxy.apply(null, this, StannisAudioManager.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.device;
       if (obj != null) {
          return obj.isInnerCapInstanceExist();
       }
       return false;
    }
    public final boolean ifReceiverAvailable(int p0){
       if (p0 != 768 && (p0 == 2048 || p0 == 3328)) {
          return true;
       }
       return false;
    }
    public final boolean init(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] init start scene "+p0);
       this.audioDeviceLock.lock();
       boolean b = false;
       if (this.config == null) {
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] init end, this.config is null");
          return b;
       }else if(this.userSetOutputType != null || p0 == 3328){
          this.requestAudioFocus = true;
          Log.i("StannisAudioManager", "[StannisAudioManager] notauto case or kPrivMsgChat need requestAudioFocus to listen other app interrupt");
       }
       if (this.audioFocusGain == null && this.requestAudioFocus != null) {
          Log.i("StannisAudioManager", "[StannisAudioManager] requestAudioFocusGain strmtype "+this.config.getStreamType());
          if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
             this.notifyAudioDeviceStatus(b);
             this.audioFocusGain = b;
          }else {
             this.audioFocusGain = true;
          }
          Log.i("StannisAudioManager", "[HisenseAudioManager] requestAudioFocusGain stream type "+this.config.getStreamType()+", gained: "+this.audioFocusGain);
       }
       this.registerReceiver();
       if (this.isInitialized == null) {
          this.savedAudioManagerMode = this.audioManager.getMode();
          this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
          this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
          this.isHeadsetConnected = this.audioCommon.isHeadsetConnected();
          this.isUsbConnected = this.audioCommon.isUsbConnected();
          this.isBluetoothConnected = this.audioCommon.isBluetoothConnected();
          this.isInitialized = true;
          Log.i("StannisAudioManager", "[StannisAudioManager] init: mode = "+this.savedAudioManagerMode+", spk on = "+this.savedIsSpeakerPhoneOn+", mic mute = "+this.savedIsMicrophoneMute+", headset = "+this.isHeadsetConnected+", usb = "+this.isUsbConnected+", bluetooth = "+this.isBluetoothConnected+", current_output = "+this.currentOutputType);
       }
       this.updateAudioDeviceConfig(p0);
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] init end");
       return true;
    }
    public void initOutputType(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "75")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] initOutputType start "+p0);
       this.audioDeviceLock.lock();
       this.userSetOutputType = p0;
       this.audioDeviceLock.unlock();
       Log.d("StannisAudioManager", "[StannisAudioManager] initOutputType end "+p0);
       return;
    }
    public final boolean initPlayout(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] initPlayout start,get current mode "+this.audioManager.getMode());
       boolean b = false;
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] initPlayout end, this.config is null");
          return b;
       }else {
          this.audioCommon.reportPlayFormat(this.config.getPlaybackSampleRate(), this.config.getPlaybackChannelNum());
          this.resetDeviceOutput();
          this.isInitPlayout = true;
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] initPlayout end");
          return this.device.initPlayout(tconfig);
       }
    }
    public final int initRecording(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] initRecording start");
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig == null) {
          Log.i("StannisAudioManager", "[StannisAudioManager] initRecording end, this.config is null");
          this.audioDeviceLock.unlock();
          return -1;
       }else {
          p0 = this.device.initRecording(tconfig, p0);
          if (!p0) {
             this.isInitRecording = true;
          }
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] initRecording end");
          return p0;
       }
    }
    public final int inputDeviceInfoTypeToRouteType(int p0){
       int i = -1;
       if (p0) {
          if (p0 != 3) {
             if (p0 != 7) {
                if (p0 != 15) {
                   if (p0 == 22 || (p0 == 11 || p0 == 12)) {
                      i = 6;
                   }
                }else {
                   i = 20;
                }
             }else {
                i = 5;
             }
          }else {
             i = 0;
          }
       }
       return i;
    }
    public final String intArrToStr(int[] p0){
       StringBuffer obj = PatchProxy.applyOneRefs(p0, this, StannisAudioManager.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          obj = obj+p0[i]+" ";
       }
       return obj;
    }
    public boolean isEnableHeadphoneMonitor(){
       return this.isEnableHeadphoneMonitor;
    }
    public boolean isHeadphoneWithMic(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadphoneWithMic();
    }
    public boolean isHeadsetConnected(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadsetConnected();
    }
    public final boolean isOutputTypeSupported(int p0){
       int[] obj;
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "76");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getOutputTypes();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          int i1 = obj[i];
          if (i1 == p0) {
             break ;
          }else if(i1 == 4 && p0 == 3){
             Log.w("StannisAudioManager", "supportType4set is3");
             return true;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isPlayOut(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       if (tdevice != null) {
          b = tdevice.isPlaying();
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       if (tdevice != null && tdevice.isRecording()) {
          b = true;
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean isSupportHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.isSupportVendorHeadphoneMonitor();
       StringBuilder str = "[StannisAudioManager] isSupportHeaphoneMonitor vendorSupport = "+b+", isUseSoftHeadphoneMonitor = "+this.isUseSoftHeadphoneMonitor+", usingLocalHeadphoneMonitor = ";
       boolean b1 = true;
       boolean b2 = (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport())? true: false;
       Log.i("StannisAudioManager", str+b2);
       if (b || (this.isUseSoftHeadphoneMonitor == null && (this.usingLocalHeadphoneMonitorSetting == null || !LocalHeadphoneMonitor.isLocalHeadphoneSupport()))) {
          b1 = false;
       }
    label_0061 :
       return b1;
    }
    public boolean isSupportHeaphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "58");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportHeaphoneMonitor();
    }
    public boolean isSupportVendorHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isKtvVendorSupport != null) {
          return this.audioCommon.isSupportVendorHeadphoneMonitor();
       }
       return false;
    }
    public boolean isUsbConnected(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isUsbConnected();
    }
    public boolean isUserEnableHeadphoneMonitor(){
       return this.userEnableHeadphoneMonitor;
    }
    public final void notifyAudioDeviceStatus(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "18")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$11(this, p0));
       return;
    }
    public void onAudioFocusChange(int p0){
       StannisAudioManager tnotifyObser;
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "17")) {
          return;
       }
       String str = "StannisAudioManager";
       Log.i(str, "[StannisAudioManager] onAudioFocusChange reason = "+p0+this.notifyObserver);
       if (this.requestAudioFocus != null) {
          StannisAudioManager$10 u10 = 103;
          String str1 = null;
          if (p0 != -3 && p0 != -2) {
             if (p0 != -1) {
                if (p0 == 1) {
                   if (this.audioFocusGain == null) {
                      tnotifyObser = this.notifyObserver;
                      if (tnotifyObser != null) {
                         tnotifyObser.onNotify(104);
                      }
                   }
                   this.executorService.execute(new StannisAudioManager$10(this));
                   if (this.userSetOutputType != null) {
                      Log.i(str, "[StannisAudioManager] other app switch route "+this.getOutputType()+" need do report, previous device "+this.userSetOutputType+"focus gain:"+this.audioFocusGain);
                      this.asyncResetDevice("Interrupt end force reset , userSetOutputType = "+this.userSetOutputType, 1, 1);
                   }
                }
             }else {
                this.audioFocusGain = str1;
                if (this.audioFocusGain == null) {
                   tnotifyObser = this.notifyObserver;
                   if (tnotifyObser != null) {
                      tnotifyObser.onNotify(u10);
                   }
                }
             }
          }else {
             this.audioFocusGain = str1;
             if (this.audioFocusGain == null) {
                tnotifyObser = this.notifyObserver;
                if (tnotifyObser != null) {
                   tnotifyObser.onNotify(u10);
                }
             }
          }
       }
       return;
    }
    public void onPhoneInterrupt(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "89")) {
          return;
       }
       Log.i("StannisAudioManager", "[KWStannis] AudioManager OnPhoneInterrupt "+p0+"notifyObserver "+this.notifyObserver);
       if (this.notifyObserver != null) {
          this.executorService.execute(new StannisAudioManager$18(this, p0));
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       int intExtra;
       String str3;
       String str4;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StannisAudioManager.class, "14")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] onReceive_intent: "+p1.getAction());
       String str = "unknown";
       String str1 = 2;
       int i = -1;
       boolean b = true;
       if ((p1.getAction()).equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
          intExtra = p1.getIntExtra("android.media.extra.SCO_AUDIO_STATE", i);
          if (intExtra != i) {
             if (intExtra) {
                if (intExtra != b) {
                   if (intExtra == str1) {
                      str = "SCO_AUDIO_STATE_CONNECTING";
                   }
                }else {
                   this.isBluetoothScoConnected = b;
                   if (this.userSetOutputType != null) {
                      this.currentOutputType = 5;
                   }
                   if (this.needForceUpdateRecordingDeviceName != null) {
                      if (this.config.getScene() == 2048) {
                         this.asyncSetDeviceName();
                      }else {
                         this.setCurRecordingDeviceName(str);
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }
                   str = "SCO_AUDIO_STATE_CONNECTED";
                }
             }else {
                this.setCurRecordingDeviceName(str);
                if (this.isBluetoothScoConnected != null) {
                   this.isBluetoothScoConnected = false;
                   this.currentOutputType = this.userSetOutputType;
                   if (this.needForceUpdateRecordingDeviceName != null) {
                      this.setCurRecordingDeviceName(str);
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }
                str = "SCO_AUDIO_STATE_DISCONNECTED";
             }
          }else {
             str = "SCO_AUDIO_STATE_ERROR";
          }
          Log.i("StannisAudioManager", "[StannisAudioManager] AudioManager.EXTRA_SCO_AUDIO_STATE = "+str);
       }else {
          String str2 = "android.bluetooth.profile.extra.STATE";
          if ((p1.getAction()).equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
             intExtra = p1.getIntExtra(str2, i);
             if (intExtra) {
                if (intExtra != b) {
                   if (intExtra != str1) {
                      if (intExtra == 3) {
                         str = "STATE_DISCONNECTING";
                      }
                   }else {
                      str = "STATE_CONNECTED";
                   }
                }else {
                   str = "STATE_CONNECTING";
                }
             }else {
                str = "STATE_DISCONNECTED";
             }
             Log.i("StannisAudioManager", "[StannisAudioManager] BluetoothA2dp.EXTRA_STATE = "+str);
          }else {
             str = 4;
             if ((p1.getAction()).equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                intExtra = p1.getIntExtra(str2, i);
                if (intExtra) {
                   if (intExtra != b) {
                      if (intExtra != str1) {
                         if (intExtra != 3) {
                            str3 = "BluetoothHeadset.unknown";
                         }else {
                            str3 = "BluetoothHeadset.STATE_DISCONNECTING";
                         }
                      }else {
                         str3 = "BluetoothHeadset.STATE_CONNECTED";
                         Log.i("StannisAudioManager", "[StannisAudioManager] isBluetoothScoConnect");
                         this.asyncGetBluetoothProfile();
                         if (this.userSetOutputType != null && this.isBluetoothScoConnected == null) {
                            this.isBluetoothConnected = b;
                            this.userSetOutputType = 5;
                            this.asyncResetDevice(str3+", userSetOutputType = "+this.userSetOutputType, b, b);
                            Log.i("StannisAudioManager", "[StannisAudioManager] BluetoothSco not Connect force reset device");
                         }else if(this.isBluetoothConnected == null){
                            this.isBluetoothConnected = b;
                            if (this.userSetOutputType != null) {
                               if (this.userSetOutputType != 5) {
                                  this.userSetOutputType = 5;
                                  this.asyncResetDevice(str3+", userSetOutputType = "+this.userSetOutputType, false, b);
                               }
                            }else {
                               this.asyncResetDevice(str3+", userSetOutputType = "+this.userSetOutputType, false, false);
                            }
                         }
                      }
                   }else {
                      str3 = "BluetoothHeadset.STATE_CONNECTING";
                   }
                }else {
                   str3 = "BluetoothHeadset.STATE_DISCONNECTED";
                   this.isBluetoothConnected = false;
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType == 5) {
                         if (this.isHeadsetConnected != null) {
                            this.userSetOutputType = 3;
                         }else if(this.isUsbConnected != null){
                            this.userSetOutputType = str;
                         }else {
                            this.userSetOutputType = this.lastSpeakerOrReceiver;
                         }
                         if (this.userSetOutputType == str1) {
                            Log.i("StannisAudioManager", "[StannisAudioManager] Bluetooth disconnect switch to receiver should force report");
                         }
                         this.asyncResetDevice(str3+" 1, userSetOutputType = "+this.userSetOutputType, false, b);
                      }
                   }else {
                      this.asyncResetDevice(str3+" 2, userSetOutputType = "+this.userSetOutputType, false, false);
                   }
                }
                Log.i("StannisAudioManager", "[StannisAudioManager] BluetoothHeadset.EXTRA_STATE = "+str3);
             }else if((p1.getAction()).equals("android.intent.action.HEADSET_PLUG")){
                intExtra = p1.getIntExtra("state", i);
                Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_HEADSET_PLUG state = "+intExtra+", microphone = "+p1.getIntExtra("microphone", i));
                str4 = "isHeadsetConnected = ";
                if (!intExtra) {
                   this.isHeadsetConnected = false;
                   this.closeDeviceHeaphoneMonitor();
                   this.notifyAudioDeviceStatus(str);
                   if (this.userSetOutputType != null) {
                      if (this.isUsbConnected != null) {
                         Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_HEADSET_PLUG state use usbheadset force set to headphone");
                         this.isUsbConnected = false;
                      }
                      if (this.userSetOutputType == 3) {
                         if (this.isBluetoothConnected != null) {
                            this.userSetOutputType = 5;
                         }else if(this.isUsbConnected != null){
                            this.userSetOutputType = str;
                         }else {
                            this.userSetOutputType = this.lastSpeakerOrReceiver;
                         }
                         if (this.userSetOutputType == str1) {
                            Log.i("StannisAudioManager", "[StannisAudioManager] Headset disconnect switch to receiver should force report");
                         }else {
                            b = false;
                         }
                         this.asyncResetDevice(str4+intExtra+", userSetOutputType = "+this.userSetOutputType, false, b);
                      }
                   }else {
                      this.asyncResetDevice(str4+intExtra+", userSetOutputType = "+this.userSetOutputType, false, false);
                   }
                }else if(intExtra == b && this.isHeadsetConnected == null){
                   this.isHeadsetConnected = b;
                   this.notifyAudioDeviceStatus(3);
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType != 3) {
                         this.userSetOutputType = 3;
                         Log.i("StannisAudioManager", "[StannisAudioManager] some headset notifycation come after system has routing it,forceReportRoute");
                         this.asyncResetDevice(str4+intExtra+", userSetOutputType = "+this.userSetOutputType, false, b);
                      }
                   }else if(this.config.getScene() == 3328 && this.isUsbConnected != null){
                      Log.i("StannisAudioManager", "[StannisAudioManager] maybe is typec headset,force reset");
                   }else {
                      b = false;
                   }
                   this.asyncResetDevice(str4+intExtra+", userSetOutputType = "+this.userSetOutputType, b, false);
                }
                Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_HEADSET_PLUG.state = "+intExtra);
             }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")){
                Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_USB_DEVICE plugin");
                if (this.userSetOutputType != null) {
                   Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_USB_DEVICE plugin not support");
                   return;
                }else if(this.isUsbConnected == null){
                   this.isUsbConnected = b;
                   str4 = "ACTION_USB_DEVICE_ATTACHED , userSetOutputType = ";
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType != str) {
                         this.userSetOutputType = str;
                         this.asyncResetDevice(str4+this.userSetOutputType, false, this.forceReportRoute);
                      }
                   }else {
                      this.asyncResetDevice(str4+this.userSetOutputType, false, false);
                   }
                }
             }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_DETACHED")){
                Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_USB_DEVICE unplugged");
                if (this.userSetOutputType != null) {
                   Log.i("StannisAudioManager", "[StannisAudioManager] ACTION_USB_DEVICE unplugin not support");
                   return;
                }else {
                   this.isUsbConnected = false;
                   this.closeDeviceHeaphoneMonitor();
                   str4 = "ACTION_USB_DEVICE_DETACHED , userSetOutputType = ";
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType == str) {
                         if (this.isBluetoothConnected != null) {
                            this.userSetOutputType = 5;
                         }else if(this.isHeadsetConnected != null){
                            this.userSetOutputType = 3;
                         }else {
                            this.userSetOutputType = this.lastSpeakerOrReceiver;
                         }
                         this.asyncResetDevice(str4+this.userSetOutputType, false, this.forceReportRoute);
                      }
                   }else {
                      this.asyncResetDevice(str4+this.userSetOutputType, false, false);
                   }
                }
             }else if((p1.getAction()).equals("android.media.VOLUME_CHANGED_ACTION")){
                this.setInnerCapDataVolume();
             }
          }
       }
       this.executorService.execute(new StannisAudioManager$8(this));
       return;
    }
    public void onServiceConnected(int p0,BluetoothProfile p1){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, StannisAudioManager.class, "5")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$2(this, p0, p1));
       return;
    }
    public void onServiceDisconnected(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "6")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$3(this, p0));
       return;
    }
    public boolean openDeviceHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isSupportHeaphoneMonitor()) {
          return false;
       }
       this.userEnableHeadphoneMonitor = true;
       this.userEnableHeadphoneMonitor = this.openDeviceHeaphoneMonitorInternal();
       return this.userEnableHeadphoneMonitor;
    }
    public final boolean openDeviceHeaphoneMonitorInternal(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 3;
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getStreamType();
       }
       this.audioDeviceLock.unlock();
       if (this.userEnableHeadphoneMonitor != null) {
          this.isEnableHeadphoneMonitor = (this.isKtvVendorSupport != null)? this.audioCommon.enableVendorHeadphoneMonitor(i): false;
          if (this.isEnableHeadphoneMonitor == null) {
             if (this.isUseSoftHeadphoneMonitor != null) {
                this.audioCommon.enableSoftHeadphoneMonitor(true);
                this.isEnableHeadphoneMonitor = true;
             }else if(this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport()){
                this.audioCommon.enableSoftHeadphoneMonitor(true);
                this.isEnableHeadphoneMonitor = true;
             }
          }
       }
    label_005d :
       this.uploadDeviceInfo();
       return this.isEnableHeadphoneMonitor;
    }
    public final int outputDeviceInfoTypeToRouteType(int p0){
       int i = -1;
       if (p0 != 11 && p0 != 12) {
          if (p0 != 19) {
             if (p0 != 22) {
                switch (p0){
                    case 0:
                    case 1:
                      i = 1;
                      break;
                    case 2:
                      i = 3;
                      break;
                    case 3:
                      i = 0;
                      break;
                    case 4:
                      i = 2;
                      break;
                    case 5:
                    case 6:
                      break;
                    case 7:
                    case 8:
                      i = 5;
                      break;
                    case 9:
                      i = 7;
                      break;
                    default:
                }
             }else {
             label_0023 :
                i = 6;
             }
          }
          i = 4;
       }else {
          goto label_0023 ;
       }
       return i;
    }
    public void registerReceiver(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "46")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] registerReceiver start");
       this.audioDeviceLock.lock();
       this.unregisterReceiver();
       UniversalReceiver.e(this.context, this, this.filter);
       this.isRegisterReceiver = true;
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] registerReceiver end");
       return;
    }
    public void removeAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "91")) {
          return;
       }
       TelephoneObserver.removeTelephoneObserver();
       return;
    }
    public void resetAudioProcess(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "71")) {
          return;
       }
       this.audioCommon.resetAudioProcess();
       return;
    }
    public void resetDevice(int p0,String p1,boolean p2){
       boolean b;
       boolean b3;
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, StannisAudioManager.class, "37")) {
          return;
       }
       p1 = ", userSetOutputType = ";
       Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice start, reason: "+p1+p1+this.userSetOutputType+", currentOutType = "+this.currentOutputType);
       this.audioDeviceLock.lock();
       String str = 5;
       if (this.userSetOutputType != null && this.userSetOutputType != this.currentOutputType) {
          Log.d("StannisAudioManager", "[StannisAudioManager] resetDevice userReset: "+this.currentOutputType+" -> "+this.userSetOutputType);
          if (this.currentOutputType == str && this.audioManager.isBluetoothScoOn()) {
             Log.d("StannisAudioManager", "[StannisAudioManager] resetDevice setScoOff");
             this.audioManager.stopBluetoothSco();
             this.audioManager.setBluetoothScoOn(false);
             b = true;
          label_009b :
             boolean b1 = this.audioManager.isBluetoothScoOn();
             AudioDeviceConfig currentAudio = this.getCurrentAudioDeviceConfig(p0);
             this.config = currentAudio;
             if (currentAudio == null) {
                this.audioDeviceLock.unlock();
                Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice getCurrentAudioDeviceConfig == null");
                return;
             }else if(this.device != null){
                Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice needRestart  = "+this.config.isNeedRestart()+", userReset = "+true);
                if (!this.config.isNeedRestart() && (true || p2)) {
                   boolean b2 = this.device.isRecording();
                   this.device.stopRecording();
                   this.device.stopPlayout();
                   this.isInitRecording = false;
                   this.isInitPlayout = false;
                   this.device = this.audioCommon.createDevice(this.config.getDeviceType());
                   this.setAudioSession();
                   if (this.device.isPlaying()) {
                      if (!this.initPlayout()) {
                         Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice initPlayout error.");
                      }else {
                         this.device.startPlayout();
                      }
                   }
                   if (b2) {
                      if (this.initRecording(false) < 0) {
                         Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice initRecording error.");
                      }else {
                         this.device.startRecording();
                      }
                   }
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType == str) {
                         if (this.checkAndStartBluetoothSco()) {
                            Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice checkAndStartBluetoothSco.");
                         }else {
                            Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice checkAndStartBluetoothSco failed.");
                         }
                         b1 = true;
                      }
                   }else {
                      this.checkAndStartBluetoothSco();
                   }
                }
             }else {
                Log.w("StannisAudioManager", "[StaoManager] resetDevice but device is null");
             }
             if (this.device.isInnerCapInstanceExist() || (this.setInnerCapStart != null && this.mMediaProjection != null)) {
                Log.i("StannisAudioManager", "[StannisAudioManager] detect InnerCapInstanceExist should adjust rx and speech broadcast,cur mode "+this.config.getAudioMode()+"scene "+this.config.getScene());
                if (this.config.getAudioMode() == 1) {
                   this.audioCommon.TxForceAddRxListener();
                }else {
                   this.audioCommon.TxForceRemoveRxListener();
                }
             }else {
                Log.i("StannisAudioManager", "[StannisAudioManager] innercap not exist or not start");
             }
             this.audioDeviceLock.unlock();
             Log.d("StannisAudioManager", "[StannisAudioManager] resetDevice isStartSco = "+b1+", isStopSco = "+b+", userReset = "+true);
             if (!b1 && (b || true)) {
                this.updateAudioDeviceConfig(p0);
             }
             this.uploadDeviceInfo(this.getOutputType(), this.userSetOutputType);
             this.resetAudioProcess();
             Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice end, currentOutputType = "+this.currentOutputType+p1+this.userSetOutputType);
             return;
          }else {
             b3 = true;
          }
       }else {
          b3 = false;
       }
       b = false;
       goto label_009b ;
    }
    public void resetDevice(String p0,boolean p1){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, StannisAudioManager.class, "35")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice start, reason = "+p0+", force = "+p1);
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null) {
          this.isSpeakerOn = this.getSpeakerOn(tconfig.getScene());
          this.resetDevice(this.config.getScene(), p0, p1);
       }else {
          Log.w("StannisAudioManager", "[StannisAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice end, reason = "+p0);
       return;
    }
    public final void resetDeviceOutput(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "36")) {
          return;
       }
       if (this.userSetOutputType != null) {
          StannisAudioManager tuserSetOutp = this.userSetOutputType;
          int i = 8;
          String str = 4;
          int i1 = 2;
          if (tuserSetOutp != 1) {
             if (tuserSetOutp != i1) {
                if (tuserSetOutp != 3 && tuserSetOutp != str) {
                   if (tuserSetOutp == 5) {
                      i = 4;
                   }
                }
             }
             i = 1;
          }else {
             i = 2;
          }
          Log.i("StannisAudioManager", "[StannisAudioManager] resetDevice userSetOutputType = "+this.userSetOutputType+", routing = "+i);
          tuserSetOutp = this.audioManager;
          tuserSetOutp.setRouting(tuserSetOutp.getMode(), i, 0);
       }
       return;
    }
    public void resetOutputType(){
       this.userSetSpeakerOn = true;
       this.userSetOutputType = 0;
       this.currentOutputType = 0;
    }
    public void resetRoundTripLatencyWithDelay(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "16")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] resetRoundTripLatencyWithDelay start");
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig == null) {
          Log.i("StannisAudioManager", "this.config is null");
          this.audioDeviceLock.unlock();
          return;
       }else if(p0 > 0){
          this.mainLoopHandler.postDelayed(new StannisAudioManager$9(this, tconfig.getRoundTripLatency()), (long)p0);
       }else {
          this.audioCommon.setRoundTripLatency(tconfig.getRoundTripLatency());
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] resetRoundTripLatencyWithDelay end");
       return;
    }
    public void resumeDeviceHeadphoneMonitor(boolean p0){
    }
    public void setAudioDeviceStatusListener(StannisAudioDeviceStatusObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisAudioManager.class, "43")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setAudioDeviceStatusListener start");
       this.audioDeviceLock.lock();
       this.audioDeviceStatusListener = p0;
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] setAudioDeviceStatusListener end");
       return;
    }
    public void setAudioRecordListener(AudioRecordListener p0){
       this.audioRecordListener = p0;
    }
    public void setAudioRouteListener(Stannis$AudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisAudioManager.class, "4")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] setAudioRouteListener = "+p0);
       this.audioRouterLock.lock();
       this.audioRouteListener = p0;
       this.audioRouterLock.unlock();
       return;
    }
    public void setAudioSession(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "39")) {
          return;
       }
       String str = "StannisAudioManager";
       Log.i(str, "[StannisAudioManager] setAudioSession start");
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i(str, "[StannisAudioManager] setAudioSession end, this.config is null");
          return;
       }else {
          boolean audioManager = tconfig.getAudioManagerMode();
          int mode = this.audioManager.getMode();
          Log.i(str, "[StannisAudioManager] audioManager current Mode "+mode+" tosetMode "+audioManager);
          String str1 = "[StannisAudioManager] audioManager before setMode ";
          if (this.userSetOutputType != null) {
             Log.i(str, str1+mode+"set MODE_IN_COMMUNICATION");
             this.audioManager.setMode(3);
             Log.i(str, "[StannisAudioManager] audioManager set MODE_IN_COMMUNICATION spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
             Log.i(str, "[StannisAudioManager] audioManager curMgrMode"+this.audioManager.getMode());
             this.audioCommon.setIsDeviceAecOn(true);
          }else if(audioManager != mode){
             Log.i(str, str1+mode+"setMode = "+audioManager);
             this.audioManager.setMode(audioManager);
             Log.i(str, "[StannisAudioManager] audioManager after setMode "+audioManager);
             Log.i(str, "[StannisAudioManager] audioManager get mode spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms curMgrMode"+this.audioManager.getMode());
             audioManager = (audioManager == 3)? true: false;
             this.audioCommon.setIsDeviceAecOn(audioManager);
          }
          if (this.userSetOutputType == null) {
             this.isBluetoothConnected = this.audioCommon.isBluetoothConnected();
             this.isHeadsetConnected = this.audioCommon.isHeadsetConnected();
             this.isUsbConnected = this.audioCommon.isUsbConnected();
             Log.i(str, "[StannisAudioManager] audioManager get bluetooth connect state"+this.isBluetoothConnected+"headset "+this.isHeadsetConnected+"usb "+this.isUsbConnected);
             if (this.isHeadsetConnected != null || this.isUsbConnected != null) {
                this.setSpeakerOnWrapper(false);
             }else if(this.isBluetoothConnected != null){
                this.setSpeakerOnWrapper(false);
             }else {
                this.isSpeakerOn = this.getSpeakerOn(this.config.getScene());
                Log.i(str, "[StannisAudioManager] audioManager setAudioSession isSpeakerOn "+this.isSpeakerOn);
                this.setSpeakerOnWrapper(this.isSpeakerOn);
             }
          }else {
             audioManager = this.audioManager.isBluetoothScoOn();
             if (this.userSetOutputType == true) {
                Log.i(str, "[StannisAudioManager] audioManager setAudioSession setSpeakerOn true sco "+audioManager);
                this.setSpeakerOnWrapper(true);
             }else {
                Log.i(str, "[StannisAudioManager] audioManager setAudioSession setSpeakerOn false sco "+audioManager);
                this.setSpeakerOnWrapper(false);
             }
          }
          Log.i(str, "[StannisAudioManager] setAudioSession end");
          this.audioDeviceLock.unlock();
          return;
       }
    }
    public void setCurRecordingDeviceName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisAudioManager.class, "40")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setcurRecordingDeviceName "+p0);
       this.curRecordingDeviceName = p0;
       return;
    }
    public void setDefaultToReceiver(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "88")) {
          return;
       }
       Log.i("StannisAudioManager", "[KWStannis] AudioManager use kwaimeeting "+p0);
       this.defaultToReceiver = p0;
       return;
    }
    public void setDeviceType(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "1")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setDeviceType start: "+p0);
       this.audioDeviceLock.lock();
       this.deviceType = p0;
       StannisAudioManager tdevice = this.device;
       if (tdevice != null && tdevice.getDeviceType() != p0) {
          this.uninit();
          this.device.stopPlayout();
          this.device.stopRecording();
          this.device = null;
          Log.i("StannisAudioManager", "[StannisAudioManager] setDeviceType reset audio device");
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] setDeviceType end");
       return;
    }
    public void setHeadphoneMonitorReverbLevel(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "63")) {
          return;
       }
       if (this.isKtvVendorSupport != null && this.isEnableHeadphoneMonitor != null) {
          this.audioCommon.setVendorHeadphoneMonitorReverbLevel(p0);
       }
       return;
    }
    public void setHeadphoneMonitorVolume(float p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, StannisAudioManager.class, "61")) {
          return;
       }
       if (this.isEnableHeadphoneMonitor == null) {
          Log.w("StannisAudioManager", "[StannisAudioManager] setDeviceMicVolume failed, isEnableHeadphoneMonitor not enable");
          return;
       }else if(this.isUseSoftHeadphoneMonitor != null || (!this.isSupportVendorHeadphoneMonitor() && (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport()))){
          this.audioCommon.setSoftHeadphoneMonitorVolume(p0);
       }else {
          this.audioCommon.setVendorHeadphoneMonitorVolume(p0);
       }
       return;
    }
    public final void setInnerCapDataVolume(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "66")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$16(this));
       return;
    }
    public void setKtvVendorSupport(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "3")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setKtvVendorSupport = "+p0);
       this.isKtvVendorSupport = p0;
       return;
    }
    public boolean setOutputDevice(AudioDeviceInfo p0){
       boolean b;
       StannisAudioManager obj = PatchProxy.applyOneRefs(p0, this, StannisAudioManager.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       if (tdevice != null && !tdevice.getDeviceType()) {
          b = this.device.setOutputDevice(p0);
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean setOutputType(int p0,int p1){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StannisAudioManager.class, "77");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] setOutputType start");
       this.audioDeviceLock.lock();
       boolean i = 3;
       if (p0 == 4) {
          Log.d("StannisAudioManager", "[StannisAudioManager] setOutputType use force use "+this.typeToString(i)+"replace"+this.typeToString(p0));
          p0 = 3;
       }
       int outputType = this.getOutputType();
       if (this.userSetOutputType != p0 || (this.userSetOutputType == null || (this.userSetOutputType == p0 && (this.userSetOutputType != null && this.userSetOutputType == outputType)))) {
          this.audioDeviceLock.unlock();
          return true;
       }else {
          Log.w("StannisAudioManager", "[StannisAudioManager] setOutputType usersetoutppe "+p0+this.typeToString(p0)+"previous type = "+this.userSetOutputType+this.typeToString(this.userSetOutputType)+"current system routing "+outputType);
          if (!this.isOutputTypeSupported(p0)) {
             this.audioDeviceLock.unlock();
             Log.w("StannisAudioManager", "[StannisAudioManager] setOutputType end, not support type = "+p0);
             return false;
          }else if(this.userSetOutputType != null && this.userSetOutputType != p0){
             i = true;
          }else {
             i = false;
          }
          this.userSetOutputType = p0;
          boolean b = StannisAudioCommon.isChatScene(p1);
          if (this.isInitPlayout == null || !b) {
             this.audioDeviceLock.unlock();
             Log.d("StannisAudioManager", "[StannisAudioManager] setOutputType end, saved, isInitPlayout =  "+this.isInitPlayout+", isChat = "+b);
             return false;
          }else {
             this.forceReportRoute = i;
             Log.d("StannisAudioManager", "[StannisAudioManager] *** setOutputType = "+this.userSetOutputType+this.typeToString(this.userSetOutputType)+", resetDevicecurrent system routing "+outputType+this.typeToString(this.userSetOutputType)+"forcereport:"+i);
             b = (this.userSetOutputType != outputType && this.userSetOutputType != null)? true: false;
             if (this.userSetOutputType != null && this.requestAudioFocus == null) {
                this.requestAudioFocus = true;
                Log.i("StannisAudioManager", "[StannisAudioManager] notauto case need requestAudioFocus to listen other app interrupt");
                if (this.audioFocusGain == null) {
                   Log.i("StannisAudioManager", "[StannisAudioManager] requestAudioFocusGain strmtype "+this.config.getStreamType());
                   if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
                      this.notifyAudioDeviceStatus(false);
                   }
                }
             }
             this.resetDevice("setOutputType", b);
             this.audioDeviceLock.unlock();
             Log.d("StannisAudioManager", "[StannisAudioManager] setOutputType end");
             return false;
          }
       }
    }
    public void setRequestAudioFocus(boolean p0){
       this.requestAudioFocus = p0;
    }
    public final void setScoOff(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "13")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$7(this));
       return;
    }
    public void setServerConfigStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisAudioManager.class, "41")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setServerConfigStr\( "+p0);
       this.serverConfigStr = p0;
       if (p0.contains("aec_list") || (this.serverConfigStr).contains("deepns_list")) {
          this.needForceUpdateRecordingDeviceName = true;
          Log.i("StannisAudioManager", "[StannisAudioManager] setServerConfigStr need force update recording device name");
       }
       return;
    }
    public void setSpeakerOn(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "70")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] setSpeakerOn = "+p0);
       boolean b = false;
       if (this.userSetSpeakerOn != p0) {
          b = true;
       }
       this.userSetSpeakerOn = p0;
       this.executorService.execute(new StannisAudioManager$17(this, p0, b));
       return;
    }
    public void setSpeakerOnWrapper(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "72")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] setSpeakerOnWrapper start: "+p0);
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.d("StannisAudioManager", "[StannisAudioManager] setSpeakerOnWrapper end, config is null");
          return;
       }else if(this.audioManager != null && tconfig.isPlayoutEnable()){
          this.audioManager.setSpeakerphoneOn(p0);
       }else {
          Log.e("StannisAudioManager", "[StannisAudioManager] set speaker phone on but audio manager is null");
       }
    }
    public void setStereoCaptureAndProcess(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "92")) {
          return;
       }
       this.audioCommon.setStereoCaptureAndProcess(p0);
       return;
    }
    public void setUseSoftHeadphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "2")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setUseSoftHeadphoneMonitor = "+p0);
       this.isUseSoftHeadphoneMonitor = p0;
       return;
    }
    public void setUsingBuiltinMic(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "38")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setUsingBuiltinMic = "+p0);
       this.usingBuiltinMic = p0;
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       if (tconfig != null && tconfig.isUsingBuiltinMic() != this.usingBuiltinMic) {
          this.resetDevice("setUsingBuiltinMic", true);
       }
       this.audioDeviceLock.unlock();
       return;
    }
    public void setUsingLocalHeadphoneMonitorSetting(boolean p0){
       this.usingLocalHeadphoneMonitorSetting = p0;
    }
    public void startAudioDeviceCheckThread(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "8")) {
          return;
       }
       String str = "StannisAudioManager";
       Log.i(str, "[StannisAudioManager] startAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       if (this.audioDeviceCheckThread == null) {
          Thread thread = new Thread(this.audioDeviceCheckRunner, "StannisDeviceCheck");
          this.audioDeviceCheckThread = thread;
          thread.start();
          this.audioDeviceCheckThreadLock.unlock();
          Log.i(str, "[StannisAudioManager] startAudioDeviceCheckThread end");
          return;
       }else {
          Log.i(str, "[StannisAudioManager] startAudioDeviceCheckThread already started");
          this.audioDeviceCheckThreadLock.unlock();
          return;
       }
    }
    public boolean startAudioInnerCap(int p0,int p1,MediaProjection p2){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, StannisAudioManager.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] startAudioInnerCap begin");
       this.audioDeviceLock.lock();
       int i = 1;
       int i1 = 0;
       if (this.audioManager.requestAudioFocus(this, 3, i) != i) {
          this.notifyAudioDeviceStatus(i1);
       }
       StannisAudioManager tdevice = this.device;
       if (tdevice == null) {
          Log.i("StannisAudioManager", "this.device is null projection "+p2+"sr "+p0+"ch "+p1);
          this.setInnerCapStart = i;
          this.innercap_samplerate = p0;
          this.innercap_channnels = p1;
          this.mMediaProjection = p2;
       }else if(tdevice != null){
          this.setInnerCapDataVolume();
          boolean b = this.device.startAudioInnerCap(p0, p1, p2);
          if (!b) {
             Log.i("StannisAudioManager", "[StannisAudioManager] startAudioInnerCap failed");
          }
          i1 = b;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] startAudioInnerCap end projection "+p2+"sr "+p0+"ch "+p1);
       this.audioDeviceLock.unlock();
       return i1;
    }
    public final void startCheckScoThread(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "21")) {
          return;
       }
       if (this.checkScoIsNotConnectThreadRunning != null && this.checkScoIsNotConnectThread != null) {
          Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread is already started");
       }else {
          this.checkScoIsNotConnectThreadRunning = true;
          this.checkScoIsNotConnectCount = 0;
          Thread thread = new Thread(new StannisAudioManager$12(this), "StannisScoThread");
          this.checkScoIsNotConnectThread = thread;
          thread.start();
       }
       return;
    }
    public boolean startPlayout(int p0){
       boolean b1;
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] startPlayout start");
       long l = System.nanoTime();
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] startPlayout end, this.config is null");
          return b;
       }else if(!tconfig.isPlayoutEnable()){
          Log.i("StannisAudioManager", "[StannisAudioManager] startPlayout end, cene "+p0+", do not need to start playout.");
          this.audioDeviceLock.unlock();
          return true;
       }else {
          int i = 2002;
          if (this.init(p0)) {
             if (this.device == null) {
                this.device = this.audioCommon.createDevice(this.config.getDeviceType());
             }
             if (this.isInitPlayout != null) {
                if (this.device.isPlaying()) {
                   this.audioDeviceLock.unlock();
                   Log.w("StannisAudioManager", "[StannisAudioManager] startPlayout end, isPlaying");
                   return b;
                }
             }else if(!this.initPlayout()){
                this.audioDeviceLock.unlock();
                Log.e("StannisAudioManager", "[StannisAudioManager] startPlayout end, initPlayout error notifyObserver "+this.notifyObserver);
                StannisAudioManager tnotifyObser1 = this.notifyObserver;
                if (tnotifyObser1 != null) {
                   tnotifyObser1.onNotify(i);
                }
                return b;
             }
             b1 = this.device.startPlayout();
          }else {
             b1 = false;
          }
          this.audioDeviceLock.unlock();
          if (!b1) {
             Log.i("StannisAudioManager", "[HisenseAudioManager] play failed notify device start failed "+this.notifyObserver);
             StannisAudioManager tnotifyObser = this.notifyObserver;
             if (tnotifyObser != null) {
                tnotifyObser.onNotify(i);
             }
          }
          this.audioCommon.reportDevStateTime(b, (int)TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - l)));
          int streamMaxVol = this.audioManager.getStreamMaxVolume(this.config.getStreamType());
          int streamVolume = this.audioManager.getStreamVolume(this.config.getStreamType());
          this.audioCommon.reportPlayDevVol(((int)((float)streamVolume / (float)streamMaxVol) * 100));
          StringBuilder str = "[StannisAudioManager] startPlayout end,curvol:"+streamVolume;
          Log.i("StannisAudioManager", str+"maxvol:"+streamMaxVol);
          return b1;
       }
    }
    public boolean startRecording(int p0,int p1){
       String obj;
       StannisAudioManager tnotifyObser;
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StannisAudioManager.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "StannisAudioManager";
       Log.i(obj, "[StannisAudioManager] startRecording start");
       long l = System.nanoTime();
       this.audioDeviceLock.lock();
       StannisAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          Log.i(obj, "this.config is null");
          this.audioDeviceLock.unlock();
          return b;
       }else if(!tconfig.isRecordEnable()){
          Log.i(obj, "[StannisAudioManager] scene "+p0+", do not need to start record.");
          this.audioDeviceLock.unlock();
          return true;
       }else if(this.init(p0)){
          if (this.device == null) {
             this.device = this.audioCommon.createDevice(this.config.getDeviceType());
          }
          if (this.isInitRecording != null) {
             if (this.device.isRecording()) {
                this.audioDeviceLock.unlock();
                Log.w(obj, "[StannisAudioManager] startRecording: isRecording");
                return b;
             }
          }else {
             p0 = this.initRecording(p1);
             if (p0 < 0) {
                this.audioDeviceLock.unlock();
                Log.e(obj, "[StannisAudioManager] startRecording: initRecordDevice error: "+p0+" notifyObserver "+this.notifyObserver);
                tnotifyObser = this.notifyObserver;
                if (tnotifyObser != null) {
                   tnotifyObser.onNotify(2002);
                }
                return b;
             }
          }
          this.setCurRecordingDeviceName("unknown");
          b = this.device.startRecording();
          if (this.checkAndStartBluetoothSco()) {
             Log.d(obj, "[StannisAudioManager] startRecording waiting sco connected.");
          }
          Log.i(obj, "[StannisAudioManager] startRecording end");
       }
       if (!this.device.isInnerCapInstanceExist() && (this.setInnerCapStart != null && this.mMediaProjection != null)) {
          Log.i(obj, "[StannisAudioManager] startInnerCapRecording innercap samplerate "+this.innercap_samplerate+"ch "+this.innercap_channnels);
          this.setInnerCapDataVolume();
          this.startAudioInnerCap(this.innercap_samplerate, this.innercap_channnels, this.mMediaProjection);
          Log.i(obj, "[StannisAudioManager] startInnerCap Succeed");
       }else if(this.device.isInnerCapInstanceExist()){
          Log.i(obj, "[StannisAudioManager] startRecording detect InnerCapInstanceExist should adjust rx and speech broadcast,cur mode "+this.config.getAudioMode()+"scene "+this.config.getScene());
          if (this.config.getAudioMode() == 1) {
             this.audioCommon.TxForceAddRxListener();
          }else {
             this.audioCommon.TxForceRemoveRxListener();
          }
          Log.i(obj, "[StannisAudioManager] innercap instance exist");
       }else {
          Log.i(obj, "[StannisAudioManager] not enable innercap");
       }
       this.audioDeviceLock.unlock();
       if (!b) {
          Log.i(obj, "[HisenseAudioManager] record failed notify device start failed "+this.notifyObserver);
          tnotifyObser = this.notifyObserver;
          if (tnotifyObser != null) {
             tnotifyObser.onNotify(2002);
          }
       }
       this.audioCommon.reportDevStateTime(true, (int)TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - l)));
       return b;
    }
    public void stopAudioDeviceCheckThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StannisAudioManager.class, "9")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] stopAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       StannisAudioManager taudioDevice = this.audioDeviceCheckRunner;
       if (taudioDevice != null) {
          taudioDevice.shutdown();
          this.audioDeviceCheckRunner = objArray;
       }
       if (this.audioDeviceCheckThread != null) {
          try{
             Log.i("StannisAudioManager", "[StannisAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\)");
             this.audioDeviceCheckThread.interrupt();
             this.audioDeviceCheckThread.join();
             Log.i("StannisAudioManager", "[StannisAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\) end");
             this.audioDeviceCheckThread = objArray;
          }catch(java.lang.InterruptedException e1){
             e1.printStackTrace();
          }
       }
    }
    public final void stopCheckScoThread(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "22")) {
          return;
       }
       if (this.checkScoIsNotConnectThread != null) {
          Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording, stop sco check thread");
          boolean b = false;
          try{
             this.checkScoIsNotConnectThreadRunning = b;
             Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording, checkScoIsNotConnectThread.join");
             this.checkScoIsNotConnectThread.join();
             Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording, checkScoIsNotConnectThread.join end");
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "33")) {
          return;
       }
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.stopInnerCap();
          this.setInnerCapStart = false;
          this.mMediaProjection = null;
       }
       this.audioDeviceLock.unlock();
       return;
    }
    public boolean stopPlayout(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] stopPlayout start");
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       boolean b = false;
       if (tdevice == null) {
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] stopPlayout start, this.device is null");
          return b;
       }else {
          this.isInitPlayout = b;
          this.notifyAudioDeviceStatus(2);
          this.uninit();
          this.audioDeviceLock.unlock();
          Log.i("StannisAudioManager", "[StannisAudioManager] stopPlayout end");
          return tdevice.stopPlayout();
       }
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, StannisAudioManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.stopRecording(true);
    }
    public boolean stopRecording(boolean p0){
       if (PatchProxy.isSupport(StannisAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, StannisAudioManager.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording start");
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       boolean b = (tdevice != null)? tdevice.stopRecording(): false;
       this.isInitRecording = false;
       if (p0) {
          if (this.audioManager.isBluetoothScoOn()) {
             Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording, stopBluetoothSco");
             this.audioManager.stopBluetoothSco();
             this.setScoOff();
             Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording, stopBluetoothSco end");
          }
          this.stopCheckScoThread();
       }
       this.notifyAudioDeviceStatus(1);
       this.uninit();
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] stopRecording end");
       return b;
    }
    public String typeToString(int p0){
       if (p0 == 1) {
          return "Speaker";
       }
       if (p0 == 2) {
          return "Receiver";
       }
       if (p0 == 3) {
          return "Line";
       }
       if (p0 == 4) {
          return "USB";
       }
       if (p0 == 5) {
          return "Bluetooth";
       }
       if (!p0) {
          return "TypeAuto";
       }
       return "Unkown";
    }
    public final void uninit(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StannisAudioManager.class, "45")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] uninit start");
       this.audioDeviceLock.lock();
       StannisAudioManager tdevice = this.device;
       if (tdevice != null && (!tdevice.isPlaying() && !this.device.isRecording())) {
          if (this.isInitialized != null) {
             this.audioManager.setMode(0);
             this.setSpeakerOnWrapper(this.savedIsSpeakerPhoneOn);
             this.audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
             this.isHeadsetConnected = false;
             this.isUsbConnected = false;
             this.isBluetoothConnected = false;
             this.isBluetoothScoConnected = false;
             if (this.audioManager.isBluetoothScoOn()) {
                Log.i("StannisAudioManager", "[StannisAudioManager] unit, stopBluetoothSco");
                this.setScoOff();
             }
             this.isInitialized = false;
          }
          if (this.audioFocusGain != null) {
             if (this.requestAudioFocus != null) {
                this.audioManager.abandonAudioFocus(this);
             }
             this.audioDeviceStatusListener = objArray;
             this.audioFocusGain = false;
          }
          this.requestAudioFocus = false;
          this.unregisterReceiver();
       }
    label_0070 :
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] uninit end");
       return;
    }
    public void unregisterReceiver(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "47")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] unregisterReceiver start");
       this.audioDeviceLock.lock();
       if (this.isRegisterReceiver != null) {
          UniversalReceiver.f(this.context, this);
          this.isRegisterReceiver = false;
       }
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] unregisterReceiver end");
       return;
    }
    public void updateAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StannisAudioManager.class, "10")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] updateAudioDeviceConfig start"+this.isBluetoothScoConnected);
       this.audioDeviceLock.lock();
       if (this.needForceUpdateRecordingDeviceName != null) {
          if (p0 != 2048) {
             this.setCurRecordingDeviceName("unknown");
          }else if(this.isBluetoothScoConnected != null){
             this.asyncSetDeviceName();
          }
       }
       this.config = this.getCurrentAudioDeviceConfig(p0);
       this.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] updateAudioDeviceConfig end:"+this.config);
       return;
    }
    public final void uploadDeviceInfo(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager.class, "64")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$14(this));
       return;
    }
    public void uploadDeviceInfo(int p0,int p1){
       if (PatchProxy.isSupport(StannisAudioManager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, StannisAudioManager.class, "65")) {
          return;
       }
       this.executorService.execute(new StannisAudioManager$15(this, p0, p1));
       return;
    }
}
