package com.yxcorp.gifshow.upload.i0;
import dnc.x0;
import java.lang.Object;
import com.yxcorp.gifshow.upload.h0;
import java.util.concurrent.ConcurrentHashMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.upload.SegmentGuard;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import tkd.b;
import tkd.d;
import b26.c;
import b26.d;
import oa0.a;
import um6.a;
import java.lang.Number;
import com.yxcorp.gifshow.upload.UploadException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import java.util.ArrayList;
import java.util.Collection;
import dnc.b1;
import java.util.List;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingDeque;
import dnc.w0;
import jnc.c;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.kwai.framework.abtest.f;
import dnc.y0;
import com.yxcorp.gifshow.upload.SegmentInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.upload.i0$a;
import f0c.t;

public final class i0 implements x0	// class@001e82
{
    public final h0 a;
    public final ConcurrentHashMap b;
    public final SparseArray c;
    public final SparseIntArray d;
    public final ExecutorService e;

    public void i0(){
       super();
       this.a = new h0();
       this.b = new ConcurrentHashMap();
       this.c = new SparseArray();
       this.d = new SparseIntArray();
       this.e = c.f("PipelineUploadManagerImpl");
    }
    public final void A(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadManagerImpl", "notifyCancel, postWorkInfoId: "+p0.getId(), objArray);
       this.x(null, null, -1, false, null, p0, SegmentGuard.CANCEL);
       return;
    }
    public final void B(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi0, "29")) {
          return;
       }
       if (a.t().d("publishRemoveTaskEnable", false)) {
          oi0 = this.c;
          if (oi0 != null) {
             oi0.remove(p0);
          }
       }
       return;
    }
    public final boolean C(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi0, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Boolean uBoolean = this.b.get(Integer.valueOf(p0));
       boolean b = (uBoolean != null)? uBoolean.booleanValue(): false;
       return b;
    }
    public void a(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi0, "9")) {
          return;
       }
       PostWorkInfo postWorkInfo = this.z().L0(p0);
       if (postWorkInfo != null && this.n(postWorkInfo.getEncodeInfo(), postWorkInfo.getUploadInfo())) {
          d.a(0x2e6e89ac).cancel(postWorkInfo.getEncodeInfo().getId());
          Object[] objArray = new Object[0];
          a.D().w("PipelineUploadManagerImpl", "cancel cancelEncodeIfNeeded", objArray);
          this.A(postWorkInfo);
          if (postWorkInfo.getUploadInfo() == null) {
             this.h(postWorkInfo);
          }
       }
       return;
    }
    public boolean b(PostEncodeInfo p0,UploadInfo p1){
       Object[] objArray;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.q()) {
          return b;
       }
       String str = 1;
       if (p0 != null) {
          if (p0.isTranscodeDegrade()) {
             objArray = new Object[b];
             a.D().w("PipelineUploadManagerImpl", "isSupportPipelineSegmentUpload return false, encodeInfo.isTranscodeDegrade!", objArray);
             return b;
          }else if(p0.isPipelineSupported() && (!p0.isKtvSinglePicSong() && (!p0.isSinglePicture() && (!p0.isAtlasEncode() && (p0.isTranscoded() && !p0.isNormalPhotoMovie()))))){
             EncodeInfo mKtvInfo = p0.mKtvInfo;
             if (mKtvInfo == null || mKtvInfo.getKaraokeType() == str) {
                b = true;
             }
          }
       label_0061 :
          return b;
       }else if(p1 != null){
          if (p1.isTranscodeDegrade()) {
             objArray = new Object[b];
             a.D().w("PipelineUploadManagerImpl", "isSupportPipelineSegmentUpload return false, uploadInfo.isTranscodeDegrade!", objArray);
             return b;
          }else if(p1.isPipelineSegmentUpload() && p1.isEnablePipelineUpload()){
             b = true;
          }
       }
       return b;
    }
    public int c(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.q(null, p0))? 2: 1;
       return i;
    }
    public void d(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadManagerImpl", "addWholeFileSegment, postWorkInfoId: "+p0.getId(), objArray);
       this.j(p0);
       String outputPath = (p0.getEncodeInfo() != null)? p0.getEncodeInfo().getOutputPath(): p0.getUploadInfo().getFilePath();
       this.u(outputPath, null, -1, true, p0, null);
       this.e(p0);
       return;
    }
    public void e(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadManagerImpl", "notifyEnd, postWorkInfoId: "+p0.getId(), objArray);
       this.x(null, null, -1, false, null, p0, SegmentGuard.END);
       return;
    }
    public boolean f(PostWorkInfo p0){
       i0 oi0 = i0.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, oi0, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.getUploadInfo() == null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, oi0, "6")) {
             UploadException uploadExcept = new UploadException("error: postWorkInfo.getUploadInfo\(\) == null, postWorkInfo = ["+p0+"]");
             a.D().e("PipelineUploadManagerImpl", "retry\(\) postWorkInfo.getUploadInfo\(\) == null", uploadExcept);
             ExceptionHandler.handleCaughtException(uploadExcept);
          }
          return b;
       }else {
          this.b.put(Integer.valueOf(p0.getId()), Boolean.FALSE);
          obj = new Object[b];
          a.D().w("PipelineUploadManagerImpl", "retry", obj);
          this.a.c(p0.getId());
          this.a.b(p0.getId());
          r1.f().p(p0.getUploadInfo().getId());
          return true;
       }
    }
    public boolean g(PostWorkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadManagerImpl", "retryKeepSegmentInfo "+p0.getId(), objArray);
       this.w(p0);
       this.b.put(Integer.valueOf(p0.getId()), Boolean.FALSE);
       this.a.b(p0.getId());
       r1.f().p(p0.getUploadInfo().getId());
       return true;
    }
    public void h(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "21")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PipelineUploadManagerImpl", "clearTaskIfNeeded: postWorkInfo id: "+p0.getId(), objArray);
       this.a.c(p0.getId());
       this.b.remove(Integer.valueOf(p0.getId()));
       PipelineUploadTask pipelineUplo = this.c.get(p0.getId());
       if (pipelineUplo != null) {
          if (!PatchProxy.applyVoid(null, pipelineUplo, PipelineUploadTask.class, "3")) {
             Object[] objArray2 = new Object[i];
             a.D().w("PipelineUploadTask", "deleteCacheFile, isNeeded? "+pipelineUplo.g, objArray2);
             if (pipelineUplo.g != null) {
                c.a(new b1(new ArrayList(pipelineUplo.b)));
             }
          }
          if (p0.getUploadInfo() != null && p0.getUploadInfo().getStatus() != IUploadInfo$Status.COMPLETE) {
             Object[] objArray1 = new Object[i];
             a.D().w("PipelineUploadManagerImpl", "clearTaskIfNeeded upload status: "+p0.getUploadInfo().getStatus(), objArray1);
             this.y(pipelineUplo);
          }
       }
    label_00c8 :
       this.c.remove(p0.getId());
       return;
    }
    public void i(String p0,boolean p1){
       Object[] objArray;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi0, "8")) {
          return;
       }
       PostWorkInfo postWorkInfo = this.z().c4(p0);
       if (postWorkInfo != null && this.n(postWorkInfo.getEncodeInfo(), postWorkInfo.getUploadInfo())) {
          int i = 0;
          if (p1) {
             r1.f().d(postWorkInfo.getUploadInfo().getId());
             if (!PatchProxy.applyVoidOneRefs(postWorkInfo, this, oi0, "10")) {
                objArray = new Object[i];
                a.D().w("PipelineUploadManagerImpl", "clearSegments", objArray);
                i0 ta = this.a;
                int id = postWorkInfo.getId();
                Objects.requireNonNull(ta);
                h0 oh0 = h0.class;
                if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(id), ta, oh0, "6")) {
                   LinkedBlockingDeque linkedBlocki = ta.b.get(Integer.valueOf(id));
                   if (linkedBlocki == null) {
                      ta.a("removeRemainTask");
                   }else {
                      Object[] objArray1 = new Object[i];
                      a.D().w("PipelineCache", "removeRemainTask", objArray1);
                      linkedBlocki.clear();
                   }
                }
             }
          }
          objArray = new Object[i];
          a.D().w("PipelineUploadManagerImpl", "cancel cancelUploadIfNeeded", objArray);
          this.A(postWorkInfo);
          PipelineUploadTask pipelineUplo = this.c.get(postWorkInfo.getId());
          if (pipelineUplo != null) {
             this.y(pipelineUplo);
             this.B(postWorkInfo.getId());
          }
       }
    label_00bf :
       return;
    }
    public void j(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "20")) {
          return;
       }
       if (p0 != null && this.n(p0.getEncodeInfo(), p0.getUploadInfo())) {
          this.a.b(p0.getId());
       }
       return;
    }
    public float k(PostWorkInfo p0){
       Object obj1;
       double d1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i0 oi0 = i0.class;
       a obj = PatchProxy.applyOneRefs(p0, this, oi0, "19");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       if (p0 == null) {
          return 0;
       }
       int id = p0.getId();
       _monitor_enter(this);
       if (PatchProxy.isSupport(oi0)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(id), this, oi0, "18");
          if (obj1 != patchProxyRe) {
          label_003a :
             _monitor_exit(this);
             obj = null;
             double d = 0x3fdfae1480000000;
             int i = 0;
             if (obj1 != null) {
                Object[] objArray = new Object[i];
                a.D().w("PUMProgress", "getProgress pipelineUploadTask is not null", objArray);
                d1 = obj1.c * d;
             }
             PostEncodeInfo encodeInfo = p0.getEncodeInfo();
             if (encodeInfo != null) {
                d = (double)(encodeInfo.getProgress() * 0x3efd70a4);
             }
             float f = (float)(d + d1);
             float f1 = 0x3f7d70a4;
             if (f - f1 > 0) {
                f = 0x3f7d70a4;
             }
             Object[] objArray1 = new Object[i];
             a.D().w("PUMProgress", "getProgress: encode progress: "+d+" upload progress: "+d1+" total progress: "+f, objArray1);
             if (f - f1 <= 0) {
                f1 = f;
             }
             return f1;
          }
       }
       obj1 = this.c.get(id);
       goto label_003a ;
    }
    public x0 l(){
       return this;
    }
    public void m(int p0){
       w0.d(this, p0);
    }
    public boolean n(EncodeInfo p0,UploadInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.h(p0, p1);
    }
    public void o(int p0){
       w0.e(this, p0);
    }
    public void p(int p0){
       w0.b(this, p0);
    }
    public boolean q(EncodeInfo p0,UploadInfo p1){
       QCurrentUser obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me();
       if (p0.F(a.a().a())) {
          if (obj.isWifiPreloadDeny()) {
             return false;
          }
       }else if(!f.a("enablePrePipelineUpload4G")){
          return false;
       }
       return this.n(p0, p1);
    }
    public void r(int p0){
       w0.c(this, p0);
    }
    public void s(int p0,int p1){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi0, "23")) {
          return;
       }
       this.d.put(p0, p1);
       return;
    }
    public void t(int p0){
       w0.a(this, p0);
    }
    public void u(String p0,String p1,int p2,boolean p3,PostWorkInfo p4,EncodedSegmentInfo p5){
       i0 oi0 = i0.class;
       int i = 0;
       if (PatchProxy.isSupport(oi0)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, oi0, "15")) {
             return;
          }
       }
       if (p4 == null) {
          Object[] objArray1 = new Object[i];
          a.D().w("PipelineUploadManagerImpl", "addSegment skip", objArray1);
          return;
       }else {
          this.x(p0, p1, p2, p3, p5, p4, SegmentGuard.NORMAL);
          return;
       }
    }
    public void v(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi0, "25")) {
          return;
       }
       this.d.get(p0, -1);
       return;
    }
    public void w(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineUploadManagerImpl", "reloadData, postWorkInfo: "+p0.getId(), objArray);
       this.a.b(p0.getId());
       this.b.put(Integer.valueOf(p0.getId()), Boolean.FALSE);
       this.e.execute(new y0(this, p0));
       return;
    }
    public final void x(String p0,String p1,int p2,boolean p3,EncodedSegmentInfo p4,PostWorkInfo p5,SegmentGuard p6){
       Object[] objArray;
       i0 a;
       i0 oi0 = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       i0 oi01 = i0.class;
       if (PatchProxy.isSupport(oi01)) {
          objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,p5,oobject2};
          if (PatchProxy.applyVoid(objArray, this, oi01, "16")) {
             return;
          }
       }
       String str = "PipelineUploadManagerImpl";
       int id = p5.getId();
       boolean b = p3;
       Object[] objArray1 = new Object[0];
       a.D().w(str, "addSegmentInfo\(\) called with: videoOutput = ["+p0+"], audioOutput = ["+p1+"], fd = ["+p2+"], isWholeFileUpload = ["+b+" postWorkInfo = ["+id+"], segmentGuard = ["+oobject2+"]", objArray1);
       SegmentInfo segmentInfo = new SegmentInfo(p0, p1, p2, p4, p6, b);
       SegmentGuard cANCEL = SegmentGuard.CANCEL;
       if (oobject2 == cANCEL) {
          oi0.b.put(Integer.valueOf(id), Boolean.TRUE);
          objArray = new Object[0];
          a.D().w(str, "addSegmentInfo set postWorkInfo="+id+" running", objArray);
       }
       a = oi0.a;
       Objects.requireNonNull(a);
       h0 oh0 = h0.class;
       if (!PatchProxy.isSupport(oh0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(id), v12, a, oh0, "1")) {
          Object[] objArray2 = new Object[0];
          a.D().w("PipelineCache", "addTask: postWorkInfoId: "+id, objArray2);
          CopyOnWriteArrayList uCopyOnWrite = a.a.get(Integer.valueOf(id));
          if (uCopyOnWrite == null) {
             Object[] objArray3 = new Object[0];
             a.D().A("PipelineCache", "PipelineCacheSegmentsMap addTask: "+id+" pendingUploadList is null", objArray3);
          }else {
             LinkedBlockingDeque linkedBlocki = a.b.get(Integer.valueOf(id));
             if (linkedBlocki == null) {
                Object[] objArray4 = new Object[0];
                a.D().w("PipelineCache", "addTask indexQueue is null invalid state", objArray4);
             }else {
                SegmentInfo mSegmentGuar = v12.mSegmentGuard;
                if (mSegmentGuar == SegmentGuard.END || mSegmentGuar == cANCEL) {
                   objArray = new Object[0];
                   a.D().w("PipelineCache", "addTask: end or cancel", objArray);
                   Iterator iterator = uCopyOnWrite.iterator();
                   ArrayList uArrayList = new ArrayList();
                   while (iterator.hasNext()) {
                      SegmentInfo segmentInfo1 = iterator.next();
                      if (segmentInfo1.mSegmentGuard == v12.mSegmentGuard) {
                         Object[] objArray5 = new Object[0];
                         a.D().w("PipelineCache", "addTask: remove same segment", objArray5);
                         uArrayList.add(segmentInfo1);
                      }
                   }
                   uCopyOnWrite.removeAll(uArrayList);
                }
                uCopyOnWrite.add(v12);
                int i = uCopyOnWrite.size() - 1;
                objArray2 = new Object[0];
                a.D().w("PipelineCache", "addTask, index: "+i+", postWorkId: "+id+",queue size: "+linkedBlocki.size()+", guard: "+v12.mSegmentGuard, objArray2);
                SegmentInfo mEncodedSegm = v12.mEncodedSegmentInfo;
                if (mEncodedSegm != null) {
                   objArray = new Object[0];
                   a.D().w("PipelineCache", "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ addTask byteRange: start: "+mEncodedSegm.getStartByte()+", end: "+(v12.mEncodedSegmentInfo.getStartByte() + v12.mEncodedSegmentInfo.getByteLength()), objArray);
                }
                linkedBlocki.offer(Integer.valueOf(i));
             }
          }
       }
       return;
    }
    public final void y(PipelineUploadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "22")) {
          return;
       }
       c.a(new i0$a(this, p0));
       return;
    }
    public final a z(){
       Object obj = PatchProxy.apply(null, this, i0.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-273232199).a20();
    }
}
