package com.yxcorp.gifshow.upload.r1;
import java.lang.Object;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import qq.a;
import java.lang.StringBuilder;
import java.util.Set;
import q87.c;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager$a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import j80.f;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.io.File;
import dnc.u;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import dnc.v;
import erd.o;
import dnc.w;
import dnc.x;
import dnc.y;
import erd.g;
import crd.b;
import crd.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.r1$b;
import com.yxcorp.gifshow.upload.r1$a;
import java.util.Map;
import java.lang.Boolean;
import f36.b;
import java.util.concurrent.Executor;
import o56.c;
import o56.a;
import ekd.k1;
import java.util.concurrent.ExecutorService;
import t45.c;
import dnc.x0;
import wkd.b;
import com.yxcorp.gifshow.postwork.a;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.retrofit.service.KwaiSegmentUploadService;
import java.lang.Number;
import oa0.a;
import java.util.concurrent.ThreadPoolExecutor;
import dnc.w2;
import com.kwai.framework.model.router.RouteType;
import lrd.b;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import com.yxcorp.gifshow.retrofit.service.KwaiUploadPublishService;
import com.yxcorp.gifshow.upload.q1;
import java.lang.Runnable;
import dnc.l2;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import dnc.z;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import enc.w;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import qkd.b;
import com.yxcorp.gifshow.upload.y;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import com.yxcorp.gifshow.upload.v;
import com.yxcorp.gifshow.upload.x;
import com.yxcorp.gifshow.upload.g;
import u36.b;
import u36.b$a;
import ca9.a;
import ca9.b;
import fnc.e;
import com.yxcorp.gifshow.upload.o0;
import com.yxcorp.gifshow.upload.AggregatedUploader;
import com.yxcorp.gifshow.upload.SegmentUploader;
import jnc.c;
import kotlin.jvm.internal.a;
import jnc.g;
import io.reactivex.g;

public class r1	// class@001ea6
{
    public final o1 a;
    public final Set b;
    public final Map c;
    public final Map d;
    public Executor e;
    public KwaiSegmentUploadService f;
    public KwaiUploadPublishService g;
    public x0 h;
    public static r1 i;

    public void r1(){
       super();
       this.b = new HashSet();
       this.c = new LinkedHashMap();
       this.d = new HashMap();
       this.a = new o1();
    }
    public static r1 f(){
       r1 or1 = r1.class;
       Object obj = PatchProxy.apply(null, null, or1, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (r1.i == null) {
          _monitor_enter(or1);
          if (r1.i == null) {
             r1.i = new r1();
          }
          _monitor_exit(or1);
       }
       return r1.i;
    }
    public String a(IUploadRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       UploadInfo uploadInfo = UploadInfo.generateUploadInfo(p0);
       this.c(uploadInfo);
       return uploadInfo.getId();
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("UploadManager", "addListener, listeners size: "+this.b.size(), objArray);
       this.b.add(p0);
       return;
    }
    public final void c(UploadInfo p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "9")) {
          return;
       }
       ExtraInfoUploadManager uExtraInfoUp = ExtraInfoUploadManager.e.a();
       Objects.requireNonNull(uExtraInfoUp);
       r1$a uoa = null;
       if (!PatchProxy.applyVoidOneRefs(p0, uExtraInfoUp, ExtraInfoUploadManager.class, "3")) {
          int i = 0;
          String str = "ExtraInfoUploadManager";
          if (p0 == null || TextUtils.x(p0.mCustomizedMagicFilePath)) {
             objArray = new Object[i];
             a.D().w(str, "uploadCustomizedMagicZipFileIfNeed: not need upload: "+p0, objArray);
          }else {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
             objectRef1.element = uoa;
             UploadInfo mCustomizedM = p0.mCustomizedMagicFilePath;
             if (!f.e(mCustomizedM)) {
                PostUtils.D(str, "uploadCustomizedMagicZipFile file is not exist", new IllegalArgumentException("uploadCustomizedMagicZipFile: file is not exist:"+mCustomizedM));
             }else {
                File uFile = new File(mCustomizedM);
                objectRef.element = uFile;
                if (uExtraInfoUp.a.get(uFile.getName()) != null) {
                   objArray = new Object[i];
                   a.D().w(str, "uploadCustomizedMagicZipFile: has uploaded", objArray);
                }else {
                   objArray = new Object[i];
                   a.D().w(str, "uploadCustomizedMagicZipFileIfNeed: sourceFilePath: "+mCustomizedM, objArray);
                   uExtraInfoUp.c.c(t.fromCallable(new u(uExtraInfoUp, objectRef1, objectRef)).subscribeOn(d.c).flatMap(new v(uExtraInfoUp)).flatMap(new w(uExtraInfoUp, p0, objectRef, objectRef1)).subscribe(new x(uExtraInfoUp, objectRef, objectRef1, p0), new y(uExtraInfoUp, objectRef1, p0, objectRef)));
                }
             }
          }
       }
       p0.mStatus = IUploadInfo$Status.PENDING;
       p0.mProgress = 0;
       this.d.put(p0.getId(), new r1$b(this, p0, uoa));
       this.m(p0);
       return;
    }
    public boolean d(String p0){
       ExtraInfoUploadManager obj = PatchProxy.applyOneRefs(p0, this, r1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ExtraInfoUploadManager.e.a();
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(null, obj, ExtraInfoUploadManager.class, "6")) {
          obj.c.isDisposed();
          obj.c.dispose();
          obj.c = new a();
       }
       UploadInfo uploadInfo = this.c.remove(p0);
       if (uploadInfo != null && uploadInfo.getStatus() != IUploadInfo$Status.UPLOADING) {
          uploadInfo.mStatus = IUploadInfo$Status.CANCELED;
          this.m(uploadInfo);
          return true;
       }else {
          r1$b uob = this.d.get(p0);
          if (uob != null) {
             if (!PatchProxy.applyVoid(null, uob, r1$b.class, "9")) {
                uob.c = true;
                r1$b f = uob.f;
                if (f != null) {
                   f.cancel();
                }
                f = uob.g;
                if (f != null) {
                   f.dispose();
                }
                uob.d();
             }
             return true;
          }else {
             return false;
          }
       }
    }
    public final Executor e(){
       Object obj = PatchProxy.apply(null, this, r1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          k1.d();
       }
       if (this.e == null) {
          Object[] objArray = new Object[0];
          a.D().w("UploadManager", "init mExecutor", objArray);
          this.e = c.f("upload-manager");
       }
       return this.e;
    }
    public x0 g(){
       Object obj = PatchProxy.apply(null, this, r1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = b.a(-2001546430);
       }
       return this.h;
    }
    public final a h(){
       Object obj = PatchProxy.apply(null, this, r1.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-273232199).a20();
    }
    public KwaiSegmentUploadService i(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r1 or1 = r1.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, or1, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (a.a().c()) {
          k1.d();
       }
       if (this.f == null) {
          Object[] objArray1 = new Object[0];
          a.D().w("UploadManager", "init mSegmentUploadService", objArray1);
          Object obj1 = PatchProxy.apply(objArray, this, or1, "2");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(a.u0() <= 0){
             i = 4;
          }else {
             i = a.u0();
          }
          ExecutorService uExecutorSer = c.e("upload-thread", i);
          if (uExecutorSer instanceof ThreadPoolExecutor) {
             uExecutorSer.allowCoreThreadTimeOut(true);
          }
          this.f = e.b(new w2(RouteType.UPLOAD, b.b(uExecutorSer)), KwaiSegmentUploadService.class);
       }
       return this.f;
    }
    public UploadInfo j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.get(p0);
    }
    public KwaiUploadPublishService k(){
       ExecutorService obj = PatchProxy.apply(null, this, r1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          k1.d();
       }
       if (this.g == null) {
          Object[] objArray = new Object[0];
          a.D().w("UploadManager", "init mUploadPublishService", objArray);
          obj = c.e("upload-publish-thread", 2);
          if (obj instanceof ThreadPoolExecutor) {
             obj.allowCoreThreadTimeOut(true);
          }
          this.g = e.b(new w2(RouteType.UPLOAD, b.b(obj)), KwaiUploadPublishService.class);
       }
       return this.g;
    }
    public void l(UploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "16")) {
          return;
       }
       k1.o(new q1(this, p0));
       return;
    }
    public void m(UploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "15")) {
          return;
       }
       k1.o(new l2(this, p0));
       return;
    }
    public void n(IUploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "10")) {
          return;
       }
       p0.mStatus = IUploadInfo$Status.FAILED;
       p0.mProgress = 0;
       this.c.put(p0.getId(), p0);
       this.m(p0);
       return;
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "14")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public boolean p(String p0){
       UploadInfo obj = PatchProxy.applyOneRefs(p0, this, r1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.get(p0);
       int i = 0;
       if (obj == null || obj.getStatus() != IUploadInfo$Status.FAILED) {
          return i;
       }
       Object[] objArray = new Object[i];
       a.D().w("UploadManager", "retry: addTask, id: "+p0, objArray);
       this.c(obj);
       this.q(obj);
       return true;
    }
    public void q(IUploadInfo p0){
       r1 a;
       x ox;
       SegmentUploader segmentUploa;
       boolean b;
       boolean b1;
       boolean b2;
       AggregatedUploader uAggregatedU;
       v ov;
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "17")) {
          return;
       }
       PostWorkInfo postWorkInfo = this.h().c4(p0.getId());
       EncodeInfo uEncodeInfo = null;
       if (this.g().n(uEncodeInfo, p0)) {
          this.g().j(postWorkInfo);
       }
       r1$b uob = this.d.get(p0.getId());
       String str = "UploadManager";
       int i = 0;
       if (uob == null) {
          Object[] objArray = new Object[i];
          a.D().w(str, "runTask: uploadTask is null, call addTask", objArray);
          this.c(p0);
          uob = this.d.get(p0.getId());
       }
       Objects.requireNonNull(uob);
       z oz = PatchProxy.applyOneRefs(p0, uob, r1$b.class, "2");
       if (oz != PatchProxyResult.class) {
       }else {
          a = uob.o.a;
          Objects.requireNonNull(a);
          o1 oo1 = o1.class;
          if (!PatchProxy.applyVoidOneRefs(p0, a, oo1, "33")) {
             h$b uob1 = h$b.d(1, a.d(p0));
             if (!PatchProxy.applyVoidOneRefs(uob1, a, oo1, "34")) {
                ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
                urlPackage.page = 74;
                uob1.u(urlPackage);
             }
             uob1.r(p0.getSessionId());
             u1.r0(uob1);
          }
          File uFile = new File(p0.getFilePath());
          PostLogger postLogger = new PostLogger().c(str);
          postLogger.k(p0.getSessionId());
          postLogger = postLogger.h(PostSubTaskEvent.UPLOAD_EVENT).i(p0.getId()).j(PostLogger$Status.WAIT);
          if (PostExperimentUtils.l() && p0.isUseFakeUploader()) {
             oz = new z();
          }else if(uob.b.getAtlasInfo() != null){
             postLogger.g("generateUploader, BaseAtlasUploader atlas").d();
             oz = new w(p0, uob.o.i(), uob.i);
          }else if(uob.b.getKtvInfo() != null && uob.b.getKtvInfo().getKaraokeType() == 2){
             postLogger.g("generateUploader, BaseAtlasUploader single pic mode").d();
             oz = new w(p0, uob.o.i(), uob.i);
          }else if(b.M(uob.b.getFilePath())){
             postLogger.g("generateUploader, ImageUploader").d();
             oz = new y();
          }else {
             String str1 = "generateUploader, CoverAndFileUpload";
             if (uob.b.getUploadPostType() == IUploadRequest$UploadPostType.INTOWN) {
                postLogger.g(str1).d();
                oz = new v(new x(uob.o.a), uob.o.a);
             }else if(uob.b.getUploadRestrict() == 1){
                postLogger.g("generateUploader, CloudVideoUploader").d();
                oz = new g();
             }else if(uob.b.getUploadRestrict() == 3){
                postLogger.g("generateUploader, LiveAvatarUploader").d();
                oz = b.r(b.class, b$a.b).F8();
             }else if(uob.o.g().n(uEncodeInfo, p0)){
                if (PostExperimentUtils.h()) {
                   postLogger.g("generateUploader, ByteStreamUploader").d();
                   oz = new e(uob.o.a);
                }else {
                   postLogger.g("generateUploader, PipelineUploader").d();
                   oz = new o0(uob.o.a);
                }
             }else {
                long l = uFile.length();
                if (!uob.b.isStory() && (uob.b.getCoverFile() != null && uob.b.getCoverFile().exists())) {
                   postLogger.g(str1).d();
                   ox = new x(uob.o.a);
                   segmentUploa = new SegmentUploader(uob.o.i(), uob.o.k(), uob.i, uob.o.a);
                   b = (uob.c(l) || p0.isStory())? true: false;
                   b1 = (uob.b(l) && !p0.isStory())? true: false;
                   b2 = (a.v0() || uob.b.isLongVideo())? true: false;
                   uAggregatedU = new AggregatedUploader(ox, segmentUploa, b, b1, b2);
                   ov = new v(uEncodeInfo, uob.o.a);
                }else {
                   postLogger.g("generateUploader, AggregatedUploader").d();
                   ox = new x(uob.o.a);
                   segmentUploa = new SegmentUploader(uob.o.i(), uob.o.k(), uob.i, uob.o.a);
                   b = (uob.c(l) || p0.isStory())? true: false;
                   b1 = (uob.b(l) && !p0.isStory())? true: false;
                   b2 = (a.v0() || uob.b.isLongVideo())? true: false;
                   uAggregatedU = new AggregatedUploader(ox, segmentUploa, b, b1, b2);
                }
                oz = ov;
             }
          }
       }
       uob.f = oz;
       p0.mStatus = IUploadInfo$Status.UPLOADING;
       this.e().execute(uob);
       return;
    }
    public void r(IUploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "19")) {
          return;
       }
       this.c.put(p0.getId(), p0);
       return;
    }
    public t s(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyOneRefs(p0, this, r1.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "taskId");
          obj = t.create(new g(p0));
       }
       return obj;
    }
}
