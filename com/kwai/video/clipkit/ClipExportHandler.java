package com.kwai.video.clipkit.ClipExportHandler;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import java.io.FileWriter;
import java.lang.StringBuffer;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.lang.System;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.RemuxTask;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.lang.Math;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.RemuxTaskInputParamsBuilder;
import com.kwai.video.editorsdk2.RemuxTaskParamsBuilder;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.RemuxTaskInputStreamType;
import com.kwai.video.editorsdk2.RemuxTaskInputParams;
import com.kwai.video.editorsdk2.RemuxTaskMode;
import com.kwai.video.editorsdk2.RemuxTaskParams;
import com.kwai.video.clipkit.ClipExportHandler$4;
import com.kwai.video.editorsdk2.Mp4RemuxerEventListener;
import com.kwai.video.clipkit.ClipExportHandler$3;
import com.kwai.video.clipkit.ClipExportHandler$7;
import com.kwai.video.clipkit.ClipExportHandler$2;
import com.kwai.video.clipkit.ClipExportHandler$1;
import java.lang.Thread;
import java.lang.Throwable;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.clipkit.ClipExportHandler$10;
import java.util.Map;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Number;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.util.HashMap;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.clipkit.CoverInfoParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import com.kwai.video.clipkit.cape.CapeExportParams;
import com.kwai.video.clipkit.cape.CapeHandlerInterface;
import com.kwai.video.clipkit.cape.CapeManager;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import com.kwai.video.devicepersona.benchmark.BenchmarkOptions;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.google.gson.Gson;
import android.os.SystemClock;
import com.kwai.video.clipkit.ClipExportHandler$13;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListener;
import java.lang.Exception;
import com.kwai.video.clipkit.ClipExportHandler$12;
import com.kwai.video.clipkit.ClipExportHandler$11;
import com.kwai.video.clipkit.ClipExportHandler$14;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.clipkit.ClipKitUtils$ProjectTranscodeResult;
import com.kwai.video.editorsdk2.model.MutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListenerV3;
import com.kwai.video.devicepersonabenchmark.codec.BenchmarkEncodeProfile;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.clipkit.cape.CapeTaskParams;
import com.kwai.video.editorsdk2.ExternalFilterRequestListener;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import com.kwai.video.clipkit.ClipExportHandler$8;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;
import com.kwai.video.clipkit.ClipExportHandler$9;
import com.kwai.video.clipkit.ClipExportHandler$5;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.clipkit.ClipExportHandler$6;

public class ClipExportHandler	// class@001a18
{
    public boolean isForceTransCode;
    public Context mApplicationContext;
    public int mAudioConcatCount;
    public BenchmarkOptions mBenchmarkOptions;
    public CapeHandlerInterface mCapeHandler;
    public Map mCapeStatsUnit;
    public ClipExportHandler$ClipExportListener mClipExportListener;
    public String mConcatAudioTempPath;
    public String mConcatVideoTempPath;
    public CoverInfoParams mCoverInfoParams;
    public double mCurrentProgress;
    public List mDeleteTempPaths;
    public boolean mDisableHwEncode;
    public String mExportDir;
    public int mExportFlag;
    public ClipEditExportLog mExportLog;
    public EditorSdk2$ExportOptions mExportOptions;
    public String mExportPath;
    public ExportTaskStatsInfo mExportTaskStatsInfo;
    public List mExportTasks;
    public ExternalFilterRequestListener mExternalFilterRequestListener;
    public ExternalFilterRequestListenerV2 mExternalFilterRequestListenerV2;
    public ClipEditExtraInfo mExtraInfo;
    public boolean mIsCancel;
    public boolean mIsEnableConcatMode;
    public boolean mIsPipeline;
    public boolean mIsRunning;
    public double mLastProgress;
    public Object mLock;
    public Handler mMainHandler;
    public boolean mNeedRemux;
    public ImmutableArray mOriginTrackAsset;
    public EditorSdk2V2$VideoEditorProject mProject;
    public List mRemuxTasks;
    public int mRemuxerFlag;
    public final Object mRenderRangeLock;
    public EditorSdk2$RenderRange[] mRenderRanges;
    public String mSessionId;
    public int mSoftReason;
    public String mTempFileDir;
    public String mTempForCoverPath;
    public String mTempPipelinePath;
    public String mTranscodeAudioTempPath;
    public String mTranscodeCoverTempPath;
    public int mVideoType;

    public void ClipExportHandler(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3,int p4){
       super();
       this.mLock = new Object();
       this.mRenderRangeLock = new Object();
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mExportFlag = 0;
       this.mAudioConcatCount = 0;
       this.mIsEnableConcatMode = false;
       this.mDisableHwEncode = false;
       this.mCapeHandler = null;
       this.mRenderRanges = null;
       this.mCapeStatsUnit = null;
       this.mNeedRemux = true;
       this.mApplicationContext = p0.getApplicationContext();
       this.mProject = p1.clone();
       this.mExportPath = p2;
       this.mExportOptions = p3;
       this.mExportDir = new File(this.mExportPath).getParent();
       ClipExportHandler tmExportDir = (TextUtils.isEmpty(p3.temporaryFilesDirectory()))? this.mExportDir: p3.temporaryFilesDirectory();
       this.mTempFileDir = tmExportDir;
       this.mCurrentProgress = 0;
       this.mLastProgress = 0;
       this.mIsCancel = false;
       this.mIsRunning = false;
       this.mRemuxerFlag = p4;
       return;
    }
    public static boolean generateConcatFileList(String[] p0,String p1){
       FileWriter uFileWriter;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipExportHandler.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || !p0.length) {
       label_0094 :
          return false;
       }
       try{
          File uFile = new File(p1);
          if (uFile.exists()) {
             uFile.delete();
             KSClipLog.i("ClipExportHandler", "generateConcatFileList delete tmp file "+p1);
          }
          if (!uFile.createNewFile()) {
             return false;
          }else {
             try{
                uFileWriter = new FileWriter(p1);
                p1 = "";
                int len = p0.length;
                for (int i = 0; i < len; i = i + 1) {
                   p1 = p1+"file "+p0[i]+"\n";
                }
                uFileWriter.append(p1);
                try{
                   p1.setLength(false);
                   uFileWriter.close();
                   return true;
                }catch(java.io.IOException e0){
                }
             }catch(java.io.IOException e0){
                FileWriter uFileWriter1 = uFileWriter;
             }
             if (null) {
                try{
                   null.close();
                   goto label_0094 ;
                }catch(java.io.IOException e0){
                }
             }else {
                goto label_0094 ;
             }
          }
       }catch(java.io.IOException e0){
          goto label_008f ;
       }
    }
    public final String addTimeForPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipExportHandler.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SimpleDateFormat("yyMMdd_HHmmss", Locale.US).format(new Date(System.currentTimeMillis()))+"_"+p0;
    }
    public void cancel(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "29")) {
          return;
       }
       KSClipLog.i("ClipExportHandler", "cancel call");
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       ClipExportHandler tmExportTask = this.mExportTasks;
       if (tmExportTask != null) {
          iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel();
          }
          this.mExportTasks.clear();
       }
       tmExportTask = this.mRemuxTasks;
       if (tmExportTask != null) {
          iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel();
          }
          this.mRemuxTasks.clear();
       }
       this.mIsCancel = true;
       _monitor_exit(tmLock);
       return;
    }
    public final void checkExportFlag(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "16")) {
          return;
       }
       int i = 2;
       if (this.mProject.trackAssetsSize() == 1 && (!this.mProject.audioAssetsSize() && (this.isKeepOriginTrackVolume() && TextUtils.isEmpty(this.mExportOptions.comment())))) {
          if (this.hasCover()) {
             this.mConcatVideoTempPath = this.mProject.trackAssets(0).assetPath();
             if (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(0))) {
                this.mExportFlag = this.mExportFlag | 0x38;
             }else {
                this.mTempForCoverPath = this.mConcatVideoTempPath;
                this.mExportFlag = this.mExportFlag | 0x20;
             }
          }else if(this.useFastStart()){
             i = 1;
          }
          this.mExportFlag = i;
          return;
       }else if(this.mProject.trackAssetsSize() == 1 && (TextUtils.isEmpty(this.mExportOptions.comment()) || (this.isKeepOriginTrackVolume() || (this.mProject.trackAssetsSize() > 1 && (this.isKeepOriginTrackVolume() && !this.mProject.audioAssetsSize()))))){
          if (this.hasCover()) {
             if (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(0))) {
                this.mExportFlag = (this.mProject.trackAssetsSize() > 1)? i: this.mProject.trackAssets(0).assetPath();
                this.mExportFlag = this.mExportFlag | 0x38;
             }else if(this.mProject.trackAssetsSize() <= 1){
                this.mTempForCoverPath = this.mProject.trackAssets(0).assetPath();
             }
             this.mExportFlag = this.mExportFlag | 0x20;
          }else {
             this.mExportFlag = i;
          }
          return;
       }else if(this.mProject.trackAssetsSize() >= 1 && (this.isTrackAudioMute() && (this.mProject.audioAssetsSize() == 1 && Math.abs((this.mProject.audioAssets(0).volume() - 0x3ff0000000000000)) - 0x3f50624dd2f1a9fc < 0))){
          this.mExportFlag = (this.mProject.trackAssetsSize() > 1)? i: this.mProject.trackAssets(0).assetPath();
          double audioTrackDu = EditorSdk2Utils.getAudioTrackDuration(this.mProject.audioAssets(0).assetPath());
          double computedDura = EditorSdk2UtilsV2.getComputedDuration(this.mProject);
          String str = "ClipExportHandler";
          if (computedDura <= 0) {
             KSClipLog.e(str, "invalid video param process abort");
             this.mExportFlag = 0;
             return;
          }else if(audioTrackDu <= 0){
             KSClipLog.w(str, "invalid audio param will not process audioasset");
             this.mExportFlag = this.mExportFlag | 0x10;
          }else if(computedDura - audioTrackDu <= 0){
             if (!this.isSupportAudioRemuxPath(this.mProject.audioAssets(0).assetPath()) || this.hasAudioAssetFilterParam(this.mProject.audioAssets(0))) {
                this.mExportFlag = this.mExportFlag | 0x08;
             }
             this.mExportFlag = this.mExportFlag | 0x10;
          }else {
             this.mAudioConcatCount = (int)Math.ceil((computedDura / audioTrackDu));
             if (!this.isSupportAudioRemuxPath(this.mProject.audioAssets(0).assetPath()) || this.hasAudioAssetFilterParam(this.mProject.audioAssets(0))) {
                this.mExportFlag = this.mExportFlag | 0x18;
             }else {
                this.mExportFlag = this.mExportFlag | 0x14;
             }
          }
       }
    label_01c4 :
       if (this.mProject.trackAssetsSize() >= 1 && (this.isKeepOriginTrackVolume() || (this.mProject.audioAssetsSize() && (this.mProject.trackAssetsSize() >= 1 && (this.isTrackAudioMute() || (this.mProject.audioAssetsSize() >= 1 || (this.mProject.trackAssetsSize() >= 1 && (this.isTrackAudioMute() && (this.mProject.audioAssetsSize() > 1 || !this.isKeepOriginAudioVolume()))))))))) {
          this.mExportFlag = (this.mProject.trackAssetsSize() > 1)? i: this.mProject.trackAssets(0).assetPath();
          if (!ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(0)) && (this.mProject.audioAssetsSize() > 1 || (this.mProject.audioAssetsSize() == 1 && (this.hasAudioAssetFilterParam(this.mProject.audioAssets(0)) || !this.isKeepOriginAudioVolume())))) {
             this.mExportFlag = this.mExportFlag | 0x18;
          }else if(this.mProject.audioAssetsSize() == 1){
             this.mExportFlag = this.mExportFlag | 0x10;
          }
       }
    label_0267 :
       if (this.hasCover()) {
          this.mExportFlag = (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(0)) || this.mProject.audioAssetsSize() >= 1)? this.mExportFlag | 0x38: this.mExportFlag | 0x20;
       }
    label_028f :
       return;
    }
    public void combineVideoAndAudio(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ClipExportHandler.class, "12")) {
          return;
       }
       if (TextUtils.isEmpty(p0) || (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2))) {
          if (this.hasCover()) {
             p2 = this.mTempFileDir+File.separator+this.addTimeForPath("tmp_export.mp4");
          }
          RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(this.mApplicationContext);
          RemuxTaskInputParamsBuilder remuxTaskInp = remuxTask.newRemuxInputParamsBuilder();
          super();
          this.add(remuxTaskInp.setPath(p1).setDuration(EditorSdk2UtilsV2.getComputedDuration(this.mProject)).setType(RemuxTaskInputStreamType.AUDIO).build());
          this.add(remuxTaskInp.setPath(p0).setDuration(EditorSdk2UtilsV2.getComputedDuration(this.mProject)).setType(RemuxTaskInputStreamType.VIDEO).build());
          RemuxTaskParams remuxTaskPar = remuxTask.newRemuxParamsBuilder().setInputParams(this).setOutputPath(p2).setComment(this.mExportOptions.comment()).setRemuxTaskMode(RemuxTaskMode.STREAM_COMBINE).setFlag(this.mRemuxerFlag).build();
          ClipExportHandler$4 u4 = new ClipExportHandler$4(this, p2);
          if (this.mIsCancel != null) {
             this.notifyCancelCallback("combineVideoAndAudio");
             return;
          }else if(!p2.equals(this.mExportPath)){
             this.mDeleteTempPaths.add(p2);
          }
          remuxTask.startRemuxAsync(remuxTaskPar, u4);
          this.mRemuxTasks.add(remuxTask);
          KSClipLog.i("ClipExportHandler", "combineVideoAndAudio, videoPath:"+p0+",audioPath:"+p1+",outPath:"+p2);
       }
    label_00fa :
       return;
    }
    public final void concatAudio(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "11")) {
          return;
       }
       RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(this.mApplicationContext);
       RemuxTaskParamsBuilder remuxTaskPar = remuxTask.newRemuxParamsBuilder();
       RemuxTaskInputParamsBuilder remuxTaskInp = remuxTask.newRemuxInputParamsBuilder();
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < this.mAudioConcatCount; i = i + 1) {
          uArrayList.add(remuxTaskInp.setPath(this.mProject.audioAssets(0).assetPath()).build());
       }
       RemuxTaskParams remuxTaskPar1 = remuxTaskPar.setInputParams(uArrayList).setOutputPath(p0).setRemuxTaskMode(RemuxTaskMode.SEGMENT_CONCAT).setFlag(this.mRemuxerFlag).build();
       ClipExportHandler$3 u3 = new ClipExportHandler$3(this, p0);
       if (this.mIsCancel != null) {
          this.notifyCancelCallback("ConcatAudio");
          return;
       }else {
          this.mDeleteTempPaths.add(p0);
          remuxTask.startRemuxAsync(remuxTaskPar1, u3);
          this.mRemuxTasks.add(remuxTask);
          KSClipLog.i("ClipExportHandler", "concatAudio,outPath:"+p0);
          return;
       }
    }
    public void concatCover(String p0,boolean p1){
       String[] stringArray1;
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uClipExportH, "15")) {
          return;
       }
       uClipExportH = null;
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       int i = 0;
       int i1 = 1;
       if (TextUtils.isEmpty(this.mTempForCoverPath) && (this.mExportFlag == 32 && !TextUtils.isEmpty(this.mTranscodeCoverTempPath))) {
          int i2 = this.mProject.trackAssetsSize() + i1;
          String[] stringArray = new String[i2];
          stringArray[i] = this.mTranscodeCoverTempPath;
          for (; i1 < i2; i1 = i1 + 1) {
             int i3 = i1 - 1;
             stringArray[i1] = this.mProject.trackAssets(i3).assetPath();
          }
          stringArray1 = stringArray;
       }else if(!TextUtils.isEmpty(this.mTranscodeCoverTempPath) && !TextUtils.isEmpty(this.mTempForCoverPath)){
          stringArray1 = new String[]{this.mTranscodeCoverTempPath,this.mTempForCoverPath};
       }
       _monitor_exit(tmLock);
       if (stringArray1 == null) {
          return;
       }else {
          RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(this.mApplicationContext);
          RemuxTaskParamsBuilder remuxTaskPar = remuxTask.newRemuxParamsBuilder();
          RemuxTaskInputParamsBuilder remuxTaskInp = remuxTask.newRemuxInputParamsBuilder();
          ArrayList uArrayList = new ArrayList();
          if (p1) {
             String str = this.mTempFileDir+File.separator+this.addTimeForPath("tmp_concat_filelist.txt");
             if (!ClipExportHandler.generateConcatFileList(stringArray1, str)) {
                this.concatCover(p0, i);
                return;
             }else {
                uArrayList.add(remuxTaskInp.setPath(str).build());
                this.mDeleteTempPaths.add(str);
                for (; i < stringArray1.length; uArrayList.add(remuxTaskInp.setPath(stringArray1[i]).build())) {
                }
             }
          }else {
             for (i = i + 1; i < stringArray1.length; i = i + 1) {
                uArrayList.add(remuxTaskInp.setPath(stringArray1[i]).build());
             }
          }
          this.mRemuxerFlag = (p1)? this.mRemuxerFlag | 0x08: this.mRemuxerFlag & 0xf7;
          RemuxTaskParams remuxTaskPar1 = remuxTaskPar.setInputParams(uArrayList).setOutputPath(p0).setRemuxTaskMode(RemuxTaskMode.SEGMENT_CONCAT).setComment(this.mExportOptions.comment()).setFlag(this.mRemuxerFlag).build();
          ClipExportHandler$7 u7 = new ClipExportHandler$7(this);
          if (this.mIsCancel != null) {
             this.notifyCancelCallback("ConcatCover");
             return;
          }else {
             remuxTask.startRemuxAsync(remuxTaskPar1, u7);
             this.mRemuxTasks.add(remuxTask);
             KSClipLog.d("ClipExportHandler", "ConcatCover,outPath:"+p0);
             return;
          }
       }
    }
    public void concatVideo(String p0,boolean p1){
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uClipExportH, "10")) {
          return;
       }
       RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(this.mApplicationContext);
       RemuxTaskParamsBuilder remuxTaskPar = remuxTask.newRemuxParamsBuilder();
       RemuxTaskInputParamsBuilder remuxTaskInp = remuxTask.newRemuxInputParamsBuilder();
       ArrayList uArrayList = new ArrayList();
       boolean b = false;
       if (p1) {
          String str = this.mTempFileDir+File.separator+this.addTimeForPath("tmp_concat_filelist.txt");
          int i = this.mProject.trackAssetsSize();
          String[] stringArray = new String[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             stringArray[i1] = this.mProject.trackAssets(i1).assetPath();
          }
          if (!ClipExportHandler.generateConcatFileList(stringArray, str)) {
             this.concatVideo(p0, b);
             return;
          }else {
             uArrayList.add(remuxTaskInp.setPath(str).build());
             this.mDeleteTempPaths.add(str);
          }
       }else {
          for (; b < this.mProject.trackAssetsSize(); b = b + 1) {
             uArrayList.add(remuxTaskInp.setPath(this.mProject.trackAssets(b).assetPath()).build());
          }
       }
       this.mRemuxerFlag = (p1)? this.mRemuxerFlag | 0x08: this.mRemuxerFlag & 0xf7;
       RemuxTaskParams remuxTaskPar1 = remuxTaskPar.setInputParams(uArrayList).setOutputPath(p0).setRemuxTaskMode(RemuxTaskMode.SEGMENT_CONCAT).setComment(this.mExportOptions.comment()).setFlag(this.mRemuxerFlag).build();
       ClipExportHandler$2 u2 = new ClipExportHandler$2(this, p1, p0);
       if (this.mIsCancel != null) {
          this.notifyCancelCallback("combineVideoAndAudio");
          return;
       }else if(!p0.equals(this.mExportPath)){
          this.mDeleteTempPaths.add(p0);
       }
       remuxTask.startRemuxAsync(remuxTaskPar1, u2);
       this.mRemuxTasks.add(remuxTask);
       KSClipLog.i("ClipExportHandler", "concatVideo,outPath:"+p0);
       return;
    }
    public final void copyFile(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "8")) {
          return;
       }
       String str = "copyFile source:"+this.mProject.trackAssets(0).assetPath()+",export";
       try{
          KSClipLog.i("ClipExportHandler", str);
          new ClipExportHandler$1(this, "ClipExportHandler").start();
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipExportHandler", "copyFile create thread error", e0);
          this.notifyErrorCallback("CopyFile", new ClipExportException(100, -100002, "thread create failed"));
       }
       return;
    }
    public final void copyPipelineRemuxFile(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler.class, "25")) {
          return;
       }
       String str = "copyPipelineRemuxFile remuxPath:"+p0+",targetPath:"+p1;
       try{
          KSClipLog.i("ClipExportHandler", str);
          new ClipExportHandler$10(this, "ClipExportHandler", p1, p0).start();
       }catch(java.lang.Exception e3){
          KSClipLog.e("ClipExportHandler", "copyFile create thread error", e3);
          this.notifyErrorCallback("CopyFile", new ClipExportException(100, -100002, "thread create failed"));
       }
       return;
    }
    public Map getCAPEStatsUnit(){
       return this.mCapeStatsUnit;
    }
    public double getCallBackProgress(int p0,double p1){
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Double.valueOf(p1), this, uClipExportH, "26");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       uClipExportH = this.mLock;
       _monitor_enter(uClipExportH);
       if (p0) {
          double d = 0x3fd3333340000000;
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 == 4) {
                      p1 = (p1 * 0x3fc99999a0000000) + 0x3fe99999accccccd;
                      if (p1 - this.mCurrentProgress > 0) {
                         this.mCurrentProgress = p1;
                      }
                   }
                }else {
                   double d1 = 0x3fb999999999999a;
                   double d2 = (this.hasCover())? 0x3fe666667999999a: 0x3feccccce0000000;
                   p1 = (p1 * d1) + d2;
                   if (p1 - this.mCurrentProgress > 0) {
                      this.mCurrentProgress = p1;
                   }
                }
             }else if(this.hasCover()){
                p1 = (p1 * 0x3fe000000ccccccd) + 0x3fc99999b3333333;
             }else {
                p1 = (p1 * 0x3fe3333340000000) + d;
             }
             if (p1 - this.mCurrentProgress > 0) {
                this.mCurrentProgress = p1;
             }
          }else if(this.mExportFlag <= 2){
             if (p1 - this.mCurrentProgress > 0) {
                this.mCurrentProgress = p1;
             }
          }else if(this.hasCover()){
             p1 = p1 * 0x3fc99999b3333333;
          }else {
             p1 = p1 * d;
          }
          if (p1 - this.mCurrentProgress > 0) {
             this.mCurrentProgress = p1;
          }
       }else {
          this.mCurrentProgress = 0;
       }
       _monitor_exit(uClipExportH);
       return this.mCurrentProgress;
    }
    public ExportTaskStatsInfo getExportTaskStatsInfo(){
       return this.mExportTaskStatsInfo;
    }
    public int getLastErrorCode(){
       ClipExportHandler tmExportLog = this.mExportLog;
       if (tmExportLog != null) {
          return tmExportLog.lastErrorCode;
       }
       return 0;
    }
    public EditorSdk2$RenderRange[] getRenderRanges(){
       ClipExportHandler tmRenderRang = this.mRenderRangeLock;
       _monitor_enter(tmRenderRang);
       _monitor_exit(tmRenderRang);
       return this.mRenderRanges;
    }
    public String getTempPipelinePath(){
       return this.mTempPipelinePath;
    }
    public int getVideoType(){
       ClipExportHandler obj = PatchProxy.apply(null, this, ClipExportHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          obj = this.mVideoType;
          if (obj == null) {
             int i = 4;
             ClipExportHandler tmExtraInfo = this.mExtraInfo;
             if (tmExtraInfo != null) {
                ClipEditExtraInfo appMap = tmExtraInfo.appMap;
                if (appMap != null && appMap.containsKey("videoType")) {
                   i = Integer.parseInt(this.mExtraInfo.appMap.get("videoType"));
                }
             }
          }
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean hasAudioAssetFilterParam(EditorSdk2V2$AudioAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipExportHandler.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.audioFilterParam() != null) {
          return true;
       }
       return false;
    }
    public boolean hasCover(){
       ClipExportHandler obj = PatchProxy.apply(null, this, ClipExportHandler.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCoverInfoParams;
       boolean b = (obj != null && !TextUtils.isEmpty(obj.path))? true: false;
       return b;
    }
    public void initCape(String p0,EditorEncodeConfig$CapeConfig p1,CapeExportParams p2){
       ClipExportHandler tmExportOpti;
       BenchmarkOptions uBenchmarkOp;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ClipExportHandler.class, "2")) {
          return;
       }
       String str = "ClipExportHandler";
       if (p1 == null || p2 == null) {
          KSClipLog.e(str, "initCape invalid null param");
          return;
       }else if(p1.openUploadDecision == null && (p1.openEncodeAnalyze == null || p2.capeModelIndex < null)){
          KSClipLog.e(str, "initCape not open");
          return;
       }else if(this.mCapeHandler == null){
          this.mCapeHandler = CapeManager.createCapeHandler(this.mApplicationContext);
       }
       ClipExportHandler tmCapeHandle = this.mCapeHandler;
       if (tmCapeHandle != null) {
          tmCapeHandle.setCapeSessionId(p0);
          if (!p1.uploadDecisionMaxBytes) {
             tmExportOpti = this.mExportOptions;
             if (tmExportOpti != null && tmExportOpti.skipTranscodeConfig() != null) {
                p1.uploadDecisionMaxBytes = (long)this.mExportOptions.skipTranscodeConfig().uploadDecisionMaxBytes();
             }
          }
          this.mCapeHandler.setCapeConfig(p1);
          this.mCapeHandler.setCapeExportParams(p2);
          if (!EditorSdk2UtilsV2.isSingleImagePath(this.mExportPath) && this.mDisableHwEncode == null) {
             tmExportOpti = this.mBenchmarkOptions;
             if (tmExportOpti == null) {
                uBenchmarkOp = BenchmarkOptions.createDefaultOptions();
             }
             this.mCapeHandler.setEnableHwEncode(this.isHwEncodeSupport(uBenchmarkOp).isSupport);
          }
       }
    label_0083 :
       return;
    }
    public final boolean isFallbackErrorCode(ClipExportException p0){
       ClipExportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipExportHandler.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mExportLog;
       if (obj != null && obj.lastErrorCode != null) {
          return false;
       }
       ClipExportException errorCode = p0.errorCode;
       if (errorCode != -28 && p0.errorType != 4) {
          if (obj.skipTranscode == null) {
             return true;
          }else if(this.mIsPipeline == null){
             if (ClipDPHardwareConfigManager.getInstance().fallBackDecoderConfig(this.mApplicationContext, this.mProject, errorCode)) {
                KSClipLog.w("ClipExportHandler", "isFallbackErrorCode fallBack soft decode");
                return true;
             }else if(ClipDPHardwareConfigManager.getInstance().isEncodeFallbackErrorCode(errorCode)){
                this.mExportOptions.setVideoEncoderType(true);
                this.mDisableHwEncode = true;
                KSClipLog.w("ClipExportHandler", "isFallbackErrorCode fallBack soft encode");
                return true;
             }
          }
       }
       return false;
    }
    public final DPHardwareConfigManager$EncodeResult isHwEncodeSupport(BenchmarkOptions p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipExportHandler.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExportOptions.width() > 0 && this.mExportOptions.height() > 0) {
          i = Math.max(this.mExportOptions.width(), this.mExportOptions.height());
       }else if(this.mProject.projectOutputWidth() > 0 && this.mProject.projectOutputHeight() > 0){
          i = Math.max(this.mProject.projectOutputWidth(), this.mProject.projectOutputHeight());
       }else {
          i = Math.max(EditorSdk2UtilsV2.getComputedWidth(this.mProject), EditorSdk2UtilsV2.getComputedHeight(this.mProject));
       }
       DPHardwareConfigManager$EncodeResult uEncodeResul = ClipDPHardwareConfigManager.getInstance().isSupportEncodeWithResult(this.mApplicationContext, "avc", i, p0.minEncodeSpeed, p0.enableEncode, p0.minProfile, p0.alignmentFlag);
       KSClipLog.i("ClipExportHandler", "isHwEncodeSupport:"+uEncodeResul.isSupport+", maxEdge:"+i+", benchmarkOptions:"+ClipKitUtils.COMMON_GSON.q(this.mBenchmarkOptions));
       return uEncodeResul;
    }
    public final boolean isKeepOriginAudioVolume(){
       Object obj = PatchProxy.apply(null, this, ClipExportHandler.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < this.mProject.audioAssetsSize()) {
             double d = this.mProject.audioAssets(i).volume() - 0x3ff0000000000000;
             if (Math.abs(d) - 0x3f50624dd2f1a9fc > 0) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             b = true;
             break ;
          }
       }
       return b;
    }
    public final boolean isKeepOriginTrackVolume(){
       Object obj = PatchProxy.apply(null, this, ClipExportHandler.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.mProject.muteFlags()) {
          int i = 0;
          while (true) {
             if (i < this.mProject.trackAssetsSize()) {
                if (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(i))) {
                   double d = this.mProject.trackAssets(i).volume() - 0x3ff0000000000000;
                   if (Math.abs(d) - 0x3f50624dd2f1a9fc <= 0) {
                   }
                }else {
                }
             }else {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean isSupportAudioRemuxPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipExportHandler.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0) && (p0.toLowerCase()).endsWith(".mp4")) {
          return true;
       }
       return false;
    }
    public final boolean isTrackAudioMute(){
       Object obj = PatchProxy.apply(null, this, ClipExportHandler.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mProject.muteFlags() == 1) {
          return true;
       }
       int i = 0;
       while (true) {
          if (i >= this.mProject.trackAssetsSize()) {
             return false;
          }
          if (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(i))) {
             double d = this.mProject.trackAssets(i).volume() - 0;
             if (Math.abs(d) - 0x3f50624dd2f1a9fc <= 0) {
                break ;
             }
          }
          i = i + 1;
       }
       return true;
    }
    public void notifyCancelCallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "35")) {
          return;
       }
       KSClipLog.e("ClipExportHandler", p0+" notifyCancelCallback");
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mExportLog.encodeEndTime = SystemClock.elapsedRealtime();
       this.reportLog(9);
       _monitor_exit(tmLock);
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyCancelCallbackInner();
       }else {
          this.mMainHandler.post(new ClipExportHandler$13(this));
       }
       return;
    }
    public void notifyCancelCallbackInner(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "36")) {
          return;
       }
       this.release();
       ClipExportHandler tmClipExport = this.mClipExportListener;
       if (tmClipExport != null) {
          tmClipExport.onCancelled();
       }
       return;
    }
    public void notifyErrorCallback(String p0,ClipExportException p1){
       ClipExportHandler tmExportLog;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler.class, "33")) {
          return;
       }
       KSClipLog.e("ClipExportHandler", p0+" notifyErrorCallback,error:"+p1.getMessage());
       if (this.isFallbackErrorCode(p1)) {
          try{
             tmExportLog = this.mExportLog;
             if (tmExportLog != null) {
                tmExportLog.lastErrorCode = p1.errorCode;
             }
             if (tmExportLog.skipTranscode != 1) {
                tmExportLog.skipTranscode = 1;
                tmExportLog.transcodeReason = 910;
             }
             this.mExportFlag = 0;
             this.runExportTaskInternal(0);
          }catch(java.lang.Exception e0){
             this.notifyErrorCallback("Transcode", new ClipExportException(100, -100003, "Transcode run error"));
          }
          return;
       }else {
          tmExportLog = this.mLock;
          _monitor_enter(tmExportLog);
          this.mExportLog.encodeEndTime = SystemClock.elapsedRealtime();
          this.mExportLog.exportException = p1;
          this.reportLog(8);
          _monitor_exit(tmExportLog);
          if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
             this.notifyErrorCallbackInner(p1);
          }else {
             this.mMainHandler.post(new ClipExportHandler$12(this, p1));
          }
          return;
       }
    }
    public void notifyErrorCallbackInner(ClipExportException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "34")) {
          return;
       }
       this.release();
       ClipExportHandler tmClipExport = this.mClipExportListener;
       if (tmClipExport != null) {
          tmClipExport.onError(p0);
       }
       return;
    }
    public void notifyFinishCallback(String p0){
       ClipExportHandler tmExportLog;
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "30")) {
          return;
       }
       KSClipLog.i("ClipExportHandler", p0+" notifyFinishCallback");
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyFinishCallbackInner();
       }else {
          this.mMainHandler.post(new ClipExportHandler$11(this));
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          tmExportLog = this.mExportLog;
          if (tmExportLog != null) {
             tmExportLog.encodeEndTime = SystemClock.elapsedRealtime();
          }
       }
       tmExportLog = this.mLock;
       _monitor_enter(tmExportLog);
       this.release();
       this.reportLog(7);
       _monitor_exit(tmExportLog);
       return;
    }
    public void notifyFinishCallbackInner(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "31")) {
          return;
       }
       ClipExportHandler tmClipExport = this.mClipExportListener;
       if (tmClipExport != null) {
          tmClipExport.onFinish(this.mExportPath);
       }
       return;
    }
    public void notifyProgressCallback(String p0,double p1){
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uClipExportH, "37")) {
          return;
       }
       KSClipLog.v("ClipExportHandler", p0+" notifyProgressCallback:"+p1);
       if (Math.abs((p1 - this.mLastProgress)) - 0x3f50624dd2f1a9fc < 0 && p1 - 0x3ff0000000000000) {
          return;
       }
       this.mLastProgress = p1;
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          ClipExportHandler tmClipExport = this.mClipExportListener;
          if (tmClipExport != null) {
             tmClipExport.onProgress(p1);
          }
       }else {
          this.mMainHandler.post(new ClipExportHandler$14(this, p1));
       }
       return;
    }
    public final void release(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "27")) {
          return;
       }
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       ClipExportHandler tmExportTask = this.mExportTasks;
       if (tmExportTask != null) {
          iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             ExportTask uExportTask = iterator.next();
             uExportTask.cancel();
             uExportTask.release();
          }
          this.mExportTasks.clear();
       }
       tmExportTask = this.mRemuxTasks;
       if (tmExportTask != null) {
          iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel();
          }
          this.mRemuxTasks.clear();
       }
       tmExportTask = this.mDeleteTempPaths;
       if (tmExportTask != null) {
          iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             File uFile = new File(str);
             if (uFile.exists()) {
                uFile.delete();
                KSClipLog.i("ClipExportHandler", "release delete tmp file "+str);
             }
          }
       }
       this.mIsRunning = false;
       this.mIsCancel = false;
       this.mDisableHwEncode = false;
       this.mCurrentProgress = 0;
       this.mLastProgress = 0;
       _monitor_exit(tmLock);
       return;
    }
    public void releasePipeline(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "28")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mTempPipelinePath)) {
          File uFile = new File(this.mTempPipelinePath);
          boolean b = uFile.exists();
          if (b) {
             uFile.delete();
          }
          KSClipLog.i("ClipExportHandler", "releasePipeline file:"+this.mTempPipelinePath+",exist:"+b);
       }
       return;
    }
    public final void reportLog(int p0){
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipExportH, "41")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mSessionId)) {
          if (this.getVideoType() == 10) {
             ClipEditLogger.reportWatermarkLog(p0, this.mSessionId, this.mExportLog);
          }else {
             ClipEditLogger.reportExportLog(p0, this.mSessionId, this.mExportLog);
          }
       }
       return;
    }
    public final void resetAnimatedSubAssetScaleIfNeed(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler.class, "42")) {
          return;
       }
       if (p0 != null && p0.animatedSubAssets() != null) {
          int i = 0;
          while (i < p0.animatedSubAssetsSize()) {
             if (p0.animatedSubAssets(i) != null && (p0.animatedSubAssets(i).renderType() == 3 || !p0.animatedSubAssets(i).renderType())) {
                double d = (double)p1.width() * 0x3ff0000000000000;
                d = d / (double)EditorSdk2UtilsV2.getComputedWidth(p0);
                if (p0.animatedSubAssets(i).keyFrames() != null) {
                   int i1 = 0;
                   while (i1 < p0.animatedSubAssets(i).keyFramesSize()) {
                      if (p0.animatedSubAssets(i).keyFrames(i1) != null && p0.animatedSubAssets(i).keyFrames(i1).assetTransform() != null) {
                         double d1 = p0.animatedSubAssets(i).keyFrames(i1).assetTransform().scaleX() * d;
                         p0.animatedSubAssets(i).keyFrames(i1).assetTransform().setScaleX(d1);
                         d1 = p0.animatedSubAssets(i).keyFrames(i1).assetTransform().scaleY() * d;
                         p0.animatedSubAssets(i).keyFrames(i1).assetTransform().setScaleY(d1);
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "4")) {
          return;
       }
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSClipLog.i("ClipExportHandler", "resume");
       ClipExportHandler tmExportTask = this.mExportTasks;
       if (tmExportTask != null) {
          Iterator iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             iterator.next().resume();
          }
       }
       this.reportLog(4);
       _monitor_exit(tmLock);
       return;
    }
    public void revertTrackAsset(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "21")) {
          return;
       }
       ClipExportHandler tmOriginTrac = this.mOriginTrackAsset;
       if (tmOriginTrac != null) {
          this.mProject.setTrackAssets(tmOriginTrac);
          this.mOriginTrackAsset = null;
       }
       return;
    }
    public boolean run(){
       ClipExportHandler tmExportLog;
       boolean b1;
       ClipExportHandler tmExportFlag;
       ClipExportHandler uClipExportH;
       Object[] objArray = null;
       ClipExportHandler obj = PatchProxy.apply(objArray, this, ClipExportHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       boolean b = false;
       if (this.mIsRunning != null) {
          KSClipLog.e("ClipExportHandler", "task has been running");
          _monitor_exit(obj);
          return b;
       }else {
          this.mIsRunning = true;
          this.mIsPipeline = b;
          this.mExportTaskStatsInfo = objArray;
          ClipEditExportLog uClipEditExp = new ClipEditExportLog();
          this.mExportLog = uClipEditExp;
          ClipExportHandler tmSoftReason = this.mSoftReason;
          if (tmSoftReason != null) {
             uClipEditExp.softReason = tmSoftReason;
          }
          uClipEditExp.context = this.mApplicationContext;
          uClipEditExp.project = this.mProject;
          uClipEditExp.extraInfo = this.mExtraInfo;
          uClipEditExp.videoType = this.getVideoType();
          if (this.hasCover()) {
             this.mExportLog.coverDuration = this.mCoverInfoParams.duration;
          }
          if (this.mExternalFilterRequestListener != null || this.mExternalFilterRequestListenerV2 != null) {
             tmExportLog = this.mExportLog;
             tmExportLog.skipTranscode = 1;
             tmExportLog.transcodeReason = 900;
             KSClipLog.i("ClipExportHandler", "set ExternalFilterRequestListener or ExternalFilterRequestListenerV2,force transcode");
          }else if(this.isForceTransCode != null){
             tmExportLog = this.mExportLog;
             tmExportLog.skipTranscode = 1;
             tmExportLog.transcodeReason = 10;
             KSClipLog.i("ClipExportHandler", "Force enable transCode");
          }else if(EditorSdk2UtilsV2.isSingleImagePath(this.mExportPath)){
             tmExportLog = this.mExportLog;
             tmExportLog.skipTranscode = 1;
             tmExportLog.transcodeReason = 30;
             KSClipLog.i("ClipExportHandler", "exportPath is image");
          }else {
             ClipKitUtils$ProjectTranscodeResult projectTrans = ClipKitUtils.isProjectMustBeTranscodeWithResult(this.mApplicationContext, this.mProject, this.mExportOptions, this.getVideoType(), b);
             tmSoftReason = this.mExportLog;
             tmSoftReason.skipTranscode = projectTrans.result;
             tmSoftReason.transcodeReason = projectTrans.reason;
          }
          this.mExportLog.encodeStartTime = SystemClock.elapsedRealtime();
          KSClipLog.i("ClipExportHandler", "run start");
          this.mRemuxTasks = new ArrayList();
          this.mExportTasks = new ArrayList();
          this.mDeleteTempPaths = new ArrayList();
          if (this.mExportLog.skipTranscode == true) {
             tmExportLog = this.mCapeHandler;
             if (tmExportLog != null && tmExportLog.isEnableUploadDecision()) {
                objArray = ClipKitUtils.isProjectMustBeTranscodeWithResult(this.mApplicationContext, this.mProject, this.mExportOptions, this.getVideoType(), true);
                if (objArray.result != true) {
                   b1 = true;
                label_0100 :
                   KSClipLog.i("ClipExportHandler", "skipShouldJudgeByUploadDecision "+b1);
                   if (this.hasCover()) {
                      ImmutableArray immutableArr = this.mProject.trackAssets();
                      this.mOriginTrackAsset = immutableArr;
                      MutableArray mutableArray = immutableArr.mutableCopy();
                      EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(this.mCoverInfoParams.path);
                      trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, this.mCoverInfoParams.duration));
                      mutableArray.add(b, trackAsset);
                      this.mProject.setTrackAssets(mutableArray.immutableCopy());
                   }
                   if (!this.runExportTaskInternal(b1)) {
                      tmExportLog = this.mExportLog;
                      tmExportLog.skipTranscode = objArray.result;
                      tmExportLog.transcodeReason = objArray.reason;
                   label_0159 :
                      this.checkExportFlag();
                      this.mExportLog.exportFlag = this.mExportFlag;
                      KSClipLog.i("ClipExportHandler", "checkExportFlag:"+this.mExportFlag);
                      tmExportFlag = this.mExportFlag;
                      if (tmExportFlag <= null) {
                         KSClipLog.e("ClipExportHandler", "may not happen this case, please connect auther");
                         this.runExportTaskInternal(b);
                      }else if((tmExportFlag & 0x01) == 1){
                         this.copyFile();
                      }else if((tmExportFlag & 0x02) == 2){
                         String str = (tmExportFlag > 2)? this.mTempFileDir+File.separator+this.addTimeForPath("tmp_concat_video.mp4"): this.mExportPath;
                         this.concatVideo(str, this.mIsEnableConcatMode);
                         if (this.mExportFlag > 2) {
                            tmExportFlag = 1;
                         }
                      }else {
                         tmExportFlag = null;
                      }
                      int i = 4;
                      if ((this.mExportFlag & i) == i) {
                         this.concatAudio(this.mTempFileDir+File.separator+this.addTimeForPath("tmp_concat_audio.mp4"));
                         tmExportLog = 1;
                      }else {
                         tmExportLog = null;
                      }
                      int i1 = 8;
                      if ((this.mExportFlag & i1) == i1) {
                         this.transcodeAudio();
                         uClipExportH = 1;
                      }else {
                         uClipExportH = null;
                      }
                      if ((this.mExportFlag & 32) == 32) {
                         this.transcodeCover();
                         i1 = 1;
                      }else {
                         i1 = 0;
                      }
                      if (!tmExportLog && (!tmExportFlag && (!uClipExportH && (!i1 && this.mProject.audioAssetsSize() > 0)))) {
                         this.combineVideoAndAudio(this.mProject.trackAssets(b).assetPath(), this.mProject.audioAssets(b).assetPath(), this.mExportPath);
                      }
                   }
                }
             }
             b1 = false;
             goto label_0100 ;
          }else {
             goto label_0159 ;
          }
       label_0231 :
          tmExportFlag = this.mClipExportListener;
          if (tmExportFlag != null && tmExportFlag instanceof ClipExportHandler$ClipExportListenerV3) {
             tmExportLog = this.mExportLog;
             tmExportFlag.onStart(tmExportLog.skipTranscode, tmExportLog.transcodeReason);
          }
          tmExportFlag = this.mExportLog;
          if (tmExportFlag.skipTranscode == true && this.mExportOptions.outputFormat() == 2) {
             b = true;
          }
          tmExportFlag.isPipeline = b;
          this.reportLog(true);
          _monitor_exit(obj);
          return true;
       }
    }
    public final boolean runExportTaskInternal(boolean p0){
       String obj;
       ClipExportHandler tmExportOpti;
       int b2;
       ClipExportHandler tmTempFileDi;
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uClipExportH, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.mExportOptions.setSkipTranscodeConfig(new EditorSdk2$ProtoSkipTranscodeConfig());
       boolean b = false;
       this.mExportOptions.skipTranscodeConfig().setEnabled(b);
       boolean b1 = (this.mExportOptions.outputFormat() == 2)? true: false;
       this.mIsPipeline = b1;
       uClipExportH = this.mExportPath;
       KSClipLog.i("ClipExportHandler", "runExportTaskInternal isPipeline "+this.mIsPipeline+",needRemux "+this.mNeedRemux+",mExportPath "+this.mExportPath);
       int i = 5;
       if (this.mBenchmarkOptions != null && (this.mDisableHwEncode == null && (!EditorSdk2UtilsV2.isSingleImagePath(this.mExportPath) && this.mExportOptions.videoEncoderType() != i))) {
          DPHardwareConfigManager$EncodeResult uEncodeResul = this.isHwEncodeSupport(this.mBenchmarkOptions);
          if (uEncodeResul.isSupport != null) {
             KSClipLog.i("ClipExportHandler", "force encode set mediaCodec");
             this.mExportOptions.setVideoEncoderType(i);
             tmExportOpti = this.mExportOptions;
             b2 = (uEncodeResul.profile <= BenchmarkEncodeProfile.BASELINE.getValue())? true: false;
             tmExportOpti.setForceMediacodecBaseline(b2);
          }
       }
    label_00ad :
       if (this.mExportOptions.videoFrameRate() == null) {
          this.mExportOptions.setVideoFrameRate(ClipKitUtils.CalculateProjectFps(this.mProject, this.mVideoType));
       }
       if (this.mCapeHandler != null) {
          CapeTaskParams uCapeTaskPar = new CapeTaskParams();
          uCapeTaskPar.project = this.mProject;
          uCapeTaskPar.exportDir = this.mExportDir;
          uCapeTaskPar.exportOptions = this.mExportOptions;
          uCapeTaskPar.canSkipTranscode = p0;
          uCapeTaskPar.exportPath = uClipExportH;
          uCapeTaskPar.videoType = this.getVideoType();
          tmExportOpti = (this.mExportOptions.videoEncoderType() == i)? 1: 0;
          b2 = this.mCapeHandler.run(uCapeTaskPar);
          KSClipLog.i("ClipExportHandler", "capeAnalyzerTask.run result = "+b2);
          if (b2 >= 0 && this.mCapeHandler.getOutputExportOptions() != null) {
             this.mExportOptions = this.mCapeHandler.getOutputExportOptions();
             Map cAPEStatsUni = this.mCapeHandler.getCAPEStatsUnit();
             this.mCapeStatsUnit = cAPEStatsUni;
             this.mExportLog.setCapeStats(cAPEStatsUni);
             if (this.mExportOptions.videoEncoderType() == i) {
                this.mExportLog.softReason = b;
             }else if(tmExportOpti){
                this.mExportLog.softReason = 10;
             }
             if (this.mCapeHandler.shouldSkipTranscode()) {
                KSClipLog.i("ClipExportHandler", "aft capeAnalyzerTask, should skip transcode, enableCapeSkipTranscode:"+p0);
                if (p0) {
                   return b;
                }
             }
          }
       }
    label_0159 :
       if (this.mIsPipeline != null && this.mNeedRemux != null) {
          String name = new File(uClipExportH).getName();
          obj = "";
          tmTempFileDi = (!TextUtils.isEmpty(this.mTempFileDir))? this.mTempFileDir: ClipKitUtils.getCacheDirFile(this.mApplicationContext);
          obj = obj+tmTempFileDi+File.separator+"pipeline-"+name;
          this.mTempPipelinePath = obj;
          File uFile = new File(this.mTempPipelinePath);
          KSClipLog.i("ClipExportHandler", "runExportTaskInternal isPipeline and needRemux new path: "+obj);
          if (uFile.exists()) {
             uFile.delete();
             KSClipLog.i("ClipExportHandler", "runExportTaskInternal delete exists output file "+this.mTempPipelinePath);
          }
       }
    label_01d0 :
       ClipDPHardwareConfigManager.getInstance().resetDecoderConfig(this.mProject);
       this.resetAnimatedSubAssetScaleIfNeed(this.mProject, this.mExportOptions);
       ExportTask uExportTask = new ExportTask(this.mApplicationContext, this.mProject, obj, this.mExportOptions);
       tmTempFileDi = this.mExternalFilterRequestListener;
       if (tmTempFileDi != null) {
          uExportTask.setExternalFilterRequestListener(tmTempFileDi);
       }
       tmTempFileDi = this.mExternalFilterRequestListenerV2;
       if (tmTempFileDi != null) {
          uExportTask.setExternalFilterRequestListenerV2(tmTempFileDi);
       }
       uExportTask.setExportEventListener(new ClipExportHandler$8(this));
       uExportTask.run();
       this.mExportTasks.add(uExportTask);
       KSClipLog.i("ClipExportHandler", "runExportTaskInternal,path:"+obj);
       return true;
    }
    public void setBenchmarkOptions(BenchmarkOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "1")) {
          return;
       }
       this.mBenchmarkOptions = p0;
       DPBenchmarkConfigManager.getInstance().init(this.mApplicationContext);
       return;
    }
    public void setCapeHandler(CapeHandlerInterface p0){
       this.mCapeHandler = p0;
    }
    public void setClipExportListener(ClipExportHandler$ClipExportListener p0){
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mClipExportListener = p0;
       _monitor_exit(tmLock);
    }
    public void setCoverInfo(CoverInfoParams p0){
       this.mCoverInfoParams = p0;
    }
    public void setExternalFilterRequestListener(ExternalFilterRequestListener p0){
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mExternalFilterRequestListener = p0;
       _monitor_exit(tmLock);
    }
    public void setExternalFilterRequestListenerV2(ExternalFilterRequestListenerV2 p0){
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mExternalFilterRequestListenerV2 = p0;
       _monitor_exit(tmLock);
    }
    public void setForceTransCode(boolean p0){
       this.isForceTransCode = p0;
    }
    public void setNeedRemuxForPipeline(boolean p0){
       this.mNeedRemux = p0;
    }
    public void setSessionId(String p0,ClipEditExtraInfo p1){
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mSessionId = p0;
       this.mExtraInfo = p1;
       ClipExportHandler tmExportLog = this.mExportLog;
       if (tmExportLog != null) {
          tmExportLog.extraInfo = p1;
       }
       _monitor_exit(tmLock);
       return;
    }
    public void setSoftReason(int p0){
       this.mSoftReason = p0;
       ClipExportHandler tmExportLog = this.mExportLog;
       if (tmExportLog != null) {
          tmExportLog.softReason = p0;
       }
       return;
    }
    public void setVideoType(int p0){
       ClipExportHandler uClipExportH = ClipExportHandler.class;
       if (PatchProxy.isSupport(uClipExportH) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipExportH, "5")) {
          return;
       }
       this.mVideoType = p0;
       if (p0 == 2) {
          ClipExportHandler tmProject = this.mProject;
          if (tmProject != null && (tmProject.trackAssets() != null && this.mProject.trackAssetsSize() >= 0)) {
             int i = 0;
             if (this.mProject.trackAssets(i) != null) {
                this.mProject.trackAssets(i).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 0x3fb999999999999a));
             }
          }
       }
       return;
    }
    public void startPipelineRemux(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler.class, "24")) {
          return;
       }
       String mp4FilePath = p0.getMp4FilePath();
       File uFile = new File(mp4FilePath);
       String filePath = p0.getFilePath();
       ClipExportHandler tmExportPath = this.mExportPath;
       if (!TextUtils.isEmpty(mp4FilePath) && uFile.exists()) {
          this.copyPipelineRemuxFile(mp4FilePath, tmExportPath);
       }else {
          RemuxTask remuxTask = EditorSdk2Utils.newRemuxTask(this.mApplicationContext);
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(remuxTask.newRemuxInputParamsBuilder().setPath(filePath).build());
          remuxTask.startRemuxAsync(remuxTask.newRemuxParamsBuilder().setInputParams(uArrayList).setOutputPath(tmExportPath).setRemuxTaskMode(RemuxTaskMode.SEGMENT_CONCAT).setComment(this.mExportOptions.comment()).setFlag(this.mRemuxerFlag).build(), new ClipExportHandler$9(this));
          this.mRemuxTasks.add(remuxTask);
          KSClipLog.i("ClipExportHandler", "start pipelineRemux,outPath:"+tmExportPath);
       }
       return;
    }
    public void suspend(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "3")) {
          return;
       }
       ClipExportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       KSClipLog.i("ClipExportHandler", "suspend");
       ClipExportHandler tmExportTask = this.mExportTasks;
       if (tmExportTask != null) {
          Iterator iterator = tmExportTask.iterator();
          while (iterator.hasNext()) {
             iterator.next().suspend();
          }
       }
       this.reportLog(3);
       _monitor_exit(tmLock);
       return;
    }
    public final void transcodeAudio(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "13")) {
          return;
       }
       String str = this.mTempFileDir+File.separator+this.addTimeForPath("tmp_transcode_audio.mp4");
       EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
       uExportOptio.setDiscardVideoTrackInMediaFile(true);
       uExportOptio.setAudioSampleRate(this.mExportOptions.audioSampleRate());
       uExportOptio.setAudioChannelLayout(this.mExportOptions.audioChannelLayout());
       uExportOptio.setAudioBitrate(this.mExportOptions.audioBitrate());
       uExportOptio.setAudioSampleFmt(this.mExportOptions.audioSampleFmt());
       uExportOptio.setAudioCutoff(this.mExportOptions.audioCutoff());
       uExportOptio.setAudioProfile(this.mExportOptions.audioProfile());
       ExportTask uExportTask = new ExportTask(this.mApplicationContext, this.mProject, str, uExportOptio);
       uExportTask.setExportEventListener(new ClipExportHandler$5(this, str));
       if (this.mIsCancel != null) {
          this.notifyCancelCallback("transcodeAudio");
          return;
       }else {
          this.mDeleteTempPaths.add(str);
          this.mExportTasks.add(uExportTask);
          uExportTask.run();
          KSClipLog.i("ClipExportHandler", "transcodeAudio");
          return;
       }
    }
    public final void transcodeCover(){
       if (PatchProxy.applyVoid(null, this, ClipExportHandler.class, "14")) {
          return;
       }
       int i = 100;
       try{
          String str = this.mTempFileDir+File.separator+this.addTimeForPath("tmp_transcode_cover.mp4");
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          uExportOptio.setVideoFrameRate(EditorSdk2Utils.createRational(60, 1));
          EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(this.mCoverInfoParams.path);
          int i1 = 0;
          videoEditorP.trackAssets(i1).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, this.mCoverInfoParams.duration));
          if (ClipKitUtils.hasAudioStreamByTrack(this.mProject.trackAssets(i1))) {
             videoEditorP.trackAssets(i1).setAssetAudioPath(this.mProject.trackAssets(i1).assetPath());
             videoEditorP.trackAssets(i1).setVolume(0);
          }else if(this.mProject.audioAssetsSize() > 0){
             videoEditorP.trackAssets(i1).setAssetAudioPath(this.mProject.audioAssets(i1).assetPath());
             videoEditorP.trackAssets(i1).setVolume(0);
          }
          int i2 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(this.mProject.trackAssets(i1)).rotation();
          videoEditorP.trackAssets(i1).setRotationDeg((i2 - 360));
          if (!(i2 % 180)) {
             uExportOptio.setWidth(EditorSdk2UtilsV2.getTrackAssetWidth(this.mProject.trackAssets(i1)));
             uExportOptio.setHeight(EditorSdk2UtilsV2.getTrackAssetHeight(this.mProject.trackAssets(i1)));
          }else {
             uExportOptio.setWidth(EditorSdk2UtilsV2.getTrackAssetHeight(this.mProject.trackAssets(i1)));
             uExportOptio.setHeight(EditorSdk2UtilsV2.getTrackAssetWidth(this.mProject.trackAssets(i1)));
          }
          uExportOptio.setSpecifiedVideoMetaRotation(String.valueOf(i2));
          uExportOptio.setAudioSampleRate(this.mExportOptions.audioSampleRate());
          uExportOptio.setAudioChannelLayout(this.mExportOptions.audioChannelLayout());
          uExportOptio.setAudioBitrate(this.mExportOptions.audioBitrate());
          uExportOptio.setAudioSampleFmt(this.mExportOptions.audioSampleFmt());
          uExportOptio.setAudioCutoff(this.mExportOptions.audioCutoff());
          uExportOptio.setAudioProfile(this.mExportOptions.audioProfile());
          ExportTask uExportTask = new ExportTask(this.mApplicationContext, videoEditorP, str, uExportOptio);
          uExportTask.setExportEventListener(new ClipExportHandler$6(this));
          if (this.mIsCancel != null) {
             this.notifyCancelCallback("transcodeAudio");
             return;
          }else {
             this.mDeleteTempPaths.add(str);
             this.mExportTasks.add(uExportTask);
             uExportTask.run();
          }
       }catch(java.io.IOException e0){
          this.notifyErrorCallback(e0, new ClipExportException(i, -100003, "cover task create error"));
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          this.notifyErrorCallback(e0, new ClipExportException(i, -100003, "cover project create error"));
       }
       return;
    }
    public void useConcatModeWhenRemux(boolean p0){
       this.mIsEnableConcatMode = p0;
    }
    public final boolean useFastStart(){
       boolean b = ((this.mRemuxerFlag & 0x0200) > 0)? true: false;
       return b;
    }
}
