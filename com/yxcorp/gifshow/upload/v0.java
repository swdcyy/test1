package com.yxcorp.gifshow.upload.v0;
import erd.g;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zb6.a;
import java.util.Objects;
import java.lang.Long;
import java.lang.Float;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.utility.TextUtils;

public class v0 implements g	// class@001eb1
{
    public final long b;
    public final long c;
    public final long d;
    public final UploadInfo e;
    public final SegmentUploader f;

    public void v0(SegmentUploader p0,long p1,long p2,long p3,UploadInfo p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void accept(Object p0){
       v0 b;
       h$b uob;
       ClientTaskDetail$UploadDetailPackage uploadDetail;
       ClientEvent$ResultPackage resultPackag;
       ClientTaskDetail$TaskDetailPackage taskDetailPa;
       String str2;
       ClientTaskDetail$UploadDetailPackage uploadDetail1;
       ClientEvent$ResultPackage resultPackag1;
       ClientTaskDetail$TaskDetailPackage taskDetailPa1;
       h$b uob1;
       Object obj1;
       Object obj = this;
       Throwable throwable = p0;
       o1 oo1 = o1.class;
       if (PatchProxy.applyVoidOneRefs(throwable, obj, v0.class, "1")) {
       }else {
          String str = a.d(throwable);
          String str1 = a.c(throwable);
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          int i3 = 6;
          int i4 = 3;
          if (obj.f.j != null) {
             v0 f = obj.f;
             SegmentUploader e = f.e;
             b = obj.b;
             float f1 = f.m * (float)obj.c;
             v0 d = obj.d;
             v0 e1 = obj.e;
             Objects.requireNonNull(e);
             if (PatchProxy.isSupport(oo1)) {
                Object[] objArray = new Object[i3];
                objArray[i2] = str1;
                objArray[i1] = str;
                objArray[i] = Long.valueOf(b);
                objArray[i4] = Float.valueOf(f1);
                objArray[4] = Long.valueOf(d);
                objArray[5] = e1;
                if (!PatchProxy.applyVoid(objArray, e, oo1, "8")) {
                }
             }else {
             }
          }else {
             v0 f2 = obj.f;
             SegmentUploader e2 = f2.e;
             v0 b1 = obj.b;
             float f3 = f2.m * (float)obj.c;
             b = obj.d;
             v0 e3 = obj.e;
             Objects.requireNonNull(e2);
             if (PatchProxy.isSupport(oo1)) {
                Object[] objArray1 = new Object[]{str1,str,Long.valueOf(b1),Float.valueOf(f3),Long.valueOf(b),e3,throwable};
                if (!PatchProxy.applyVoid(objArray1, e2, oo1, "7")) {
                }
             }else {
             }
          }
       }
       return;
    }
}
