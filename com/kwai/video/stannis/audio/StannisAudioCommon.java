package com.kwai.video.stannis.audio.StannisAudioCommon;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.audio.support.HuaweiAudioKitHelper;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType;
import com.huawei.multimedia.audiokit.interfaces.AudioFeaturesKit;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import java.lang.String;
import com.kwai.video.stannis.utils.Log;
import android.media.AudioDeviceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.video.stannis.audio.AudioDevice;
import com.kwai.video.stannis.audio.AudioDeviceJava;
import com.kwai.video.stannis.audio.AudioDeviceOpenSL;
import com.kwai.video.stannis.audio.AudioDeviceOboe;
import com.kwai.video.stannis.audio.support.VivoKTVHelper;
import com.kwai.video.stannis.audio.support.MiKTVHelper;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.util.Iterator;
import android.bluetooth.BluetoothAdapter;
import java.lang.SecurityException;

public class StannisAudioCommon implements IAudioKitCallback	// class@000c0a
{
    public AudioManagerProxy audioManager;
    public Context context;
    public boolean hwAudioKaraokeFeatureKitSupport;
    public boolean hwAudioKitSupport;
    public HwAudioKaraokeFeatureKit mHwAudioKaraokeFeatureKit;
    public HwAudioKit mHwAudioKit;
    public long nativeStannis;
    public boolean useStereoCaptureAndProcess;
    public static Map outputName;
    public static Set supportDeviceTypes;

    static {
       HashMap hashMap = new HashMap();
       StannisAudioCommon.outputName = hashMap;
       hashMap.put(Integer.valueOf(0), "Auto");
       Integer integer = Integer.valueOf(1);
       StannisAudioCommon.outputName.put(integer, "Speaker");
       Integer integer1 = Integer.valueOf(2);
       StannisAudioCommon.outputName.put(integer1, "Receiver");
       Integer integer2 = Integer.valueOf(3);
       StannisAudioCommon.outputName.put(integer2, "Line");
       Integer integer3 = Integer.valueOf(4);
       StannisAudioCommon.outputName.put(integer3, "USB");
       StannisAudioCommon.outputName.put(Integer.valueOf(5), "Bluetooth");
       HashSet hashSet = new HashSet();
       StannisAudioCommon.supportDeviceTypes = hashSet;
       hashSet.add(integer1);
       StannisAudioCommon.supportDeviceTypes.add(integer);
       StannisAudioCommon.supportDeviceTypes.add(integer3);
       StannisAudioCommon.supportDeviceTypes.add(integer2);
       StannisAudioCommon.supportDeviceTypes.add(Integer.valueOf(22));
       StannisAudioCommon.supportDeviceTypes.add(Integer.valueOf(11));
       StannisAudioCommon.supportDeviceTypes.add(Integer.valueOf(8));
       StannisAudioCommon.supportDeviceTypes.add(Integer.valueOf(7));
    }
    public void StannisAudioCommon(){
       super();
       this.hwAudioKitSupport = false;
       this.hwAudioKaraokeFeatureKitSupport = false;
       this.useStereoCaptureAndProcess = false;
    }
    public void StannisAudioCommon(long p0,Context p1,AudioManagerProxy p2){
       super();
       this.hwAudioKitSupport = false;
       this.hwAudioKaraokeFeatureKitSupport = false;
       this.useStereoCaptureAndProcess = false;
       this.nativeStannis = p0;
       this.context = p1;
       this.audioManager = p2;
       if (HuaweiAudioKitHelper.isUseAudioKit()) {
          HwAudioKit hwAudioKit = new HwAudioKit(p1, this);
          this.mHwAudioKit = hwAudioKit;
          hwAudioKit.a();
          this.mHwAudioKaraokeFeatureKit = this.mHwAudioKit.b(HwAudioKit$FeatureType.a);
       }
       Log.i("StannisAudioCommon", "[StannisAudioCommon] BUILD_WITH_GIF=true");
       return;
    }
    public static int deviceInfoTypeToInputType(AudioDeviceInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StannisAudioCommon.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (Build$VERSION.SDK_INT >= 23) {
          int type = p0.getType();
          if (type != 3 && type != 4) {
             if (type != 7) {
                if (type != 11) {
                   if (type != 15) {
                      if (type != 22) {
                         Log.d("StannisAudioCommon", "[StannisAudioCommon] device.getInputType\(\) = "+p0.getType());
                      }
                   }else {
                      i = 1;
                   }
                }
                i = 3;
             }else {
                i = 4;
             }
          }else {
             i = 2;
          }
       }
       return i;
    }
    public static int deviceInfoTypeToOutputType(AudioDeviceInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StannisAudioCommon.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (Build$VERSION.SDK_INT >= 23) {
          int type = p0.getType();
          if (type != 1) {
             if (type != 2) {
                if (type != 3 && type != 4) {
                   if (type != 7 && type != 8) {
                      if (type != 9) {
                         if (type != 11 && type != 22) {
                            Log.d("StannisAudioCommon", "[StannisAudioCommon] device.getOutputType\(\) = "+p0.getType());
                         }else {
                            i = 4;
                         }
                      }else {
                         i = 6;
                      }
                   }else {
                      i = 5;
                   }
                }else {
                   i = 3;
                }
             }else {
                i = 1;
             }
          }else {
             i = 2;
          }
       }
       return i;
    }
    public static String getOutputName(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, stannisAudio, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return StannisAudioCommon.outputName.get(Integer.valueOf(p0));
    }
    public static boolean isChatScene(int p0){
       boolean b = (p0 != 768 && (p0 != 2048 && (p0 != 1536 && (p0 != 1024 && (p0 != 3072 && (p0 == 2560 || p0 == 3328))))))? true: false;
       return b;
    }
    public void OnInterrupt(boolean p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannisAudio, "31")) {
          return;
       }
       this.nativeReportPhoneInterrupt(this.nativeStannis, p0);
       return;
    }
    public void SetEnableRecordState(boolean p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannisAudio, "32")) {
          return;
       }
       this.nativeSetEnableRecord(this.nativeStannis, p0);
       return;
    }
    public void SetInnerCapDataVolume(float p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannisAudio, "10")) {
          return;
       }
       this.nativeSetInnerCapDataVolume(this.nativeStannis, p0);
       return;
    }
    public void TxForceAddRxListener(){
       if (PatchProxy.applyVoid(null, this, StannisAudioCommon.class, "11")) {
          return;
       }
       this.nativeForceAddRxListener(this.nativeStannis);
       return;
    }
    public void TxForceRemoveRxListener(){
       if (PatchProxy.applyVoid(null, this, StannisAudioCommon.class, "12")) {
          return;
       }
       this.nativeForceRemoveRxListener(this.nativeStannis);
       return;
    }
    public AudioDevice createDevice(int p0){
       AudioDeviceJava obj;
       AudioDeviceOboe uAudioDevice;
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannisAudio, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.i("StannisAudioCommon", "[StannisAudioCommon] createDevice: type = "+p0);
       obj = null;
       if (!p0) {
          obj = new AudioDeviceJava(this.nativeStannis);
       }else if(p0 != 1 && (p0 == 2 || p0 == 3)){
          uAudioDevice = new AudioDeviceOboe(this.nativeStannis, p0);
       }else if(p0 == 4){
          uAudioDevice = new AudioDeviceOpenSL(this.nativeStannis);
       }
       return obj;
    }
    public void disableVendorHeadphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, StannisAudioCommon.class, "23")) {
          return;
       }
       if (this.isSupportVendorHeadphoneMonitor()) {
          String str = "StannisAudioCommon";
          if (VivoKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
             VivoKTVHelper.getInstance(this.context).setPlayFeedbackParam(0);
             VivoKTVHelper.getInstance(this.context).closeKTVDevice();
             Log.d(str, "[StannisAudioCommon] VivoKTVHelper.getInstance\(this.context\).closeKTVDevice\(\)");
          }else if(MiKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()){
             MiKTVHelper.getInstance(this.context).setPlayFeedbackParam(0);
             MiKTVHelper.getInstance(this.context).closeKTVDevice();
             Log.d(str, "[StannisAudioCommon] MiKTVHelper.getInstance\(this.context\).closeKTVDevice\(\)");
          }else if(this.isDeviceSupportSumsungKTVMode()){
             this.audioManager.setParameters("samsung_ktv_mode=0");
          }else if(this.isDeviceSupportMeituKTVMode()){
             this.audioManager.setParameters("meitu_ktv_mode=0");
          }else if(this.isHWAudioKitSupport()){
             this.mHwAudioKaraokeFeatureKit.a(0);
          }
       }
       return;
    }
    public boolean enableSoftHeadphoneMonitor(boolean p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, stannisAudio, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("StannisAudioCommon", "[StannisAudioCommon] enableSoftHeadphoneMonitor = "+p0);
       return this.nativeEnableHeadphoneMonitor(this.nativeStannis, p0);
    }
    public boolean enableVendorHeadphoneMonitor(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannisAudio, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("StannisAudioCommon", "enableVendorHeadphoneMonitor streamType= "+p0);
       int i = 1;
       if (VivoKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
          VivoKTVHelper.getInstance(this.context).openKTVDevice();
          VivoKTVHelper.getInstance(this.context).setPlayFeedbackParam(i);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] VivoKTVHelper.getInstance\(this.context\).openKTVDevice\(\)");
       }else if(MiKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()){
          MiKTVHelper.getInstance(this.context).openKTVDevice();
          MiKTVHelper.getInstance(this.context).setPlayFeedbackParam(i);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] MiKTVHelper.getInstance\(this.context\).openKTVDevice\(\)");
       }else if(this.isDeviceSupportSumsungKTVMode()){
          this.audioManager.setParameters("samsung_ktv_mode=1");
          this.audioManager.setParameters("samsung_ktv_out_param = 1");
       }else if(this.isDeviceSupportMeituKTVMode()){
          this.audioManager.setParameters("meitu_ktv_mode=1");
       }else if(this.isHWAudioKitSupport()){
          this.mHwAudioKaraokeFeatureKit.a(i);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] openDeviceHeaphoneMonitorInternal hwAudioKit start lock");
          p0 = (int)((float)(this.audioManager.getStreamVolume(p0) * 100) / (float)this.audioManager.getStreamMaxVolume(p0));
          this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.b, p0);
          Log.d("StannisAudioCommon", "mHwAudioKaraokeFeatureKit setParameter CMD_SET_VOCAL_VOLUME_BASE = "+p0);
          this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.a, i);
          this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.c, i);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] Huawei AudioKit Karaoke enable, volume = "+p0);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] openDeviceHeaphoneMonitorInternal hwAudioKit end unlock");
       }else {
          i = false;
          Log.d("StannisAudioCommon", "enableVendorHeadphoneMonitor = isOpen false");
       }
       return i;
    }
    public AudioDeviceConfig getCurrentAudioDeviceConfig(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannisAudio, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AudioDeviceConfig uAudioDevice = this.nativeGetCurrentAudioDeviceConfig(this.nativeStannis, p0);
       if (HuaweiAudioKitHelper.isUseAudioKit() && this.useStereoCaptureAndProcess == null) {
          uAudioDevice.setCaptureChannelNum(1);
       }
       if (this.useStereoCaptureAndProcess != null) {
          uAudioDevice.setCaptureChannelNum(2);
       }
       return uAudioDevice;
    }
    public int[] getHwReverbAndEqMode(int p0){
       int[] ointArray = new int[2]{1,1};
       switch (p0){
           case 3:
             ointArray[0] = 1;
             ointArray[1] = 2;
             break;
           case 4:
           case 7:
             ointArray[0] = 2;
             ointArray[1] = 2;
             break;
           case 6:
           case 13:
             ointArray[0] = 2;
             ointArray[1] = 1;
             break;
           case 8:
           case 9:
             ointArray[0] = 2;
             ointArray[1] = 3;
             break;
           case 10:
             ointArray[0] = 3;
             ointArray[1] = 1;
             break;
           case 11:
             ointArray[0] = 4;
             ointArray[1] = 1;
             break;
           case 12:
             ointArray[0] = 1;
             ointArray[1] = 3;
             break;
           case 14:
             ointArray[0] = 3;
             ointArray[1] = 2;
             break;
           case 15:
             ointArray[0] = 3;
             ointArray[1] = 3;
             break;
           case 17:
             ointArray[0] = 4;
             ointArray[1] = 3;
             break;
           case 18:
             ointArray[0] = 4;
             ointArray[1] = 2;
             break;
           default:
          label_000d :
             ointArray[0] = 1;
             ointArray[1] = 1;
       }
       return ointArray;
    }
    public int[] getOutputTypes(){
       Object[] objArray = null;
       StannisAudioCommon obj = PatchProxy.apply(objArray, this, StannisAudioCommon.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          obj = this.audioManager;
          if (obj != null) {
             AudioDeviceInfo[] devices = obj.getDevices(2);
             HashSet hashSet = new HashSet();
             int i = 0;
             hashSet.add(Integer.valueOf(i));
             int len = devices.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = devices[i1];
                if (StannisAudioCommon.supportDeviceTypes.contains(Integer.valueOf(oobject.getType()))) {
                   hashSet.add(Integer.valueOf(StannisAudioCommon.deviceInfoTypeToOutputType(oobject)));
                }
                i1 = i1 + 1;
             }
             int i2 = hashSet.size();
             int[] ointArray = new int[i2];
             Iterator iterator = hashSet.iterator();
             for (; i < i2; i = i + 1) {
                ointArray[i] = iterator.next().intValue();
             }
             return ointArray;
          }
       }
       return objArray;
    }
    public boolean isBluetoothConnected(){
       BluetoothAdapter obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          obj = BluetoothAdapter.getDefaultAdapter();
          if (obj != null && obj.isEnabled()) {
             int profileConne = obj.getProfileConnectionState(2);
             if (obj.getProfileConnectionState(1) == 2 || profileConne == 2) {
                Log.d("StannisAudioCommon", "[StannisAudioCommon] isConnectBluetooth true");
                return 1;
             }
          }
       }catch(java.lang.SecurityException e0){
          Log.w("StannisAudioCommon", "[StannisAudioCommon] isConnectBluetooth not have BLUETOOTH permission: "+e0.getMessage());
       }
       Log.d("StannisAudioCommon", "[StannisAudioCommon] isConnectBluetooth false");
       return false;
    }
    public final boolean isDeviceSupportMeituKTVMode(){
       String obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.audioManager.getParameters("meitu_ktv_mode");
       if (obj != null && obj.startsWith("meitu_ktv_mode")) {
          return true;
       }
       return false;
    }
    public final boolean isDeviceSupportSumsungKTVMode(){
       String obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.audioManager.getParameters("samsung_ktv_mode");
       if (obj != null && obj.startsWith("samsung_ktv_mode")) {
          return true;
       }
       return false;
    }
    public final boolean isHWAudioKitSupport(){
       Object obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.hwAudioKitSupport != null && (this.hwAudioKaraokeFeatureKitSupport != null && this.mHwAudioKit.a(HwAudioKit$FeatureType.a))) {
          return true;
       }
       return false;
    }
    public boolean isHeadphoneWithMic(){
       AudioDeviceInfo[] obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 23) {
          return this.audioManager.isWiredHeadsetOn();
       }
       obj = this.audioManager.getDevices(2);
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (obj[i].getType() == 3) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isHeadsetConnected(){
       AudioDeviceInfo[] obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 23) {
          return this.audioManager.isWiredHeadsetOn();
       }
       obj = this.audioManager.getDevices(2);
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          object oobject = obj[i];
          if (oobject.getType() == 4 || oobject.getType() == 3) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isSupportVendorHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (VivoKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
          return true;
       }
       if (MiKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
          Log.d("StannisAudioCommon", "[StannisAudioCommon] MiKTVHelper.getInstance\(this.context\).isDeviceSupportKaraoke\(\)");
          return true;
       }else if(this.isDeviceSupportSumsungKTVMode()){
          return true;
       }else if(this.isDeviceSupportMeituKTVMode()){
          return true;
       }else if(this.isHWAudioKitSupport()){
          return true;
       }else {
          return false;
       }
    }
    public boolean isUsbConnected(){
       AudioDeviceInfo[] obj = PatchProxy.apply(null, this, StannisAudioCommon.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 23) {
          return false;
       }
       obj = this.audioManager.getDevices(2);
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          object oobject = obj[i];
          if (oobject.getType() == 11 || oobject.getType() == 22) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public native final boolean nativeEnableHeadphoneMonitor(long p0,boolean p1);
    public native final void nativeForceAddRxListener(long p0);
    public native final void nativeForceRemoveRxListener(long p0);
    public native AudioDeviceConfig nativeGetCurrentAudioDeviceConfig(long p0,int p1);
    public native final void nativeReportPhoneInterrupt(long p0,boolean p1);
    public native final void nativeResetAudioProcess(long p0);
    public native final void nativeSetEnableRecord(long p0,boolean p1);
    public native final void nativeSetHeadphoneMonitorVolume(long p0,float p1);
    public native final void nativeSetInnerCapDataVolume(long p0,float p1);
    public native final void nativeSetIsDeviceAecOn(long p0,boolean p1);
    public native final void nativeSetRoundTripLatency(long p0,int p1);
    public native final void nativeUploadDeviceInfo(long p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,String p6,String p7,String p8);
    public native final void nativeUploadDeviceStartTime(long p0,boolean p1,int p2);
    public native final void nativeUploadPlayDevFormat(long p0,int p1,int p2);
    public native final void nativeUploadPlayDevVol(long p0,int p1);
    public native final void nativeUseBuildInMicUpdate(long p0,boolean p1);
    public void onResult(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannisAudio, "27")) {
          return;
       }
       Log.e("StannisAudioCommon", "[StannisAudioCommon] HWAudioKit onResult = "+p0);
       if (p0) {
          if (p0 != 2) {
             if (p0 == 1000) {
                this.hwAudioKaraokeFeatureKitSupport = true;
             }
          }else {
             this.hwAudioKitSupport = false;
             this.hwAudioKaraokeFeatureKitSupport = false;
          }
       }else {
          this.hwAudioKitSupport = true;
       }
       return;
    }
    public void reportDevStateTime(boolean p0,int p1){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, stannisAudio, "6")) {
          return;
       }
       this.nativeUploadDeviceStartTime(this.nativeStannis, p0, p1);
       return;
    }
    public void reportPlayDevVol(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannisAudio, "8")) {
          return;
       }
       this.nativeUploadPlayDevVol(this.nativeStannis, p0);
       return;
    }
    public void reportPlayFormat(int p0,int p1){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannisAudio, "7")) {
          return;
       }
       this.nativeUploadPlayDevFormat(this.nativeStannis, p0, p1);
       return;
    }
    public void resetAudioProcess(){
       if (PatchProxy.applyVoid(null, this, StannisAudioCommon.class, "9")) {
          return;
       }
       this.nativeResetAudioProcess(this.nativeStannis);
       return;
    }
    public void setIsDeviceAecOn(boolean p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannisAudio, "13")) {
          return;
       }
       this.nativeSetIsDeviceAecOn(this.nativeStannis, p0);
       return;
    }
    public void setRoundTripLatency(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannisAudio, "3")) {
          return;
       }
       this.nativeSetRoundTripLatency(this.nativeStannis, p0);
       return;
    }
    public void setSoftHeadphoneMonitorVolume(float p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannisAudio, "29")) {
          return;
       }
       Log.i("StannisAudioCommon", "[StannisAudioCommon] setSoftHeadphoneMonitorVolume = "+p0);
       this.nativeSetHeadphoneMonitorVolume(this.nativeStannis, p0);
       return;
    }
    public void setStereoCaptureAndProcess(boolean p0){
       this.useStereoCaptureAndProcess = p0;
    }
    public void setVendorHeadphoneMonitorReverbLevel(int p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannisAudio, "26")) {
          return;
       }
       if (VivoKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
          VivoKTVHelper.getInstance(this.context).setCustomMode(p0);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] VivoKTVHelper.getInstance\(this.context\).setCustomMode\(\): "+p0);
          return;
       }else if(MiKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()){
          MiKTVHelper.getInstance(this.context).setCustomMode(p0);
          Log.d("StannisAudioCommon", "[StannisAudioCommon] MiKTVHelper.getInstance\(this.context\).setCustomMode\(\): "+p0);
          return;
       }else if(this.isDeviceSupportSumsungKTVMode()){
          return;
       }else if(this.isDeviceSupportMeituKTVMode()){
          return;
       }else if(this.isHWAudioKitSupport()){
          int[] hwReverbAndE = this.getHwReverbAndEqMode(p0);
          this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.a, hwReverbAndE[0]);
          this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.c, hwReverbAndE[1]);
          Log.d("StannisAudioCommon", "mHwAudioKaraokeFeatureKit setParameter ReverbAndEqMode = "+hwReverbAndE[0]+", "+hwReverbAndE[1]);
       }
       return;
    }
    public void setVendorHeadphoneMonitorVolume(float p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannisAudio, "24")) {
          return;
       }
       float f = 15.00f;
       if (VivoKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()) {
          VivoKTVHelper.getInstance(this.context).setMicVolParam((int)(p0 * f));
       }else if(MiKTVHelper.getInstance(this.context).isDeviceSupportKaraoke()){
          MiKTVHelper.getInstance(this.context).setMicVolParam((int)(p0 * f));
       }else if(this.isDeviceSupportSumsungKTVMode()){
          if (this.isDeviceSupportMeituKTVMode()) {
             this.audioManager.setParameters("meitu_ktv_volume_mic="+(int)(p0 * 10.00f));
          }else if(this.isHWAudioKitSupport()){
             int i = (int)(p0 * 100.00f);
             this.mHwAudioKaraokeFeatureKit.a(HwAudioKaraokeFeatureKit$ParameName.b, i);
             Log.d("StannisAudioCommon", "[StannisAudioCommon] mHwAudioKaraokeFeatureKit setParameter CMD_SET_VOCAL_VOLUME_BASE = "+i);
          }
       }
       return;
    }
    public void setVendorHeadphoneMonitorVolume(float p0,int p1){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, stannisAudio, "25")) {
          return;
       }
       this.setVendorHeadphoneMonitorVolume(((p0 * (float)this.audioManager.getStreamVolume(p1)) / (float)this.audioManager.getStreamMaxVolume(p1)));
       return;
    }
    public void uploadDeviceInfo(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,String p5,String p6,String p7){
       StannisAudioCommon stannisAudio = this;
       StannisAudioCommon stannisAudio1 = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4),p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, this, stannisAudio1, "4")) {
             return;
          }
       }
       this.nativeUploadDeviceInfo(stannisAudio.nativeStannis, p0, p1, p2, p3, p4, p5, p6, p7);
       return;
    }
    public void useBuildInMicUpdate(boolean p0){
       StannisAudioCommon stannisAudio = StannisAudioCommon.class;
       if (PatchProxy.isSupport(stannisAudio) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannisAudio, "5")) {
          return;
       }
       this.nativeUseBuildInMicUpdate(this.nativeStannis, p0);
       return;
    }
}
