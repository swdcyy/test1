package com.kwai.video.stannis.Stannis;
import com.kwai.video.stannis.utils.NativeLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.video.stannis.Stannis$2;
import java.util.Map;
import java.util.Collections;
import com.kwai.video.stannis.Stannis$3;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.video.stannis.Stannis$KWStannisConfig;
import android.os.Build$VERSION;
import com.kwai.video.stannis.Stannis$5;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.stannis.Stannis$LogParam;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.DataReadyObserver;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.stannis.observers.DataProviderObserver;
import java.lang.Boolean;
import com.kwai.video.stannis.Stannis$KWTempoInterface;
import com.kwai.video.stannis.Stannis$KWStannisAudioLib;
import java.lang.Number;
import com.kwai.video.stannis.Stannis$AudioChangeParam;
import java.util.ArrayList;
import java.lang.Float;
import com.kwai.video.stannis.observers.StannisAudioSceneObserver;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.StannisAudioManagerInterface;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;
import java.lang.reflect.Array;
import com.kwai.video.stannis.StannisDeviceInfo;
import java.util.List;
import com.kwai.video.stannis.QosInfo;
import com.kwai.video.stannis.MicrophoneInfo;
import android.content.Context;
import com.kwai.video.stannis.observers.StannisQosObserver;
import com.kwai.video.stannis.utils.ContextUtils;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import android.content.pm.ApplicationInfo;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import com.kwai.video.stannis.Stannis$1;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import com.kwai.video.stannis.observers.SoundEffectObserver;
import com.kwai.video.stannis.observers.BgmObserver;
import com.kwai.video.stannis.observers.AudioFrameObserverWrapper;
import com.kwai.video.stannis.observers.AudioInfoObserverWrapper;
import com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import com.kwai.video.stannis.observers.AsrObserver;
import com.kwai.video.stannis.observers.FingerprintObserver;
import com.kwai.video.stannis.observers.KaraokeScoreObserver;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver;
import com.kwai.video.stannis.observers.RecordFileObserver;
import com.kwai.video.stannis.Stannis$KWStannisServerConfig;
import com.kwai.video.stannis.Stannis$4;
import java.lang.Thread;
import java.lang.Double;
import com.kwai.video.stannis.observers.AudioFrameObserver;
import com.kwai.video.stannis.observers.AudioInfoObserver;
import com.kwai.video.stannis.audio.support.HuaweiAudioKitHelper;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import com.kwai.video.stannis.StannisSoLoader;
import java.lang.System;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import android.os.Build;
import android.media.projection.MediaProjection;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver$ErrorType;

public class Stannis	// class@000bf0
{
    public int audioDeviceScene;
    public AudioFrameObserverWrapper audioFrameObserverWrapper;
    public AudioInfoObserverWrapper audioInfoObserverWrapper;
    public ReentrantLock audioManagerLock;
    public Stannis$KWStannisAudioLib audioProcessLib;
    public boolean audioRecordEnabled;
    public boolean audioRecordStartedByUser;
    public Stannis$AudioRouteListener audioRouteListener;
    public int audioScenario;
    public ConcurrentLinkedQueue audioSceneObservers;
    public Stannis$KWStannisConfig audio_confg;
    public Context context;
    public DataReadyObserver dataReadyObserver;
    public StannisAudioDeviceStatusObserver deviceStatusObserver;
    public boolean dumpInnerCapData;
    public long hisenseNativeDataReadyObserver;
    public long hisenseNativeRawDataReadyObserver;
    public boolean isAudioDeviceStarted;
    public boolean isChatBgmMuted;
    public boolean isChatStreamStarted;
    public boolean isDuringInterrupt;
    public boolean isDuringPhoneInterrupt;
    public boolean isLiveSteamStarted;
    public boolean isLiveStreamBgmMuted;
    public boolean isPipeLineStarted;
    public boolean ktvVendorSupport;
    public int muteType;
    public long nativeStannis;
    public StannisNotifyObserver notifyObserver;
    public StannisQosObserver qosObserver;
    public long recordSketchIntervalBegin;
    public long recordSketchIntervalEnd;
    public int resetRecordMode;
    public Stannis$KWStannisAudioEffectParam savedAudioEffectParam;
    public boolean savedEnableAudioEffectParam;
    public boolean savedEnableHeadphoneMonitorForToB;
    public StannisAudioManagerInterface stannisAudioManager;
    public boolean useHisenseVocalBgmDelay;
    public long userId;
    public HashSet userIdSet;
    public int userSetOutputType;
    public boolean userSetSpeakerOn;
    public int vocalBgmDelay;
    public static final Map AUDIO_OUTPUT_ROUTER_MAP;
    public static final Map AUDIO_PLUGIN_ROUTER_MAP;
    public static ExecutorService executorService;
    public static Stannis instance;
    public static AtomicBoolean isCaeProcessSoLoaded;
    public static AtomicBoolean isDeepAecSoLoaded;
    public static AtomicBoolean isDeepDenoiseSoLoaded;
    public static String testAppName;

    static {
       NativeLoader.loadNative();
       Stannis.executorService = Executors.newFixedThreadPool(1);
       Stannis.isDeepDenoiseSoLoaded = new AtomicBoolean(false);
       Stannis.isCaeProcessSoLoaded = new AtomicBoolean(false);
       Stannis.isDeepAecSoLoaded = new AtomicBoolean(false);
       Stannis.AUDIO_PLUGIN_ROUTER_MAP = Collections.unmodifiableMap(new Stannis$2());
       Stannis.AUDIO_OUTPUT_ROUTER_MAP = Collections.unmodifiableMap(new Stannis$3());
    }
    public void Stannis(){
       super();
       this.isLiveSteamStarted = false;
       this.isChatStreamStarted = false;
       this.isAudioDeviceStarted = false;
       this.isPipeLineStarted = false;
       this.muteType = 0;
       this.isChatBgmMuted = false;
       this.isLiveStreamBgmMuted = false;
       this.isDuringInterrupt = false;
       this.isDuringPhoneInterrupt = false;
       this.audioManagerLock = new ReentrantLock();
       this.audioRecordStartedByUser = false;
       this.audioRecordEnabled = true;
       this.audioScenario = 0;
       this.userIdSet = new HashSet();
       this.userId = 0;
       this.audioSceneObservers = new ConcurrentLinkedQueue();
       this.userSetSpeakerOn = true;
       this.userSetOutputType = 0;
       this.vocalBgmDelay = 0;
       this.useHisenseVocalBgmDelay = false;
       this.dumpInnerCapData = false;
       this.ktvVendorSupport = true;
       this.savedEnableHeadphoneMonitorForToB = false;
       this.savedEnableAudioEffectParam = false;
       this.deviceStatusObserver = null;
       this.resetRecordMode = 0;
       this.audio_confg = new Stannis$KWStannisConfig(this);
       this.audioProcessLib = null;
       this.nativeStannis = this.nativeCreateStannis(Build$VERSION.SDK_INT);
       Stannis.executorService.execute(new Stannis$5(this));
    }
    public static Stannis getInstance(){
       Stannis stannis = Stannis.class;
       Object obj = PatchProxy.apply(null, null, stannis, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Stannis.instance == null) {
          _monitor_enter(stannis);
          if (Stannis.instance == null) {
             Stannis.instance = new Stannis();
          }
          _monitor_exit(stannis);
       }
       return Stannis.instance;
    }
    public static void setLogParam(Stannis$LogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Stannis.class, "6")) {
          return;
       }
       Log.setLogParam(p0);
       return;
    }
    public void AddBypassDataReadyObserver(DataReadyObserver p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, stannis, "67")) {
          return;
       }
       this.nativeAddBypassDataReadyObserver(this.nativeStannis, p0);
       return;
    }
    public void AddLiveChatMixBgmStream(DataReadyObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "55")) {
          return;
       }
       if (this.isChatStreamStarted == null) {
          return;
       }
       this.nativeAddLiveChatMixBgmStream(this.nativeStannis, 3, 3, p0);
       return;
    }
    public void AddLiveChatMixBgmStreamWithNativePtr(long p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, stannis, "56")) {
          return;
       }
       if (this.isChatStreamStarted == null) {
          return;
       }
       this.nativeAddLiveChatMixBgmStreamWithNativeReceiver(this.nativeStannis, 3, 3, p0);
       return;
    }
    public void AddRecordChorusDataReadyObserver(DataReadyObserver p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, stannis, "69")) {
          return;
       }
       if (p1 == 1) {
          this.nativeAddRecordChorusDataReadyObserver(this.nativeStannis, p0);
       }else if(p1 == 2){
          this.nativeAddRecordChorusWithoutRxDataReady(this.nativeStannis, p0);
       }else if(p1 == 3){
          this.nativeAddRecordChorusOnlyRxDataReady(this.nativeStannis, p0);
       }
       return;
    }
    public void AddRxStream(int p0,DataProviderObserver p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "59")) {
          return;
       }
       this.AddRxStream(p0, p1, p2, p3, false);
       return;
    }
    public void AddRxStream(int p0,DataProviderObserver p1,int p2,int p3,boolean p4){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stannis, "60")) {
             return;
          }
       }
       this.nativeAddRxStream(this.nativeStannis, p0, p1, p2, p3, p4);
       return;
    }
    public void AddRxStreamWithNativeDataProvider(int p0,long p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "61")) {
          return;
       }
       this.AddRxStreamWithNativeDataProvider(p0, p1, p2, p3, false);
       return;
    }
    public void AddRxStreamWithNativeDataProvider(int p0,long p1,int p2,int p3,boolean p4){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "62")) {
             return;
          }
       }
       this.nativeAddRxStreamWithNativeDataProvider(stannis.nativeStannis, p0, p1, p2, p3, p4);
       return;
    }
    public void AddRxStreamWithNativeDataProviderWithType(int p0,long p1,int p2,int p3,boolean p4,int p5){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "63")) {
             return;
          }
       }
       this.nativeAddRxStreamWithNativeDataProviderWithType(stannis.nativeStannis, p0, p1, p2, p3, p4, p5);
       return;
    }
    public Stannis$KWTempoInterface CreateTempoInterface(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new Stannis$KWTempoInterface(this, p0, p1);
    }
    public void DestroyTempoInterface(Stannis$KWTempoInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "2")) {
          return;
       }
       p0.ReleaseNative();
       return;
    }
    public String KWStanisGetCpuInfo(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "320");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetCpuInfo();
    }
    public void KWStannisAudioProcessAudioData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "314")) {
          return;
       }
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.processData(p0);
       }
       return;
    }
    public int KWStannisAudioProcessGetFrameSample(){
       Stannis obj = PatchProxy.apply(null, this, Stannis.class, "313");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audioProcessLib;
       if (obj == null) {
          return 0;
       }
       return obj.getSamplePerFrame();
    }
    public void KWStannisAudioProcessSetAudioChangeParam(Stannis$AudioChangeParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "311")) {
          return;
       }
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.setAudioChangeParam(p0);
       }
       return;
    }
    public void KWStannisAudioProcessSetNs(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "310")) {
          return;
       }
       stannis = this.audioProcessLib;
       if (stannis != null) {
          stannis.setEnableNs(p0);
       }
       return;
    }
    public void KWStannisAudioProcessSetReverb(int p0){
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.reverb_level = p0;
       }
       return;
    }
    public void KWStannisAudioProcessSetSampleRate(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "312")) {
          return;
       }
       stannis = this.audioProcessLib;
       if (stannis == null) {
          return;
       }
       if (stannis.isNativeInited()) {
          this.audioProcessLib.uninitNative();
       }
       this.audioProcessLib.setSampleRate(p0);
       this.audioProcessLib.setChannelNum(p1);
       this.audioProcessLib.initNative();
       return;
    }
    public void KWStannisAudioProcessSetVocal(int p0){
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.vocal = p0;
       }
       return;
    }
    public void KWStannisAudioProcessSetVoiceEffect(int p0){
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.voice_effect = p0;
       }
       return;
    }
    public void KWStannisCreateAudioProcessLib(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "308")) {
          return;
       }
       this.audioProcessLib = new Stannis$KWStannisAudioLib(this);
       return;
    }
    public void KWStannisDestroyAudioProcessLib(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "309")) {
          return;
       }
       Stannis taudioProces = this.audioProcessLib;
       if (taudioProces != null) {
          taudioProces.uninitNative();
          this.audioProcessLib = null;
       }
       return;
    }
    public void RemoveAllBypassDataReadyObserver(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "68")) {
          return;
       }
       this.nativeRemoveBypassDataReadyObserver(this.nativeStannis);
       return;
    }
    public void RemoveAllRecordChorusDataReadyObserver(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "71")) {
          return;
       }
       this.nativeRemoveAllRecordChorusDataReadyObserver(this.nativeStannis);
       this.nativeRemoveAllRecordChorusWithoutRxDataReady(this.nativeStannis);
       this.nativeRemoveAllRecordChorusOnlyRxDataReady(this.nativeStannis);
       return;
    }
    public void RemoveLiveChatMixBgmStream(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "57")) {
          return;
       }
       this.nativeRemoveLiveChatMixBgmStream(this.nativeStannis, 3);
       return;
    }
    public void RemoveRecordChorusDataReadyObserver(DataReadyObserver p0,int p1){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Stannis.class, "70")) {
          return;
       }
       if (p1 == 1) {
          this.nativeRemoveAllRecordChorusDataReadyObserver(this.nativeStannis);
       }else if(p1 == 2){
          this.nativeRemoveAllRecordChorusWithoutRxDataReady(this.nativeStannis);
       }else if(p1 == 3){
          this.nativeRemoveAllRecordChorusOnlyRxDataReady(this.nativeStannis);
       }
       return;
    }
    public void RemoveRxStream(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "64")) {
          return;
       }
       this.nativeRemoveRxStream(this.nativeStannis, p0);
       return;
    }
    public void SetAudioFocusUser(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "66")) {
          return;
       }
       this.nativeSetAudioFocusUser(this.nativeStannis, p0);
       return;
    }
    public void SetRxStreamMixerGain(int p0,boolean p1,float p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Float.valueOf(p2), this, Stannis.class, "65")) {
          return;
       }
       this.nativeSetRxStreamMixerGain(this.nativeStannis, p0, p1, p2);
       return;
    }
    public final void StartLiveChat(int p0,int p1,DataReadyObserver p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, Stannis.class, "39")) {
          return;
       }
       this.nativeStartChat(this.nativeStannis, p0, p1, p2);
       this.nativeSetMuteChatOutBgm(this.nativeStannis, this.isChatBgmMuted);
       this.isChatStreamStarted = true;
       return;
    }
    public final void StartLiveChatWithNativePtr(int p0,int p1,long p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, Stannis.class, "40")) {
          return;
       }
       this.nativeStartChatWithNativeReceiver(this.nativeStannis, p0, p1, p2);
       this.nativeSetMuteChatOutBgm(this.nativeStannis, this.isChatBgmMuted);
       this.isChatStreamStarted = true;
       return;
    }
    public final void StartLiveStream(int p0,int p1,DataReadyObserver p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, Stannis.class, "35")) {
          return;
       }
       this.nativeStartLiveStream(this.nativeStannis, p0, p1, p2);
       this.nativeSetMuteLiveStreamOutBgm(this.nativeStannis, this.isLiveStreamBgmMuted);
       this.isLiveSteamStarted = true;
       return;
    }
    public final void StartLiveStreamWithNativePtr(int p0,int p1,long p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, Stannis.class, "36")) {
          return;
       }
       this.nativeStartLiveStreamWithNativeReceiver(this.nativeStannis, p0, p1, p2);
       this.nativeSetMuteLiveStreamOutBgm(this.nativeStannis, this.isLiveStreamBgmMuted);
       this.isLiveSteamStarted = true;
       return;
    }
    public final void StartLiveStreamWithNativePtrForHisense(long p0,long p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, stannis, "37")) {
          return;
       }
       this.isLiveSteamStarted = true;
       this.nativeStartLiveStreamWithNativeReceiverForHisense(this.nativeStannis, p0, p1);
       return;
    }
    public final void StopAllLiveChat(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "41")) {
          return;
       }
       this.nativeStopAllLiveChat(this.nativeStannis);
       this.isChatStreamStarted = false;
       return;
    }
    public final void StopAllStream(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "38")) {
          return;
       }
       this.nativeStopAllStream(this.nativeStannis);
       this.isLiveSteamStarted = false;
       this.isChatStreamStarted = false;
       return;
    }
    public void addAudioSceneObserver(StannisAudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "304")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] addAudioSceneObserver: "+p0);
       this.audioSceneObservers.add(p0);
       return;
    }
    public void addMixTrack(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "197")) {
          return;
       }
       this.nativeAddMixTrack(this.nativeStannis, p0);
       return;
    }
    public void cleanSoundEffectCache(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "160")) {
          return;
       }
       this.nativeCleanSoundEffectCache(this.nativeStannis);
       return;
    }
    public void clearAllAudioBuffer(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "188")) {
          return;
       }
       this.nativeClearAllAudioBuffer(this.nativeStannis);
       return;
    }
    public void clearAudioBuffer(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "187")) {
          return;
       }
       Stannis tnativeStann = this.nativeStannis;
       if (p0 == null) {
          p0 = "";
       }
       this.nativeClearAudioBuffer(tnativeStann, p0);
       return;
    }
    public void disableDataRecevierWithNativePtr(long p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, stannis, "54")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] disableDataRecevierWithNativePtr"+p0);
       this.nativeDisableDataRecevierWithNativePtr(this.nativeStannis, p0);
       return;
    }
    public void disableHeadphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "256")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] disableHeadphoneMonitor start");
       this.savedEnableHeadphoneMonitorForToB = false;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.closeDeviceHeaphoneMonitor();
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] disableHeadphoneMonitor end");
       return;
    }
    public void enableAecDump(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "194")) {
          return;
       }
       this.nativeEnableAecDump(this.nativeStannis, p0);
       return;
    }
    public int enableAttenuation(int p0,boolean p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, stannis, "77");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeEnableAttenuation(this.nativeStannis, p0, p1);
    }
    public boolean enableHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "255");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] enableHeadphoneMonitor start");
       Stannis stannis = null;
       this.savedEnableHeadphoneMonitorForToB = true;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          boolean b = tstannisAudi.isHeadsetConnected();
          boolean b1 = this.stannisAudioManager.isUsbConnected();
          if (b || b1) {
             stannis = this.stannisAudioManager.openDeviceHeaphoneMonitor();
          }else {
             Log.i("Stannis", "[KWStannis] enableHeadphoneMonitor failed, isConnectHeadset = "+b+", isConnectUsb = "+b1);
          }
       }else {
          Log.w("Stannis", "[KWStannis] enableHeadphoneMonitor stannisAudioManager is null");
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] enableHeadphoneMonitor end");
       return stannis;
    }
    public boolean enableHeadphoneMonitor(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, stannis, "254");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.enableHeadphoneMonitor();
    }
    public void enableLocalRecord(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "86")) {
          return;
       }
       this.enableRecord(p0, false);
       return;
    }
    public void enableMixingAudioSegment(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "214")) {
          return;
       }
       this.nativeEnableMixingAudioSegment(this.nativeStannis, p0);
       return;
    }
    public void enableRecord(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "85")) {
          return;
       }
       this.enableRecord(p0, true);
       return;
    }
    public void enableRecord(boolean p0,boolean p1){
       Stannis tstannisAudi;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, stannis, "87")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] enableRecord start: "+p0);
       if (this.audioRecordEnabled == p0) {
          Log.i("Stannis", "[KWStannis] record already enabled!");
          stannis = 1;
       }else {
          stannis = null;
       }
       this.audioRecordEnabled = p0;
       if (this.audioRecordStartedByUser != null && !stannis) {
          this.audioManagerLock.lock();
          if (this.audioRecordEnabled != null) {
             tstannisAudi = this.stannisAudioManager;
             if (tstannisAudi != null) {
                this.resetRecordMode = 0;
                Log.i("Stannis", "[KWStannis] enableRecord resetRecordMode revert to default");
                if (!tstannisAudi.startRecording(this.audioDeviceScene, 0)) {
                   Log.e("Stannis", "[KWStannis] enableRecord startRecording failed");
                }else {
                   Log.i("Stannis", "[KWStannis] report record state enable"+this.deviceStatusObserver);
                   tstannisAudi = this.deviceStatusObserver;
                   if (tstannisAudi != null) {
                      tstannisAudi.onAudioDeviceStatusChange(9);
                   }
                }
             }
          }else {
             stannis = this.stannisAudioManager;
             if (stannis != null) {
                if (!stannis.stopRecording(p1)) {
                   Log.e("Stannis", "[KWStannis] enableRecord stopRecording failed");
                }else {
                   Log.i("Stannis", "[KWStannis] report record state disable"+this.deviceStatusObserver);
                   tstannisAudi = this.deviceStatusObserver;
                   if (tstannisAudi != null) {
                      tstannisAudi.onAudioDeviceStatusChange(8);
                   }
                }
             }
          }
          this.audioManagerLock.unlock();
       }
       this.audioManagerLock.lock();
       tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.SetEnableRecordState(p0);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] enableRecord end");
       return;
    }
    public void enableRecordWithAEC(boolean p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, stannis, "88")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] enableRecordWithAEC start: "+p0+", aec: "+p1);
       this.enableRecord(p0, false);
       this.nativeSetSoftAecMode(this.nativeStannis, p1);
       return;
    }
    public int enableSpatializer(int p0,boolean p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, stannis, "78");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeEnableSpatializer(this.nativeStannis, p0, p1);
    }
    public void fetchRawAudio(byte[] p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "269")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.nativeFetchRawAudio(this.nativeStannis, p0, p1, p2, p3);
       }else {
          Log.w("Stannis", "[KWStannis] fetchRawAudio !isPipeLineStarted");
       }
       return;
    }
    public int[] getActiveSpeakers(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetActiveSpeakers(this.nativeStannis);
    }
    public int getAsrAcousticModelVersion(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "217");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetAsrAcousticModelVersion(this.nativeStannis);
    }
    public int getAsrCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "222");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetAsrCurrentPosition(this.nativeStannis);
    }
    public int getAudioOutputRouting(){
       Stannis tstannisAudi;
       Object obj = PatchProxy.apply(null, this, Stannis.class, "290");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = -1;
       int outputType = this.getOutputType();
       this.audioManagerLock.lock();
       int i = 1;
       int i1 = 2;
       if (outputType == 3) {
          tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             b = (tstannisAudi.isHeadphoneWithMic())? 0: 2;
             tstannisAudi = 1;
          label_0034 :
             this.audioManagerLock.unlock();
             if (tstannisAudi) {
                return b;
             }else if(!outputType){
                Log.d("Stannis", "[KWStannis] ouputType: KWStannisOutputTypeAuto");
                outputType = this.getAudioPlugin(this.audioDeviceScene);
                this.audioManagerLock.lock();
                if (outputType == 0x20000) {
                   Stannis tstannisAudi1 = this.stannisAudioManager;
                   if (tstannisAudi1 != null) {
                      if (tstannisAudi1.isHeadphoneWithMic()) {
                         i1 = 0;
                      }
                      b = i1;
                   label_0062 :
                      this.audioManagerLock.unlock();
                      if (i != null) {
                         return b;
                      }else {
                         return Stannis.AUDIO_PLUGIN_ROUTER_MAP.get(Integer.valueOf(outputType)).intValue();
                      }
                   }
                }
                i = tstannisAudi;
                goto label_0062 ;
             }else {
                return Stannis.AUDIO_OUTPUT_ROUTER_MAP.get(Integer.valueOf(outputType)).intValue();
             }
          }
       }
       tstannisAudi = null;
       goto label_0034 ;
    }
    public final int getAudioPlugin(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "266");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0x10000;
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          i = tstannisAudi.getPlugin(p0);
       }
       return i;
    }
    public final String getAudioRecrodingDeviceName(){
       Stannis obj = PatchProxy.apply(null, this, Stannis.class, "267");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.stannisAudioManager;
       if (obj != null) {
          return obj.getCurRecordingDeviceName();
       }
       return "unkown";
    }
    public float[] getAutoMixEQFeature(){
       float[] obj = PatchProxy.apply(null, this, Stannis.class, "205");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.nativeGetAutoMixEQFeature(this.nativeStannis);
       if (obj != null && obj.length == 16) {
          return obj;
       }
       obj = new float[16];
       for (int i = 0; i < 16; i = i + 1) {
          obj[i] = 0;
       }
       return obj;
    }
    public float[][] getAutoMixFeature(){
       float[][] obj = PatchProxy.apply(null, this, Stannis.class, "202");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Array.newInstance(float.class, new int[2]{2,20});
       float[] uofloatArray = this.nativeGetAutoMixBgmFeature(this.nativeStannis);
       float[] uofloatArray1 = this.nativeGetAutoMixVocalFeature(this.nativeStannis);
       int i = 0;
       int i1 = 0;
       if (uofloatArray.length == 20) {
          for (int i2 = 0; i2 < 20; i2 = i2 + 1) {
             obj[i1][i2] = uofloatArray[i2];
          }
       }else {
          for (int i3 = 0; i3 < 20; i3 = i3 + 1) {
             obj[i1][i3] = i;
          }
       }
       if (uofloatArray1.length == 20) {
          for (; i1 < 20; i1 = i1 + 1) {
             obj[1][i1] = uofloatArray1[i1];
          }
       }else {
          for (; i1 < 20; i1 = i1 + 1) {
             obj[1][i1] = i;
          }
       }
       return obj;
    }
    public float[] getAutoTuneFeatures(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "213");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetAutoTuneFeatures(this.nativeStannis);
    }
    public int getBgmOffsetByRecordPts(long p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, stannis, "158");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeGetBgmOffsetByRecordPts(this.nativeStannis, p0);
    }
    public double getCalculateDeepAECSNR(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "247");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.nativeGetCalculateDeepAECSNR(this.nativeStannis);
    }
    public int getCpuPercent(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetCpuPercent(this.nativeStannis);
    }
    public StannisDeviceInfo getCurrentDevice(int p0){
       StannisDeviceInfo obj;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "293");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          obj = tstannisAudi.getCurrentDevice(p0);
       }
       this.audioManagerLock.unlock();
       return obj;
    }
    public String getDeviceModel(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetDeviceModel(this.nativeStannis);
    }
    public StannisDeviceInfo[] getDevices(int p0){
       StannisDeviceInfo[] obj;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "292");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          obj = tstannisAudi.getDevices(p0);
       }
       this.audioManagerLock.unlock();
       return obj;
    }
    public int getDurationOfEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "175");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeGetDurationOfEffect(this.nativeStannis, p0);
    }
    public int getEffectCurrentPosition(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "177");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeGetEffectCurrentPosition(this.nativeStannis, p0);
    }
    public int getEffectDuration(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Stannis.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetEffectDuration(this.nativeStannis, p0);
    }
    public double getEffectsVolume(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "180");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.nativeGetEffectsVolume(this.nativeStannis);
    }
    public int getKaraokeAverageScore(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "239");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetKaraokeAverageScore(this.nativeStannis);
    }
    public int[] getKaraokeLastScore(){
       int[] obj = PatchProxy.apply(null, this, Stannis.class, "232");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.nativeGetKaraokeLastScore(this.nativeStannis);
       if (obj == null || obj.length != 2) {
          return new int[2]{-1,-1};
       }
       return obj;
    }
    public int[] getKaraokeLastScoreForHisense(){
       int[] obj = PatchProxy.apply(null, this, Stannis.class, "233");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.nativeGetKaraokeLastScoreForHisense(this.nativeStannis);
       if (obj == null || obj.length != 5) {
          return new int[5]{-1,-1,-1,-1,-1};
       }
       return obj;
    }
    public void getKaraokeLastScoreForHisenseWhenPauseWithinDataLength(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "234")) {
          return;
       }
       this.nativeGetKaraokeLastScoreForHisenseWhenPauseWithinDataLength(this.nativeStannis);
       return;
    }
    public int getKaraokeScoreMidi(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "238");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetKaraokeScoreMidi(this.nativeStannis);
    }
    public int getKaraokeScorePitch(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "236");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetKaraokeScorePitch(this.nativeStannis);
    }
    public int getKaraokeTotalScore(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "235");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetKaraokeTotalScore(this.nativeStannis);
    }
    public List getKaraokeVadDurationResult(int p0){
       ArrayList obj;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "281");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       int[] ointArray = new int[p0];
       p0 = this.nativeGetKaraokeVadDurationResult(this.nativeStannis, ointArray, p0);
       for (int i = 0; i < p0; i = i + 1) {
          obj.add(Integer.valueOf(ointArray[i]));
       }
       return obj;
    }
    public void getLastAsrResult(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "221")) {
          return;
       }
       this.nativeGetLastAsrResult(this.nativeStannis);
       return;
    }
    public int getMemoryKBytes(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetMemoryKBytes(this.nativeStannis);
    }
    public int getOutputType(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "289");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.d("Stannis", "[KWStannis] getOutputType start");
       int i = 0;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          i = tstannisAudi.getOutputType();
       }
       this.audioManagerLock.unlock();
       Log.d("Stannis", "[KWStannis] getOutputType ="+i+"end");
       return i;
    }
    public int[] getOutputTypes(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, Stannis.class, "291");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.d("Stannis", "[KWStannis] getOutputTypes start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          objArray = tstannisAudi.getOutputTypes();
       }
       this.audioManagerLock.unlock();
       Log.d("Stannis", "[KWStannis] getOutputTypes end");
       return objArray;
    }
    public int getPlayBackCallbackOffset(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "319");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          i = tstannisAudi.getPlayBackCallbackOffset();
       }
       this.audioManagerLock.unlock();
       return i;
    }
    public QosInfo getQosInfo(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getQosInfo(0);
    }
    public QosInfo getQosInfo(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.nativeUploadSpeakerDeviceVolume(this.nativeStannis, this.getSpeakerDeviceVolume());
       return this.nativeGetQosInfo(this.nativeStannis, p0);
    }
    public int getRecordDelay(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "276");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetRecordDelay(this.nativeStannis);
    }
    public long getRecordSketchLatency(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "318");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.recordSketchIntervalEnd - this.recordSketchIntervalBegin) + (long)this.nativeGetRoundTripLatency(this.nativeStannis);
       Log.i("Stannis", "recordSketchLatency: "+l);
       return l;
    }
    public int getRenderEnergy(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetRenderEnergy(this.nativeStannis);
    }
    public float[] getSongSectionScore(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "245");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetSongSectionScore(this.nativeStannis);
    }
    public int getSpeakerDeviceVolume(){
       int speakerDevic;
       Stannis obj = PatchProxy.apply(null, this, Stannis.class, "287");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = -1;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          speakerDevic = tstannisAudi.getSpeakerDeviceVolume(this.audioDeviceScene);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] getSpeakerDeviceVolume end, volume"+speakerDevic);
       return speakerDevic;
    }
    public StannisAudioManagerInterface getStannisAudioManager(){
       return this.stannisAudioManager;
    }
    public Stannis$KWStannisConfig getStannisConfig(){
       return this.audio_confg;
    }
    public MicrophoneInfo getStannisMicrophoneInfo(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "315");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetMicrophoneInfo(this.nativeStannis);
    }
    public String getStannisVersion(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetStannisVersion();
    }
    public String getStannisVersionExt(){
       return "";
    }
    public String getTips(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetTips(this.nativeStannis);
    }
    public float[] getVocalBgmPithSequence(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "210");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetPitchSequence(this.nativeStannis);
    }
    public int getVocalBgmShiftMs(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "209");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetVocalBgmShiftMs(this.nativeStannis);
    }
    public int getVoiceEnergy(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeGetVoiceEnergy(this.nativeStannis, p0);
    }
    public int getVoiceGain(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeGetVoiceGain(this.nativeStannis, p0);
    }
    public double getVolumeOfEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "181");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return this.nativeGetVolumeOfEffect(this.nativeStannis, p0);
    }
    public void init(Context p0,StannisQosObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "10")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] init start");
       this.context = p0;
       ContextUtils.initialize(p0);
       this.qosObserver = p1;
       this.initInternal();
       this.nativeInitStannis(this.nativeStannis, null);
       this.initAudioManager(null);
       Log.i("Stannis", "[KWStannis] init end");
       return;
    }
    public final void initAudioManager(StannisNotifyObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "9")) {
          return;
       }
       this.audioManagerLock.lock();
       if (this.stannisAudioManager == null) {
          ApplicationInfo packageName = this.context.getApplicationInfo().packageName;
          String str = "com.kwai.hisense";
          if (!str.equalsIgnoreCase(packageName) && (("com.xiaosenmusic.sedna").equalsIgnoreCase(packageName) || str.equalsIgnoreCase(Stannis.testAppName))) {
             HisenseAudioManager hisenseAudio = new HisenseAudioManager(this.context, Stannis.executorService, this.nativeStannis, p0);
             this.stannisAudioManager = str;
             Log.i("Stannis", "[KWStannis] AudioManager use "+packageName+" implementation");
          }else {
             StannisAudioManager stannisAudio = new StannisAudioManager(this.context, Stannis.executorService, this.nativeStannis, p0);
             this.stannisAudioManager = str;
             Log.i("Stannis", "[KWStannis] AudioManager use default implementation");
             if (("com.kwai.library.meeting").equalsIgnoreCase(packageName)) {
                Log.i("Stannis", "[KWStannis] AudioManager use kwaimeeting");
                this.stannisAudioManager.setDefaultToReceiver(true);
             }
          }
          this.stannisAudioManager.addAudioTelephoneObserver();
          this.stannisAudioManager.setSpeakerOn(this.userSetSpeakerOn);
       }
       this.audioManagerLock.unlock();
       return;
    }
    public final void initInternal(){
       this.isLiveSteamStarted = false;
       this.isChatStreamStarted = false;
       this.isAudioDeviceStarted = false;
       this.isPipeLineStarted = false;
       this.muteType = 0;
    }
    public long initStannisEngine(Context p0,StannisQosObserver p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Stannis.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       _monitor_enter(this);
       long l = this.userId + 1;
       this.userId = l;
       Log.i("Stannis", "[KWStannis] initStannisEngine with userId"+l);
       this.audioManagerLock.lock();
       if (this.stannisAudioManager == null) {
          Log.i("Stannis", "[KWStannis] stannisAudioManager not exist,in uninit state, userId"+l);
          this.init(p0, p1);
       }
       this.audioManagerLock.unlock();
       this.userIdSet.add(new Long(l));
       Log.i("Stannis", "[KWStannis] initStannisEngine : userId count:"+this.userIdSet.size());
       _monitor_exit(this);
       return l;
    }
    public long initStannisEngineWithNotifyObserver(Context p0,StannisQosObserver p1,StannisNotifyObserver p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Stannis.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       _monitor_enter(this);
       long l = this.userId + 1;
       this.userId = l;
       Log.i("Stannis", "[KWStannis] initStannisEngineWithNotifyObserver with notifyObserver:"+p2+", and userId:"+l);
       if (this.userIdSet.isEmpty()) {
          this.initWithNotifyObserver(p0, p1, p2);
       }
       this.userIdSet.add(new Long(l));
       Log.i("Stannis", "[KWStannis] initStannisEngineWithNotifyObserver : userId count:"+this.userIdSet.size());
       _monitor_exit(this);
       return l;
    }
    public void initWithNotifyObserver(Context p0,StannisQosObserver p1,StannisNotifyObserver p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Stannis.class, "12")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] initWithNotifyObserver start");
       this.context = p0;
       ContextUtils.initialize(p0);
       this.qosObserver = p1;
       this.notifyObserver = new Stannis$1(this, p2);
       this.initInternal();
       this.nativeInitStannis(this.nativeStannis, this.notifyObserver);
       this.initAudioManager(p2);
       Log.i("Stannis", "[KWStannis] initWithNotifyObserver end");
       return;
    }
    public void inputPcmPlay(byte[] p0,int p1,int p2,int p3,long p4){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "191")) {
             return;
          }
       }
       this.nativeInputPcmPlay(stannis.nativeStannis, p0, p1, p2, p3, p4);
       return;
    }
    public void inputRawAudio(byte[] p0,int p1,int p2,int p3,long p4){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "268")) {
             return;
          }
       }
       this.nativeInputRawAudio(stannis.nativeStannis, p0, p1, p2, p3, p4);
       return;
    }
    public void inputSpeakerAudio(byte[] p0,int p1,int p2,int p3,long p4){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "302")) {
             return;
          }
       }
       this.nativeInputSpeakerData(stannis.nativeStannis, p0, p1, p2, p3, p4);
       return;
    }
    public void inputTrackData(int p0,byte[] p1,int p2,int p3,int p4,long p5){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, stannis1, "199")) {
             return;
          }
       }
       this.nativeInputTrackData(stannis.nativeStannis, p0, p1, p2, p3, p4, p5);
       return;
    }
    public boolean isEnableAudioQualityEstimation(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "108");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsEnableAudioQualityEstimation(this.nativeStannis);
    }
    public boolean isEnableCommonDenoise(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsEnableCommonDenoise(this.nativeStannis);
    }
    public boolean isEnableHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "260");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          b = tstannisAudi.isEnableHeadphoneMonitor();
       }
       this.audioManagerLock.unlock();
       return b;
    }
    public boolean isHiFiMusicMode(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "114");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsHiFiMusicMode(this.nativeStannis);
    }
    public boolean isInited(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsStannisInited(this.nativeStannis);
    }
    public boolean isRenderMute(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "286");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsRenderMute(this.nativeStannis);
    }
    public boolean isSpeakerOn(){
       boolean speakerOn;
       Stannis obj = PatchProxy.apply(null, this, Stannis.class, "284");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.userSetSpeakerOn;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          speakerOn = tstannisAudi.getSpeakerOn();
       }
       this.audioManagerLock.unlock();
       speakerOn = (speakerOn && 3 == this.getAudioOutputRouting())? true: false;
       return speakerOn;
    }
    public boolean isSupportHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "251");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] isSupportHeadphoneMonitor start");
       boolean b = false;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          b = tstannisAudi.isSupportHeaphoneMonitor();
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] isSupportHeadphoneMonitor end");
       return b;
    }
    public boolean isSupportHeadphoneMonitor(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, stannis, "250");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isSupportHeadphoneMonitor();
    }
    public boolean isSupportSoftHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "253");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] isSupportSoftHeadphoneMonitor start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       boolean b = false;
       if (tstannisAudi != null && !tstannisAudi.isSupportVendorHeadphoneMonitor()) {
          b = this.stannisAudioManager.isSupportHeaphoneMonitor();
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] isSupportSoftHeadphoneMonitor end");
       return b;
    }
    public boolean isSupportVendorHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "252");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] isSupportVendorHeadphoneMonitor start");
       boolean b = false;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          b = tstannisAudi.isSupportVendorHeadphoneMonitor();
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] isSupportVendorHeadphoneMonitor end");
       return b;
    }
    public List karaokeVadGetResult(int p0){
       ArrayList obj;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "280");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       int[] ointArray = new int[p0];
       p0 = this.nativeKaraokeVadGetResult(this.nativeStannis, ointArray, p0);
       for (int i = 0; i < p0; i = i + 1) {
          obj.add(Integer.valueOf(ointArray[i]));
       }
       return obj;
    }
    public boolean karaokeVadRowJump(int p0,long p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, stannis, "282");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeKaraokeVadRowJump(this.nativeStannis, p0, p1);
    }
    public void loadSoundEffectCache(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "159")) {
          return;
       }
       this.nativeLoadSoundEffectCache(this.nativeStannis, p0);
       return;
    }
    public native final void nativeAddBypassDataReadyObserver(long p0,DataReadyObserver p1);
    public native final void nativeAddLiveChatMixBgmStream(long p0,int p1,int p2,DataReadyObserver p3);
    public native final void nativeAddLiveChatMixBgmStreamWithNativeReceiver(long p0,int p1,int p2,long p3);
    public native final void nativeAddMixTrack(long p0,int p1);
    public native final void nativeAddRecordChorusDataReadyObserver(long p0,DataReadyObserver p1);
    public native final void nativeAddRecordChorusOnlyRxDataReady(long p0,DataReadyObserver p1);
    public native final void nativeAddRecordChorusWithoutRxDataReady(long p0,DataReadyObserver p1);
    public native final void nativeAddRxStream(long p0,int p1,DataProviderObserver p2,int p3,int p4,boolean p5);
    public native final void nativeAddRxStreamWithNativeDataProvider(long p0,int p1,long p2,int p3,int p4,boolean p5);
    public native final void nativeAddRxStreamWithNativeDataProviderWithType(long p0,int p1,long p2,int p3,int p4,boolean p5,int p6);
    public native final void nativeAddTxVoiceEnergy(long p0);
    public native int nativeAudioProcessBpmDetect(long p0,byte[] p1,int p2);
    public native long nativeAudioProcessCreateAgcInterface(int p0,int p1);
    public native long nativeAudioProcessCreateDspInterface(int p0,int p1);
    public native long nativeAudioProcessCreateTempoInterface(int p0,int p1);
    public native long nativeAudioProcessCreateTimbreInterface(int p0,int p1);
    public native void nativeAudioProcessData(long p0,long p1,long p2,byte[] p3,int p4);
    public native void nativeAudioProcessDestroyAgcInterface(long p0);
    public native void nativeAudioProcessDestroyDspInterface(long p0);
    public native void nativeAudioProcessDestroyTempoInterface(long p0);
    public native void nativeAudioProcessDestroyTimbreInterface(long p0);
    public native void nativeAudioProcessSetAgcParam(long p0,int p1,int p2,int p3,int p4,int p5);
    public native void nativeAudioProcessSetDspParam(long p0,int p1,int p2);
    public native void nativeAudioProcessSetTempo(long p0,float p1);
    public native void nativeAudioProcessSetTempoRate(long p0,float p1);
    public native void nativeAudioProcessSetVcoParameters(long p0,Stannis$AudioChangeParam p1);
    public native void nativeAudioProcessSetVocalParam(long p0,int p1);
    public native int nativeAudioProcessTempoProcess(long p0,byte[] p1,int p2);
    public native final void nativeCleanSoundEffectCache(long p0);
    public native final void nativeClearAllAudioBuffer(long p0);
    public native final void nativeClearAudioBuffer(long p0,String p1);
    public native final long nativeCreateHisenseDataReadyReceiver(long p0,String p1);
    public native final long nativeCreateStannis(int p0);
    public native final void nativeDisableDataRecevierWithNativePtr(long p0,long p1);
    public native final void nativeEnableAecDump(long p0,boolean p1);
    public native final int nativeEnableAttenuation(long p0,int p1,boolean p2);
    public native final void nativeEnableMixingAudioSegment(long p0,boolean p1);
    public native void nativeEnableMonitorDebug(long p0,boolean p1);
    public native final void nativeEnableRecordAutoResume(long p0,boolean p1,int p2,int p3);
    public native final int nativeEnableSpatializer(long p0,int p1,boolean p2);
    public native final void nativeFetchRawAudio(long p0,byte[] p1,int p2,int p3,int p4);
    public native final int[] nativeGetActiveSpeakers(long p0);
    public native final int nativeGetAsrAcousticModelVersion(long p0);
    public native final int nativeGetAsrCurrentPosition(long p0);
    public native final float[] nativeGetAutoMixBgmFeature(long p0);
    public native final float[] nativeGetAutoMixEQFeature(long p0);
    public native final float[] nativeGetAutoMixVocalFeature(long p0);
    public native final float[] nativeGetAutoTuneFeatures(long p0);
    public native final int nativeGetBgmOffsetByRecordPts(long p0,long p1);
    public native final double nativeGetCalculateDeepAECSNR(long p0);
    public native final boolean nativeGetConfig(long p0,int p1,boolean p2,int p3,Stannis$KWStannisConfig p4);
    public native final String nativeGetCpuInfo();
    public native final int nativeGetCpuPercent(long p0);
    public native final String nativeGetDeviceModel(long p0);
    public native final int nativeGetDurationOfEffect(long p0,int p1);
    public native final int nativeGetEffectCurrentPosition(long p0,int p1);
    public native final int nativeGetEffectDuration(long p0,String p1);
    public native final double nativeGetEffectsVolume(long p0);
    public native final boolean nativeGetIsAudioChatEnable(long p0);
    public native final boolean nativeGetIsLiveStreamEnable(long p0);
    public native final int nativeGetKaraokeAverageScore(long p0);
    public native final int[] nativeGetKaraokeLastScore(long p0);
    public native final int[] nativeGetKaraokeLastScoreForHisense(long p0);
    public native final void nativeGetKaraokeLastScoreForHisenseWhenPauseWithinDataLength(long p0);
    public native final int nativeGetKaraokeScoreMidi(long p0);
    public native final int nativeGetKaraokeScorePitch(long p0);
    public native final int nativeGetKaraokeTotalScore(long p0);
    public native final int nativeGetKaraokeVadDurationResult(long p0,int[] p1,int p2);
    public native final void nativeGetLastAsrResult(long p0);
    public native final int nativeGetMemoryKBytes(long p0);
    public native final MicrophoneInfo nativeGetMicrophoneInfo(long p0);
    public native final float[] nativeGetPitchSequence(long p0);
    public native final QosInfo nativeGetQosInfo(long p0,int p1);
    public native final int nativeGetRecordDelay(long p0);
    public native final int nativeGetRenderEnergy(long p0);
    public native final int nativeGetRoundTripLatency(long p0);
    public native final float[] nativeGetSongSectionScore(long p0);
    public native final String nativeGetStannisVersion();
    public native final String nativeGetTips(long p0);
    public native final int nativeGetVocalBgmShiftMs(long p0);
    public native final int nativeGetVoiceEnergy(long p0,int p1);
    public native final int nativeGetVoiceGain(long p0,int p1);
    public native final double nativeGetVolumeOfEffect(long p0,int p1);
    public native final void nativeInitStannis(long p0,StannisNotifyObserver p1);
    public native final void nativeInputPcmPlay(long p0,byte[] p1,int p2,int p3,int p4,long p5);
    public native final void nativeInputRawAudio(long p0,byte[] p1,int p2,int p3,int p4,long p5);
    public native final void nativeInputSpeakerData(long p0,byte[] p1,int p2,int p3,int p4,long p5);
    public native final void nativeInputTrackData(long p0,int p1,byte[] p2,int p3,int p4,int p5,long p6);
    public native final boolean nativeIsEnableAudioQualityEstimation(long p0);
    public native final boolean nativeIsEnableCommonDenoise(long p0);
    public native final boolean nativeIsHiFiMusicMode(long p0);
    public native final boolean nativeIsRenderMute(long p0);
    public native final boolean nativeIsStannisInited(long p0);
    public native final int nativeKaraokeVadGetResult(long p0,int[] p1,int p2);
    public native final boolean nativeKaraokeVadRowJump(long p0,int p1,long p2);
    public native final void nativeLoadSoundEffectCache(long p0,String p1);
    public native final void nativeOnBackground();
    public native final void nativeOnForeground();
    public native final void nativePause(long p0);
    public native final int nativePauseAllEffects(long p0);
    public native final void nativePauseAsr(long p0);
    public native final void nativePauseAudioBuffer(long p0);
    public native final void nativePauseBgm(long p0);
    public native final int nativePauseEffect(long p0,int p1);
    public native final void nativePlayAudioBuffer(long p0,String p1,byte[] p2,int p3,float p4,boolean p5,AudioBufferPlayObserver p6);
    public native final int nativePlayEffect(long p0,int p1,String p2,int p3,double p4,boolean p5,int p6,SoundEffectObserver p7);
    public native final void nativePlaySoundEffect(long p0,String p1,BgmObserver p2);
    public native final int nativePreloadEffect(long p0,int p1,String p2);
    public native int nativeRegisterAudioFrameObserver(long p0,AudioFrameObserverWrapper p1);
    public native int nativeRegisterAudioInfoObserver(long p0,AudioInfoObserverWrapper p1);
    public native final void nativeRemoveAllRecordChorusDataReadyObserver(long p0);
    public native final void nativeRemoveAllRecordChorusOnlyRxDataReady(long p0);
    public native final void nativeRemoveAllRecordChorusWithoutRxDataReady(long p0);
    public native final void nativeRemoveBypassDataReadyObserver(long p0);
    public native final void nativeRemoveLiveChatMixBgmStream(long p0,int p1);
    public native final void nativeRemoveMixTrack(long p0,int p1);
    public native final void nativeRemoveRxStream(long p0,int p1);
    public native final void nativeRemoveTxVoiceEnergy(long p0);
    public native final void nativeResetPcmPlay(long p0);
    public native final void nativeResume(long p0);
    public native final int nativeResumeAllEffects(long p0);
    public native final void nativeResumeAudioBuffer(long p0,boolean p1);
    public native final void nativeResumeBgm(long p0);
    public native final int nativeResumeEffect(long p0,int p1);
    public native final void nativeSeekAsr(long p0,int p1);
    public native final void nativeSeekBgm(long p0,int p1);
    public native final void nativeSetAecFarendCompressorGain(long p0,float p1);
    public native final void nativeSetAgcMode(long p0,int p1);
    public native final boolean nativeSetAsrLanguageModel(long p0,String p1,int p2);
    public native final void nativeSetAudioEffectAutotune(long p0,boolean p1,int p2,int p3);
    public native final void nativeSetAudioEffectParam(long p0,boolean p1,Stannis$KWStannisAudioEffectParam p2);
    public native final void nativeSetAudioFocusUser(long p0,ArrayList p1);
    public native final void nativeSetAudioInputVolume(long p0,float p1);
    public native final int nativeSetAudioRecvRange(long p0,int p1);
    public native final void nativeSetAudioRxVolume(long p0,int p1,float p2);
    public native final void nativeSetAudioScenario(long p0,int p1);
    public native final void nativeSetAudioTeamConference(long p0,int p1);
    public native final int nativeSetAudioTunnel(long p0,int p1);
    public native final void nativeSetAutoMixLyrics(long p0,String p1);
    public native final void nativeSetAutoMixSeekTime(long p0,int p1);
    public native final void nativeSetBgmAutoSeekEnable(long p0,boolean p1);
    public native final void nativeSetBgmGuidanceType(long p0,int p1);
    public native final void nativeSetBgmLocalFadeGain(long p0,float p1);
    public native final void nativeSetBgmPitch(long p0,int p1);
    public native final void nativeSetBgmPitchAlgorithm(long p0,boolean p1);
    public native final void nativeSetBgmRemoteFadeGain(long p0,float p1);
    public native final void nativeSetBgmVolume(long p0,float p1);
    public native final void nativeSetCaeModelPath(long p0,String p1);
    public native final void nativeSetCommonDenoiseEnableSuperWideBand(long p0,boolean p1);
    public native final void nativeSetCommonDenoiseModelPath(long p0,String p1);
    public native final void nativeSetDeepAECModelPath(long p0,String p1);
    public native final int nativeSetEffectPosition(long p0,int p1,int p2);
    public native final int nativeSetEffectsVolume(long p0,double p1);
    public native final void nativeSetEnableAudioQualityEstimation(long p0,boolean p1,String p2,String p3);
    public native final void nativeSetEnableAutoMixProcess(long p0,boolean p1,int p2);
    public native final void nativeSetEnableCaeProcess(long p0,boolean p1);
    public native final void nativeSetEnableCalculateDeepAECSNR(long p0,boolean p1);
    public native final void nativeSetEnableCommonDenoise(long p0,boolean p1);
    public native final void nativeSetEnableDeepAEC(long p0,boolean p1);
    public native final void nativeSetEnableDeepDereverb(long p0,boolean p1,String p2);
    public native final void nativeSetEnableDeepNs(long p0,boolean p1,String p2);
    public native final void nativeSetEnableDelayMix(long p0,boolean p1,boolean p2);
    public native final void nativeSetEnableNoiseSuppression(long p0,boolean p1);
    public native final void nativeSetEnableSpeakerInput(long p0,boolean p1,int p2);
    public native final void nativeSetEnableSprayDenoise(long p0,boolean p1);
    public native final void nativeSetGuidanceVolume(long p0,float p1);
    public native final void nativeSetHiFiMusicMode(long p0,boolean p1);
    public native final void nativeSetHiFiMusicModeValue(long p0,boolean p1);
    public native final void nativeSetHowlingSuppressionMode(long p0,int p1);
    public native final void nativeSetHowlingSuppressionMultipleDevice(long p0,boolean p1);
    public native final int nativeSetHrtfMode(long p0,int p1,int p2);
    public native final int nativeSetHrtfModelPath(long p0,String p1);
    public native final void nativeSetKaraokeParamAlphas(long p0,float p1,float p2);
    public native final void nativeSetKaraokeParamTimeScoreParamC(long p0,float p1);
    public native final void nativeSetKaraokeScoreAecLevel(long p0,int p1,String p2);
    public native final boolean nativeSetKaraokeScorePitch(long p0,int p1);
    public native final void nativeSetLocalVoiceEqualization(long p0,int p1,int p2);
    public native final void nativeSetLowLatencyKtvScenario(long p0,boolean p1);
    public native final void nativeSetMicPopDeepNsModelPath(long p0,String p1);
    public native final void nativeSetMixWithOtherAudio(long p0,boolean p1);
    public native int nativeSetMixedAudioFrameParameters(long p0,int p1,int p2,int p3,int p4);
    public native final void nativeSetMuteBgm(long p0,boolean p1);
    public native final void nativeSetMuteChatOutBgm(long p0,boolean p1);
    public native final void nativeSetMuteLiveStreamOutBgm(long p0,boolean p1);
    public native final void nativeSetMuteMicrophone(long p0,int p1);
    public native final void nativeSetMuteRemote(long p0,boolean p1);
    public native final void nativeSetMuteSoundEffect(long p0,boolean p1);
    public native final void nativeSetMuteSpeaker(long p0,boolean p1);
    public native final void nativeSetPcmPlayVolume(long p0,float p1);
    public native int nativeSetPlaybackAudioFrameParameters(long p0,int p1,int p2,int p3,int p4);
    public native final void nativeSetPreProcessVolume(long p0,float p1);
    public native int nativeSetRecordRawAudioFrameParameters(long p0,int p1,int p2,int p3,int p4);
    public native int nativeSetRecordingAudioFrameParameters(long p0,int p1,int p2,int p3,int p4);
    public native void nativeSetRegisterAudioInfoObserver(long p0,boolean p1);
    public native final void nativeSetRemoteBgmVolume(long p0,float p1);
    public native final void nativeSetRemoteMixVolume(long p0,float p1);
    public native final void nativeSetReverbLevel(long p0,int p1);
    public native final void nativeSetRoundTripLatency(long p0,int p1);
    public native final void nativeSetRxStreamMixerGain(long p0,int p1,boolean p2,float p3);
    public native final void nativeSetSampleRateForRecordFile(long p0,int p1);
    public native final void nativeSetSelfAudioTeamId(long p0,int p1);
    public native final void nativeSetSoftAecMode(long p0,int p1);
    public native final void nativeSetSongSectionStartEndTime(long p0,int[] p1);
    public native final void nativeSetSoundEffectVolume(long p0,float p1);
    public native final void nativeSetSpeakerOutputVolume(long p0,float p1);
    public native final void nativeSetSprayDenoiseModelPath(long p0,String p1);
    public native final void nativeSetStereoCaptureAndProcess(long p0,boolean p1);
    public native final void nativeSetVoiceEffectOption(long p0,int p1);
    public native final void nativeSetVoiceRoleOption(long p0,int p1);
    public native final void nativeSetVoiceVocal(long p0,int p1);
    public native final int nativeSetVolumeOfEffect(long p0,int p1,double p2);
    public native final void nativeStartAsrProcess(long p0);
    public native final void nativeStartAsrWorkshop(long p0,AsrObserver p1,String p2,int p3);
    public native final void nativeStartAutoTune(long p0);
    public native final boolean nativeStartBgm(long p0,ArrayList p1,ArrayList p2,int p3,int p4,boolean p5,long p6,long p7,ArrayList p8,BgmObserver p9,DataReadyObserver p10);
    public native final void nativeStartChat(long p0,int p1,int p2,DataReadyObserver p3);
    public native final void nativeStartChatWithNativeReceiver(long p0,int p1,int p2,long p3);
    public native final void nativeStartFingerprint(long p0,String p1,FingerprintObserver p2);
    public native final void nativeStartKaraokeScore(long p0,long p1,String p2,String p3,String p4,String p5,String p6,int p7,int p8,KaraokeScoreObserver p9);
    public native final void nativeStartKaraokeScoreWithMidiData(long p0,long p1,String p2,String p3,String p4,byte[] p5,String p6,int p7,int p8,long p9,int p10,int p11,KaraokeScoreObserver p12);
    public native final void nativeStartKaraokeVad(long p0,String p1);
    public native final void nativeStartLiveStream(long p0,int p1,int p2,DataReadyObserver p3);
    public native final void nativeStartLiveStreamWithNativeReceiver(long p0,int p1,int p2,long p3);
    public native final void nativeStartLiveStreamWithNativeReceiverForHisense(long p0,long p1,long p2);
    public native final void nativeStartMultipleStreamMix(long p0,DataReadyObserver p1);
    public native final void nativeStartPcmPlay(long p0);
    public native final void nativeStartPlayAudioSegment(long p0,String p1,String p2,AudioSegmentPlayerObserver p3);
    public native final void nativeStartRecordFile(long p0,String p1,RecordFileObserver p2,String p3);
    public native final void nativeStartRecordFileForHisense(long p0,String p1,RecordFileObserver p2,long p3,String p4);
    public native final void nativeStartSilenceGenerator(long p0);
    public native final void nativeStartSongSectionScore(long p0);
    public native final void nativeStartSongSectionScoreWorkshop(long p0,int p1,byte[] p2,long p3);
    public native final void nativeStartVocalBgmSync(long p0,String p1);
    public native final void nativeStartVocalBgmSyncByData(long p0,byte[] p1,int p2,int p3);
    public native final int nativeStopAllEffects(long p0);
    public native final void nativeStopAllLiveChat(long p0);
    public native final void nativeStopAllSoundEffects(long p0);
    public native final void nativeStopAllStream(long p0);
    public native final void nativeStopAsrProcess(long p0);
    public native final void nativeStopAsrWorkshop(long p0);
    public native final void nativeStopAudioRenderThread(long p0);
    public native final void nativeStopAutoTune(long p0);
    public native final void nativeStopBgm(long p0);
    public native final int nativeStopEffect(long p0,int p1);
    public native final void nativeStopFingerprint(long p0);
    public native final void nativeStopKaraokeScore(long p0);
    public native final void nativeStopKaraokeVad(long p0);
    public native final void nativeStopMultipleStreamMix(long p0);
    public native final void nativeStopPcmPlay(long p0);
    public native final void nativeStopPlayAudioSegment(long p0);
    public native final void nativeStopRecordFile(long p0,String p1,String p2);
    public native final void nativeStopRecordFileForHisense(long p0,String p1,long p2,String p3);
    public native final void nativeStopSilenceGenerator(long p0);
    public native final void nativeStopSongSectionScore(long p0);
    public native final void nativeStopSongSectionScoreWorkshop(long p0);
    public native final void nativeStopVocalBgmSync(long p0);
    public native final void nativeUninitStannis(long p0);
    public native final int nativeUnloadEffect(long p0,int p1);
    public native final boolean nativeUpdateBgmIndex(long p0,int p1,int p2);
    public native final int nativeUpdateSelfPosition(long p0,int[] p1,float[] p2,float[] p3,float[] p4);
    public native final void nativeUpdateServerConfig(long p0,Stannis$KWStannisServerConfig p1);
    public native final void nativeUploadSpeakerDeviceVolume(long p0,int p1);
    public final boolean needStartPipeline(int p0){
       if (this.isPipeLineStarted == null) {
          return true;
       }
       if (this.audioDeviceScene != p0) {
          return true;
       }
       return false;
    }
    public final void notifyAudioSceneChange(boolean p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, stannis, "306")) {
          return;
       }
       new Stannis$4(this, p0, p1).start();
       return;
    }
    public void notifyQAVSdkStarted(long p0){
    }
    public void notifyQAVSdkStopped(long p0){
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "263")) {
          return;
       }
       this.nativeOnBackground();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "264")) {
          return;
       }
       this.nativeOnForeground();
       return;
    }
    public final void onQosUpdated(int p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, stannis, "323")) {
          return;
       }
       stannis = this.qosObserver;
       if (stannis != null) {
          stannis.onQosEventUpdated(p0, p1);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "72")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.stopAudioDevice();
          this.nativePause(this.nativeStannis);
       }
       return;
    }
    public int pauseAllEffects(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativePauseAllEffects(this.nativeStannis);
    }
    public void pauseAsr(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "224")) {
          return;
       }
       this.nativePauseAsr(this.nativeStannis);
       return;
    }
    public void pauseAudioBuffer(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "185")) {
          return;
       }
       this.nativePauseAudioBuffer(this.nativeStannis);
       return;
    }
    public void pauseBgm(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "129")) {
          return;
       }
       this.nativePauseBgm(this.nativeStannis);
       return;
    }
    public int pauseEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "170");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativePauseEffect(this.nativeStannis, p0);
    }
    public void pauseRecord(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "83")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.stopRecordingByUser();
          this.nativeRemoveTxVoiceEnergy(this.nativeStannis);
       }
       return;
    }
    public void playAudioBuffer(String p0,byte[] p1,float p2,boolean p3,AudioBufferPlayObserver p4){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, stannis, "184")) {
             return;
          }
       }
       Stannis tnativeStann = this.nativeStannis;
       if (p0 == null) {
          p0 = "";
       }
       this.nativePlayAudioBuffer(tnativeStann, p0, p1, p1.length, p2, p3, p4);
       return;
    }
    public int playEffect(int p0,String p1,int p2,double p3,boolean p4,int p5,SoundEffectObserver p6){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Double.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, this, stannis1, "167");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativePlayEffect(stannis.nativeStannis, p0, p1, p2, (p3 / 100.00f), p4, p5, p6);
    }
    public void playSoundEffect(String p0,BgmObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "161")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.nativePlaySoundEffect(this.nativeStannis, p0, p1);
       }
       return;
    }
    public int preloadEffect(int p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, stannis, "165");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativePreloadEffect(this.nativeStannis, p0, p1);
    }
    public void prepareResource(ArrayList p0,int p1,int p2,long p3,long p4,long p5,BgmObserver p6){
       long this;
       Object obj = this;
       long l = p3;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, obj, stannis, "125")) {
             return;
          }
       }
       this.startPlayInternal(p0, null, p1, p2, true, p3, p4, null, p6, null);
       this = l + p5;
       if (this > 0 && (this - p4 < 0 || !p4)) {
          obj.seekBgm((int)this);
       }else if(l > 0 && (l - p4 <= 0 || !p4)){
          obj.seekBgm((int)l);
       }
       return;
    }
    public int registerAudioFrameObserver(AudioFrameObserver p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Stannis.class, "297");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.audioFrameObserverWrapper = (p0 == null)? null: new AudioFrameObserverWrapper(p0);
       return this.nativeRegisterAudioFrameObserver(this.nativeStannis, this.audioFrameObserverWrapper);
    }
    public int registerAudioInfoObserver(AudioInfoObserver p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Stannis.class, "295");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.audioInfoObserverWrapper = (p0 == null)? null: new AudioInfoObserverWrapper(p0);
       return this.nativeRegisterAudioInfoObserver(this.nativeStannis, this.audioInfoObserverWrapper);
    }
    public void removeAudioSceneObserver(StannisAudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "305")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] removeAudioSceneObserver: "+p0);
       this.audioSceneObservers.remove(p0);
       return;
    }
    public void removeMixTrack(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "198")) {
          return;
       }
       this.nativeRemoveMixTrack(this.nativeStannis, p0);
       return;
    }
    public final int resetAudioDevice(){
       return 0;
    }
    public void resetPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "192")) {
          return;
       }
       this.nativeResetPcmPlay(this.nativeStannis);
       return;
    }
    public void restartRecord(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "91")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] restartRecord start");
       this.audioManagerLock.lock();
       if (this.audioRecordStartedByUser != null) {
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.stopRecording();
             this.stannisAudioManager.startRecording(this.audioDeviceScene, p0);
          }
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] restartRecord end");
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "73")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.startAudioDevice(this.audioDeviceScene);
          this.nativeResume(this.nativeStannis);
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null && (tstannisAudi.isUserEnableHeadphoneMonitor() && HuaweiAudioKitHelper.isUseAudioKit())) {
             this.stannisAudioManager.openDeviceHeaphoneMonitor();
          }
       label_0034 :
          this.audioManagerLock.unlock();
       }
       return;
    }
    public int resumeAllEffects(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeResumeAllEffects(this.nativeStannis);
    }
    public void resumeAudioBuffer(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "186")) {
          return;
       }
       this.nativeResumeAudioBuffer(this.nativeStannis, p0);
       return;
    }
    public void resumeBgm(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "130")) {
          return;
       }
       this.nativeResumeBgm(this.nativeStannis);
       return;
    }
    public int resumeEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "172");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeResumeEffect(this.nativeStannis, p0);
    }
    public void resumeHeadphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "257")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] resumeHeadphoneMonitor start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.resumeDeviceHeadphoneMonitor(false);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] resumeHeadphoneMonitor end");
       return;
    }
    public void resumeRecord(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "84")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] resumeRecord start");
       if (this.isPipeLineStarted != null) {
          this.audioManagerLock.lock();
          if (this.stannisAudioManager != null) {
             this.startRecordingByUser(this.audioDeviceScene);
             this.stannisAudioManager.resetAudioProcess();
             this.nativeAddTxVoiceEnergy(this.nativeStannis);
          }
          this.audioManagerLock.unlock();
       }
       Log.i("Stannis", "[KWStannis] resumeRecord end");
       return;
    }
    public void seekAsr(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "223")) {
          return;
       }
       this.nativeSeekAsr(this.nativeStannis, p0);
       return;
    }
    public void seekBgm(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "135")) {
          return;
       }
       this.nativeSeekBgm(this.nativeStannis, p0);
       return;
    }
    public void setAgcMode(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "106")) {
          return;
       }
       this.nativeSetAgcMode(this.nativeStannis, p0);
       return;
    }
    public boolean setAsrLanguageModel(String p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, stannis, "216");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeSetAsrLanguageModel(this.nativeStannis, p0, p1);
    }
    public void setAudioDeviceStatusListener(StannisAudioDeviceStatusObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "27")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setAudioDeviceStatusListener start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.setAudioDeviceStatusListener(p0);
          this.deviceStatusObserver = p0;
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setAudioDeviceStatusListener end");
       return;
    }
    public void setAudioEffectAutotune(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, Stannis.class, "97")) {
          return;
       }
       this.nativeSetAudioEffectAutotune(this.nativeStannis, p0, p1, p2);
       return;
    }
    public void setAudioEffectParam(boolean p0,Stannis$KWStannisAudioEffectParam p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, stannis, "95")) {
          return;
       }
       if (p1 == null) {
          p1 = new Stannis$KWStannisAudioEffectParam();
       }
       this.nativeSetAudioEffectParam(this.nativeStannis, p0, p1);
       this.savedEnableAudioEffectParam = p0;
       this.savedAudioEffectParam = p1;
       return;
    }
    public void setAudioInputVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "100")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setAudioInputVolume -> setHeadphoneMonitorVolume: "+p0);
       this.setHeadphoneMonitorVolume(p0);
       this.nativeSetAudioInputVolume(this.nativeStannis, p0);
       return;
    }
    public int setAudioRecvRange(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "75");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetAudioRecvRange(this.nativeStannis, p0);
    }
    public void setAudioRouteListener(Stannis$AudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "5")) {
          return;
       }
       Log.d("Stannis", "[KWStannis] setAudioRouteListener = "+p0);
       this.audioRouteListener = p0;
       return;
    }
    public void setAudioRxVolume(int p0,float p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, stannis, "144")) {
          return;
       }
       this.nativeSetAudioRxVolume(this.nativeStannis, p0, p1);
       return;
    }
    public void setAudioScenario(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "30")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setAudioScenario: "+p0);
       this.audioScenario = p0;
       this.nativeSetAudioScenario(this.nativeStannis, p0);
       return;
    }
    public void setAudioTeamModeConference(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "113")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setAudioTeamModeConference start");
       this.nativeSetAudioTeamConference(this.nativeStannis, p0);
       return;
    }
    public int setAudioTunnel(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "74");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetAudioTunnel(this.nativeStannis, p0);
    }
    public void setAudioVoiceEffectOption(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "93")) {
          return;
       }
       this.nativeSetVoiceEffectOption(this.nativeStannis, p0);
       return;
    }
    public void setAudioVoiceRoleOption(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "94")) {
          return;
       }
       this.nativeSetVoiceRoleOption(this.nativeStannis, p0);
       return;
    }
    public void setAutoMixLyrics(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "204")) {
          return;
       }
       this.nativeSetAutoMixLyrics(this.nativeStannis, p0);
       return;
    }
    public void setAutoMixSeekTime(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "203")) {
          return;
       }
       this.nativeSetAutoMixSeekTime(this.nativeStannis, p0);
       return;
    }
    public void setBgmAutoSeekEnable(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "138")) {
          return;
       }
       this.nativeSetBgmAutoSeekEnable(this.nativeStannis, p0);
       return;
    }
    public void setBgmGuidanceType(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "139")) {
          return;
       }
       this.nativeSetBgmGuidanceType(this.nativeStannis, p0);
       return;
    }
    public final void setBgmLocalFadeGain(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "140")) {
          return;
       }
       this.nativeSetBgmLocalFadeGain(this.nativeStannis, p0);
       return;
    }
    public void setBgmPitch(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "136")) {
          return;
       }
       this.nativeSetBgmPitch(this.nativeStannis, p0);
       return;
    }
    public void setBgmPitchAlgorithm(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "137")) {
          return;
       }
       this.nativeSetBgmPitchAlgorithm(this.nativeStannis, p0);
       return;
    }
    public final void setBgmRemoteFadeGain(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "141")) {
          return;
       }
       this.nativeSetBgmRemoteFadeGain(this.nativeStannis, p0);
       return;
    }
    public void setBgmVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "131")) {
          return;
       }
       this.nativeSetBgmVolume(this.nativeStannis, p0);
       return;
    }
    public void setCaeModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "152")) {
          return;
       }
       String str = "Stannis";
       if (p0 == null || p0.isEmpty()) {
          Log.w(str, "[KWStannis] setCaeModelPath is null");
          return;
       }else {
          Log.i(str, "[KWStannis] setCaeModelPath: "+p0);
          this.nativeSetCaeModelPath(this.nativeStannis, p0);
          return;
       }
    }
    public void setCompressGain(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "109")) {
          return;
       }
       this.nativeSetAecFarendCompressorGain(this.nativeStannis, p0);
       return;
    }
    public void setDeepAECModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "154")) {
          return;
       }
       String str = "Stannis";
       if (p0 == null) {
          Log.w(str, "[KWStannis] setDeepAECModelPath is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setDeepAECModelPath: "+p0);
          this.nativeSetDeepAECModelPath(this.nativeStannis, p0);
          return;
       }
    }
    public void setDeepDenoiseModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "148")) {
          return;
       }
       String str = "Stannis";
       if (p0 == null && p0.isEmpty()) {
          Log.w(str, "[KWStannis] setDeepDenoiseModelPath enable, but model path is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setDeepDenoiseModelPath: "+p0);
          this.nativeSetCommonDenoiseEnableSuperWideBand(this.nativeStannis, true);
          this.nativeSetCommonDenoiseModelPath(this.nativeStannis, p0);
          return;
       }
    }
    public int setEffectPosition(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "176");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetEffectPosition(this.nativeStannis, p0, p1);
    }
    public int setEffectsVolume(double p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, stannis, "178");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetEffectsVolume(this.nativeStannis, p0);
    }
    public void setEnableAudioQualityEstimation(boolean p0,String p1,String p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, Stannis.class, "107")) {
          return;
       }
       this.nativeSetEnableAudioQualityEstimation(this.nativeStannis, p0, p1, p2);
       return;
    }
    public void setEnableAutoMixProcess(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "200")) {
          return;
       }
       this.setEnableAutoMixProcess(p0, -1);
       return;
    }
    public void setEnableAutoMixProcess(boolean p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, stannis, "201")) {
          return;
       }
       this.nativeSetEnableAutoMixProcess(this.nativeStannis, p0, p1);
       return;
    }
    public void setEnableCaeProcess(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "153")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setEnableCaeProcess: "+p0);
       if (!Stannis.isCaeProcessSoLoaded.get() && p0) {
          try{
             StannisSoLoader.loadSoLibrary("tensorflow-lite");
             StannisSoLoader.loadSoLibrary("ksaudioprocesslib-dl");
             Stannis.isCaeProcessSoLoaded.set(true);
          }catch(java.lang.Exception e0){
             Log.e("Stannis", "[KWStannis] setEnableCaeProcess load so failed.");
             return;
          }
       }
       this.nativeSetEnableCaeProcess(this.nativeStannis, p0);
       return;
    }
    public void setEnableCalculateDeepAECSNR(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "246")) {
          return;
       }
       this.nativeSetEnableCalculateDeepAECSNR(this.nativeStannis, p0);
       return;
    }
    public void setEnableCommonDenoise(boolean p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, stannis, "147")) {
          return;
       }
       String str = "Stannis";
       if (p0 && p1 == null) {
          Log.w(str, "[KWStannis] setEnableCommonDenoise enable, but model path is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setEnableCommonDenoise: "+p0+", model = "+p1);
          this.nativeSetCommonDenoiseModelPath(this.nativeStannis, p1);
          this.nativeSetEnableCommonDenoise(this.nativeStannis, p0);
          return;
       }
    }
    public void setEnableDeepAEC(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "155")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setEnableDeepAEC: "+p0);
       if (!Stannis.isDeepAecSoLoaded.get() && p0) {
          try{
             StannisSoLoader.loadSoLibrary("tensorflow-lite");
             StannisSoLoader.loadSoLibrary("ksaudioprocesslib-dl");
             Stannis.isDeepAecSoLoaded.set(true);
             Log.i("Stannis", "[KWStannis] load so success.");
          }catch(java.lang.Exception e0){
             Log.e("Stannis", "[KWStannis] load so failed.");
             return;
          }
       }
       this.nativeSetEnableDeepAEC(this.nativeStannis, p0);
       return;
    }
    public void setEnableDeepDenoise(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "149")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setEnableDeepDenoise: "+p0);
       if (!Stannis.isDeepDenoiseSoLoaded.get() && p0) {
          try{
             StannisSoLoader.loadSoLibrary("tensorflow-lite");
             StannisSoLoader.loadSoLibrary("ksaudioprocesslib-dl");
             Stannis.isDeepDenoiseSoLoaded.set(true);
          }catch(java.lang.Exception e0){
             Log.e("Stannis", "[KWStannis] load so failed.");
             return;
          }
       }
       this.nativeSetEnableCommonDenoise(this.nativeStannis, p0);
       return;
    }
    public void setEnableDeepDereverb(boolean p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, stannis, "146")) {
          return;
       }
       String str = "Stannis";
       if (p0 && p1 == null) {
          Log.w(str, "[KWStannis] setEnableDeepDereverb enable, but model path is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setEnableDeepDereverb: "+p0+", model = "+p1);
          this.nativeSetEnableDeepDereverb(this.nativeStannis, p0, p1);
          return;
       }
    }
    public void setEnableDeepNs(boolean p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, stannis, "145")) {
          return;
       }
       String str = "Stannis";
       if (p0 && p1 == null) {
          Log.w(str, "[KWStannis] setEnableDeepNs enable, but model path is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setEnableDeepNs: "+p0+", model = "+p1);
          this.nativeSetEnableDeepNs(this.nativeStannis, p0, p1);
          return;
       }
    }
    public void setEnableDelayMix(boolean p0,boolean p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, stannis, "82")) {
          return;
       }
       this.nativeSetEnableDelayMix(this.nativeStannis, p0, p1);
       return;
    }
    public void setEnableKTVVendorSupport(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "262")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setEnableKTVVendorSupport = "+p0);
       this.ktvVendorSupport = p0;
       return;
    }
    public void setEnableMonitorDebug(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "322")) {
          return;
       }
       Log.i("Stannis", "setEnableMonitorDebug: "+p0);
       this.nativeEnableMonitorDebug(this.nativeStannis, p0);
       return;
    }
    public void setEnableNoiseSuppression(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "105")) {
          return;
       }
       this.nativeSetEnableNoiseSuppression(this.nativeStannis, p0);
       return;
    }
    public void setEnableRecordAutoResume(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, Stannis.class, "321")) {
          return;
       }
       Log.i("Stannis", "setEnableRecordAutoResume: "+p0+" detecttime_by_sec: "+p1+" target: "+p2);
       this.nativeEnableRecordAutoResume(this.nativeStannis, p0, p1, p2);
       return;
    }
    public void setEnableSpeakerInputAEC(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "303")) {
          return;
       }
       this.nativeSetEnableSpeakerInput(this.nativeStannis, p0, 50);
       return;
    }
    public void setEnableSprayDenoise(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "151")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setEnableDeepDenoise: "+p0);
       if (!Stannis.isDeepDenoiseSoLoaded.get() && p0) {
          try{
             StannisSoLoader.loadSoLibrary("tensorflow-lite");
             StannisSoLoader.loadSoLibrary("ksaudioprocesslib-dl");
             Stannis.isDeepDenoiseSoLoaded.set(true);
          }catch(java.lang.Exception e0){
             Log.e("Stannis", "[KWStannis] load so failed.");
             return;
          }
       }
       Log.i("Stannis", "[KWStannis] setEnableSprayDenoise: "+p0);
       this.nativeSetEnableSprayDenoise(this.nativeStannis, p0);
       return;
    }
    public void setFirstAudioFrameRenderedAfterSeek(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "317")) {
          return;
       }
       this.recordSketchIntervalEnd = System.currentTimeMillis();
       Log.i("Stannis", "recordSketchIntervalEnd: "+this.recordSketchIntervalEnd);
       return;
    }
    public void setGuidanceVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "133")) {
          return;
       }
       this.nativeSetGuidanceVolume(this.nativeStannis, p0);
       return;
    }
    public void setHeadphoneMonitorVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "259")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setHeadphoneMonitorVolume:"+p0+" start");
       this.audioManagerLock.lock();
       stannis = this.stannisAudioManager;
       if (stannis != null) {
          stannis.setHeadphoneMonitorVolume(p0);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setHeadphoneMonitorVolume end");
       return;
    }
    public void setHiFiMusicMode(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "115")) {
          return;
       }
       if (this.audioScenario != null) {
          Log.i("Stannis", "[KWStannis] setHiFiMusicMode false in audio scenario: "+this.audioScenario);
          return;
       }else {
          this.nativeSetHiFiMusicModeValue(this.nativeStannis, p0);
          Log.i("Stannis", "[KWStannis] setHiFiMusicMode start");
          this.audioManagerLock.lock();
          if (this.stannisAudioManager == null || this.isAudioDeviceStarted == null) {
             this.audioManagerLock.unlock();
             Log.w("Stannis", "[KWStannis] setHiFiMusicMode end:, device not started");
             return;
          }else if(this.getStannisAudioManager().getDeviceConfig() != null){
             int scene = this.getStannisAudioManager().getDeviceConfig().getScene();
             Stannis stannis1 = 3072;
             String str = 2048;
             if (scene != str && scene != stannis1) {
                this.audioManagerLock.unlock();
                Log.d("Stannis", "[KWStannis] setHiFiMusicMode end, do not need setHiFiMusicMode: audio_scene = "+scene+"£¬ enable = "+p0);
                return;
             }else {
                this.nativeSetHiFiMusicMode(this.nativeStannis, p0);
                stannis = this.stannisAudioManager;
                if (stannis != null) {
                   if (p0) {
                      stannis.resetDevice(stannis1, "scene = InnerHiFi", false);
                      this.audioDeviceScene = stannis1;
                   }else {
                      stannis.resetDevice(str, "scene = kLiveGroupChat", false);
                      this.audioDeviceScene = str;
                   }
                }
             }
          }
          this.audioManagerLock.unlock();
          Log.i("Stannis", "[KWStannis] setHiFiMusicMode end");
          return;
       }
    }
    public void setHowlingSuppressionMode(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "110")) {
          return;
       }
       this.nativeSetHowlingSuppressionMode(this.nativeStannis, p0);
       return;
    }
    public void setHowlingSuppressionMultipleDevice(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "111")) {
          return;
       }
       this.nativeSetHowlingSuppressionMultipleDevice(this.nativeStannis, p0);
       return;
    }
    public int setHrtfMode(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "80");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetHrtfMode(this.nativeStannis, p0, p1);
    }
    public int setHrtfModelPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Stannis.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeSetHrtfModelPath(this.nativeStannis, p0);
    }
    public void setKaraokeParamAlphas(float p0,float p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, stannis, "228")) {
          return;
       }
       this.nativeSetKaraokeParamAlphas(this.nativeStannis, p0, p1);
       return;
    }
    public void setKaraokeParamTimeScoreParamC(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "229")) {
          return;
       }
       this.nativeSetKaraokeParamTimeScoreParamC(this.nativeStannis, p0);
       return;
    }
    public void setKaraokeScoreAecLevel(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "230")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setKaraokeScoreAecLevel: level="+p0);
       this.setKaraokeScoreAecLevel(p0, "");
       return;
    }
    public void setKaraokeScoreAecLevel(int p0,String p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, stannis, "231")) {
          return;
       }
       if (p1 != "") {
          Log.i("Stannis", "[KWStannis] setKaraokeScoreAecLevel: level="+p0+", model path="+p1);
       }
       this.nativeSetKaraokeScoreAecLevel(this.nativeStannis, p0, p1);
       return;
    }
    public boolean setKaraokeScorePitch(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "237");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeSetKaraokeScorePitch(this.nativeStannis, p0);
    }
    public void setKtvMode(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "116")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setKtvMode start");
       this.audioManagerLock.lock();
       if (this.stannisAudioManager == null || this.isAudioDeviceStarted == null) {
          this.audioManagerLock.unlock();
          Log.w("Stannis", "[KWStannis] setKtvMode end:, device not started");
          return;
       }else if(this.getStannisAudioManager().getDeviceConfig() != null){
          int scene = this.getStannisAudioManager().getDeviceConfig().getScene();
          Stannis stannis1 = 2560;
          String str = 2048;
          if (scene == str || (scene == stannis1 && (p0 || (scene == str || (p0 && scene == stannis1))))) {
             this.audioManagerLock.unlock();
             Log.d("Stannis", "[KWStannis] setKtvMode end, do not need setKtvMode: audio_scene = "+scene+"£¬ enable = "+p0);
             return;
          }else {
             Stannis tstannisAudi = this.stannisAudioManager;
             if (tstannisAudi != null) {
                if (p0) {
                   tstannisAudi.resetDevice(stannis1, "setKtvMode = kLiveKtvChat", false);
                   this.audioDeviceScene = stannis1;
                }else {
                   tstannisAudi.resetDevice(str, "setKtvMode = kLiveGroupChat", false);
                   this.audioDeviceScene = str;
                }
             }
          }
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setKtvMode end");
       return;
    }
    public void setLocalVoiceEqualization(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "96")) {
          return;
       }
       this.nativeSetLocalVoiceEqualization(this.nativeStannis, p0, p1);
       return;
    }
    public void setLowLatencyKtvScenario(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "31")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setLowPerformanceKtvScenario: "+p0);
       this.nativeSetLowLatencyKtvScenario(this.nativeStannis, p0);
       return;
    }
    public void setMicPopDeepNsModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "156")) {
          return;
       }
       String str = "Stannis";
       if (p0 == null) {
          Log.w(str, "[KWStannis] setMicPopDeepNsModelPath is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setMicPopDeepNsModelPath: "+p0);
          this.nativeSetMicPopDeepNsModelPath(this.nativeStannis, p0);
          return;
       }
    }
    public void setMicphoneVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "258")) {
          return;
       }
       this.nativeSetAudioInputVolume(this.nativeStannis, p0);
       return;
    }
    public void setMixWithOtherAudio(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "307")) {
          return;
       }
       this.nativeSetMixWithOtherAudio(this.nativeStannis, p0);
       return;
    }
    public int setMixedAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "300");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetMixedAudioFrameParameters(this.nativeStannis, p0, p1, p2, p3);
    }
    public void setMuteBgm(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "134")) {
          return;
       }
       this.nativeSetMuteBgm(this.nativeStannis, p0);
       return;
    }
    public void setMuteChatOutBgm(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "142")) {
          return;
       }
       this.isChatBgmMuted = p0;
       this.nativeSetMuteChatOutBgm(this.nativeStannis, p0);
       return;
    }
    public void setMuteLiveStreamOutBgm(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "143")) {
          return;
       }
       this.isLiveStreamBgmMuted = p0;
       this.nativeSetMuteLiveStreamOutBgm(this.nativeStannis, p0);
       return;
    }
    public void setMuteMicrophone(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "99")) {
          return;
       }
       this.muteType = p0;
       this.nativeSetMuteMicrophone(this.nativeStannis, p0);
       return;
    }
    public void setMuteRemote(boolean p0,boolean p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, stannis, "112")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setMuteRemote start");
       this.audioManagerLock.lock();
       if (this.stannisAudioManager == null || this.isAudioDeviceStarted == null) {
          this.audioManagerLock.unlock();
          Log.w("Stannis", "[KWStannis] setMuteRemote end: device not started");
          return;
       }else {
          this.nativeSetMuteRemote(this.nativeStannis, p0);
          if (p1 || (!p0 && this.getStannisAudioManager().getDeviceConfig() != null)) {
             int scene = this.getStannisAudioManager().getDeviceConfig().getScene();
             Stannis stannis1 = 2048;
             String str = 2560;
             if (scene != 768 && (scene != 1792 && (scene == stannis1 || (scene != str || (!p0 && (scene != 1792 && scene != str)))))) {
                this.audioManagerLock.unlock();
                Log.w("Stannis", "[KWStannis] setMuteRemote end, not need setMuteRemote: audio_scene = "+scene+" mute = "+p0);
                return;
             }else if(p0){
                stannis1 = (scene == 768 || scene == 1792)? 1792: 2560;
             }else if(scene == 768 || scene == 1792){
                stannis1 = 768;
             }
             p0 = false;
             if (stannis1 == str) {
                this.setSoftAecMode(2);
             }else {
                this.setSoftAecMode(p0);
             }
             Stannis tstannisAudi = this.stannisAudioManager;
             if (tstannisAudi != null) {
                tstannisAudi.resetDevice(stannis1, "setMuteRemote", p0);
             }
             this.audioDeviceScene = stannis1;
          }
          this.audioManagerLock.unlock();
          Log.i("Stannis", "[KWStannis] setMuteRemote end");
          return;
       }
    }
    public void setMuteSoundEffect(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "164")) {
          return;
       }
       this.nativeSetMuteSoundEffect(this.nativeStannis, p0);
       return;
    }
    public void setMuteSpeaker(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "104")) {
          return;
       }
       this.nativeSetMuteSpeaker(this.nativeStannis, p0);
       return;
    }
    public boolean setOutputType(int p0){
       boolean b;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "288");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("Stannis", "[KWStannis] setOutputType start, type = "+p0);
       this.userSetOutputType = p0;
       stannis = null;
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          b = tstannisAudi.setOutputType(p0, this.audioDeviceScene);
       }
       this.audioManagerLock.unlock();
       Log.d("Stannis", "[KWStannis] setOutputType end");
       return b;
    }
    public void setPcmPlayVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "193")) {
          return;
       }
       this.nativeSetPcmPlayVolume(this.nativeStannis, p0);
       return;
    }
    public int setPlaybackAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "299");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetPlaybackAudioFrameParameters(this.nativeStannis, p0, p1, p2, p3);
    }
    public void setPreProcessVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "101")) {
          return;
       }
       this.nativeSetPreProcessVolume(this.nativeStannis, p0);
       return;
    }
    public int setRecordRawAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "301");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetRecordRawAudioFrameParameters(this.nativeStannis, p0, p1, p2, p3);
    }
    public int setRecordingAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Stannis.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Stannis.class, "298");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetRecordingAudioFrameParameters(this.nativeStannis, p0, p1, p2, p3);
    }
    public void setRegisterAudioInfoObserver(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "296")) {
          return;
       }
       this.nativeSetRegisterAudioInfoObserver(this.nativeStannis, p0);
       return;
    }
    public void setRemoteBgmVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "132")) {
          return;
       }
       this.nativeSetRemoteBgmVolume(this.nativeStannis, p0);
       return;
    }
    public void setRemoteMixVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "103")) {
          return;
       }
       this.nativeSetRemoteMixVolume(this.nativeStannis, p0);
       return;
    }
    public void setRequestAudioFocus(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "265")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setRequestAudioFocus start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.setRequestAudioFocus(p0);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setRequestAudioFocus end");
       return;
    }
    public void setReverbLevel(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "92")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setReverbLevel start");
       this.nativeSetReverbLevel(this.nativeStannis, p0);
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.setHeadphoneMonitorReverbLevel(p0);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setReverbLevel end");
       return;
    }
    public void setSampleRateForRecordFile(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "277")) {
          return;
       }
       this.nativeSetSampleRateForRecordFile(this.nativeStannis, p0);
       return;
    }
    public void setSelfAudioTeamId(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "76")) {
          return;
       }
       this.nativeSetSelfAudioTeamId(this.nativeStannis, p0);
       return;
    }
    public void setSoftAecMode(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "285")) {
          return;
       }
       this.nativeSetSoftAecMode(this.nativeStannis, p0);
       return;
    }
    public void setSongSectionStartEndTime(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "244")) {
          return;
       }
       this.nativeSetSongSectionStartEndTime(this.nativeStannis, p0);
       return;
    }
    public void setSoundEffectVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "163")) {
          return;
       }
       this.nativeSetSoundEffectVolume(this.nativeStannis, p0);
       return;
    }
    public void setSpeakerOn(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "283")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setSpeakerOn start, isOn = "+p0);
       this.userSetSpeakerOn = p0;
       this.audioManagerLock.lock();
       stannis = this.stannisAudioManager;
       if (stannis != null) {
          if (!stannis.getUserSetOutputType()) {
             this.stannisAudioManager.setSpeakerOn(p0);
          }else {
             Log.w("Stannis", "[KWStannis] setSpeakerOn invalid: UserSetOutputType = "+this.stannisAudioManager.getUserSetOutputType());
          }
       }else {
          Log.w("Stannis", "[KWStannis] setSpeakerOn invalid, audioManager is null");
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setSpeakerOn end");
       return;
    }
    public void setSpeakerOutputVolume(float p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, stannis, "102")) {
          return;
       }
       this.nativeSetSpeakerOutputVolume(this.nativeStannis, p0);
       return;
    }
    public void setSprayDenoiseModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "150")) {
          return;
       }
       String str = "Stannis";
       if (p0 == null && p0.isEmpty()) {
          Log.w(str, "[KWStannis] setSprayDenoiseModelPath enable, but model path is null.");
          return;
       }else {
          Log.i(str, "[KWStannis] setSprayDenoiseModelPath: "+p0);
          this.nativeSetSprayDenoiseModelPath(this.nativeStannis, p0);
          return;
       }
    }
    public void setStannisConfig(Stannis$KWStannisConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "4")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] updateServerConfig audio_config dumppath "+p0.dumpPath+" dumpFlag "+p0.dumpFlag+" dumpFlag "+p0.qosFlag+" Interval "+p0.qosUploadInterval+" audioVad "+p0.enableAudioVad+" activeHOInterval"+p0.activeSpeakerHangOverInterval+" exDev "+p0.useExternalDevice+" audioCh "+p0.audioChannel+"audioOutCh "+p0.audioOutputChannel);
       this.audio_confg = p0;
       if (p0.dumpPath != "" && (p0.dumpFlag & 0xffff) == 0xffff) {
          Log.i("Stannis", "[KWStannis] open innercap dump");
          this.dumpInnerCapData = true;
       }
       return;
    }
    public void setStartRecordSketch(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "316")) {
          return;
       }
       this.recordSketchIntervalBegin = System.currentTimeMillis();
       Log.i("Stannis", "recordSketchIntervalBegin: "+this.recordSketchIntervalBegin);
       return;
    }
    public void setStereoCaptureAndProcess(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "294")) {
          return;
       }
       this.nativeSetStereoCaptureAndProcess(this.nativeStannis, p0);
       if (p0) {
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.setStereoCaptureAndProcess(true);
          }
          this.audioManagerLock.unlock();
       }
       return;
    }
    public void setUseQAVSdk(boolean p0){
    }
    public void setUsingBuiltinMic(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "34")) {
          return;
       }
       this.audioManagerLock.lock();
       stannis = this.stannisAudioManager;
       if (stannis != null) {
          stannis.setUsingBuiltinMic(p0);
       }
       this.audioManagerLock.unlock();
       return;
    }
    public void setUsingLocalHeadphoneMonitorSetting(boolean p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, stannis, "261")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] setUsingLocalHeadphoneMonitorSetting = "+p0);
       this.audioManagerLock.lock();
       stannis = this.stannisAudioManager;
       if (stannis != null) {
          stannis.setUsingLocalHeadphoneMonitorSetting(p0);
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] setUsingLocalHeadphoneMonitorSetting end ");
       return;
    }
    public void setVocalBgmDelay(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "51")) {
          return;
       }
       String str = "Stannis";
       if (p0 <= 0) {
          Log.i(str, "[KWStannis] set vocal bgm delay error value: "+p0);
          return;
       }else {
          Log.i(str, "[KWStannis] set vocal bgm delay: "+p0);
          this.vocalBgmDelay = p0;
          this.useHisenseVocalBgmDelay = true;
          this.nativeSetRoundTripLatency(this.nativeStannis, p0);
          return;
       }
    }
    public void setVoiceVocal(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "98")) {
          return;
       }
       this.nativeSetVoiceVocal(this.nativeStannis, p0);
       return;
    }
    public int setVolumeOfEffect(int p0,double p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Double.valueOf(p1), this, stannis, "179");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeSetVolumeOfEffect(this.nativeStannis, p0, p1);
    }
    public void startAsrProcess(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "219")) {
          return;
       }
       this.nativeStartAsrProcess(this.nativeStannis);
       return;
    }
    public void startAsrWorkshop(AsrObserver p0,String p1,int p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, Stannis.class, "215")) {
          return;
       }
       this.nativeStartAsrWorkshop(this.nativeStannis, p0, p1, p2);
       return;
    }
    public final int startAudioDevice(int p0){
       int i;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "32");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("Stannis", "[KWStannis] startAudioDevice start");
       Log.i("Stannis", "[KWStannis] startAudioDevice info vendor:["+Build.MANUFACTURER+"], product:["+Build.PRODUCT+"], model:["+Build.MODEL+"], board:["+Build.BRAND+"]");
       if (this.audio_confg.useExternalDevice != null) {
          Log.i("Stannis", "[KWStannis] startAudioDevice end, useExternalDevice");
          return 0;
       }else {
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.initOutputType(this.userSetOutputType);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
             this.stannisAudioManager.startAudioDeviceCheckThread();
             this.stannisAudioManager.updateAudioDeviceConfig(p0);
             this.stannisAudioManager.setAudioSession();
             i = this.stannisAudioManager.startPlayout(p0) ^ 1;
             if (!this.startRecordingByUser(p0)) {
                i = 1;
             }
             this.stannisAudioManager.resetRoundTripLatencyWithDelay(0);
          }else {
             i = 1;
          }
          if (!i) {
             this.isAudioDeviceStarted = true;
          }
          this.audioManagerLock.unlock();
          Log.i("Stannis", "[KWStannis] startAudioDevice end");
          return i;
       }
    }
    public boolean startAudioInnerCap(MediaProjection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Stannis.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] startAudioInnerCap start");
       this.audioManagerLock.lock();
       boolean b = false;
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          b = tstannisAudi.startAudioInnerCap(0xbb80, 2, p0);
          this.nativeSetEnableSpeakerInput(this.nativeStannis, true, 250);
          if (this.dumpInnerCapData != null) {
             this.stannisAudioManager.enableInnerCapDump(true);
          }
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] startAudioInnerCap end");
       return b;
    }
    public void startAutoTuneProcess(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "211")) {
          return;
       }
       this.nativeStartAutoTune(this.nativeStannis);
       return;
    }
    public boolean startBgm(ArrayList p0,ArrayList p1,boolean p2,int p3,BgmObserver p4){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, stannis, "118");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.startBgm(p0, p1, p2, p3, p4, null);
    }
    public boolean startBgm(ArrayList p0,ArrayList p1,boolean p2,int p3,BgmObserver p4,DataReadyObserver p5){
       Stannis stannis = Stannis.class;
       int i = 0;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, stannis, "120");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == null || !p0.size()) {
          Log.e("Stannis", "startBgm error: urlList is empty");
          return i;
       }else {
          return this.startBgm(p0, p1, p2, p3, null, p4, p5);
       }
    }
    public boolean startBgm(ArrayList p0,ArrayList p1,boolean p2,int p3,ArrayList p4,BgmObserver p5,DataReadyObserver p6){
       Stannis stannis = Stannis.class;
       int i = 1;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5,p6};
          Object obj = PatchProxy.apply(objArray, this, stannis, "122");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i2 = this;
       }
       int i1 = (p2)? -1: 1;
       return this.startPlayInternal(p0, p1, i1, p3, false, 0, 0, p4, p5, p6);
    }
    public boolean startBgm(ArrayList p0,boolean p1,int p2,BgmObserver p3){
       if (PatchProxy.isSupport(Stannis.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), p3, this, Stannis.class, "117");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.startBgm(p0, null, p1, p2, p3);
    }
    public boolean startBgm(ArrayList p0,boolean p1,int p2,BgmObserver p3,DataReadyObserver p4){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, this, stannis, "119");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.startBgm(p0, null, p1, p2, p3, p4);
    }
    public boolean startBgm(ArrayList p0,boolean p1,int p2,ArrayList p3,BgmObserver p4,DataReadyObserver p5){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, this, stannis, "121");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.startBgm(p0, null, p1, p2, p3, p4, p5);
    }
    public void startFingerprint(String p0,FingerprintObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "248")) {
          return;
       }
       if (this.isPipeLineStarted == null) {
          Log.w("Stannis", "[KWStannis] startFingerprint with \("+p0+"\) failed: You need startPipeLine before startFingerprint!");
          return;
       }else {
          this.nativeStartFingerprint(this.nativeStannis, p0, p1);
          return;
       }
    }
    public void startKaraokeScore(long p0,String p1,String p2,String p3,String p4,String p5,int p6,int p7,KaraokeScoreObserver p8){
       Stannis stannis = this;
       Stannis stannis1 = Stannis.class;
       if (PatchProxy.isSupport(stannis1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, stannis1, "225")) {
             return;
          }
       }
       this.nativeStartKaraokeScore(stannis.nativeStannis, p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return;
    }
    public void startKaraokeScore(long p0,String p1,String p2,String p3,byte[] p4,String p5,int p6,int p7,long p8,int p9,int p10,KaraokeScoreObserver p11){
       Object obj = this;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[12];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Long.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          objArray[11] = p11;
          if (PatchProxy.applyVoid(objArray, obj, stannis, "226")) {
             return;
          }
       }
       this.nativeStartKaraokeScoreWithMidiData(obj.nativeStannis, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return;
    }
    public void startKaraokeVad(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "278")) {
          return;
       }
       this.nativeStartKaraokeVad(this.nativeStannis, p0);
       return;
    }
    public void startMultipleStreamMix(DataReadyObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "195")) {
          return;
       }
       if (this.isPipeLineStarted == null) {
          Log.w("Stannis", "[KWStannis] startMultipleStreamMix failed: You need startPipeLine before startMultipleStreamMix!");
          return;
       }else {
          this.nativeStartMultipleStreamMix(this.nativeStannis, p0);
          return;
       }
    }
    public void startPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "189")) {
          return;
       }
       this.nativeStartPcmPlay(this.nativeStannis);
       return;
    }
    public int startPipeline(int p0,int p1,DataReadyObserver p2){
       Stannis obj;
       if (PatchProxy.isSupport(Stannis.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, Stannis.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("Stannis", "[KWStannis] startPipeline start vad_flow_id"+p1+"scene "+p0);
       this.startPipelineCheckAndReset(p0);
       int i = 0;
       if (!this.needStartPipeline(p0)) {
          Log.i("Stannis", "[KWStannis] startPipeline end, vad_flow_id"+p1+", not need to restart pipeline: scene="+p0+", current_scene="+this.audioDeviceScene);
          return i;
       }else if(p0 == 3328){
          Log.i("Stannis", "[KWStannis] startPipeline2 addAudioTelephoneObserver");
          this.audioManagerLock.lock();
          obj = this.stannisAudioManager;
          if (obj != null) {
             obj.addAudioTelephoneObserver();
          }
          this.audioManagerLock.unlock();
       }
       this.dataReadyObserver = p2;
       Stannis tnativeStann = this.nativeStannis;
       boolean b = (this.userSetOutputType == null)? true: false;
       boolean b1 = this.nativeGetConfig(tnativeStann, 2, b, p0, this.audio_confg);
       boolean b2 = this.nativeGetIsAudioChatEnable(this.nativeStannis);
       if (this.nativeGetIsLiveStreamEnable(this.nativeStannis)) {
          if (this.isLiveSteamStarted == null) {
             this.StartLiveStream(i, p1, p2);
          }
       }else if(this.isLiveSteamStarted != null){
          this.StopAllStream();
       }
       if (this.isChatStreamStarted != null) {
          this.StopAllLiveChat();
       }
       if (b2) {
          this.StartLiveChat(1, p1, p2);
       }
       this.nativeSetMuteMicrophone(this.nativeStannis, this.muteType);
       if (p0 != 1280) {
          this.nativeStopSilenceGenerator(this.nativeStannis);
       }
       Stannis tisAudioDevi = this.isAudioDeviceStarted;
       if (tisAudioDevi == null) {
          i = this.startAudioDevice(p0);
       }else if(b1){
          if (tisAudioDevi != null) {
             this.stopAudioDevice();
          }
          i = this.startAudioDevice(p0);
       }else {
          this.audioManagerLock.lock();
          obj = this.stannisAudioManager;
          if (obj != null) {
             obj.updateAudioDeviceConfig(p0);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
          }
          this.audioManagerLock.unlock();
       }
       if (p0 == 1280) {
          this.nativeStartSilenceGenerator(this.nativeStannis);
       }
       this.isPipeLineStarted = true;
       this.audioDeviceScene = p0;
       this.notifyAudioSceneChange(1, p0);
       if (this.isHiFiMusicMode()) {
          this.setHiFiMusicMode(1);
       }
       Log.i("Stannis", "[KWStannis] startPipeline end, vad_flow_id"+p1);
       return i;
    }
    public int startPipeline(int p0,DataReadyObserver p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, stannis, "44");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("Stannis", "[KWStannis] startPipeline startscene "+p0);
       this.startPipelineCheckAndReset(p0);
       int i = 0;
       if (!this.needStartPipeline(p0)) {
          Log.i("Stannis", "[KWStannis] startPipeline end, not need to restart pipeline: scene="+p0+", current_scene="+this.audioDeviceScene);
          return i;
       }else if(p0 == 3328){
          Log.i("Stannis", "[KWStannis] startPipeline addAudioTelephoneObserver");
          this.audioManagerLock.lock();
          stannis = this.stannisAudioManager;
          if (stannis != null) {
             stannis.addAudioTelephoneObserver();
          }
          this.audioManagerLock.unlock();
       }
       this.dataReadyObserver = p1;
       Stannis tnativeStann = this.nativeStannis;
       boolean b = (this.userSetOutputType == null)? true: false;
       boolean b1 = this.nativeGetConfig(tnativeStann, 2, b, p0, this.audio_confg);
       boolean b2 = this.nativeGetIsAudioChatEnable(this.nativeStannis);
       if (this.nativeGetIsLiveStreamEnable(this.nativeStannis)) {
          if (this.isLiveSteamStarted == null) {
             this.StartLiveStream(i, i, p1);
          }
       }else if(this.isLiveSteamStarted != null){
          this.StopAllStream();
       }
       if (this.isChatStreamStarted != null) {
          this.StopAllLiveChat();
       }
       if (b2) {
          this.StartLiveChat(1, 1, p1);
       }
       this.nativeSetMuteMicrophone(this.nativeStannis, this.muteType);
       if (p0 != 1280) {
          this.nativeStopSilenceGenerator(this.nativeStannis);
       }
       Stannis tisAudioDevi = this.isAudioDeviceStarted;
       if (tisAudioDevi == null) {
          i = this.startAudioDevice(p0);
       }else if(b1){
          if (tisAudioDevi != null) {
             this.stopAudioDevice();
          }
          i = this.startAudioDevice(p0);
       }else {
          this.audioManagerLock.lock();
          stannis = this.stannisAudioManager;
          if (stannis != null) {
             stannis.updateAudioDeviceConfig(p0);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
          }
          this.audioManagerLock.unlock();
       }
       if (p0 == 1280) {
          this.nativeStartSilenceGenerator(this.nativeStannis);
       }
       this.isPipeLineStarted = true;
       this.audioDeviceScene = p0;
       this.notifyAudioSceneChange(1, p0);
       if (this.isHiFiMusicMode()) {
          this.setHiFiMusicMode(1);
       }
       Log.i("Stannis", "[KWStannis] startPipeline end");
       return i;
    }
    public final void startPipelineCheckAndReset(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannis, "43")) {
          return;
       }
       if (!StannisAudioCommon.isChatScene(p0)) {
          Log.w("Stannis", "[KWStannis] startPipeline reset userSetOutputType by scene = "+p0);
          this.userSetOutputType = 0;
       }
       return;
    }
    public int startPipelineForHisense(){
       boolean this;
       Object obj = PatchProxy.apply(null, this, Stannis.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("Stannis", "[KWStannis] start pipeline for hisense");
       this.hisenseNativeDataReadyObserver = this.nativeCreateHisenseDataReadyReceiver(this.nativeStannis, "RecordFile");
       this.hisenseNativeRawDataReadyObserver = this.nativeCreateHisenseDataReadyReceiver(this.nativeStannis, "RecordRawFile");
       int i = 256;
       this.startPipelineCheckAndReset(i);
       Stannis tnativeStann = this.nativeStannis;
       int i1 = 2;
       int i2 = 0;
       boolean b = (this.userSetOutputType == null)? true: false;
       this = this.nativeGetConfig(tnativeStann, i1, b, 256, this.audio_confg);
       if (this.isLiveSteamStarted == null) {
          this.StartLiveStreamWithNativePtrForHisense(this.hisenseNativeDataReadyObserver, this.hisenseNativeRawDataReadyObserver);
       }
       this.nativeSetMuteMicrophone(this.nativeStannis, this.muteType);
       this.nativeStopSilenceGenerator(this.nativeStannis);
       tnativeStann = this.isAudioDeviceStarted;
       if (tnativeStann == null) {
          i2 = this.startAudioDevice(i);
       }else if(this){
          if (tnativeStann != null) {
             this.stopAudioDevice();
          }
          i2 = this.startAudioDevice(i);
       }else {
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.updateAudioDeviceConfig(i);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
          }
          this.audioManagerLock.unlock();
       }
       this.isPipeLineStarted = true;
       this.audioDeviceScene = i;
       Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr for hisense end");
       return i2;
    }
    public int startPipelineWithNativePtr(int p0,int p1,long p2){
       Stannis obj;
       if (PatchProxy.isSupport(Stannis.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, Stannis.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       String str = "[KWStannis] startPipelineWithNativePtr start, vad_flow_id = ";
       Log.i("Stannis", str+p1);
       this.startPipelineCheckAndReset(p0);
       int i = 0;
       if (!this.needStartPipeline(p0)) {
          Log.i("Stannis", str+p1+", not need to restart pipeline: scene="+p0+", current_scene="+this.audioDeviceScene);
          return i;
       }else if(p0 == 3328){
          Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr2 addAudioTelephoneObserver");
          this.audioManagerLock.lock();
          obj = this.stannisAudioManager;
          if (obj != null) {
             obj.addAudioTelephoneObserver();
          }
          this.audioManagerLock.unlock();
       }
       Stannis tnativeStann = this.nativeStannis;
       boolean b = (this.userSetOutputType == null)? true: false;
       boolean b1 = this.nativeGetConfig(tnativeStann, 2, b, p0, this.audio_confg);
       boolean b2 = this.nativeGetIsAudioChatEnable(this.nativeStannis);
       if (this.nativeGetIsLiveStreamEnable(this.nativeStannis)) {
          if (this.isLiveSteamStarted == null) {
             this.StartLiveStreamWithNativePtr(i, p1, p2);
          }
       }else if(this.isLiveSteamStarted != null){
          this.StopAllStream();
       }
       if (this.isChatStreamStarted != null) {
          this.StopAllLiveChat();
       }
       if (b2) {
          this.StartLiveChatWithNativePtr(1, p1, p2);
       }
       this.nativeSetMuteMicrophone(this.nativeStannis, this.muteType);
       int i1 = 1280;
       if (p0 != i1) {
          this.nativeStopSilenceGenerator(this.nativeStannis);
       }
       Stannis tisAudioDevi = this.isAudioDeviceStarted;
       if (tisAudioDevi == null) {
          i = this.startAudioDevice(p0);
       }else if(b1){
          if (tisAudioDevi != null) {
             this.stopAudioDevice();
          }
          i = this.startAudioDevice(p0);
       }else {
          this.audioManagerLock.lock();
          tisAudioDevi = this.stannisAudioManager;
          if (tisAudioDevi != null) {
             tisAudioDevi.updateAudioDeviceConfig(p0);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
          }
          this.audioManagerLock.unlock();
       }
       if (p0 == i1) {
          this.nativeStartSilenceGenerator(this.nativeStannis);
       }
       this.isPipeLineStarted = true;
       this.audioDeviceScene = p0;
       this.notifyAudioSceneChange(1, p0);
       if (this.isHiFiMusicMode()) {
          this.setHiFiMusicMode(1);
       }
       Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr end, vad_flow_id = "+p1);
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.SetEnableRecordState(this.audioRecordEnabled);
       }
       this.audioManagerLock.unlock();
       return i;
    }
    public int startPipelineWithNativePtr(int p0,long p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, stannis, "52");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr start");
       this.startPipelineCheckAndReset(p0);
       int i = 0;
       if (!this.needStartPipeline(p0)) {
          Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr end, not need to restart pipeline: scene="+p0+", current_scene="+this.audioDeviceScene);
          return i;
       }else if(p0 == 3328){
          Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr addAudioTelephoneObserver");
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.addAudioTelephoneObserver();
          }
          this.audioManagerLock.unlock();
       }
       Stannis tnativeStann = this.nativeStannis;
       boolean b = (this.userSetOutputType == null)? true: false;
       boolean b1 = this.nativeGetConfig(tnativeStann, 2, b, p0, this.audio_confg);
       boolean b2 = this.nativeGetIsAudioChatEnable(this.nativeStannis);
       if (this.nativeGetIsLiveStreamEnable(this.nativeStannis)) {
          if (this.isLiveSteamStarted == null) {
             this.StartLiveStreamWithNativePtr(i, i, p1);
          }
       }else if(this.isLiveSteamStarted != null){
          this.StopAllStream();
       }
       if (this.isChatStreamStarted != null) {
          this.StopAllLiveChat();
       }
       if (b2) {
          this.StartLiveChatWithNativePtr(1, 1, p1);
       }
       this.nativeSetMuteMicrophone(this.nativeStannis, this.muteType);
       int i1 = 1280;
       if (p0 != i1) {
          this.nativeStopSilenceGenerator(this.nativeStannis);
       }
       Stannis tisAudioDevi = this.isAudioDeviceStarted;
       if (tisAudioDevi == null) {
          i = this.startAudioDevice(p0);
       }else if(b1){
          if (tisAudioDevi != null) {
             this.stopAudioDevice();
          }
          i = this.startAudioDevice(p0);
       }else {
          this.audioManagerLock.lock();
          tisAudioDevi = this.stannisAudioManager;
          if (tisAudioDevi != null) {
             tisAudioDevi.updateAudioDeviceConfig(p0);
             this.stannisAudioManager.setAudioRouteListener(this.audioRouteListener);
          }
          this.audioManagerLock.unlock();
       }
       if (p0 == i1) {
          this.nativeStartSilenceGenerator(this.nativeStannis);
       }
       this.isPipeLineStarted = true;
       this.audioDeviceScene = p0;
       this.notifyAudioSceneChange(1, p0);
       if (this.isHiFiMusicMode()) {
          this.setHiFiMusicMode(1);
       }
       Log.i("Stannis", "[KWStannis] startPipelineWithNativePtr end");
       this.audioManagerLock.lock();
       Stannis tstannisAudi1 = this.stannisAudioManager;
       if (tstannisAudi1 != null) {
          tstannisAudi1.SetEnableRecordState(this.audioRecordEnabled);
       }
       this.audioManagerLock.unlock();
       return i;
    }
    public void startPlayAudioSegment(String p0,String p1,AudioSegmentPlayerObserver p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Stannis.class, "182")) {
          return;
       }
       if (this.isPipeLineStarted != null) {
          this.nativeStartPlayAudioSegment(this.nativeStannis, p0, p1, p2);
       }else if(p2 != null){
          p2.onError(p1, p0, AudioSegmentPlayerObserver$ErrorType.StartFailed);
       }
       return;
    }
    public boolean startPlayBgm(ArrayList p0,int p1,int p2,BgmObserver p3,DataReadyObserver p4){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, this, stannis, "123");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.startPlayBgm(p0, null, p1, p2, p3, p4);
    }
    public boolean startPlayBgm(ArrayList p0,ArrayList p1,int p2,int p3,BgmObserver p4,DataReadyObserver p5){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, stannis, "124");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i = this;
       }
       return this.startPlayInternal(p0, p1, p2, p3, false, 0, 0, null, p4, p5);
    }
    public final boolean startPlayInternal(ArrayList p0,ArrayList p1,int p2,int p3,boolean p4,long p5,long p6,ArrayList p7,BgmObserver p8,DataReadyObserver p9){
       Object obj = this;
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Long.valueOf(p5);
          objArray[6] = Long.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          Object obj1 = PatchProxy.apply(objArray, obj, stannis, "126");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (p0 == null || !p0.size()) {
          Log.e("Stannis", "startPlayBgm error: urlList is empty");
          return 0;
       }else {
          return this.nativeStartBgm(obj.nativeStannis, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       }
    }
    public int startRecordDevice(){
       boolean this;
       Object obj = PatchProxy.apply(null, this, Stannis.class, "270");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("Stannis", "[KWStannis] startRecordDevice start");
       int i = 256;
       Stannis tnativeStann = this.nativeStannis;
       int i1 = 0;
       boolean b = (this.userSetOutputType == null)? true: false;
       this = this.nativeGetConfig(tnativeStann, 2, b, 256, this.audio_confg);
       tnativeStann = this.isAudioDeviceStarted;
       if (tnativeStann == null) {
          i1 = this.startAudioDevice(i);
       }else if(this){
          if (tnativeStann != null) {
             this.stopAudioDevice();
          }
          i1 = this.startAudioDevice(i);
       }else {
          this.audioManagerLock.lock();
          Stannis tstannisAudi = this.stannisAudioManager;
          if (tstannisAudi != null) {
             tstannisAudi.updateAudioDeviceConfig(i);
          }
          this.audioManagerLock.unlock();
          Log.i("Stannis", "[KWStannis] startRecordDevice end");
       }
       return i1;
    }
    public void startRecordFile(String p0,RecordFileObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "272")) {
          return;
       }
       this.startRecordFile(p0, p1, "");
       return;
    }
    public void startRecordFile(String p0,RecordFileObserver p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Stannis.class, "273")) {
          return;
       }
       if (this.isAudioDeviceStarted == null) {
          Log.e("Stannis", "[KWStannis] startRecordFile record device not started.");
          return;
       }else {
          this.nativeStartRecordFile(this.nativeStannis, p0, p1, p2);
          return;
       }
    }
    public void startRecordFileForHisense(String p0,RecordFileObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "48")) {
          return;
       }
       this.startRecordFileForHisense(p0, p1, null);
       return;
    }
    public void startRecordFileForHisense(String p0,RecordFileObserver p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Stannis.class, "47")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] start record file for hisense, file path: "+p0+" and raw file path: "+p2);
       this.nativeStartRecordFileForHisense(this.hisenseNativeDataReadyObserver, p0, p1, this.hisenseNativeRawDataReadyObserver, p2);
       return;
    }
    public final boolean startRecordingByUser(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "89");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("Stannis", "[KWStannis] startRecordingByUser start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       int i = 0;
       if (tstannisAudi != null) {
          if (this.audioRecordEnabled != null) {
             this.resetRecordMode = i;
             Log.i("Stannis", "[KWStannis] startRecordingByUser resetRecordMode revert to default");
             i = tstannisAudi.startRecording(p0, i);
          }else {
             i = true;
          }
       }
       this.audioRecordStartedByUser = true;
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] startRecordingByUser end");
       return i;
    }
    public void startSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "242")) {
          return;
       }
       this.nativeStartSongSectionScore(this.nativeStannis);
       return;
    }
    public void startSongSectionScoreWorkshop(int p0,byte[] p1,long p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, Stannis.class, "240")) {
          return;
       }
       this.nativeStartSongSectionScoreWorkshop(this.nativeStannis, p0, p1, p2);
       return;
    }
    public void startVocalBgmSync(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "206")) {
          return;
       }
       this.nativeStartVocalBgmSync(this.nativeStannis, p0);
       return;
    }
    public void startVocalBgmSync(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(Stannis.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Stannis.class, "207")) {
          return;
       }
       this.nativeStartVocalBgmSyncByData(this.nativeStannis, p0, p1, p2);
       return;
    }
    public int stopAllEffects(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeStopAllEffects(this.nativeStannis);
    }
    public void stopAllSoundEffects(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "162")) {
          return;
       }
       this.nativeStopAllSoundEffects(this.nativeStannis);
       return;
    }
    public void stopAsrProcess(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "220")) {
          return;
       }
       this.nativeStopAsrProcess(this.nativeStannis);
       return;
    }
    public void stopAsrWorkshop(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "218")) {
          return;
       }
       this.nativeStopAsrWorkshop(this.nativeStannis);
       return;
    }
    public final int stopAudioDevice(){
       Object[] objArray = null;
       Stannis obj = PatchProxy.apply(objArray, this, Stannis.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("Stannis", "[KWStannis] stopAudioDevice start exDev"+this.audio_confg.useExternalDevice+"devstart "+this.isAudioDeviceStarted);
       if (this.audio_confg.useExternalDevice != null && this.isAudioDeviceStarted == null) {
          Log.i("Stannis", "[KWStannis] stopAudioDevice end, useExternalDevice");
          return 0;
       }else {
          this.audioManagerLock.lock();
          obj = this.stannisAudioManager;
          int i = 1;
          if (obj != null) {
             obj.stopAudioDeviceCheckThread();
             this.stannisAudioManager.setAudioRouteListener(objArray);
             int i1 = this.stopRecordingByUser() ^ i;
             if (this.stannisAudioManager.stopPlayout()) {
                i = i1;
             }
          }else {
             i = 0;
          }
          this.isAudioDeviceStarted = false;
          this.audioManagerLock.unlock();
          Log.i("Stannis", "[KWStannis] stopAudioDevice end");
          return i;
       }
    }
    public final void stopAudioRenderThread(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "42")) {
          return;
       }
       this.nativeStopAudioRenderThread(this.nativeStannis);
       return;
    }
    public void stopAutoTuneProcess(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "212")) {
          return;
       }
       this.nativeStopAutoTune(this.nativeStannis);
       return;
    }
    public void stopBgm(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "128")) {
          return;
       }
       this.nativeStopBgm(this.nativeStannis);
       return;
    }
    public int stopEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "168");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeStopEffect(this.nativeStannis, p0);
    }
    public void stopFingerprint(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "249")) {
          return;
       }
       this.nativeStopFingerprint(this.nativeStannis);
       return;
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "29")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] stopAudioInnerCap start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          if (tstannisAudi.hasStartedAudioInnerCap()) {
             this.nativeSetEnableSpeakerInput(this.nativeStannis, false, 250);
          }
          this.stannisAudioManager.stopInnerCap();
       }
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] stopAudioInnerCap end");
       return;
    }
    public void stopKaraokeScore(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "227")) {
          return;
       }
       this.nativeStopKaraokeScore(this.nativeStannis);
       return;
    }
    public void stopKaraokeVad(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "279")) {
          return;
       }
       this.nativeStopKaraokeVad(this.nativeStannis);
       return;
    }
    public void stopMultipleStreamMix(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "196")) {
          return;
       }
       this.nativeStopMultipleStreamMix(this.nativeStannis);
       return;
    }
    public void stopPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "190")) {
          return;
       }
       this.nativeStopPcmPlay(this.nativeStannis);
       return;
    }
    public int stopPipeline(){
       Object[] objArray = null;
       Stannis obj = PatchProxy.apply(objArray, this, Stannis.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audioDeviceScene;
       Log.i("Stannis", "[KWStannis] stopPipeline start, current scene = "+obj);
       this.muteType = 0;
       if (this.isPipeLineStarted == null) {
          return -1;
       }
       this.stopBgm();
       this.stopAllSoundEffects();
       this.stopAllEffects();
       this.stopPlayAudioSegment();
       this.stopMultipleStreamMix();
       this.StopAllStream();
       this.stopInnerCap();
       this.stopAudioRenderThread();
       this.isChatBgmMuted = false;
       this.isLiveStreamBgmMuted = false;
       this.isPipeLineStarted = false;
       this.dataReadyObserver = objArray;
       this.notifyAudioSceneChange(0, obj);
       Log.i("Stannis", "[KWStannis] stopPipeline end, current scene = "+obj);
       this.vocalBgmDelay = 0;
       this.useHisenseVocalBgmDelay = false;
       return this.stopAudioDevice();
    }
    public void stopPlayAudioSegment(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "183")) {
          return;
       }
       this.nativeStopPlayAudioSegment(this.nativeStannis);
       return;
    }
    public void stopRecordDevice(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "271")) {
          return;
       }
       if (this.isAudioDeviceStarted != null) {
          this.stopAudioDevice();
       }
       return;
    }
    public void stopRecordFile(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "274")) {
          return;
       }
       this.stopRecordFile(p0, "");
       return;
    }
    public void stopRecordFile(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "275")) {
          return;
       }
       this.nativeStopRecordFile(this.nativeStannis, p0, p1);
       return;
    }
    public void stopRecordFileForHisense(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "50")) {
          return;
       }
       this.stopRecordFileForHisense(p0, null);
       return;
    }
    public void stopRecordFileForHisense(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Stannis.class, "49")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] stop record file for hisense, file path: "+p0+" and raw file path: "+p1);
       this.nativeStopRecordFileForHisense(this.hisenseNativeDataReadyObserver, p0, this.hisenseNativeRawDataReadyObserver, p1);
       return;
    }
    public final boolean stopRecordingByUser(){
       Object obj = PatchProxy.apply(null, this, Stannis.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("Stannis", "[KWStannis] stopRecordingByUser start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       boolean b = false;
       boolean b1 = (tstannisAudi != null)? tstannisAudi.stopRecording(): false;
       this.audioRecordStartedByUser = b;
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] stopRecordingByUser end");
       return b1;
    }
    public void stopSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "243")) {
          return;
       }
       this.nativeStopSongSectionScore(this.nativeStannis);
       return;
    }
    public void stopSongSectionScoreWorkshop(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "241")) {
          return;
       }
       this.nativeStopSongSectionScoreWorkshop(this.nativeStannis);
       return;
    }
    public void stopVocalBgmSync(){
       if (PatchProxy.applyVoid(null, this, Stannis.class, "208")) {
          return;
       }
       this.nativeStopVocalBgmSync(this.nativeStannis);
       return;
    }
    public void uninit(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, Stannis.class, "14")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] uninit start");
       if (this.isPipeLineStarted != null) {
          this.stopPipeline();
          this.isPipeLineStarted = false;
       }
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.removeAudioTelephoneObserver();
       }
       this.audioManagerLock.unlock();
       this.muteType = 0;
       this.nativeUninitStannis(this.nativeStannis);
       this.audioManagerLock.lock();
       this.context = objArray;
       this.qosObserver = objArray;
       this.deviceStatusObserver = objArray;
       this.stannisAudioManager = objArray;
       this.audioManagerLock.unlock();
       this.audioRouteListener = objArray;
       this.notifyObserver = objArray;
       this.audioRecordEnabled = true;
       this.audioSceneObservers.clear();
       Log.i("Stannis", "[KWStannis] uninit end");
       return;
    }
    public void uninitStannisEngine(long p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, stannis, "15")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] uninitStannisEngine: userId="+p0);
       _monitor_enter(this);
       Long longx = new Long(p0);
       if (this.userIdSet.contains(longx)) {
          this.userIdSet.remove(longx);
       }else {
          Log.w("Stannis", "[KWStannis] uninitStannisEngine: not contains userId"+p0);
       }
       if (this.userIdSet.isEmpty()) {
          this.uninit();
       }
       Log.i("Stannis", "[KWStannis] uninitStannisEngine : userId count:"+this.userIdSet.size());
       _monitor_exit(this);
       return;
    }
    public int unloadEffect(int p0){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, stannis, "166");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeUnloadEffect(this.nativeStannis, p0);
    }
    public boolean updateBgmIndex(int p0,int p1){
       Stannis stannis = Stannis.class;
       if (PatchProxy.isSupport(stannis)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, stannis, "127");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeUpdateBgmIndex(this.nativeStannis, p0, p1);
    }
    public int updateSelfPosition(int[] p0,float[] p1,float[] p2,float[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, Stannis.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeUpdateSelfPosition(this.nativeStannis, p0, p1, p2, p3);
    }
    public void updateServerConfig(Stannis$KWStannisServerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Stannis.class, "3")) {
          return;
       }
       Log.i("Stannis", "[KWStannis] updateServerConfig start");
       this.audioManagerLock.lock();
       Stannis tstannisAudi = this.stannisAudioManager;
       if (tstannisAudi != null) {
          tstannisAudi.setServerConfigStr(p0.audioJsonConfig);
          this.stannisAudioManager.setKtvVendorSupport(p0.ktvVendorSupport);
          if (p0.ktvVendorSupport != null && this.stannisAudioManager.isSupportVendorHeadphoneMonitor()) {
             Log.i("Stannis", "[KWStannis] updateServerConfig setDeviceType, use ktv vendor, do not set device type, use Java API");
          }else {
             this.stannisAudioManager.setDeviceType(p0.deviceType);
          }
          this.stannisAudioManager.setUseSoftHeadphoneMonitor(p0.useSoftHeadphoneMonitor);
       }else {
          Log.w("Stannis", "updateServerConfig audioManager not initialized");
       }
       if (this.useHisenseVocalBgmDelay != null) {
          p0.roundTripLatency = this.vocalBgmDelay;
       }
       this.nativeUpdateServerConfig(this.nativeStannis, p0);
       this.audioManagerLock.unlock();
       Log.i("Stannis", "[KWStannis] updateServerConfig end");
       return;
    }
}
