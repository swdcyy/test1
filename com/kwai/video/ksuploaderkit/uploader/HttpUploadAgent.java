package com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import java.lang.String;
import ln.b;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgentListener;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$AddressType;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.stats.HttpUploadStats;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$HttpChunkInfo;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$1;
import com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.io.RandomAccessFile;
import com.kwai.video.ksuploaderkit.utils.FileUtils;
import java.lang.Thread;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.io.IOException;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$6;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$5;
import java.io.File;
import java.io.FileNotFoundException;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$2;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$3;
import com.kwai.video.ksuploaderkit.apicenter.IApiService;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.a;
import com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiResponse;
import com.kwai.video.ksuploaderkit.uploader.HttpUploadAgent$4;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils;

public class HttpUploadAgent	// class@0009c9
{
    public HttpUploadAgentListener mAgentListener;
    public AtomicInteger mChunkIndex;
    public Object mChunkLock;
    public PublishConfig mConfig;
    public HttpRequester mHttpRequester;
    public long mProcessedFileSize;
    public RandomAccessFile mRandomAccessFile;
    public AtomicInteger mReceivedSegmentIndex;
    public String mServerHost;
    public HttpUploadStats mStats;
    public String mTaskId;
    public int mTotalDurationMs;
    public long mTotalFileSize;
    public KSUploaderKitCommon$UploadMode mUploadMode;
    public IUploader$UploadStatus mUploadStatus;
    public String mUploadToken;
    public int mUploadedDurationMs;
    public long mUploadedFileSize;
    public Object mUploadedFileSizeLock;

    public void HttpUploadAgent(KSUploaderKitCommon$UploadMode p0,String p1,b p2,HttpUploadAgentListener p3){
       super();
       this.mChunkLock = new Object();
       long l = 0;
       this.mUploadedFileSize = l;
       this.mChunkIndex = new AtomicInteger(0);
       this.mHttpRequester = new HttpRequester();
       this.mUploadMode = p0;
       this.mAgentListener = p3;
       this.mServerHost = p1;
       if (p2 != null) {
          if (p2.b >= null) {
             this.mChunkIndex = new AtomicInteger(p2.b);
          }
          b c = p2.c;
          if (c - l > 0) {
             l = c;
          }
          this.mUploadedFileSize = l;
          this.mUploadToken = p2.a;
       }
       this.mProcessedFileSize = this.mUploadedFileSize;
       this.mStats = new HttpUploadStats(this.mChunkIndex.get(), ServerAddress.getServerHost(ServerAddress$AddressType.Resume));
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent.class, "4")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "cancel");
       this.finishUpload(KSUploaderKitCommon$Status.Cancel, KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser.value(), null);
       return;
    }
    public void createChunkAndStartUpload(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HttpUploadAgent.class, "5")) {
          return;
       }
       if (IUploader$UploadStatus.Uploading == this.mUploadStatus) {
          HttpUploadAgent tmUploadedFi = this.mUploadedFileSizeLock;
          _monitor_enter(tmUploadedFi);
          if (!this.mUploadedFileSize - this.mTotalFileSize) {
             this.postFragmentUploadFinished();
             _monitor_exit(tmUploadedFi);
             return;
          }else {
             _monitor_exit(tmUploadedFi);
             HttpUploadAgent tmChunkLock = this.mChunkLock;
             _monitor_enter(tmChunkLock);
             if (!this.mProcessedFileSize - this.mTotalFileSize) {
                _monitor_exit(tmChunkLock);
                return;
             }else {
                HttpUploadAgent$HttpChunkInfo httpChunkInf = new HttpUploadAgent$HttpChunkInfo(this, objArray);
                httpChunkInf.offset = this.mProcessedFileSize;
                int i = 0x80000;
                PublishConfig$HTTPConfig hTTPConfig = this.mConfig.getHTTPConfig();
                if (hTTPConfig != null) {
                   hTTPConfig = hTTPConfig.uploadTaskFragmentSizeBytes;
                   if (hTTPConfig > null) {
                      i = hTTPConfig;
                   }
                }
                HttpUploadAgent tmTotalFileS = this.mTotalFileSize;
                HttpUploadAgent tmProcessedF = this.mProcessedFileSize;
                if ((tmTotalFileS - tmProcessedF) - (long)i < 0) {
                   i = (int)(tmTotalFileS - tmProcessedF);
                }
                httpChunkInf.chunkSize = i;
                httpChunkInf.chunkId = this.mChunkIndex.getAndIncrement();
                byte[] uobyteArray = new byte[i];
                if (FileUtils.readData(this.mRandomAccessFile, uobyteArray, this.mProcessedFileSize, i) == i) {
                   httpChunkInf.bodyData = uobyteArray;
                   httpChunkInf.bodyDataMD5 = FileUtils.getContentMD5(uobyteArray);
                   new Thread(new HttpUploadAgent$1(this, httpChunkInf)).start();
                   this.mProcessedFileSize = this.mProcessedFileSize + (long)i;
                   _monitor_exit(tmChunkLock);
                }else {
                   this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE.value(), objArray);
                   _monitor_exit(tmChunkLock);
                   return;
                }
             }
          }
       }
       return;
    }
    public void finishUpload(KSUploaderKitCommon$Status p0,int p1,HttpRequestInfo p2){
       if (PatchProxy.isSupport(HttpUploadAgent.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, HttpUploadAgent.class, "9")) {
          return;
       }
       IUploader$UploadStatus finish = IUploader$UploadStatus.Finish;
       if (finish != this.mUploadStatus) {
          this.mUploadStatus = finish;
          KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "finishUpload, status£º"+p0+", errorCode:"+p1);
          this.mStats.stop();
          HttpUploadAgent tmRandomAcce = this.mRandomAccessFile;
          if (tmRandomAcce != null) {
             try{
                tmRandomAcce.close();
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
          }
       }
       return;
    }
    public void finishUploadSegment(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent.class, "3")) {
          return;
       }
       KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "finishUploadSegment");
       HttpUploadAgent tmChunkLock = this.mChunkLock;
       _monitor_enter(tmChunkLock);
       if (IUploader$UploadStatus.Uploading == this.mUploadStatus) {
          this.postFragmentUploadFinished();
       }
       _monitor_exit(tmChunkLock);
       return;
    }
    public final void postFragmentUploadFinished(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent.class, "8")) {
          return;
       }
       new Thread(new HttpUploadAgent$5(this)).start();
       return;
    }
    public void release(){
    }
    public void setConfig(PublishConfig p0){
       this.mConfig = p0;
    }
    public void startUpload(String p0,int p1,String p2){
       if (PatchProxy.isSupport(HttpUploadAgent.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, HttpUploadAgent.class, "1")) {
          return;
       }
       IUploader$UploadStatus uploading = IUploader$UploadStatus.Uploading;
       if (uploading != this.mUploadStatus) {
          KSUploaderKitLog.i("KSUploaderKit-HttpUploadAgent", "start upload, filePath:"+p0+", taskId:"+p2);
          this.mUploadStatus = uploading;
          this.mTaskId = p2;
          if (this.mUploadToken == null) {
             this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderCloseReason.KSUploaderCloseReason_SDK_APICall_Failed.value(), null);
             return;
          }else {
             HttpUploadAgent tmUploadMode = this.mUploadMode;
             int i = 0;
             if (KSUploaderKitCommon$UploadMode.Whole == tmUploadMode) {
                try{
                   File uFile = new File(p0);
                   this.mRandomAccessFile = new RandomAccessFile(uFile, "r");
                   this.mTotalFileSize = uFile.length();
                   this.mUploadedFileSizeLock = new Object();
                   PublishConfig$HTTPConfig hTTPConfig = this.mConfig.getHTTPConfig();
                   if (hTTPConfig != null) {
                      hTTPConfig = hTTPConfig.maxConcurrentCount;
                      if (hTTPConfig > null) {
                         while (i < hTTPConfig) {
                            this.createChunkAndStartUpload();
                            i = i + 1;
                         }
                      }
                   }
                   hTTPConfig = 1;
                   goto label_0083 ;
                }catch(java.io.FileNotFoundException e8){
                   e8.printStackTrace();
                   this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE.value(), null);
                   return;
                }
             }else if(KSUploaderKitCommon$UploadMode.Fragement == tmUploadMode){
                this.mTotalDurationMs = p1;
                this.mReceivedSegmentIndex = new AtomicInteger(i);
             }
          }
       }
       return;
    }
    public void updateProgress(){
       if (PatchProxy.applyVoid(null, this, HttpUploadAgent.class, "6")) {
          return;
       }
       double d = 0x3fefae147ae147ae;
       double d1 = 0x3ff0000000000000;
       if (KSUploaderKitCommon$UploadMode.Fragement == this.mUploadMode) {
          new Handler(Looper.getMainLooper()).post(new HttpUploadAgent$2(this, ((((double)this.mUploadedDurationMs * d1) / (double)this.mTotalDurationMs) * d)));
       }else {
          HttpUploadAgent tmUploadedFi = this.mUploadedFileSizeLock;
          _monitor_enter(tmUploadedFi);
          double d2 = (((double)this.mUploadedFileSize * d1) / (double)this.mTotalFileSize) * d;
          HttpUploadAgent httpUploadAg = null;
          long l = (this.mStats.getSpeed() - httpUploadAg > 0)? (this.mTotalFileSize - this.mUploadedFileSize) / this.mStats.getSpeed(): httpUploadAg;
          HttpUploadAgent$3 u3 = new HttpUploadAgent$3(this, d2, l);
          new Handler(Looper.getMainLooper()).post(d);
          _monitor_exit(tmUploadedFi);
       }
       return;
    }
    public void uploadFragmentData(HttpUploadAgent$HttpChunkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploadAgent.class, "7")) {
          return;
       }
       HttpUploadAgent$HttpChunkInfo chunkSize = p0.chunkSize;
       KSUploaderKitLog.d("KSUploaderKit-HttpUploadAgent", "upload fragment data by http, chunkId: "+p0.chunkId+" size:"+chunkSize);
       this.mHttpRequester.doRequestAsync(this.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(this.mServerHost)).fragmentUpload(RequestBody.create(MediaType.parse("application/octet-stream"), p0.bodyData), p0.chunkId, p0.bodyDataMD5, this.mUploadToken), MediaCloudApiResponse.class, new HttpUploadAgent$4(this, chunkSize));
       return;
    }
    public void uploadSegment(KSUploaderKitSegmentInfo p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, HttpUploadAgent.class, "2")) {
          return;
       }
       if (IUploader$UploadStatus.Uploading == this.mUploadStatus) {
          HttpUploadAgent tmChunkLock = this.mChunkLock;
          _monitor_enter(tmChunkLock);
          int index = p0.getIndex();
          if (!index) {
             index = this.mReceivedSegmentIndex.getAndIncrement();
          }
          if (index < this.mChunkIndex.get()) {
             KSUploaderKitLog.d("KSUploaderKit-HttpUploadAgent", "upload segment data by http, skip index: "+index+" range:["+p0.getStartPos()+","+p0.getEndPos()+"\)");
             this.mUploadedDurationMs = this.mUploadedDurationMs + p0.getDurationMs();
             this.updateProgress();
          }else {
             KSUploaderKitLog.d("KSUploaderKit-HttpUploadAgent", "upload segment data by http, index: "+index+" range:["+p0.getStartPos()+","+p0.getEndPos()+"\)");
             IApiService apiService = this.mHttpRequester.getApiService(ServerAddress.getGeneralUploadHost(this.mServerHost));
             int i = (int)((p0.getEndPos() - p0.getStartPos()) + 1);
             byte[] uobyteArray = new byte[i];
             try{
                i1 = 0;
                RandomAccessFile randomAccess = new RandomAccessFile(new File(p0.getFilePath()), "r");
                randomAccess.close();
                if (FileUtils.readData(randomAccess, uobyteArray, p0.getStartPos(), i) != i) {
                   this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE.value(), i1);
                }else {
                   int durationMs = p0.getDurationMs();
                   HttpRequestInfo httpRequestI = new HttpRequestInfo();
                   MediaCloudApiResponse mediaCloudAp = this.mHttpRequester.doRequestSync(apiService.fragmentUpload(RequestBody.create(MediaType.parse("application/octet-stream"), uobyteArray), this.mChunkIndex.getAndIncrement(), FileUtils.getContentMD5(uobyteArray), this.mUploadToken), MediaCloudApiResponse.class, httpRequestI);
                   if (mediaCloudAp != null && 1 == mediaCloudAp.result) {
                      KSUploaderKitLog.d("KSUploaderKit-HttpUploadAgent", "http upload fragment successfully, response:"+httpRequestI.getResponseBody());
                      this.mUploadedDurationMs = this.mUploadedDurationMs + durationMs;
                      this.updateProgress();
                      this.mStats.didSendData((long)i);
                   }else {
                      KSUploaderKitLog.e("KSUploaderKit-HttpUploadAgent", "http upload fragment failed, http code:"+httpRequestI.getHttpCode()+",kitErrorCode:"+httpRequestI.getNetErrorCode());
                      if (NetworkUtils$NetErrorCode.NO_ERROR == httpRequestI.getNetErrorCode()) {
                         httpRequestI.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
                      }
                      this.finishUpload(KSUploaderKitCommon$Status.Fail, NetworkUtils.netErrorCode2KitErrorCodeValue(ApiManager$UploadStep.UploadFragment, httpRequestI.getNetErrorCode()), httpRequestI);
                   }
                }
             }catch(java.io.FileNotFoundException e10){
                e10.printStackTrace();
                this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE.value(), i1);
             }catch(java.io.IOException e10){
                e10.printStackTrace();
                this.finishUpload(KSUploaderKitCommon$Status.Fail, KSUploaderKitCommon$ERRORCODE.HTTP_INVALID_FILE.value(), i1);
             }
          }
       }
       return;
    }
}
