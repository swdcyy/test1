package com.yxcorp.gifshow.postwork.PostWorkManager$c;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import com.yxcorp.gifshow.postwork.PostWorkManager;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import f0c.w0;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadInfo;
import iq.a;
import q87.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import java.lang.Math;
import com.yxcorp.gifshow.postwork.o;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import wkd.b;
import dnc.k1;
import com.yxcorp.gifshow.upload.r1;
import dnc.x0;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import oe6.e;

public class PostWorkManager$c implements a	// class@0010b5
{
    public float a;
    public float b;
    public boolean c;
    public final PostWorkInfo d;
    public final w0 e;
    public final PostWorkManager f;

    public void PostWorkManager$c(PostWorkManager p0,PostWorkInfo p1,w0 p2){
       this.f = p0;
       this.d = p1;
       this.e = p2;
       super();
       this.c = false;
    }
    public void a(float p0,IUploadInfo p1){
       Object[] objArray3;
       PostWorkManager$c uoc = PostWorkManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       UploadInfo uploadInfo = p1;
       PostWorkInfo postWorkInfo = this.f.j(uploadInfo.getId());
       if (postWorkInfo == null) {
          Object[] objArray = new Object[0];
          a.D().w("PostWorkManager", "onProgressChanged postWorkInfo is null", objArray);
          return;
       }else if(postWorkInfo.getUploadInfo() == null){
          i1.b("PostWorkManager", new RuntimeException("uploadInfo is null"));
          return;
       }else {
          String id = uploadInfo.getId();
          String id1 = postWorkInfo.getUploadInfo().getId();
          int id2 = this.d.getId();
          int id3 = postWorkInfo.getId();
          Object[] objArray1 = new Object[0];
          a.D().w("PostWorkManager", "onProgressChanged uploadInfo id="+id+" finalUploadId="+id1+" originPostWorkId="+id2+" finalPostWorkInfoId="+id3+" progress="+uploadInfo.getProgress()+" mLastProgress="+this.a+" mIsKeepFallbackProgress="+this.c+" final progress="+postWorkInfo.getProgress(), objArray1);
          if (id2 == id3 && id.equals(id1)) {
             postWorkInfo.setUploadInfo(uploadInfo);
             IUploadRequest$UploadPostType sCHOOL = IUploadRequest$UploadPostType.SCHOOL;
             float f = (uploadInfo.getUploadPostType() == sCHOOL)? p0: postWorkInfo.getProgress();
             if (postWorkInfo.mUploadInfo.isPipelineFailedThenFallback() && this.c == null) {
                this.a = f;
                this.c = true;
             }
             Object[] objArray2 = new Object[0];
             a.D().w("PostWorkManager", "onProgressChanged mLastProgress="+this.a+" curProgress="+f, objArray2);
             if (Math.abs((this.a - f)) - 0x3c23d70a < 0 && (Float.compare(p0, 0x3f800000) >= 0 || p1.getUploadPostType() == sCHOOL)) {
                if ((f - this.b) - 0x3dcccccd >= 0) {
                   this.f.j.a(postWorkInfo);
                   this.b = f;
                }
                this.a = f;
                objArray3 = new Object[0];
                a.D().w("PostWorkManager", "onProgressChanged final mLastProgress="+this.a, objArray3);
                this.f.k(this.a, postWorkInfo);
             }
          }else {
             objArray3 = new Object[0];
             a.D().w("PostWorkManager", "onProgressChanged not the same data: id: "+uploadInfo.getId()+", postWorkInfoId: "+postWorkInfo.getUploadInfo().getId(), objArray3);
          }
          return;
       }
    }
    public void b(IUploadInfo$Status p0,IUploadInfo p1){
       Object[] objArray1;
       Object[] objArray2;
       int id;
       PostWorkManager$c uoc = PostWorkManager$c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       boolean b = true;
       this.f.m = b;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostWorkManager", "Upload onStatusChanged status: "+p0.toString()+",uploadId: "+p1.getId()+",uploadMode: "+p1.getUploadMode(), objArray);
       PostWorkInfo postWorkInfo = this.f.j(p1.getId());
       if (postWorkInfo == null) {
          objArray1 = new Object[i];
          a.D().w("PostWorkManager", "onStatusChanged postWorkInfo is null", objArray1);
          return;
       }else if(postWorkInfo.getUploadInfo() == null){
          objArray1 = new Object[i];
          a.D().w("PostWorkManager", "onStatusChanged uploadInfo inside postWorkInfo is null", objArray1);
          return;
       }else if(this.d.getId() == postWorkInfo.getId() && (postWorkInfo.getUploadInfo().getId()).equalsIgnoreCase(p1.getId())){
          postWorkInfo.setUploadInfo(p1);
          if (this.d.getEncodeInfo() != null && (this.d.getEncodeInfo().getStatus() == EncodeInfo$Status.FAILED && postWorkInfo.getRecoverStatus())) {
             this.f.l(postWorkInfo, this.e);
             return;
          }else {
             b.a(0x6223c5ca).f(postWorkInfo, p1);
             IUploadInfo$Status fAILED = IUploadInfo$Status.FAILED;
             if (p0 == fAILED && postWorkInfo.getRecoverStatus()) {
                objArray1 = new Object[i];
                a.D().w("PostWorkManager", "finalPostWorkInfo is not recoverFromNormal direct notify ui", objArray1);
                this.f.l(postWorkInfo, this.e);
                return;
             }else {
                IUploadInfo$Status cANCELED = IUploadInfo$Status.CANCELED;
                if (p1.getStatus() == cANCELED) {
                   this.f.p(postWorkInfo);
                }
                if (!postWorkInfo.isPublished() && p1.isEnd()) {
                   objArray1 = new Object[i];
                   a.D().w("PostWorkManager", "onStatusChanged remove upload listener", objArray1);
                   this.f.b.o(this);
                   return;
                }else if(p0 == fAILED && (postWorkInfo.isPublished() && (p1.isNeedFallback() && (p1.mFallbackCount <= b && p1.getErrorCode() != 0xc384)))){
                   UploadInfo mFallbackCou = p1.mFallbackCount;
                   p1.mFallbackCount = mFallbackCou + 1;
                   objArray2 = new Object[i];
                   a.D().w("PostWorkManager", "onStatusChanged fallback, fallbackCount: "+mFallbackCou, objArray2);
                   PostWorkManager$c tf = this.f;
                   id = postWorkInfo.getId();
                   if (mFallbackCou != b) {
                      b = false;
                   }
                   tf.o1(id, b, i);
                   return;
                }else if(p0 == fAILED && postWorkInfo.isPublished()){
                   objArray = new Object[i];
                   a.D().w("PostWorkManager", "onStatusChanged cancelUploadIfNeeded", objArray);
                   this.f.h.i(p1.getId(), i);
                }
                this.f.l(postWorkInfo, this.e);
                IUploadInfo$Status cOMPLETE = IUploadInfo$Status.COMPLETE;
                if (p0 == cOMPLETE || p0 == cANCELED) {
                   if (!PatchProxy.applyVoidOneRefs(postWorkInfo, this, uoc, "2")) {
                      objArray2 = new Object[i];
                      a.D().w("PostWorkManager", "removePostWorkFromMap", objArray2);
                      this.f.b.o(this);
                      this.f.p(postWorkInfo);
                   }
                }else if(p0 == fAILED){
                   postWorkInfo.setFailedProgress(this.a);
                }
                if (p0 == cOMPLETE && p1.getUploadResult() != null) {
                   long snapShowDead = p1.getUploadResult().getSnapShowDeadline();
                   if (snapShowDead > 0 && !e.j()) {
                      e.a0(snapShowDead);
                   }
                }
             }
          }
       }else {
          Object[] objArray3 = new Object[i];
          a.D().w("PostWorkManager", "onStatusChanged not the same data: postWorkIfo upload id: "+postWorkInfo.getUploadInfo().getId()+", uploadInfoId: "+p1.getId(), objArray3);
       }
       return;
    }
}
