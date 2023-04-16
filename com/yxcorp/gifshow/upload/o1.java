package com.yxcorp.gifshow.upload.o1;
import java.lang.Object;
import wkd.b;
import dnc.x0;
import java.lang.Throwable;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Long;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PipelineKeyDetailPackage;
import java.lang.System;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadDetailPackage;
import k2b.u1;
import java.util.List;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo;
import com.kwai.feature.post.api.feature.upload.model.ServerInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import dnc.v0;
import z30.n0;
import com.kuaishou.edit.draft.Workspace;
import z30.o0;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import com.yxcorp.gifshow.util.AdvEditUtil;
import java.lang.Number;
import enc.b0;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import qkd.b;
import java.lang.Integer;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$RequestSegmentInfoDetailPackage;
import java.io.File;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasDetailPackage;
import dnc.g2;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;

public class o1	// class@001e95
{
    public final x0 a;

    public void o1(){
       super();
       this.a = b.a(-2001546430);
    }
    public static void c(Throwable p0,ClientEvent$ResultPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, o1.class, "29")) {
          return;
       }
       String str = Log.f(p0);
       if (TextUtils.x(str)) {
          str = (p0.getCause() != null)? p0.getCause().getMessage(): "";
       }
    label_0027 :
       str = p0.getClass().getName()+":"+str;
       p1.code = 0;
       if (p0 instanceof RetrofitException) {
          p0.getCause();
       }else if(p0 instanceof KwaiException){
          str = p0.getErrorCode()+" "+str;
          p1.code = p0.getErrorCode();
       }
       p1.message = TextUtils.k(str);
       return;
    }
    public static boolean e(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o1.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.getAtlasInfo() != null) {
          return true;
       }
       if (p0.getKtvInfo() != null && p0.getKtvInfo().getKaraokeType() == 2) {
          b = true;
       }
       return b;
    }
    public static void h(String p0,long p1,String p2,String p3,UploadInfo p4,Throwable p5){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oo1, "22")) {
             return;
          }
       }
       h$b uob = h$b.d(8, 614);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       ClientTaskDetail$PipelineKeyDetailPackage pipelineKeyD = new ClientTaskDetail$PipelineKeyDetailPackage();
       pipelineKeyD.ip = p3;
       pipelineKeyD.host = p2;
       resultPackag.timeCost = System.currentTimeMillis() - p1;
       o1.c(p5, resultPackag);
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.pipelineKeyDetailPackage = pipelineKeyD;
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.uploadMode = b.a(-2001546430).c(p4);
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p0);
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static void i(long p0,String p1,String p2,String p3,List p4,String p5,UploadInfo p6){
       o1 oo1 = o1.class;
       int i = 0;
       int i1 = 7;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[i1];
          objArray[i] = Long.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          if (PatchProxy.applyVoid(objArray, null, oo1, "21")) {
             return;
          }
       }
       h$b uob = h$b.d(i1, 614);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       ClientTaskDetail$PipelineKeyDetailPackage pipelineKeyD = new ClientTaskDetail$PipelineKeyDetailPackage();
       pipelineKeyD.ip = p2;
       pipelineKeyD.host = p1;
       pipelineKeyD.fileKey = p3;
       ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[] pipelineKeyD1 = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo[p4.size()];
       pipelineKeyD.serverInfo = pipelineKeyD1;
       for (; i < p4.size(); i = i + 1) {
          ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo pipelineKeyD2 = new ClientTaskDetail$PipelineKeyDetailPackage$ServerInfo();
          ServerInfo serverInfo = p4.get(i);
          ServerInfo mHost = serverInfo.mHost;
          String str = "";
          if (mHost == null) {
             mHost = str;
          }
          pipelineKeyD2.host = mHost;
          pipelineKeyD2.port = serverInfo.mPort;
          serverInfo = serverInfo.mProtocol;
          if (serverInfo != null) {
             str = serverInfo;
          }
          pipelineKeyD2.protocol = str;
          serverInfo[i] = pipelineKeyD2;
       }
       resultPackag.timeCost = System.currentTimeMillis() - p0;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.pipelineKeyDetailPackage = pipelineKeyD;
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       if (p6 != null) {
          uploadDetail.uploadMode = b.a(-2001546430).c(p6);
       }
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p5);
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public final void a(ClientTaskDetail$UploadDetailPackage p0,UploadInfo p1){
       int i;
       o1 oo1 = o1.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo1, "17")) {
          return;
       }
       if (this.a.n(null, p1)) {
          if (PostExperimentUtils.h()) {
             p0.fileType = 5;
          }else {
             p0.fileType = 3;
          }
       }else if(p1.mSegmentedUpload != null){
          i = 1;
       }else {
          i = 2;
       }
       p0.fileType = i;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, oo1, "16")) {
          v0 pipelineStat = p1.getPipelineStatsParams();
          if (pipelineStat != null) {
             p0.pipelineFailedThenFallback = p1.isPipelineFailedThenFallback();
             p0.pipelineStatistic = pipelineStat.a;
             p0.pipelineCloseReason = pipelineStat.b;
             p0.pipelineStatus = (int)pipelineStat.c;
          }
       }
       return;
    }
    public final ClientTaskDetail$UploadDetailPackage b(String p0,String p1,UploadInfo p2,long p3){
       ClientTaskDetail$UploadDetailPackage obj;
       if (PatchProxy.isSupport(o1.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(p3), this, o1.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientTaskDetail$UploadDetailPackage();
       obj.uploadMode = this.a.c(p2);
       obj.encodeConfigId = p2.getEncodeConfigId();
       obj.fileLength = p3;
       obj.host = p0;
       obj.ip = p1;
       Workspace workspace = o0.a(p2.getWorkSpace());
       obj.photoSource = (workspace != null)? workspace.getSource().name(): p2.getSource().name();
       obj.streamPauseTime = p2.mStreamPauseTime;
       this.a(obj, p2);
       obj.segmentUploadEnabled = p2.mSegmentUploadEnabled;
       obj.segmentUploadFirst = p2.mSegmentUploadFirst;
       obj.segmentUploadTryCount = p2.mSegmentUploadTryCount;
       obj.wholeUploadTryCount = p2.mWholeUploadTryCount;
       int i = 0;
       long l = (p2.getAtlasInfo() != null || (p2.getKtvInfo() != null && (p2.getKtvInfo().isSongMode() && p2.getKtvInfo().mCoverCount < 2)))? 1: 0;
       if (!l) {
          i = AdvEditUtil.i(p2.getFilePath());
       }
       obj.videoDuration = (long)i;
       return obj;
    }
    public final int d(UploadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (o1.e(p0)) {
          return b0.g(p0);
       }
       if (p0.getKtvInfo() != null) {
          if (p0.getKtvInfo().getKaraokeType() == 2) {
             return 612;
          }
          int i = (p0.getKtvInfo().getKaraokeType() == 1)? 611: 617;
          return i;
       }else if(p0.getUploadPostType() == IUploadRequest$UploadPostType.SCHOOL){
          return 619;
       }else if(b.M(p0.getFilePath())){
          return 600;
       }else {
          return 1;
       }
    }
    public final void f(long p0,long p1,long p2,String p3,String p4,Throwable p5,UploadInfo p6,int p7){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),p3,p4,p5,p6,Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, oo1, "3")) {
             return;
          }
       }
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       ClientTaskDetail$RequestSegmentInfoDetailPackage requestSegme = new ClientTaskDetail$RequestSegmentInfoDetailPackage();
       h$b uob = h$b.d(p7, 603);
       requestSegme.crcCost = p1;
       requestSegme.requestCost = System.currentTimeMillis() - p2;
       requestSegme.ip = p3;
       requestSegme.host = p4;
       requestSegme.encodeConfigId = p6.getEncodeConfigId();
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = System.currentTimeMillis() - p0;
       taskDetailPa.requestSegmentInfoDetailPackage = requestSegme;
       uob.r(p6.getSessionId());
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public final void g(UploadInfo p0,long p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(o1.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, o1.class, "25")) {
          return;
       }
       h$b uob = h$b.d(p2, 615);
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.encodeConfigId = p0.getEncodeConfigId();
       uploadDetail.fileLength = new File(p0.getFilePath()).length();
       uploadDetail.uploadMode = this.a.c(p0);
       this.a(uploadDetail, p0);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = System.currentTimeMillis() - p1;
       if (p3 != null) {
          o1.c(p3, resultPackag);
       }
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p0.getSessionId());
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void j(String p0,String p1,long p2,UploadInfo p3,Throwable p4){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oo1, "28")) {
             return;
          }
       }
       h$b uob = h$b.d(8, 616);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.ip = p1;
       uploadDetail.host = p0;
       uploadDetail.uploadMode = this.a.c(p3);
       resultPackag.timeCost = System.currentTimeMillis() - p2;
       o1.c(p4, resultPackag);
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p3.getSessionId());
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void k(String p0,String p1,long p2,String p3,int p4){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oo1, "27")) {
             return;
          }
       }
       h$b uob = h$b.d(7, 616);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.ip = p0;
       uploadDetail.host = p1;
       uploadDetail.uploadMode = p4;
       resultPackag.timeCost = System.currentTimeMillis() - p2;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p3);
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void l(String p0,String p1,long p2,UploadInfo p3){
       if (PatchProxy.isSupport(o1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, o1.class, "18")) {
          return;
       }
       int i = 3;
       if (o1.e(p3)) {
          if (!PatchProxy.isSupport(b0.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, null, b0.class, "14")) {
             h$b uob = h$b.d(9, b0.g(p3));
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.domain = i;
             resultPackag.timeCost = System.currentTimeMillis() - p2;
             ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
             taskDetailPa.uploadAtlasDetailPackage = b0.d(p0, p1, p3);
             uob.r(p3.getSessionId());
             uob.s(taskDetailPa);
             uob.q(resultPackag);
             u1.r0(uob);
          }
          return;
       }else {
          ClientEvent$ResultPackage resultPackag1 = new ClientEvent$ResultPackage();
          resultPackag1.domain = i;
          resultPackag1.timeCost = System.currentTimeMillis() - p2;
          g2 og2 = new g2(this, p3, p0, p1, new File(p3.getFilePath()).length(), resultPackag1);
          c.a(v0);
          return;
       }
    }
    public void m(String p0,String p1,long p2,UploadInfo p3,Throwable p4){
       o1 oo1 = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       o1 oo11 = o1.class;
       int i = 0;
       if (PatchProxy.isSupport(oo11)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, oo11, "13")) {
             return;
          }
       }
       if (o1.e(p3)) {
          return;
       }else {
          File uFile = null;
          if (!p3.isStory() && p3.getCoverFile() != null) {
             uFile = p3.getCoverFile().length();
          }
          String str = p4.getClass().getName()+":"+Log.f(p4);
          if (oobject3 instanceof RetrofitException) {
             oobject3 = p4.getCause();
          }else if(oobject3 instanceof KwaiException){
             str = oobject3.getErrorCode()+" "+str;
          }
          h$b uob = h$b.d(8, 605);
          ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
          uploadDetail.uploadMode = oo1.a.c(oobject2);
          uploadDetail.completedLength = (long)((float)uFile * p3.getProgress());
          uploadDetail.encodeConfigId = p3.getEncodeConfigId();
          uploadDetail.fileLength = uFile;
          uploadDetail.host = oobject;
          uploadDetail.fileType = 2;
          uploadDetail.ip = oobject1;
          uploadDetail.segmentUploadEnabled = oobject2.mSegmentUploadEnabled;
          uploadDetail.segmentUploadFirst = oobject2.mSegmentUploadFirst;
          uploadDetail.segmentUploadTryCount = oobject2.mSegmentUploadTryCount;
          uploadDetail.wholeUploadTryCount = oobject2.mWholeUploadTryCount;
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.domain = 3;
          resultPackag.timeCost = System.currentTimeMillis() - p2;
          resultPackag.message = TextUtils.k(str);
          if (oobject3 instanceof KwaiException) {
             i = oobject3.getErrorCode();
          }
          resultPackag.code = i;
          ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
          taskDetailPa.uploadDetailPackage = uploadDetail;
          uob.r(p3.getSessionId());
          uob.s(taskDetailPa);
          uob.q(resultPackag);
          u1.r0(uob);
          return;
       }
    }
    public void n(String p0,String p1,long p2,UploadInfo p3){
       if (PatchProxy.isSupport(o1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, o1.class, "12")) {
          return;
       }
       if (o1.e(p3)) {
          return;
       }
       File uFile = null;
       if (!p3.isStory() && p3.getCoverFile() != null) {
          uFile = p3.getCoverFile().length();
       }
       h$b uob = h$b.d(7, 605);
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.uploadMode = this.a.c(p3);
       uploadDetail.encodeConfigId = p3.getEncodeConfigId();
       uploadDetail.fileLength = uFile;
       uploadDetail.host = p0;
       uploadDetail.ip = p1;
       uploadDetail.fileType = 2;
       uploadDetail.segmentUploadEnabled = p3.mSegmentUploadEnabled;
       uploadDetail.segmentUploadFirst = p3.mSegmentUploadFirst;
       uploadDetail.segmentUploadTryCount = p3.mSegmentUploadTryCount;
       uploadDetail.wholeUploadTryCount = p3.mWholeUploadTryCount;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.domain = 3;
       resultPackag.timeCost = System.currentTimeMillis() - p2;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       photoPackage.type = 1;
       UploadInfo mUploadResul = p3.mUploadResult;
       String photoId = (mUploadResul != null)? mUploadResul.getPhotoId(): "";
       photoPackage.identity = photoId;
       uContentPack.photoPackage = photoPackage;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p3.getSessionId());
       uob.h(uContentPack);
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void o(long p0,UploadInfo p1){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, oo1, "26")) {
          return;
       }
       h$b uob = h$b.d(9, 615);
       ClientTaskDetail$UploadDetailPackage uploadDetail = new ClientTaskDetail$UploadDetailPackage();
       uploadDetail.encodeConfigId = p1.getEncodeConfigId();
       uploadDetail.fileLength = new File(p1.getFilePath()).length();
       uploadDetail.uploadMode = this.a.c(p1);
       this.a(uploadDetail, p1);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = System.currentTimeMillis() - p0;
       ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
       taskDetailPa.uploadDetailPackage = uploadDetail;
       uob.r(p1.getSessionId());
       uob.s(taskDetailPa);
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public void p(long p0,UploadInfo p1,Throwable p2){
       if (PatchProxy.isSupport(o1.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, o1.class, "24")) {
          return;
       }
       this.g(p1, p0, 8, p2);
       return;
    }
    public void q(long p0,UploadInfo p1){
       o1 oo1 = o1.class;
       if (PatchProxy.isSupport(oo1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, oo1, "23")) {
          return;
       }
       this.g(p1, p0, 7, null);
       return;
    }
}
