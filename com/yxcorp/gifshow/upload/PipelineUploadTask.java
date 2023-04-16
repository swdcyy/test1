package com.yxcorp.gifshow.upload.PipelineUploadTask;
import com.ks.ksapi.b;
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;
import com.yxcorp.gifshow.upload.PipelineUploadTask$UploadStatus;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.framework.abtest.f;
import java.util.ArrayList;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import com.ks.ksuploader.KSPipelineUploader;
import android.content.Context;
import lnc.a1;
import com.ks.ksuploader.KSFileUploader;
import com.ks.ksuploader.KSUploader$RickonConfig;
import jnc.c;
import com.ks.ksuploader.KSUploader;
import com.yxcorp.gifshow.upload.SegmentInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import java.util.List;
import java.lang.Long;
import com.kwai.sdk.switchconfig.a;
import ekd.k1;
import dnc.a1;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.upload.PipelineUploadTask$a;
import com.ks.ksuploader.KSUploaderEventListener;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;

public class PipelineUploadTask	// class@001e4a
{
    public KSUploader a;
    public Set b;
    public double c;
    public PipelineUploadTask$b d;
    public PipelineUploadTask$UploadStatus e;
    public String f;
    public boolean g;
    public final int h;
    public boolean i;
    public List j;
    public long k;

    public void PipelineUploadTask(b p0,String p1,int p2){
       super();
       this.b = new HashSet();
       this.e = PipelineUploadTask$UploadStatus.NOT_START;
       this.g = true;
       this.i = f.a("enableMainResumeAndr");
       this.j = new ArrayList();
       this.h = p2;
       this.f = p1;
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadTask", "rickonUploadMode: "+p2+", isSupportResumeUpload: "+this.i+", taskId: "+p1, objArray);
       this.a = (!p2)? new KSPipelineUploader(a1.c(), p0): new KSFileUploader(a1.c(), p0);
       this.a.setConfig(c.g());
       return;
    }
    public void a(SegmentInfo p0){
       Object[] objArray;
       long crc32;
       int i2;
       byte[] uobyteArray;
       long l2;
       boolean i5;
       int i6;
       boolean b4;
       long l3;
       byte[] uobyteArray1;
       int i7;
       int i8;
       long l4;
       boolean b = this;
       PipelineUploadTask obj = p0;
       PipelineUploadTask pipelineUplo = PipelineUploadTask.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, pipelineUplo, "5")) {
          return;
       }
       PipelineUploadTask e = b.e;
       int b1 = false;
       if (e == PipelineUploadTask$UploadStatus.FAIL || e == PipelineUploadTask$UploadStatus.CANCEL) {
          objArray = new Object[0];
          a.D().w("PipelineUploadTask", "addSegmentUpload ignore mUploadStatus="+b.e, objArray);
          return;
       }else {
          SegmentInfo mOutputPath = obj.mOutputPath;
          if (mOutputPath != null) {
             b.b.add(mOutputPath);
          }
          mOutputPath = obj.mAudioOutputPath;
          if (mOutputPath != null) {
             b.b.add(mOutputPath);
          }
          if (!PatchProxy.applyVoidOneRefs(obj, b, pipelineUplo, "6")) {
             b.g = (obj.mIsWholeFileUpload != null)? b1: true;
             SegmentInfo mEncodedSegm = obj.mEncodedSegmentInfo;
             SegmentInfo mOutputPath1 = obj.mOutputPath;
             int i = 0;
             long l = -1;
             if (mEncodedSegm != null) {
                long l1 = (long)mEncodedSegm.getStartByte();
                l = ((long)mEncodedSegm.getByteLength() + l1) - 1;
                byte[] metadataByte = mEncodedSegm.getMetadataBytes();
                crc32 = mEncodedSegm.getCrc32();
                boolean b2 = mEncodedSegm.isVideoSegment();
                int i1 = mEncodedSegm.fragId();
                i2 = mEncodedSegm.deletedFragSize();
                int i3 = mEncodedSegm.gopFragNum();
                int i4 = mEncodedSegm.gopFragIndex();
                boolean b3 = mEncodedSegm.fragEveryFrame();
                if (mEncodedSegm.isVideoSegment()) {
                   uobyteArray = metadataByte;
                   double d = mEncodedSegm.getSegmentDuration() * 0x408f400000000000;
                   if (b3 && i1 < b.j.size()) {
                      l2 = l1;
                      b.j.set(i1, Long.valueOf((long)d));
                   }else {
                      l2 = l1;
                      b.j.add(Long.valueOf((long)d));
                   }
                   i5 = (int)d;
                }else {
                   l2 = l1;
                   uobyteArray = metadataByte;
                   i5 = false;
                }
                i6 = i3;
                b1 = i4;
                b4 = b3;
                l3 = crc32;
                crc32 = l2;
                uobyteArray1 = uobyteArray;
                i7 = i5;
                i5 = b2;
                i8 = i1;
                l4 = l;
             }else {
                uobyteArray1 = i;
                crc32 = l;
                l4 = crc32;
                l3 = l4;
                i5 = false;
                i6 = 0;
                b1 = 0;
                b4 = false;
                i8 = 0;
                i7 = 0;
                i2 = 0;
             }
             Object[] objArray1 = new Object[0];
             a.D().w("PipelineUploadTask", "uploadSegment: rickonUploadMode="+b.h+" fragId="+i8+" start="+crc32+" endBytes="+l4+" duration="+i7+" isVideoSeg="+i5+" deletedFragSize="+i2+" gopFragNum="+i6+" gopFragIndex="+b1+" fragEveryFrame="+b4+" mHasUploadDurationArray="+b.j.size()+" outputPath="+mOutputPath1, objArray1);
             obj = b.a;
             if (obj == null) {
                objArray = new Object[0];
                a.D().w("PipelineUploadTask", "uploadSegment\(\) mKsUploader is null now", objArray);
             }else {
                obj.startUploadFragment(mOutputPath1, i8, i7, crc32, l4, uobyteArray1, l3, p0.mIsWholeFileUpload, (long)i2, i6, b1, b4);
             }
          }
          return;
       }
    }
    public void b(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, PipelineUploadTask.class, "8")) {
          return;
       }
       PipelineUploadTask te = this.e;
       if (te != PipelineUploadTask$UploadStatus.FAIL && te != PipelineUploadTask$UploadStatus.CANCEL) {
          String str = "PipelineUploadTask";
          int i = 0;
          if (this.h != null) {
             objArray = new Object[i];
             a.D().w(str, "allSegmentsFinish whole file upload mode, do nothing.", objArray);
             return;
          }else {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "allSegmentsFinish, rickonUploadMode: "+this.h, objArray1);
             te = this.a;
             if (te == null) {
                objArray = new Object[i];
                a.D().w(str, "allSegmentsFinish\(\) uploader is null now", objArray);
                return;
             }else {
                byte[] uobyteArray = new byte[i];
                te.finishFramgment(uobyteArray);
             }
          }
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PipelineUploadTask.class, "9")) {
          return;
       }
       if (this.a != null) {
          PipelineUploadTask te = this.e;
          PipelineUploadTask$UploadStatus cANCEL = PipelineUploadTask$UploadStatus.CANCEL;
          if (te == cANCEL || (te != PipelineUploadTask$UploadStatus.FAIL && te != PipelineUploadTask$UploadStatus.SUCCESS)) {
             boolean b = a.t().d("enablePipelineKsUploaderCancelOnAsync", true);
             boolean b1 = k1.g();
             Object[] objArray1 = new Object[0];
             a.D().w("PipelineUploadTask", "cancel, uploadStatus: "+this.e+", rickonUploadMode: "+this.h+"kSwitchEnableKsUploaderCancelOnAsync"+b+"isOnMainThread"+b1, objArray1);
             this.e = cANCEL;
             if (b1 && b) {
                Object[] objArray2 = new Object[0];
                a.D().w("PipelineUploadTask", "cancelIfNeeded on MainThread", objArray2);
                te = this.a;
                this.a = objArray;
                c.a(new a1(te));
             }else {
                this.a.cancel();
             }
          }
       }
       return;
    }
    public void d(long p0){
       PipelineUploadTask pipelineUplo = PipelineUploadTask.class;
       if (PatchProxy.isSupport(pipelineUplo) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, pipelineUplo, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PipelineUploadTask", "initUploadTask totalDuration: "+p0, objArray);
       this.k = p0;
       this.a.setEventListener(new PipelineUploadTask$a(this));
       if (this.h == null) {
          pipelineUplo = this.a;
          Object[] objArray1 = new Object[i];
          a.D().w("PipelineUploadTask", "initUploadTask\(\) onComplete\(\) mKsUploader="+pipelineUplo+" mTaskId="+this.f, objArray1);
          if (pipelineUplo == null) {
             return;
          }else {
             pipelineUplo.setupFragment(p0, this.f, this.i);
          }
       }
       return;
    }
    public void e(PipelineUploadTask$b p0){
       this.d = p0;
    }
}
