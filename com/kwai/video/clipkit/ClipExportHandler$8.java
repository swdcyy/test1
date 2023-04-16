package com.kwai.video.clipkit.ClipExportHandler$8;
import com.kwai.video.editorsdk2.ExportEventListenerV2;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExportTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.editorsdk2.ExportTaskStatsUnit;
import android.os.SystemClock;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import android.content.Context;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.editorsdk2.ExportEventListener;
import jv7.f;
import com.kwai.video.editorsdk2.ExportedPipelineTempFilesState;
import jv7.g;
import java.lang.Double;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListenerV2;

public class ClipExportHandler$8 implements ExportEventListenerV2	// class@001a13
{
    public final ClipExportHandler this$0;

    public void ClipExportHandler$8(ClipExportHandler p0){
       this.this$0 = p0;
       super();
    }
    public void onCancelled(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$8.class, "5")) {
          return;
       }
       this.this$0.revertTrackAsset();
       this.this$0.notifyCancelCallback("Transcode");
       return;
    }
    public void onError(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipExportHandler$8.class, "4")) {
          return;
       }
       this.this$0.revertTrackAsset();
       this.this$0.notifyErrorCallback("Transcode", new ClipExportException(p0.getError().type(), p0.getError().code(), p0.getError().message()));
       return;
    }
    public void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler$8.class, "2")) {
          return;
       }
       ClipExportHandler mRenderRange = this.this$0.mRenderRangeLock;
       _monitor_enter(mRenderRange);
       ClipExportHandler$8 tthis$0 = this.this$0;
       tthis$0.mRenderRanges = p1;
       _monitor_exit(mRenderRange);
       tthis$0.revertTrackAsset();
       ClipExportHandler$8 tthis$01 = this.this$0;
       double d = (tthis$01.mIsPipeline != null && tthis$01.mNeedRemux != null)? 0x3fef5c28f5c28f5c: 0x3ff0000000000000;
       tthis$01.mCurrentProgress = d;
       ClipExportHandler mLock = tthis$01.mLock;
       _monitor_enter(mLock);
       this.this$0.mExportTaskStatsInfo = p0.getExportTaskStats();
       ClipExportHandler$8 tthis$02 = this.this$0;
       ClipExportHandler mExportLog = tthis$02.mExportLog;
       if (mExportLog != null) {
          mExportLog.setEncodeQos(tthis$02.mExportTaskStatsInfo);
       }
       _monitor_exit(mLock);
       tthis$01 = this.this$0;
       if (tthis$01.mCapeHandler != null && tthis$01.getVideoType() != 10) {
          tthis$01 = this.this$0;
          if (tthis$01.mApplicationContext != null) {
             mRenderRange = tthis$01.mExportLog;
             if (mRenderRange != null && mRenderRange.encodeStartTime - null > 0) {
                mLock = tthis$01.mExportOptions;
                if (mLock != null && mLock.videoFrameRate() != null) {
                   mLock = this.this$0.mExportTaskStatsInfo;
                   if (mLock != null && mLock.getExportTaskStatsUnit() != null) {
                      tthis$01 = this.this$0;
                      d = (double)(SystemClock.elapsedRealtime() - tthis$01.mExportLog.encodeStartTime) / 0x408f400000000000;
                      double d1 = (double)(((float)tthis$01.mExportOptions.videoFrameRate().num() * 0x3f800000) / (float)this.this$0.mExportOptions.videoFrameRate().den());
                      double exportDurati = this.this$0.mExportTaskStatsInfo.getExportTaskStatsUnit().getExportDurationSec();
                      KSClipLog.i("ClipExportHandler", "computeExportSpeed timeCost "+d+", sdkCost "+this.this$0.mExportTaskStatsInfo.getExportTaskStatsUnit().getAllCostSec()+", fps "+d1+", duration "+exportDurati+", size "+this.this$0.mExportOptions.width()+","+this.this$0.mExportOptions.height());
                      if (d > 0 && exportDurati - 0x4008000000000000 > 0) {
                         tthis$01 = this.this$0;
                         ClipKitUtils.saveExportSpeed(tthis$01.mApplicationContext, tthis$01.mExportOptions.videoEncoderType(), this.this$0.getVideoType(), (float)((((double)(this.this$0.mExportOptions.width() * this.this$0.mExportOptions.height()) * d1) * exportDurati) / d));
                      }
                   }
                }
             }
          }
       }
       tthis$01 = this.this$0;
       tthis$01.notifyProgressCallback("Transcode", tthis$01.mCurrentProgress);
       tthis$01 = this.this$0;
       if (tthis$01.mIsPipeline != null && tthis$01.mNeedRemux != null) {
          mRenderRange = tthis$01.mLock;
          _monitor_enter(mRenderRange);
          tthis$01 = this.this$0;
          if (tthis$01.mIsCancel != null) {
             tthis$01.notifyCancelCallback("Transcode");
             _monitor_exit(mRenderRange);
             return;
          }else {
             tthis$01.startPipelineRemux(p0);
             _monitor_exit(mRenderRange);
          }
       }else {
          tthis$01.notifyFinishCallback("Transcode");
       }
       return;
    }
    public void onNewFrame(ExportTask p0,double p1){
       f.a(this, p0, p1);
    }
    public void onPipelineTemporaryFileParsed(ExportTask p0,ExportedPipelineTempFilesState p1){
       g.a(this, p0, p1);
    }
    public void onProgress(ExportTask p0,double p1){
       ClipExportHandler$8 u8 = ClipExportHandler$8.class;
       if (PatchProxy.isSupport(u8) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, u8, "3")) {
          return;
       }
       ClipExportHandler$8 tthis$0 = this.this$0;
       if (tthis$0.mIsPipeline != null && tthis$0.mNeedRemux != null) {
          p1 = p1 * 0x3fef5c28f5c28f5c;
       }
       tthis$0.notifyProgressCallback("Transcode", p1);
       return;
    }
    public void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1){
       ClipExportHandler mExportLog;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipExportHandler$8.class, "1")) {
          return;
       }
       int i = 1;
       if (p1.isVideoSegment()) {
          mExportLog = this.this$0.mExportLog;
          mExportLog.videoSegmentCount = mExportLog.videoSegmentCount + i;
       }else {
          mExportLog = this.this$0.mExportLog;
          mExportLog.audioSegmentCount = mExportLog.audioSegmentCount + i;
       }
       Object[] objArray = new Object[]{Boolean.valueOf(p1.isVideoSegment()),Integer.valueOf(this.this$0.mExportLog.videoSegmentCount),Integer.valueOf(this.this$0.mExportLog.audioSegmentCount),Integer.valueOf(p1.getStartByte()),Integer.valueOf(p1.getByteLength()),Double.valueOf(p1.getSegmentDuration())};
       KSClipLog.i("ClipExportHandler", String.format("onSegmentEncoded isVideo:%b,videoSegmentCount:%d,audioSegmentCount:%d,startPos:%d,len:%d,duration:%f", objArray));
       this.this$0.mExportLog.segmentTotalLength = (long)(p1.getStartByte() + p1.getByteLength());
       mExportLog = this.this$0.mClipExportListener;
       if (mExportLog != null && mExportLog instanceof ClipExportHandler$ClipExportListenerV2) {
          mExportLog.onSegmentEncoded(p0, p1);
       }
       return;
    }
}
