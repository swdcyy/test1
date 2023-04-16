package com.yxcorp.gifshow.upload.n1;
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
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import k2b.u1;

public class n1 implements g	// class@001e92
{
    public final long b;
    public final long c;
    public final UploadInfo d;
    public final int e;
    public final SegmentUploader f;

    public void n1(SegmentUploader p0,long p1,long p2,UploadInfo p3,int p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n1.class, "1")) {
       }else {
          String str = p0.n().request().url().host();
          p0 = p0.o(p0.n().request().url().url().toString());
          SegmentUploader e = this.f.e;
          n1 tb = this.b;
          n1 tc = this.c;
          n1 td = this.d;
          Objects.requireNonNull(e);
          o1 oo1 = o1.class;
          if (PatchProxy.isSupport(oo1)) {
             Object[] objArray = new Object[]{p0,str,Long.valueOf(tb),Long.valueOf(tc),td};
             if (PatchProxy.applyVoid(objArray, e, oo1, "9")) {
             label_00b9 :
                p0[this.e] = 1;
             }
          }
          h$b uob = h$b.d(7, 602);
          ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
          uploadDetail.encodeConfigId = td.getEncodeConfigId();
          uploadDetail.fileLength = tb;
          uploadDetail.host = str;
          uploadDetail.ip = p0;
          uploadDetail.segmentUploadEnabled = td.mSegmentUploadEnabled;
          uploadDetail.segmentUploadFirst = td.mSegmentUploadFirst;
          uploadDetail.segmentUploadTryCount = td.mSegmentUploadTryCount;
          uploadDetail.wholeUploadTryCount = td.mWholeUploadTryCount;
          p0 = new ClientEvent$ResultPackage();
          p0.timeCost = System.currentTimeMillis() - tc;
          ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
          taskDetailPa.uploadDetailPackage = uploadDetail;
          uob.r(td.getSessionId());
          uob.s(taskDetailPa);
          uob.q(p0);
          u1.r0(uob);
          goto label_00b9 ;
       }
       return;
    }
}
