package com.kwai.video.editorsdk2.ExportTask;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig$CpuDataFormat;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.minecraft.model.MutableTimeline;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.editorsdk2.t;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.io.IOException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.CRC32;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.editorsdk2.k;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PrivateExportTaskStats;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PrivateDecoderStats;
import com.kwai.video.editorsdk2.an;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PrivateRendererStats;
import com.kwai.video.editorsdk2.l;
import com.kwai.video.editorsdk2.m;
import com.kwai.video.editorsdk2.ExportTaskStatsUnit;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportEvent;
import com.kwai.video.editorsdk2.ExportTask$1;
import java.lang.Runnable;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;
import com.kwai.video.editorsdk2.p;
import com.kwai.video.editorsdk2.ExternalAudioFilterRequest;
import com.kwai.video.editorsdk2.ExternalFilterResult;
import com.kwai.video.editorsdk2.ExternalAudioFilterListener;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExternalFilterRequest;
import com.kwai.video.editorsdk2.s;
import com.kwai.video.editorsdk2.ExternalFilterRequestType;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import com.kwai.video.editorsdk2.ExternalFilterRequestListener;
import com.kwai.video.editorsdk2.r;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$UploadDecisionParamsArray;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$UploadDecisionParams;
import com.kwai.video.editorsdk2.UploadDecisionMaker;
import com.kwai.video.editorsdk2.EncodeSpeedProvider;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import com.kwai.video.editorsdk2.AudioExternalProcessor;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExternalFilterDataFormatConfigPrivate;
import com.kwai.video.editorsdk2.q;
import com.kwai.video.editorsdk2.ExternalFilterFrameInfo;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig;
import com.kwai.video.editorsdk2.j;
import com.kwai.FaceMagic.AE2.AE2Project;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import com.kwai.video.editorsdk2.ExportTask$RealtimeStatsListenerMc;

public class ExportTask	// class@001c4c
{
    public EditorSdk2$EditorSdkError A;
    public EncodeSpeedProvider B;
    public UploadDecisionMaker C;
    public String D;
    public EditorSdk2V2$VideoEditorProject E;
    public EditorSdk2$ExportOptions F;
    public final Object G;
    public boolean H;
    public ExportTask$RealtimeStatsListenerMc I;
    public j J;
    public int K;
    public int L;
    public boolean M;
    public boolean a;
    public boolean b;
    public long c;
    public EditorSdk2$ExportOptions d;
    public Context e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public ExportEventListener j;
    public ExternalFilterRequestListener k;
    public Handler l;
    public String m;
    public long n;
    public double o;
    public int p;
    public String q;
    public ByteBuffer r;
    public ByteBuffer s;
    public t t;
    public t u;
    public ExternalFilterDataFormatConfig$CpuDataFormat v;
    public ExternalFilterRequestListenerV2 w;
    public ExternalAudioFilterListener x;
    public AudioExternalProcessor y;
    public EditorSdk2$PrivateExportTaskStats z;

    public void ExportTask(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3){
       super(p0, p1, p2, p3, 0);
    }
    public void ExportTask(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3,long p4){
       super(p0, p1, p2, p3, p4, false);
    }
    public void ExportTask(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3,long p4,boolean p5){
       ExportTask uExportTask = this;
       EditorSdk2V2$VideoEditorProject videoEditorP = p1;
       EditorSdk2$ExportOptions uExportOptio = p3;
       super();
       uExportTask.c = 0;
       uExportTask.f = new Object();
       uExportTask.g = new Object();
       uExportTask.h = new Object();
       uExportTask.i = new Object();
       uExportTask.n = -1;
       uExportTask.a = false;
       uExportTask.b = false;
       uExportTask.o = 0;
       uExportTask.p = -1;
       uExportTask.q = "";
       uExportTask.v = ExternalFilterDataFormatConfig$CpuDataFormat.CPU_DATA_FORMAT_NONE;
       uExportTask.G = new Object();
       uExportTask.H = false;
       uExportTask.K = 0x2710;
       uExportTask.L = 2000;
       uExportTask.M = false;
       if (!videoEditorP) {
          throw new IOException("ExportTask error: project is null");
       }
       if (TextUtils.isEmpty(p2)) {
          throw new IOException("ExportTask error: output path is empty");
       }
       uExportTask.E = videoEditorP;
       uExportTask.F = uExportOptio;
       uExportTask.m = p2;
       uExportTask.d = uExportOptio;
       MutableTimeline mutableTimel = p1.constructTimelineBone();
       if (mutableTimel == null) {
          throw new IOException("ExportTask error: timeline is null");
       }
       uExportTask.c = this.newNativeExportTask(mutableTimel, p1.blurPaddingArea(), p1.isKwaiPhotoMovie(), p2, p3, p4);
       uExportTask.e = p0.getApplicationContext();
       uExportTask.l = new Handler(uExportTask.e.getMainLooper());
       uExportTask.t = new t();
       uExportTask.u = new t();
       if (p1.trackAssetsSize() > 0) {
          uExportTask.D = p1.trackAssets(false).assetPath();
       }
       return;
    }
    public void ExportTask(Context p0,MutableTimeline p1,boolean p2,boolean p3,String p4,EditorSdk2$ExportOptions p5){
       super(p0, p1, p2, p3, p4, p5, 0);
    }
    public void ExportTask(Context p0,MutableTimeline p1,boolean p2,boolean p3,String p4,EditorSdk2$ExportOptions p5,long p6){
       super(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public void ExportTask(Context p0,MutableTimeline p1,boolean p2,boolean p3,String p4,EditorSdk2$ExportOptions p5,long p6,boolean p7){
       ExportTask uExportTask = this;
       EditorSdk2$ExportOptions uExportOptio = p5;
       super();
       uExportTask.c = 0;
       uExportTask.f = new Object();
       uExportTask.g = new Object();
       uExportTask.h = new Object();
       uExportTask.i = new Object();
       uExportTask.n = -1;
       boolean b = false;
       uExportTask.a = b;
       uExportTask.b = b;
       uExportTask.o = 0;
       uExportTask.p = -1;
       uExportTask.q = "";
       uExportTask.v = ExternalFilterDataFormatConfig$CpuDataFormat.CPU_DATA_FORMAT_NONE;
       uExportTask.G = new Object();
       uExportTask.H = b;
       uExportTask.K = 0x2710;
       uExportTask.L = 2000;
       uExportTask.M = b;
       if (p1 == null) {
          throw new IOException("ExportTask error: timeline is null");
       }
       if (TextUtils.isEmpty(p4)) {
          throw new IOException("ExportTask error: output path is empty");
       }
       uExportTask.F = uExportOptio;
       String str = p4;
       uExportTask.m = str;
       uExportTask.d = uExportOptio;
       uExportTask.c = this.newNativeExportTask(p1, p2, p3, str, p5, p6);
       uExportTask.e = p0.getApplicationContext();
       uExportTask.l = new Handler(uExportTask.e.getMainLooper());
       uExportTask.t = new t();
       uExportTask.u = new t();
       return;
    }
    public static double a(ExportTask p0,double p1){
       p0.o = p1;
       return p1;
    }
    public static int a(ExportTask p0,int p1){
       p0.p = p1;
       return p1;
    }
    public static long a(String p0){
       BufferedInputStream obj = PatchProxy.applyOneRefs(p0, null, ExportTask.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          try{
             obj = new BufferedInputStream(uFileInputSt);
             CRC32 uCRC32 = new CRC32();
             byte[] uobyteArray = new byte[1024];
             int i = obj.read(uobyteArray);
             while (i != -1) {
                uCRC32.update(uobyteArray, 0, i);
             }
             long value = uCRC32.getValue();
             try{
                obj.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
             return value;
          }catch(java.io.IOException e0){
             InputStream inputStream = e0;
          }
          if (null) {
             try{
                null.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
          }
       }catch(java.io.IOException e0){
          goto label_0052 ;
       }
    }
    public static ExportEventListener a(ExportTask p0){
       return p0.j;
    }
    public static String a(ExportTask p0,String p1){
       p0.q = p1;
       return p1;
    }
    public static String b(ExportTask p0){
       return p0.q;
    }
    public static long c(ExportTask p0){
       return p0.c;
    }
    public long ExportFileCRC(){
       return this.n;
    }
    public boolean a(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EditorSdkLogger.i("ExportTask", "runInternal called: "+this);
       obj = this.f;
       _monitor_enter(obj);
       if (!this.c) {
          EditorSdkLogger.e("ExportTask", "Run after release! Ignore run\(\)");
          _monitor_exit(obj);
          return false;
       }else {
          this.runNative(this.c);
          _monitor_exit(obj);
          return true;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "4")) {
          return;
       }
       EditorSdkLogger.i("ExportTask", "cancelInternal called: "+this);
       ExportTask tf = this.f;
       _monitor_enter(tf);
       if (!this.c) {
          _monitor_exit(tf);
          return;
       }else {
          this.cancelNative(this.c);
          _monitor_exit(tf);
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "6")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       if (this.c) {
          this.suspendNative(this.c);
       }
       _monitor_exit(tf);
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "3")) {
          return;
       }
       EditorSdkLogger.i("ExportTask", "cancel called: "+this);
       ExportTask tf = this.f;
       _monitor_enter(tf);
       EditorSdkLogger.i("ExportTask", "cancel into lock: "+this);
       if (!this.c) {
          _monitor_exit(tf);
          return;
       }else if(k.c(this.c)){
          k.a(this.c);
          ExportTask tj = this.j;
          if (tj != null) {
             tj.onCancelled(this);
          }
       }
       k.a(this.c);
       _monitor_exit(tf);
       EditorSdkLogger.i("ExportTask", "cancel call done: "+this);
       return;
    }
    public native final void cancelNative(long p0);
    public void d(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "8")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       if (this.c) {
          this.resumeNative(this.c);
       }
       _monitor_exit(tf);
       return;
    }
    public native final void deleteNativeExportTask(long p0);
    public void e(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "32")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       k.a(this.c);
       _monitor_exit(tf);
       return;
    }
    public EditorSdk2$PrivateExportTaskStats f(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       _monitor_enter(obj);
       ExportTask tz = this.z;
       if (tz != null) {
          _monitor_exit(obj);
          return tz;
       }else if(this.c){
          _monitor_exit(obj);
          return this.getExportTaskStatsNative(this.c);
       }else {
          _monitor_exit(obj);
          return new EditorSdk2$PrivateExportTaskStats();
       }
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "34")) {
          return;
       }
       super.finalize();
       if (this.c) {
          EditorSdkLogger.w("NativeExportTask", "Delete native export task in finalize, release\(\) was not called!");
          this.deleteNativeExportTask(this.c);
       }
       return;
    }
    public EditorSdk2$EditorSdkError getError(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       _monitor_enter(obj);
       ExportTask tA = this.A;
       if (tA != null) {
          _monitor_exit(obj);
          return tA;
       }else if(!this.c){
          _monitor_exit(obj);
          return new EditorSdk2$EditorSdkError();
       }else {
          _monitor_exit(obj);
          return this.getErrorNative(this.c);
       }
    }
    public native final EditorSdk2$EditorSdkError getErrorNative(long p0);
    public ExportTaskStatsInfo getExportTaskStats(){
       EditorSdk2$PrivateExportTaskStats obj = PatchProxy.apply(null, this, ExportTask.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f();
       ArrayList uArrayList = new ArrayList();
       int i = obj.decoderStatsSize();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          uArrayList.add(new c(obj.decoderStats(i2)));
       }
       ArrayList uArrayList1 = new ArrayList();
       i = obj.renderStatsSize();
       for (; i1 < i; i1 = i1 + 1) {
          uArrayList1.add(new an(obj.renderStats(i1)));
       }
       ExportTask tE = this.E;
       String str = (tE == null)? "": new String(tE.toByteArray());
       l ol = new l(new m(obj), uArrayList, uArrayList1, false, str, new String(this.F.toByteArray()));
       return v8;
    }
    public native final EditorSdk2$PrivateExportTaskStats getExportTaskStatsNative(long p0);
    public String getFilePath(){
       Object obj = PatchProxy.apply(null, this, ExportTask.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isTranscodeSkipped() && EditorSdk2Utils.getExportVersion() <= 1) {
          return this.D;
       }
       return this.m;
    }
    public int getLinuxFileDescriptor(){
       return this.p;
    }
    public String getMcRealtimeStats(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       _monitor_enter(obj);
       if (this.c) {
          _monitor_exit(obj);
          return this.getMcRealtimeStatsNative(this.c);
       }else {
          _monitor_exit(obj);
          return null;
       }
    }
    public native final String getMcRealtimeStatsNative(long p0);
    public String getMcSummaryPreviewStats(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       _monitor_enter(obj);
       if (this.c) {
          _monitor_exit(obj);
          return this.getMcSummaryStatsNative(this.c);
       }else {
          _monitor_exit(obj);
          return null;
       }
    }
    public native final String getMcSummaryStatsNative(long p0);
    public String getMp4FilePath(){
       ExportTask obj = PatchProxy.apply(null, this, ExportTask.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       String filePath = (obj != null && (!obj.outputFormat() || this.F.outputFormat() == 1))? this.getFilePath(): "";
       return filePath;
    }
    public long getNativeExportTaskWrapperAddress(){
       ExportTask tf = this.f;
       _monitor_enter(tf);
       _monitor_exit(tf);
       return this.c;
    }
    public double getPSNR(){
       return this.o;
    }
    public boolean isTranscodeSkipped(){
       return this.a;
    }
    public boolean isWholeFileSegment(){
       return this.b;
    }
    public native final long newNativeExportTask(MutableTimeline p0,boolean p1,boolean p2,String p3,EditorSdk2$ExportOptions p4,long p5);
    public void onNativeEvent(EditorSdk2$ExportEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "31")) {
          return;
       }
       if (!p0.eventType()) {
          if (Looper.myLooper() == Looper.getMainLooper()) {
             EditorSdkLogger.e("ExportTask", "EXPORT_EVENT_FINISHED cal crc in main thread!");
          }
          this.n = ExportTask.a(this.m);
          EditorSdkLogger.i("ExportTask", "EXPORT_EVENT_FINISHED crc: "+this.n);
       }
       this.l.post(new ExportTask$1(this, p0, this));
       return;
    }
    public void onNativeExternalAudioFilter(long p0,double p1,long p2,int p3,int p4,int p5,byte[] p6){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Double.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, uExportTask, "27")) {
             return;
          }
       }
       uExportTask = this.g;
       _monitor_enter(uExportTask);
       if (this.x == null) {
          _monitor_exit(uExportTask);
          return;
       }else {
          this.x.filterOriginalSample(p.a(p0, p1, p2, p3, p4, p5, p6));
          _monitor_exit(uExportTask);
          return;
       }
    }
    public void onNativeExternalFilterRequest(EditorSdk2$ExternalFilterRequest p0,boolean p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uExportTask, "23")) {
          return;
       }
       if (p1) {
          if (this.w != null) {
             s os = new s();
             os.a(ExternalFilterRequestType.EXTERNAL_REQUEST_TYPE_EXPORT_TASK);
             this.w.releaseFilter(os);
          }else if(this.k != null){
             this.k.onExternalFilterRelease(ExternalFilterRequestType.EXTERNAL_REQUEST_TYPE_EXPORT_TASK);
          }
          return;
       }else if(this.w != null){
          r or = r.a(p0, this.t, this.u, this.v);
          int i = p0.privateRequestType();
          if (i != 2) {
             if (i == 4) {
                this.w.filterProcessedFrame(or);
             }
          }else {
             this.w.filterOriginalFrame(or);
          }
          this.t.a();
          this.u.a();
       }else if(this.k != null){
          this.k.onExternalFilterRequest(p0);
       }
       return;
    }
    public boolean onNativeExternalFilterSkippableCallback(int p0){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uExportTask, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uExportTask = this.w;
       if (uExportTask != null) {
          if (!p0) {
             return uExportTask.originalFilterSkippable();
          }else if(p0 == 1){
             return uExportTask.processedFilterSkippable();
          }
       }
       return false;
    }
    public int onNativeGetBestUploadDecision(EditorSdk2$UploadDecisionParamsArray p0){
       ExportTask obj = PatchProxy.applyOneRefs(p0, this, ExportTask.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       _monitor_enter(obj);
       ExportTask tC = this.C;
       if (tC != null) {
          _monitor_exit(obj);
          return tC.getBestIndex(p0.params().toNormalArray());
       }else {
          _monitor_exit(obj);
          return -1;
       }
    }
    public double onNativeGetHwEncodeSpeed(int p0,int p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExportTask, "18");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       uExportTask = this.i;
       _monitor_enter(uExportTask);
       ExportTask tB = this.B;
       if (tB != null) {
          _monitor_exit(uExportTask);
          return tB.getHwEncodeSpeed(p0, p1);
       }else {
          _monitor_exit(uExportTask);
          return 0xbff0000000000000;
       }
    }
    public double onNativeGetHwHevcEncodeSpeed(int p0,int p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExportTask, "19");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       uExportTask = this.i;
       _monitor_enter(uExportTask);
       ExportTask tB = this.B;
       if (tB != null) {
          _monitor_exit(uExportTask);
          return tB.getHwHevcEncodeSpeed(p0, p1);
       }else {
          _monitor_exit(uExportTask);
          return 0xbff0000000000000;
       }
    }
    public double onNativeGetSwEncodeSpeed(int p0,int p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExportTask, "20");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       uExportTask = this.i;
       _monitor_enter(uExportTask);
       ExportTask tB = this.B;
       if (tB != null) {
          _monitor_exit(uExportTask);
          return tB.getSwEncodeSpeed(p0, p1);
       }else {
          _monitor_exit(uExportTask);
          return 0xbff0000000000000;
       }
    }
    public void onNativeGlContextStatusChanged(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "33")) {
          return;
       }
       if (this.w != null) {
          s os = new s();
          os.a(ExternalFilterRequestType.EXTERNAL_REQUEST_TYPE_EXPORT_TASK);
          this.w.init(os);
       }
       return;
    }
    public boolean onNativeIsHwEncodeSupport(int p0,int p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExportTask, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uExportTask = this.i;
       _monitor_enter(uExportTask);
       ExportTask tB = this.B;
       if (tB != null) {
          _monitor_exit(uExportTask);
          return tB.isHwEncodeSupport(p0, p1);
       }else {
          _monitor_exit(uExportTask);
          return false;
       }
    }
    public boolean onNativeIsHwHevcEncodeSupport(int p0,int p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExportTask, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uExportTask = this.i;
       _monitor_enter(uExportTask);
       ExportTask tB = this.B;
       if (tB != null) {
          _monitor_exit(uExportTask);
          return tB.isHwHevcEncodeSupport(p0, p1);
       }else {
          _monitor_exit(uExportTask);
          return false;
       }
    }
    public boolean onNativeProcessPCMData(byte[] p0,double p1,double p2){
       ExportTask obj;
       if (PatchProxy.isSupport(ExportTask.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Double.valueOf(p1), Double.valueOf(p2), this, ExportTask.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.y;
       if (obj != null) {
          return obj.onProcessPCMData(p0, p1, p2);
       }else {
          return false;
       }
    }
    public ByteBuffer onNativeRequestBuffer(int p0,boolean p1){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uExportTask, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= 0) {
          return null;
       }else if(!p1){
          if (this.r == null) {
             this.r = ByteBuffer.allocateDirect(p0);
          }
          if (p0 > this.r.capacity()) {
             this.r = null;
             this.r = ByteBuffer.allocateDirect(p0);
          }
          this.r.rewind();
          return this.r;
       }else if(this.s == null){
          this.s = ByteBuffer.allocateDirect(p0);
       }
       if (p0 > this.s.capacity()) {
          this.s = null;
          this.s = ByteBuffer.allocateDirect(p0);
       }
       this.s.rewind();
       return this.s;
    }
    public EditorSdk2$ExternalFilterDataFormatConfigPrivate onNativeRequestOutputConfig(EditorSdk2$ExternalFilterRequest p0){
       ExternalFilterDataFormatConfig uExternalFil;
       EditorSdk2$ExternalFilterDataFormatConfigPrivate obj = PatchProxy.applyOneRefs(p0, this, ExportTask.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2$ExternalFilterDataFormatConfigPrivate();
       if (this.w != null) {
          q oq = q.a(p0);
          int i = p0.privateRequestType();
          if (i != 1) {
             if (i != 3) {
             label_0036 :
                uExternalFil = null;
             }else {
                uExternalFil = this.w.willFilterProcessedFrame(oq);
             }
          }else {
             uExternalFil = this.w.willFilterOriginalFrame(oq);
          }
       }else {
          goto label_0036 ;
       }
       if (uExternalFil == null) {
          this.v = ExternalFilterDataFormatConfig$CpuDataFormat.CPU_DATA_FORMAT_NONE;
          return null;
       }else {
          this.v = uExternalFil.c;
          obj.setCpuDataWidth(uExternalFil.a);
          obj.setCpuDataHeight(uExternalFil.b);
          obj.setOutputType(uExternalFil.c.intValue());
          obj.setNotNeedFilterData(uExternalFil.d);
          return obj;
       }
    }
    public void onNativeSetBuffer(ByteBuffer p0,int p1,int p2,int p3,int p4,boolean p5){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uExportTask, "26")) {
             return;
          }
       }
       if (!p5) {
          this.t.getVideoData().add(p0);
          this.t.getLinesize().add(Integer.valueOf(p1));
          if (p2 > 0) {
             this.t.a(p2, p3);
             this.t.a(p4);
          }
       }else {
          this.u.getVideoData().add(p0);
          this.u.getLinesize().add(Integer.valueOf(p1));
          if (p2 > 0) {
             this.u.a(p2, p3);
             this.u.a(p4);
          }
       }
       return;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ExportTask.class, "9")) {
          return;
       }
       ExportTask tG = this.G;
       _monitor_enter(tG);
       if (this.H != null) {
          _monitor_exit(tG);
          return;
       }else {
          this.H = true;
          _monitor_exit(tG);
          ExportTask tf = this.f;
          _monitor_enter(tf);
          tG = this.J;
          if (tG != null) {
             tG.a();
          }
          if (!this.c) {
             _monitor_exit(tf);
             return;
          }else {
             this.j = objArray;
             this.deleteNativeExportTask(this.c);
             this.c = 0;
             _monitor_exit(tf);
             return;
          }
       }
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "7")) {
          return;
       }
       EditorSdkLogger.i("ExportTask", "resume called: "+this);
       k.b();
       return;
    }
    public native final void resumeNative(long p0);
    public void run(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "1")) {
          return;
       }
       EditorSdkLogger.i("ExportTask", "run called: "+this);
       ExportTask tf = this.f;
       _monitor_enter(tf);
       EditorSdkLogger.i("ExportTask", "run into lock: "+this);
       if (!this.c) {
          EditorSdkLogger.e("ExportTask", "Run after release! Ignore run\(\)");
          _monitor_exit(tf);
          return;
       }else {
          k.a(this, this.c);
          _monitor_exit(tf);
          EditorSdkLogger.i("ExportTask", "run call done: "+this);
          return;
       }
    }
    public native final void runNative(long p0);
    public void setAE2Projects(AE2Project p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExportTask.class, "44")) {
          return;
       }
       throw new RuntimeException("setAE2Projects is deprecated");
    }
    public void setAE2Projects(String p0,String[] p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ExportTask.class, "43")) {
          return;
       }
       throw new RuntimeException("setAE2Projects is deprecated");
    }
    public void setAudioExternalProcessor(AudioExternalProcessor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "39")) {
          return;
       }
       this.y = p0;
       if (this.c) {
          ExportTask tc = this.c;
          boolean b = (p0 != null)? true: false;
          this.setAudioExternalProcessorNative(tc, b);
       }
       return;
    }
    public native final void setAudioExternalProcessorNative(long p0,boolean p1);
    public native final void setEncodeSpeedProvider(long p0,boolean p1);
    public void setEncodeSpeedProvider(EncodeSpeedProvider p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "14")) {
          return;
       }
       ExportTask ti = this.i;
       _monitor_enter(ti);
       this.B = p0;
       ExportTask tc = this.c;
       boolean b = (p0 != null)? true: false;
       this.setEncodeSpeedProvider(tc, b);
       _monitor_exit(ti);
       return;
    }
    public void setExportEventListener(ExportEventListener p0){
       ExportTask tf = this.f;
       _monitor_enter(tf);
       this.j = p0;
       _monitor_exit(tf);
    }
    public native final void setExternalAudioFilterFlag(long p0,boolean p1);
    public void setExternalAudioFilterListener(ExternalAudioFilterListener p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "13")) {
          return;
       }
       ExportTask tg = this.g;
       _monitor_enter(tg);
       this.x = p0;
       if (!this.c) {
          _monitor_exit(tg);
          return;
       }else if(p0 != null){
          b = true;
       }else {
          b = false;
       }
       this.setExternalAudioFilterFlag(this.c, b);
       _monitor_exit(tg);
       return;
    }
    public native final void setExternalFilterRequestFlag(long p0,boolean p1);
    public void setExternalFilterRequestListener(ExternalFilterRequestListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "11")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       this.k = p0;
       if (this.w != null) {
          throw new IllegalStateException("Should not use both listener and listenerv2");
       }
       if (!this.c) {
          _monitor_exit(tf);
          return;
       }else {
          ExportTask tc = this.c;
          boolean b = (p0 != null)? true: false;
          this.setExternalFilterRequestFlag(tc, b);
          _monitor_exit(tf);
          return;
       }
    }
    public void setExternalFilterRequestListenerV2(ExternalFilterRequestListenerV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "12")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       this.w = p0;
       if (this.k != null) {
          throw new IllegalStateException("Should not use both listener and listenerv2");
       }
       if (!this.c) {
          _monitor_exit(tf);
          return;
       }else {
          ExportTask tc = this.c;
          boolean b = (p0 != null)? true: false;
          this.setExternalFilterRequestFlag(tc, b);
          _monitor_exit(tf);
          return;
       }
    }
    public void setProjectSeparate(boolean p0){
       ExportTask uExportTask = ExportTask.class;
       if (PatchProxy.isSupport(uExportTask) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uExportTask, "42")) {
          return;
       }
       throw new RuntimeException("setAE2Projects is deprecated");
    }
    public native final void setUploadDecisionMaker(long p0,boolean p1);
    public void setUploadDecisionMaker(UploadDecisionMaker p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "15")) {
          return;
       }
       ExportTask th = this.h;
       _monitor_enter(th);
       this.C = p0;
       ExportTask tc = this.c;
       boolean b = (p0 != null)? true: false;
       this.setUploadDecisionMaker(tc, b);
       _monitor_exit(th);
       return;
    }
    public void startRealtimeQosWithListener(ExportTask$RealtimeStatsListenerMc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExportTask.class, "10")) {
          return;
       }
       ExportTask tf = this.f;
       _monitor_enter(tf);
       this.I = p0;
       if (this.M == true) {
          _monitor_exit(tf);
          return;
       }else if(this.J == null){
          j oj = new j((long)this.K, (long)this.L, this);
          this.J = this.J;
       }
       this.J.a(this.I);
       this.M = true;
       _monitor_exit(tf);
       return;
    }
    public void suspend(){
       if (PatchProxy.applyVoid(null, this, ExportTask.class, "5")) {
          return;
       }
       EditorSdkLogger.i("ExportTask", "suspend called: "+this);
       k.a();
       return;
    }
    public native final void suspendNative(long p0);
}
