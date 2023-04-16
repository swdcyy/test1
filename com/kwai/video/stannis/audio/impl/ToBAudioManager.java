package com.kwai.video.stannis.audio.impl.ToBAudioManager;
import android.bluetooth.BluetoothProfile$ServiceListener;
import android.media.AudioManager$OnAudioFocusChangeListener;
import com.kwai.video.stannis.audio.StannisAudioManagerInterface;
import android.content.BroadcastReceiver;
import java.util.HashMap;
import android.content.Context;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantLock;
import android.content.IntentFilter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import java.lang.String;
import android.os.Build;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$AudioDeviceCheckRunner;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$1;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.audio.AudioDevice;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$16;
import com.kwai.video.stannis.utils.ContextUtils;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.observers.TelephoneObserver;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$4;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$5;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$6;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$13;
import bw7.c;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$14;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.stannis.audio.AudioRecordListener;
import com.kwai.video.stannis.StannisDeviceInfo;
import android.media.AudioDeviceInfo;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import java.util.Map;
import com.kwai.video.stannis.audio.AudioDeviceJava;
import java.lang.StringBuffer;
import com.kwai.video.stannis.audio.support.LocalHeadphoneMonitor;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$10;
import bw7.b;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$20;
import android.content.Intent;
import bw7.d;
import bw7.f;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$8;
import android.bluetooth.BluetoothProfile;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$2;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$3;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$12;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.media.projection.MediaProjection;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$9;
import bw7.e;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import java.lang.System;
import java.lang.Float;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$18;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$7;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$19;
import java.lang.Exception;
import java.lang.Thread;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$11;
import java.util.concurrent.TimeUnit;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$AudioTrackThread;
import java.lang.InterruptedException;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$15;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$17;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

public class ToBAudioManager extends BroadcastReceiver implements BluetoothProfile$ServiceListener, AudioManager$OnAudioFocusChangeListener, StannisAudioManagerInterface	// class@000c43
{
    public StannisAudioCommon audioCommon;
    public ToBAudioManager$AudioDeviceCheckRunner audioDeviceCheckRunner;
    public Thread audioDeviceCheckThread;
    public ReentrantLock audioDeviceCheckThreadLock;
    public ToBAudioManager$AudioRecordThread audioDeviceJavaRecThread;
    public ToBAudioManager$AudioTrackThread audioDeviceJavaThread;
    public ReentrantLock audioDeviceLock;
    public StannisAudioDeviceStatusObserver audioDeviceStatusListener;
    public boolean audioFocusGain;
    public AudioManagerProxy audioManager;
    public AudioRecordListener audioRecordListener;
    public Stannis$AudioRouteListener audioRouteListener;
    public AudioDevice capDevice;
    public int capDeviceType;
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
    public Handler handler;
    public int innercap_channnels;
    public int innercap_samplerate;
    public float inputVolume;
    public boolean isBluetoothConnected;
    public boolean isBluetoothScoConnected;
    public boolean isEnableHeadphoneMonitor;
    public boolean isEnableSoftHeadphoneMonitor;
    public boolean isHeadsetConnected;
    public boolean isInitPlayout;
    public boolean isInitRecording;
    public boolean isInitialized;
    public boolean isKtvVendorSupport;
    public boolean isPhoneInterrupting;
    public boolean isRegisterReceiver;
    public boolean isSetOutputTypeByStartAudioDevice;
    public boolean isSpeakerOn;
    public boolean isUsbConnected;
    public boolean isUseSoftHeadphoneMonitor;
    public int lastSpeakerOrReceiver;
    public BluetoothAdapter mAdapter;
    public MediaProjection mMediaProjection;
    public BluetoothProfile mProfile;
    public boolean needForceUpdateRecordingDeviceName;
    public StannisNotifyObserver notifyObserver;
    public StannisNotifyObserver phoneListener;
    public ReentrantLock profileLock;
    public boolean requestAudioFocus;
    public int resumeHeadphoneMonitorReverb;
    public float resumeHeadphoneMonitorVolume;
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
    public static Map deviceTypeWhiteList;

    static {
       ToBAudioManager.deviceTypeWhiteList = new HashMap();
    }
    public void ToBAudioManager(Context p0,long p1,StannisNotifyObserver p2){
       super();
       this.handler = new Handler(Looper.getMainLooper());
       this.device = null;
       this.capDevice = null;
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
       this.executorService = Executors.newFixedThreadPool(true);
       this.deviceType = 1;
       this.capDeviceType = 1;
       this.isUseSoftHeadphoneMonitor = false;
       this.userSetOutputType = 0;
       this.currentOutputType = 0;
       this.audioDeviceJavaThread = null;
       this.audioDeviceJavaRecThread = null;
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
       this.curRecordingDeviceName = "unknown";
       this.serverConfigStr = "";
       this.needForceUpdateRecordingDeviceName = false;
       this.switchnum = 0;
       this.defaultToReceiver = false;
       this.resumeHeadphoneMonitorVolume = 0x3f800000;
       this.resumeHeadphoneMonitorReverb = 0;
       this.inputVolume = 0x3f800000;
       this.isPhoneInterrupting = false;
       this.isEnableSoftHeadphoneMonitor = false;
       this.checkScoIsNotConnectThreadRunning = false;
       this.checkScoIsNotConnectCount = 0;
       this.context = p0;
       this.audioManager = new AudioManagerProxy(p0);
       this.audioCommon = new StannisAudioCommon(p1, p0, this.audioManager);
       this.notifyObserver = p2;
       this.filter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
       this.filter.addAction("android.intent.action.HEADSET_PLUG");
       this.filter.addAction("android.media.AUDIO_BECOMING_NOISY");
       this.filter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
       this.filter.addAction("android.media.VOLUME_CHANGED_ACTION");
       if ((Build.MANUFACTURER).equalsIgnoreCase("VIVO")) {
          Log.i("ToBAudioManager", "[ToBAudioManager] vivo use java cap");
          this.capDeviceType = 0;
       }
       this.audioDeviceCheckRunner = new ToBAudioManager$AudioDeviceCheckRunner(this, null);
       this.executorService.execute(new ToBAudioManager$1(this, p0));
       return;
    }
    public static void a(ToBAudioManager p0,boolean p1){
       p0.lambda$closeDeviceHeaphoneMonitor$3(p1);
    }
    public static void b(ToBAudioManager p0){
       p0.lambda$onAudioFocusChange$2();
    }
    public static void c(ToBAudioManager p0,boolean p1){
       p0.lambda$onReceive$0(p1);
    }
    public static void d(ToBAudioManager p0,boolean p1){
       p0.lambda$resumeDeviceHeadphoneMonitor$4(p1);
    }
    public static void e(ToBAudioManager p0,boolean p1){
       p0.lambda$onReceive$1(p1);
    }
    private void lambda$closeDeviceHeaphoneMonitor$3(boolean p0){
       if (p0 != this.isEnableHeadphoneMonitor) {
          this.notifyAudioDeviceStatus(6);
          Log.d("ToBAudioManager", "[ToBAudioManager] notifyAudioDeviceStatus KWStannisAudioHeadphoneMonitorOFFDeviceStop");
       }
       return;
    }
    private void lambda$onAudioFocusChange$2(){
       Log.i("ToBAudioManager", "[ToBAudioManager] onAudioFocusChange restart record");
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       int scene = (tconfig != null)? tconfig.getScene(): 256;
       ToBAudioManager tdevice = this.device;
       int i = 0;
       int i1 = (tdevice != null)? tdevice.isRecording() | i: 0;
       ToBAudioManager tcapDevice = this.capDevice;
       if (tcapDevice != null) {
          i1 = i1 | tcapDevice.isRecording();
       }
       this.audioDeviceLock.unlock();
       if (i1) {
          this.stopRecording();
          this.startRecording(scene, i);
          Log.i("ToBAudioManager", "[ToBAudioManager] onAudioFocusChange restart record end, scene: "+scene);
          this.resetAudioProcess();
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] onAudioFocusChange resetAudioProcess");
       return;
    }
    private void lambda$onReceive$0(boolean p0){
       if (this.userEnableHeadphoneMonitor != null && p0) {
          this.notifyAudioDeviceStatus(7);
       }
       return;
    }
    private void lambda$onReceive$1(boolean p0){
       if (this.userEnableHeadphoneMonitor != null && p0) {
          this.notifyAudioDeviceStatus(7);
       }
       return;
    }
    private void lambda$resumeDeviceHeadphoneMonitor$4(boolean p0){
       this.audioCommon.disableVendorHeadphoneMonitor();
       this.openDeviceHeaphoneMonitorInternal();
       this.setHeadphoneMonitorVolume(this.resumeHeadphoneMonitorVolume);
       this.setHeadphoneMonitorReverbLevel(this.resumeHeadphoneMonitorReverb);
       Log.i("ToBAudioManager", "[ToBAudioManager] resumeDeviceHeadphoneMonitor, force: "+p0+", volume:"+this.resumeHeadphoneMonitorVolume+", reverb: "+this.resumeHeadphoneMonitorReverb);
    }
    public void SetEnableRecordState(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "103")) {
          return;
       }
       this.audioCommon.SetEnableRecordState(p0);
       return;
    }
    public final void UseBuildInMicUpdate(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "72")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$16(this, p0));
       return;
    }
    public void addAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "98")) {
          return;
       }
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e("ToBAudioManager", "addAudioTelephoneObserver READ_PHONE_STATE permission is missing");
          return;
       }else {
          TelephoneObserver.addTelephoneObserver(this.context, this);
          return;
       }
    }
    public final void asyncGetBluetoothProfile(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "8")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$4(this));
       return;
    }
    public final void asyncResetDevice(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, ToBAudioManager.class, "13")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$5(this, p0, p1, p2));
       return;
    }
    public final void asyncSetDeviceName(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "14")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$6(this));
       return;
    }
    public boolean checkAndStartBluetoothSco(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.audioDeviceLock.isLocked()) {
          throw new RuntimeException("[ToBAudioManager] checkIfNeedStartBluetoothSco: unlocked");
       }
       boolean b = false;
       if (this.config == null) {
          Log.i("ToBAudioManager", "this.config is null");
          return b;
       }else {
          Log.i("ToBAudioManager", "[ToBAudioManager] checkIfNeedStartBluetoothSco start, mode = "+this.config.getAudioManagerMode()+", connect bt = "+this.isBluetoothConnected+"sco connect"+this.audioManager.isBluetoothScoOn());
          if (this.config.getAudioManagerMode() == 3 && this.isBluetoothConnected != null) {
             b = true;
          }
          if (b) {
             if (this.userSetOutputType == null || (this.userSetOutputType == 5 && !this.audioManager.isBluetoothScoOn())) {
                Log.i("ToBAudioManager", "[ToBAudioManager]SetScoOn Begin"+this.userSetOutputType);
                this.audioManager.startBluetoothSco();
                this.audioManager.setBluetoothScoOn(true);
                Log.i("ToBAudioManager", "[ToBAudioManager]SetScoOn End"+this.userSetOutputType);
             }
             if (this.userSetOutputType == null) {
                this.startCheckScoThread();
             }
          }
          Log.i("ToBAudioManager", "[ToBAudioManager] checkIfNeedStartBluetoothSco: "+b);
          return b;
       }
    }
    public boolean checkScoIsNotConnect(){
       ToBAudioManager obj = PatchProxy.apply(null, this, ToBAudioManager.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.config;
       if (obj == null) {
          Log.i("ToBAudioManager", "this.config is null");
          return false;
       }else if(obj.getAudioManagerMode() == 3 && (this.isBluetoothConnected != null && this.isBluetoothScoConnected == null)){
          return true;
       }else {
          return false;
       }
    }
    public void closeDeviceHeaphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "65")) {
          return;
       }
       this.userEnableHeadphoneMonitor = false;
       if ((Build.MANUFACTURER).equalsIgnoreCase("VIVO")) {
          this.handler.postDelayed(new ToBAudioManager$13(this, 1000), (long)1000);
       }else {
          this.closeDeviceHeaphoneMonitorInterval();
          this.executorService.execute(new c(this, this.isEnableHeadphoneMonitor));
       }
       return;
    }
    public void closeDeviceHeaphoneMonitorInterval(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "66")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$14(this));
       return;
    }
    public final int deviceInfoTypeToRouteType(int p0,int p1){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ToBAudioManager.class, "93");
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
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "34")) {
          return;
       }
       ToBAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.enableInnerCapDump(p0);
       }
       return;
    }
    public AudioRecordListener getAudioRecordListener(){
       return this.audioRecordListener;
    }
    public String getCurRecordingDeviceName(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] curRecordingDeviceName "+this.curRecordingDeviceName);
       return this.curRecordingDeviceName;
    }
    public AudioDeviceConfig getCurrentAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "82");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] getCurrentAudioDeviceConfig start");
       this.audioDeviceLock.lock();
       AudioDeviceConfig currentAudio = this.audioCommon.getCurrentAudioDeviceConfig(p0);
       if (currentAudio == null) {
          this.audioDeviceLock.unlock();
          Log.d("ToBAudioManager", "[ToBAudioManager] getCurrentAudioDeviceConfig end, this config is null");
          return null;
       }else if(currentAudio.getServerDeviceType() != -1){
          Log.d("ToBAudioManager", "[ToBAudioManager] configServerDeviceType "+currentAudio.getServerDeviceType());
          currentAudio.setDeviceType(currentAudio.getServerDeviceType());
          this.deviceType = currentAudio.getServerDeviceType();
          this.capDeviceType = currentAudio.getServerDeviceType();
       }else {
          currentAudio.setDeviceType(this.getDeviceType());
       }
       currentAudio.setRoundTripLatency(this.getRoundTripLatency(currentAudio.getDeviceType()));
       currentAudio.setUsingBuiltinMic(this.usingBuiltinMic);
       if (this.userSetOutputType != null) {
          currentAudio.setAudioMode(1);
       }
       this.audioDeviceLock.unlock();
       Log.d("ToBAudioManager", "[ToBAudioManager] getCurrentAudioDeviceConfig: "+currentAudio.toString());
       Log.d("ToBAudioManager", "[ToBAudioManager] getCurrentAudioDeviceConfig end");
       return currentAudio;
    }
    public StannisDeviceInfo getCurrentDevice(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "95");
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
    public final int getCurrentSteamType(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 3;
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getStreamType();
       }
       this.audioDeviceLock.unlock();
       return i;
    }
    public AudioDeviceConfig getDeviceConfig(){
       return this.config;
    }
    public final int getDeviceType(){
       String obj = PatchProxy.apply(null, this, ToBAudioManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = Build.MANUFACTURER+"~"+Build.MODEL;
       if (!ToBAudioManager.deviceTypeWhiteList.containsKey(obj)) {
          return this.deviceType;
       }
       int i = ToBAudioManager.deviceTypeWhiteList.get(obj).intValue();
       Log.d("ToBAudioManager", "[ToBAudioManager] getDeviceType from deviceTypeWhiteList: "+i);
       return i;
    }
    public StannisDeviceInfo[] getDevices(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "94");
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
       ToBAudioManager obj = PatchProxy.apply(objArray, this, ToBAudioManager.class, "56");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getInputDevice();
    }
    public AudioDeviceInfo[] getInputDevices(){
       Object[] objArray = null;
       ToBAudioManager obj = PatchProxy.apply(objArray, this, ToBAudioManager.class, "54");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "92");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "88");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Log.i("ToBAudioManager", "[ToBAudioManager] getMode start");
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getAudioMode();
       }
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] getMode end");
       return i;
    }
    public AudioDeviceInfo getOutputDevice(){
       Object[] objArray = null;
       ToBAudioManager obj = PatchProxy.apply(objArray, this, ToBAudioManager.class, "53");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getOutputDevice();
    }
    public AudioDeviceInfo[] getOutputDevices(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ToBAudioManager.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] getOutputDevices start");
       this.audioDeviceLock.lock();
       ToBAudioManager taudioManage = this.audioManager;
       if (taudioManage != null) {
          objArray = taudioManage.getDevices(2);
       }
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] getOutputDevices end");
       return objArray;
    }
    public int getOutputRouter(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "91");
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
          Log.i("ToBAudioManager", "[ToBAudioManager] choose device onRouteChange output =  "+i+"force set to line");
          i = 3;
       }
       return i;
    }
    public int getOutputType(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "86");
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
             Log.d("ToBAudioManager", "[ToBAudioManager] getOutputTypeInternal deviceInfo is null");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "87");
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
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "81");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       int i1 = 0x10000;
       if (this.userSetOutputType != null) {
          ToBAudioManager tuserSetOutp = this.userSetOutputType;
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
       Log.d("ToBAudioManager", "[ToBAudioManager] getPluginType: "+String.format("%x", obj)+"£¬ isInitialized = "+this.isInitialized);
       return i1;
    }
    public final int getRoundTripLatency(int p0){
       if (!p0) {
          return 250;
       }
       return 80;
    }
    public int getSpeakerDeviceVolume(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 3;
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getStreamType();
       }else {
          Log.i("ToBAudioManager", "[ToBAudioManager] config is null");
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
       ToBAudioManager obj = PatchProxy.apply(null, this, ToBAudioManager.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.userSetSpeakerOn;
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig != null) {
          speakerOn = this.getSpeakerOn(tconfig.getScene());
       }else {
          Log.w("ToBAudioManager", "[ToBAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       return speakerOn;
    }
    public final boolean getSpeakerOn(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "76");
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
       ToBAudioManager obj = PatchProxy.apply(null, this, ToBAudioManager.class, "36");
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
       if (p0 == 768 || p0 == 2048) {
          return true;
       }
       return false;
    }
    public final boolean init(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] init start");
       this.audioDeviceLock.lock();
       boolean b = false;
       if (this.config == null) {
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] init end, this.config is null");
          return b;
       }else if(this.userSetOutputType != null){
          this.requestAudioFocus = true;
          Log.i("ToBAudioManager", "[ToBAudioManager] notauto case need requestAudioFocus to listen other app interrupt");
       }else if(this.config.getScene() == 2048){
          this.requestAudioFocus = true;
          Log.i("ToBAudioManager", "[ToBAudioManager] TOB set requestAudioFocus = "+this.requestAudioFocus);
       }else {
          this.requestAudioFocus = b;
       }
       if (this.audioFocusGain == null && this.requestAudioFocus != null) {
          Log.i("ToBAudioManager", "[ToBAudioManager] requestAudioFocusGain strmtype "+this.config.getStreamType());
          if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
             this.notifyAudioDeviceStatus(b);
             this.requestAudioFocus = b;
          }else {
             this.requestAudioFocus = true;
          }
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
          Log.i("ToBAudioManager", "[ToBAudioManager] init: mode = "+this.savedAudioManagerMode+", spk on = "+this.savedIsSpeakerPhoneOn+", mic mute = "+this.savedIsMicrophoneMute+", headset = "+this.isHeadsetConnected+", usb = "+this.isUsbConnected+", bluetooth = "+this.isBluetoothConnected+", current_output = "+this.currentOutputType);
       }
       this.updateAudioDeviceConfig(p0);
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] init end");
       return true;
    }
    public void initOutputType(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "83")) {
          return;
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] initOutputType start "+p0);
       this.audioDeviceLock.lock();
       this.userSetOutputType = p0;
       this.audioDeviceLock.unlock();
       Log.d("ToBAudioManager", "[ToBAudioManager] initOutputType end "+p0);
       return;
    }
    public final boolean initPlayout(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] initPlayout start,get current mode "+this.audioManager.getMode());
       boolean b = false;
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] initPlayout end, this.config is null");
          return b;
       }else {
          this.audioCommon.reportPlayFormat(this.config.getPlaybackSampleRate(), this.config.getPlaybackChannelNum());
          this.resetDeviceOutput();
          this.isInitPlayout = true;
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] initPlayout end");
          return this.device.initPlayout(tconfig);
       }
    }
    public final int initRecording(){
       int i1;
       String obj = PatchProxy.apply(null, this, ToBAudioManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = "ToBAudioManager";
       Log.i(obj, "[ToBAudioManager] initRecording start");
       this.audioDeviceLock.lock();
       if (this.config == null) {
          Log.i(obj, "[ToBAudioManager] initRecording end, this.config is null");
          this.audioDeviceLock.unlock();
          return -1;
       }else {
          String str = "devicetype ";
          Log.i(obj, "[ToBAudioManager] initRecording use capType "+this.capDeviceType+str+this.deviceType);
          int i = 0;
          if (this.deviceType == this.capDeviceType) {
             i1 = this.device.initRecording(this.config, i);
          }else if((Build.MANUFACTURER).equalsIgnoreCase("VIVO") && this.isEnableSoftHeadphoneMonitor != null){
             i1 = this.device.initRecording(this.config, i);
             Log.i(obj, "[ToBAudioManager] initRecording\(isEnableSoftHeadphoneMonitor\) use capType "+this.deviceType+str+this.deviceType);
          }else {
             i1 = this.capDevice.initRecording(this.config, i);
          }
          if (!i1) {
             this.isInitRecording = true;
          }
          this.audioDeviceLock.unlock();
          Log.i(obj, "[ToBAudioManager] initRecording end");
          return i1;
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
       StringBuffer obj = PatchProxy.applyOneRefs(p0, this, ToBAudioManager.class, "75");
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
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadphoneWithMic();
    }
    public boolean isHeadsetConnected(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadsetConnected();
    }
    public final boolean isOutputTypeSupported(int p0){
       int[] obj;
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "84");
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
             Log.w("ToBAudioManager", "supportType4set is3");
             return true;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isPlayOut(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       ToBAudioManager tdevice = this.device;
       if (tdevice != null) {
          b = tdevice.isPlaying();
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       ToBAudioManager tdevice = this.device;
       if (tdevice == null || !tdevice.isRecording()) {
          tdevice = this.capDevice;
          if (tdevice == null || !tdevice.isRecording()) {
          label_002f :
             this.audioDeviceLock.unlock();
             return b;
          }
       }
       b = true;
       goto label_002f ;
    }
    public boolean isSupportHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.isSupportVendorHeadphoneMonitor();
       StringBuilder str = "[ToBAudioManager] isSupportHeaphoneMonitor isToB = false, vendorSupport = "+b+", isUseSoftHeadphoneMonitor = "+this.isUseSoftHeadphoneMonitor+", usingLocalHeadphoneMonitor = ";
       boolean b1 = true;
       boolean b2 = (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport())? true: false;
       Log.i("ToBAudioManager", str+b2);
       if (b || (this.isUseSoftHeadphoneMonitor == null && (this.usingLocalHeadphoneMonitorSetting == null || !LocalHeadphoneMonitor.isLocalHeadphoneSupport()))) {
          b1 = false;
       }
    label_0061 :
       return b1;
    }
    public boolean isSupportHeaphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "59");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportHeaphoneMonitor();
    }
    public boolean isSupportVendorHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isKtvVendorSupport != null) {
          return this.audioCommon.isSupportVendorHeadphoneMonitor();
       }
       return false;
    }
    public boolean isUsbConnected(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isUsbConnected();
    }
    public boolean isUserEnableHeadphoneMonitor(){
       return this.userEnableHeadphoneMonitor;
    }
    public void notifyAudioDeviceStatus(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "20")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$10(this, p0));
       return;
    }
    public void onAudioFocusChange(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "19")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] onAudioFocusChange reason = "+p0);
       if (this.requestAudioFocus != null) {
          b uob = null;
          if (p0 != -3 && p0 != -2) {
             if (p0 != -1) {
                if (p0 == 1) {
                   if (this.audioFocusGain == null && this.isPhoneInterrupting == null) {
                      this.handler.postDelayed(new b(this), 1000);
                   }
                   this.audioFocusGain = true;
                }
             }else {
                this.audioFocusGain = uob;
             }
          }else {
             this.audioFocusGain = uob;
          }
       }
       return;
    }
    public void onPhoneInterrupt(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "97")) {
          return;
       }
       String str = "ToBAudioManager";
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e(str, "READ_PHONE_STATE permission is missing");
          return;
       }else {
          Log.i(str, "[KWStannis] AudioManager OnPhoneInterrupt "+p0);
          this.executorService.execute(new ToBAudioManager$20(this, p0));
          return;
       }
    }
    public void onReceive(Context p0,Intent p1){
       int intExtra;
       String str4;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ToBAudioManager.class, "16")) {
          return;
       }
       String str = "ToBAudioManager";
       Log.i(str, "[ToBAudioManager] onReceive_intent: "+p1.getAction());
       String str1 = "unknown";
       String str2 = 2;
       int i = -1;
       boolean b = true;
       if ((p1.getAction()).equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
          intExtra = p1.getIntExtra("android.media.extra.SCO_AUDIO_STATE", i);
          if (intExtra != i) {
             if (intExtra) {
                if (intExtra != b) {
                   if (intExtra == str2) {
                      str1 = "SCO_AUDIO_STATE_CONNECTING";
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
                         this.setCurRecordingDeviceName(str1);
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }
                   str1 = "SCO_AUDIO_STATE_CONNECTED";
                }
             }else {
                this.setCurRecordingDeviceName(str1);
                if (this.isBluetoothScoConnected != null) {
                   this.isBluetoothScoConnected = false;
                   this.currentOutputType = this.userSetOutputType;
                   if (this.needForceUpdateRecordingDeviceName != null) {
                      this.setCurRecordingDeviceName(str1);
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }
                str1 = "SCO_AUDIO_STATE_DISCONNECTED";
             }
          }else {
             str1 = "SCO_AUDIO_STATE_ERROR";
          }
          this.UseBuildInMicUpdate(b);
          Log.i(str, "[ToBAudioManager] AudioManager.EXTRA_SCO_AUDIO_STATE = "+str1);
       }else {
          String str3 = "android.bluetooth.profile.extra.STATE";
          if ((p1.getAction()).equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
             intExtra = p1.getIntExtra(str3, i);
             if (intExtra) {
                if (intExtra != b) {
                   if (intExtra != str2) {
                      if (intExtra == 3) {
                         str1 = "STATE_DISCONNECTING";
                      }
                   }else {
                      str1 = "STATE_CONNECTED";
                   }
                }else {
                   str1 = "STATE_CONNECTING";
                }
             }else {
                str1 = "STATE_DISCONNECTED";
             }
             Log.i(str, "[ToBAudioManager] BluetoothA2dp.EXTRA_STATE = "+str1);
             this.UseBuildInMicUpdate(b);
          }else {
             str1 = 4;
             if ((p1.getAction()).equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                intExtra = p1.getIntExtra(str3, i);
                if (intExtra) {
                   if (intExtra != b) {
                      if (intExtra != str2) {
                         if (intExtra != 3) {
                            str4 = "BluetoothHeadset.unknown";
                         }else {
                            str4 = "BluetoothHeadset.STATE_DISCONNECTING";
                         }
                      }else {
                         Log.i(str, "[ToBAudioManager] isBluetoothScoConnect");
                         this.asyncGetBluetoothProfile();
                         if (this.userSetOutputType != null && this.isBluetoothScoConnected == null) {
                            this.isBluetoothConnected = b;
                            this.userSetOutputType = 5;
                            Log.i(str, "[ToBAudioManager] BluetoothSco not Connect force reset device");
                         }else if(this.isBluetoothConnected == null){
                            this.isBluetoothConnected = b;
                            if (this.userSetOutputType != null) {
                               if (this.userSetOutputType != 5) {
                                  this.userSetOutputType = 5;
                                  this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                                  this.audioCommon.resetAudioProcess();
                               }
                            }else {
                               this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                               this.audioCommon.resetAudioProcess();
                            }
                         }
                         str4 = "BluetoothHeadset.STATE_CONNECTED";
                      }
                   }else {
                      str4 = "BluetoothHeadset.STATE_CONNECTING";
                   }
                }else {
                   this.isBluetoothConnected = false;
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType == 5) {
                         if (this.isHeadsetConnected != null) {
                            this.userSetOutputType = 3;
                         }else if(this.isUsbConnected != null){
                            this.userSetOutputType = str1;
                         }else {
                            this.userSetOutputType = this.lastSpeakerOrReceiver;
                         }
                         if (this.userSetOutputType == str2) {
                            Log.i(str, "[ToBAudioManager] Bluetooth disconnect switch to receiver should force report");
                         }
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }else {
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                   str4 = "BluetoothHeadset.STATE_DISCONNECTED";
                }
                this.UseBuildInMicUpdate(b);
                Log.i(str, "[ToBAudioManager] BluetoothHeadset.EXTRA_STATE = "+str4);
             }else if((p1.getAction()).equals("android.intent.action.HEADSET_PLUG")){
                intExtra = p1.getIntExtra("state", i);
                int intExtra1 = p1.getIntExtra("microphone", i);
                if (!intExtra) {
                   this.UseBuildInMicUpdate(b);
                }else if(intExtra1 == b){
                   this.UseBuildInMicUpdate(false);
                }else {
                   this.UseBuildInMicUpdate(b);
                }
                Log.i(str, "[ToBAudioManager] ACTION_HEADSET_PLUG state = "+intExtra+", microphone = "+intExtra1);
                if (!intExtra) {
                   if (this.isHeadsetConnected != null) {
                      this.isHeadsetConnected = false;
                      this.closeDeviceHeaphoneMonitorInterval();
                      this.stopVivoAudioTrack();
                      this.notifyAudioDeviceStatus(str1);
                      this.executorService.execute(new d(this, this.isEnableHeadphoneMonitor));
                   }
                   if (this.userSetOutputType != null) {
                      if (this.isUsbConnected != null) {
                         Log.i(str, "[ToBAudioManager] ACTION_HEADSET_PLUG state use usbheadset force set to headphone");
                         this.isUsbConnected = false;
                      }
                      if (this.userSetOutputType == 3) {
                         if (this.isBluetoothConnected != null) {
                            this.userSetOutputType = 5;
                         }else if(this.isUsbConnected != null){
                            this.userSetOutputType = str1;
                         }else {
                            this.userSetOutputType = this.lastSpeakerOrReceiver;
                         }
                         if (this.userSetOutputType == str2) {
                            Log.i(str, "[ToBAudioManager] Headset disconnect switch to receiver should force report");
                         }
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }else {
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }else if(intExtra == b && this.isHeadsetConnected == null){
                   this.isHeadsetConnected = b;
                   this.startVivoAudioTrack();
                   if (this.userEnableHeadphoneMonitor != null) {
                      this.openDeviceHeaphoneMonitorInternal();
                      this.notifyAudioDeviceStatus(5);
                   }
                   this.notifyAudioDeviceStatus(3);
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType != 3) {
                         this.userSetOutputType = 3;
                         Log.i(str, "[ToBAudioManager] some headset notifycation come after system has routing it,forceReportRoute");
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }else {
                      this.asyncResetDevice("isHeadsetConnected = "+intExtra+", userSetOutputType = "+this.userSetOutputType, false, false);
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }
                Log.i(str, "[ToBAudioManager] ACTION_HEADSET_PLUG.state = "+intExtra);
             }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")){
                Log.i(str, "[ToBAudioManager] ACTION_USB_DEVICE plugin");
                if (this.userSetOutputType != null) {
                   Log.i(str, "[ToBAudioManager] ACTION_USB_DEVICE plugin not support");
                   return;
                }else if(this.isUsbConnected == null){
                   this.isUsbConnected = b;
                   this.startVivoAudioTrack();
                   if (this.userEnableHeadphoneMonitor != null) {
                      this.openDeviceHeaphoneMonitorInternal();
                      this.notifyAudioDeviceStatus(5);
                   }
                   this.notifyAudioDeviceStatus(3);
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType != str1) {
                         this.userSetOutputType = str1;
                         this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                         this.audioCommon.resetAudioProcess();
                      }
                   }else {
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }
                this.UseBuildInMicUpdate(false);
             }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_DETACHED")){
                Log.i(str, "[ToBAudioManager] ACTION_USB_DEVICE unplugged");
                if (this.userSetOutputType != null) {
                   Log.i(str, "[ToBAudioManager] ACTION_USB_DEVICE unplugin not support");
                   return;
                }else if(this.isUsbConnected != null){
                   this.isUsbConnected = false;
                   this.closeDeviceHeaphoneMonitorInterval();
                   this.stopVivoAudioTrack();
                   this.notifyAudioDeviceStatus(str1);
                   this.executorService.execute(new f(this, this.isEnableHeadphoneMonitor));
                }
                if (this.userSetOutputType != null) {
                   if (this.userSetOutputType == str1) {
                      if (this.isBluetoothConnected != null) {
                         this.userSetOutputType = 5;
                      }else if(this.isHeadsetConnected != null){
                         this.userSetOutputType = 3;
                      }else {
                         this.userSetOutputType = this.lastSpeakerOrReceiver;
                      }
                      this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                      this.audioCommon.resetAudioProcess();
                   }
                }else {
                   this.audioCommon.getCurrentAudioDeviceConfig(this.config.getScene());
                   this.audioCommon.resetAudioProcess();
                }
                this.UseBuildInMicUpdate(b);
             }else if((p1.getAction()).equals("android.media.VOLUME_CHANGED_ACTION")){
                this.setInnerCapDataVolume();
                this.audioCommon.setVendorHeadphoneMonitorVolume((this.resumeHeadphoneMonitorVolume * this.inputVolume), 3);
             }
          }
       }
       this.executorService.execute(new ToBAudioManager$8(this));
       return;
    }
    public void onServiceConnected(int p0,BluetoothProfile p1){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ToBAudioManager.class, "6")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$2(this, p0, p1));
       return;
    }
    public void onServiceDisconnected(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "7")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$3(this, p0));
       return;
    }
    public boolean openDeviceHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.userEnableHeadphoneMonitor = true;
       boolean b = this.isUsbConnected();
       boolean b1 = false;
       if (!this.isHeadsetConnected() && !b) {
          return b1;
       }
       if (!this.isSupportHeaphoneMonitor()) {
          return b1;
       }
       String mANUFACTURER = Build.MANUFACTURER;
       if (mANUFACTURER.equalsIgnoreCase("VIVO") || mANUFACTURER.equalsIgnoreCase("HUAWEI")) {
          this.handler.postDelayed(new ToBAudioManager$12(this, 1000), (long)1000);
       }else {
          this.openDeviceHeaphoneMonitorInternal();
          if (this.isEnableHeadphoneMonitor != this.isEnableHeadphoneMonitor) {
             Log.d("ToBAudioManager", "[ToBAudioManager] KWStannisAudioHeadphoneMonitorON");
             this.notifyAudioDeviceStatus(5);
          }
       }
       return true;
    }
    public boolean openDeviceHeaphoneMonitorInternal(){
       ToBAudioManager obj = PatchProxy.apply(null, this, ToBAudioManager.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean currentSteam = this.getCurrentSteamType();
       this.startVivoAudioTrack();
       if (this.userEnableHeadphoneMonitor != null) {
          if (this.isKtvVendorSupport != null) {
             this.isEnableHeadphoneMonitor = this.audioCommon.enableVendorHeadphoneMonitor(currentSteam);
             this.audioCommon.setVendorHeadphoneMonitorVolume((this.resumeHeadphoneMonitorVolume * this.inputVolume), currentSteam);
          }else {
             this.isEnableHeadphoneMonitor = false;
          }
          if (this.isEnableHeadphoneMonitor == null) {
             Log.i("ToBAudioManager", "[ToBAudioManager] openDeviceHeaphoneMonitorInternal deviceType "+this.deviceType+" capDeviceType "+this.capDeviceType);
             obj = this.deviceType;
             if (obj != null) {
                if (obj != this.capDeviceType) {
                   this.audioDeviceLock.lock();
                   obj = this.capDevice;
                   if (obj != null && (obj.isRecording() == true && this.device != null)) {
                      Log.i("ToBAudioManager", "[ToBAudioManager] openDeviceHeaphoneMonitorInternal switch captype "+this.capDeviceType+" to "+this.deviceType);
                      this.capDevice.stopRecording();
                      this.device.initRecording(this.config, 0);
                      this.device.startRecording();
                   }
                label_00ad :
                   this.audioDeviceLock.unlock();
                }
                this.audioDeviceLock.lock();
                currentSteam = this.audioCommon.enableSoftHeadphoneMonitor(true);
                this.isEnableSoftHeadphoneMonitor = currentSteam;
                if (currentSteam) {
                   this.isEnableHeadphoneMonitor = true;
                }else {
                   Log.i("ToBAudioManager", "[ToBAudioManager] enableSoftHeadphoneMonitor true failed");
                }
                this.audioDeviceLock.unlock();
             }
          }
       }
    label_00ce :
       this.uploadDeviceInfo();
       return true;
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
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "47")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] registerReceiver start");
       this.audioDeviceLock.lock();
       this.unregisterReceiver();
       UniversalReceiver.e(this.context, this, this.filter);
       this.isRegisterReceiver = true;
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] registerReceiver end");
       return;
    }
    public void removeAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "99")) {
          return;
       }
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e("ToBAudioManager", "removeAudioTelephoneObserver READ_PHONE_STATE permission is missing");
          return;
       }else {
          TelephoneObserver.removeTelephoneObserver();
          return;
       }
    }
    public void resetAudioProcess(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "79")) {
          return;
       }
       this.audioCommon.resetAudioProcess();
       return;
    }
    public void resetDevice(int p0,String p1,boolean p2){
       boolean this;
       boolean b;
       boolean b4;
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, ToBAudioManager.class, "39")) {
          return;
       }
       p1 = ", userSetOutputType = ";
       Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice start, reason: "+p1+p1+this.userSetOutputType+", currentOutType = "+this.currentOutputType);
       this.audioDeviceLock.lock();
       String str = 5;
       this = false;
       if (this.userSetOutputType != null && this.userSetOutputType != this.currentOutputType) {
          Log.d("ToBAudioManager", "[ToBAudioManager] resetDevice userReset: "+this.currentOutputType+" -> "+this.userSetOutputType);
          if (this.currentOutputType == str && this.audioManager.isBluetoothScoOn()) {
             Log.d("ToBAudioManager", "[ToBAudioManager] resetDevice setScoOff");
             this.audioManager.stopBluetoothSco();
             this.audioManager.setBluetoothScoOn(this);
             b = true;
          label_009b :
             boolean b1 = this.audioManager.isBluetoothScoOn();
             AudioDeviceConfig currentAudio = this.getCurrentAudioDeviceConfig(p0);
             this.config = currentAudio;
             if (currentAudio == null) {
                this.audioDeviceLock.unlock();
                Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice getCurrentAudioDeviceConfig == null");
                return;
             }else if(this.device != null){
                Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice needRestart  = "+this.config.isNeedRestart()+", userReset = "+true+" capType "+this.capDeviceType+" deviceType "+this.deviceType);
                if (!this.config.isNeedRestart() && (true || p2)) {
                   ToBAudioManager tdevice = (this.deviceType == this.capDeviceType)? this.device: this.capDevice;
                   boolean b2 = this.device.isPlaying();
                   boolean b3 = tdevice.isRecording();
                   tdevice.stopRecording();
                   this.device.stopPlayout();
                   this.isInitRecording = this;
                   this.isInitPlayout = this;
                   if (tdevice.isInnerCapInstanceExist()) {
                      tdevice.stopInnerCap();
                      Log.i("ToBAudioManager", "[ToBAudioManager] create device should stop inner recording");
                      this = true;
                   }
                   AudioDevice uAudioDevice = this.audioCommon.createDevice(this.config.getDeviceType());
                   this.device = uAudioDevice;
                   ToBAudioManager tcapDeviceTy = this.capDeviceType;
                   if (this.deviceType != tcapDeviceTy) {
                      uAudioDevice = this.audioCommon.createDevice(tcapDeviceTy);
                      this.capDevice = uAudioDevice;
                      Log.i("ToBAudioManager", "[ToBAudioManager] createDevice for capDevice for type "+this.capDeviceType);
                   }
                   this.setAudioSession();
                   if (b2) {
                      if (!this.initPlayout()) {
                         Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice initPlayout error.");
                      }else {
                         this.device.startPlayout();
                      }
                   }
                   if (b3) {
                      if (this.initRecording() < 0) {
                         Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice initRecording error.");
                      }else {
                         uAudioDevice.startRecording();
                         if (this && this.mMediaProjection != null) {
                            Log.i("ToBAudioManager", "[ToBAudioManager] resume inner cap projection"+this.mMediaProjection);
                            uAudioDevice.startAudioInnerCap(this.innercap_samplerate, this.innercap_channnels, this.mMediaProjection);
                         }
                      }
                   }
                   if (this.userSetOutputType != null) {
                      if (this.userSetOutputType == str) {
                         if (this.checkAndStartBluetoothSco()) {
                            Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice checkAndStartBluetoothSco.");
                         }else {
                            Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice checkAndStartBluetoothSco failed.");
                         }
                         b1 = true;
                      }
                   }else {
                      this.checkAndStartBluetoothSco();
                   }
                }
             }else {
                Log.w("ToBAudioManager", "[StaoManager] resetDevice but device is null");
             }
             if (this.device.isInnerCapInstanceExist() || (this.setInnerCapStart != null && this.mMediaProjection != null)) {
                Log.i("ToBAudioManager", "[ToBAudioManager] detect InnerCapInstanceExist should adjust rx and speech broadcast,cur mode "+this.config.getAudioMode()+"scene "+this.config.getScene());
                if (this.config.getAudioMode() == 1) {
                   this.audioCommon.TxForceAddRxListener();
                }else {
                   this.audioCommon.TxForceRemoveRxListener();
                }
             }else {
                Log.i("ToBAudioManager", "[ToBAudioManager] innercap not exist or not start");
             }
             this.audioDeviceLock.unlock();
             Log.d("ToBAudioManager", "[ToBAudioManager] resetDevice isStartSco = "+b1+", isStopSco = "+b+", userReset = "+true);
             if (!b1 && (b || true)) {
                this.updateAudioDeviceConfig(p0);
             }
             this.uploadDeviceInfo(this.getOutputType(), this.userSetOutputType);
             this.resetAudioProcess();
             Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice end, currentOutputType = "+this.currentOutputType+p1+this.userSetOutputType);
             return;
          }else {
             b4 = true;
          }
       }else {
          b4 = false;
       }
       b = false;
       goto label_009b ;
    }
    public void resetDevice(String p0,boolean p1){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ToBAudioManager.class, "37")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice start, reason = "+p0+", force = "+p1);
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig != null) {
          this.isSpeakerOn = this.getSpeakerOn(tconfig.getScene());
          this.resetDevice(this.config.getScene(), p0, p1);
       }else {
          Log.w("ToBAudioManager", "[ToBAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice end, reason = "+p0);
       return;
    }
    public final void resetDeviceOutput(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "38")) {
          return;
       }
       if (this.userSetOutputType != null) {
          ToBAudioManager tuserSetOutp = this.userSetOutputType;
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
          Log.i("ToBAudioManager", "[ToBAudioManager] resetDevice userSetOutputType = "+this.userSetOutputType+", routing = "+i);
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
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "18")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] resetRoundTripLatencyWithDelay start");
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig == null) {
          Log.i("ToBAudioManager", "this.config is null");
          this.audioDeviceLock.unlock();
          return;
       }else if(p0 > 0){
          this.handler.postDelayed(new ToBAudioManager$9(this, tconfig.getRoundTripLatency()), (long)p0);
       }else {
          this.audioCommon.setRoundTripLatency(tconfig.getRoundTripLatency());
          Log.d("ToBAudioManager", "[ToBAudioManager] resetRoundTripLatencyWithDelay to:"+this.config.getRoundTripLatency());
       }
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] resetRoundTripLatencyWithDelay end");
       return;
    }
    public void resumeDeviceHeadphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "69")) {
          return;
       }
       if (p0 || ((Build.MANUFACTURER).equalsIgnoreCase("HUAWEI") && (this.isSupportVendorHeadphoneMonitor() && this.userEnableHeadphoneMonitor != null))) {
          this.executorService.execute(new e(this, p0));
       }
    label_0037 :
       return;
    }
    public void setAudioDeviceStatusListener(StannisAudioDeviceStatusObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToBAudioManager.class, "44")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setAudioDeviceStatusListener start");
       this.audioDeviceLock.lock();
       this.audioDeviceStatusListener = p0;
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] setAudioDeviceStatusListener end");
       return;
    }
    public void setAudioRecordListener(AudioRecordListener p0){
       this.audioRecordListener = p0;
    }
    public void setAudioRouteListener(Stannis$AudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToBAudioManager.class, "5")) {
          return;
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] setAudioRouteListener = "+p0);
       this.audioRouteListener = p0;
       return;
    }
    public void setAudioSession(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "40")) {
          return;
       }
       String str = "ToBAudioManager";
       Log.i(str, "[ToBAudioManager] setAudioSession start");
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i(str, "[ToBAudioManager] setAudioSession end, this.config is null");
          return;
       }else {
          boolean audioManager = tconfig.getAudioManagerMode();
          int mode = this.audioManager.getMode();
          Log.i(str, "[ToBAudioManager] audioManager current Mode "+mode+" tosetMode "+audioManager);
          String str1 = "[ToBAudioManager] audioManager before setMode ";
          if (this.userSetOutputType != null) {
             Log.i(str, str1+mode+"set MODE_IN_COMMUNICATION");
             this.audioManager.setMode(3);
             Log.i(str, "[ToBAudioManager] audioManager set MODE_IN_COMMUNICATION spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
             Log.i(str, "[ToBAudioManager] audioManager curMgrMode"+this.audioManager.getMode());
             this.audioCommon.setIsDeviceAecOn(true);
          }else if(audioManager != mode){
             Log.i(str, str1+mode+"setMode = "+audioManager);
             this.audioManager.setMode(audioManager);
             Log.i(str, "[ToBAudioManager] audioManager after setMode "+audioManager);
             Log.i(str, "[ToBAudioManager] audioManager get mode spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms curMgrMode"+this.audioManager.getMode());
             audioManager = (audioManager == 3)? true: false;
             this.audioCommon.setIsDeviceAecOn(audioManager);
          }
          if (this.userSetOutputType == null) {
             this.isBluetoothConnected = this.audioCommon.isBluetoothConnected();
             Log.i(str, "[ToBAudioManager] audioManager get bluetooth connect state"+this.isBluetoothConnected+"headset "+this.isHeadsetConnected+"usb "+this.isUsbConnected);
             if (this.isHeadsetConnected != null || this.isUsbConnected != null) {
                this.setSpeakerOnWrapper(false);
             }else if(this.isBluetoothConnected != null){
                this.setSpeakerOnWrapper(false);
             }else {
                this.isSpeakerOn = this.getSpeakerOn(this.config.getScene());
                Log.i(str, "[ToBAudioManager] audioManager setAudioSession isSpeakerOn "+this.isSpeakerOn);
                this.setSpeakerOnWrapper(this.isSpeakerOn);
             }
          }else {
             audioManager = this.audioManager.isBluetoothScoOn();
             if (this.userSetOutputType == true) {
                Log.i(str, "[ToBAudioManager] audioManager setAudioSession setSpeakerOn true sco "+audioManager);
                this.setSpeakerOnWrapper(true);
             }else {
                Log.i(str, "[ToBAudioManager] audioManager setAudioSession setSpeakerOn false sco "+audioManager);
                this.setSpeakerOnWrapper(false);
             }
          }
          Log.i(str, "[ToBAudioManager] setAudioSession end");
          this.audioDeviceLock.unlock();
          return;
       }
    }
    public void setCurRecordingDeviceName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToBAudioManager.class, "41")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setcurRecordingDeviceName "+p0);
       this.curRecordingDeviceName = p0;
       return;
    }
    public void setDefaultToReceiver(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "96")) {
          return;
       }
       Log.i("ToBAudioManager", "[KWStannis] AudioManager use kwaimeeting "+p0);
       this.defaultToReceiver = p0;
       return;
    }
    public void setDeviceType(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "2")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setDeviceType start: "+p0);
       Log.i("ToBAudioManager", "[ToBAudioManager] setDeviceType end");
       return;
    }
    public void setHeadphoneMonitorReverbLevel(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "70")) {
          return;
       }
       if (this.isKtvVendorSupport != null && this.isEnableHeadphoneMonitor != null) {
          this.audioCommon.setVendorHeadphoneMonitorReverbLevel(p0);
          this.resumeHeadphoneMonitorReverb = p0;
       }
       return;
    }
    public void setHeadphoneMonitorVolume(float p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ToBAudioManager.class, "64")) {
          return;
       }
       String str = "ToBAudioManager";
       if (this.isEnableHeadphoneMonitor == null) {
          Log.w(str, "[ToBAudioManager] setHeadphoneMonitorVolume failed, isEnableHeadphoneMonitor not enable");
          return;
       }else {
          float f = this.inputVolume * p0;
          this.audioCommon.setSoftHeadphoneMonitorVolume(f);
          Log.i(str, "[ToBAudioManager] setHeadphoneMonitorVolume: "+f);
          this.audioCommon.setVendorHeadphoneMonitorVolume(f, this.getCurrentSteamType());
          this.resumeHeadphoneMonitorVolume = p0;
          return;
       }
    }
    public final void setInnerCapDataVolume(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "74")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$18(this));
       return;
    }
    public void setKtvVendorSupport(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "4")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setKtvVendorSupport = "+p0);
       this.isKtvVendorSupport = p0;
       return;
    }
    public boolean setOutputDevice(AudioDeviceInfo p0){
       boolean b;
       ToBAudioManager obj = PatchProxy.applyOneRefs(p0, this, ToBAudioManager.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       this.audioDeviceLock.lock();
       ToBAudioManager tdevice = this.device;
       if (tdevice != null && !tdevice.getDeviceType()) {
          b = this.device.setOutputDevice(p0);
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean setOutputType(int p0,int p1){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ToBAudioManager.class, "85");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] setOutputType start");
       this.audioDeviceLock.lock();
       boolean i = 3;
       if (p0 == 4) {
          Log.d("ToBAudioManager", "[ToBAudioManager] setOutputType use force use "+this.typeToString(i)+"replace"+this.typeToString(p0));
          p0 = 3;
       }
       int outputType = this.getOutputType();
       if (this.userSetOutputType != p0 || (this.userSetOutputType == null || (this.userSetOutputType == p0 && (this.userSetOutputType != null && this.userSetOutputType == outputType)))) {
          this.audioDeviceLock.unlock();
          return true;
       }else {
          Log.w("ToBAudioManager", "[ToBAudioManager] setOutputType usersetoutppe "+p0+this.typeToString(p0)+"previous type = "+this.userSetOutputType+this.typeToString(this.userSetOutputType)+"current system routing "+outputType);
          if (!this.isOutputTypeSupported(p0)) {
             this.audioDeviceLock.unlock();
             Log.w("ToBAudioManager", "[ToBAudioManager] setOutputType end, not support type = "+p0);
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
             Log.d("ToBAudioManager", "[ToBAudioManager] setOutputType end, saved, isInitPlayout =  "+this.isInitPlayout+", isChat = "+b);
             return false;
          }else {
             this.forceReportRoute = i;
             Log.d("ToBAudioManager", "[ToBAudioManager] *** setOutputType = "+this.userSetOutputType+this.typeToString(this.userSetOutputType)+", resetDevicecurrent system routing "+outputType+this.typeToString(this.userSetOutputType)+"forcereport:"+i);
             b = (this.userSetOutputType != outputType && this.userSetOutputType != null)? true: false;
             if (this.userSetOutputType != null && this.requestAudioFocus == null) {
                this.requestAudioFocus = true;
                Log.i("ToBAudioManager", "[ToBAudioManager] notauto case need requestAudioFocus to listen other app interrupt");
                if (this.audioFocusGain == null) {
                   Log.i("ToBAudioManager", "[ToBAudioManager] requestAudioFocusGain strmtype "+this.config.getStreamType());
                   if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
                      this.notifyAudioDeviceStatus(false);
                   }
                }
             }
             this.resetDevice("setOutputType", b);
             this.audioDeviceLock.unlock();
             Log.d("ToBAudioManager", "[ToBAudioManager] setOutputType end");
             return false;
          }
       }
    }
    public void setRequestAudioFocus(boolean p0){
       this.requestAudioFocus = p0;
    }
    public final void setScoOff(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "15")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$7(this));
       return;
    }
    public void setServerConfigStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ToBAudioManager.class, "42")) {
          return;
       }
       String mODEL = Build.MODEL;
       Log.i("ToBAudioManager", "[ToBAudioManager] setServerConfigStr\( "+p0+" current Model"+mODEL);
       this.serverConfigStr = p0;
       if (p0.contains("aec_list") || (this.serverConfigStr).contains("deepns_list")) {
          this.needForceUpdateRecordingDeviceName = true;
          Log.i("ToBAudioManager", "[ToBAudioManager] setServerConfigStr need force update recording device name");
       }
       p0 = Build.MANUFACTURER;
       String str = "VIVO";
       if (p0.equalsIgnoreCase(str) && ((this.serverConfigStr).contains("vivo_close_java_cap_all") && this.capDeviceType == null)) {
          Log.i("ToBAudioManager", "[ToBAudioManager] setServerConfigStr should switch cap type"+this.capDeviceType+"to play type"+this.deviceType);
          this.capDeviceType = this.deviceType;
       }
    label_0083 :
       mODEL = "vivo_close_java_cap_model\("+mODEL+"\)";
       if (p0.equalsIgnoreCase(str) && ((this.serverConfigStr).contains(mODEL) && this.capDeviceType == null)) {
          Log.i("ToBAudioManager", "[ToBAudioManager] setServerConfigStr"+mODEL+"should switch cap type"+this.capDeviceType+"to play type"+this.deviceType);
          this.capDeviceType = this.deviceType;
       }
    label_00d5 :
       return;
    }
    public void setSpeakerOn(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "78")) {
          return;
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] setSpeakerOn = "+p0);
       boolean b = false;
       if (this.userSetSpeakerOn != p0) {
          b = true;
       }
       this.userSetSpeakerOn = p0;
       this.executorService.execute(new ToBAudioManager$19(this, b));
       return;
    }
    public final void setSpeakerOnWrapper(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "80")) {
          return;
       }
       Log.d("ToBAudioManager", "[ToBAudioManager] setSpeakerOnWrapper start: "+p0);
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.d("ToBAudioManager", "[ToBAudioManager] setSpeakerOnWrapper end, config is null");
          return;
       }else if(this.audioManager != null && tconfig.isPlayoutEnable()){
          this.audioManager.setSpeakerphoneOn(p0);
       }else {
          Log.e("ToBAudioManager", "[ToBAudioManager] set speaker phone on but audio manager is null");
       }
    }
    public void setStereoCaptureAndProcess(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "100")) {
          return;
       }
       this.audioCommon.setStereoCaptureAndProcess(p0);
       return;
    }
    public void setUseSoftHeadphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "3")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setUseSoftHeadphoneMonitor = "+p0);
       this.isUseSoftHeadphoneMonitor = p0;
       return;
    }
    public void setUsingBuiltinMic(boolean p0){
    }
    public void setUsingLocalHeadphoneMonitorSetting(boolean p0){
       this.usingLocalHeadphoneMonitorSetting = p0;
    }
    public void startAudioDeviceCheckThread(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "9")) {
          return;
       }
       String str = "ToBAudioManager";
       Log.i(str, "[ToBAudioManager] startAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       if (this.audioDeviceCheckThread == null) {
          Thread thread = new Thread(this.audioDeviceCheckRunner, "StannisDeviceCheck");
          this.audioDeviceCheckThread = thread;
          thread.start();
          this.audioDeviceCheckThreadLock.unlock();
          Log.i(str, "[ToBAudioManager] startAudioDeviceCheckThread end");
          return;
       }else {
          Log.i(str, "[ToBAudioManager] startAudioDeviceCheckThread already started");
          this.audioDeviceCheckThreadLock.unlock();
          return;
       }
    }
    public boolean startAudioInnerCap(int p0,int p1,MediaProjection p2){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ToBAudioManager.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] startAudioInnerCap begin");
       this.audioDeviceLock.lock();
       int i = 1;
       int i1 = 0;
       if (this.audioManager.requestAudioFocus(this, 3, i) != i) {
          this.notifyAudioDeviceStatus(i1);
       }
       ToBAudioManager tdevice = this.device;
       if (tdevice == null) {
          Log.i("ToBAudioManager", "this.device is null projection "+p2+"sr "+p0+"ch "+p1);
          this.setInnerCapStart = i;
          this.innercap_samplerate = p0;
          this.innercap_channnels = p1;
          this.mMediaProjection = p2;
       }else if(tdevice != null){
          this.setInnerCapDataVolume();
          boolean b = this.device.startAudioInnerCap(p0, p1, p2);
          if (!b) {
             Log.i("ToBAudioManager", "[ToBAudioManager] startAudioInnerCap failed");
          }
          i1 = b;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] startAudioInnerCap end projection "+p2+"sr "+p0+"ch "+p1);
       this.audioDeviceLock.unlock();
       return i1;
    }
    public final void startCheckScoThread(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "23")) {
          return;
       }
       if (this.checkScoIsNotConnectThreadRunning != null && this.checkScoIsNotConnectThread != null) {
          Log.d("ToBAudioManager", "[ToBAudioManager] checkScoThread is already started");
       }else {
          this.checkScoIsNotConnectThreadRunning = true;
          this.checkScoIsNotConnectCount = 0;
          Thread thread = new Thread(new ToBAudioManager$11(this), "StannisScoThread");
          this.checkScoIsNotConnectThread = thread;
          thread.start();
       }
       return;
    }
    public boolean startPlayout(int p0){
       boolean b2;
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] startPlayout start");
       long l = System.nanoTime();
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] startPlayout end, this.config is null");
          return b;
       }else {
          boolean b1 = true;
          if (!tconfig.isPlayoutEnable()) {
             Log.i("ToBAudioManager", "[ToBAudioManager] startPlayout end, cene "+p0+", do not need to start playout.");
             this.audioDeviceLock.unlock();
             return b1;
          }else {
             int i = 2002;
             if (this.init(p0)) {
                if (this.device == null) {
                   this.device = this.audioCommon.createDevice(this.config.getDeviceType());
                }
                if (this.isInitPlayout != null) {
                   if (this.device.isPlaying()) {
                      this.audioDeviceLock.unlock();
                      Log.w("ToBAudioManager", "[ToBAudioManager] startPlayout end, isPlaying");
                      return b1;
                   }
                }else if(!this.initPlayout()){
                   this.audioDeviceLock.unlock();
                   Log.e("ToBAudioManager", "[HisenseAudioManager] startPlayout end, initPlayout error notifyObserver "+this.notifyObserver);
                   ToBAudioManager tnotifyObser1 = this.notifyObserver;
                   if (tnotifyObser1 != null) {
                      tnotifyObser1.onNotify(i);
                   }
                   return b;
                }
                b2 = this.device.startPlayout();
                this.startVivoAudioTrack();
             }else {
                b2 = false;
             }
             this.audioDeviceLock.unlock();
             if (!b2) {
                Log.i("ToBAudioManager", "[HisenseAudioManager] play failed notify device start failed "+this.notifyObserver);
                ToBAudioManager tnotifyObser = this.notifyObserver;
                if (tnotifyObser != null) {
                   tnotifyObser.onNotify(i);
                }
             }
             this.audioCommon.reportDevStateTime(b, (int)TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - l)));
             int streamMaxVol = this.audioManager.getStreamMaxVolume(this.config.getStreamType());
             int streamVolume = this.audioManager.getStreamVolume(this.config.getStreamType());
             this.audioCommon.reportPlayDevVol(((int)((float)streamVolume / (float)streamMaxVol) * 100));
             StringBuilder str = "[ToBAudioManager] startPlayout end,curvol:"+streamVolume;
             Log.i("ToBAudioManager", str+"maxvol:"+streamMaxVol);
             return b2;
          }
       }
    }
    public boolean startRecording(int p0,int p1){
       String obj;
       ToBAudioManager tdevice;
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ToBAudioManager.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "ToBAudioManager";
       Log.i(obj, "[ToBAudioManager] startRecording start");
       long l = System.nanoTime();
       this.audioDeviceLock.lock();
       ToBAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          Log.i(obj, "this.config is null");
          this.audioDeviceLock.unlock();
          return b;
       }else if(!tconfig.isRecordEnable()){
          Log.i(obj, "[ToBAudioManager] scene "+p0+", do not need to start record.");
          this.audioDeviceLock.unlock();
          return true;
       }else {
          String str = null;
          if (this.init(p0)) {
             str = "devicetype ";
             Log.i(obj, "[ToBAudioManager] startRecording use capType "+this.capDeviceType+str+this.deviceType);
             if (this.deviceType == this.capDeviceType) {
                if (this.device == null) {
                   this.device = this.audioCommon.createDevice(this.config.getDeviceType());
                }
                tdevice = this.device;
             }else if((Build.MANUFACTURER).equalsIgnoreCase("VIVO") && this.isEnableSoftHeadphoneMonitor != null){
                if (this.device == null) {
                   this.device = this.audioCommon.createDevice(this.config.getDeviceType());
                }
                tdevice = this.device;
                Log.i(obj, "[ToBAudioManager]startRecording use capType\(isEnableSoftHeadphoneMonitor\) "+this.deviceType+str+this.deviceType);
             }else if(this.capDevice == null){
                this.capDevice = this.audioCommon.createDevice(this.capDeviceType);
                Log.i(obj, "[ToBAudioManager]startRecording create cap device type"+this.capDeviceType);
             }
             tdevice = this.capDevice;
             str = tdevice;
             if (this.isInitRecording != null) {
                if (str.isRecording()) {
                   this.audioDeviceLock.unlock();
                   Log.w(obj, "[ToBAudioManager] startRecording: isRecording");
                   return true;
                }
             }else {
                tdevice = this.initRecording();
                if (tdevice < 0) {
                   this.audioDeviceLock.unlock();
                   Log.e(obj, "[ToBAudioManager] startRecording: initRecordDevice error: "+tdevice+" notifyObserver "+this.notifyObserver);
                   tdevice = this.notifyObserver;
                   if (tdevice != null) {
                      tdevice.onNotify(2002);
                   }
                   return b;
                }
             }
             this.setCurRecordingDeviceName("unknown");
             b = str.startRecording();
             if (this.checkAndStartBluetoothSco()) {
                Log.d(obj, "[ToBAudioManager] startRecording waiting sco connected.");
             }
             Log.i(obj, "[ToBAudioManager] startRecording end");
          }
          if (!str.isInnerCapInstanceExist() && (this.setInnerCapStart != null && this.mMediaProjection != null)) {
             Log.i(obj, "[ToBAudioManager] startInnerCapRecording innercap samplerate "+this.innercap_samplerate+"ch "+this.innercap_channnels);
             this.setInnerCapDataVolume();
             this.startAudioInnerCap(this.innercap_samplerate, this.innercap_channnels, this.mMediaProjection);
             Log.i(obj, "[ToBAudioManager] startInnerCap Succeed");
          }else if(str.isInnerCapInstanceExist()){
             Log.i(obj, "[ToBAudioManager] startRecording detect InnerCapInstanceExist should adjust rx and speech broadcast,cur mode "+this.config.getAudioMode()+"scene "+this.config.getScene());
             if (this.config.getAudioMode() == 1) {
                this.audioCommon.TxForceAddRxListener();
             }else {
                this.audioCommon.TxForceRemoveRxListener();
             }
             Log.i(obj, "[ToBAudioManager] innercap instance exist");
          }else {
             Log.i(obj, "[ToBAudioManager] not enable innercap");
          }
          this.audioDeviceLock.unlock();
          if (!b) {
             Log.i(obj, "[HisenseAudioManager] record failed notify device start failed "+this.notifyObserver);
             tdevice = this.notifyObserver;
             if (tdevice != null) {
                tdevice.onNotify(2002);
             }
          }
          this.audioCommon.reportDevStateTime(true, (int)TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - l)));
          return b;
       }
    }
    public final void startVivoAudioTrack(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "67")) {
          return;
       }
       String str = "ToBAudioManager";
       Log.d(str, "[ToBAudioManager] startVivoAudioTrack");
       if ((Build.MANUFACTURER).equalsIgnoreCase("VIVO") && (this.deviceType != null && (this.isUsbConnected != null || this.isHeadsetConnected != null))) {
          this.audioDeviceLock.lock();
          if (this.config == null) {
             Log.i(str, "[ToBAudioManager] this config is null,retrurn");
             this.audioDeviceLock.unlock();
             return;
          }else if(this.audioDeviceJavaThread == null){
             ToBAudioManager$AudioTrackThread uAudioTrackT = new ToBAudioManager$AudioTrackThread(this, "AudioTrack VIVO\(Monitor\)");
             this.audioDeviceJavaThread = uAudioTrackT;
             uAudioTrackT.initPlayout(this.config.getPlaybackSampleRate(), this.config.getPlaybackChannelNum(), this.config.getStreamType());
             this.audioDeviceJavaThread.start();
             Log.i(str, "[ToBAudioManager] vivo open heaphonemonitor request java play,start silence play");
          }
          this.audioDeviceLock.unlock();
       }
       return;
    }
    public void stopAudioDeviceCheckThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ToBAudioManager.class, "11")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] stopAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       ToBAudioManager taudioDevice = this.audioDeviceCheckRunner;
       if (taudioDevice != null) {
          taudioDevice.shutdown();
       }
       if (this.audioDeviceCheckThread != null) {
          try{
             Log.i("ToBAudioManager", "[ToBAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\)");
             this.audioDeviceCheckThread.interrupt();
             this.audioDeviceCheckThread.join();
             Log.i("ToBAudioManager", "[ToBAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\) end");
             this.audioDeviceCheckThread = objArray;
          }catch(java.lang.InterruptedException e1){
             e1.printStackTrace();
          }
       }
    }
    public final void stopCheckScoThread(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "24")) {
          return;
       }
       if (this.checkScoIsNotConnectThread != null) {
          Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording, stop sco check thread");
          boolean b = false;
          try{
             this.checkScoIsNotConnectThreadRunning = b;
             Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording, checkScoIsNotConnectThread.join");
             this.checkScoIsNotConnectThread.join();
             Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording, checkScoIsNotConnectThread.join end");
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "35")) {
          return;
       }
       this.audioDeviceLock.lock();
       ToBAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.stopInnerCap();
          this.setInnerCapStart = false;
          this.mMediaProjection = null;
       }
       this.audioDeviceLock.unlock();
       return;
    }
    public boolean stopPlayout(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] stopPlayout start");
       this.audioDeviceLock.lock();
       ToBAudioManager tdevice = this.device;
       boolean b = false;
       if (tdevice == null) {
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] stopPlayout start, this.device is null");
          return b;
       }else {
          this.stopVivoAudioTrack();
          this.isInitPlayout = b;
          this.notifyAudioDeviceStatus(2);
          this.uninit();
          this.audioDeviceLock.unlock();
          Log.i("ToBAudioManager", "[ToBAudioManager] stopPlayout end");
          return tdevice.stopPlayout();
       }
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, ToBAudioManager.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.stopRecording(true);
    }
    public boolean stopRecording(boolean p0){
       boolean b;
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ToBAudioManager.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording start");
       this.audioDeviceLock.lock();
       String str = "[ToBAudioManager] stopRecording use capType ";
       Log.i("ToBAudioManager", str+this.capDeviceType+"devicetype "+this.deviceType);
       ToBAudioManager tdevice = this.device;
       if (tdevice != null && tdevice.isRecording()) {
          b = this.device.stopRecording();
          Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording use capType devicetype "+this.deviceType);
       }else {
          b = null;
       }
       ToBAudioManager tcapDevice = this.capDevice;
       if (tcapDevice != null && tcapDevice.isRecording()) {
          b = this.capDevice.stopRecording();
          Log.i("ToBAudioManager", str+this.capDeviceType);
       }
       this.isInitRecording = false;
       if (p0) {
          if (this.audioManager.isBluetoothScoOn()) {
             Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording, stopBluetoothSco");
             this.audioManager.stopBluetoothSco();
             this.setScoOff();
             Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording, stopBluetoothSco end");
          }
          this.stopCheckScoThread();
       }
       this.notifyAudioDeviceStatus(1);
       this.uninit();
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] stopRecording end");
       return b;
    }
    public final void stopVivoAudioTrack(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ToBAudioManager.class, "68")) {
          return;
       }
       String str = "ToBAudioManager";
       Log.d(str, "[ToBAudioManager] stopVivoAudioTrack");
       if ((Build.MANUFACTURER).equalsIgnoreCase("VIVO") && this.deviceType != null) {
          this.audioDeviceLock.lock();
          ToBAudioManager taudioDevice = this.audioDeviceJavaThread;
          if (taudioDevice != null) {
             taudioDevice.stopPlayout();
             this.audioDeviceJavaThread = objArray;
             Log.i(str, "[ToBAudioManager] closeDeviceHeaphoneMonitorclose silence play");
          }
          this.audioDeviceLock.unlock();
       }
       return;
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
       if (PatchProxy.applyVoid(objArray, this, ToBAudioManager.class, "46")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] uninit start");
       this.audioDeviceLock.lock();
       ToBAudioManager tcapDevice = this.capDevice;
       ToBAudioManager toBAudioMana = 1;
       tcapDevice = (tcapDevice != null && tcapDevice.isRecording())? 1: null;
       ToBAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.isRecording();
       }
       if (!tcapDevice && !tcapDevice) {
          toBAudioMana = null;
       }
       tcapDevice = this.device;
       if (tcapDevice != null && (!tcapDevice.isPlaying() && !toBAudioMana)) {
          if (this.isInitialized != null) {
             this.audioManager.setMode(0);
             this.setSpeakerOnWrapper(this.savedIsSpeakerPhoneOn);
             this.audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
             this.isHeadsetConnected = false;
             this.isUsbConnected = false;
             this.isBluetoothConnected = false;
             this.isBluetoothScoConnected = false;
             if (this.audioManager.isBluetoothScoOn()) {
                Log.i("ToBAudioManager", "[ToBAudioManager] unit, stopBluetoothSco");
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
    label_0086 :
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] uninit end");
       return;
    }
    public void unregisterReceiver(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "48")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] unregisterReceiver start");
       this.audioDeviceLock.lock();
       if (this.isRegisterReceiver != null) {
          UniversalReceiver.f(this.context, this);
          this.isRegisterReceiver = false;
       }
       this.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] unregisterReceiver end");
       return;
    }
    public void updateAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ToBAudioManager.class, "12")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] updateAudioDeviceConfig start"+this.isBluetoothScoConnected);
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
       Log.i("ToBAudioManager", "[ToBAudioManager] updateAudioDeviceConfig end:"+this.config);
       return;
    }
    public void updateInputVolume(float p0){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ToBAudioManager.class, "63")) {
          return;
       }
       this.inputVolume = p0;
       Log.i("ToBAudioManager", "[ToBAudioManager] updateInputVolume: "+this.inputVolume);
       this.setHeadphoneMonitorVolume(p0);
       return;
    }
    public final void uploadDeviceInfo(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager.class, "71")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$15(this));
       return;
    }
    public void uploadDeviceInfo(int p0,int p1){
       if (PatchProxy.isSupport(ToBAudioManager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ToBAudioManager.class, "73")) {
          return;
       }
       this.executorService.execute(new ToBAudioManager$17(this, p0, p1));
       return;
    }
    public int writePreLollipop(AudioTrack p0,ByteBuffer p1,int p2){
       if (PatchProxy.isSupport(ToBAudioManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ToBAudioManager.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.write(p1.array(), p1.arrayOffset(), p2);
    }
}
