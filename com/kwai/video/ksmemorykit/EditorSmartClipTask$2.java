package com.kwai.video.ksmemorykit.EditorSmartClipTask$2;
import java.lang.Thread;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$EditorVoiceDetectStatus;
import java.util.Iterator;
import java.util.List;
import com.kwai.video.editorsdk2.kve.EditorKveAsset;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import com.kwai.video.editorsdk2.kve.EditorKveVoiceDetector;
import com.kwai.video.editorsdk2.kve.EditorKveVoiceDetectParam;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.editorsdk2.kve.EditorKveVoiceDetectResult;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import java.lang.System;

public class EditorSmartClipTask$2 extends Thread	// class@0008f8
{
    public final EditorSmartClipTask this$0;

    public void EditorSmartClipTask$2(EditorSmartClipTask p0,String p1){
       this.this$0 = p0;
       super(p1);
    }
    public void run(){
       EditorSmartClipTask$2 this$01;
       double d1;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, EditorSmartClipTask$2.class, "1")) {
          return;
       }
       EditorSmartClipTask$2 this$0 = obj.this$0;
       this$0.mVoiceDetectStatus = EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusExecuting;
       Iterator iterator = this$0.mMediaAssets.iterator();
       while (iterator.hasNext()) {
          EditorKveAsset uEditorKveAs = iterator.next();
          String fileMD5 = EditorSmartClipTask.getFileMD5(new File(uEditorKveAs.getFileName()));
          ArrayList uArrayList = new ArrayList();
          List list = obj.this$0.readVoiceDdtectResultListFromCache(new File(fileMD5));
          double d = 0;
          if (list != null && list.size() > 0) {
             obj.this$0.mVoiceDetectResults.put(uEditorKveAs, list);
          }else {
             EditorKveVoiceDetector uEditorKveVo1 = new EditorKveVoiceDetector();
             EditorKveVoiceDetectParam uEditorKveVo2 = new EditorKveVoiceDetectParam();
             uEditorKveVo2.setFileName(uEditorKveAs.getFileName());
             uEditorKveVo2.setModelPath(obj.this$0.mVoiceDetectModePath);
             uEditorKveVo2.setStartTime(d);
             uEditorKveVo2.setEndTime((double)obj.this$0.mAnalysisDurationLimit);
             uArrayList.clear();
             List list2 = uEditorKveVo1.detectVoice(uEditorKveVo2);
             uEditorKveVo1.release();
             if (!list2.isEmpty()) {
                obj.this$0.mVoiceDetectResults.put(uEditorKveAs, list2);
                obj.this$0.writeVoiceDdtectResultListIntoCache(new File(obj.this$0.mTempPath, fileMD5), list2);
             }
             if (obj.this$0.mVoiceDetectResults.size() == obj.this$0.mMediaAssets.size()) {
                this$01 = obj.this$0;
                this$01.mVoiceDetectStatus = EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusExecuting;
                this$01.mVoiceDetectCount.countDown();
             }
          }
          this$01 = obj.this$0;
          if (this$01.mOnlyAnalysisMusic != null) {
             int i = 0;
             List list1 = this$01.mVoiceDetectResults.get(this$01.mMediaAssets.get(i));
             if (list1 != null && list1.size() > 0) {
                iterator = list1.iterator();
                d1 = d;
                while (iterator.hasNext()) {
                   EditorKveVoiceDetectResult uEditorKveVo = iterator.next();
                   double start = uEditorKveVo.getStart();
                   double end = uEditorKveVo.getEnd();
                   if (uEditorKveVo.getSpeechProb() - uEditorKveVo.getMusicProb() > 0 && (uEditorKveVo.getSpeechProb() - uEditorKveVo.getNoiseProb() > 0 && start - end < 0)) {
                      end = end - start;
                      d = d + end;
                   }else if(uEditorKveVo.getMusicProb() - uEditorKveVo.getSpeechProb() > 0 && (uEditorKveVo.getMusicProb() - uEditorKveVo.getNoiseProb() > 0 && start - end < 0)){
                      end = end - start;
                      d1 = d1 + end;
                      continue ;
                   }else {
                      continue ;
                   }
                }
                d1 = d;
                d = d1;
             }else {
                d1 = d;
             }
             if (d - d1 > 0) {
                i = true;
             }
             EditorSmartClipResult uEditorSmart = new EditorSmartClipResult();
             uEditorSmart.setHasMusic(i);
             EditorSmartClipTask mListener = obj.this$0.mListener;
             if (mListener != null) {
                mListener.onFinish(uEditorSmart);
                break ;
             }else {
                break ;
             }
          }
       }
       obj.this$0.mVoiceDetectCostTime = (System.nanoTime() - obj.this$0.mVoiceDetectCostTime) / 0xf4240;
       return;
    }
}
