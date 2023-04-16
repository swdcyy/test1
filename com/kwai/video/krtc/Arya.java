package com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.utils.c;
import android.content.Context;
import com.kwai.video.krtc.a;
import com.kwai.video.krtc.AryaContext;
import java.lang.Object;
import com.kwai.video.krtc.a$a;
import com.kwai.video.krtc.c;
import com.kwai.video.krtc.utils.PlatformCapability;
import java.lang.String;
import android.net.Network;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.FileOutputStream;
import com.kwai.video.krtc.utils.Log;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.net.NetworkInfo;
import com.kwai.video.krtc.observers.ConnectivityObserver;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.krtc.rtcengine.LiveTranscoding;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.krtc.Arya$LiveStreamParam;
import java.util.List;
import com.kwai.video.krtc.Arya$NicInfo;
import com.kwai.video.krtc.AryaAudioConfigQosInfo;
import com.kwai.video.krtc.observers.AudioRecordingObserver;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Exception;
import java.lang.Long;
import com.kwai.video.krtc.Arya$KWAryaLayout;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.kwai.video.krtc.SignalMessageHandler;
import com.kwai.video.krtc.observers.AryaCallObserver;
import com.kwai.video.krtc.observers.AryaQosObserver;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.utils.a;
import com.kwai.video.krtc.Arya$1;
import android.os.Looper;
import com.kwai.video.krtc.Arya$2;
import com.kwai.video.krtc.EglContextHolder;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import android.content.IntentFilter;
import com.kwai.video.krtc.Arya$3;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.video.krtc.Arya$4;
import com.kwai.video.krtc.observers.RawAudioObserver;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import com.kwai.video.krtc.rtcengine.DataStreamConfig;
import com.kwai.video.krtc.Arya$DirectorConfig;
import com.kwai.video.krtc.observers.DirectorObserver;
import com.kwai.video.krtc.rtcengine.RtcEngineHttpRequestContext;
import com.kwai.video.krtc.observers.IRtcEngineHttpObserver;
import android.os.Build;
import android.os.Build$VERSION;
import com.kwai.video.krtc.NetworkUtils;
import java.lang.Float;
import java.util.ArrayList;
import com.kwai.video.krtc.observers.AryaChannelSummaryInfoObserver;
import com.kwai.video.krtc.Arya$AryaDeviceInfo;
import com.kwai.video.krtc.QosInfo;
import com.kwai.video.krtc.Arya$SignalingMessageInfo;
import com.kwai.video.krtc.Arya$AryaMicrophoneInfo;
import com.kwai.video.krtc.Arya$ParticipantMediaInfo;
import com.kwai.video.krtc.Arya$LayoutItem;
import java.util.Timer;
import com.kwai.video.krtc.Arya$11;
import java.util.TimerTask;
import com.kwai.video.krtc.Arya$InitParam;
import android.graphics.Bitmap;
import com.kwai.video.krtc.GL.TextureBuffer;
import com.kwai.video.krtc.Arya$VideoFrameAttribute;
import com.kwai.video.krtc.Arya$12;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import android.net.ConnectivityManager;
import java.lang.reflect.Method;
import androidx.core.content.ContextCompat;
import com.kwai.video.krtc.Arya$13;
import android.net.NetworkRequest$Builder;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import com.kwai.video.krtc.Arya$14;
import com.kwai.video.krtc.Arya$15;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.video.krtc.observers.AryaResultObserver;
import com.kwai.video.krtc.AryaEventCollection$ActionEvent;
import com.kwai.video.krtc.Arya$AryaConfig;
import com.kwai.video.krtc.observers.LiveStreamBgmOffsetObserver;
import com.kwai.video.krtc.Arya$KWAryaVideoEncodeParameter;
import com.kwai.video.krtc.observers.MediaFrameObserver;
import com.kwai.video.krtc.rtcengine.RtcEngine$VideoEncoderConfiguration;
import com.kwai.video.krtc.observers.AudioMixerObserver;
import com.kwai.video.krtc.observers.FileStreamingObserver;
import com.kwai.video.krtc.observers.AryaWebsocketObserver;
import java.lang.NullPointerException;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;
import com.kwai.video.krtc.observers.a;
import com.kwai.video.krtc.Arya$5;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import com.kwai.video.krtc.Arya$AryaAudioDeviceStatusListener;
import com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;
import android.media.projection.MediaProjection;
import com.kwai.video.krtc.observers.BgmObserver;
import com.kwai.video.krtc.Arya$6;
import com.kwai.video.krtc.a$b;
import com.kwai.video.krtc.Arya$7;
import com.kwai.video.krtc.Arya$8;
import com.kwai.video.krtc.observers.KaraokeScoreObserver;
import com.kwai.video.krtc.Arya$10;
import com.kwai.video.krtc.a$c;
import com.kwai.video.krtc.Arya$16;
import com.kwai.video.stannis.observers.DataReadyObserver;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import com.kwai.video.krtc.Arya$9;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.AssertionError;

public class Arya	// class@000694
{
    public a$a A;
    public boolean B;
    public AryaContext C;
    public c D;
    public boolean E;
    public boolean F;
    public int G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;
    public Timer M;
    public DataReadyObserver N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public BroadcastReceiver T;
    public BroadcastReceiver U;
    public BroadcastReceiver V;
    public int W;
    public String X;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public ConnectivityManager l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Context r;
    public SignalMessageHandler s;
    public long t;
    public AryaQosObserver u;
    public int v;
    public boolean w;
    public String x;
    public String y;
    public a z;
    public static ConnectivityManager$NetworkCallback f;
    public static ConnectivityManager$NetworkCallback g;
    public static ConnectivityManager$NetworkCallback h;
    public static Network i;
    public static Network j;
    public static Network k;

    static {
       c.a();
       Arya.f = null;
       Arya.g = null;
       Arya.h = null;
       Arya.i = null;
       Arya.j = null;
       Arya.k = null;
    }
    public void Arya(Context p0,a p1,AryaContext p2){
       super();
       this.a = false;
       this.b = 0;
       this.d = false;
       this.e = 0;
       this.l = null;
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = false;
       this.q = true;
       this.v = 0;
       this.w = false;
       this.x = "";
       this.y = "";
       this.z = null;
       this.A = null;
       this.B = false;
       this.C = null;
       this.D = null;
       this.E = false;
       this.F = true;
       this.G = 0;
       this.H = "";
       this.I = "";
       this.J = "";
       this.K = false;
       this.L = false;
       this.M = null;
       this.N = null;
       this.O = false;
       this.P = true;
       this.Q = -1;
       this.R = -1;
       this.S = -1;
       this.T = null;
       this.U = null;
       this.V = null;
       this.W = 0;
       this.X = "none;;";
       this.c = false;
       this.C = p2;
       this.t = this.nativeCreateVoip(p2.A);
       this.r = p0;
       this.z = p1;
       a$a uoa = new a$a();
       this.A = uoa;
       uoa.b = this.t;
       this.D = new c();
       PlatformCapability.a(p0);
       this.nativeReportStannisVersion(this.t, p1.h());
    }
    public static int a(Arya p0,int p1){
       p0.G = p1;
       return p1;
    }
    public static Network a(Network p0){
       Arya.i = p0;
       return p0;
    }
    public static String a(Context p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, Arya.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getFilesDir()+p1;
       File uFile = new File(obj);
       if (uFile.exists()) {
          return obj;
       }
       try{
          InputStream inputStream = SplitAssetHelper.open(p0.getAssets(), p1);
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          byte[] uobyteArray = new byte[1024];
          int i = inputStream.read(uobyteArray);
          while (i > 0) {
             uFileOutputS.write(uobyteArray, 0, i);
          }
          inputStream.close();
          uFileOutputS.close();
          if (obj.isEmpty()) {
             Log.i("Arya", "copyDenoiseModelFile modelName:"+p1+" failed");
          }else {
             Log.i("Arya", "copyDenoiseModelFile file:"+obj);
          }
          return obj;
       }catch(java.io.FileNotFoundException e7){
          Log.i("Arya", "open file exception:"+e7.getMessage());
          return "";
       }catch(java.io.IOException e7){
          Log.i("Arya", "read file exception:"+e7.getMessage());
          return "";
       }
    }
    public static String a(Arya p0){
       return p0.x;
    }
    public static String a(Arya p0,NetworkInfo p1){
       return p0.a(p1);
    }
    public static void a(Arya p0,int p1,int p2,int p3){
       p0.a(p1, p2, p3);
    }
    public static void a(Arya p0,long p1,int p2,int p3){
       p0.nativeSetBatteryInfo(p1, p2, p3);
    }
    public static void a(Arya p0,long p1,int p2,String p3,String p4){
       p0.nativeNotifyNetworkChange(p1, p2, p3, p4);
    }
    public static void a(Arya p0,long p1,String p2,String p3,long p4){
       p0.nativeSendMetaData(p1, p2, p3, p4);
    }
    public static void a(Arya p0,long p1,boolean p2){
       p0.nativeSendForceTransfer(p1, p2);
    }
    public static void a(Arya p0,long p1,byte[] p2,int p3,int p4,int p5,long p6,boolean p7,int p8){
       p0.nativeInputRawAudioByteArray(p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public static void a(Arya p0,boolean p1){
       p0.a(p1);
    }
    public static void a(Arya p0,byte[] p1){
       p0.a(p1);
    }
    public static boolean a(Arya p0,long p1){
       return p0.nativeIsEnableDirectorScaleSize(p1);
    }
    public static boolean a(Arya p0,long p1,int p2){
       return p0.nativeIsPKSessionId(p1, p2);
    }
    public static boolean a(Arya p0,String p1){
       return p0.a(p1);
    }
    public static int b(Arya p0,int p1){
       p0.W = p1;
       return p1;
    }
    public static Network b(Network p0){
       Arya.j = p0;
       return p0;
    }
    public static String b(Arya p0){
       return p0.y;
    }
    public static String b(Arya p0,String p1){
       p0.y = p1;
       return p1;
    }
    public static int c(Arya p0,int p1){
       p0.S = p1;
       return p1;
    }
    public static long c(Arya p0){
       return p0.t;
    }
    public static Network c(Network p0){
       Arya.k = p0;
       return p0;
    }
    public static String c(Arya p0,String p1){
       p0.I = p1;
       return p1;
    }
    public static int d(Arya p0,int p1){
       p0.R = p1;
       return p1;
    }
    public static a d(Arya p0){
       return p0.z;
    }
    public static String d(Arya p0,String p1){
       p0.x = p1;
       return p1;
    }
    public static String e(Arya p0,String p1){
       p0.X = p1;
       return p1;
    }
    public static void e(Arya p0,int p1){
       p0.a(p1);
    }
    public static boolean e(Arya p0){
       return p0.E;
    }
    public static boolean f(Arya p0){
       return p0.F;
    }
    public static boolean g(Arya p0){
       return p0.B;
    }
    public static a$a h(Arya p0){
       return p0.A;
    }
    public static AryaContext i(Arya p0){
       return p0.C;
    }
    public static void j(Arya p0){
       p0.e();
    }
    public static boolean k(Arya p0){
       return p0.d;
    }
    public static boolean l(Arya p0){
       return p0.q;
    }
    public static String m(Arya p0){
       return p0.X;
    }
    public static int n(Arya p0){
       return p0.W;
    }
    public static native void nativeProbeConnectivity(long p0,String p1,int p2,int p3,int p4,ConnectivityObserver p5);
    public static int o(Arya p0){
       return p0.S;
    }
    public static int p(Arya p0){
       return p0.R;
    }
    public static c q(Arya p0){
       return p0.D;
    }
    public static void r(Arya p0){
       p0.g();
    }
    public static boolean s(Arya p0){
       return p0.O;
    }
    public int AddPublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeAddPublishStreamUrl(this.t, p0, p1);
       return 0;
    }
    public boolean IsAudioMusicModeEnabled(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "262");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsAudioMusicModeEnabled(this.t);
    }
    public int RemovePublishStreamUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeRemovePublishStreamUrl(this.t, p0, p1);
       return 0;
    }
    public void SetAudioProfile(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "144")) {
          return;
       }
       this.nativeSetAudioProfile(this.t, p0, p1);
       return;
    }
    public void SetEnablePublishBgmOffset(boolean p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uArya, "143")) {
          return;
       }
       this.nativeSetEnablePublishBgmOffset(this.t, p0, p1);
       return;
    }
    public void SetEnableReplaceImageInnerMix(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "257")) {
          return;
       }
       this.nativeSetEnableReplaceImageInnerMix(this.t, this.P);
       return;
    }
    public int SetLiveTranscoding(String p0,LiveTranscoding p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeSetLiveTranscoding(this.t, p0, p1);
       return 0;
    }
    public void SetVoicePartyKtvMode(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya.class, "142")) {
          return;
       }
       this.nativeSetVoicePartyKtvMode(this.t, p0, p1, p2, p3);
       return;
    }
    public int StopLiveTranscoding(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeStopLiveTranscoding(this.t, p0);
       return 0;
    }
    public final String a(NetworkInfo p0){
       String obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "332");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.isAvailable()) {
          return "none;;";
       }
       obj = p0.getTypeName();
       int type = p0.getType();
       String extraInfo = p0.getExtraInfo();
       String subtypeName = p0.getSubtypeName();
       String str = "3G";
       if (type == 1) {
          obj = "WiFi";
       }else if(!type){
          switch (p0.getSubtype()){
              case 1:
              case 4:
              case 7:
              case 11:
              case 2:
                subtypeName = "2G";
                break;
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 5:
             label_0054 :
                subtypeName = str;
                break;
              case 13:
                subtypeName = "4G";
                break;
              default:
                if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && (subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) {
                   goto label_0054 ;
                }
          }
       }
       Locale eNGLISH = Locale.ENGLISH;
       Object[] objArray = new Object[3];
       objArray[0] = obj;
       if (TextUtils.isEmpty(subtypeName)) {
          subtypeName = "";
       }
       objArray[1] = subtypeName;
       int i = 2;
       if (TextUtils.isEmpty(extraInfo)) {
          extraInfo = "";
       }
       objArray[i] = extraInfo;
       return String.format(eNGLISH, "%s;%s;%s", objArray);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "263")) {
          return;
       }
       Log.i("Arya", "destroy "+this);
       this.nativeDestroyVoip(this.t);
       this.t = 0;
       return;
    }
    public final void a(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "97")) {
          return;
       }
       this.nativeSetSignalStrength(this.t, p0);
       return;
    }
    public final void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "279")) {
          return;
       }
       if (!this.nativeHasPKSession(this.t) && this.nativeIsLiveStreamSessionId(this.t, p0)) {
          this.nativeUpdateMixOutputSize(this.t, p1, p2);
       }
       return;
    }
    public final void a(Arya$LiveStreamParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "278")) {
          return;
       }
       List list = this.m();
       if (!list.isEmpty()) {
          Arya$NicInfo[] nicInfoArray = new Arya$NicInfo[list.size()];
          p0.localNics = nicInfoArray;
          p0.localNics = list.toArray(nicInfoArray);
       }
       return;
    }
    public final void a(AryaAudioConfigQosInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "312")) {
          return;
       }
       this.nativeReportAudioConfigQos(this.t, p0);
       return;
    }
    public final void a(AudioRecordingObserver p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "195")) {
          return;
       }
       this.startAudioEngine(p2);
       this.nativeStartAudioRecording(this.t, p0, p1, p2);
       return;
    }
    public final void a(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "329")) {
          return;
       }
       if (p0 != null) {
          String str = "director_mix_method";
          if (p0.has(str)) {
             try{
                int intx = p0.getInt(str);
                Log.i("Arya", "director_mix_method: "+intx);
                if (intx >= 0 || intx <= 1) {
                   this.Q = intx;
                }
             }catch(org.json.JSONException e4){
                Log.w("Arya", "parse director mix method failed! "+e4.toString());
                e4.printStackTrace();
             }
          }
       }
    }
    public final void a(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "258")) {
          return;
       }
       this.nativeSetRtcAudioDtxIgnored(this.t, p0);
       return;
    }
    public final void a(byte[] p0){
       String str = "bgmVolume";
       String str1 = "bgmPitch";
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "273")) {
          return;
       }
       if (this.e == 1 && this.d != null) {
          try{
             JSONObject jSONObject = new JSONObject(new String(p0));
             if (jSONObject.has(str1)) {
                int intx = jSONObject.getInt(str1);
                Log.i("Arya", "handleGuestAudioInfo: pitch: "+intx);
                this.z.m(intx);
             }
             if (jSONObject.has(str)) {
                float f = (float)jSONObject.getDouble(str);
                Log.i("Arya", "handleGuestAudioInfo: bgmVolume: "+f);
                this.z.f(f);
                this.z.g(f);
             }
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
       }
    }
    public final void a(byte[] p0,int p1,int p2,int p3,long p4){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "60")) {
             return;
          }
       }
       if (this.c()) {
          this.nativeInputRawAudioByteArray(uArya.t, p0, p1, p2, p3, p4, false, 0);
       }
       if (this.d()) {
          this.nativeInputRawAudioByteArray(uArya.t, p0, p1, p2, p3, p4, true, 0);
       }
       return;
    }
    public final boolean a(int p0,Arya$KWAryaLayout[] p1,int p2,int p3,ByteBuffer p4,ByteBuffer p5){
       Arya uArya = this;
       object oobject = p1;
       int i = p2;
       int i1 = p3;
       Arya uArya1 = Arya.class;
       int i2 = 0;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[6];
          objArray[i2] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          Object obj = PatchProxy.apply(objArray, this, uArya1, "232");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = " should be even number";
       String str1 = "updateLayoutAndResolutionForScene ";
       String str2 = "Arya";
       if (this.b(i) || this.b(i1)) {
          Log.w(str2, str1+p0+" width "+i+" and height "+i1+str);
       }
       while (i2 < oobject.length) {
          String str3 = " and layouts[";
          String str4 = " layouts[";
          if (this.b(oobject[i2].w) || this.b(oobject[i2].h)) {
             Log.w(str2, str1+p0+str4+i2+"].w "+oobject[i2].w+str3+i2+"].h "+oobject[i2].h+str);
          }
          if (oobject[i2].x > i || oobject[i2].y > i1) {
             Log.w(str2, str1+p0+str4+i2+"].x "+oobject[i2].x+str3+i2+"].y "+oobject[i2].y+" should be smaller than directorOutputWidth and directorOutputHeight");
          }
          Log.i(str2, "updateLayoutAndResolutionForScene:"+p0+", sourceId:"+oobject[i2].sourceId+", userId:"+oobject[i2].userId);
          i2 = i2 + 1;
       }
       return this.nativeUpdateLayoutAndResolutionForScene(uArya.t, p0, p1, p2, p3, p4, p5);
    }
    public synchronized final boolean a(SignalMessageHandler p0,AryaCallObserver p1,AryaQosObserver p2,EglBase$Context p3,boolean p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uArya, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("Arya", "[Arya] init arya sdk, needCreateEglContext: "+p4+", enableWebSocket: "+this.p);
       if (this.B != null) {
          Log.w("Arya", "[Arya] already inited");
          return 0;
       }else {
          a.a(this.r);
          Log.initialize(this.r);
          this.s = p0;
          this.u = p2;
          p0.a = new Arya$1(this, p1);
          Looper looper = (p1 != null)? p1.getLooper(): Looper.myLooper();
          Arya$2 u2 = new Arya$2(this, looper, p1);
          if (p3 == null && p4) {
             Log.i("Arya", "[Arya] eglContext is null, get shared egl context");
             p3 = EglContextHolder.sharedContext();
          }
          this.nativeInitVoip(this.t, u2, this.p);
          this.nativeSetCodecFactories(this.t, this.r, p3);
          if (this.p != null) {
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
             Arya$3 u3 = new Arya$3(this);
             this.T = u3;
             UniversalReceiver.e(this.r, u3, intentFilter);
          }
          Arya$4 u4 = new Arya$4(this);
          this.U = u4;
          UniversalReceiver.e(this.r, u4, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          this.C.a();
          this.B = true;
          return 1;
       }
    }
    public final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.isEmpty())? true: false;
       return b;
    }
    public void addAudioBypassDataObserver(RawAudioObserver p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "212")) {
          return;
       }
       this.z.a(p0, p1);
       return;
    }
    public void addAudioSceneObserver(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "202")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void addMixTrack(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "282")) {
          return;
       }
       this.z.q(p0);
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "311")) {
          return;
       }
       this.nativeReportQos(this.t, p0);
       return;
    }
    public final void b(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "330")) {
          return;
       }
       if (p0 != null) {
          String str = "use_gl_es30";
          if (p0.has(str)) {
             try{
                boolean booleanx = p0.getBoolean(str);
                Log.i("Arya", "use_gl_es30: "+booleanx);
                SurfaceTextureHelper.SetUseGlEs30(booleanx);
             }catch(org.json.JSONException e4){
                Log.w("Arya", "parse use gl es30 failed! "+e4.toString());
                e4.printStackTrace();
             }
          }
       }
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "264");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.i();
    }
    public final boolean b(int p0){
       boolean b = true;
       if ((p0 % 2) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public int bindSocket(long p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uArya, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeBindSocket(this.t, p0);
    }
    public void broadcastToOtherParticipants(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "92")) {
          return;
       }
       this.nativeBroadcastToOtherParticipants(this.t, p0, 0);
       return;
    }
    public void broadcastToOtherParticipantsV3(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "93")) {
          return;
       }
       this.nativeBroadcastToOtherParticipants(this.t, p0, 9);
       return;
    }
    public final String c(int p0){
       String str;
       if (p0 != 20) {
          switch (p0){
              case 0:
                str = "Headset";
                break;
              case 1:
                str = "Earpiece";
                break;
              case 2:
                str = "HeadsetNoMic";
                break;
              case 3:
                str = "Speakerphone";
                break;
              case 4:
                str = "Loudspeaker";
                break;
              case 5:
                str = "HeadsetBluetooth";
                break;
              case 6:
                str = "Usb";
                break;
              case 7:
                str = "Hdmi";
                break;
              default:
                str = "Unknown";
          }
       }else {
          str = "BuiltinMic";
       }
       return str;
    }
    public final boolean c(){
       Arya tG = this.G;
       boolean b = (tG == 512 || tG == 2048)? true: false;
       return b;
    }
    public boolean checkAudioSceneCompatible(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "84");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeCheckAudioSceneCompatible(this.t, p0, p1);
    }
    public boolean checkAudioSceneExclusive(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "83");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeCheckAudioSceneExclusive(this.t, p0, p1);
    }
    public void cleanSoundEffectCache(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "158")) {
          return;
       }
       this.z.t();
       return;
    }
    public void clearAllAudioBuffer(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "218")) {
          return;
       }
       this.z.F();
       return;
    }
    public void clearAudioBuffer(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "217")) {
          return;
       }
       this.z.h(p0);
       return;
    }
    public void createDataStream(String p0,int p1,DataStreamConfig p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, Arya.class, "94")) {
          return;
       }
       this.nativeCreateDataStream(this.t, p0, p1, p2);
       return;
    }
    public boolean createScene(Arya$DirectorConfig p0,DirectorObserver p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "226");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.eglContext == null) {
          p0.eglContext = EglContextHolder.sharedContext();
       }
       this.nativeCreateDirector(this.t, p0.outputWidth, p0.outputHeight, p1);
       Arya tQ = this.Q;
       if (tQ == -1) {
          tQ = p0.mixMethod;
       }
       return this.nativeCreateScene(this.t, p0.sceneId, p0.eglContext, p0.mixMode, tQ);
    }
    public final boolean d(){
       Arya tG = this.G;
       boolean b = (tG == 768 || tG == 2048)? true: false;
       return b;
    }
    public void destroyScene(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "234")) {
          return;
       }
       this.nativeDestroySceneWithId(this.t, p0);
       this.nativeDestroyDirector(this.t);
       return;
    }
    public void disableAttenuation(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "248")) {
          return;
       }
       this.z.a(p0, false);
       this.nativeDisableAttenuation(this.t, p0);
       return;
    }
    public void disableAudioEngine(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "225")) {
          return;
       }
       this.z.c();
       return;
    }
    public void disableAudioRx(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "78")) {
          return;
       }
       this.nativeSetAudioRxDisabled(this.t, p0);
       return;
    }
    public void disableAudioTx(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "76")) {
          return;
       }
       this.nativeSetAudioTxDisabled(this.t, p0);
       return;
    }
    public int disableDenoise(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.b(false, "");
       return false;
    }
    public void disableDualStreamMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "306")) {
          return;
       }
       this.nativeDisableDualStreamMode(this.t, p0);
       return;
    }
    public void disableHeadphoneMonitor(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "165")) {
          return;
       }
       this.C.s = false;
       this.z.K();
       return;
    }
    public void disableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "169")) {
          return;
       }
       this.nativeDisableLastmileTest(this.t);
       return;
    }
    public void disablePushCustomVideoData(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "335")) {
          return;
       }
       this.nativeDisablePushCustomVideoData(this.t);
       return;
    }
    public void disableRangeAudio(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "244")) {
          return;
       }
       this.nativeDisableRangeAudio(this.t, p0);
       return;
    }
    public int disableRemotePriority(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "327");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeDisableRemotePriority(this.t, p0);
       return 0;
    }
    public void disableSpatializer(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "246")) {
          return;
       }
       this.z.b(p0, false);
       this.nativeDisableSpatializer(this.t, p0);
       return;
    }
    public void disableVideoMix(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "236")) {
          return;
       }
       this.nativeDisableVideoMix(this.t);
       return;
    }
    public void disableVideoTx(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "71")) {
          return;
       }
       this.nativeSetVideoTxDisabled(this.t, p0);
       return;
    }
    public void disableVideoTx(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "293")) {
          return;
       }
       this.nativeSetVideoTxDisabledWithCallId(this.t, p0, p1);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "210")) {
          return;
       }
       this.z.A();
       return;
    }
    public void enableAttenuation(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "247")) {
          return;
       }
       this.z.a(p0, true);
       this.nativeEnableAttenuation(this.t, p0);
       return;
    }
    public void enableAudioEngine(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "224")) {
          return;
       }
       this.z.b();
       return;
    }
    public void enableAudioRx(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "77")) {
          return;
       }
       this.nativeSetAudioRxEnabled(this.t, p0);
       return;
    }
    public void enableAudioTx(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "75")) {
          return;
       }
       this.nativeSetAudioTxEnabled(this.t, p0);
       return;
    }
    public int enableDenoise(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.d(Arya.a(this.r, "micpop_deepns.tflite"));
       this.z.c(Arya.a(this.r, "deep_aec.tflite"));
       this.z.b(true, Arya.a(this.r, "common_denoise.tflite"));
       return 0;
    }
    public void enableDualStreamMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "305")) {
          return;
       }
       this.nativeEnableDualStreamMode(this.t, p0);
       return;
    }
    public boolean enableHeadphoneMonitor(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uArya, "164");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.C.s = true;
       return this.z.r(p0);
    }
    public void enableHrtf(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "314")) {
          return;
       }
       Log.i("Arya", "[Arya] enableHrtf "+p0);
       this.c = p0;
       return;
    }
    public void enableLastmileTest(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "168")) {
          return;
       }
       this.nativeEnableLastmileTest(this.t);
       return;
    }
    public void enableMixingAudioSegment(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "201")) {
          return;
       }
       this.C.r = p0;
       this.z.o(p0);
       return;
    }
    public void enablePushCustomVideoData(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "334")) {
          return;
       }
       this.nativeEnablePushCustomVideoData(this.t);
       return;
    }
    public void enableRangeAudio(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "243")) {
          return;
       }
       this.nativeEnableRangeAudio(this.t, p0);
       return;
    }
    public int enableRemotePriority(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "326");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nativeEnableRemotePriority(this.t, p0, p1);
       return 0;
    }
    public void enableSpatializer(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "245")) {
          return;
       }
       this.z.b(p0, true);
       this.nativeEnableSpatializer(this.t, p0);
       return;
    }
    public void enableVideoMix(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "235")) {
          return;
       }
       this.nativeEnableVideoMix(this.t);
       return;
    }
    public void enableVideoTx(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "72")) {
          return;
       }
       this.nativeSetVideoTxEnabled(this.t, p0);
       return;
    }
    public void enableVideoTx(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "294")) {
          return;
       }
       this.nativeSetVideoTxEnabledWithCallId(this.t, p0, p1);
       return;
    }
    public int executeHttpRequest(RtcEngineHttpRequestContext p0,IRtcEngineHttpObserver p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "333");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeExecuteHttpRequest(this.t, p0, p1);
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "269");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "["+Build.MANUFACTURER+" | "+Build.MODEL+"]"+"["+Build$VERSION.RELEASE+" | "+Build$VERSION.SDK_INT+"]"+"["+Build.DEVICE+"]"+"["+NetworkUtils.getActiveNetworkDesc(this.r)+"]";
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "265")) {
          return;
       }
       this.a();
       super.finalize();
       return;
    }
    public int findFinalScene(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "85");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeFindFinalScene(this.t, p0, p1);
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "270")) {
          return;
       }
       if (this.e == null && this.d != null) {
          try{
             Object[] objArray = new Object[]{Float.valueOf(this.C.l)};
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("bgmPitch", this.C.o);
             jSONObject.put("bgmVolume", Float.valueOf(String.format("%.2f", objArray)));
             String str = jSONObject.toString();
             this.nativeBroadcastToOtherParticipants(this.t, str.getBytes(), 1);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public String[] getActiveSpeakers(){
       String[] stringArray;
       ArrayList obj = PatchProxy.apply(null, this, Arya.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Arya tz = this.z;
       if (tz == null) {
          stringArray = new String[0];
          return obj.toArray(stringArray);
       }else {
          stringArray = tz.e();
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             if (this.K != null && oobject.equals(this.J)) {
                Log.d("Arya", "getActiveSpeakers local user id: "+oobject+" was muted, filter it");
             }else {
                Log.d("Arya", "getActiveSpeakers active speaker user id: "+oobject);
                obj.add(oobject);
             }
             i = i + 1;
          }
          stringArray = new String[0];
          return obj.toArray(stringArray);
       }
    }
    public int[] getAllAudioOutputTypes(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "126");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.l();
    }
    public a getAudioEngineProxy(){
       return this.z;
    }
    public int getAudioOutputRouting(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "128");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.m();
    }
    public int getAudioOutputType(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.k();
    }
    public void getChannelSummaryInfo(String p0,AryaChannelSummaryInfoObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "21")) {
          return;
       }
       this.nativeGetChannelSummaryInfo(this.t, p0, p1);
       return;
    }
    public int getCurrentAudioScene(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "288");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.d();
    }
    public Arya$AryaDeviceInfo getCurrentDevice(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uArya, "317");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.z.w(p0);
    }
    public Arya$AryaDeviceInfo[] getDevices(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uArya, "318");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.z.x(p0);
    }
    public synchronized int getElapsedTime(String p0,boolean p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uArya, "313");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.B == null) {
          Log.w("Arya", "[Arya] already uninited");
          return -1;
       }else {
          return this.nativeGetElapsedTime(this.t, p0, p1);
       }
    }
    public int getKaraokeAverageScore(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "208");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.z();
    }
    public int getKaraokeScorePitch(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "207");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.y();
    }
    public int getKaraokeTotalScore(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "206");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.x();
    }
    public String getKtvQos(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "191");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.a(this.z.p(1000));
    }
    public long getNetSpeedMeasureSessionId(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.nativeGetNetSpeedMeasureSessionId(this.t);
    }
    public int getNetState(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetNetState(this.t);
    }
    public String getPeerUplinkReports(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetPeerUplinkReports(this.t, p0);
    }
    public QosInfo getQosInfo(){
       QosInfo obj = PatchProxy.apply(null, this, Arya.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.nativeGetQosInfo(this.t);
       obj.checkSelf(this.w);
       return obj;
    }
    public Arya$SignalingMessageInfo getSignalMessageInfo(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetSignalMessageInfo(this.t, p0);
    }
    public float[] getSongSectionScore(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "346");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.Q();
    }
    public int getSpeakerDeviceVolume(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.f();
    }
    public Arya$AryaMicrophoneInfo getStannisMicrophoneInfo(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.n();
    }
    public Arya$LayoutItem[] getVideoLayout(Arya$ParticipantMediaInfo[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetVideoLayout(this.t, p0);
    }
    public int getVoiceEnergy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.z.b(p0);
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "271")) {
          return;
       }
       if (this.e == null && this.d != null) {
          Arya tM = this.M;
          if (tM != null) {
             tM.cancel();
          }
          this.M = new Timer();
          this.M.schedule(new Arya$11(this), 0, 5000);
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "272")) {
          return;
       }
       Arya tM = this.M;
       if (tM != null) {
          tM.cancel();
          this.M = null;
       }
       return;
    }
    public synchronized boolean init(SignalMessageHandler p0,AryaCallObserver p1,AryaQosObserver p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Arya.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a(p0, p1, p2, null, true);
    }
    public synchronized boolean init(SignalMessageHandler p0,AryaCallObserver p1,AryaQosObserver p2,Arya$InitParam p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, Arya.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.p = p3.enableWebSocket;
       return this.a(p0, p1, p2, p3.eglContext, p3.needCreateEglContext);
    }
    public synchronized boolean init(SignalMessageHandler p0,AryaCallObserver p1,AryaQosObserver p2,EglBase$Context p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, Arya.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a(p0, p1, p2, p3, true);
    }
    public synchronized boolean init(SignalMessageHandler p0,AryaCallObserver p1,AryaQosObserver p2,boolean p3){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, Arya.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a(p0, p1, p2, null, p3);
    }
    public void inputImageToDirectorSource(Bitmap p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "237")) {
          return;
       }
       if (p0 != null) {
          ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p0.getByteCount());
          p0.copyPixelsToBuffer(uByteBuffer);
          this.nativeInputImageToDirectorSource(this.t, uByteBuffer, p0.getWidth(), p0.getHeight(), p1);
       }
       return;
    }
    public void inputPcmPlay(byte[] p0,int p1,int p2,int p3,long p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uArya, "221")) {
             return;
          }
       }
       this.z.c(p0, p1, p2, p3, p4);
       return;
    }
    public void inputRawAudio(byte[] p0,int p1,int p2,int p3,long p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uArya, "58")) {
             return;
          }
       }
       if (this.E == null) {
          return;
       }else if(this.F != null && this.z.i()){
          this.z.b(p0, p1, p2, p3, p4);
       }else {
          this.a(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void inputRawAudioForChat(byte[] p0,int p1,int p2,int p3,long p4){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "61")) {
             return;
          }
       }
       this.nativeInputRawAudioByteArray(uArya.t, p0, p1, p2, p3, p4, true, 0);
       return;
    }
    public int inputRawVideo(int p0,byte[] p1,int p2,int p3,long p4,int p5,int p6,boolean p7){
       Object obj = this;
       object oobject = p1;
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Boolean.valueOf(p7)};
          Object obj1 = PatchProxy.apply(objArray, obj, uArya, "62");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       return this.nativeInputRawVideoByteArray(obj.t, p0, p1, oobject.length, null, 0, p2, p3, p4, p5, p6, "", 1, p7);
    }
    public int inputRawVideo(TextureBuffer p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, Arya.class, "67");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0.release();
       return this.nativeInputRawVideoTextureBuffer(this.t, p0, p1, p2, this.P, p3);
    }
    public int inputRawVideo(TextureBuffer p0,String p1,boolean p2){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, Arya.class, "66");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.inputRawVideo(p0, p1, 1, p2);
    }
    public int inputRawVideo(ByteBuffer p0,Arya$VideoFrameAttribute p1){
       Arya uArya = this;
       Object obj = p1;
       Object obj1 = PatchProxy.applyTwoRefs(p0, obj, this, Arya.class, "65");
       if (obj1 != PatchProxyResult.class) {
          return obj1.intValue();
       }
       return this.nativeInputRawVideoByteBuffer(uArya.t, obj.format, p0, obj.width, obj.height, obj.timestamp, obj.rotation, obj.csp, obj.rois, obj.sourceId, uArya.P);
    }
    public int inputRawVideo(byte[] p0,Arya$VideoFrameAttribute p1,boolean p2){
       Arya$VideoFrameAttribute videoFrameAt = p1;
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, Arya.class, "63");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeInputRawVideoByteArray(this.t, videoFrameAt.format, p0, p0.length, null, 0, videoFrameAt.width, videoFrameAt.height, videoFrameAt.timestamp, videoFrameAt.rotation, videoFrameAt.csp, videoFrameAt.rois, videoFrameAt.sourceId, p2);
    }
    public int inputRawVideo(byte[] p0,byte[] p1,Arya$VideoFrameAttribute p2){
       Arya$VideoFrameAttribute videoFrameAt = p2;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Arya.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeInputRawVideoByteArray(this.t, videoFrameAt.format, p0, p0.length, p1, p1.length, videoFrameAt.width, videoFrameAt.height, videoFrameAt.timestamp, videoFrameAt.rotation, videoFrameAt.csp, videoFrameAt.rois, videoFrameAt.sourceId, false);
    }
    public void inputSpeakerAudio(byte[] p0,int p1,int p2,int p3,long p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uArya, "59")) {
             return;
          }
       }
       this.z.a(p0, p1, p2, p3, p4);
       return;
    }
    public void inputTrackData(int p0,byte[] p1,int p2,int p3,int p4,long p5){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "284")) {
             return;
          }
       }
       uArya.z.a(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void insertDataInLiveStream(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "91")) {
          return;
       }
       this.nativeSetDataInLiveStream(this.t, p0);
       return;
    }
    public boolean isSpeakerOn(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "133");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.M();
    }
    public boolean isStartingFileStreaming(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "184");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsStartingFileStreaming(this.t);
    }
    public boolean isSupportHeadphoneMonitor(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.J();
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "274")) {
          return;
       }
       if (this.V != null) {
          Log.i("Arya", "registerWifiRssi receiver already set");
          return;
       }else {
          Arya$12 u12 = new Arya$12(this);
          this.V = u12;
          UniversalReceiver.e(this.r, u12, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
          Log.i("Arya", "multiNic rssiReceiver RSSI recv registered, current "+this.r.getSystemService("wifi").getConnectionInfo().getRssi());
          return;
       }
    }
    public void joinChannel(String p0,String p1,String p2,int p3,boolean p4,int p5){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "31")) {
             return;
          }
       }
       List list = null;
       if (uArya.m != null && Build$VERSION.SDK_INT >= 23) {
          list = this.m();
       }
       this.nativeJoinChannel(uArya.t, p0, p1, p2, p3, p4, p5, list);
       return;
    }
    public final void k(){
       String str1;
       String str = "connectivity";
       if (PatchProxy.applyVoid(null, this, Arya.class, "275")) {
          return;
       }
       Log.i("Arya", "multiNic: prepareMultiNetwork");
       boolean b = true;
       try{
          int i = 0;
          if (this.l == null) {
             this.l = this.r.getSystemService(str);
          }
          Class[] uClassArray = new Class[i];
          Method declaredMeth = Class.forName(this.l.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", uClassArray);
          declaredMeth.setAccessible(b);
          Object[] objArray = new Object[i];
          boolean b1 = declaredMeth.invoke(this.l, objArray).booleanValue();
          try{
             Log.i("Arya", "multiNic: mobile date enabled:"+b1);
          label_007d :
             if (!b1) {
                return;
             }else {
                this.m = b;
                this.j();
                if (Arya.f != null) {
                   Log.i("Arya", "prepareMultiNetwork callback already set, no need to request again");
                   return;
                }else if(ContextCompat.checkSelfPermission(this.r, "android.permission.CHANGE_NETWORK_STATE")){
                   Log.i("Arya", "prepareMultiNetwork CHANGE_NETWORK_STATE permission not granted");
                   return;
                }else if(Build$VERSION.SDK_INT >= 23){
                   Log.i("Arya", "prepareMultiNetwork");
                   if (this.l == null) {
                      this.l = this.r.getSystemService(str);
                   }
                   if (Arya.f == null) {
                      Arya.f = new Arya$13(this);
                   }
                   NetworkRequest$Builder uBuilder = new NetworkRequest$Builder();
                   uBuilder.addTransportType(b);
                   this.l.requestNetwork(uBuilder.build(), Arya.f);
                   if (Arya.g == null) {
                      Arya.g = new Arya$14(this);
                   }
                   uBuilder = new NetworkRequest$Builder();
                   uBuilder.addCapability(i);
                   uBuilder.addTransportType(i);
                   this.l.requestNetwork(uBuilder.build(), Arya.g);
                   if (Arya.h == null) {
                      Arya.h = new Arya$15(this);
                   }
                   uBuilder = new NetworkRequest$Builder();
                   uBuilder.addTransportType(3);
                   this.l.requestNetwork(uBuilder.build(), Arya.h);
                   Log.i("Arya", "multiNic: network service requested");
                }else {
                   Log.i("Arya", "Will not call prepareMultiNetwork as model too old");
                }
                return;
             }
          }catch(java.lang.Exception e5){
             str1 = b1;
             Object obj = e5;
          }
          Log.i("Arya", "multiNic: mobile date enabled failed, "+e4);
          b1 = str1;
          goto label_007d ;
       }catch(java.lang.Exception e4){
          str1 = null;
          goto label_0068 ;
       }
    }
    public final Map l(){
       Network i1;
       int i2;
       HashMap obj = PatchProxy.apply(null, this, Arya.class, "276");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (Build$VERSION.SDK_INT < 23) {
          Log.i("Arya", "Will not call getLocalNics as model too old");
          return obj;
       }else {
          Iterator iterator = NetworkUtils.getActiveNetworkInterfaces().iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             Arya$NicInfo nicInfo = new Arya$NicInfo();
             nicInfo.ip = pair.second;
             Pair first = pair.first;
             String str = ", fd: ";
             int i = 1;
             String str1 = ", ip: ";
             if (first != null && first.contains("wlan")) {
                i1 = Arya.i;
                if (i1 != null) {
                   nicInfo.socketFd = this.bindSocket(i1.getNetworkHandle());
                   Log.i("Arya", "multiNic: wifi bind interface: "+first+str1+pair.second+", netId: "+Arya.i.getNetworkHandle()+str+nicInfo.socketFd);
                   if (!obj.containsKey(Integer.valueOf(i))) {
                      obj.put(Integer.valueOf(i), new ArrayList());
                   }
                   obj.get(Integer.valueOf(i)).add(nicInfo);
                }
             }
             if (first != null && (first.contains("rmnet") || first.contains("ccmni"))) {
                i1 = Arya.j;
                if (i1 != null) {
                   nicInfo.isCellular = i;
                   nicInfo.socketFd = this.bindSocket(i1.getNetworkHandle());
                   Log.i("Arya", "multiNic: mobile bind interface: "+first+str1+pair.second+", netId: "+Arya.j.getNetworkHandle()+str+nicInfo.socketFd);
                   i2 = 0;
                   if (!obj.containsKey(Integer.valueOf(i2))) {
                      obj.put(Integer.valueOf(i2), new ArrayList());
                   }
                   obj.get(Integer.valueOf(i2)).add(nicInfo);
                }
             }
             if (first != null && first.contains("eth")) {
                Network k = Arya.k;
                if (k != null) {
                   nicInfo.socketFd = this.bindSocket(k.getNetworkHandle());
                   Log.i("Arya", "multiNic: ethernet bind interface: "+first+str1+pair.second+", netId: "+Arya.k.getNetworkHandle()+str+nicInfo.socketFd);
                   i2 = 3;
                   if (!obj.containsKey(Integer.valueOf(i2))) {
                      obj.put(Integer.valueOf(i2), new ArrayList());
                   }
                   obj.get(Integer.valueOf(i2)).add(nicInfo);
                }
             }
             Log.i("Arya", "multiNic: unknown interface or network not available: "+first+str1+pair.second);
          }
          return obj;
       }
    }
    public void leaveChannel(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "32")) {
          return;
       }
       this.nativeLeaveChannel(this.t, p0, p1, p2);
       if (p2 == 1) {
          this.z.B();
          this.z.s();
          this.z.a(this.A);
          this.x = "";
       }
       if (p2 == 2) {
          this.y = "";
       }
       return;
    }
    public void loadSoundEffectCache(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "157")) {
          return;
       }
       this.z.f(p0);
       return;
    }
    public final List m(){
       Map obj = PatchProxy.apply(null, this, Arya.class, "277");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l();
       ArrayList uArrayList = new ArrayList();
       int i = 1;
       if (obj.size() > i && this.o == null) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(3),Integer.valueOf(i),Integer.valueOf(0)};
          Iterator iterator = Arrays.asList(integerArray).iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             if (obj.containsKey(Integer.valueOf(i))) {
                uArrayList.addAll(obj.get(Integer.valueOf(i)));
             }
          }
       }else {
          Log.i("Arya", "multiNic: interface not enough to open multiNic "+obj.size());
       }
       return uArrayList;
    }
    public void muteAllRemoteAudioStreams(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "107")) {
          return;
       }
       Log.d("Arya", "muteAllRemoteAudioStreams");
       this.nativeMuteAllRemoteAudioStreams(this.t);
       return;
    }
    public void muteAllRemoteAudioStreamsForCallId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "105")) {
          return;
       }
       Log.d("Arya", "muteAllRemoteAudioStreamsForCallId callId:"+p0);
       this.nativeMuteAllRemoteAudioStreamsForCallId(this.t, p0);
       return;
    }
    public void muteRemoteAudioStream(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "103")) {
          return;
       }
       Log.d("Arya", "muteRemoteAudioStream callId:"+p0+" userId:"+p1);
       this.nativeMuteRemoteAudioStream(this.t, p0, p1);
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "287")) {
          return;
       }
       Log.i("Arya", "[Arya] stopAudioEngine previous audio scene:"+this.G);
       this.z.a(this.A);
       return;
    }
    public native final void nativeAddPublishStreamUrl(long p0,String p1,String p2);
    public native final int nativeBindSocket(long p0,long p1);
    public native final void nativeBroadcastToOtherParticipants(long p0,byte[] p1,int p2);
    public native final boolean nativeCheckAudioSceneCompatible(long p0,int p1,int p2);
    public native final boolean nativeCheckAudioSceneExclusive(long p0,int p1,int p2);
    public native final void nativeCreateDataStream(long p0,String p1,int p2,DataStreamConfig p3);
    public native final boolean nativeCreateDirector(long p0,int p1,int p2,DirectorObserver p3);
    public native final boolean nativeCreateScene(long p0,int p1,EglBase$Context p2,int p3,int p4);
    public native final long nativeCreateVoip(long p0);
    public native final void nativeDestroyDirector(long p0);
    public native final void nativeDestroySceneWithId(long p0,int p1);
    public native final void nativeDestroyVoip(long p0);
    public native final void nativeDisableAttenuation(long p0,int p1);
    public native final void nativeDisableDualStreamMode(long p0,String p1);
    public native final void nativeDisableLastmileTest(long p0);
    public native final void nativeDisablePushCustomVideoData(long p0);
    public native final void nativeDisableRangeAudio(long p0,int p1);
    public native final void nativeDisableRemotePriority(long p0,String p1);
    public native final void nativeDisableSpatializer(long p0,int p1);
    public native final void nativeDisableVideoMix(long p0);
    public native final void nativeEnableAttenuation(long p0,int p1);
    public native final void nativeEnableDualStreamMode(long p0,String p1);
    public native final void nativeEnableLastmileTest(long p0);
    public native final void nativeEnablePushCustomVideoData(long p0);
    public native final void nativeEnableRangeAudio(long p0,int p1);
    public native final void nativeEnableRemotePriority(long p0,String p1,String p2);
    public native final void nativeEnableSpatializer(long p0,int p1);
    public native final void nativeEnableVideoMix(long p0);
    public native final int nativeExecuteHttpRequest(long p0,RtcEngineHttpRequestContext p1,IRtcEngineHttpObserver p2);
    public native final int nativeFindFinalScene(long p0,int p1,int p2);
    public native final void nativeGetChannelSummaryInfo(long p0,String p1,AryaChannelSummaryInfoObserver p2);
    public native final int nativeGetElapsedTime(long p0,String p1,boolean p2);
    public native final long nativeGetNetSpeedMeasureSessionId(long p0);
    public native final int nativeGetNetState(long p0);
    public native final String nativeGetPeerUplinkReports(long p0,String p1);
    public native final QosInfo nativeGetQosInfo(long p0);
    public native final Arya$SignalingMessageInfo nativeGetSignalMessageInfo(long p0,byte[] p1);
    public native final Arya$LayoutItem[] nativeGetVideoLayout(long p0,Arya$ParticipantMediaInfo[] p1);
    public native final boolean nativeHasPKSession(long p0);
    public native final void nativeInitVoip(long p0,AryaCallObserverInner p1,boolean p2);
    public native final void nativeInputImageToDirectorSource(long p0,ByteBuffer p1,int p2,int p3,int p4);
    public native final void nativeInputRawAudioByteArray(long p0,byte[] p1,int p2,int p3,int p4,long p5,boolean p6,int p7);
    public native final int nativeInputRawVideoByteArray(long p0,int p1,byte[] p2,int p3,byte[] p4,int p5,int p6,int p7,long p8,int p9,int p10,String p11,int p12,boolean p13);
    public native final int nativeInputRawVideoByteBuffer(long p0,int p1,ByteBuffer p2,int p3,int p4,long p5,int p6,int p7,String p8,int p9,boolean p10);
    public native final int nativeInputRawVideoTextureBuffer(long p0,TextureBuffer p1,String p2,int p3,boolean p4,boolean p5);
    public native final boolean nativeIsAudioMusicModeEnabled(long p0);
    public native final boolean nativeIsEnableDirectorScaleSize(long p0);
    public native final boolean nativeIsLiveStreamSessionId(long p0,int p1);
    public native final boolean nativeIsPKSessionId(long p0,int p1);
    public native final boolean nativeIsStartingFileStreaming(long p0);
    public native final void nativeJoinChannel(long p0,String p1,String p2,String p3,int p4,boolean p5,int p6,List p7);
    public native final void nativeLeaveChannel(long p0,String p1,int p2,int p3);
    public native final void nativeMuteAllRemoteAudioStreams(long p0);
    public native final void nativeMuteAllRemoteAudioStreamsForCallId(long p0,String p1);
    public native final void nativeMuteRemoteAudioStream(long p0,String p1,String p2);
    public native final void nativeNotifyNetworkChange(long p0,int p1,String p2,String p3);
    public native final void nativeOnBackground();
    public native final void nativeOnForeground();
    public native final void nativePause(long p0);
    public native final void nativePauseAllRemoteVideoStreams(long p0,String p1);
    public native final void nativePauseFileStreaming(long p0);
    public native final void nativePauseLiveRecording(long p0);
    public native final void nativePushCustomVideoData(long p0,byte[] p1);
    public native final void nativeRemovePublishStreamUrl(long p0,String p1,String p2);
    public native final void nativeReportAudioConfigQos(long p0,AryaAudioConfigQosInfo p1);
    public native final void nativeReportQos(long p0,String p1);
    public native final void nativeReportStannisVersion(long p0,String p1);
    public native final void nativeResume(long p0);
    public native final void nativeResumeAllRemoteVideoStreams(long p0,String p1);
    public native final void nativeResumeFileStreaming(long p0);
    public native final void nativeResumeLiveRecording(long p0);
    public native final void nativeSaveMoments(long p0,String p1,AryaResultObserver p2);
    public native final void nativeSeekFileStreamingToMs(long p0,long p1);
    public native final void nativeSendForceTransfer(long p0,boolean p1);
    public native final void nativeSendMetaData(long p0,String p1,String p2,long p3);
    public native final void nativeSendScreenCastInfo(long p0,byte[] p1);
    public native final void nativeSendStreamMessage(long p0,int p1,byte[] p2);
    public native final int nativeSetAVSyncSource(long p0,String p1,String p2);
    public native final void nativeSetActionEvent(long p0,AryaEventCollection$ActionEvent p1);
    public native final boolean nativeSetAsMainSourceOfScene(long p0,int p1,int p2);
    public native final void nativeSetAudioLowDelayMode(long p0,int p1);
    public native final void nativeSetAudioProfile(long p0,int p1,int p2);
    public native final void nativeSetAudioRecvRange(long p0,int p1);
    public native final void nativeSetAudioRxDisabled(long p0,String p1);
    public native final void nativeSetAudioRxEnabled(long p0,String p1);
    public native final void nativeSetAudioTeamId(long p0,int p1);
    public native final void nativeSetAudioTeamMode(long p0,int p1);
    public native final void nativeSetAudioTunnel(long p0,int p1);
    public native final void nativeSetAudioTxDisabled(long p0,String p1);
    public native final void nativeSetAudioTxEnabled(long p0,String p1);
    public native final void nativeSetBatteryInfo(long p0,int p1,int p2);
    public native final void nativeSetClientRole(long p0,String p1,int p2);
    public native final void nativeSetCodecFactories(long p0,Context p1,EglBase$Context p2);
    public native final void nativeSetCommentStreamAudioPts(long p0,long p1);
    public native final void nativeSetCommentStreamId(long p0,String p1);
    public native final void nativeSetCommentStreamVolume(long p0,float p1);
    public native final void nativeSetConfigs(long p0,Arya$AryaConfig p1);
    public native final void nativeSetDataInLiveStream(long p0,byte[] p1);
    public native final void nativeSetDefaultMuteAllRemoteAudioStreams(long p0,boolean p1);
    public native final void nativeSetDefaultNetworkProbeAudioKbps(long p0);
    public native final void nativeSetDefaultNetworkProbeVideoKbps(long p0);
    public native final void nativeSetEdgeGroupAddr(long p0,String p1);
    public native final void nativeSetEnableAudioMusicMode(long p0,boolean p1);
    public native final void nativeSetEnablePublishBgmOffset(long p0,boolean p1,int p2);
    public native final void nativeSetEnableReplaceImageInnerMix(long p0,boolean p1);
    public native final void nativeSetIntProperty(long p0,String p1,int p2,int p3);
    public native final void nativeSetKtpModelPath(long p0,String p1);
    public native final void nativeSetKtpRtcModelPath(long p0,String p1);
    public native final void nativeSetLiveStreamBgmOffsetCb(long p0,int p1,LiveStreamBgmOffsetObserver p2);
    public native final void nativeSetLiveStreamRtmpUrl(long p0,String p1);
    public native final void nativeSetLiveStreamVideoEncodeParam(long p0,Arya$KWAryaVideoEncodeParameter p1);
    public native final void nativeSetLiveTranscoding(long p0,String p1,LiveTranscoding p2);
    public native final void nativeSetLocalNetworkInfo(long p0,int p1,String p2);
    public native final int nativeSetLocalPublishFallbackOption(long p0,String p1,int p2);
    public native final void nativeSetLocalVideoDisabled(long p0);
    public native final void nativeSetLocalVideoEnabled(long p0);
    public native final void nativeSetLogo(long p0,ByteBuffer p1,int p2,int p3,float p4,float p5,int p6,boolean p7);
    public native final void nativeSetMediaCallback(long p0,MediaFrameObserver p1,int p2);
    public native final void nativeSetMixType(long p0,int p1);
    public native final void nativeSetMuteMicOfAllOthers(long p0,boolean p1);
    public native final void nativeSetMuteMicOfOtherOne(long p0,String p1,boolean p2);
    public native final void nativeSetMuteMicrophone(long p0,boolean p1);
    public native final void nativeSetParameters(long p0,String p1);
    public native final void nativeSetRemoteDefaultVideoStreamType(long p0,String p1,int p2);
    public native final int nativeSetRemoteSubscribeFallbackOption(long p0,String p1,int p2);
    public native final void nativeSetRemoteVideoStreamType(long p0,String p1,String p2,int p3);
    public native final void nativeSetReplacedImageWithChannelId(long p0,ByteBuffer p1,int p2,int p3,String p4);
    public native final void nativeSetRotation(long p0,int p1,int p2);
    public native final void nativeSetRtcAudioDtxIgnored(long p0,boolean p1);
    public native final void nativeSetSceneSourceMixMode(long p0,int p1,int p2,int p3);
    public native final void nativeSetSignalStrength(long p0,int p1);
    public native final void nativeSetSignalingJsonWithInfo(long p0,String p1,String p2,String p3);
    public native final void nativeSetSignalingMessageWithInfo(long p0,String p1,String p2,byte[] p3);
    public native final void nativeSetStringProperty(long p0,String p1,String p2,int p3);
    public native final void nativeSetTsptInfo(long p0,byte[] p1);
    public native final void nativeSetVideoBitrateTable(long p0,String p1,String p2);
    public native final void nativeSetVideoEncoderConfiguration(long p0,String p1,RtcEngine$VideoEncoderConfiguration p2);
    public native final void nativeSetVideoEncoderConfigurationByLevel(long p0,String p1,int p2);
    public native final void nativeSetVideoLayoutScheme(long p0,String p1);
    public native final void nativeSetVideoMaxBitrate(long p0,int p1,String p2);
    public native final void nativeSetVideoMirror(long p0,boolean p1);
    public native final boolean nativeSetVideoMixOutputMode(long p0,int p1,int p2);
    public native final void nativeSetVideoTxDisabled(long p0,int p1);
    public native final void nativeSetVideoTxDisabledWithCallId(long p0,String p1,int p2);
    public native final void nativeSetVideoTxEnabled(long p0,int p1);
    public native final void nativeSetVideoTxEnabledWithCallId(long p0,String p1,int p2);
    public native final void nativeSetVoicePartyKtvMode(long p0,int p1,int p2,int p3,int p4);
    public native final void nativeSetWallClockTime(long p0,long p1);
    public native final void nativeStartAudioRecording(long p0,AudioRecordingObserver p1,int p2,int p3);
    public native final void nativeStartBroadcastObserver(long p0);
    public native final void nativeStartCallExt(long p0,String p1,String p2,byte[] p3,Arya$LiveStreamParam p4,String p5);
    public native final void nativeStartLiveRecording(long p0,String p1,AryaResultObserver p2);
    public native final void nativeStartLiveRecordingForAudioMix(long p0,String p1,AryaResultObserver p2,int p3);
    public native final void nativeStartMixRemoteAndLocalAudio(long p0,AudioMixerObserver p1);
    public native final void nativeStartNetSpeedMeasure(long p0,String p1,String p2,int p3,int p4);
    public native final void nativeStartScreencast(long p0,String p1,int p2,int p3,int p4,int p5,int p6);
    public native final void nativeStartUrlFileStreaming(long p0,String[] p1,String p2,int p3,FileStreamingObserver p4,AryaCallObserverInner p5);
    public native final void nativeStopAudioRecording(long p0,AudioRecordingObserver p1);
    public native final void nativeStopFileStreaming(long p0);
    public native final void nativeStopLiveRecording(long p0,AryaResultObserver p1);
    public native final void nativeStopLiveTranscoding(long p0,String p1);
    public native final void nativeStopLowLatencyLiveByForce(long p0);
    public native final void nativeStopMixRemoteAndLocalAudio(long p0);
    public native final int nativeStopNetSpeedMeasure(long p0);
    public native final void nativeStopRtcSessionByForce(long p0);
    public native final void nativeStopScreencast(long p0);
    public native final void nativeSubscribeRemoteVideoStreamByDefault(long p0);
    public native final void nativeSubscribeRemoteVideoStreams(long p0,String p1,String[] p2,int p3);
    public native final void nativeSwitchVoicePartyBusinessScene(long p0,int p1);
    public native final void nativeUninitVoip(long p0);
    public native final void nativeUnmuteAllRemoteAudioStreams(long p0);
    public native final void nativeUnmuteAllRemoteAudioStreamsForCallId(long p0,String p1);
    public native final void nativeUnmuteRemoteAudioStream(long p0,String p1,String p2);
    public native final void nativeUnsubscribeRemoteVideoStreamByDefault(long p0);
    public native final void nativeUnsubscribeRemoteVideoStreams(long p0,String p1,String[] p2,int p3);
    public native final boolean nativeUpdateLayoutAndResolutionForScene(long p0,int p1,Arya$KWAryaLayout[] p2,int p3,int p4,Buffer p5,Buffer p6);
    public native final boolean nativeUpdateLayoutForScene(long p0,int p1,Arya$KWAryaLayout[] p2,Buffer p3);
    public native final void nativeUpdateMixOutputSize(long p0,int p1,int p2);
    public native final void nativeUpdateSelfPosition(long p0,int[] p1);
    public native final int nativeWebsocketClose(long p0,int p1);
    public native final int nativeWebsocketOpen(long p0,int p1,String p2,AryaWebsocketObserver p3);
    public native final int nativeWebsocketSend(long p0,int p1,byte[] p2);
    public void networkChanged(int p0,String p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uArya, "96")) {
          return;
       }
       this.nativeSetLocalNetworkInfo(this.t, p0, p1);
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "331")) {
          return;
       }
       NetworkInfo activeNetwor = this.r.getSystemService("connectivity").getActiveNetworkInfo();
       if (activeNetwor != null && activeNetwor.isAvailable()) {
          int type = activeNetwor.getType();
          int i = 1;
          if (!type) {
             this.W = i;
          }else if(type == i){
             this.W = 2;
          }
          this.nativeSetLocalNetworkInfo(this.t, this.W, "");
          Log.i("Arya", "setInitialNetworkState current voip_network_type:"+this.W);
       }
       return;
    }
    public final void onAudioConfigQosUpdated(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "267")) {
          return;
       }
       AryaAudioConfigQosInfo uAryaAudioCo = this.z.c(p0);
       if (uAryaAudioCo != null) {
          this.a(uAryaAudioCo);
       }
       return;
    }
    public void onAudioInputRouteChanged(int p0,int p1,String p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, Arya.class, "325")) {
          return;
       }
       this.c(p0);
       return;
    }
    public void onAudioOutPutRouteChanged(int p0,int p1,String p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, Arya.class, "324")) {
          return;
       }
       this.c(p0);
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "173")) {
          return;
       }
       this.nativeOnBackground();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "174")) {
          return;
       }
       this.nativeOnForeground();
       return;
    }
    public final void onQosUpdated(int p0,int p1,String p2,boolean p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, Arya.class, "268")) {
          return;
       }
       int i = 1;
       if (p0 == i && p3) {
          String str = this.z.b(p1);
          if (!("{}").equals(str)) {
             p2 = str.substring(0, (str.length() - i))+","+p2.substring(i, p2.length());
          }
       }
       try{
          if (this.u != null && (this.v & p0)) {
             Log.d("Arya", "QosUpload type: "+p0);
             this.b(p2);
             this.u.onQosEventUpdated(p0, p2);
          }
       }catch(java.lang.NullPointerException e9){
          e9.printStackTrace();
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "46")) {
          return;
       }
       this.nativePause(this.t);
       this.z.b(this.A);
       return;
    }
    public void pauseAllRemoteVideoStreams(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "289")) {
          return;
       }
       this.nativePauseAllRemoteVideoStreams(this.t, null);
       return;
    }
    public void pauseAllRemoteVideoStreams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "290")) {
          return;
       }
       this.nativePauseAllRemoteVideoStreams(this.t, p0);
       return;
    }
    public void pauseAudioBuffer(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "215")) {
          return;
       }
       this.z.E();
       return;
    }
    public void pauseBgm(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "148")) {
          return;
       }
       this.z.p();
       return;
    }
    public void pauseFileStreaming(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "181")) {
          return;
       }
       this.nativePauseFileStreaming(this.t);
       return;
    }
    public void pauseLiveRecording(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "48")) {
          return;
       }
       this.nativePauseLiveRecording(this.t);
       this.z.b(this.A);
       return;
    }
    public int pauseStannis(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "337");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.b(this.A);
       return 0;
    }
    public void playAudioBuffer(String p0,byte[] p1,float p2,boolean p3,AudioBufferPlayObserver p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uArya, "214")) {
             return;
          }
       }
       this.z.a(p0, p1, p2, p3, p4);
       return;
    }
    public void playSoundEffect(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "159")) {
          return;
       }
       this.z.a(p0, p1);
       return;
    }
    public void postReceivedSignalingJson(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Arya.class, "29")) {
          return;
       }
       this.nativeSetSignalingJsonWithInfo(this.t, p0, p1, p2);
       return;
    }
    public void postReceivedSignalingMessage(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Arya.class, "28")) {
          return;
       }
       this.nativeSetSignalingMessageWithInfo(this.t, p0, p1, p2);
       return;
    }
    public void probeConnectivity(String p0,int p1,int p2,ConnectivityObserver p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, Arya.class, "26")) {
          return;
       }
       boolean b = false;
       if (p0.isEmpty()) {
          Log.w("Arya", "probeConnection with empty address");
          if (p3 != null) {
             p3.isConnectable(b);
          }
          return;
       }else {
          String[] stringArray = p0.split(":");
          Arya uArya = 2;
          if (stringArray.length > uArya) {
             stringArray = p0.split("]:");
          }
          if (stringArray.length != uArya) {
             Log.e("Arya", "probeConnection invalid addr:"+p0);
             if (p3 != null) {
                p3.isConnectable(b);
             }
             return;
          }else {
             object oobject = stringArray[b];
             int i = Integer.parseInt(stringArray[1]);
             if (oobject.startsWith("[")) {
                oobject = oobject.substring(1, oobject.length());
             }
             object oobject1 = oobject;
             Log.i("Arya", "probeConnection addr:"+p0+" ip:"+oobject1+" port:"+i);
             Arya.nativeProbeConnectivity(this.t, oobject1, i, p1, p2, new Arya$5(this, p3));
             return;
          }
       }
    }
    public void pushCustomVideoData(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "336")) {
          return;
       }
       this.nativePushCustomVideoData(this.t, p0);
       return;
    }
    public void registerAudioFrameObserver(AryaRawAudioFrameObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "251")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void removeAllAudioBypassDataObserver(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "213")) {
          return;
       }
       this.z.D();
       return;
    }
    public void removeAudioSceneObserver(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "203")) {
          return;
       }
       this.z.b(p0);
       return;
    }
    public void removeMixTrack(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "283")) {
          return;
       }
       this.z.r(p0);
       return;
    }
    public void replaceVideoWithBitmap(String p0,Bitmap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "68")) {
          return;
       }
       if (p1 != null) {
          ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p1.getByteCount());
          p1.copyPixelsToBuffer(uByteBuffer);
          this.nativeSetReplacedImageWithChannelId(this.t, uByteBuffer, p1.getWidth(), p1.getHeight(), p0);
       }else {
          this.nativeSetReplacedImageWithChannelId(this.t, null, 0, 0, p0);
       }
       return;
    }
    public void resetPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "222")) {
          return;
       }
       this.z.I();
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "47")) {
          return;
       }
       this.z.c(this.A);
       this.nativeResume(this.t);
       return;
    }
    public void resumeAllRemoteVideoStreams(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "291")) {
          return;
       }
       this.nativeResumeAllRemoteVideoStreams(this.t, null);
       return;
    }
    public void resumeAllRemoteVideoStreams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "292")) {
          return;
       }
       this.nativeResumeAllRemoteVideoStreams(this.t, p0);
       return;
    }
    public void resumeAudioBuffer(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "216")) {
          return;
       }
       this.z.q(p0);
       return;
    }
    public void resumeBgm(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "149")) {
          return;
       }
       this.z.q();
       return;
    }
    public void resumeFileStreaming(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "182")) {
          return;
       }
       this.nativeResumeFileStreaming(this.t);
       return;
    }
    public void resumeLiveRecording(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "49")) {
          return;
       }
       this.z.c(this.A);
       this.nativeResumeLiveRecording(this.t);
       return;
    }
    public int resumeStannis(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "338");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.z.c(this.A);
       return 0;
    }
    public void saveMoments(String p0,AryaResultObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "136")) {
          return;
       }
       this.nativeSaveMoments(this.t, p0, p1);
       return;
    }
    public void seekBgm(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "153")) {
          return;
       }
       this.z.l(p0);
       this.D.a(p0);
       return;
    }
    public void seekFileStreamingToMs(long p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uArya, "183")) {
          return;
       }
       this.nativeSeekFileStreamingToMs(this.t, p0);
       return;
    }
    public int sendMediaMetadataData(byte[] p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uArya, "69");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return -1;
       }else if(p1){
          if (p1 == 1) {
             this.nativeSetDataInLiveStream(this.t, p0);
          }
       }else {
          this.nativeSetTsptInfo(this.t, p0);
       }
       return 0;
    }
    public void sendScreencastInfo(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "178")) {
          return;
       }
       this.nativeSendScreenCastInfo(this.t, p0);
       return;
    }
    public final void sendSignalMessage(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "266")) {
          return;
       }
       Arya ts = this.s;
       if (ts != null) {
          ts.sendSignalMessage(p0);
       }
       return;
    }
    public void sendStreamMessage(int p0,byte[] p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uArya, "95")) {
          return;
       }
       this.nativeSendStreamMessage(this.t, p0, p1);
       return;
    }
    public int setAVSyncSource(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Arya.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (p0 == null) {
          Log.i("Arya", "setAVSyncSource param channelId nil");
          return i;
       }else if(p1 == null){
          Log.i("Arya", "setAVSyncSource param userId nil");
          return i;
       }else {
          return this.nativeSetAVSyncSource(this.t, p0, p1);
       }
    }
    public void setActionEvent(AryaEventCollection$ActionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "320")) {
          return;
       }
       this.nativeSetActionEvent(this.t, p0);
       return;
    }
    public void setAgcMode(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "123")) {
          return;
       }
       this.C.z = p0;
       this.z.i(p0);
       return;
    }
    public void setAsMainSourceOfScene(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "233")) {
          return;
       }
       this.nativeSetAsMainSourceOfScene(this.t, p0, p1);
       return;
    }
    public void setAudioDeviceStatusListener(Arya$AryaAudioDeviceStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "57")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void setAudioEffectParam(boolean p0,Stannis$KWStannisAudioEffectParam p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uArya, "339")) {
          return;
       }
       this.z.a(p0, p1);
       return;
    }
    public void setAudioFocusUser(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "260")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void setAudioInputVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "110")) {
          return;
       }
       this.C.a = p0;
       if (this.L != null) {
          Log.w("Arya", "can\'t setAudioInputVolume due to muted already");
          return;
       }else {
          this.z.c(p0);
          return;
       }
    }
    public void setAudioLowDelayMode(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "140")) {
          return;
       }
       this.nativeSetAudioLowDelayMode(this.t, p0);
       return;
    }
    public void setAudioOutputType(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "124")) {
          return;
       }
       this.z.j(p0);
       return;
    }
    public void setAudioPreProcessVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "340")) {
          return;
       }
       this.z.j(p0);
       return;
    }
    public void setAudioRecvRange(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "240")) {
          return;
       }
       this.z.v(p0);
       this.nativeSetAudioRecvRange(this.t, p0);
       return;
    }
    public void setAudioRouteListener(Arya$AryaAudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "129")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void setAudioRxVolume(String p0,float p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uArya, "113")) {
          return;
       }
       Log.d("Arya", "setAudioRxVolume: "+p0+" vol: "+p1);
       this.z.a(p0, p1);
       return;
    }
    public void setAudioTeamId(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "238")) {
          return;
       }
       this.z.s(p0);
       this.nativeSetAudioTeamId(this.t, p0);
       return;
    }
    public void setAudioTeamMode(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "241")) {
          return;
       }
       uArya = this.z;
       int i = 1;
       if (p0 != i) {
          i = 0;
       }
       uArya.u(i);
       this.nativeSetAudioTeamMode(this.t, p0);
       return;
    }
    public void setAudioTunnel(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "239")) {
          return;
       }
       this.z.t(p0);
       this.nativeSetAudioTunnel(this.t, p0);
       return;
    }
    public void setAudioVoiceEffectOption(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "99")) {
          return;
       }
       Log.d("Arya", "setAudioVoiceEffectOption voiceEffectOption:"+p0);
       this.C.c = p0;
       this.z.e(p0);
       return;
    }
    public void setAudioVoiceRoleOption(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "100")) {
          return;
       }
       Log.d("Arya", "setAudioVoiceRoleOption voiceRoleOption:"+p0);
       this.C.d = p0;
       this.z.f(p0);
       return;
    }
    public void setBgmPitch(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "154")) {
          return;
       }
       uArya = this.C;
       if (p0 != uArya.o) {
          uArya.o = p0;
          this.z.m(p0);
          this.h();
       }
       return;
    }
    public void setBgmVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "150")) {
          return;
       }
       uArya = this.C;
       if (p0 - uArya.l) {
          uArya.l = p0;
          this.z.f(p0);
          this.h();
       }
       return;
    }
    public void setCaeModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "347")) {
          return;
       }
       Log.i("Arya", "[Arya] setCaeModelPath: "+p0);
       this.z.j(p0);
       return;
    }
    public void setCaptureSize(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "15")) {
          return;
       }
       this.nativeSetIntProperty(this.t, "cap_w", p0, 0);
       this.nativeSetIntProperty(this.t, "cap_h", p1, 0);
       return;
    }
    public void setClientRole(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "33")) {
          return;
       }
       this.nativeSetClientRole(this.t, p0, p1);
       return;
    }
    public void setCommentStreamAudioPts(long p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uArya, "116")) {
          return;
       }
       this.nativeSetCommentStreamAudioPts(this.t, p0);
       return;
    }
    public void setCommentStreamId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "117")) {
          return;
       }
       this.nativeSetCommentStreamId(this.t, p0);
       return;
    }
    public void setCommentStreamVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "115")) {
          return;
       }
       this.nativeSetCommentStreamVolume(this.t, p0);
       return;
    }
    public void setDeepAECModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "88")) {
          return;
       }
       this.z.c(p0);
       return;
    }
    public void setDeepDenoiseModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "44")) {
          return;
       }
       this.z.e(p0);
       return;
    }
    public void setDefaultMuteAllRemoteAudioStreams(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "109")) {
          return;
       }
       Log.d("Arya", "setDefaultMuteAllRemoteAudioStreams mute "+p0);
       this.nativeSetDefaultMuteAllRemoteAudioStreams(this.t, p0);
       return;
    }
    public void setDefaultNetworkProbeAudioKbps(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "171")) {
          return;
       }
       this.nativeSetDefaultNetworkProbeAudioKbps(this.t);
       return;
    }
    public void setDefaultNetworkProbeVideoKbps(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "170")) {
          return;
       }
       this.nativeSetDefaultNetworkProbeVideoKbps(this.t);
       return;
    }
    public void setEdgeGroupAddr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "35")) {
          return;
       }
       this.nativeSetEdgeGroupAddr(this.t, p0);
       return;
    }
    public void setEnableAudioMusicMode(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "261")) {
          return;
       }
       this.z.u(p0);
       this.nativeSetEnableAudioMusicMode(this.t, p0);
       return;
    }
    public void setEnableCaeProcess(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "348")) {
          return;
       }
       Log.i("Arya", "[Arya] setEnableCaeProcess: "+p0);
       this.z.v(p0);
       return;
    }
    public void setEnableDeepAEC(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "89")) {
          return;
       }
       this.z.j(p0);
       return;
    }
    public void setEnableDeepDenoise(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "45")) {
          return;
       }
       this.z.l(p0);
       return;
    }
    public void setEnableDeepNs(boolean p0,String p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uArya, "122")) {
          return;
       }
       this.z.a(p0, p1);
       return;
    }
    public void setEnableInnerMix(boolean p0){
       this.P = p0;
    }
    public void setEnableLocalRecording(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "119")) {
          return;
       }
       Log.d("Arya", "setEnableLocalRecording:"+p0);
       this.z.e(p0);
       this.q = p0;
       return;
    }
    public void setEnableMonitorDebug(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "350")) {
          return;
       }
       Log.i("Arya", "[Arya] setEnableMonitorDebug enable:"+p0);
       this.z.w(p0);
       return;
    }
    public void setEnableNoiseSuppression(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "120")) {
          return;
       }
       this.C.h = p0;
       this.z.h(p0);
       return;
    }
    public void setEnableRecordAutoResume(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "349")) {
          return;
       }
       Log.i("Arya", "[Arya] setEnableRecordAutoResume resume:"+p0+" detectTimeBySec:"+p1+" target:"+p2);
       this.z.a(p0, p1, p2);
       return;
    }
    public void setEnableRecording(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "118")) {
          return;
       }
       Log.d("Arya", "setEnableRecording:"+p0);
       this.z.d(p0);
       return;
    }
    public void setEnableSpeakerInputAEC(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "130")) {
          return;
       }
       this.z.k(p0);
       return;
    }
    public void setEncodeDebugInfoKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "17")) {
          return;
       }
       this.nativeSetStringProperty(this.t, "priv_key", p0, 2);
       return;
    }
    public void setExternalAudioDevice(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "12")) {
          return;
       }
       Log.i("Arya", "setExternalAudioDevice "+p0);
       this.z.a(p0);
       this.E = p0;
       return;
    }
    public void setHeadphoneMonitorVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "127")) {
          return;
       }
       this.z.e(p0);
       return;
    }
    public void setHowlingSuppressionMode(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "211")) {
          return;
       }
       this.C.i = p0;
       this.z.h(p0);
       return;
    }
    public void setHrtfMode(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "249")) {
          return;
       }
       this.z.b(p0, p1);
       return;
    }
    public void setHrtfModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "250")) {
          return;
       }
       this.z.i(p0);
       return;
    }
    public boolean setKaraokeScorePitch(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uArya, "209");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.z.o(p0);
    }
    public void setKtpModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "42")) {
          return;
       }
       this.nativeSetKtpModelPath(this.t, p0);
       return;
    }
    public void setKtpRtcModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "43")) {
          return;
       }
       this.nativeSetKtpRtcModelPath(this.t, p0);
       return;
    }
    public void setLiveStreamVideoEncodeParam(Arya$KWAryaVideoEncodeParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "80")) {
          return;
       }
       this.nativeSetLiveStreamVideoEncodeParam(this.t, p0);
       return;
    }
    public void setLocalPublishFallbackOption(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "310")) {
          return;
       }
       this.nativeSetLocalPublishFallbackOption(this.t, p0, p1);
       return;
    }
    public void setLocalVideoDisabled(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "74")) {
          return;
       }
       this.nativeSetLocalVideoDisabled(this.t);
       return;
    }
    public void setLocalVideoEnabled(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "73")) {
          return;
       }
       this.nativeSetLocalVideoEnabled(this.t);
       return;
    }
    public void setLogo(ByteBuffer p0,int p1,int p2,float p3,float p4,int p5){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "185")) {
             return;
          }
       }
       if (p1 >= 0 && p2 >= 0) {
          this.nativeSetLogo(uArya.t, p0, p1, p2, p3, p4, p5, false);
       }
       return;
    }
    public void setLogo(ByteBuffer p0,int p1,int p2,float p3,float p4,int p5,boolean p6){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "186")) {
             return;
          }
       }
       if (p1 >= 0 && p2 >= 0) {
          this.nativeSetLogo(uArya.t, p0, p1, p2, p3, p4, p5, p6);
       }
       return;
    }
    public void setMediaFrameObserver(MediaFrameObserver p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "9")) {
          return;
       }
       this.nativeSetMediaCallback(this.t, p0, p1);
       return;
    }
    public void setMixType(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "256")) {
          return;
       }
       this.nativeSetMixType(this.t, p0);
       return;
    }
    public void setMixedAudioFrameParameters(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "254")) {
          return;
       }
       this.z.c(p0, p1);
       return;
    }
    public void setMuteBgm(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "152")) {
          return;
       }
       this.C.n = p0;
       this.z.m(p0);
       return;
    }
    public void setMuteChatOutBgm(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "155")) {
          return;
       }
       this.z.i(p0);
       this.C.t = p0;
       return;
    }
    public void setMuteLiveStreamOutBgm(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "156")) {
          return;
       }
       this.z.p(p0);
       this.C.u = p0;
       return;
    }
    public void setMuteMicOfAllOthers(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "135")) {
          return;
       }
       this.nativeSetMuteMicOfAllOthers(this.t, p0);
       return;
    }
    public void setMuteMicOfOtherOne(String p0,boolean p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uArya, "134")) {
          return;
       }
       this.nativeSetMuteMicOfOtherOne(this.t, p0, p1);
       return;
    }
    public void setMuteMicrophone(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "101")) {
          return;
       }
       Log.d("Arya", "setMuteMicrophone type:"+p0);
       int i = 1;
       if (p0 != i) {
          i = false;
       }
       this.K = i;
       this.C.e = p0;
       this.z.g(p0);
       this.nativeSetMuteMicrophone(this.t, this.K);
       return;
    }
    public void setMuteRemote(boolean p0,boolean p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uArya, "121")) {
          return;
       }
       Log.d("Arya", "setMuteRemote: "+p0+" improveAudioQuality: "+p1);
       uArya = this.C;
       uArya.j = p0;
       uArya.k = p1;
       this.z.a(p0, p1);
       return;
    }
    public void setMuteSoundEffect(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "162")) {
          return;
       }
       this.C.q = p0;
       this.z.n(p0);
       return;
    }
    public void setMuteSpeaker(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "111")) {
          return;
       }
       this.C.f = p0;
       this.z.b(p0);
       return;
    }
    public int setParameters(String p0){
       String str = "arya_config";
       String str1 = "multi_nic";
       String str2 = "is_anchor";
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "328");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          obj = new JSONObject(p0);
          if (obj.has(str2)) {
             this.a = obj.getBoolean(str2);
          label_002c :
             if (obj.has(str1)) {
                this.n = obj.getBoolean(str1);
                Log.i("Arya", "multiNicSwitch is "+this.n);
                if (this.n != null) {
                   this.k();
                }
             }
             if (obj.has(str)) {
                str = obj.getString(str);
                if (!str.isEmpty()) {
                   this.a(new JSONObject(str));
                   this.b(obj);
                }
             }
          }else {
             goto label_002c ;
          }
       }catch(org.json.JSONException e0){
          Log.w("Arya", "setParameters parse failed! "+e0.toString());
          e0.printStackTrace();
       }
       this.nativeSetParameters(this.t, p0);
       this.z.a(p0);
       return 0;
    }
    public void setPcmPlayVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "223")) {
          return;
       }
       this.z.i(p0);
       return;
    }
    public void setPkGameId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "16")) {
          return;
       }
       this.nativeSetStringProperty(this.t, "pk_id", p0, 1);
       return;
    }
    public void setPlaybackAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya.class, "253")) {
          return;
       }
       this.z.b(p0, p1, p2, p3);
       return;
    }
    public void setPreviewSize(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "14")) {
          return;
       }
       this.nativeSetIntProperty(this.t, "pre_w", p0, 0);
       this.nativeSetIntProperty(this.t, "pre_h", p1, 0);
       return;
    }
    public void setProperty(String p0,int p1,int p2){
       Integer integer;
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "19")) {
          return;
       }
       this.nativeSetIntProperty(this.t, p0, p1, p2);
       StringBuilder str = "setProperty key: "+p0+" value: ";
       p0 = (p2 == 2)? "": Integer.valueOf(p1);
       Log.d("Arya", str+p0+" flag: "+p2);
       return;
    }
    public void setProperty(String p0,String p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, Arya.class, "18")) {
          return;
       }
       this.nativeSetStringProperty(this.t, p0, p1, p2);
       StringBuilder str = "setProperty key: "+p0+" value: ";
       if (p2 == 2) {
          p1 = "";
       }
       Log.d("Arya", str+p1+" flag: "+p2);
       return;
    }
    public void setRecordingAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya.class, "252")) {
          return;
       }
       this.z.a(p0, p1, p2, p3);
       return;
    }
    public void setRecordingRawAudioFrameParameters(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya.class, "255")) {
          return;
       }
       this.z.c(p0, p1, p2, p3);
       return;
    }
    public void setRemoteBgmVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "151")) {
          return;
       }
       Log.d("Arya", "setRemoteBgmVolume: "+p0);
       this.C.m = p0;
       this.z.g(p0);
       return;
    }
    public void setRemoteDefaultVideoStreamType(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "308")) {
          return;
       }
       this.nativeSetRemoteDefaultVideoStreamType(this.t, p0, p1);
       return;
    }
    public void setRemoteSubscribeFallbackOption(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "309")) {
          return;
       }
       this.nativeSetRemoteSubscribeFallbackOption(this.t, p0, p1);
       return;
    }
    public void setRemoteVideoStreamType(String p0,String p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, Arya.class, "307")) {
          return;
       }
       this.nativeSetRemoteVideoStreamType(this.t, p0, p1, p2);
       return;
    }
    public void setRequestAudioFocus(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "175")) {
          return;
       }
       this.z.s(p0);
       return;
    }
    public void setReverbLevel(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "98")) {
          return;
       }
       this.C.b = p0;
       this.z.d(p0);
       return;
    }
    public void setRotation(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "40")) {
          return;
       }
       this.nativeSetRotation(this.t, p0, p1);
       return;
    }
    public void setRxStreamMixerGain(String p0,boolean p1,float p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, Arya.class, "259")) {
          return;
       }
       this.z.a(p0, p1, p2);
       return;
    }
    public void setSceneSourceMixMode(int p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "228")) {
          return;
       }
       this.nativeSetSceneSourceMixMode(this.t, p0, p1, p2);
       return;
    }
    public void setSoftAecMode(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "131")) {
          return;
       }
       this.z.k(p0);
       return;
    }
    public void setSongSectionStartEndTime(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "345")) {
          return;
       }
       this.z.a(p0);
       return;
    }
    public void setSoundEffectVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "161")) {
          return;
       }
       this.C.p = p0;
       this.z.h(p0);
       return;
    }
    public void setSpeakerOn(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "114")) {
          return;
       }
       this.C.g = p0;
       this.z.c(p0);
       return;
    }
    public void setSpeakerVolume(float p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uArya, "112")) {
          return;
       }
       Log.d("Arya", "setSpeakerVolume: "+p0);
       this.z.a(p0);
       return;
    }
    public void setStannisMuteMicrophone(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "102")) {
          return;
       }
       Log.d("Arya", "setStannisMuteMicrophone type:"+p0);
       boolean b = false;
       boolean b1 = (p0 == 1)? true: false;
       this.K = b1;
       if (p0 == 1) {
          b = true;
       }
       this.L = b;
       if (p0 == 1) {
          this.z.c(0);
       }else {
          this.z.c(this.C.a);
       }
       this.nativeSetMuteMicrophone(this.t, this.K);
       return;
    }
    public void setUsingBuiltinMic(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "319")) {
          return;
       }
       this.z.t(p0);
       return;
    }
    public void setVideoBitrateTable(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "81")) {
          return;
       }
       this.nativeSetVideoBitrateTable(this.t, p0, p1);
       return;
    }
    public void setVideoEncoderConfiguration(String p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "304")) {
          return;
       }
       this.nativeSetVideoEncoderConfigurationByLevel(this.t, p0, p1);
       return;
    }
    public void setVideoEncoderConfiguration(String p0,RtcEngine$VideoEncoderConfiguration p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "303")) {
          return;
       }
       this.nativeSetVideoEncoderConfiguration(this.t, p0, p1);
       return;
    }
    public void setVideoLayoutScheme(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "51")) {
          return;
       }
       this.nativeSetVideoLayoutScheme(this.t, p0);
       return;
    }
    public void setVideoMaxBitrate(int p0,String p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uArya, "79")) {
          return;
       }
       this.nativeSetVideoMaxBitrate(this.t, p0, p1);
       return;
    }
    public void setVideoMirror(boolean p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uArya, "70")) {
          return;
       }
       this.nativeSetVideoMirror(this.t, p0);
       return;
    }
    public void setVideoMixOutputMode(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "227")) {
          return;
       }
       this.nativeSetVideoMixOutputMode(this.t, p0, p1);
       return;
    }
    public void setVocalBgmDelay(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "145")) {
          return;
       }
       Log.i("Arya", "setVocalBgmDelay: "+p0);
       this.z.n(p0);
       return;
    }
    public void startAudioEngine(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "286")) {
          return;
       }
       Log.i("Arya", "[Arya] startAudioEngine scene:"+p0);
       this.z.a(p0, this.A, 0);
       return;
    }
    public boolean startAudioInnerCap(MediaProjection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Arya.class, "315");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.z.a(p0);
    }
    public void startAudioRecording(AudioRecordingObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "192")) {
          return;
       }
       this.a(p0, 0, 2816);
       return;
    }
    public void startAudioRecording(AudioRecordingObserver p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uArya, "193")) {
          return;
       }
       Log.d("Arya", "startAudioRecording type "+p1);
       this.a(p0, p1, 2816);
       return;
    }
    public void startAudioRecording(AudioRecordingObserver p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya.class, "194")) {
          return;
       }
       Log.d("Arya", "startAudioRecording type:"+p1+", audioScene:"+p2);
       this.a(p0, p1, p2);
       return;
    }
    public boolean startBgm(ArrayList p0,ArrayList p1,boolean p2,int p3,BgmObserver p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uArya, "141");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("Arya", "startBgm progressIntervalMs: "+p3);
       this.z.a(p0, p1, p2, p3, new Arya$6(this, p4));
       this.nativeSendForceTransfer(this.t, 1);
       if (this.a != null) {
          this.nativeSetLiveStreamBgmOffsetCb(this.t, p3, new Arya$7(this, p4));
       }
       this.D.a();
       this.a(1);
       return 1;
    }
    public void startBroadcastObserver(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "10")) {
          return;
       }
       this.nativeStartBroadcastObserver(this.t);
       return;
    }
    public void startCall(String p0,String p1,byte[] p2,Arya$LiveStreamParam p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, Arya.class, "30")) {
          return;
       }
       if (this.m != null && Build$VERSION.SDK_INT >= 23) {
          this.a(p3);
       }
       this.nativeStartCallExt(this.t, p0, p1, p2, p3, this.f());
       return;
    }
    public boolean startFileStreaming(List p0,String p1,int p2,FileStreamingObserver p3){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, Arya.class, "179");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String[] stringArray = new String[p0.size()];
       int i = 0;
       while (true) {
          if (i < p0.size()) {
             stringArray[i] = p0.get(i).get("url");
             if (stringArray[i] == null) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             this.nativeStartUrlFileStreaming(this.t, stringArray, p1, p2, p3, new Arya$8(this));
             return true;
          }
       }
       return false;
    }
    public void startKaraokeScore(long p0,String p1,String p2,String p3,String p4,String p5,int p6,int p7,KaraokeScoreObserver p8){
       Arya uArya = this;
       object oobject = p2;
       object oobject1 = p8;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject1;
          if (PatchProxy.applyVoid(objArray, this, uArya1, "204")) {
             return;
          }
       }
       uArya.z.a(p0, p1, p2, p3, p4, p5, p6, p7, new Arya$10(this, oobject1, oobject));
       return;
    }
    public void startKaraokeVad(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "189")) {
          return;
       }
       this.z.g(p0);
       return;
    }
    public void startLiveRecording(String p0,AryaResultObserver p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "137")) {
          return;
       }
       this.nativeStartLiveRecording(this.t, p0, p1);
       return;
    }
    public void startLiveRecordingForAudioMix(String p0,AryaResultObserver p1,int p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, Arya.class, "139")) {
          return;
       }
       this.O = true;
       this.nativeStartLiveRecordingForAudioMix(this.t, p0, p1, p2);
       return;
    }
    public void startMixRemoteAndLocalAudio(AudioMixerObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "197")) {
          return;
       }
       Log.d("Arya", "startMixRemoteAndLocalAudio");
       this.nativeStartMixRemoteAndLocalAudio(this.t, p0);
       return;
    }
    public void startMultipleStreamMix(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "280")) {
          return;
       }
       if (this.N == null) {
          this.N = new Arya$16(this);
       }
       this.z.a(this.N);
       return;
    }
    public void startNetSpeedMeasure(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya.class, "166")) {
          return;
       }
       this.nativeStartNetSpeedMeasure(this.t, p0, p1, p2, p3);
       return;
    }
    public void startPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "219")) {
          return;
       }
       this.z.G();
       return;
    }
    public void startPlayAudioSegment(String p0,String p1,boolean p2,AudioSegmentPlayerObserver p3){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, Arya.class, "199")) {
          return;
       }
       this.z.a(p0, p1, new Arya$9(this, p3, p2));
       this.a(true);
       return;
    }
    public void startScreencast(String p0,int p1,int p2,int p3,int p4,int p5){
       Arya uArya = this;
       Arya uArya1 = Arya.class;
       if (PatchProxy.isSupport(uArya1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uArya1, "176")) {
             return;
          }
       }
       this.nativeStartScreencast(uArya.t, p0, p1, p2, p3, p4, p5);
       return;
    }
    public void startSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "343")) {
          return;
       }
       this.z.O();
       return;
    }
    public void startSongSectionScoreWorkshop(int p0,byte[] p1,long p2){
       if (PatchProxy.isSupport(Arya.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, Arya.class, "341")) {
          return;
       }
       this.z.a(p0, p1, p2);
       return;
    }
    public Boolean startVoicePartyKtvMode(int p0,int p1,int p2,ArrayList p3,int p4,BgmObserver p5){
       Object[] objArray;
       String obj;
       float f;
       Arya uArya = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       Arya uArya1 = Arya.class;
       int i3 = 0;
       if (PatchProxy.isSupport(uArya1)) {
          objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, this, uArya1, "187");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "Arya";
       if (i1 <= 0) {
          objArray = new Object[]{Integer.valueOf(p1)};
          Log.e(obj, String.format("startVoicePartyKtvMode: bgmId\(%d\) must > 0", objArray));
          return Boolean.FALSE;
       }else {
          StringBuilder str = "startVoicePartyKtvMode: bgmId: "+p1+", bgmStartPos: "+p2+", isAnchor: "+uArya.a+", role: ";
          String str1 = (!i)? "singer": "audience";
          Log.i(obj, str+str1);
          this.startBgm(p3, null, false, p4, p5);
          this.seekBgm(p2);
          uArya.d = true;
          uArya.e = i;
          if (i == 1) {
             this.pauseBgm();
             this.setMuteChatOutBgm(1);
             uArya.b = i2;
          }else if(uArya.a != null){
             this.setMuteChatOutBgm(1);
          }else {
             f = 0;
             uArya.z.g(f);
             uArya.C.m = f;
             uArya.z.d(f);
             uArya.C.v = f;
          }
          uArya.z.f(1);
          f = -15.00f;
          uArya.z.b(f);
          uArya.z.g(1);
          uArya1 = uArya.C;
          uArya1.w = true;
          uArya1.x = f;
          uArya1.y = true;
          this.h();
          this.nativeSetVoicePartyKtvMode(uArya.t, 1, p1, p2, p0);
          return Boolean.TRUE;
       }
    }
    public void stopAllSoundEffects(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "160")) {
          return;
       }
       this.z.u();
       return;
    }
    public void stopAudioRecording(AudioRecordingObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "196")) {
          return;
       }
       Log.d("Arya", "stopAudioRecording");
       this.nativeStopAudioRecording(this.t, p0);
       this.n();
       return;
    }
    public void stopBgm(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, Arya.class, "147")) {
          return;
       }
       this.z.o();
       this.nativeSendForceTransfer(this.t, false);
       if (this.a != null) {
          this.nativeSetLiveStreamBgmOffsetCb(this.t, false, objArray);
       }
       this.D.b();
       this.a(false);
       return;
    }
    public void stopFileStreaming(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "180")) {
          return;
       }
       this.nativeStopFileStreaming(this.t);
       return;
    }
    public void stopInnerCap(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "316")) {
          return;
       }
       this.z.j();
       return;
    }
    public void stopKaraokeScore(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "205")) {
          return;
       }
       this.z.w();
       return;
    }
    public void stopKaraokeVad(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "190")) {
          return;
       }
       this.z.C();
       return;
    }
    public void stopLiveChatByForce(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "54")) {
          return;
       }
       this.nativeStopRtcSessionByForce(this.t);
       return;
    }
    public void stopLivePkByForce(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "53")) {
          return;
       }
       this.nativeStopRtcSessionByForce(this.t);
       return;
    }
    public void stopLiveRecording(AryaResultObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "138")) {
          return;
       }
       this.O = false;
       this.nativeStopLiveRecording(this.t, p0);
       return;
    }
    public void stopLowLatencyLiveByForce(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "56")) {
          return;
       }
       this.nativeStopLowLatencyLiveByForce(this.t);
       return;
    }
    public void stopMixRemoteAndLocalAudio(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "198")) {
          return;
       }
       Log.d("Arya", "stopMixRemoteAndLocalAudio");
       this.nativeStopMixRemoteAndLocalAudio(this.t);
       return;
    }
    public void stopMultipleStreamMix(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "281")) {
          return;
       }
       this.z.L();
       return;
    }
    public int stopNetSpeedMeasure(){
       Object obj = PatchProxy.apply(null, this, Arya.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeStopNetSpeedMeasure(this.t);
    }
    public void stopPcmPlay(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "220")) {
          return;
       }
       this.z.H();
       return;
    }
    public void stopPlayAudioSegment(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "200")) {
          return;
       }
       this.z.v();
       this.a(false);
       return;
    }
    public void stopScreencast(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "177")) {
          return;
       }
       this.nativeStopScreencast(this.t);
       return;
    }
    public void stopSongSectionScore(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "344")) {
          return;
       }
       this.z.P();
       return;
    }
    public void stopSongSectionScoreWorkshop(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "342")) {
          return;
       }
       this.z.N();
       return;
    }
    public void stopVoicePartyByForce(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "55")) {
          return;
       }
       this.nativeStopRtcSessionByForce(this.t);
       return;
    }
    public void stopVoicePartyKtvMode(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "188")) {
          return;
       }
       Log.i("Arya", "stopVoicePartyKtvMode");
       this.i();
       boolean b = false;
       this.d = b;
       this.stopBgm();
       if (this.e == 1) {
          this.setMuteChatOutBgm(b);
          this.z.m(this.C.o);
          this.z.f(this.C.l);
          this.z.g(this.C.m);
       }else {
          this.z.d(0x3f800000);
          this.z.f(b);
          this.z.b(-15.00f);
          this.z.g(b);
          Arya tC = this.C;
          tC.v = 0x3f800000;
          tC.w = b;
          tC.x = -15.00f;
          tC.y = b;
       }
       this.nativeSetVoicePartyKtvMode(this.t, 0, 0, 0, this.e);
       return;
    }
    public void subscribeRemoteContent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "301")) {
          return;
       }
       String[] stringArray = new String[]{p1};
       this.nativeSubscribeRemoteVideoStreams(this.t, p0, stringArray, 1);
       return;
    }
    public void subscribeRemoteVideoStreamByDefault(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "296")) {
          return;
       }
       this.nativeSubscribeRemoteVideoStreamByDefault(this.t);
       return;
    }
    public void subscribeRemoteVideoStreams(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "298")) {
          return;
       }
       String[] stringArray = new String[]{p1};
       this.nativeSubscribeRemoteVideoStreams(this.t, p0, stringArray, 0);
       return;
    }
    public void subscribeRemoteVideoStreams(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "300")) {
          return;
       }
       String[] stringArray = new String[0];
       this.nativeSubscribeRemoteVideoStreams(this.t, p0, p1.toArray(stringArray), 0);
       return;
    }
    public void switchVoicePartyBusinessScene(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uArya, "82")) {
          return;
       }
       this.nativeSwitchVoicePartyBusinessScene(this.t, p0);
       return;
    }
    public void tryStartAudioEngineWithScene(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "285")) {
          return;
       }
       Log.i("Arya", "[Arya] tryStartAudioEngineWithScene requestScene:"+p1);
       if (!p0) {
          this.startAudioEngine(p1);
       }else if(!this.checkAudioSceneCompatible(p0, p1)){
          p0 = this.findFinalScene(p0, p1);
          Log.i("Arya", "[Arya] tryStartAudioEngineWithScene finalAudioScene:"+p0);
          this.startAudioEngine(p0);
       }else {
          Log.i("Arya", "[Arya] tryStartAudioEngineWithScene audio scene is compatible");
       }
       return;
    }
    public synchronized void uninit(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "7")) {
          return;
       }
       Log.i("Arya", "uninit arya sdk.");
       if (this.B == null) {
          Log.w("Arya", "[Arya] already uninited");
          return;
       }else {
          Arya tT = this.T;
          if (tT != null) {
             UniversalReceiver.f(this.r, tT);
             this.T = null;
          }
          tT = this.U;
          if (tT != null) {
             UniversalReceiver.f(this.r, tT);
             this.U = null;
          }
          this.nativeUninitVoip(this.t);
          this.r = null;
          this.i();
          this.z.a(this.A);
          this.B = false;
          return;
       }
    }
    public void unmuteAllRemoteAudioStreams(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "108")) {
          return;
       }
       Log.d("Arya", "unmuteAllRemoteAudioStreams");
       this.nativeUnmuteAllRemoteAudioStreams(this.t);
       return;
    }
    public void unmuteAllRemoteAudioStreamsForCallId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "106")) {
          return;
       }
       Log.d("Arya", "unmuteAllRemoteAudioStreamsForCallId callId:"+p0);
       this.nativeUnmuteAllRemoteAudioStreamsForCallId(this.t, p0);
       return;
    }
    public void unmuteRemoteAudioStream(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "104")) {
          return;
       }
       Log.d("Arya", "unmuteRemoteAudioStream callId:"+p0+" userId:"+p1);
       this.nativeUnmuteRemoteAudioStream(this.t, p0, p1);
       return;
    }
    public void unsubscribeRemoteContent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "302")) {
          return;
       }
       String[] stringArray = new String[]{p1};
       this.nativeUnsubscribeRemoteVideoStreams(this.t, p0, stringArray, 1);
       return;
    }
    public void unsubscribeRemoteVideoStreamByDefault(){
       if (PatchProxy.applyVoid(null, this, Arya.class, "295")) {
          return;
       }
       this.nativeUnsubscribeRemoteVideoStreamByDefault(this.t);
       return;
    }
    public void unsubscribeRemoteVideoStreams(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "297")) {
          return;
       }
       String[] stringArray = new String[]{p1};
       this.nativeUnsubscribeRemoteVideoStreams(this.t, p0, stringArray, 0);
       return;
    }
    public void unsubscribeRemoteVideoStreams(String p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya.class, "299")) {
          return;
       }
       String[] stringArray = new String[0];
       this.nativeUnsubscribeRemoteVideoStreams(this.t, p0, p1.toArray(stringArray), 0);
       return;
    }
    public boolean updateBgmIndex(int p0,int p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uArya, "146");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.z.a(p0, p1);
       return true;
    }
    public void updateConfig(Arya$AryaConfig p0){
       Arya$AryaConfig appVersion;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "11")) {
          return;
       }
       this.v = p0.qosEnableFlag;
       p0.packageName = this.r.getPackageName();
       if (p0.appId != null && p0.appName != null) {
          appVersion = p0.appVersion;
          if (appVersion != null) {
             if (p0.appUserId == null) {
                p0.appUserId = "anonymous";
             }
             if (appVersion.endsWith("99999")) {
                p0.packageName = p0.packageName+".debug";
             }
             this.J = p0.appUserId;
             this.a = p0.isAnchor;
             this.w = p0.localLoopback;
             this.E = p0.useExternalAudioDevice;
             this.F = p0.enableAudioPreProcess;
             this.setCaptureSize(p0.captureWidth, p0.captureHeight);
             this.setPreviewSize(p0.previewWidth, p0.previewHeight);
             Matcher matcher = Pattern.compile("\"sessionNumPerNic\": *\(\\d+\),").matcher(p0.aryaConfig);
             Arya$AryaConfig uAryaConfig = null;
             int i = 0;
             String str = "Arya";
             while (matcher.find()) {
                String str1 = "multiNic: found sessionNumPerNic "+matcher.group(1);
                try{
                   Log.i(str, str1);
                   i = Integer.parseInt(matcher.group(1));
                }catch(java.lang.NumberFormatException e4){
                   Log.w(str, "multiNic: parse sessionNumPerNic failed, "+e4);
                }
                boolean i1 = i & 0x10;
                i1 = (i1 > 0)? true: false;
                boolean i2 = i & 0x40;
                i2 = (i2 > 0)? true: false;
                this.o = i2;
                i2 = i & 0x0f;
                Log.i(str, "multiNic: sessionNumPerNic: "+i+", freeTrafficType: "+p0.freeTrafficType+", enableNoneFreeTraffic: "+i1+", realSessionNumPerNic: "+i2);
                if (i2 != 1 || (!i1 && ((p0.freeTrafficType).equals("K-T-T") || this.o != null))) {
                   uAryaConfig = 1;
                }
             }
             if (uAryaConfig || this.n != null) {
                this.k();
             }
             Arya tt = this.t;
             try{
                this.nativeSetConfigs(tt, p0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", p0.packageName);
                jSONObject.put("qos_enable_flag", p0.qosEnableFlag);
                jSONObject.put("enable_video_request", p0.enableVideoRequest);
                jSONObject.put("dump_flag", p0.dumpEnableFlag);
                jSONObject.put("dump_path", p0.dumpPath);
                jSONObject.put("enable_needle_log", p0.enableNeedleLog);
                jSONObject.put("enable_open_api", p0.enableOpenApi);
                jSONObject.put("enable_debug_mode", p0.enableDebugMode);
                jSONObject.put("enable_use_texture", p0.enableUseTexture);
                jSONObject.put("video_enable_crop", p0.videoEnableCrop);
                jSONObject.put("user_network_type", p0.userNetworkType);
                jSONObject.put("http_request_timeout", p0.httpRequestTimeout);
                jSONObject.put("http_retry_count", p0.httpRetryCount);
                jSONObject.put("enable_net_state", p0.enableNetState);
                jSONObject.put("qos_upload_interval", p0.qosUploadInterval);
                jSONObject.put("video_enable_hw_enc", p0.videoEnableHwEnc);
                jSONObject.put("video_enable_hw_dec", p0.videoEnableHwDec);
                jSONObject.put("video_enable_hevc", p0.videoEnableHevc);
                jSONObject.put("arya_config", p0.aryaConfig);
                str2 = jSONObject.toString();
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
                Log.e(str, "updateConfig param_json is invalid");
                str2 = "";
             }
             if (!(p0.aryaConfig).isEmpty()) {
                try{
                   JSONObject jSONObject1 = new JSONObject(p0.aryaConfig);
                   this.a(jSONObject1);
                   this.b(jSONObject1);
                }catch(java.lang.Exception e1){
                   e1.printStackTrace();
                }
             }
          }
       }
       throw new AssertionError("appId|appName|appVersion cannot be null!");
    }
    public boolean updateLayoutAndResolutionForScene(int p0,Arya$KWAryaLayout[] p1,int p2,int p3,ByteBuffer p4){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, uArya, "230");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("Arya", "updateLayoutAndResolutionForScene sceneId:"+p0+", width:"+p2+", height:"+p3);
       return this.a(p0, p1, p2, p3, p4, null);
    }
    public boolean updateLayoutAndResolutionForScene(int p0,Arya$KWAryaLayout[] p1,int p2,int p3,ByteBuffer p4,ByteBuffer p5){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, uArya, "231");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.i("Arya", "updateLayoutAndResolutionForSceneWithSeiBuffer sceneId:"+p0+", width:"+p2+", height:"+p3);
       return this.a(p0, p1, p2, p3, p4, p5);
    }
    public boolean updateLayoutForScene(int p0,Arya$KWAryaLayout[] p1,ByteBuffer p2){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, Arya.class, "229");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.nativeUpdateLayoutForScene(this.t, p0, p1, p2);
    }
    public void updateLiveStreamRtmpUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya.class, "41")) {
          return;
       }
       this.nativeSetLiveStreamRtmpUrl(this.t, p0);
       return;
    }
    public void updateSelfPosition(int[] p0,float[] p1,float[] p2,float[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, Arya.class, "242")) {
          return;
       }
       this.z.a(p0, p1, p2, p3);
       this.nativeUpdateSelfPosition(this.t, p0);
       return;
    }
    public void updateWallClockTime(long p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uArya, "13")) {
          return;
       }
       this.nativeSetWallClockTime(this.t, p0);
       return;
    }
    public int websocketClose(int p0){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uArya, "322");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeWebsocketClose(this.t, p0);
    }
    public int websocketOpen(int p0,String p1,AryaWebsocketObserver p2){
       if (PatchProxy.isSupport(Arya.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, Arya.class, "321");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeWebsocketOpen(this.t, p0, p1, p2);
    }
    public int websocketSend(int p0,byte[] p1){
       Arya uArya = Arya.class;
       if (PatchProxy.isSupport(uArya)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uArya, "323");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeWebsocketSend(this.t, p0, p1);
    }
}
