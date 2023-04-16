package com.yxcorp.gifshow.postwork.PostWorkManager$d;
import com.yxcorp.gifshow.postwork.a$a;
import com.yxcorp.gifshow.postwork.PostWorkManager;
import java.lang.Object;
import r26.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import java.util.Objects;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.Integer;
import dq.a;
import java.lang.Math;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.util.Set;
import com.yxcorp.gifshow.postwork.o;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import tkd.b;
import tkd.d;
import mv5.b;
import lnc.s6;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import f0c.w0;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.postwork.p;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasDetailPackage;
import enc.b0;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import enc.a0;
import f0c.y;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import com.yxcorp.gifshow.postwork.PostWorkManager$LoadPostCacheStatus;
import mrd.a;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.postwork.PostStatus;

public class PostWorkManager$d implements a$a	// class@0010b6
{
    public final PostWorkManager a;

    public void PostWorkManager$d(PostWorkManager p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       PostWorkManager f;
       PostWorkManager d;
       PostEncodeInfo encodeInfo;
       Object obj = this;
       EncodeManager obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, PostWorkManager$d.class, "3")) {
          return;
       }
       PostWorkManager$d a = obj.a;
       int i = obj1;
       Objects.requireNonNull(a);
       obj1 = EncodeManager.class;
       if (!PatchProxy.applyVoidOneRefs(i, a, PostWorkManager.class, "56")) {
          String str = "PostWorkManager";
          int i1 = 2;
          int i2 = 0;
          if (i.getEncodeInfo() != null && i.isPublished()) {
             EncodeManager a1 = a.a.a;
             Object[] objArray = new Object[i2];
             a.D().w(str, "recoverPostWorkInfoTask encodeInfo is not null, globalEncodeId: "+a1, objArray);
             int i3 = a1 + 1;
             i.getEncodeInfo().mId = i3;
             PostWorkManager a2 = a.a;
             Objects.requireNonNull(a2);
             if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), a2, obj1, "6")) {
                Object[] objArray3 = new Object[i2];
                a.D().w("EncodeManager", "updateGlobalId: "+i3, objArray3);
                a2.a = Math.max((i3 + 1), a2.a);
             }
             if (i.getUploadInfo() == null) {
                i3 = i.getEncodeInfo().getId();
                if (!a.a.e(i3)) {
                   a.b(i, i3);
                   a2 = a.a;
                   Objects.requireNonNull(a2);
                   if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), a2, obj1, "49")) {
                      a2.e.add(Integer.valueOf(i3));
                   }
                }
                f = a.f;
                a.f = f + 1;
                i.mId = f;
                a.m(i);
                i.setRecoverStatus(i1);
                a.j.a(i);
             }
          }
       label_00e6 :
          if (i.getUploadInfo() != null && (i.isPublished() && !i.isUploadForbidden())) {
             if (i.getRecoverStatus() != i1 && i.getUploadInfo().getStatus() != IUploadInfo$Status.FAILED) {
                Object[] objArray1 = new Object[i2];
                a.D().w(str, "recoverPostWorkInfoTask fail by upload crash", objArray1);
                i.setRecoverStatus(i1);
             }
             Object[] objArray2 = new Object[i2];
             a.D().w(str, "recoverUploadTask: postWorkInfoId: mId:"+a.f, objArray2);
             f = a.f;
             a.f = f + 1;
             i.mId = f;
             boolean b = d.a(0x3ee97dc2).ZW();
             if (!s6.n() || !b) {
                i.getUploadInfo().setMockFeedUploadTarget(b.c);
             }
             w0 ow0 = null;
             a.n(i, ow0);
             a.b.n(i.getUploadInfo());
             if (i.getRecoverStatus() == i1) {
                a.j.a(i);
             }
             d = a.d;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(i, d, p.class, "4")) {
                encodeInfo = i.getEncodeInfo();
                UploadInfo uploadInfo = i.getUploadInfo();
                int i4 = d.g(uploadInfo);
                int i5 = d.h(i);
                ClientTaskDetail$UploadAtlasDetailPackage uploadAtlasD = b0.c(uploadInfo);
                String sessionId = (uploadInfo != null)? uploadInfo.getSessionId(): "";
                ClientTaskDetail$TaskDetailPackage taskDetailPa = d.d(i4, i5, 2, uploadAtlasD, uploadInfo, encodeInfo);
                d.b(taskDetailPa, uploadInfo);
                d.a(taskDetailPa, encodeInfo);
                y oy = new y(d, uploadInfo, h$b.d(4, i4), sessionId, d.c(ow0), taskDetailPa, i);
                a0.c.execute(encodeInfo);
             }
          }
       }
    label_01c4 :
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager$d.class, "4")) {
          return;
       }
       this.a.o.onNext(PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager$d.class, "2")) {
          return;
       }
       Iterator iterator = this.a.c.entrySet().iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          if (iterator.next().getValue().getStatus() == PostStatus.UPLOAD_FAILED) {
             i1 = i1 + 1;
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("PostWorkManager", "onLoadCacheComplete mId: "+this.a.f+" failCount="+i1, objArray);
       this.a.o.onNext(PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "onLoadCacheStart", objArray);
       this.a.o.onNext(PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_LOADING);
       return;
    }
}
