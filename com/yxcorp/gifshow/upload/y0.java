package com.yxcorp.gifshow.upload.y0;
import erd.g;
import com.yxcorp.gifshow.upload.g1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.SegmentUploader;
import java.util.Objects;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import q2b.h$b;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import k2b.u1;

public class y0 implements g	// class@001eba
{
    public final g1 b;

    public void y0(g1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          g1 d = p0.d;
          SegmentUploader e = d.e;
          SegmentUploader n = d.n;
          p0 = p0.b;
          SegmentUploader g = d.g;
          g1 c = this.b.c;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(o1.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(n), Integer.valueOf(p0), Integer.valueOf(g), c, e, o1.class, "5")) {
             ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
             ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
             taskDetailPa.uploadDetailPackage = uploadDetail;
             h$b uob = h$b.d(7, 601);
             uploadDetail.fileLength = (long)p0;
             uploadDetail.segments = g;
             uploadDetail.encodeConfigId = c.getEncodeConfigId();
             uploadDetail.segmentUploadEnabled = c.mSegmentUploadEnabled;
             uploadDetail.segmentUploadFirst = c.mSegmentUploadFirst;
             uploadDetail.segmentUploadTryCount = c.mSegmentUploadTryCount;
             uploadDetail.wholeUploadTryCount = c.mWholeUploadTryCount;
             p0 = new ClientEvent$ResultPackage();
             p0.timeCost = System.currentTimeMillis() - n;
             uob.r(c.getSessionId());
             uob.s(taskDetailPa);
             uob.q(p0);
             u1.r0(uob);
          }
       }
       return;
    }
}
