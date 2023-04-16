package com.kwai.video.clipkit.mv.TemplateImportHandler;
import android.content.Context;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.clipkit.mv.EditorSdk2MvAssetImpl;
import java.lang.Math;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import java.security.MessageDigest;
import java.lang.Exception;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Long;
import java.lang.Throwable;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.model.ModelBase;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import android.util.Pair;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.IllegalStateException;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.ExportTask;
import fv7.a;
import java.io.FilenameFilter;
import com.kwai.video.minecraft.model.ModelBase;
import android.text.TextUtils;
import java.lang.Number;
import com.kwai.video.devicepersona.benchmark.BenchmarkOptions;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.Thread;
import com.kwai.video.clipkit.mv.TemplateImportHandler$4;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import com.kwai.video.clipkit.ClipImportException;
import com.kwai.video.clipkit.mv.TemplateImportHandler$3;
import java.lang.Double;
import com.kwai.video.clipkit.mv.TemplateImportHandler$5;
import com.kwai.video.clipkit.mv.TemplateImportHandler$2;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import com.kwai.video.clipkit.mv.TemplateImportHandler$1;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.io.IOException;

public class TemplateImportHandler	// class@001ad7
{
    public String mCachePath;
    public long mClipDuration;
    public long mClipStart;
    public EditorSdk2$TimeRange mClippedRange;
    public Context mContext;
    public int mExportHeight;
    public float mExportStartX;
    public float mExportStartY;
    public ExportTask mExportTask;
    public int mExportWidth;
    public int mGrade;
    public ClipImportHandler$ClipImportHandlerListener mListener;
    public final Object mLock;
    public Handler mMainHandler;
    public long mMediaDuration;
    public int mMediaHeight;
    public String mMediaPath;
    public int mMediaWidth;
    public EditorSdk2MvAsset mMvAsset;
    public boolean mProbed;
    public static final char[] HEX_CHARS;

    static {
       TemplateImportHandler.HEX_CHARS = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public void TemplateImportHandler(Context p0,EditorSdk2MvAsset p1,String p2,String p3,int p4,EditorSdk2$TimeRange p5,float p6,float p7,int p8,int p9){
       super();
       this.mProbed = false;
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mLock = new Object();
       this.mContext = p0;
       this.mMvAsset = (p1 == null)? new EditorSdk2MvAssetImpl(): p1;
       this.mMediaPath = p2;
       this.mCachePath = p3;
       this.mGrade = p4;
       this.mClippedRange = p5;
       this.mExportStartX = p6;
       this.mExportStartY = p7;
       this.mExportWidth = p8;
       this.mExportHeight = p9;
       this.mClipStart = Math.round((p5.start() * 0x408f400000000000));
       this.mClipDuration = Math.round((p5.duration() * 0x408f400000000000));
       return;
    }
    public static Minecraft$CropOptions calculateCropOptions(int p0,int p1,float p2,float p3,int p4,int p5){
       int i3;
       int i4;
       int i5;
       int i6;
       int i = p0;
       int i1 = p1;
       TemplateImportHandler templateImpo = TemplateImportHandler.class;
       int i2 = 0;
       if (PatchProxy.isSupport(templateImpo)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, templateImpo, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       double d = (double)p4;
       double d1 = d * 0x3ff0000000000000;
       double d2 = (double)p5;
       double d3 = (double)i * 0x3ff0000000000000;
       double d4 = (double)i1;
       if ((d1 / d2) - (d3 / d4) > 0) {
          i3 = (int)((d3 * d2) / d);
          i4 = (int)(((float)i1 * p3) - ((float)i3 / 2.00f));
          i5 = i;
          i6 = i3;
          i3 = 0;
       }else {
          i3 = (int)((d1 * d4) / d2);
          i6 = i1;
          i5 = i3;
          i3 = (int)(((float)i * p2) - ((float)i3 / 2.00f));
          i4 = 0;
       }
       return ClipMvUtils.getCropOptionsByAssetRectangle(p0, p1, i3, i4, i5, i6, i5, i6);
    }
    public static String hexdigest(byte[] p0){
       String str = null;
       MessageDigest obj = PatchProxy.applyOneRefs(p0, str, TemplateImportHandler.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0);
          p0 = obj.digest();
          char[] uocharArray = new char[32];
          int i1 = 0;
          for (int i = 0; i < 16; i = i + 1) {
             int b = p0[i];
             int i2 = i1 + 1;
             char[] hEX_CHARS = TemplateImportHandler.HEX_CHARS;
             int i3 = b >> 4;
             i3 = i3 & 0x0f;
             uocharArray[i1] = hEX_CHARS[i3];
             i1 = i2 + 1;
             b = b & 0x0f;
             uocharArray[i2] = hEX_CHARS[b];
          }
          str = new String(uocharArray);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return str;
    }
    public static boolean lambda$findUsableCache$0(String p0,long p1,File p2,String p3){
       boolean b = false;
       if (!p3.startsWith(p0)) {
          return b;
       }
       String[] stringArray = ((p3.replace(p0+"_", "")).replace(".mp4", "")).split("_");
       if (stringArray.length != 2) {
          return b;
       }
       object oobject = stringArray[b];
       try{
          if (Long.parseLong(oobject) - p1 >= 0) {
             b = true;
          }
          return b;
       }catch(java.lang.NumberFormatException e2){
          KSClipLog.e("TemplateImportHandler", "findUsableCache accept: ", e2);
          return b;
       }
    }
    public final EditorSdk2$ExportOptions buildExportOptions(EditorSdk2V2$VideoEditorProject p0){
       TemplateImportHandler obj = PatchProxy.applyOneRefs(p0, this, TemplateImportHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mGrade;
       if (obj <= null) {
          int i = 2;
       }
       EditorSdk2$ExportOptions mVExportOpti = EditorSdk2Utils.getMVExportOptionsNativeOptions(obj, false);
       StringBuilder str = "buildExportOptions grade : "+this.mGrade+", finalGrade : "+obj+", GradeOption : ";
       String str1 = (mVExportOpti == null)? "": mVExportOpti.toString();
       KSClipLog.i("TemplateImportHandler", str+str1);
       EditorEncodeConfigModule$ImportParam importParamW = EditorEncodeConfigModule.getImportParamWithType(3);
       Pair exportSize = EditorSdk2UtilsV2.getExportSize(p0, this.mExportWidth, this.mExportHeight);
       try{
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          uExportOptio.setWidth(exportSize.first.intValue());
          uExportOptio.setHeight(exportSize.second.intValue());
          if (mVExportOpti != null) {
             uExportOptio.setX264Params(mVExportOpti.x264Params());
          }else {
             uExportOptio.setX264Params(importParamW.x264Params);
          }
          if (this.isHwEncodeSupported(uExportOptio.width(), uExportOptio.height())) {
             KSClipLog.i("TemplateImportHandler", "buildExportOptions isHwEncodeSupported true");
             uExportOptio.setVideoEncoderType(5);
             uExportOptio.setVideoGopSize(importParamW.videoGopSize);
             uExportOptio.setVideoBitrate(importParamW.videoBitrate);
             if (mVExportOpti != null) {
                uExportOptio.setVideoGopSize(mVExportOpti.videoGopSize());
                uExportOptio.setVideoBitrate(mVExportOpti.videoBitrate());
                uExportOptio.setX264Preset(mVExportOpti.x264Preset());
                uExportOptio.setAudioBitrate(mVExportOpti.audioBitrate());
                uExportOptio.setAudioCutoff(mVExportOpti.audioCutoff());
                uExportOptio.setAudioProfile(mVExportOpti.audioProfile());
             }
          }
          return uExportOptio;
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e7){
          KSClipLog.e("TemplateImportHandler", "fail to create ExportOptions", e7);
          throw new IllegalStateException("fail to create ExportOptions, "+e7.getMessage());
       }
    }
    public final EditorSdk2V2$VideoEditorProject buildProject(){
       Object[] objArray = null;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(objArray, this, TemplateImportHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$VideoEditorProject();
       obj.setProjectOutputWidth(this.mExportWidth);
       obj.setProjectOutputHeight(this.mExportHeight);
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[1];
       obj.setTrackAssets(trackAssetAr);
       EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
       obj.trackAssetsSetItem(0, trackAsset);
       Minecraft$WesterosFaceMagicParam faceMagicPar = this.mMvAsset.getFaceMagicParam();
       if (faceMagicPar != null) {
          faceMagicPar.setTrackAssetTimeRange(objArray);
          trackAsset.setWesterosFaceMagicParam(faceMagicPar);
       }
       Minecraft$TimeMapParams insertFrameP = this.mMvAsset.getInsertFrameParam();
       if (insertFrameP != null) {
          trackAsset.setTimeMap(insertFrameP);
       }
       trackAsset.setIsReversed(this.mMvAsset.isNeedReverse());
       trackAsset.setVolume(0);
       trackAsset.setAssetPath(this.mMediaPath);
       trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
       trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange((((double)this.mClipStart * 0x3ff0000000000000) / 0x408f400000000000), (((double)this.getExportDuration() * 0x3ff0000000000000) / 0x408f400000000000)));
       trackAsset.setCropOptions(TemplateImportHandler.calculateCropOptions(this.mMediaWidth, this.mMediaHeight, this.mExportStartX, this.mExportStartY, this.mExportWidth, this.mExportHeight));
       return obj;
    }
    public final boolean canSkipTranscode(){
       Object obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mExportHeight >= this.mMediaHeight && (this.mExportWidth >= this.mMediaWidth && (!this.mClipStart && (!this.mMvAsset.isNeedReverse() && (this.mMvAsset.getInsertFrameParam() == null && (this.mMvAsset.getFaceMagicParam() == null && (!(double)this.mExportStartX - 0x3fe0000000000000 && !(double)this.mExportStartY - 0x3fe0000000000000)))))))? true: false;
       return b;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "3")) {
          return;
       }
       TemplateImportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       TemplateImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null) {
          tmExportTask.cancel();
       }
       _monitor_exit(tmLock);
       return;
    }
    public final String findUsableCache(){
       File obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCacheDir();
       long exportDurati = this.getExportDuration();
       String[] stringArray = obj.list(new a(this.getCacheKeyWithOutDuration(), exportDurati));
       if (stringArray == null || !stringArray.length) {
          KSClipLog.i("TemplateImportHandler", "findUsableCache: cant find cache "+this);
          return "";
       }else {
          String str = obj.getAbsolutePath()+File.separator+stringArray[0];
          KSClipLog.i("TemplateImportHandler", "findUsableCache: find a cache exportDuration="+exportDurati+" cache="+str);
          return str;
       }
    }
    public File getCacheDir(){
       File obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(this.mCachePath);
       String str = "TemplateImportHandler";
       if (!obj.exists()) {
          KSClipLog.d(str, "getCacheDir: create new dir "+obj);
          if (!obj.mkdir()) {
             throw new IllegalStateException("failed create "+obj);
          }
       }
       if (obj.isDirectory()) {
          return obj;
       }else {
          KSClipLog.e(str, "getCacheDir: is not directory "+obj);
          throw new IllegalStateException("is not directory "+obj);
       }
    }
    public final String getCacheKey(){
       String obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCacheKeyWithOutDuration()+"_"+this.getExportDuration();
       KSClipLog.i("TemplateImportHandler", "getCacheKey: "+obj+" file="+this.mMediaPath);
       return obj;
    }
    public final String getCacheKeyWithOutDuration(){
       Object[] obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[9];
       obj[0] = this.mMediaPath;
       obj[1] = Long.valueOf(this.mClipStart);
       obj[2] = Float.valueOf(this.mExportStartX);
       obj[3] = Float.valueOf(this.mExportStartY);
       obj[4] = Integer.valueOf(this.mExportWidth);
       obj[5] = Integer.valueOf(this.mExportHeight);
       obj[6] = Boolean.valueOf(this.mMvAsset.isNeedReverse());
       int i = 7;
       String str = "";
       String str1 = (this.mMvAsset.getInsertFrameParam() == null)? str: this.mMvAsset.getInsertFrameParam().toString();
       obj[i] = str1;
       i = 8;
       if (this.mMvAsset.getFaceMagicParam() != null) {
          str = this.mMvAsset.getFaceMagicParam().toString();
       }
       obj[i] = str;
       String str2 = TemplateImportHandler.hexdigest((TextUtils.join("_", obj)).getBytes())+"_"+this.mClipStart+"_"+this.mExportWidth+"_"+this.mExportHeight;
       KSClipLog.i("TemplateImportHandler", "getCacheKeyWithOutDuration: "+str2+" file="+this.mMediaPath);
       return str2;
    }
    public final long getExportDuration(){
       TemplateImportHandler obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mClipDuration;
       if (!obj) {
          return this.getMediaDuration();
       }
       return Math.min(obj, this.getMediaDuration());
    }
    public final long getMediaDuration(){
       Object obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       this.probeMedia();
       return this.mMediaDuration;
    }
    public final File getTaskCacheFile(){
       Object obj = PatchProxy.apply(null, this, TemplateImportHandler.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.mCachePath, this.getCacheKey()+"_"+EditorSdk2Utils.getRandomID()+".mp4");
    }
    public final boolean isHwEncodeSupported(int p0,int p1){
       TemplateImportHandler templateImpo = TemplateImportHandler.class;
       if (PatchProxy.isSupport(templateImpo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, templateImpo, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       BenchmarkOptions uBenchmarkOp = BenchmarkOptions.createDefaultOptions();
       return ClipDPHardwareConfigManager.getInstance().isSupportEncodeWithResult(this.mContext, "avc", Math.max(p0, p1), uBenchmarkOp.minEncodeSpeed, uBenchmarkOp.enableEncode, uBenchmarkOp.minProfile, uBenchmarkOp.alignmentFlag).isSupport;
    }
    public void notifyCancelCallback(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "23")) {
          return;
       }
       String str = "TemplateImportHandler";
       KSClipLog.i(str, "notifyCancelCallback");
       TemplateImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null && (tmExportTask.getFilePath() != null && ClipKitUtils.fileExists(this.mExportTask.getFilePath()))) {
          new File(this.mExportTask.getFilePath()).delete();
          KSClipLog.e(str, "rebuild failed, delete export file "+this.mExportTask.getFilePath());
       }
    label_0051 :
       this.release();
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyCancelCallbackInner();
       }else {
          this.mMainHandler.post(new TemplateImportHandler$4(this));
       }
       return;
    }
    public void notifyCancelCallbackInner(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "24")) {
          return;
       }
       TemplateImportHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onClipImportCanceled();
       }
       return;
    }
    public void notifyFailedCallback(ClipImportException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler.class, "21")) {
          return;
       }
       String str = "TemplateImportHandler";
       KSClipLog.e(str, "notifyFailedCallback,exception:"+p0.getMessage());
       TemplateImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null && (tmExportTask.getFilePath() != null && ClipKitUtils.fileExists(this.mExportTask.getFilePath()))) {
          new File(this.mExportTask.getFilePath()).delete();
          KSClipLog.e(str, "rebuild failed, delete export file "+this.mExportTask.getFilePath());
       }
    label_0063 :
       this.release();
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyFailedCallbackInner(p0);
       }else {
          this.mMainHandler.post(new TemplateImportHandler$3(this, p0));
       }
       return;
    }
    public void notifyFailedCallbackInner(ClipImportException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler.class, "22")) {
          return;
       }
       TemplateImportHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onClipImportError(0, p0);
       }
       return;
    }
    public void notifyProgressCallback(double p0){
       TemplateImportHandler templateImpo = TemplateImportHandler.class;
       if (PatchProxy.isSupport(templateImpo) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, templateImpo, "25")) {
          return;
       }
       KSClipLog.v("TemplateImportHandler", "notifyProgressCallback,progress:"+p0);
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyProgressCallbackInner(p0);
       }else {
          this.mMainHandler.post(new TemplateImportHandler$5(this, p0));
       }
       return;
    }
    public void notifyProgressCallbackInner(double p0){
       TemplateImportHandler templateImpo = TemplateImportHandler.class;
       if (PatchProxy.isSupport(templateImpo) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, templateImpo, "26")) {
          return;
       }
       TemplateImportHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onClipImportProgress(0, p0, p0);
       }
       return;
    }
    public void notifySuccessCallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler.class, "19")) {
          return;
       }
       KSClipLog.i("TemplateImportHandler", "notifySuccessCallback");
       this.release();
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifySuccessCallbackInner(p0);
       }else {
          this.mMainHandler.post(new TemplateImportHandler$2(this, p0));
       }
       return;
    }
    public void notifySuccessCallbackInner(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateImportHandler.class, "20")) {
          return;
       }
       TemplateImportHandler tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.onClipImportSuccess(0, p0);
       }
       return;
    }
    public final void probeMedia(){
       String str = "failed open media ";
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "15")) {
          return;
       }
       if (this.mProbed != null) {
          return;
       }
       try{
          EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(this.mMediaPath);
          EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(trackAsset);
          if (probedStream == null) {
             throw new IllegalStateException(str+this.mMediaPath+", no video stream");
          }
          this.mMediaDuration = Math.round((EditorSdk2UtilsV2.trackAssetProbedFileDuration(trackAsset) * 0x408f400000000000));
          this.mMediaWidth = probedStream.width();
          this.mMediaHeight = probedStream.height();
          if (probedStream.rotation() % 180) {
             this.mMediaWidth = probedStream.height();
             this.mMediaHeight = probedStream.width();
          }
          return;
       }catch(java.lang.Exception e1){
          throw new IllegalStateException(str+this.mMediaPath+", "+e1.getMessage());
       }
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "4")) {
          return;
       }
       TemplateImportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       TemplateImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null) {
          tmExportTask.release();
          this.mExportTask = null;
       }
       _monitor_exit(tmLock);
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "1")) {
          return;
       }
       TemplateImportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       try{
          this.runInternal();
       }catch(java.lang.Exception e1){
          this.notifyFailedCallback(new ClipImportException(0, 0, e1.getMessage()));
       }
       _monitor_exit(tmLock);
       return;
    }
    public final void runInternal(){
       if (PatchProxy.applyVoid(null, this, TemplateImportHandler.class, "2")) {
          return;
       }
       this.probeMedia();
       String str = this.findUsableCache();
       String str1 = "TemplateImportHandler";
       if (!str.isEmpty()) {
          KSClipLog.i(str1, "runInternal findUsableCache : "+str);
          this.notifySuccessCallback(str);
          return;
       }else {
          KSClipLog.i(str1, "runInternal start build export task");
          EditorSdk2V2$VideoEditorProject videoEditorP = this.buildProject();
          EditorSdk2$ExportOptions uExportOptio = this.buildExportOptions(videoEditorP);
          str1 = this.getTaskCacheFile().getAbsolutePath();
          try{
             this.mExportTask = new ExportTaskNoQueueing(this.mContext, videoEditorP, str1, uExportOptio);
             this.mExportTask.setExportEventListener(new TemplateImportHandler$1(this, str1));
             this.mExportTask.run();
             return;
          }catch(java.io.IOException e0){
             throw new IllegalStateException("failed to new ExportTaskNoQueueing, "+e0.getMessage());
          }
       }
    }
    public void setImportHandlerListener(ClipImportHandler$ClipImportHandlerListener p0){
       this.mListener = p0;
    }
}
