package com.yxcorp.gifshow.postwork.p;
import java.lang.Object;
import wkd.b;
import dnc.x0;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import z30.n0;
import com.kuaishou.edit.draft.Workspace;
import z30.o0;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import dnc.v0;
import dnc.k1;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasDetailPackage;
import java.lang.Integer;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PublishPhotoDetailPackage;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import qkd.b;
import enc.b0;
import java.lang.System;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import enc.a0;
import f0c.u;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import f0c.w;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.encode.EncodeException;
import com.yxcorp.gifshow.postwork.PublishNullThrowableException;
import iq.a;
import w46.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import f0c.v;
import k2b.e0;
import k2b.u1;

public class p	// class@0010d3
{
    public final x0 a;

    public void p(){
       super();
       this.a = b.a(-2001546430);
    }
    public final void a(ClientTaskDetail$TaskDetailPackage p0,PostEncodeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "2")) {
          return;
       }
       if (p0.uploadDetailPackage == null && p1 != null) {
          ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
          Workspace workspace = o0.a(p1.mIWorkspace);
          if (workspace != null) {
             uploadDetail.photoSource = workspace.getSource().name();
          }
          p0.uploadDetailPackage = uploadDetail;
       }
       return;
    }
    public final void b(ClientTaskDetail$TaskDetailPackage p0,UploadInfo p1){
       int i1;
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "13")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       int i = 1;
       if (!PatchProxy.applyVoidTwoRefs(uploadDetail, p1, this, op, "14")) {
          if (this.a.n(null, p1)) {
             if (PostExperimentUtils.h()) {
                uploadDetail.fileType = 5;
             }else {
                uploadDetail.fileType = 3;
             }
          }else if(p1.isSegmentedUpload()){
             i1 = 1;
          }else {
             i1 = 2;
          }
          uploadDetail.fileType = i1;
          if (!PatchProxy.applyVoidTwoRefs(uploadDetail, p1, this, op, "15")) {
             v0 pipelineStat = p1.getPipelineStatsParams();
             if (pipelineStat != null) {
                uploadDetail.pipelineStatistic = pipelineStat.a;
                uploadDetail.pipelineCloseReason = pipelineStat.b;
                uploadDetail.pipelineStatus = (int)pipelineStat.c;
             }
          }
       }
    label_005c :
       uploadDetail.pipelineFailedThenFallback = p1.isPipelineFailedThenFallback();
       uploadDetail.transcodeAndPublishVideoDuration = b.a(0x6223c5ca).d(p1);
       uploadDetail.userWaitingTime = b.a(0x6223c5ca).e(p1);
       uploadDetail.streamPauseTime = p1.mStreamPauseTime;
       Workspace workspace = o0.a(p1.getWorkSpace());
       uploadDetail.photoSource = (workspace != null)? workspace.getSource().name(): p1.getSource().name();
       if (p1.getAtlasInfo() == null && (p1.getKtvInfo() == null || (!p1.getKtvInfo().isSongMode() || p1.getKtvInfo().mCoverCount >= 2))) {
          i = 0;
       }
       long l = (i)? 0: (long)AdvEditUtil.i(p1.getFilePath());
       uploadDetail.videoDuration = l;
       uploadDetail.encodeConfigId = p1.getEncodeConfigId();
       uploadDetail.uploadMode = this.a.c(p1);
       p0.uploadDetailPackage = uploadDetail;
       return;
    }
    public final ClientContent$ContentPackage c(String p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       photoPackage.type = 1;
       if (p0 == null) {
          p0 = "";
       }
       photoPackage.identity = p0;
       obj.photoPackage = photoPackage;
       return obj;
    }
    public final ClientTaskDetail$TaskDetailPackage d(int p0,int p1,int p2,ClientTaskDetail$UploadAtlasDetailPackage p3,UploadInfo p4,PostEncodeInfo p5){
       ClientTaskDetail$TaskDetailPackage obj;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, op, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientTaskDetail$TaskDetailPackage();
       ClientTaskDetail$PublishPhotoDetailPackage publishPhoto = new ClientTaskDetail$PublishPhotoDetailPackage();
       publishPhoto.step = p2;
       publishPhoto.photoType = p1;
       if (p5 != null) {
          publishPhoto.isHdPhoto = p5.isHdExport();
       }
       obj.publishPhotoDetailPackage = publishPhoto;
       if (p3 != null) {
          obj.uploadAtlasDetailPackage = p3;
       }
       if (p0 == 600 && (p4 != null && (p4.getAtlasInfo() != null && p4.getAtlasInfo().mMixedType == 3))) {
          obj.publishPhotoDetailPackage = this.f();
       }
    label_006c :
       return obj;
    }
    public final ClientEvent$ElementPackage e(PostWorkInfo p0){
       String str;
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, this, p.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       boolean b = false;
       p0 = p0.mUploadTaskType;
       if (p0 == 1) {
          str = "manual";
       }else if(p0 == 2){
          str = "auto";
       }else {
          str = "";
       label_0026 :
          i3 oi3 = i3.f();
          oi3.a("is_retry", Boolean.valueOf(b));
          oi3.d("retry_type", str);
          obj.params = oi3.e();
          return obj;
       }
       b = true;
       goto label_0026 ;
    }
    public final ClientTaskDetail$PublishPhotoDetailPackage f(){
       ClientTaskDetail$PublishPhotoDetailPackage obj = PatchProxy.apply(null, this, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientTaskDetail$PublishPhotoDetailPackage();
       obj.photoType = 1;
       obj.step = 2;
       return obj;
    }
    public final int g(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 48;
       }
       if (p0.getAtlasInfo() != null) {
          AtlasInfo mMixedType = p0.getAtlasInfo().mMixedType;
          if (mMixedType == 1 || mMixedType == 2) {
             return 607;
          }else if(mMixedType == 3){
             return 600;
          }
       }
       if (p0.getKtvInfo() != null && p0.getKtvInfo().getKaraokeType() == 2) {
          return 612;
       }else {
          return 48;
       }
    }
    public final int h(PostWorkInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       UploadInfo uploadInfo = p0.getUploadInfo();
       if (uploadInfo == null) {
          return 0;
       }
       if (uploadInfo.getAtlasInfo() != null && (uploadInfo.getAtlasInfo().mMixedType != 1 && (uploadInfo.getAtlasInfo().mMixedType == 2 || (uploadInfo.getAtlasInfo().mMixedType == 3 && uploadInfo.getAtlasInfo().mMusicFilePath != null)))) {
          return 3;
       }
       if (uploadInfo instanceof RickonWholeUploadInfo) {
          return 6;
       }
       if (uploadInfo.getKtvInfo() != null) {
          int i = (uploadInfo.getKtvInfo().isSongMode())? 5: 4;
          return i;
       }else if(b.M(uploadInfo.getFilePath())){
          return 1;
       }else {
          return 2;
       }
    }
    public void i(PostWorkInfo p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "8")) {
          return;
       }
       PostEncodeInfo encodeInfo = p0.getEncodeInfo();
       UploadInfo uploadInfo = p0.getUploadInfo();
       int i = this.g(uploadInfo);
       int i1 = this.h(p0);
       ClientTaskDetail$UploadAtlasDetailPackage uploadAtlasD = b0.c(uploadInfo);
       String sessionId = (uploadInfo != null)? uploadInfo.getSessionId(): "";
       String str = sessionId;
       UploadInfo mUploadStart = (uploadInfo != null)? uploadInfo.mUploadStartTime: System.currentTimeMillis();
       h$b uob = h$b.d(9, i);
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       ClientTaskDetail$PublishPhotoDetailPackage publishPhoto = new ClientTaskDetail$PublishPhotoDetailPackage();
       publishPhoto.step = p1;
       publishPhoto.photoType = i1;
       taskDetailPa.publishPhotoDetailPackage = publishPhoto;
       if (uploadAtlasD != null) {
          taskDetailPa.uploadAtlasDetailPackage = uploadAtlasD;
       }
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       p1 = 3;
       resultPackag.domain = p1;
       resultPackag.timeCost = System.currentTimeMillis() - mUploadStart;
       if (i == 600 && (uploadInfo != null && (uploadInfo.getAtlasInfo() != null && uploadInfo.getAtlasInfo().mMixedType == p1))) {
          taskDetailPa.publishPhotoDetailPackage = this.f();
       }
    label_007f :
       if (PostExperimentUtils.A0()) {
          u ou = new u(this, taskDetailPa, uploadInfo, encodeInfo, uob, str, resultPackag, p0);
          a0.c.execute(i);
       }else {
          this.b(taskDetailPa, uploadInfo);
          this.a(taskDetailPa, encodeInfo);
          w ow = new w(this, uob, str, resultPackag, taskDetailPa, p0);
          a0.c.execute(i);
       }
       return;
    }
    public void j(PostWorkInfo p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, op, "7")) {
          return;
       }
       PostEncodeInfo encodeInfo = p0.getEncodeInfo();
       UploadInfo uploadInfo = p0.getUploadInfo();
       int i = this.g(uploadInfo);
       int i1 = this.h(p0);
       ClientTaskDetail$UploadAtlasDetailPackage uploadAtlasD = b0.c(uploadInfo);
       String sessionId = (uploadInfo != null)? uploadInfo.getSessionId(): "";
       String str = sessionId;
       UploadInfo mUploadStart = (uploadInfo != null)? uploadInfo.mUploadStartTime: System.currentTimeMillis();
       h$b uob = h$b.d(8, i);
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       ClientTaskDetail$PublishPhotoDetailPackage publishPhoto = new ClientTaskDetail$PublishPhotoDetailPackage();
       publishPhoto.step = p1;
       publishPhoto.photoType = i1;
       if (encodeInfo != null) {
          publishPhoto.isHdPhoto = encodeInfo.isHdExport();
       }
       taskDetailPa.publishPhotoDetailPackage = publishPhoto;
       if (uploadAtlasD != null) {
          taskDetailPa.uploadAtlasDetailPackage = uploadAtlasD;
       }
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       p1 = 3;
       resultPackag.domain = p1;
       resultPackag.timeCost = System.currentTimeMillis() - mUploadStart;
       Throwable throwable = null;
       if (encodeInfo != null) {
          throwable = encodeInfo.getThrowable();
       }
       if (throwable == null && uploadInfo != null) {
          throwable = uploadInfo.getThrowable();
       }
       int i2 = 0;
       if (throwable != null) {
          sessionId = throwable.getClass().getName()+":"+Log.f(throwable);
          if (throwable instanceof RetrofitException) {
             throwable = throwable.getCause();
          }else if(throwable instanceof KwaiException){
             sessionId = throwable.getErrorCode()+" "+sessionId;
          }
          resultPackag.message = sessionId;
          if (throwable instanceof EncodeException) {
             resultPackag.code = throwable.getErrorCode();
          }else if(throwable instanceof KwaiException){
             i2 = throwable.getErrorCode();
          }
          resultPackag.code = i2;
       }else {
          PublishNullThrowableException publishNullT = new PublishNullThrowableException();
          Object[] objArray = new Object[i2];
          a.D().u("PostWorkLogger", publishNullT, objArray);
          ExceptionHandler.handleCaughtException(publishNullT);
       }
       if (i == 600 && (uploadInfo != null && (uploadInfo.getAtlasInfo() != null && uploadInfo.getAtlasInfo().mMixedType == p1))) {
          taskDetailPa.publishPhotoDetailPackage = this.f();
       }
    label_0110 :
       this.b(taskDetailPa, uploadInfo);
       this.a(taskDetailPa, encodeInfo);
       v ov = new v(this, uob, str, resultPackag, taskDetailPa, p0);
       a0.c.execute(encodeInfo);
       return;
    }
    public void k(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       PostWorkInfo mEncodeInfo = p0.mEncodeInfo;
       PostWorkInfo mUploadInfo = p0.mUploadInfo;
       String sessionId = (mUploadInfo != null)? mUploadInfo.getSessionId(): "";
       h$b uob = h$b.d(1, this.g(p0.mUploadInfo));
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       ClientTaskDetail$PublishPhotoDetailPackage publishPhoto = new ClientTaskDetail$PublishPhotoDetailPackage();
       publishPhoto.photoType = this.h(p0);
       if (mEncodeInfo != null) {
          publishPhoto.isHdPhoto = mEncodeInfo.isHdExport();
       }
       taskDetailPa.publishPhotoDetailPackage = publishPhoto;
       this.a(taskDetailPa, mEncodeInfo);
       uob.r(sessionId);
       uob.s(taskDetailPa);
       uob.k(this.e(p0));
       u1.p0("", null, uob);
       return;
    }
}
