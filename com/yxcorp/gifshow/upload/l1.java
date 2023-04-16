package com.yxcorp.gifshow.upload.l1;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zb6.a;
import java.util.Objects;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Long;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import k2b.u1;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;

public class l1 implements g	// class@001e8c
{
    public final long b;
    public final UploadInfo c;
    public final SegmentUploader d;

    public void l1(SegmentUploader p0,long p1,UploadInfo p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1.class, "1")) {
       }else {
          SegmentUploader e = this.d.e;
          String str = a.d(p0);
          String str1 = a.c(p0);
          l1 tb = this.b;
          l1 tc = this.c;
          Objects.requireNonNull(e);
          o1 oo1 = o1.class;
          if (PatchProxy.isSupport(oo1)) {
             Object[] objArray = new Object[]{str,str1,Long.valueOf(tb),tc,p0};
             if (PatchProxy.applyVoid(objArray, e, oo1, "20")) {
             label_007f :
                PostLogger postLogger = new PostLogger().b("SegmentUploader");
                postLogger.k(this.c.getSessionId());
                postLogger.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(this.c.getId()).j(PostLogger$Status.ERROR).g("segmentPublish error: ").l(p0).d();
             }
          }
          h$b uob = h$b.d(8, 604);
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
          uploadDetail.ip = str1;
          uploadDetail.host = str;
          resultPackag.timeCost = System.currentTimeMillis() - tb;
          o1.c(p0, resultPackag);
          ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
          taskDetailPa.uploadDetailPackage = uploadDetail;
          uob.r(tc.getSessionId());
          uob.s(taskDetailPa);
          uob.q(resultPackag);
          u1.r0(uob);
          goto label_007f ;
       }
       return;
    }
}
