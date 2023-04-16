package com.kwai.video.stannis.audio.impl.HisenseAudioManager;
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
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$AudioDeviceCheckRunner;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$1;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.audio.AudioDevice;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.video.stannis.utils.ContextUtils;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.observers.TelephoneObserver;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$5;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.stannis.audio.AudioRecordListener;
import com.kwai.video.stannis.audio.support.LocalHeadphoneMonitor;
import com.kwai.video.stannis.StannisDeviceInfo;
import android.media.AudioDeviceInfo;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import com.kwai.video.stannis.audio.AudioDeviceJava;
import java.lang.StringBuffer;
import com.kwai.video.stannis.audio.support.OppoKTVHelper;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$4;
import bw7.a;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$10;
import android.content.Intent;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$2;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$3;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import java.lang.System;
import java.lang.Float;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$8;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$9;
import java.lang.Exception;
import java.lang.Thread;
import android.media.projection.MediaProjection;
import java.lang.InterruptedException;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$6;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$7;

public class HisenseAudioManager extends BroadcastReceiver implements AudioManager$OnAudioFocusChangeListener, StannisAudioManagerInterface	// class@000c17
{
    public StannisAudioCommon audioCommon;
    public HisenseAudioManager$AudioDeviceCheckRunner audioDeviceCheckRunner;
    public Thread audioDeviceCheckThread;
    public ReentrantLock audioDeviceCheckThreadLock;
    public ReentrantLock audioDeviceLock;
    public StannisAudioDeviceStatusObserver audioDeviceStatusListener;
    public boolean audioFocusGain;
    public AudioManagerProxy audioManager;
    public AudioRecordListener audioRecordListener;
    public Stannis$AudioRouteListener audioRouteListener;
    public AudioDeviceConfig config;
    public Context context;
    public int currentOutputType;
    public AudioDevice device;
    public int deviceType;
    public ExecutorService executorService;
    public IntentFilter filter;
    public boolean forceReportRoute;
    public int innercap_channnels;
    public int innercap_samplerate;
    public boolean isBluetoothConnected;
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
    public MediaProjection mMediaProjection;
    public Handler mainLoopHandler;
    public StannisNotifyObserver notifyObserver;
    public StannisNotifyObserver phoneListener;
    public boolean requestAudioFocus;
    public int savedAudioManagerMode;
    public boolean savedIsMicrophoneMute;
    public boolean savedIsSpeakerPhoneOn;
    public boolean setInnerCapStart;
    public boolean userEnableHeadphoneMonitor;
    public int userSetOutputType;
    public boolean userSetSpeakerOn;
    public boolean usingBuiltinMic;
    public boolean usingLocalHeadphoneMonitorSetting;

    public void HisenseAudioManager(Context p0,ExecutorService p1,long p2,StannisNotifyObserver p3){
       super();
       this.mainLoopHandler = new Handler(Looper.getMainLooper());
       this.notifyObserver = null;
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
       this.context = p0;
       this.executorService = p1;
       this.audioManager = new AudioManagerProxy(p0);
       this.audioCommon = new StannisAudioCommon(p2, p0, this.audioManager);
       this.notifyObserver = p3;
       this.filter.addAction("android.intent.action.HEADSET_PLUG");
       this.filter.addAction("android.media.AUDIO_BECOMING_NOISY");
       this.filter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
       this.filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
       this.filter.addAction("android.media.VOLUME_CHANGED_ACTION");
       this.audioDeviceCheckRunner = new HisenseAudioManager$AudioDeviceCheckRunner(this, null);
    }
    public static void a(HisenseAudioManager p0){
       p0.lambda$onAudioFocusChange$0();
    }
    private void lambda$onAudioFocusChange$0(){
       Log.i("HisenseAudioManager", "[HisenseAudioManager] onAudioFocusChange restart record");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       int scene = (tconfig != null)? tconfig.getScene(): 256;
       HisenseAudioManager tdevice = this.device;
       int i = 0;
       boolean b = (tdevice != null)? tdevice.isRecording(): false;
       this.audioDeviceLock.unlock();
       if (b) {
          this.stopRecording();
          this.startRecording(scene, i);
          Log.i("HisenseAudioManager", "[HisenseAudioManager] onAudioFocusChange restart record end, scene: "+scene);
          this.resetAudioProcess();
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] onAudioFocusChange resetAudioProcess");
       return;
    }
    public void SetEnableRecordState(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "82")) {
          return;
       }
       this.audioCommon.SetEnableRecordState(p0);
       return;
    }
    public void addAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "77")) {
          return;
       }
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e("HisenseAudioManager", "addAudioTelephoneObserver READ_PHONE_STATE permission is missing");
          return;
       }else {
          TelephoneObserver.addTelephoneObserver(this.context, this);
          return;
       }
    }
    public final void asyncResetDevice(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, HisenseAudioManager.class, "8")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$1(this, p0, p1, p2));
       return;
    }
    public void closeDeviceHeaphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "50")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$5(this));
       this.uploadDeviceInfo(this.getOutputType(), this.userSetOutputType);
       return;
    }
    public final int deviceInfoTypeToRouteType(int p0,int p1){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HisenseAudioManager.class, "73");
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
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "17")) {
          return;
       }
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.enableInnerCapDump(p0);
       }
       return;
    }
    public AudioRecordListener getAudioRecordListener(){
       return this.audioRecordListener;
    }
    public String getCurRecordingDeviceName(){
       return "";
    }
    public AudioDeviceConfig getCurrentAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "62");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] getCurrentAudioDeviceConfig start");
       this.audioDeviceLock.lock();
       AudioDeviceConfig currentAudio = this.audioCommon.getCurrentAudioDeviceConfig(p0);
       if (currentAudio == null) {
          this.audioDeviceLock.unlock();
          Log.d("HisenseAudioManager", "[HisenseAudioManager] getCurrentAudioDeviceConfig end, this config is null");
          return null;
       }else if(this.audioCommon.isHeadsetConnected() || (this.audioCommon.isUsbConnected() && (!this.isSupportVendorHeadphoneMonitor() && (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport())))){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] usingLocalHeadphoneMonitor");
          currentAudio.setDeviceType(LocalHeadphoneMonitor.getDeviceType());
          currentAudio.setRoundTripLatency(LocalHeadphoneMonitor.getRoundTripLatency());
       }else {
          currentAudio.setDeviceType(this.deviceType);
       }
       currentAudio.setUsingBuiltinMic(this.usingBuiltinMic);
       if (this.userSetOutputType != null) {
          currentAudio.setAudioMode(1);
       }
       this.audioDeviceLock.unlock();
       Log.d("HisenseAudioManager", "[HisenseAudioManager] getCurrentAudioDeviceConfig: "+currentAudio.toString());
       Log.d("HisenseAudioManager", "[HisenseAudioManager] getCurrentAudioDeviceConfig end");
       return currentAudio;
    }
    public StannisDeviceInfo getCurrentDevice(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "75");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       AudioDeviceInfo inputDevice = (p0 == 1)? this.getInputDevice(): this.getOutputDevice();
       if (inputDevice != null) {
          i = (Build$VERSION.SDK_INT >= 23)? new StannisDeviceInfo(inputDevice.getId(), inputDevice.getProductName().toString(), this.deviceInfoTypeToRouteType(p0, inputDevice.getType())): new StannisDeviceInfo(-1, "unknown", p0);
       }
    label_0052 :
       return i;
    }
    public AudioDeviceConfig getDeviceConfig(){
       return this.config;
    }
    public StannisDeviceInfo[] getDevices(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "74");
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
       HisenseAudioManager obj = PatchProxy.apply(objArray, this, HisenseAudioManager.class, "43");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getInputDevice();
    }
    public AudioDeviceInfo[] getInputDevices(){
       Object[] objArray = null;
       HisenseAudioManager obj = PatchProxy.apply(objArray, this, HisenseAudioManager.class, "41");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "72");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "68");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Log.i("HisenseAudioManager", "[HisenseAudioManager] getMode start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getAudioMode();
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] getMode end");
       return i;
    }
    public AudioDeviceInfo getOutputDevice(){
       Object[] objArray = null;
       HisenseAudioManager obj = PatchProxy.apply(objArray, this, HisenseAudioManager.class, "40");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.audioDeviceLock.lock();
       this.audioDeviceLock.unlock();
       return this.getOutputDevice();
    }
    public AudioDeviceInfo[] getOutputDevices(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HisenseAudioManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] getOutputDevices start");
       this.audioDeviceLock.lock();
       HisenseAudioManager taudioManage = this.audioManager;
       if (taudioManage != null) {
          objArray = taudioManage.getDevices(2);
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] getOutputDevices end");
       return objArray;
    }
    public int getOutputRouter(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "71");
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
       return i;
    }
    public int getOutputType(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "66");
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
             Log.d("HisenseAudioManager", "[HisenseAudioManager] getOutputTypeInternal deviceInfo is null");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.audioCommon.getOutputTypes();
    }
    public int getPlayBackCallbackOffset(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null) {
          i = tdevice.getPlayBackCallbackOffset();
       }
       this.audioDeviceLock.unlock();
       return i;
    }
    public int getPlugin(int p0){
       Object[] obj;
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "61");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 1;
       int i1 = 0x10000;
       if (this.userSetOutputType != null) {
          HisenseAudioManager tuserSetOutp = this.userSetOutputType;
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
       Log.d("HisenseAudioManager", "[HisenseAudioManager] getPluginType: "+String.format("%x", obj)+"£¬ isInitialized = "+this.isInitialized);
       return i1;
    }
    public int getSpeakerDeviceVolume(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 3;
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig != null) {
          i = tconfig.getStreamType();
       }else {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] config is null");
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
       HisenseAudioManager obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.userSetSpeakerOn;
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig != null) {
          speakerOn = this.getSpeakerOn(tconfig.getScene());
       }else {
          Log.w("HisenseAudioManager", "[HisenseAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       return speakerOn;
    }
    public final boolean getSpeakerOn(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "56");
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
       HisenseAudioManager obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "25");
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
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] init start");
       this.audioDeviceLock.lock();
       boolean b = false;
       if (this.config == null) {
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] init end, this.config is null");
          return b;
       }else if(this.userSetOutputType != null){
          this.requestAudioFocus = true;
          Log.i("HisenseAudioManager", "[HisenseAudioManager] notauto case need requestAudioFocus to listen other app interrupt");
       }else if(this.config.getScene() == 2048){
          this.requestAudioFocus = true;
          Log.i("HisenseAudioManager", "[HisenseAudioManager] Hisense set requestAudioFocus = "+this.requestAudioFocus);
       }else {
          this.requestAudioFocus = b;
       }
       if (this.audioFocusGain == null && this.requestAudioFocus != null) {
          if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
             this.notifyAudioDeviceStatus(b);
             this.audioFocusGain = b;
          }else {
             this.audioFocusGain = true;
          }
          Log.i("HisenseAudioManager", "[HisenseAudioManager] requestAudioFocusGain stream type "+this.config.getStreamType()+", gained: "+this.audioFocusGain);
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
          Log.i("HisenseAudioManager", "[HisenseAudioManager] init: mode = "+this.savedAudioManagerMode+", spk on = "+this.savedIsSpeakerPhoneOn+", mic mute = "+this.savedIsMicrophoneMute+", headset = "+this.isHeadsetConnected+", usb = "+this.isUsbConnected+", bluetooth = "+this.isBluetoothConnected+", current_output = "+this.currentOutputType);
       }
       this.updateAudioDeviceConfig(p0);
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] init end");
       return true;
    }
    public void initOutputType(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "63")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] initOutputType start "+p0);
       this.audioDeviceLock.lock();
       this.userSetOutputType = p0;
       this.audioDeviceLock.unlock();
       Log.d("HisenseAudioManager", "[HisenseAudioManager] initOutputType end "+p0);
       return;
    }
    public final boolean initPlayout(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] initPlayout start,get current mode "+this.audioManager.getMode());
       boolean b = false;
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] initPlayout end, this.config is null");
          return b;
       }else {
          this.resetDeviceOutput();
          this.isInitPlayout = true;
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] initPlayout end");
          return this.device.initPlayout(tconfig);
       }
    }
    public final int initRecording(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] initRecording start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig == null) {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] initRecording end, this.config is null");
          this.audioDeviceLock.unlock();
          return -1;
       }else {
          p0 = this.device.initRecording(tconfig, p0);
          if (!p0) {
             this.isInitRecording = true;
          }
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] initRecording end");
          return p0;
       }
    }
    public final int inputDeviceInfoTypeToRouteType(int p0){
       int i = -1;
       if (p0) {
          if (p0 != 3) {
             if (p0 != 15) {
                if (p0 == 22 || (p0 == 11 || p0 == 12)) {
                   i = 6;
                }
             }else {
                i = 20;
             }
          }else {
             i = 0;
          }
       }
       return i;
    }
    public final String intArrToStr(int[] p0){
       StringBuffer obj = PatchProxy.applyOneRefs(p0, this, HisenseAudioManager.class, "55");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadphoneWithMic();
    }
    public boolean isHeadsetConnected(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isHeadsetConnected();
    }
    public final boolean isOutputTypeSupported(int p0){
       int[] obj;
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "64");
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
             Log.w("HisenseAudioManager", "supportType4set is3");
             return true;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isPlayOut(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null) {
          b = tdevice.isPlaying();
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null && tdevice.isRecording()) {
          b = true;
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean isSupportHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.isSupportVendorHeadphoneMonitor();
       boolean b1 = true;
       boolean b2 = (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport())? true: false;
       boolean b3 = OppoKTVHelper.isNotInBlackList();
       Log.d("HisenseAudioManager", "[HisenseAudioManager] isSupportHeaphoneMonitor vendorSupport = "+b+", isUseSoftHeadphoneMonitor = "+this.isUseSoftHeadphoneMonitor+", usingLocalHeadphoneMonitor = "+b2+", isOppoSupoort = "+b3);
       if (b || (this.isUseSoftHeadphoneMonitor != null || (!b2 && !b3))) {
          b1 = false;
       }
    label_0067 :
       return b1;
    }
    public boolean isSupportHeaphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportHeaphoneMonitor();
    }
    public boolean isSupportVendorHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isKtvVendorSupport != null) {
          return this.audioCommon.isSupportVendorHeadphoneMonitor();
       }
       return false;
    }
    public boolean isUsbConnected(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioCommon.isUsbConnected();
    }
    public boolean isUserEnableHeadphoneMonitor(){
       return this.userEnableHeadphoneMonitor;
    }
    public final void notifyAudioDeviceStatus(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "13")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$4(this, p0));
       return;
    }
    public void onAudioFocusChange(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "12")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] onAudioFocusChange reason = "+p0);
       if (this.requestAudioFocus != null) {
          a uoa = null;
          if (p0 != -3 && p0 != -2) {
             if (p0 != -1) {
                if (p0 == 1) {
                   if (this.audioFocusGain == null) {
                      this.mainLoopHandler.postDelayed(new a(this), 1000);
                   }
                   this.audioFocusGain = true;
                }
             }else {
                this.audioFocusGain = uoa;
             }
          }else {
             this.audioFocusGain = uoa;
          }
       }
       return;
    }
    public void onPhoneInterrupt(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "76")) {
          return;
       }
       String str = "HisenseAudioManager";
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e(str, "READ_PHONE_STATE permission is missing");
          return;
       }else {
          Log.i(str, "[KWStannis] AudioManager OnPhoneInterrupt "+p0);
          this.executorService.execute(new HisenseAudioManager$10(this, p0));
          return;
       }
    }
    public void onReceive(Context p0,Intent p1){
       int intExtra;
       String str1;
       String str2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HisenseAudioManager.class, "9")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] onReceive_intent: "+p1.getAction());
       String str = "android.bluetooth.profile.extra.STATE";
       int i = -1;
       boolean b = true;
       if ((p1.getAction()).equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
          intExtra = p1.getIntExtra(str, i);
          if (intExtra) {
             if (intExtra != b) {
                if (intExtra != 2) {
                   str1 = (intExtra != 3)? "unknown": "STATE_DISCONNECTING";
                }else {
                   str1 = "STATE_CONNECTED";
                }
             }else {
                str1 = "STATE_CONNECTING";
             }
          }else {
             str1 = "STATE_DISCONNECTED";
          }
          Log.i("HisenseAudioManager", "[HisenseAudioManager] BluetoothA2dp.EXTRA_STATE = "+str1);
       }else if((p1.getAction()).equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")){
          intExtra = p1.getIntExtra(str, i);
          if (intExtra) {
             if (intExtra != b) {
                if (intExtra != 2) {
                   if (intExtra != 3) {
                      str1 = "BluetoothHeadset.unknown";
                   }else {
                      str1 = "BluetoothHeadset.STATE_DISCONNECTING";
                   }
                }else {
                   str1 = "BluetoothHeadset.STATE_CONNECTED";
                   Log.i("HisenseAudioManager", "[HisenseAudioManager] isBluetoothScoConnect");
                   if (this.userSetOutputType != null) {
                      this.isBluetoothConnected = b;
                      this.userSetOutputType = 5;
                      this.asyncResetDevice(str1+", userSetOutputType = "+this.userSetOutputType, b, false);
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] BluetoothSco not Connect force reset device");
                   }else if(this.isBluetoothConnected == null){
                      this.isBluetoothConnected = b;
                      if (this.userSetOutputType != null) {
                         if (this.userSetOutputType != 5) {
                            this.userSetOutputType = 5;
                            this.asyncResetDevice(str1+", userSetOutputType = "+this.userSetOutputType, false, false);
                         }
                      }else {
                         this.asyncResetDevice(str1+", userSetOutputType = "+this.userSetOutputType, false, false);
                      }
                   }
                }
             }else {
                str1 = "BluetoothHeadset.STATE_CONNECTING";
             }
          }else {
             str1 = "BluetoothHeadset.STATE_DISCONNECTED";
             this.isBluetoothConnected = false;
             if (this.userSetOutputType != null) {
                if (this.userSetOutputType == 5) {
                   if (this.isHeadsetConnected != null) {
                      this.userSetOutputType = 3;
                      str2 = 1;
                   }else if(this.isUsbConnected != null){
                      this.userSetOutputType = 4;
                   }else {
                      this.userSetOutputType = this.lastSpeakerOrReceiver;
                   }
                   str2 = null;
                   if (this.userSetOutputType == 2) {
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] Bluetooth disconnect switch to receiver should force report");
                   }else {
                      b = str2;
                   }
                   this.asyncResetDevice(str1+" 1, userSetOutputType = "+this.userSetOutputType, false, b);
                }
             }else {
                this.asyncResetDevice(str1+" 2, userSetOutputType = "+this.userSetOutputType, false, false);
             }
          }
          Log.i("HisenseAudioManager", "[HisenseAudioManager] BluetoothHeadset.EXTRA_STATE = "+str1);
       }else if((p1.getAction()).equals("android.intent.action.HEADSET_PLUG")){
          intExtra = p1.getIntExtra("state", i);
          Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_HEADSET_PLUG state = "+intExtra+", microphone = "+p1.getIntExtra("microphone", i));
          str2 = "isHeadsetConnected = ";
          if (!intExtra) {
             this.isHeadsetConnected = false;
             this.closeDeviceHeaphoneMonitor();
             this.notifyAudioDeviceStatus(4);
             if (this.userSetOutputType != null) {
                if (this.userSetOutputType == 3) {
                   if (this.isBluetoothConnected != null) {
                      this.userSetOutputType = 5;
                   }else if(this.isUsbConnected != null){
                      this.userSetOutputType = 4;
                   }else {
                      this.userSetOutputType = this.lastSpeakerOrReceiver;
                   }
                   if (this.userSetOutputType == 2) {
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] Headset disconnect switch to receiver should force report");
                   }else {
                      b = false;
                   }
                   this.asyncResetDevice(str2+intExtra+", userSetOutputType = "+this.userSetOutputType, false, b);
                }
             }else {
                this.asyncResetDevice(str2+intExtra+", userSetOutputType = "+this.userSetOutputType, false, false);
             }
          }else if(intExtra == b){
             if (this.isHeadsetConnected == null) {
                this.isHeadsetConnected = b;
                this.notifyAudioDeviceStatus(3);
                if (this.userSetOutputType != null) {
                   if (this.userSetOutputType != 3) {
                      this.userSetOutputType = 3;
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] some headset notifycation come after system has routing it,forceReportRoute");
                      this.asyncResetDevice(str2+intExtra+", userSetOutputType = "+this.userSetOutputType, false, b);
                   }
                }else {
                   this.asyncResetDevice(str2+intExtra+", userSetOutputType = "+this.userSetOutputType, false, false);
                }
             }else if(this.userSetOutputType == null){
                this.asyncResetDevice(str2+intExtra+", userSetOutputType = "+this.userSetOutputType, false, false);
             }
          }
          Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_HEADSET_PLUG.state = "+intExtra);
       }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_USB_DEVICE plugin");
          if (this.userSetOutputType != null) {
             Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_USB_DEVICE plugin not support");
             return;
          }else if(this.isUsbConnected == null){
             this.isUsbConnected = b;
             str2 = "ACTION_USB_DEVICE_ATTACHED , userSetOutputType = ";
             if (this.userSetOutputType != null) {
                if (this.userSetOutputType != 4) {
                   this.userSetOutputType = 4;
                   this.asyncResetDevice(str2+this.userSetOutputType, false, false);
                }
             }else {
                this.asyncResetDevice(str2+this.userSetOutputType, false, false);
             }
          }
       }else if((p1.getAction()).equals("android.hardware.usb.action.USB_DEVICE_DETACHED")){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_USB_DEVICE unplugged");
          if (this.userSetOutputType != null) {
             Log.i("HisenseAudioManager", "[HisenseAudioManager] ACTION_USB_DEVICE unplugin not support");
             return;
          }else {
             this.isUsbConnected = false;
             this.closeDeviceHeaphoneMonitor();
             str2 = "ACTION_USB_DEVICE_DETACHED , userSetOutputType = ";
             if (this.userSetOutputType != null) {
                if (this.userSetOutputType == 4) {
                   if (this.isBluetoothConnected != null) {
                      this.userSetOutputType = 5;
                   }else if(this.isHeadsetConnected != null){
                      this.userSetOutputType = 3;
                   }else {
                      this.userSetOutputType = this.lastSpeakerOrReceiver;
                   }
                   this.asyncResetDevice(str2+this.userSetOutputType, false, false);
                }
             }else {
                this.asyncResetDevice(str2+this.userSetOutputType, false, false);
             }
          }
       }else if((p1.getAction()).equals("android.media.VOLUME_CHANGED_ACTION")){
          this.setInnerCapDataVolume();
       }
       this.executorService.execute(new HisenseAudioManager$2(this));
       return;
    }
    public boolean openDeviceHeaphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "47");
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
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 3;
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
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
             }else if(OppoKTVHelper.isNotInBlackList()){
                this.isEnableHeadphoneMonitor = true;
                this.resetDevice("OPPO", true);
                this.audioCommon.enableSoftHeadphoneMonitor(true);
             }
          }
       }
    label_0070 :
       this.uploadDeviceInfo();
       return this.isEnableHeadphoneMonitor;
    }
    public final int outputDeviceInfoTypeToRouteType(int p0){
       int i = -1;
       if (p0 != 8) {
          if (p0 != 9) {
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
                          default:
                      }
                   }
                }
                i = 4;
             }
          label_0027 :
             i = 6;
          }else {
             i = 7;
          }
       }else {
          i = 5;
       }
       return i;
    }
    public void registerReceiver(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "34")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] registerReceiver start");
       this.audioDeviceLock.lock();
       this.unregisterReceiver();
       UniversalReceiver.e(this.context, this, this.filter);
       this.isRegisterReceiver = true;
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] registerReceiver end");
       return;
    }
    public void removeAudioTelephoneObserver(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "78")) {
          return;
       }
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.READ_PHONE_STATE")) {
          Log.e("HisenseAudioManager", "removeAudioTelephoneObserver READ_PHONE_STATE permission is missing");
          return;
       }else {
          TelephoneObserver.removeTelephoneObserver();
          return;
       }
    }
    public void resetAudioProcess(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "59")) {
          return;
       }
       this.audioCommon.resetAudioProcess();
       return;
    }
    public void resetDevice(int p0,String p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, HisenseAudioManager.class, "28")) {
          return;
       }
       p1 = ", userSetOutputType = ";
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice start, reason: "+p1+p1+this.userSetOutputType+", currentOutType = "+this.currentOutputType);
       this.audioDeviceLock.lock();
       int i = 1;
       if (this.userSetOutputType != null && this.userSetOutputType != this.currentOutputType) {
          Log.d("HisenseAudioManager", "[HisenseAudioManager] resetDevice userReset: "+this.currentOutputType+" -> "+this.userSetOutputType);
          b = true;
       }else {
          b = false;
       }
       AudioDeviceConfig currentAudio = this.getCurrentAudioDeviceConfig(p0);
       this.config = currentAudio;
       if (currentAudio == null) {
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice getCurrentAudioDeviceConfig == null");
          return;
       }else if(this.device != null){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice needRestart  = "+this.config.isNeedRestart()+", userReset = "+b);
          if (!this.config.isNeedRestart() && (b || p2)) {
             p2 = this.device.isPlaying();
             boolean currentAudio1 = this.device.isRecording();
             this.device.stopRecording();
             this.device.stopPlayout();
             this.isInitRecording = false;
             this.isInitPlayout = false;
             int i1 = 80;
             if (this.isEnableHeadphoneMonitor != null && OppoKTVHelper.isNotInBlackList()) {
                Log.i("HisenseAudioManager", "[HisenseAudioManager] OPPO deviceType OPENSL");
                this.device = this.audioCommon.createDevice(i);
                this.audioCommon.setRoundTripLatency(i1);
                Log.i("HisenseAudioManager", "[HisenseAudioManager] OPPO deviceType OPENSL setroundtrip 80ms");
             }else {
                Log.i("HisenseAudioManager", "[HisenseAudioManager] use deviceType "+this.config.getDeviceType());
                this.device = this.audioCommon.createDevice(this.config.getDeviceType());
                if (!this.config.getDeviceType()) {
                   i1 = 250;
                }
                this.audioCommon.setRoundTripLatency(i1);
                Log.i("HisenseAudioManager", "[HisenseAudioManager] OPPO deviceType "+this.config.getDeviceType()+"round_trip_delay "+i1+"ms");
             }
             this.setAudioSession();
             if (p2) {
                if (!this.initPlayout()) {
                   Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice initPlayout error.");
                }else {
                   this.device.startPlayout();
                }
             }
             if (currentAudio1) {
                if (this.initRecording(false) < 0) {
                   Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice initRecording error.");
                }else {
                   this.device.startRecording();
                }
             }
          }
       }else {
          Log.w("HisenseAudioManager", "[StaoManager] resetDevice but device is null");
       }
       this.audioDeviceLock.unlock();
       Log.d("HisenseAudioManager", "[HisenseAudioManager] resetDevice userReset = "+b);
       if (b) {
          this.updateAudioDeviceConfig(p0);
       }
       this.uploadDeviceInfo(this.getOutputType(), this.userSetOutputType);
       this.resetAudioProcess();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice end, currentOutputType = "+this.currentOutputType+p1+this.userSetOutputType);
       return;
    }
    public void resetDevice(String p0,boolean p1){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HisenseAudioManager.class, "26")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice start, reason = "+p0+", force = "+p1);
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig != null) {
          this.isSpeakerOn = this.getSpeakerOn(tconfig.getScene());
          this.resetDevice(this.config.getScene(), p0, p1);
       }else {
          Log.w("HisenseAudioManager", "[HisenseAudioManager] resetDevice config is null");
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice end");
       return;
    }
    public final void resetDeviceOutput(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "27")) {
          return;
       }
       if (this.userSetOutputType != null) {
          HisenseAudioManager tuserSetOutp = this.userSetOutputType;
          int i = 8;
          String str = 2;
          if (tuserSetOutp != 1) {
             if (tuserSetOutp == str || (tuserSetOutp != 3 && tuserSetOutp != 4)) {
                i = 1;
             }
          }else {
             i = 2;
          }
          Log.i("HisenseAudioManager", "[HisenseAudioManager] resetDevice userSetOutputType = "+this.userSetOutputType+", routing = "+i);
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
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "11")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetRoundTripLatencyWithDelay start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig == null) {
          Log.i("HisenseAudioManager", "this.config is null");
          this.audioDeviceLock.unlock();
          return;
       }else if(p0 > 0){
          this.mainLoopHandler.postDelayed(new HisenseAudioManager$3(this, tconfig.getRoundTripLatency()), (long)p0);
       }else {
          this.audioCommon.setRoundTripLatency(tconfig.getRoundTripLatency());
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] resetRoundTripLatencyWithDelay end");
       return;
    }
    public void resumeDeviceHeadphoneMonitor(boolean p0){
    }
    public void setAudioDeviceStatusListener(StannisAudioDeviceStatusObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HisenseAudioManager.class, "31")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] setAudioDeviceStatusListener start");
       this.audioDeviceLock.lock();
       this.audioDeviceStatusListener = p0;
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] setAudioDeviceStatusListener end");
       return;
    }
    public void setAudioRecordListener(AudioRecordListener p0){
       this.audioRecordListener = p0;
    }
    public void setAudioRouteListener(Stannis$AudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HisenseAudioManager.class, "4")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setAudioRouteListener = "+p0);
       this.audioRouteListener = p0;
       return;
    }
    public void setAudioSession(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "30")) {
          return;
       }
       String str = "HisenseAudioManager";
       Log.i(str, "[HisenseAudioManager] setAudioSession start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i(str, "[HisenseAudioManager] setAudioSession end, this.config is null");
          return;
       }else {
          boolean audioManager = tconfig.getAudioManagerMode();
          int mode = this.audioManager.getMode();
          Log.i(str, "[HisenseAudioManager] audioManager current Mode "+mode+" tosetMode "+audioManager);
          String str1 = "[HisenseAudioManager] audioManager before setMode ";
          if (this.userSetOutputType != null) {
             Log.i(str, str1+mode+"set MODE_IN_COMMUNICATION");
             this.audioManager.setMode(3);
             Log.i(str, "[HisenseAudioManager] audioManager set MODE_IN_COMMUNICATION spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
             Log.i(str, "[HisenseAudioManager] audioManager curMgrMode"+this.audioManager.getMode());
             this.audioCommon.setIsDeviceAecOn(true);
          }else if(audioManager != mode){
             Log.i(str, str1+mode+"setMode = "+audioManager);
             this.audioManager.setMode(audioManager);
             Log.i(str, "[HisenseAudioManager] audioManager after setMode "+audioManager);
             Log.i(str, "[HisenseAudioManager] audioManager get mode spent "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms curMgrMode"+this.audioManager.getMode());
             audioManager = (audioManager == 3)? true: false;
             this.audioCommon.setIsDeviceAecOn(audioManager);
          }
          if (this.userSetOutputType == null) {
             this.isBluetoothConnected = this.audioCommon.isBluetoothConnected();
             Log.i(str, "[StannisAudioManager] audioManager get bluetooth connect state"+this.isBluetoothConnected);
             if (this.isHeadsetConnected != null || this.isUsbConnected != null) {
                this.setSpeakerOnWrapper(false);
             }else if(this.isBluetoothConnected != null){
                this.setSpeakerOnWrapper(false);
             }else {
                this.isSpeakerOn = this.getSpeakerOn(this.config.getScene());
                this.setSpeakerOnWrapper(this.isSpeakerOn);
             }
          }else if(this.userSetOutputType == true){
             this.setSpeakerOnWrapper(true);
          }else {
             this.setSpeakerOnWrapper(false);
          }
          Log.i(str, "[HisenseAudioManager] setAudioSession end");
          this.audioDeviceLock.unlock();
          return;
       }
    }
    public void setDefaultToReceiver(boolean p0){
    }
    public void setDeviceType(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "1")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] setDeviceType start: "+p0);
       this.audioDeviceLock.lock();
       this.deviceType = p0;
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null && tdevice.getDeviceType() != p0) {
          this.uninit();
          this.device.stopPlayout();
          this.device.stopRecording();
          this.device = null;
          Log.i("HisenseAudioManager", "[HisenseAudioManager] setDeviceType reset audio device");
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] setDeviceType end");
       return;
    }
    public void setHeadphoneMonitorReverbLevel(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "51")) {
          return;
       }
       if (this.isKtvVendorSupport != null && this.isEnableHeadphoneMonitor != null) {
          this.audioCommon.setVendorHeadphoneMonitorReverbLevel(p0);
       }
       return;
    }
    public void setHeadphoneMonitorVolume(float p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, HisenseAudioManager.class, "49")) {
          return;
       }
       if (this.isEnableHeadphoneMonitor == null) {
          Log.w("HisenseAudioManager", "[HisenseAudioManager] setDeviceMicVolume failed, isEnableHeadphoneMonitor not enable");
          return;
       }else if(this.isUseSoftHeadphoneMonitor != null || (!this.isSupportVendorHeadphoneMonitor() && (this.usingLocalHeadphoneMonitorSetting != null && LocalHeadphoneMonitor.isLocalHeadphoneSupport()))){
          this.audioCommon.setSoftHeadphoneMonitorVolume(p0);
       }else {
          this.audioCommon.setVendorHeadphoneMonitorVolume(p0);
       }
       return;
    }
    public final void setInnerCapDataVolume(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "54")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$8(this));
       return;
    }
    public void setKtvVendorSupport(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "3")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setKtvVendorSupport = "+p0);
       this.isKtvVendorSupport = p0;
       return;
    }
    public boolean setOutputDevice(AudioDeviceInfo p0){
       boolean b;
       HisenseAudioManager obj = PatchProxy.applyOneRefs(p0, this, HisenseAudioManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null && !tdevice.getDeviceType()) {
          b = this.device.setOutputDevice(p0);
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public boolean setOutputType(int p0,int p1){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HisenseAudioManager.class, "65");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setOutputType start");
       this.audioDeviceLock.lock();
       int outputType = this.getOutputType();
       if (this.userSetOutputType != p0 || (this.userSetOutputType == null || (this.userSetOutputType == p0 && (this.userSetOutputType != null && this.userSetOutputType == outputType)))) {
          this.audioDeviceLock.unlock();
          return true;
       }else {
          Log.w("HisenseAudioManager", "[HisenseAudioManager] setOutputType usersetoutppe "+p0+"previous type = "+this.userSetOutputType+"current system routing "+outputType);
          if (!this.isOutputTypeSupported(p0)) {
             this.audioDeviceLock.unlock();
             Log.w("HisenseAudioManager", "[HisenseAudioManager] setOutputType enhd, not support type = "+p0);
             return false;
          }else {
             this.userSetOutputType = p0;
             boolean b = StannisAudioCommon.isChatScene(p1);
             if (this.isInitPlayout == null || !b) {
                this.audioDeviceLock.unlock();
                Log.d("HisenseAudioManager", "[HisenseAudioManager] setOutputType end, saved, isInitPlayout =  "+this.isInitPlayout+", isChat = "+b);
                return false;
             }else {
                Log.d("HisenseAudioManager", "[HisenseAudioManager] *** setOutputType = "+this.userSetOutputType+", resetDevicecurrent system routing "+outputType);
                b = (this.userSetOutputType != outputType && this.userSetOutputType != null)? true: false;
                if (this.userSetOutputType != null && this.requestAudioFocus == null) {
                   this.requestAudioFocus = true;
                   Log.i("HisenseAudioManager", "[HisenseAudioManager] notauto case need requestAudioFocus to listen other app interrupt");
                   if (this.audioFocusGain == null) {
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] requestAudioFocusGain strmtype "+this.config.getStreamType());
                      if (this.audioManager.requestAudioFocus(this, this.config.getStreamType(), true) != 1) {
                         this.notifyAudioDeviceStatus(false);
                      }
                   }
                }
                this.resetDevice("setOutputType", b);
                this.audioDeviceLock.unlock();
                Log.d("HisenseAudioManager", "[HisenseAudioManager] setOutputType end");
                return false;
             }
          }
       }
    }
    public void setRequestAudioFocus(boolean p0){
       this.requestAudioFocus = p0;
    }
    public void setServerConfigStr(String p0){
    }
    public void setSpeakerOn(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "58")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setSpeakerOn = "+p0);
       this.userSetSpeakerOn = p0;
       this.executorService.execute(new HisenseAudioManager$9(this));
       return;
    }
    public final void setSpeakerOnWrapper(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "60")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setSpeakerOnWrapper start: "+p0);
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.d("HisenseAudioManager", "[HisenseAudioManager] setSpeakerOnWrapper end, config is null");
          return;
       }else if(this.audioManager != null && tconfig.isPlayoutEnable()){
          this.audioManager.setSpeakerphoneOn(p0);
       }else {
          Log.e("HisenseAudioManager", "[HisenseAudioManager] set speaker phone on but audio manager is null");
       }
    }
    public void setStereoCaptureAndProcess(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "79")) {
          return;
       }
       this.audioCommon.setStereoCaptureAndProcess(p0);
       return;
    }
    public void setUseSoftHeadphoneMonitor(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "2")) {
          return;
       }
       Log.d("HisenseAudioManager", "[HisenseAudioManager] setUseSoftHeadphoneMonitor = "+p0);
       this.isUseSoftHeadphoneMonitor = p0;
       return;
    }
    public void setUsingBuiltinMic(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "29")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] setUsingBuiltinMic = "+p0);
       this.usingBuiltinMic = p0;
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
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
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "5")) {
          return;
       }
       String str = "HisenseAudioManager";
       Log.i(str, "[HisenseAudioManager] startAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       if (this.audioDeviceCheckThread == null) {
          Thread thread = new Thread(this.audioDeviceCheckRunner, "StannisDeviceCheck");
          this.audioDeviceCheckThread = thread;
          thread.start();
          this.audioDeviceCheckThreadLock.unlock();
          Log.i(str, "[HisenseAudioManager] startAudioDeviceCheckThread end");
          return;
       }else {
          Log.i(str, "[HisenseAudioManager] startAudioDeviceCheckThread already started");
          this.audioDeviceCheckThreadLock.unlock();
          return;
       }
    }
    public boolean startAudioInnerCap(int p0,int p1,MediaProjection p2){
       String obj;
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, HisenseAudioManager.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "HisenseAudioManager";
       Log.i(obj, "[HisenseAudioManager] startAudioInnerCap begin");
       int i = 0;
       if (this.audioManager.requestAudioFocus(this, 3, 1) != 1) {
          this.notifyAudioDeviceStatus(i);
       }
       if (this.device == null) {
          Log.i(obj, "this.device is null");
          this.setInnerCapStart = true;
          this.innercap_samplerate = p0;
          this.innercap_channnels = p1;
          this.mMediaProjection = p2;
          return i;
       }else {
          Log.i(obj, "[HisenseAudioManager] startAudiInnerCap end");
          if (this.device != null) {
             this.setInnerCapDataVolume();
             i = this.device.startAudioInnerCap(p0, p1, p2);
          }
          return i;
       }
    }
    public boolean startPlayout(int p0){
       HisenseAudioManager tnotifyObser;
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] startPlayout start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] startPlayout end, this.config is null");
          return b;
       }else if(!tconfig.isPlayoutEnable()){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] startPlayout end, cene "+p0+", do not need to start playout.");
          this.audioDeviceLock.unlock();
          return true;
       }else if(this.init(p0)){
          if (this.device == null) {
             this.device = this.audioCommon.createDevice(this.config.getDeviceType());
          }
          if (this.isInitPlayout != null) {
             if (this.device.isPlaying()) {
                this.audioDeviceLock.unlock();
                Log.w("HisenseAudioManager", "[HisenseAudioManager] startPlayout end, isPlaying");
                return b;
             }
          }else if(!this.initPlayout()){
             this.audioDeviceLock.unlock();
             Log.e("HisenseAudioManager", "[HisenseAudioManager] startPlayout end, initPlayout error notifyObserver "+this.notifyObserver);
             tnotifyObser = this.notifyObserver;
             if (tnotifyObser != null) {
                tnotifyObser.onNotify(2002);
             }
             return b;
          }
          b = this.device.startPlayout();
       }
       if (!b) {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] play failed notify device start failed "+this.notifyObserver);
          tnotifyObser = this.notifyObserver;
          if (tnotifyObser != null) {
             tnotifyObser.onNotify(2002);
          }
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] startPlayout end");
       return b;
    }
    public boolean startRecording(int p0,int p1){
       HisenseAudioManager tnotifyObser;
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HisenseAudioManager.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] startRecording start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tconfig = this.config;
       boolean b = false;
       if (tconfig == null) {
          Log.i("HisenseAudioManager", "this.config is null");
          this.audioDeviceLock.unlock();
          return b;
       }else if(!tconfig.isRecordEnable()){
          Log.i("HisenseAudioManager", "[HisenseAudioManager] scene "+p0+", do not need to start record.");
          this.audioDeviceLock.unlock();
          return true;
       }else if(this.init(p0)){
          if (this.device == null) {
             this.device = this.audioCommon.createDevice(this.config.getDeviceType());
          }
          if (this.isInitRecording != null) {
             if (this.device.isRecording()) {
                this.audioDeviceLock.unlock();
                Log.w("HisenseAudioManager", "[HisenseAudioManager] startRecording: isRecording");
                return b;
             }
          }else {
             p0 = this.initRecording(p1);
             if (p0 < 0) {
                this.audioDeviceLock.unlock();
                Log.e("HisenseAudioManager", "[HisenseAudioManager] startRecording: initRecordDevice error: "+p0+" notifyObserver "+this.notifyObserver);
                tnotifyObser = this.notifyObserver;
                if (tnotifyObser != null) {
                   tnotifyObser.onNotify(2002);
                }
                return b;
             }
          }
          b = this.device.startRecording();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] startRecording end");
       }
       if (!this.device.isInnerCapInstanceExist() && (this.setInnerCapStart != null && this.mMediaProjection != null)) {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] startInnerCapRecording innercap samplerate "+this.innercap_samplerate+"ch "+this.innercap_channnels);
          this.setInnerCapDataVolume();
          this.startAudioInnerCap(this.innercap_samplerate, this.innercap_channnels, this.mMediaProjection);
       }else {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] startInnerCap Not Succeed");
       }
       if (!b) {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] record failed notify device start failed "+this.notifyObserver);
          tnotifyObser = this.notifyObserver;
          if (tnotifyObser != null) {
             tnotifyObser.onNotify(2002);
          }
       }
       this.audioDeviceLock.unlock();
       return b;
    }
    public void stopAudioDeviceCheckThread(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HisenseAudioManager.class, "6")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] stopAudioDeviceCheckThread start");
       this.audioDeviceCheckThreadLock.lock();
       HisenseAudioManager taudioDevice = this.audioDeviceCheckRunner;
       if (taudioDevice != null) {
          taudioDevice.shutdown();
       }
       if (this.audioDeviceCheckThread != null) {
          try{
             Log.i("HisenseAudioManager", "[HisenseAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\)");
             this.audioDeviceCheckThread.interrupt();
             this.audioDeviceCheckThread.join();
             Log.i("HisenseAudioManager", "[HisenseAudioManager] stopAudioDeviceCheckThread audioDeviceCheckThread.join\(\) end");
             this.audioDeviceCheckThread = objArray;
          }catch(java.lang.InterruptedException e1){
             e1.printStackTrace();
          }
       }
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "24")) {
          return;
       }
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null) {
          tdevice.stopInnerCap();
          this.setInnerCapStart = false;
          this.mMediaProjection = null;
       }
       return;
    }
    public boolean stopPlayout(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] stopPlayout start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       boolean b = false;
       if (tdevice == null) {
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] stopPlayout start, this.device is null");
          return b;
       }else {
          this.isInitPlayout = b;
          this.notifyAudioDeviceStatus(2);
          this.uninit();
          this.audioDeviceLock.unlock();
          Log.i("HisenseAudioManager", "[HisenseAudioManager] stopPlayout end");
          return tdevice.stopPlayout();
       }
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, HisenseAudioManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.stopRecording(true);
    }
    public boolean stopRecording(boolean p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, HisenseAudioManager.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] stopRecording start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       boolean b = false;
       boolean b1 = (tdevice != null)? tdevice.stopRecording(): false;
       this.isInitRecording = b;
       this.notifyAudioDeviceStatus(1);
       this.uninit();
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] stopRecording end");
       return b1;
    }
    public final void uninit(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HisenseAudioManager.class, "33")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] uninit start");
       this.audioDeviceLock.lock();
       HisenseAudioManager tdevice = this.device;
       if (tdevice != null && (!tdevice.isPlaying() && !this.device.isRecording())) {
          if (this.isInitialized != null) {
             this.audioManager.setMode(0);
             this.setSpeakerOnWrapper(this.savedIsSpeakerPhoneOn);
             this.audioManager.setMicrophoneMute(this.savedIsMicrophoneMute);
             this.isHeadsetConnected = false;
             this.isUsbConnected = false;
             this.isBluetoothConnected = false;
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
    label_005e :
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] uninit end");
       return;
    }
    public void unregisterReceiver(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "35")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] unregisterReceiver start");
       this.audioDeviceLock.lock();
       if (this.isRegisterReceiver != null) {
          UniversalReceiver.f(this.context, this);
          this.isRegisterReceiver = false;
       }
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] unregisterReceiver end");
       return;
    }
    public void updateAudioDeviceConfig(int p0){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HisenseAudioManager.class, "7")) {
          return;
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] updateAudioDeviceConfig start");
       this.audioDeviceLock.lock();
       this.config = this.getCurrentAudioDeviceConfig(p0);
       this.audioDeviceLock.unlock();
       Log.i("HisenseAudioManager", "[HisenseAudioManager] updateAudioDeviceConfig end:"+this.config);
       return;
    }
    public final void uploadDeviceInfo(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager.class, "52")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$6(this));
       return;
    }
    public void uploadDeviceInfo(int p0,int p1){
       if (PatchProxy.isSupport(HisenseAudioManager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, HisenseAudioManager.class, "53")) {
          return;
       }
       this.executorService.execute(new HisenseAudioManager$7(this, p0, p1));
       return;
    }
}
