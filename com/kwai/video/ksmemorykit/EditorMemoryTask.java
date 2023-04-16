package com.kwai.video.ksmemorykit.EditorMemoryTask;
import android.content.Context;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import com.kwai.video.ksmemorykit.EditorMemoryListener;
import com.kwai.kve.SmartEditResult;
import java.lang.String;
import com.kwai.kve.ErrorInfo;
import com.kwai.kve.ErrorInfo$ErrorCode;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.kve.MediaAnalyzeResult;
import java.lang.StringBuilder;
import java.util.Set;
import com.kwai.kve.MediaAsset;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.ksmemorykit.EditorMemoryResultImpl;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.ksmemorykit.EditorMemoryProjectCreator;
import com.kwai.video.ksmemorykit.EditorMemoryResult;
import com.kwai.kve.SmartEditTaskBuilder;
import com.kwai.kve.VisionEngine;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder;
import com.kwai.kve.Decoder;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;
import com.kwai.video.editorsdk2.kve.EditorKveAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.util.Date;
import android.location.Location;
import com.kwai.video.ksmemorykit.EditorMemoryTask$1;
import com.kwai.kve.ProgressCallback;
import com.kwai.kve.SmartEditTask;
import tv7.e;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tv7.c;
import java.util.ArrayList;
import com.kwai.video.ksmemorykit.EditorMemoryException;
import java.lang.Thread;
import tv7.d;

public class EditorMemoryTask	// class@0008f3
{
    public final Context mContext;
    public boolean mIsStopped;
    public EditorMemoryListener mListener;
    public final Object mLock;
    public Handler mMainHandler;
    public EditorMemoryParams mParams;
    public SmartEditTask mSmartTask;

    public void EditorMemoryTask(Context p0,EditorMemoryParams p1){
       super();
       this.mIsStopped = false;
       Object obj = new Object();
       this.mLock = obj;
       _monitor_enter(obj);
       this.mParams = p1;
       p0 = p0.getApplicationContext();
       this.mContext = p0;
       this.mMainHandler = new Handler(p0.getMainLooper());
       _monitor_exit(obj);
    }
    public static void a(EditorMemoryTask p0,List p1){
       p0.lambda$run$1(p1);
    }
    public static void lambda$cancel$2(EditorMemoryListener p0,EditorMemoryTask p1){
       if (p0 != null) {
          p0.onCancelled(p1);
       }
       return;
    }
    public static void lambda$null$0(boolean p0,SmartEditResult p1,EditorMemoryListener p2,String p3,EditorMemoryTask p4,EditorMemoryParams p5){
       EditorSdk2$EditorSdkError uEditorSdkEr1;
       int i = 0x2710;
       if (p0 || p1 == null) {
          if (p2 != null) {
             EditorSdk2$EditorSdkError uEditorSdkEr = new EditorSdk2$EditorSdkError();
             uEditorSdkEr.setCode(-1);
             uEditorSdkEr.setType(i);
             if (p0) {
                uEditorSdkEr.setMessage("Has error: "+p0+", msg: "+p3);
             }else {
                uEditorSdkEr.setMessage("No result returned.");
             }
             p2.onError(p4, uEditorSdkEr);
          }
          return;
       }else if(p1.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK){
          if (p2 != null) {
             uEditorSdkEr1 = new EditorSdk2$EditorSdkError();
             uEditorSdkEr1.setCode(-2);
             uEditorSdkEr1.setType(i);
             uEditorSdkEr1.setMessage(p1.getErrorInfo().getErrorMessage());
             p2.onError(p4, uEditorSdkEr1);
          }
          return;
       }else {
          Map mediaAnalyze = p1.getMediaAnalyzeResults();
          EditorSdk2V2$VideoEditorProject videoEditorP = null;
          Iterator iterator = mediaAnalyze.values().iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().getErrorInfo().getErrorCode() == ErrorInfo$ErrorCode.OK) {
                   videoEditorP = 1;
                }
             }
             String str = "Analyze result: \(Scrollable\)\n";
             int i1 = (p1.getMediaAnalyzeResults() == null)? -1: p1.getMediaAnalyzeResults().size();
             str = str+i1+", Error: ";
             String str1 = (p1.getErrorInfo().getErrorCode() == ErrorInfo$ErrorCode.OK)? "NoError": p1.getErrorInfo().getErrorCode();
             str = str+str1;
             Iterator iterator1 = mediaAnalyze.keySet().iterator();
             while (iterator1.hasNext()) {
                MediaAsset mediaAsset = iterator1.next();
                str = str+"\n"+mediaAsset.getFileName()+": clip: "+mediaAnalyze.get(mediaAsset).getClipStartTime()+"-"+mediaAnalyze.get(mediaAsset).getClipDuration()+", size: "+mediaAnalyze.get(mediaAsset).getWidth()+", "+mediaAnalyze.get(mediaAsset).getHeight()+", zoom: "+mediaAnalyze.get(mediaAsset).getZoomWidth()+", "+mediaAnalyze.get(mediaAsset).getZoomHeight()+", score: "+mediaAnalyze.get(mediaAsset).getIntegratedScore();
             }
             EditorSdkLogger.i("EditorMemoryTask", str);
             if (p2 != null) {
                if (!videoEditorP) {
                   uEditorSdkEr1 = new EditorSdk2$EditorSdkError();
                   uEditorSdkEr1.setCode(-1);
                   uEditorSdkEr1.setType(i);
                   uEditorSdkEr1.setMessage("Result not has valid track assets");
                   p2.onError(p4, uEditorSdkEr1);
                }else {
                   EditorMemoryResultImpl uEditorMemor = new EditorMemoryResultImpl();
                   uEditorMemor.setProject(EditorMemoryProjectCreator.createProjectFromAnalyzeResult(p1, p5));
                   uEditorMemor.setAnalyzeResultMessage(str);
                   uEditorMemor.setBgmType(p1.getBgmType());
                   p2.onFinish(p4, uEditorMemor);
                }
             }
          }
          return;
       }
    }
    private void lambda$run$1(List p0){
       String str1;
       String str = "";
       EditorMemoryTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       EditorMemoryTask tmListener = this.mListener;
       SmartEditTaskBuilder smartEditTas = VisionEngine.createSmartEditTaskBuilder().setDecoder(new EditorKveDecoder()).setFiles(p0);
       if (this.mParams.getMaxPresentedVideoNumber() > 0) {
          smartEditTas.setMaxPresentedVideoNumber(this.mParams.getMaxPresentedVideoNumber());
       }
       if (this.mParams.getMaxAnalysisVideoNumber() > 0) {
          smartEditTas.setMaxAnalysisVideoNumber(this.mParams.getMaxAnalysisVideoNumber());
       }
       if (this.mParams.getMaxAnalysisImageNumber() > 0) {
          smartEditTas.setMaxAnalysisImageNumber(this.mParams.getMaxAnalysisImageNumber());
       }
       int i = 0;
       if (this.mParams.getVideoClipTime() - i > 0) {
          smartEditTas.setVideoClipDuration(this.mParams.getVideoClipTime());
       }
       if (this.mParams.getImageClipTime() - i > 0) {
          smartEditTas.setImageClipDuration(this.mParams.getImageClipTime());
       }
       if (this.mParams.getAnalyzeCachePath() != null && (this.mParams.getAnalyzeCachePath()).length() > 0) {
          smartEditTas.setCacheFolder(this.mParams.getAnalyzeCachePath());
       }
       if (this.mParams.getMemoryWidth() > 0) {
          smartEditTas = smartEditTas.setPresentedWidth(this.mParams.getMemoryWidth());
       }
       if (this.mParams.getMemoryHeight() > 0) {
          smartEditTas = smartEditTas.setPresentedHeight(this.mParams.getMemoryHeight());
       }
       if (this.mParams.getMinAssetNum() > 0) {
          smartEditTas.setMinAssetNumber(this.mParams.getMinAssetNum());
       }
       if (this.mParams.getMinVideoDurationRequired() - i > 0) {
          smartEditTas.setMinVideoDurationRequired(this.mParams.getMinVideoDurationRequired());
       }
       if (this.mParams.getMaxTotalDuration() - i > 0) {
          smartEditTas.setMaxTotalDuration(this.mParams.getMaxTotalDuration());
       }
       EditorKveAsset uEditorKveAs = 1;
       EditorMemoryTask uEditorMemor = (this.mParams.getCoverAsset() != null && !TextUtils.isEmpty(this.mParams.getCoverAsset().getFileName()))? 1: null;
       if (uEditorMemor) {
          String fileName = this.mParams.getCoverAsset().getFileName();
          File uFile = new File(fileName);
          if (uFile.exists() && uFile.isFile()) {
             uEditorKveAs = new EditorKveAsset(fileName);
             uEditorKveAs.setCreationTime(this.mParams.getCoverAsset().getCreationTime());
             uEditorKveAs.setCreationLocation(this.mParams.getCoverAsset().getCreationLocation());
             smartEditTas = smartEditTas.setCoverAsset(uEditorKveAs);
          }else {
             str1 = "Input cover file not exist: "+fileName;
          label_015d :
             if (uEditorKveAs == null) {
                smartEditTas.setTotalProgressCallback(new EditorMemoryTask$1(this, tmListener, this));
                this.mSmartTask = smartEditTas.build();
             }
             _monitor_exit(tmLock);
             EditorMemoryTask uEditorMemor1 = (uEditorKveAs != null)? null: this.mSmartTask.run();
             SmartEditResult smartEditRes = uEditorMemor1;
             uEditorMemor1 = this.mLock;
             _monitor_enter(uEditorMemor1);
             if (this.mIsStopped != null) {
                _monitor_exit(uEditorMemor1);
                return;
             }else {
                e uoe = new e(uEditorKveAs, smartEditRes, this.mListener, str1, this, this.mParams);
                this.mMainHandler.post(tmLock);
                _monitor_exit(uEditorMemor1);
                return;
             }
          }
       }
       str1 = str;
       uEditorKveAs = null;
       goto label_015d ;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, EditorMemoryTask.class, "2")) {
          return;
       }
       EditorMemoryTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       EditorMemoryTask tmSmartTask = this.mSmartTask;
       if (tmSmartTask != null) {
          tmSmartTask.stop();
       }
       this.mIsStopped = true;
       this.mMainHandler.post(new c(this.mListener, this));
       _monitor_exit(tmLock);
       return;
    }
    public void pause(){
    }
    public void resume(){
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EditorMemoryTask.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       EditorMemoryTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       EditorMemoryTask tmParams = this.mParams;
       if (tmParams == null) {
          throw new EditorMemoryException("Params is null!!!");
       }
       if (tmParams.getAssetList() == null || this.mParams.getAssetList().isEmpty()) {
          throw new EditorMemoryException("Params does not have input files");
       }
       if (this.mSmartTask != null) {
          throw new EditorMemoryException("Already has task running!");
       }
       if (this.mParams.getAssetList() != null && !this.mParams.getAssetList().isEmpty()) {
          Iterator iterator = this.mParams.getAssetList().iterator();
          while (iterator.hasNext()) {
             EditorMemoryAsset uEditorMemor = iterator.next();
             File uFile = new File(uEditorMemor.getFileName());
             if (uFile.exists() && uFile.isFile()) {
                EditorKveAsset uEditorKveAs = new EditorKveAsset(uEditorMemor.getFileName());
                uEditorKveAs.setCreationTime(uEditorMemor.getCreationTime());
                uEditorKveAs.setCreationLocation(uEditorMemor.getCreationLocation());
                uArrayList.add(uEditorKveAs);
             }else {
                throw new EditorMemoryException("File not exist! "+uEditorMemor.getFileName());
             }
          }
       }
       _monitor_exit(tmLock);
       new Thread(new d(this, uArrayList)).start();
       return;
    }
    public void setEventListener(EditorMemoryListener p0){
       EditorMemoryTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mListener = p0;
       _monitor_exit(tmLock);
    }
}
