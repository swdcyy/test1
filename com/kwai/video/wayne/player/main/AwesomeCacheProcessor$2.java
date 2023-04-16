package com.kwai.video.wayne.player.main.AwesomeCacheProcessor$2;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.video.wayne.player.main.AwesomeCacheProcessor;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.CacheReceipt;
import com.kwai.video.wayne.player.listeners.CacheListener;

public class AwesomeCacheProcessor$2 extends AwesomeCacheCallback	// class@000d51
{
    public final AwesomeCacheProcessor this$0;

    public void AwesomeCacheProcessor$2(AwesomeCacheProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       AwesomeCacheProcessor mListener;
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheProcessor$2.class, "2")) {
          return;
       }
       AwesomeCacheProcessor$2 tthis$0 = this.this$0;
       tthis$0.mAcCallBackInfo = p0;
       if (tthis$0.isSubtitleType(p0.currentUri)) {
          return;
       }
       tthis$0 = this.this$0;
       AwesomeCacheProcessor mReceipt = tthis$0.mReceipt;
       mReceipt.mHost = p0.host;
       mReceipt.mUrl = p0.currentUri;
       mReceipt.mSignature = p0.kwaiSign;
       mReceipt.mXKsHttpHeader = p0.xKsCache;
       AcCallBackInfo cdnStatJson = p0.cdnStatJson;
       mReceipt.mCdnStatJson = cdnStatJson;
       mReceipt.mSessionUUID = p0.sessionUUID;
       mReceipt.mDownloadUUID = p0.downloadUUID;
       mReceipt.mCdnStatJson = cdnStatJson;
       mReceipt.mHttpResponseCode = p0.httpResponseCode;
       mReceipt.mErrorCode = p0.errorCode;
       mReceipt.mStopReason = p0.stopReason;
       mReceipt.mReadSourceTimeCostMills = (long)p0.transferConsumeMs;
       cdnStatJson = p0.progressPosition;
       mReceipt.mBytesReadFromSource = cdnStatJson;
       mReceipt.mCurrentSpeedKbps = p0.currentSpeedKbps;
       tthis$0.notifyPreloadNextVideo(cdnStatJson);
       AcCallBackInfo stopReason = p0.stopReason;
       int i = 1;
       if (stopReason != i) {
          if (stopReason != 2) {
             this.this$0.logCdnStatJson(p0.cdnStatJson);
             AwesomeCacheProcessor$2 tthis$01 = this.this$0;
             mListener = tthis$01.mListener;
             if (mListener != null) {
                mListener.onFailed(tthis$01.mReceipt);
             }
          }else {
             tthis$0 = this.this$0;
             mReceipt = tthis$0.mListener;
             if (mReceipt != null) {
                mReceipt.onCancelled(tthis$0.mReceipt);
             }
             this.this$0.logCdnStatJson(p0.cdnStatJson);
          }
       }else {
          tthis$0 = this.this$0;
          AwesomeCacheProcessor mListener1 = tthis$0.mListener;
          if (mListener1 != null && tthis$0.mCompletedCalled == null) {
             mListener = tthis$0.mReceipt;
             mListener.mFragmentIndex = mListener.mFragmentIndex + i;
             mListener1.onFragmentCompleted(mListener);
          }
          if (p0.progressPosition - p0.totalBytes >= 0) {
             tthis$0 = this.this$0;
             mListener1 = tthis$0.mListener;
             if (mListener1 != null && tthis$0.mCompletedCalled == null) {
                tthis$0.mCompletedCalled = i;
                mListener1.onCompleted(tthis$0.mReceipt);
             }
          }
          this.this$0.logCdnStatJson(p0.cdnStatJson);
       }
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheProcessor$2.class, "1")) {
          return;
       }
       AwesomeCacheProcessor$2 tthis$0 = this.this$0;
       tthis$0.mAcCallBackInfo = p0;
       AwesomeCacheProcessor mReceipt = tthis$0.mReceipt;
       mReceipt.mTotalBytesOfResponse = p0.contentLength;
       mReceipt.mTotalBytesOfSource = p0.totalBytes;
       mReceipt.mIp = p0.ip;
       mReceipt.mHost = p0.host;
       mReceipt.mInitAvailableBytesOfCache = p0.cachedBytes;
       mReceipt.mBytesReadFromSource = p0.progressPosition;
       AwesomeCacheProcessor mListener = tthis$0.mListener;
       if (mListener != null) {
          mListener.onProgress(mReceipt);
       }
       if (p0.progressPosition - p0.totalBytes >= 0) {
          AwesomeCacheProcessor$2 tthis$01 = this.this$0;
          mListener = tthis$01.mListener;
          if (mListener != null && tthis$01.mCompletedCalled == null) {
             tthis$01.mCompletedCalled = true;
             mListener.onCompleted(tthis$01.mReceipt);
             tthis$01 = this.this$0;
             mListener = tthis$01.mReceipt;
             mListener.mFragmentIndex = mListener.mFragmentIndex + true;
             tthis$01.mListener.onFragmentCompleted(mListener);
          }
       }
       return;
    }
}
