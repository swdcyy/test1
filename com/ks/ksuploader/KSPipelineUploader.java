package com.ks.ksuploader.KSPipelineUploader;
import com.ks.ksuploader.KSUploader;
import android.content.Context;
import com.ks.ksapi.b;
import com.ks.ksuploader.KSPipelineUploader$UploadMode;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.StringBuilder;
import java.lang.Number;
import com.ks.ksuploader.KSUploader$UploadInfo;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.ks.ksuploader.ProgressPercentage;
import com.ks.ksuploader.KSEncryptConfig;
import ln.b;
import java.lang.Exception;
import com.ks.ksuploader.KSUploader$RickonConfig;
import com.ks.ksuploader.KSUploaderUtils;
import java.util.Map;
import com.ks.ksuploader.KSUploader$FragmentInfo;

public class KSPipelineUploader extends KSUploader	// class@000758
{
    public Map mCachedFragmentInfo;
    public int mCurrentIndex;
    public boolean mPreviousFragRegenerated;
    public boolean mStreamingUploadFileFinished;
    public KSPipelineUploader$UploadMode mUploadMode;

    public void KSPipelineUploader(Context p0,b p1){
       super(p0, p1);
       this.mCurrentIndex = 0;
       this.mUploadMode = KSPipelineUploader$UploadMode.UploadMode_Init;
       this.mStreamingUploadFileFinished = false;
       this.mPreviousFragRegenerated = false;
       this.mCachedFragmentInfo = new HashMap();
    }
    public final boolean canSkipFragment(int p0,long p1,long p2,int p3,int p4){
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, kSPipelineUp, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if ((long)p0 - p1 < 0) {
          if (p2 - null > 0 || this.mPreviousFragRegenerated != null) {
             this.mPreviousFragRegenerated = true;
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "Disable resume upload for frag "+p0+" as refragOriginSize "+p2);
          }else if(p3 > 0 && (long)((p3 - p4) + p0) - p1 > 0){
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "Disable resume upload for frag "+p0+", in same GOP with resume start frag "+p1+" \(gop:"+p3+",idx:"+p4);
             return 0;
          }else {
             return 1;
          }
       }
       return 0;
    }
    public int finishFramgment(byte[] p0){
       KSUploader obj = PatchProxy.applyOneRefs(p0, this, KSPipelineUploader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mIsStarted == null) {
          _monitor_exit(obj);
          return 0;
       }else {
          _monitor_exit(obj);
          return this.finishFragmentInner(p0, this.uploadInfo.getFileSize(), this.uploadInfo.fragNum);
       }
    }
    public int finishStreamingUpload(int p0,byte[] p1){
       KSUploaderLogLevel obj;
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, kSPipelineUp, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       KSUploader.postLog(obj, "finishStreamingUpload overwriteOffset "+p0);
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (!null - this.mNativeContext) {
          _monitor_exit(tmLock);
          return -1;
       }else if(this.mIsStarted == null){
          KSUploader.postLog(obj, "finishStreamingUpload called when not started");
          KSUploaderCloseReason kSUploaderCl = KSUploaderCloseReason.KSUploaderCloseReason_UninitializedUpload;
          KSUploader tuploadInfo = this.uploadInfo;
          String str = (tuploadInfo == null)? "": tuploadInfo.fileID;
          this.postUploadFailedAndRelease(kSUploaderCl, 0, null, str, "finishStreamingUpload called when not started");
          _monitor_exit(tmLock);
          return -1;
       }else if(this.mUploadMode != KSPipelineUploader$UploadMode.UploadMode_Streaming){
          KSUploader.postLog(obj, "finishStreamingUpload called when mode not streaming");
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, null, this.uploadInfo.fileID, "finishStreamingUpload called when mode not streaming");
          _monitor_exit(tmLock);
          return -1;
       }else if(this.mStreamingUploadFileFinished == null){
          KSUploader.postLog(obj, "finishStreamingUpload called when updateStreamingUpload not marked finished");
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, null, this.uploadInfo.fileID, "finishStreamingUpload called when updateStreamingUpload not marked finished");
          _monitor_exit(tmLock);
          return -1;
       }else {
          _monitor_exit(tmLock);
          return this.finishStreamingUploadInner(p0, p1);
       }
    }
    public ProgressPercentage getProgressPercentageFromEvent(long p0,long p1,long p2,long p3){
       KSUploader$UploadInfo size;
       long l1;
       KSUploader kSUploader = this;
       if (PatchProxy.isSupport(KSPipelineUploader.class)) {
          Object obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, KSPipelineUploader.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = 0;
       KSUploader uploadInfo = kSUploader.uploadInfo;
       double d = 0x3ff0000000000000;
       int i = -1;
       if (uploadInfo.duration > 0) {
          uploadInfo = kSUploader.uploadInfo;
          l = ((double)this.getSentDuration() * d) / (double)uploadInfo.duration;
          if (p3 > 0) {
             size = uploadInfo.size;
             if (size > 0) {
                l1 = ((size - this.getSentSize()) * 8) / p3;
             label_005a :
                i = (int)l1;
             }
          }
       }else if(uploadInfo.getFileSize() > 0){
          l = ((double)this.getSentSize() * d) / (double)kSUploader.uploadInfo.getFileSize();
          if (p3 > 0) {
             size = kSUploader.uploadInfo.size;
             if (size > 0) {
                l1 = ((size - this.getSentSize()) * 8) / p3;
                goto label_005a ;
             }
          }
       }
       return new ProgressPercentage(l, i);
    }
    public int setupFragment(long p0,String p1,boolean p2){
       if (PatchProxy.isSupport(KSPipelineUploader.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, KSPipelineUploader.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.setupFragment(p0, p1, p2, new KSEncryptConfig());
    }
    public int setupFragment(long p0,String p1,boolean p2,KSEncryptConfig p3){
       KSUploader obj;
       KSUploader kSUploader = this;
       boolean b = p2;
       if (PatchProxy.isSupport(KSPipelineUploader.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, KSPipelineUploader.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "setupFragment duration: "+p0+", taskId: "+p1+", enableResumeUpload: "+b);
       KSUploader mLock = kSUploader.mLock;
       _monitor_enter(mLock);
       if (kSUploader.mIsStarted != null) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "setupFragment called but already started");
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_MultiInit, 0, null, null, "setupFragment: called but already started");
          _monitor_exit(mLock);
          return -1;
       }else {
          _monitor_exit(mLock);
          KSEncryptConfig kSEncryptCon = (p3 == null)? new KSEncryptConfig(): p3;
          if (!kSEncryptCon.isValid()) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "Encrypt configuration invalid");
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid, 0, null, null, "setupFragment: Encrypt configuration invalid");
             return -1;
          }else {
             kSUploader.uploadInfo.update(null, p1, p0, 0);
             obj = kSUploader.uploadInfo;
             obj.enableResume = b;
             obj.encryptConfig = new KSEncryptConfig(kSEncryptCon);
             if (this.requestUploadInfo(p1) == null) {
                return -1;
             }else {
                KSUploader mLock1 = kSUploader.mLock;
                _monitor_enter(mLock1);
                if (kSUploader.mIsStarted != null) {
                   this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_MultiInit, 0, null, null, "setupFragment: called but !mIsStarted");
                   _monitor_exit(mLock1);
                   return -1;
                }else if(this.onUploadReady()){
                   this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed, 0, null, null, "setupFragment: onUploadReady failed");
                   _monitor_exit(mLock1);
                   return -1;
                }else {
                   kSUploader.mIsStarted = true;
                   KSUploader uploadInfo = kSUploader.uploadInfo;
                   this.setResumeInfo(uploadInfo.taskId, uploadInfo.fileID);
                   if (this.setEncryptConfig()) {
                      this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_EncryptConfig_Invalid, 0, null, null, "setupFragment: setEncryptConfig failed");
                      _monitor_exit(mLock1);
                      return -1;
                   }else {
                      _monitor_exit(mLock1);
                      return 0;
                   }
                }
             }
          }
       }
    }
    public int startStreamingUpload(String p0,String p1,long p2,int p3,int p4,boolean p5){
       KSUploader obj;
       KSPipelineUploader$UploadMode uploadMode = this;
       object oobject = p0;
       object oobject1 = p1;
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       int i = 1;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, uploadMode, kSPipelineUp, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "startStreamingUpload taskId "+oobject+", filePath "+oobject1);
       obj = uploadMode.mLock;
       _monitor_enter(obj);
       if (!null - uploadMode.mNativeContext) {
          _monitor_exit(obj);
          return -1;
       }else if(uploadMode.mUploadMode == KSPipelineUploader$UploadMode.UploadMode_Init){
          uploadMode.mUploadMode = KSPipelineUploader$UploadMode.UploadMode_Streaming;
          _monitor_exit(obj);
          uploadMode.uploadInfo.update(null, p0, (long)p4, 0);
          obj = uploadMode.uploadInfo;
          boolean b = p5;
          try{
             obj.enableResume = b;
             if (this.requestUploadInfo(p0) == null) {
                return -1;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          KSUploader mLock = uploadMode.mLock;
          _monitor_enter(mLock);
          if (this.onUploadReady()) {
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed, 0, 0, 0, "startStreamingUpload: onUploadReady failed");
             _monitor_exit(mLock);
             return -1;
          }else {
             uploadMode.mIsStarted = i;
             KSUploader uploadInfo = uploadMode.uploadInfo;
             uploadMode.setResumeInfo(uploadInfo.taskId, uploadInfo.fileID);
             uploadInfo = uploadMode.uploadInfo;
             _monitor_exit(mLock);
             return this.startStreamingUploadInner(uploadInfo.fileID, p1, p2, p3, p4, (int)uploadInfo.startIndex, uploadInfo.startIndexSize);
          }
       }else {
          KSUploaderCloseReason kSUploaderCl = KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch;
          KSUploader uploadInfo1 = uploadMode.uploadInfo;
          String str = (uploadInfo1 == null)? "": uploadInfo1.fileID;
          this.postUploadFailedAndRelease(kSUploaderCl, 0, 0, str, "startStreamingUpload: wrong upload mode "+uploadMode.mUploadMode);
          _monitor_exit(obj);
          return -1;
       }
    }
    public int startUploadFragment(String p0,int p1,int p2,long p3,long p4,byte[] p5,long p6){
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),p5,Long.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, kSPipelineUp, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }else {
          int i = this;
       }
       return this.startUploadFragment(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public int startUploadFragment(String p0,int p1,int p2,long p3,long p4,byte[] p5,long p6,boolean p7){
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),p5,Long.valueOf(p6),Boolean.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, this, kSPipelineUp, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }else {
          int i = this;
       }
       return this.startUploadFragment(p0, p1, p2, p3, p4, p5, p6, p7, 0, 0, 0, false);
    }
    public int startUploadFragment(String p0,int p1,int p2,long p3,long p4,byte[] p5,long p6,boolean p7,long p8,int p9,int p10,boolean p11){
       Object[] objArray;
       KSPipelineUploader$UploadMode obj;
       KSUploader uploadInfo;
       KSPipelineUploader kSPipelineUp1;
       long fileCRC32;
       int i9;
       KSUploader kSUploader;
       KSPipelineUploader kSPipelineUp3;
       long l4;
       KSPipelineUploader$UploadMode uploadMode = this;
       object oobject = p0;
       long l = p3;
       boolean b = p11;
       KSPipelineUploader kSPipelineUp = KSPipelineUploader.class;
       int i = 9;
       int i1 = 8;
       int i2 = 7;
       int i3 = 6;
       int i4 = 5;
       int i5 = 4;
       int i6 = 3;
       int i7 = 2;
       int i8 = 10;
       if (PatchProxy.isSupport(kSPipelineUp)) {
          objArray = new Object[12];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[i7] = Integer.valueOf(p2);
          objArray[i6] = Long.valueOf(p3);
          objArray[i5] = Long.valueOf(p4);
          objArray[i4] = p5;
          objArray[i3] = Long.valueOf(p6);
          objArray[i2] = Boolean.valueOf(p7);
          objArray[i1] = Long.valueOf(p8);
          objArray[i] = Integer.valueOf(p9);
          objArray[i8] = Integer.valueOf(p10);
          objArray[11] = Boolean.valueOf(p11);
          obj = PatchProxy.apply(objArray, uploadMode, kSPipelineUp, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       objArray = new Object[i8];
       objArray[0] = Integer.valueOf(p1);
       objArray[1] = Integer.valueOf(p2);
       objArray[i7] = Long.valueOf(p3);
       objArray[i6] = Long.valueOf(p4);
       objArray[i5] = Boolean.valueOf(p7);
       objArray[i4] = Long.valueOf(p8);
       objArray[i3] = Integer.valueOf(p9);
       objArray[i2] = Integer.valueOf(p10);
       long l1 = (p4 - l) + 1;
       objArray[i1] = Long.valueOf((uploadMode.uploadInfo.totalSegmentSize + l1));
       objArray[9] = oobject;
       KSUploader.postLog(kSUploaderLo, String.format("startUploadFragment fragIndex %d, duration %d, startPos %d, endPos %d, isWholeFile %b, refragOriginSize %d, gopFragNum %d, gopFragIndex %d, currSize %d, filePath %s", objArray));
       KSUploader mLock = uploadMode.mLock;
       _monitor_enter(mLock);
       i5 = -1;
       if (uploadMode.mIsStarted == null) {
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UninitializedUpload, 0, 0, uploadMode.uploadInfo.fileID, "startUploadFragment: called but !mIsStarted");
          _monitor_exit(mLock);
          return i5;
       }else {
          kSPipelineUp = uploadMode.mUploadMode;
          if (kSPipelineUp == KSPipelineUploader$UploadMode.UploadMode_Init) {
             obj = (p7)? KSPipelineUploader$UploadMode.UploadMode_Whole: KSPipelineUploader$UploadMode.UploadMode_Fragment;
             uploadMode.mUploadMode = obj;
          }else if(!p7 || (kSPipelineUp != KSPipelineUploader$UploadMode.UploadMode_Whole || (!p7 && kSPipelineUp != KSPipelineUploader$UploadMode.UploadMode_Fragment))){
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, 0, uploadMode.uploadInfo.fileID, "startUploadFragment: uploadMode mismatch, "+uploadMode.mUploadMode);
             _monitor_exit(mLock);
             return i5;
          }
          long l2 = 0;
          if (p7) {
             uploadInfo = uploadMode.uploadInfo;
             uploadInfo.duration = l2;
             uploadInfo.filePath = oobject;
             _monitor_exit(mLock);
             return this.fragmentAndUpload();
          }else if(!p1 && !b){
             kSPipelineUp = uploadMode.mCurrentIndex;
             uploadMode.mCurrentIndex = kSPipelineUp + 1;
             kSPipelineUp1 = kSPipelineUp;
          }else {
             kSPipelineUp1 = p1;
          }
          uploadMode.mFragUniqueId = uploadMode.mFragUniqueId + 1;
          if (b) {
             uploadMode.uploadInfo.isStreaming = b;
          }
          if (uploadMode.mRickonConfig.disableResumeCrcCheck == null) {
             fileCRC32 = (p6 - l2 <= 0)? KSUploaderUtils.getFileCRC32(oobject, l, l1): p6;
             if ((long)kSPipelineUp1 - uploadMode.uploadInfo.startIndex < 0 && (!uploadMode.mFragmentCrcs.containsKey(Integer.valueOf(kSPipelineUp1)) || uploadMode.mFragmentCrcs.get(Integer.valueOf(kSPipelineUp1)).longValue() - fileCRC32)) {
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "Resume upload failed due to crc mismatch, reset startIndex "+uploadMode.uploadInfo.startIndex+" to 0");
                uploadMode.uploadInfo.startIndex = 0;
             }
             l = fileCRC32;
          }else {
             i9 = p6;
          }
          if (uploadMode.mCachedFragmentInfo.containsKey(Integer.valueOf(kSPipelineUp1))) {
             KSUploader$FragmentInfo uFragmentInf = uploadMode.mCachedFragmentInfo.get(Integer.valueOf(kSPipelineUp1));
             KSUploader uploadInfo1 = uploadMode.uploadInfo;
             p6 = l;
             uploadInfo1.overwrittenSize = uploadInfo1.overwrittenSize + uFragmentInf.size;
             uploadInfo1.startIndex = 0;
             uploadMode.markFragCanceled(uFragmentInf.fragUniqueId);
             uploadInfo = uploadMode.uploadInfo;
             KSUploader.postLog(kSUploaderLo, "Fragment seq: "+kSPipelineUp1+"\("+uFragmentInf.fragUniqueId+"\) was uploaded before with size "+uFragmentInf.size+", curr size "+l1+", curr total "+((uploadInfo.totalSegmentSize + l1) - uploadInfo.overwrittenSize));
             i9 = 0;
          }else {
             p6 = l;
             i9 = p2;
          }
          uploadMode.mCachedFragmentInfo.put(Integer.valueOf(kSPipelineUp1), new KSUploader$FragmentInfo(kSPipelineUp1, uploadMode.mFragUniqueId, l1));
          KSUploaderLogLevel kSUploaderLo1 = kSUploaderLo;
          KSPipelineUploader kSPipelineUp2 = kSPipelineUp1;
          if (!this.canSkipFragment(kSPipelineUp1, uploadMode.uploadInfo.startIndex, p8, p9, p10)) {
             KSUploader.postLog(kSUploaderLo1, "Uploaded fragment seq: "+kSPipelineUp2+"\("+uploadMode.mFragUniqueId+"\), size: "+l1);
             fileCRC32 = p6;
             if (fileCRC32 <= 0) {
                fileCRC32 = KSUploaderUtils.getFileCRC32(oobject, p3, l1);
             }else {
                i2 = p3;
             }
             kSUploader = mLock;
             long l3 = l1;
             kSPipelineUp3 = kSPipelineUp2;
             int i10 = -1;
             if (i10 == this.startUploadFragmentInner(p0, kSPipelineUp2, i9, p3, p4, uploadMode.uploadInfo.totalSegmentSize, p5, fileCRC32, p11)) {
                this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_Failed, 0, 0, 0, "startUploadFragment: startUploadFragmentInner -1");
                _monitor_exit(kSUploader);
                return i10;
             }else {
                l4 = l3;
             }
          }else {
             kSUploader = mLock;
             kSPipelineUp3 = kSPipelineUp2;
             l4 = l1;
             KSUploader.postLog(kSUploaderLo1, "Skip uploaded fragment seq: "+kSPipelineUp3+"\("+uploadMode.mFragUniqueId+"\), size: "+l4);
             uploadInfo = uploadMode.uploadInfo;
             uploadInfo.skipedSize = uploadInfo.skipedSize + l4;
             uploadInfo.skipedDuration = uploadInfo.skipedDuration + (long)i9;
          }
          uploadInfo = uploadMode.uploadInfo;
          uploadInfo.fragNum = kSPipelineUp3 + 1;
          uploadInfo.totalSegmentSize = uploadInfo.totalSegmentSize + l4;
          _monitor_exit(kSUploader);
          return 0;
       }
    }
    public int updateStreamingUpload(long p0,int p1,boolean p2){
       KSUploaderLogLevel obj;
       KSUploader kSUploader = this;
       boolean b = p2;
       if (PatchProxy.isSupport(KSPipelineUploader.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, KSPipelineUploader.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       KSUploader.postLog(obj, "updateStreamingUpload currSize "+p0+", currDuration "+p1+", finished "+b);
       KSUploader mLock = kSUploader.mLock;
       _monitor_enter(mLock);
       if (!null - kSUploader.mNativeContext) {
          _monitor_exit(mLock);
          return -1;
       }else if(kSUploader.mIsStarted == null){
          KSUploader.postLog(obj, "updateStreamingUpload called when not started");
          KSUploaderCloseReason kSUploaderCl = KSUploaderCloseReason.KSUploaderCloseReason_UninitializedUpload;
          KSUploader uploadInfo = kSUploader.uploadInfo;
          String str = (uploadInfo == null)? "": uploadInfo.fileID;
          this.postUploadFailedAndRelease(kSUploaderCl, 0, null, str, "updateStreamingUpload called when not started");
          _monitor_exit(mLock);
          return -1;
       }else if(kSUploader.mUploadMode != KSPipelineUploader$UploadMode.UploadMode_Streaming){
          KSUploader.postLog(obj, "updateStreamingUpload called when mode not streaming");
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, null, kSUploader.uploadInfo.fileID, "updateStreamingUpload called when mode not streaming");
          _monitor_exit(mLock);
          return -1;
       }else if(b){
          if (kSUploader.mStreamingUploadFileFinished != null) {
             KSUploader.postLog(obj, "updateStreamingUpload finished occurred twice");
             this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, null, kSUploader.uploadInfo.fileID, "updateStreamingUpload finished occurred twice");
             _monitor_exit(mLock);
             return -1;
          }else {
             kSUploader.mStreamingUploadFileFinished = true;
          }
       }else if(kSUploader.mStreamingUploadFileFinished != null){
          KSUploader.postLog(obj, "updateStreamingUpload called after \'finished\' flag set");
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_UploadMode_Mismatch, 0, null, kSUploader.uploadInfo.fileID, "updateStreamingUpload called after \'finished\' flag set");
          _monitor_exit(mLock);
          return -1;
       }
       _monitor_exit(mLock);
       return this.updateStreamingUploadInner(p0, p1, p2);
    }
}
