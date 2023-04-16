package dnc.d1;
import io.reactivex.g;
import com.yxcorp.gifshow.upload.o0;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import com.yxcorp.gifshow.upload.i0;
import com.yxcorp.gifshow.upload.PipelineUploadTask;
import com.yxcorp.gifshow.upload.m0;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.ks.ksapi.b;
import java.lang.String;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import qq.a;
import java.lang.StringBuilder;
import w46.b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import brd.g;
import dnc.x0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import q87.c;
import android.util.SparseArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.upload.n0;
import com.yxcorp.gifshow.upload.PipelineUploadTask$b;
import java.lang.Thread;
import java.lang.ThreadGroup;
import com.yxcorp.gifshow.upload.SegmentInfo;
import com.yxcorp.gifshow.upload.h0;
import com.yxcorp.gifshow.upload.SegmentGuard;
import com.yxcorp.gifshow.upload.PipelineUploadTask$UploadStatus;
import com.yxcorp.gifshow.util.PostUtils;

public final class d1 implements g	// class@002293
{
    public final o0 b;

    public void d1(o0 p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       Object[] objArray;
       long l;
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray5;
       long l2;
       d1 tb = this.b;
       Objects.requireNonNull(tb);
       i0 oi0 = i0.class;
       tb.d = new PipelineUploadTask(new m0(tb), tb.f.mResumeKey, 0);
       PostWorkInfo postWorkInfo = tb.b().c4(tb.f.getId());
       String str = "PipelineUploader";
       if (postWorkInfo == null) {
          objArray = new Object[0];
          a.D().t(str, "startPipelineUpload: uploadId: "+tb.f.getId(), objArray);
          RuntimeException runtimeExcep = new RuntimeException("postWorkInfo is null");
          if (!p0.isDisposed()) {
             p0.onError(runtimeExcep);
          }
       }else {
          i0 oi01 = tb.a.l();
          int id = postWorkInfo.getId();
          o0 d = tb.d;
          Objects.requireNonNull(oi01);
          if (!PatchProxy.isSupport(oi0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(id), d, oi01, oi0, "17")) {
             Object[] objArray7 = new Object[0];
             a.D().w("PipelineUploadManagerImpl", "putPipelineUploaderTask: postWorkInfoId: "+id, objArray7);
             oi01.c.put(id, d);
          }
          SegmentInfo obj = PatchProxy.applyOneRefs(postWorkInfo, tb, o0.class, "9");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else {
             PostEncodeInfo postEncodeIn = null;
             if (postWorkInfo.getEncodeInfo() != null && postWorkInfo.getEncodeInfo().mVideoEncodeSDKInfo != null) {
                postEncodeIn = postWorkInfo.getEncodeInfo().mVideoEncodeSDKInfo.mProject;
                objArray5 = new Object[0];
                a.D().w(str, "videoEditorProject of encodeInfo", objArray5);
             }else if(postWorkInfo.getUploadInfo() != null){
                postEncodeIn = EditorSdk2UtilsV2.createProjectWithFile(postWorkInfo.getUploadInfo().getFilePath());
                objArray5 = new Object[0];
                a.D().w(str, "videoEditorProject of uploadInfo", objArray5);
             }
             objArray1 = null;
             long l1 = (postEncodeIn != null)? (long)(EditorSdk2UtilsV2.getDisplayDuration(postEncodeIn) * 0x408f400000000000): objArray1;
             if (!l1 - objArray1) {
                objArray1 = new Object[0];
                a.D().w(str, "computeDuration: use virtualLength", objArray1);
                l2 = 0x2710;
             }else {
                l2 = l1;
             }
             Object[] objArray6 = new Object[0];
             a.D().w(str, "duration: "+l2, objArray6);
             l = l2;
          }
          tb.d.e(new n0(tb, p0, postWorkInfo));
          tb.d.d(l);
          i0 oi02 = tb.a.l();
          o0 d1 = tb.d;
          int id1 = postWorkInfo.getId();
          Objects.requireNonNull(oi02);
          if (!PatchProxy.isSupport(oi0) || !PatchProxy.applyVoidTwoRefs(d1, Integer.valueOf(id1), oi02, oi0, "11")) {
             boolean b = oi02.C(id1);
             objArray1 = new Object[0];
             a.D().w("PipelineUploadManagerImpl", "consumeSegment thread : "+Thread.currentThread().getThreadGroup()+", id: "+Thread.currentThread().getId(), objArray1);
             try{
                while (!b) {
                   b = oi02.C(id1);
                   obj = oi02.a.d(id1);
                   if (obj != null) {
                      objArray2 = new Object[0];
                      a.D().w("PipelineUploadManagerImpl", "consumeSegment: postWorkInfoId: segmentInfo: status: "+obj.mSegmentGuard+", postworkInfoId: "+id1, objArray2);
                   }else {
                      objArray2 = new Object[0];
                      a.D().w("PipelineUploadManagerImpl", "consumeSegment postWorkInfoId: segmentInfo is null", objArray2);
                   }
                   if (obj != null) {
                      SegmentInfo mSegmentGuar = obj.mSegmentGuard;
                      if (mSegmentGuar != SegmentGuard.END) {
                         if (mSegmentGuar == SegmentGuard.CANCEL) {
                            Object[] objArray4 = new Object[0];
                            a.D().w("PipelineUploadManagerImpl", "consumeSegment cancle status", objArray4);
                            d1.c();
                            id1 = oi02.c.indexOfValue(d1);
                            if (id1 >= 0) {
                               oi02.B(oi02.c.keyAt(id1));
                               break ;
                            }else if(b){
                               objArray = new Object[0];
                               a.D().w("PipelineUploadManagerImpl", "cancelIfNeeded by consumeSegment unknow status", objArray);
                               d1.c();
                            }
                            Object[] objArray3 = new Object[0];
                            a.D().w("PipelineUploadManagerImpl", "consumeSegment end", objArray3);
                         }else {
                            d1.a(obj);
                            PipelineUploadTask e = d1.e;
                            oi01 = (e == PipelineUploadTask$UploadStatus.FAIL || e == PipelineUploadTask$UploadStatus.CANCEL)? 1: null;
                            if (oi01) {
                               objArray = new Object[0];
                               a.D().w("PipelineUploadManagerImpl", "consumeSegment\(\) is stop upload", objArray);
                               PostUtils.D("PipelineUploadManagerImpl", "retry fix ", new RuntimeException("not bug just for reporting"));
                               b = true;
                               goto label_023f ;
                            }
                         }
                      }
                   }
                   d1.b();
                   goto label_023f ;
                }
             }catch(java.lang.InterruptedException e15){
                a.D().e("PipelineUploadManagerImpl", "获取分片失败", e15);
                throw new RuntimeException("线程中断异常");
             }
          }
       }
       return;
    }
}
