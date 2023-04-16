package com.kwai.video.westeros.stentorplugin.StentorPlugin;
import com.kwai.video.westeros.WesterosPlugin;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$2;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$3;
import com.kwai.stentor.AsrProduct.Asr;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.westeros.stentorplugin.AsrConfig;
import com.kwai.stentor.AsrProduct.Asr$PB;
import com.kwai.chat.sdk.signal.f;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$5;
import j85.e;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$6;
import java.lang.Enum;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$1;
import java.lang.Runnable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ow7.a;
import ow7.b;
import com.kwai.video.westeros.stentorplugin.StentorPlugin$4;

public class StentorPlugin extends WesterosPlugin	// class@0010c0
{
    public Asr asr;
    public Asr$PB asrPb;
    public j0 asrSendPacketListener;
    public boolean enableAsr;
    public Handler handler;
    public boolean isWriting;
    public int mBytesPerChannel;
    public HashMap reqIdMap;
    public ArrayList voiceChangeArrayList;
    public static String LAST_MESSAGE_SDK_RECEIVE_PUSH_COMMAND = "";
    public static String MESSAGE_SDK_COMMAND = "Global.MMU.RtAudioToTextMagicExpression";
    public static int MESSAGE_SDK_MESSAGE_SEND_TIMEOUT_MILLIONS = 10000;
    public static String MESSAGE_SDK_RECEIVE_PUSH_COMMAND = "Push.MMU.RtAudioToTextMagicExpression";
    public static String REQUEST_MODE = "westeros";

    static {
       WesterosSoLoader.loadNative();
       WesterosSoLoader.loadLibrary("stentorplugin");
    }
    public void StentorPlugin(){
       super();
       this.voiceChangeArrayList = new ArrayList();
       this.reqIdMap = new HashMap();
       this.mBytesPerChannel = 2;
       this.asrPb = new StentorPlugin$2(this);
       this.asrSendPacketListener = new StentorPlugin$3(this);
       this.setupHandler();
    }
    public static void a(StentorPlugin p0){
       p0.lambda$startAsrWriting$0();
    }
    public static void b(StentorPlugin p0){
       p0.lambda$stopAsrWriting$1();
    }
    private void lambda$startAsrWriting$0(){
       StentorPlugin tasr = this.asr;
       if (tasr != null) {
          tasr.b();
       }
       return;
    }
    private void lambda$stopAsrWriting$1(){
       StentorPlugin tasr = this.asr;
       if (tasr != null) {
          tasr.c();
       }
       return;
    }
    public long createNativePlugin(){
       Object obj = PatchProxy.apply(null, this, StentorPlugin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeCreateStentorPlugin();
    }
    public native final long nativeCreateStentorPlugin();
    public native final void nativeDestroyStentorPlugin(long p0);
    public native void nativeNetworkError(long p0,int p1);
    public native void nativeUpdateAsrResult(long p0,String p1,String p2,int p3,int p4,long p5,String p6);
    public final void onAudioFrame(byte[] p0,int p1,int p2,int p3,long p4){
       StentorPlugin stentorPlugi = StentorPlugin.class;
       if (PatchProxy.isSupport(stentorPlugi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stentorPlugi, "7")) {
             return;
          }
       }
       if (this.isReleased()) {
          return;
       }else {
          this.writeAudioData(p0, p1, p2, p3, p4);
          return;
       }
    }
    public final void onUpdateAsrConfig(AsrConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StentorPlugin.class, "8")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       AsrConfig messageComma = p0.messageCommand;
       if (messageComma != null && !messageComma.isEmpty()) {
          StentorPlugin.MESSAGE_SDK_COMMAND = p0.messageCommand;
       }
       messageComma = p0.receiveCommand;
       if (messageComma != null && !messageComma.isEmpty()) {
          StentorPlugin.MESSAGE_SDK_RECEIVE_PUSH_COMMAND = p0.receiveCommand;
       }
       messageComma = p0.requestMode;
       if (messageComma != null && !messageComma.isEmpty()) {
          StentorPlugin.REQUEST_MODE = p0.requestMode;
       }
       if (this.asr == null || !(StentorPlugin.LAST_MESSAGE_SDK_RECEIVE_PUSH_COMMAND).equals(StentorPlugin.MESSAGE_SDK_RECEIVE_PUSH_COMMAND)) {
          Asr uAsr = new Asr();
          this.asr = uAsr;
          uAsr.m(this.asrPb, StentorPlugin.REQUEST_MODE);
          String[] stringArray = new String[]{StentorPlugin.MESSAGE_SDK_RECEIVE_PUSH_COMMAND};
          f.e().o(new StentorPlugin$5(this), stringArray);
          StentorPlugin.LAST_MESSAGE_SDK_RECEIVE_PUSH_COMMAND = StentorPlugin.MESSAGE_SDK_RECEIVE_PUSH_COMMAND;
       }
       this.asr.r(p0.timeOutInSecond);
       this.asr.t(1);
       int i = StentorPlugin$6.$SwitchMap$com$kwai$video$westeros$stentorplugin$AsrConfig$AsrControl[p0.control.ordinal()];
       if (i != 1) {
          if (i == 2) {
             this.stopAsrWriting();
          }
       }else {
          this.startAsrWriting();
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin.class, "1")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       this.handler.post(new StentorPlugin$1(this));
       super.release();
       return;
    }
    public void releaseNativePlugin(long p0){
       StentorPlugin stentorPlugi = StentorPlugin.class;
       if (PatchProxy.isSupport(stentorPlugi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, stentorPlugi, "3")) {
          return;
       }
       this.nativeDestroyStentorPlugin(p0);
       return;
    }
    public final void setupHandler(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin.class, "9")) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("com.westeros.stentor.plugin");
       handlerThrea.start();
       this.handler = new Handler(handlerThrea.getLooper());
       return;
    }
    public void startAsrWriting(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin.class, "4")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       if (this.enableAsr == null) {
          this.enableAsr = true;
          this.handler.post(new a(this));
       }
       return;
    }
    public void stopAsrWriting(){
       if (PatchProxy.applyVoid(null, this, StentorPlugin.class, "6")) {
          return;
       }
       if (this.isReleased()) {
          return;
       }
       if (this.enableAsr != null) {
          this.enableAsr = false;
          this.handler.post(new b(this));
       }
       return;
    }
    public void writeAudioData(byte[] p0,int p1,int p2,int p3,long p4){
       StentorPlugin stentorPlugi = StentorPlugin.class;
       if (PatchProxy.isSupport(stentorPlugi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, stentorPlugi, "5")) {
             return;
          }
       }
       if (this.isReleased()) {
          return;
       }else {
          StentorPlugin$4 u4 = new StentorPlugin$4(this, p0, p1, p2, p3);
          this.handler.post(v12);
          return;
       }
    }
}
