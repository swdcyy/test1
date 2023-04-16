package com.yxcorp.gifshow.upload.x0;
import erd.g;
import com.yxcorp.gifshow.upload.g1;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.upload.SegmentUploader;
import java.util.Objects;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class x0 implements g	// class@001eb7
{
    public final g1 b;

    public void x0(g1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       SegmentUploader e;
       x0 b;
       h$b uob;
       ClientTaskDetail$UploadDetailPackage uploadDetail;
       ClientTaskDetail$TaskDetailPackage taskDetailPa;
       ClientEvent$ResultPackage resultPackag;
       ClientTaskDetail$UploadDetailPackage uploadDetail1;
       ClientTaskDetail$TaskDetailPackage taskDetailPa1;
       ClientEvent$ResultPackage resultPackag1;
       Object obj = this;
       g1 obj1 = p0;
       o1 oo1 = o1.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, x0.class, "1")) {
       }else {
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          int i3 = 6;
          if (obj.b.d.j != null) {
             obj1 = obj.b.d;
             e = obj1.e;
             SegmentUploader n = obj1.n;
             SegmentUploader h = obj1.h;
             SegmentUploader g = obj.b.d.g;
             b = obj.b;
             long l = (long)b.b;
             b = obj.b;
             float f = b.d.m * (float)b.b;
             g1 c = b.c;
             Objects.requireNonNull(e);
             if (PatchProxy.isSupport(oo1)) {
                Object[] objArray = new Object[i3];
                objArray[i2] = Long.valueOf(n);
                objArray[i1] = Integer.valueOf(h);
                objArray[i] = Integer.valueOf(g);
                objArray[3] = Long.valueOf(l);
                objArray[4] = Float.valueOf(f);
                objArray[5] = c;
                if (!PatchProxy.applyVoid(objArray, e, oo1, "4")) {
                }
             }else {
             }
          }else {
             g1 d = obj.b.d;
             SegmentUploader e1 = d.e;
             SegmentUploader n1 = d.n;
             e = d.h;
             SegmentUploader g1 = obj.b.d.g;
             x0 b1 = obj.b;
             long l1 = (long)b1.b;
             b = obj.b;
             float f1 = b1.d.m * (float)b.b;
             g1 c1 = b.c;
             Objects.requireNonNull(e1);
             if (PatchProxy.isSupport(oo1)) {
                Object[] objArray1 = new Object[]{Long.valueOf(n1),Integer.valueOf(e),Integer.valueOf(g1),Long.valueOf(l1),Float.valueOf(f1),c1,obj1};
                if (!PatchProxy.applyVoid(objArray1, e1, oo1, "6")) {
                }
             }else {
             }
          }
       }
       return;
    }
}
