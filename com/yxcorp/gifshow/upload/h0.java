package com.yxcorp.gifshow.upload.h0;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qq.a;
import java.lang.StringBuilder;
import w46.b;
import java.lang.Integer;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingDeque;
import q87.c;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.upload.SegmentInfo;
import com.kwai.robust.PatchProxyResult;

public class h0	// class@001e7e
{
    public final ConcurrentMap a;
    public final ConcurrentMap b;

    public void h0(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("PipelineCache", "handleInvalidData: "+p0+"数据已经被清理,可能是任务被取消了", objArray);
       return;
    }
    public void b(int p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh0, "5")) {
          return;
       }
       if (this.b.get(Integer.valueOf(p0)) == null) {
          this.b.put(Integer.valueOf(p0), new LinkedBlockingDeque());
          Object[] objArray = new Object[0];
          a.D().w("PipelineCache", "PendingSegmentIndexMap initTaskIfNeeded postWorkInfoId: "+p0, objArray);
       }
       if (this.a.get(Integer.valueOf(p0)) == null) {
          this.a.put(Integer.valueOf(p0), new CopyOnWriteArrayList());
       }
       return;
    }
    public void c(int p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh0, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PipelineCache", "PendingSegmentIndexMap removeTask: postWorkInfoId: "+p0, objArray);
       this.b.remove(Integer.valueOf(p0));
       this.a.remove(Integer.valueOf(p0));
       return;
    }
    public SegmentInfo d(int p0){
       LinkedBlockingDeque obj;
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("PipelineCache", "takeTask postWorkInfoId: "+p0, objArray);
       _monitor_enter(this);
       obj = this.b.get(Integer.valueOf(p0));
       CopyOnWriteArrayList uCopyOnWrite = this.a.get(Integer.valueOf(p0));
       _monitor_exit(this);
       if (obj == null) {
          Object[] objArray1 = new Object[0];
          a.D().t("PipelineCache", "takeTask: pendingSegmentIndexDequeue is null", objArray1);
          return null;
       }else {
          Object[] objArray2 = new Object[0];
          a.D().w("PipelineCache", "takeTask: before queue, postWorkInfoId: "+p0, objArray2);
          int i = obj.takeFirst().intValue();
          SegmentInfo segmentInfo = uCopyOnWrite.get(i);
          Object[] objArray3 = new Object[0];
          a.D().w("PipelineCache", "takeTask: segmentInfo: "+segmentInfo.mSegmentGuard+", postWorkInfoId: "+p0+", index: "+i, objArray3);
          return segmentInfo;
       }
    }
}
