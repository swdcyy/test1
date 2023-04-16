package com.yxcorp.gifshow.upload.k1;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.p0;
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

public class k1 implements g	// class@001e89
{
    public final UploadInfo b;
    public final SegmentUploader c;

    public void k1(SegmentUploader p0,UploadInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k1.class, "1")) {
       }else {
          String str = p0.n().request().url().host();
          String str1 = p0.o(p0.n().request().url().url().toString());
          SegmentUploader e = this.c.e;
          long l = p0.n().sentRequestAtMillis();
          p0 = this.b.mSessionId;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(o1.class) || !PatchProxy.applyVoidFourRefs(str1, str, Long.valueOf(l), p0, e, o1.class, "19")) {
             h$b uob = h$b.d(7, 604);
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
             uploadDetail.ip = str1;
             uploadDetail.host = str;
             resultPackag.timeCost = System.currentTimeMillis() - l;
             ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
             taskDetailPa.uploadDetailPackage = uploadDetail;
             uob.r(p0);
             uob.s(taskDetailPa);
             uob.q(resultPackag);
             u1.r0(uob);
          }
          p0 = new PostLogger().c("SegmentUploader");
          p0.k(this.b.getSessionId());
          p0.h(PostSubTaskEvent.UPLOAD_PUBLISH).i(this.b.getId()).j(PostLogger$Status.FINISH).g("segmentPublish").d();
       }
       return;
    }
}
