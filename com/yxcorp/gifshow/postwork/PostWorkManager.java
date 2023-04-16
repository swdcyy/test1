package com.yxcorp.gifshow.postwork.PostWorkManager;
import com.yxcorp.gifshow.postwork.a;
import com.yxcorp.gifshow.postwork.PostWorkManager$a;
import android.content.Context;
import java.lang.Object;
import java.util.HashSet;
import wkd.b;
import dnc.x0;
import com.yxcorp.gifshow.postwork.o;
import java.util.HashMap;
import com.yxcorp.gifshow.postwork.PostWorkManager$LoadPostCacheStatus;
import mrd.a;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.yxcorp.gifshow.upload.r1;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.postwork.p;
import tkd.b;
import tkd.d;
import hn5.c0;
import r26.e;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import y9a.b;
import eda.n;
import f0c.e0;
import java.lang.Class;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.postwork.PostWorkManager$f;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import lnc.s6;
import java.lang.Boolean;
import android.content.SharedPreferences;
import lnc.e7;
import ekd.k1;
import com.kwai.sdk.switchconfig.a;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.core.show.wish.a;
import erd.o;
import brd.w;
import com.yxcorp.gifshow.postwork.t;
import erd.r;
import f0c.j0;
import com.yxcorp.gifshow.postwork.r;
import f0c.i0;
import com.yxcorp.gifshow.postwork.s;
import brd.a0;
import t45.d;
import brd.z;
import f0c.g0;
import f0c.h0;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import r26.a;
import nca.a;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import java.lang.Long;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import com.yxcorp.gifshow.upload.UploadRequest;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import lq.i;
import f0c.w0;
import com.yxcorp.gifshow.encode.EncodeRequest;
import r26.b;
import java.util.Set;
import java.lang.Integer;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.postwork.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.upload.u0;
import java.io.File;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.kcube.TabIdentifier;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import android.graphics.Bitmap;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import f0c.b;
import f0c.a;
import java.lang.reflect.Type;
import fg6.a;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;
import j80.c;
import android.os.Environment;
import ekd.e0;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.gifshow.postwork.u;
import com.yxcorp.gifshow.postwork.q;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.postwork.PostWorkManager$b;
import c26.d;
import java.util.ArrayList;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import k2b.u1;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.kuaishou.android.post.PostArguments;
import dnc.k1;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.util.Map$Entry;
import om6.c;
import om6.d;
import f0c.c0;
import java.util.concurrent.Callable;
import e17.i;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.ModelBase;
import f0c.d0;
import f0c.z;
import erd.a;
import f0c.f0;
import com.yxcorp.gifshow.postwork.v;
import com.kuaishou.edit.draft.Workspace;
import java.lang.Math;
import com.kwai.feature.post.api.feature.upload.model.PipelineKeyResponse;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import pca.a0;
import w46.b;
import com.yxcorp.gifshow.postwork.PostWorkManager$d;
import java.util.Objects;
import com.yxcorp.gifshow.postwork.h;
import com.yxcorp.gifshow.postwork.n;
import com.yxcorp.gifshow.postwork.g;
import com.yxcorp.gifshow.postwork.m;
import com.yxcorp.gifshow.postwork.a$a;
import f0c.n;
import com.yxcorp.gifshow.postwork.j;
import java.lang.Float;
import r26.d;
import haa.f;
import com.yxcorp.gifshow.edit.draft.model.n;
import java.io.FileFilter;
import com.yxcorp.gifshow.edit.draft.model.o;
import laa.o;
import l46.a;
import lnc.p3;
import pa0.a;
import com.yxcorp.gifshow.log.utils.DeviceSampleEnum;
import f3b.s;
import com.google.gson.JsonObject;
import com.kwai.framework.cache.a;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.encode.s0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.postwork.PostWorkManager$e;
import java.lang.Enum;
import dnc.v0;
import java.io.FileNotFoundException;
import lv5.d;
import o26.d;
import gq.a;
import com.yxcorp.utility.TextUtils;
import pca.f1;
import t45.c;
import o56.a;
import km8.b;
import com.yxcorp.gifshow.encode.o0;
import com.yxcorp.gifshow.encode.c0;
import pca.o1;
import pca.n0;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$UploadAtlasDetailPackage;
import enc.b0;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import q2b.h$b;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import enc.a0;
import f0c.x;
import java.util.concurrent.ExecutorService;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import f0c.b0;
import com.yxcorp.gifshow.postwork.PostWorkManager$c;
import com.kwai.feature.post.api.feature.upload.interfaces.a;
import oa0.a;
import xf6.l;
import f0c.a0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import d26.a;
import c26.b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.postwork.autoretry.AutoRetryConfig;

public final class PostWorkManager implements a	// class@0010b9
{
    public final EncodeManager a;
    public final r1 b;
    public final Map c;
    public final p d;
    public Context e;
    public int f;
    public final Set g;
    public final x0 h;
    public final Set i;
    public final o j;
    public final Map k;
    public boolean l;
    public boolean m;
    public b n;
    public final a o;
    public static final a$a p;

    static {
       PostWorkManager.p = new PostWorkManager$a();
    }
    public void PostWorkManager(Context p0){
       super();
       this.g = new HashSet();
       this.h = b.a(-2001546430);
       this.i = new HashSet();
       this.j = new o();
       this.k = new HashMap();
       this.l = false;
       this.o = a.h(PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_PENDING);
       this.e = p0.getApplicationContext();
       this.a = EncodeManager.o();
       this.b = r1.f();
       this.c = new ConcurrentHashMap();
       this.d = new p();
       c0 uoc0 = d.a(0x5f15a9b6);
       if (uoc0 != null) {
          this.V3(uoc0);
       }
       if (PostExperimentUtils.l()) {
          this.V3(d.a(0x61366774).w10());
       }
       f.a(n.class, new e0(this));
       return;
    }
    public static a g(){
       return PostWorkManager$f.a;
    }
    public t A0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "testSpeed taskId: "+p0, objArray);
       this.k.remove(p0);
       return this.b.s(p0);
    }
    public void D1(g p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "9")) {
          return;
       }
       int i = 0;
       String str = "PostWorkManager";
       if (!s6.e()) {
          objArray = new Object[i];
          a.D().w(str, "autoRetryUpload: ab off", objArray);
          p0.accept(Boolean.FALSE);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str, "autoRetryUpload: called", objArray1);
          long l = 0;
          long l1 = k1.t(e7.a().getLong("key_last_auto_retry_time", l));
          long l2 = a.t().b("autoRetryUploadIntervalTime", 0x2710);
          Object[] objArray2 = new Object[i];
          a.D().w(str, "autoRetryUpload:interval="+l1+",intervalLimit="+l2, objArray2);
          if (l1 - l2 < 0) {
             l2 = l2 - l1;
             objArray = new Object[i];
             a.D().w(str, "autoRetryUpload: waitTime="+l2, objArray);
          }else {
             l2 = l;
          }
          PostWorkManager tn = this.n;
          if (tn != null && !tn.isDisposed()) {
             this.n.dispose();
          }
          long l3 = System.currentTimeMillis();
          t ot = this.a2();
          if (l2 - l > 0) {
             ot = t.merge(t.timer(l2, TimeUnit.MILLISECONDS).map(a.b), ot).takeLast(1);
          }
          this.n = ot.filter(t.b).flatMap(new j0(this)).flatMap(r.b).map(new i0(this)).filter(s.b).toList().G(d.a).R(new g0(this, p0, l3), new h0(p0));
          return;
       }
    }
    public List E2(boolean p0,PostStatus[] p1){
       HashSet obj;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, postWorkMana, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashSet();
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p1[i];
             if (oobject != PostStatus.ENCODE_COMPLETE && (oobject != PostStatus.ENCODE_CANCELED && oobject != PostStatus.UPLOAD_COMPLETE)) {
                obj.add(oobject);
                i = i + 1;
             }else {
                break ;
             }
          }else {
             LinkedList linkedList = new LinkedList();
             Iterator iterator = this.c.values().iterator();
             while (iterator.hasNext()) {
                PostWorkInfo postWorkInfo = iterator.next();
                if (obj.contains(postWorkInfo.getStatus()) && (!p0 || (this.j4(postWorkInfo) && !a.a(postWorkInfo)))) {
                   linkedList.add(postWorkInfo);
                }else {
                   continue ;
                }
             }
             return linkedList;
          }
       }
       throw new IllegalArgumentException("Cannot get completed or canceled info");
    }
    public void J1(String p0,String p1,long p2,RickonWholeUploadParams p3){
       if (PatchProxy.isSupport(PostWorkManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), p3, this, PostWorkManager.class, "43")) {
          return;
       }
       UploadRequest$a uoa = UploadRequest.newBuilder();
       QCurrentUser qCurrentUser = QCurrentUser.me();
       uoa.U(qCurrentUser.getId());
       uoa.b(qCurrentUser.getName());
       uoa.j(p1);
       uoa.W(p2);
       uoa.I(p0);
       uoa.q(true);
       uoa.H(p3);
       uoa.Q(IUploadRequest$UploadPostType.SCHOOL);
       uoa.w(2);
       uoa.R(true);
       boolean b = false;
       boolean b1 = (i.h() && i.m().B())? true: false;
       uoa.G(b1);
       uoa.o(b);
       w0 ow0 = new w0(null, uoa.a());
       if (this.i(p0) != null) {
          PostWorkInfo postWorkInfo = this.i(p0);
          if (postWorkInfo != null) {
             this.S(postWorkInfo.getId(), true);
          }
       }
       this.q0(ow0);
       return;
    }
    public void K3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "31")) {
          return;
       }
       this.g.remove(p0);
       return;
    }
    public a L0(int p0){
       return this.h(p0);
    }
    public a Q3(String p0){
       return this.i(p0);
    }
    public boolean S(int p0,boolean p1){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, postWorkMana, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.Y3(p0, p1, 17);
    }
    public List T0(PostStatus[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E2(true, p0);
    }
    public void V3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "30")) {
          return;
       }
       this.g.add(p0);
       return;
    }
    public boolean W3(int p0,boolean p1,boolean p2,int p3,Runnable p4){
       PostWorkInfo obj;
       PostWorkManager postWorkMana = PostWorkManager.class;
       int i = 0;
       if (PatchProxy.isSupport(postWorkMana)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, postWorkMana, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().w("PostWorkManager", "cancel\(\) called with: id = ["+p0+"], cancelEncoding = ["+p1+"], cancelUserUploading = ["+p2+"], trigger = ["+p3+"], cleanListener = ["+p4+"]", objArray1);
       PostWorkInfo postWorkInfo = this.c.get(Integer.valueOf(p0));
       if (postWorkInfo != null) {
          this.o(postWorkInfo);
          this.j.h(postWorkInfo);
          a uoa = (p2 && postWorkInfo.needUpload())? 1: null;
          obj = postWorkInfo.mEncodeInfo;
          if (obj != null && obj.getStatus() != EncodeInfo$Status.COMPLETE) {
             postWorkInfo.mRequest.b = null;
             if (p3 != 18 && (p1 || !this.h.n(postWorkInfo.mEncodeInfo, postWorkInfo.mUploadInfo))) {
                this.d.i(postWorkInfo, 1);
             }
             if (p1) {
                if (!this.h.n(postWorkInfo.mEncodeInfo, postWorkInfo.mUploadInfo)) {
                   p1 = this.a.d(postWorkInfo.mEncodeInfo.getId(), p3);
                label_00ea :
                   if (postWorkInfo.mUploadInfo != null) {
                      e.a().d(postWorkInfo.getSessionId(), "end_upload_task_cancel");
                      if (!this.h.n(postWorkInfo.mEncodeInfo, postWorkInfo.mUploadInfo)) {
                         p1 = this.b.d(postWorkInfo.mUploadInfo.getId());
                      }else {
                         Object[] objArray3 = new Object[i];
                         a.D().w("PostWorkManager", "PipelineUploadManager cancelUploadIfNeeded in postwork cancel", objArray3);
                         this.h.i(postWorkInfo.mUploadInfo.getId(), 1);
                         if (postWorkInfo.mUploadInfo.isEnd() && !postWorkInfo.isPublished()) {
                            this.p(postWorkInfo);
                         }
                      }
                   }else {
                      PostWorkInfo mEncodeInfo = postWorkInfo.mEncodeInfo;
                      if (mEncodeInfo != null && (mEncodeInfo.getStatus() == EncodeInfo$Status.COMPLETE && postWorkInfo.mUploadInfo == null)) {
                         this.h.h(postWorkInfo);
                         this.p(postWorkInfo);
                      }
                   }
                   if (uoa) {
                      Object[] objArray2 = new Object[i];
                      a.D().w("PostWorkManager", "Cancel posting. Save back editing workspace.", objArray2);
                      if (postWorkInfo.getWorkspaceDraft() != null) {
                         u0.a(postWorkInfo.getWorkspaceDraft(), postWorkInfo.isSaveWorkSpace(), i, p4);
                      }else {
                         u0.b(postWorkInfo.getWorkspaceDirectory(), postWorkInfo.isSaveWorkSpace(), i, p4);
                      }
                   }
                   this.h.v(postWorkInfo.getId());
                   i = p1;
                }else {
                   this.h.a(postWorkInfo.getId());
                }
             }
          }
       label_00e9 :
          PostWorkManager postWorkMana1 = null;
          goto label_00ea ;
       }
       return i;
    }
    public boolean X3(IUploadRequest p0,int p1){
       PostWorkInfo obj;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, postWorkMana, "25");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       g.a(e7.a().edit().putLong("key_last_auto_retry_time", System.currentTimeMillis()));
       obj = this.h(p1);
       Object[] objArray = new Object[]{"postWorkId",Integer.valueOf(p1)};
       int i = 0;
       String str = "PostWorkManager";
       a.D().w(str, "addUploadTask", objArray);
       if (obj == null) {
          return i;
       }else if(obj.getUploadInfo() != null && p0 != null){
          obj.getUploadInfo().setMockFeedUploadTarget(p0.getMockFeedUploadTarget());
       }
       obj.mRequest.b(p0);
       if (this.h.n(obj.getEncodeInfo(), obj.getUploadInfo())) {
          objArray = new Object[i];
          a.D().w(str, "addUploadTask\(IUploadRequest iuploadRequest, int postWorkId\) enableRickon true", objArray);
          if (obj.getEncodeInfo() != null) {
             p0.setEncodedFileCrc(obj.getEncodeInfo().getEncodedFileCrc());
          }
          obj.mRequest.b(p0);
          this.c(obj.mRequest, obj);
          return 1;
       }else if(obj.getStatus() == PostStatus.ENCODE_FAILED){
          objArray = new Object[i];
          a.D().w(str, "addUploadTask encode fail, update status", objArray);
          this.l(obj, obj.mRequest);
       }
       if (obj.getStatus() != PostStatus.ENCODE_PENDING && (obj.getStatus() != PostStatus.ENCODING && obj.getStatus() != PostStatus.ENCODE_COMPLETE)) {
          return i;
       }else if(obj.getEncodeInfo() != null){
          p0.setEncodedFileCrc(obj.getEncodeInfo().getEncodedFileCrc());
       }
       obj.mRequest.b(p0);
       if (obj.getStatus() == PostStatus.ENCODE_COMPLETE) {
          this.c(obj.mRequest, obj);
       }
       this.j.a(obj);
       return 1;
    }
    public boolean Y3(int p0,boolean p1,int p2){
       if (PatchProxy.isSupport(PostWorkManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, PostWorkManager.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.W3(p0, p1, false, p2, null);
    }
    public void Z3(Context p0,EditorSdk2V2$VideoEditorProject p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostWorkManager.class, "55")) {
          return;
       }
       this.e(p0, p1, null, p2);
       return;
    }
    public long a(){
       Iterator iterator;
       String str;
       File uFile;
       File[] uFileArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, PostWorkManager.class, "46");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       long l = 0;
       if (!this.d()) {
          obj = new Object[0];
          a.D().w("PostWorkManager", "getCacheSize\(\) cant clean cache. Ignore", obj);
          return l;
       }else {
          File[] uFileArray = new File[]{PostWorkManager.g().a4(),EncodeManager.o().m(),PostUtils.f(),PostUtils.n(),PostUtils.m()};
          long l1 = b.p0(uFileArray);
          a obj1 = PatchProxy.apply(objArray, objArray, b.class, "7");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             a value = a.t().getValue("LowDiskPostWorkClearStrategy", a.class, objArray);
             Object[] objArray1 = new Object[0];
             a.D().w("DiskUnSufficientPostClear", "checkAndDoPostFilesClear\(\) with config: "+a.a.q(value), objArray1);
             if (value != null) {
                obj1 = value.fileManagerDirInRootClearItems;
                if (obj1 != null) {
                   iterator = obj1.iterator();
                   while (iterator.hasNext()) {
                      str = iterator.next();
                      if (!TextUtils.isEmpty(str)) {
                         uFile = b.a(-1504323719).h(str);
                         if (uFile.exists()) {
                            uFileArray1 = new File[]{uFile};
                            l = l + b.p0(uFileArray1);
                         }
                      }
                   }
                }
                obj1 = value.fileManagerDirInPhotoClearItems;
                if (obj1 != null) {
                   iterator = obj1.iterator();
                   while (iterator.hasNext()) {
                      str = iterator.next();
                      if (!TextUtils.isEmpty(str)) {
                         uFile = b.a(-1504323719).d(str);
                         if (uFile.exists()) {
                            uFileArray1 = new File[]{uFile};
                            l = l + b.p0(uFileArray1);
                         }
                      }
                   }
                }
                if (value.externalFileDirClearItems != null && ((Environment.getExternalStorageState()).equals("mounted") && PermissionUtils.a(e0.b, "android.permission.WRITE_EXTERNAL_STORAGE"))) {
                   iterator = value.externalFileDirClearItems.iterator();
                   while (iterator.hasNext()) {
                      str = iterator.next();
                      if (!TextUtils.isEmpty(str)) {
                         File uFile1 = new File(e0.b.getExternalFilesDir(objArray), str);
                         if (uFile1.exists()) {
                            File[] uFileArray2 = new File[]{uFile1};
                            l = l + b.p0(uFileArray2);
                         }
                      }
                   }
                }
                value = value.fileManagerDirInPrivateRootClearItems;
                if (value != null) {
                   Iterator iterator1 = value.iterator();
                   while (iterator1.hasNext()) {
                      String str1 = iterator1.next();
                      if (!TextUtils.isEmpty(str1)) {
                         File uFile2 = b.a(-1504323719).g(str1);
                         if (uFile2.exists()) {
                            File[] uFileArray3 = new File[]{uFile2};
                            l = l + b.p0(uFileArray3);
                         }
                      }
                   }
                }
             }
          }
          objArray = new Object[0];
          a.D().w("PostWorkManager", "getCacheSize\(\) baseFileData="+l1+", resourceFileData="+l, objArray);
          return (l1 + l);
       }
    }
    public t a2(){
       Object obj = PatchProxy.apply(null, this, PostWorkManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o.i() == PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_PENDING) {
          this.i4();
       }
       return this.o.takeUntil(u.b).map(q.b);
    }
    public File a4(){
       Object obj = PatchProxy.apply(null, this, PostWorkManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DraftFileManager.E().M();
    }
    public final void b(PostWorkInfo p0,int p1){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, postWorkMana, "12")) {
          return;
       }
       this.a.b(new PostWorkManager$b(this, p1, p0));
       return;
    }
    public List b4(r p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          try{
             if (p0.test(uoe)) {
                obj.add(uoe);
             }
          }catch(java.lang.Exception e2){
             PostUtils.D("PostWorkManager", "findListener", e2);
             goto label_001a ;
          }
       }
       return obj;
    }
    public PostWorkInfo c(w0 p0,PostWorkInfo p1){
       UploadInfo obj1;
       boolean b1;
       Object[] objArray1;
       UploadInfo uploadInfo;
       UploadInfo uploadInfo1;
       PostArguments postArgument;
       PostWorkInfo postWorkInfo;
       PostWorkManager postWorkMana = this;
       w0 ow0 = p0;
       String str = p1;
       PostWorkManager postWorkMana1 = PostWorkManager.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, str, this, postWorkMana1, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = ow0.b.isPublished();
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "addUploadTask: isPublished: "+b, objArray);
       if (PatchProxy.isSupport(postWorkMana1)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(b), this, PostWorkManager.class, "28");
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else if(str != null && (p1.getUploadInfo() != null && (b && (!p1.getUploadInfo().isEnd() && p1.getUploadInfo().getStatus() == IUploadInfo$Status.UPLOADING)))){
             obj = new Object[0];
             a.D().w("PostWorkManager", "addUploadTask: preUploadMode & upload not end", obj);
             postWorkMana.d.k(str);
             this.s(p0, p1);
             str.setIsPublished(true);
             postWorkMana.j.a(str);
             this.k(p1.getProgress(), str);
             b1 = true;
          }else {
             obj = new Object[0];
             a.D().w("PostWorkManager", "add upload request", obj);
             b1 = false;
          }
       }else {
          goto label_0056 ;
       }
       if (b1) {
          str.setIsPublished(b);
          obj = new Object[0];
          a.D().w("PostWorkManager", "addUploadTask: reuse postWorkInfo", obj);
          return str;
       }else {
          obj1 = null;
          if (str != null && b.a(-2001546430).b(str.mEncodeInfo, obj1)) {
             ow0.b.setEnablePipelineSegmentUpload(true);
          }
          if (str == null || str.mUploadInfo == null) {
             objArray1 = new Object[0];
             a.D().w("PostWorkManager", "add new upload", objArray1);
             String str1 = postWorkMana.b.a(ow0.b);
             uploadInfo = postWorkMana.b.j(str1);
             PostLogger postLogger = new PostLogger().c("PostWorkManager");
             postLogger.k(uploadInfo.mSessionId);
             postLogger.h(PostSubTaskEvent.UPLOAD_EVENT).j(PostLogger$Status.BEGIN).i(str1).g("no reuse upload info").d();
             uploadInfo.mResumeKey = u1.f();
             uploadInfo1 = uploadInfo;
          }else {
             objArray1 = new Object[0];
             a.D().w("PostWorkManager", "reuse uploadInfo", objArray1);
             this.s(p0, p1);
             uploadInfo1 = str.mUploadInfo;
          }
          if (str != null && (p1.getEncodeInfo() != null && p1.getEncodeInfo().getAtlasInfo() != null)) {
             objArray = new Object[0];
             a.D().w("PostWorkManager", "generate mAtlasInfo by encodeInfo", objArray);
             uploadInfo1.setAtlasInfo(str.mEncodeInfo.getAtlasInfo());
             if (uploadInfo1.getCoverFile() != null && uploadInfo1.getAtlasInfo() != null) {
                uploadInfo1.getAtlasInfo().setCoverFilePath(uploadInfo1.getCoverFile().getAbsolutePath());
             }
          }
       label_0170 :
          if (str == null) {
             Object[] objArray2 = new Object[0];
             a.D().w("PostWorkManager", "addUploadTask new PostWorkInfo mId: "+postWorkMana.f, objArray2);
             PostWorkManager objArray3 = postWorkMana.f;
             postWorkMana.f = objArray3 + 1;
             if (i.h()) {
                postArgument = i.g();
             }
             postWorkInfo = new PostWorkInfo(objArray3, uploadInfo1, postArgument);
             postWorkInfo.mCacheId = this.f();
             postWorkInfo.mSessionId = uploadInfo1.mSessionId;
             postWorkInfo.mRequest = ow0;
          }else {
             objArray = new Object[0];
             a.D().w("PostWorkManager", "addUploadTask reuse PostWorkInfo mId: "+postWorkMana.f, objArray);
             str.mSessionId = uploadInfo1.mSessionId;
             str.mRequest = ow0;
             ow0.b = ow0.b;
             str.setUploadInfo(uploadInfo1);
             postWorkInfo = str;
          }
          e.a().d(postWorkInfo.getSessionId(), "add_upload_task");
          postWorkInfo.setIsPublished(b);
          this.k(postWorkInfo.getProgress(), postWorkInfo);
          this.n(postWorkInfo, p0);
          if (postWorkInfo.isPublished() && !postWorkInfo.isPipelineFailedThenFallback()) {
             postWorkMana.d.k(postWorkInfo);
          }
          postWorkMana.j.a(postWorkInfo);
          b.a(0x6223c5ca).f(postWorkInfo, uploadInfo1);
          if (postWorkInfo.isPublished()) {
             PostWorkInfo mUploadInfo = postWorkInfo.mUploadInfo;
             if (mUploadInfo != null && (mUploadInfo.getStatus() == IUploadInfo$Status.FAILED && postWorkMana.h.n(postWorkInfo.getEncodeInfo(), postWorkInfo.getUploadInfo()))) {
                objArray = new Object[0];
                a.D().w("PostWorkManager", "addUploadTask\(final Request request, PostWorkInfo postWorkInfo\) reloadData", objArray);
                postWorkMana.h.w(postWorkInfo);
             }
          }
          PostLogger postLogger1 = new PostLogger().c("PostWorkManager");
          postLogger1.k(uploadInfo1.mSessionId);
          postLogger1.h(PostSubTaskEvent.UPLOAD_EVENT).j(PostLogger$Status.BEGIN).i(postWorkInfo.getUploadInfo().getId()).g("reuse upload info").d();
          postWorkMana.b.q(postWorkInfo.getUploadInfo());
          return postWorkInfo;
       }
    }
    public a c4(String p0){
       return this.j(p0);
    }
    public boolean cancel(int p0){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postWorkMana, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.S(p0, true);
    }
    public void cancelAll(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "cancelAll\(\)", objArray);
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue().getStatus() == PostStatus.UPLOAD_FAILED || uEntry.getValue().getStatus() == PostStatus.ENCODE_FAILED) {
             this.W3(uEntry.getKey().intValue(), true, true, 17, null);
          }
       }
       return;
    }
    public boolean d(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, PostWorkManager.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "PostWorkManager";
       if (i.h()) {
          objArray = new Object[0];
          a.D().w(str, "clearOutput\(\) PostSession is available ignore", objArray);
          return 0;
       }else if(this.o.i() != PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_COMPLETE){
          objArray = new Object[0];
          a.D().w(str, "clearOutput\(\) not loaded ignore", objArray);
          return 0;
       }else if(d.a(-1139054219).lO().e().booleanValue()){
          objArray = new Object[0];
          a.D().w(str, "clearOutput\(\) has need recover Draft ignore", objArray);
          return 0;
       }else {
          return a0.y(new c0(this)).T(d.a).e().booleanValue();
       }
    }
    public a d4(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, PostWorkManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.entrySet().iterator();
       int i = -1;
       while (obj.hasNext()) {
          PostWorkInfo value = obj.next().getValue();
          if (value.getStatus() == PostStatus.UPLOAD_FAILED || (value.getStatus() == PostStatus.ENCODE_FAILED && value.getId() > i)) {
             i = value.getId();
          }
       }
       if (i != -1) {
          objArray = this.c.get(Integer.valueOf(i));
       }
       return objArray;
    }
    public final void e(Context p0,EditorSdk2V2$VideoEditorProject p1,EditorSdk2$ExportOptions p2,Bitmap p3){
       ErrorStatus this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PostWorkManager.class, "62")) {
          return;
       }
       if (this.l != null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f102fd4);
          Object[] objArray = new Object[0];
          a.D().w("PostWorkManager", "dumpProject: a dump task is processing, ignore", objArray);
          return;
       }else {
          this.l = true;
          String[] allFilePathA = EditorSdk2UtilsV2.getAllFilePathArrayInProject(p1);
          ErrorStatus uErrorStatus = null;
          byte[] data = EditorSdk2Utils.getResourcePathConfig().getData(uErrorStatus);
          byte[] uobyteArray = p1.toByteArray();
          this = (p2 == null)? uErrorStatus: p2.toByteArray();
          d0 uod0 = new d0(uobyteArray, data, this, allFilePathA, p3);
          t.fromCallable(p1).subscribeOn(d.c).observeOn(d.a).doFinally(new z(this)).subscribe(new f0(this, p0), v.b);
          return;
       }
    }
    public a e4(String p0){
       Object[] objArray1;
       PostWorkInfo postWorkInfo = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "20");
       if (postWorkInfo != PatchProxyResult.class) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("PostWorkManager", "getPostWorkInfoByWorkspaceId "+p0, objArray);
          Iterator iterator = this.c.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                PostWorkInfo value = iterator.next().getValue();
                PostWorkInfo mEncodeInfo = value.mEncodeInfo;
                if (mEncodeInfo != null) {
                   PostEncodeInfo mWorkspace = mEncodeInfo.mWorkspace;
                   if (mWorkspace == null || !(mWorkspace.getIdentifier()).equals(p0)) {
                      EncodeInfo mWorkspaceDi = value.mEncodeInfo.mWorkspaceDirectory;
                      if (mWorkspaceDi == null || !(mWorkspaceDi.getName()).startsWith(p0)) {
                      label_0088 :
                         mEncodeInfo = value.mRequest;
                         String str = "Found uploading ";
                         if (mEncodeInfo != null) {
                            w0 b = mEncodeInfo.b;
                            if (b != null && (b.getWorkspace() == null || ((value.mRequest.b.getWorkspace().getIdentifier()).equals(p0) || (value.mRequest.b.getWorkspaceDirectory() != null && (value.mRequest.b.getWorkspaceDirectory().getName()).startsWith(p0))))) {
                               objArray1 = new Object[i];
                               a.D().w("PostWorkManager", str+p0, objArray1);
                            }
                         }
                         mEncodeInfo = value.mUploadInfo;
                         if (mEncodeInfo != null && (!TextUtils.isEmpty(mEncodeInfo.getWorkspacePath()) && (new File(value.mUploadInfo.getWorkspacePath()).getName()).startsWith(p0))) {
                            objArray1 = new Object[i];
                            a.D().w("PostWorkManager", str+p0, objArray1);
                         }
                      }
                   }
                   objArray1 = new Object[i];
                   a.D().w("PostWorkManager", "Found encoding "+p0, objArray1);
                }else {
                   goto label_0088 ;
                }
                postWorkInfo = value;
                break ;
             }else {
                Object[] objArray2 = new Object[i];
                a.D().w("PostWorkManager", "Post work not found "+p0, objArray2);
                postWorkInfo = null;
                break ;
             }
          }
       }
       return postWorkInfo;
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, PostWorkManager.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (System.currentTimeMillis() + (long)(int)(Math.random() * 100.00f))+"-"+QCurrentUser.me().getId();
    }
    public void f4(String p0,PipelineKeyResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostWorkManager.class, "52")) {
          return;
       }
       this.k.put(p0, p1);
       return;
    }
    public void g0(Context p0,int p1){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, postWorkMana, "54")) {
          return;
       }
       PostWorkInfo postWorkInfo = this.h(p1);
       if (p0 != null && (postWorkInfo != null && (postWorkInfo.getEncodeInfo() == null || postWorkInfo.getEncodeInfo().mVideoEncodeSDKInfo == null))) {
          i.d(R.style.arg_RES_7f11066a, "dump project, param invalid!");
          Object[] objArray = new Object[0];
          a.D().w("PostWorkManager", "dumpProjectInfoById, param is invalid", objArray);
          return;
       }else {
          VideoEncodeSDKInfo mProject = postWorkInfo.getEncodeInfo().mVideoEncodeSDKInfo.mProject;
          EditorSdk2$ExportOptions uExportOptio = a0.c(postWorkInfo.getEncodeInfo().mEncodeParams);
          if (!PatchProxy.applyVoidThreeRefs(p0, mProject, uExportOptio, this, PostWorkManager.class, "61")) {
             this.e(p0, mProject, uExportOptio, null);
          }
          return;
       }
    }
    public a g4(int p0){
       PostWorkInfo postWorkInfo;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          postWorkInfo = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postWorkMana, "37");
          if (postWorkInfo != PatchProxyResult.class) {
          }else {
          label_0019 :
             Iterator iterator = this.c.entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   PostWorkInfo value = iterator.next().getValue();
                   if (value.getEncodeInfo() != null && value.getEncodeInfo().getId() == p0) {
                      postWorkInfo = value;
                      break ;
                   }
                }else {
                   postWorkInfo = null;
                   break ;
                }
             }
          }
       }else {
          goto label_0019 ;
       }
       return postWorkInfo;
    }
    public PostWorkInfo h(int p0){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postWorkMana, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c.get(Integer.valueOf(p0));
    }
    public boolean h4(EncodeInfo p0,IUploadInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PostWorkManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("showPreuploadWitchAdr", b) && this.h.q(p0, p1)) {
          b = true;
       }
       return b;
    }
    public PostWorkInfo i(String p0){
       PostWorkInfo value;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.entrySet().iterator();
       while (true) {
          int i = 0;
          if (obj.hasNext()) {
             value = obj.next().getValue();
             if (value == null) {
                Object[] objArray = new Object[i];
                a.D().w("PostWorkManager", "getPostWorkInfoBySessionId postWorkInfo is null, is authentication?", objArray);
             }else if(p0.equalsIgnoreCase(value.getSessionId())){
                if (value.getUploadInfo() != null && !p0.equalsIgnoreCase(value.getUploadInfo().getSessionId())) {
                   Object[] objArray1 = new Object[i];
                   a.D().w("PostWorkManager", "getPostWorkInfoBySessionId uploadInfo sessionId is wrong", objArray1);
                   break ;
                }
                break ;
             }
          }else {
             Object[] objArray2 = new Object[i];
             a.D().t("PostWorkManager", "getPostWorkInfoBySessionId postWorkInfo is null, sessionId: "+p0, objArray2);
             return null;
          }
       }
       return value;
    }
    public void i4(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager.class, "41")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostWorkManager", "loadCachedWorks", objArray);
       if (this.o.i() != PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_PENDING) {
          return;
       }
       PostWorkManager tj = this.j;
       PostWorkManager$d uod = new PostWorkManager$d(this);
       PostWorkManager tc = this.c;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidTwoRefs(uod, tc, tj, o.class, "18")) {
          Object[] objArray1 = new Object[i];
          a.D().w("PostWorkInfoCacheHelper", "loadCachedWorks\(\) called", objArray1);
          o b = tj.b;
          if (b != null && !b.isDisposed()) {
             Object[] objArray2 = new Object[i];
             a.D().A("PostWorkInfoCacheHelper", "loadCachedWorks already executing", objArray2);
          }
          z c = d.c;
          t ot = t.fromCallable(h.b).subscribeOn(c).flatMap(n.b).filter(g.b).observeOn(c);
          tj.b = ot.map(new m(tj, uod)).observeOn(d.a).subscribe(new n(uod, tc), j.b);
       }
       return;
    }
    public PostWorkInfo j(String p0){
       PostWorkInfo value;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          value = obj.next().getValue();
          if (value.getUploadInfo() != null && (value.getUploadInfo().getId()).equalsIgnoreCase(p0)) {
             break ;
          }
       }
       return value;
    }
    public boolean j4(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (p0.getEncodeInfo() != null && p0.getEncodeInfo().isHidden())? 1: 0;
       int i = (p0.getUploadInfo() != null && p0.getUploadInfo().isHidden())? 1: 0;
       if (obj || i) {
          b = false;
       }
       return b;
    }
    public void k(float p0,PostWorkInfo p1){
       Object[] objArray;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, postWorkMana, "33")) {
          return;
       }
       p0 = p1.getUiProgress(p0);
       Iterator iterator = new ArrayList(this.g).iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          if (a.a(p1)) {
             int i = 0;
             if (uoe instanceof d) {
                uoe.V4(p0, p1);
                objArray = new Object[i];
                a.D().w("PostWorkManager", "onProgressChanged invalid post work but no ui", objArray);
             }
             objArray = new Object[i];
             a.D().w("PostWorkManager", "onProgressChanged invalid post work", objArray);
          }else {
             uoe.V4(p0, p1);
          }
       }
       return;
    }
    public void k4(boolean p0,boolean p1){
       DraftFileManager uDraftFileMa1;
       PostWorkManager a;
       int i1;
       DraftFileManager obj1;
       Object[] objArray3;
       float f;
       SharedPreferences$Editor obj2;
       int b2;
       Gson gson;
       Object[] objArray5;
       Iterator iterator1;
       String str5;
       File uFile1;
       object obj3;
       int i2;
       int i4;
       DeviceSampleEnum obj = this;
       int b = p0;
       boolean b1 = p1;
       DraftFileManager uDraftFileMa = DraftFileManager.class;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, postWorkMana, "45")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostWorkManager", "clearOutput\(\) try..., isDiskUnSufficient="+b+", isMannual="+b1, objArray);
       if (this.d()) {
          long l = System.currentTimeMillis();
          Object[] objArray1 = new Object[i];
          a.D().w("PostWorkManager", "clearOutput\(\) Clear cache.", objArray1);
          String str = "5";
          String str1 = "DraftFileManager";
          Object[] objArray2 = null;
          if (obj.m == null) {
             uDraftFileMa1 = DraftFileManager.E();
             Objects.requireNonNull(uDraftFileMa1);
             if (!PatchProxy.applyVoid(objArray2, uDraftFileMa1, uDraftFileMa, str)) {
                objArray5 = new Object[i];
                f.D().w(str1, "clearTemp", objArray5);
                obj1 = uDraftFileMa1.b;
                if (obj1 != null) {
                   String[] stringArray = obj1.list();
                   if (stringArray != null) {
                      int len = stringArray.length;
                      int i3 = 0;
                      while (true) {
                         if (i3 < len) {
                            obj3 = stringArray[i3];
                            if (DraftFileManager.m.contains(obj3)) {
                               Object[] objArray6 = new Object[i];
                               f.D().w(str1, "clearTemp contains tempDirFileName:"+obj3, objArray6);
                               objArray2 = 1;
                            label_00b9 :
                               if (objArray2) {
                                  objArray2 = new Object[i];
                                  f.D().w(str1, "clearTemp can not clear", objArray2);
                               }else {
                                  b.m(uDraftFileMa1.b);
                                  DraftFileManager.c0(uDraftFileMa1.b);
                                  if (!PatchProxy.applyVoid(null, uDraftFileMa1, uDraftFileMa, "7")) {
                                     File[] uFileArray2 = uDraftFileMa1.a.listFiles(n.b);
                                     if (uFileArray2 != null) {
                                        i4 = uFileArray2.length;
                                        for (int i5 = 0; i5 < i4; i5 = i5 + 1) {
                                           b.q(uFileArray2[i5]);
                                        }
                                     }
                                  }
                                  if (!PatchProxy.applyVoid(null, uDraftFileMa1, uDraftFileMa, "8")) {
                                     File[] uFileArray1 = uDraftFileMa1.a.listFiles(o.b);
                                     if (uFileArray1 != null) {
                                        i2 = uFileArray1.length;
                                        for (i4 = 0; i4 < i2; i4 = i4 + 1) {
                                           b.q(uFileArray1[i4]);
                                        }
                                     }
                                  }
                               }
                            }else {
                               i3 = i3 + 1;
                               List list = null;
                            }
                         }
                      }
                   }
                   objArray2 = null;
                   goto label_00b9 ;
                }
             }
          }
          uDraftFileMa1 = DraftFileManager.E();
          Objects.requireNonNull(uDraftFileMa1);
          if (!PatchProxy.applyVoid(null, uDraftFileMa1, uDraftFileMa, "9")) {
             objArray2 = new Object[i];
             f.D().w(str1, "clearExpiredPublishedBackup", objArray2);
             File[] uFileArray = uDraftFileMa1.a.listFiles(new o(uDraftFileMa1));
             if (uFileArray != null) {
                i1 = uFileArray.length;
                for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                   obj3 = uFileArray[i2];
                   b.q(obj3);
                   uDraftFileMa1.i.d(obj3.getName());
                }
             }
          }
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clearTempFile", objArray);
          a = obj.a;
          Objects.requireNonNull(a);
          i1 = -1504323719;
          if (!PatchProxy.applyVoid(null, a, EncodeManager.class, "26")) {
             b.m(b.a(i1).h(".encode_output_temporary_path"));
             b.m(a.m());
          }
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear audit_compress_dir", objArray);
          b.m(b.a(i1).j("audit_compress_dir"));
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear record cache", objArray);
          b.m(PostUtils.n());
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear photo cache", objArray);
          b.m(b.a(i1).d(".project"));
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear upload img info", objArray);
          b.m(b.a(i1).h(".frame_upload_image_info"));
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear cache dir", objArray);
          b.m(b.a(i1).c(".video_cache"));
          objArray = new Object[i];
          a.D().w("PostWorkManager", "clear cache dir", objArray);
          objArray = new Object[i];
          p3.D().w("PostUtils", "clearCacheDir\(\) called", objArray);
          PostUtils.B(PostUtils.f());
          String str2 = "4";
          if (b1 || b) {
             b uob = b.class;
             if (PatchProxy.isSupport(uob)) {
                obj1 = null;
                if (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), obj1, uob, "1")) {
                label_0240 :
                   a value = a.t().getValue("LowDiskPostWorkClearStrategy", a.class, obj1);
                   Gson a1 = a.a;
                   Object[] objArray4 = new Object[i];
                   a.D().w("DiskUnSufficientPostClear", "checkAndDoPostFilesClear\(\) with config: "+a1.q(value), objArray4);
                   if (value != null) {
                      String str3 = "lastDiskUnSufficientClearTs";
                      if (!b1) {
                         value = value;
                         gson = a1;
                         if ((System.currentTimeMillis() - a.a.getLong(str3, 0)) - (value.cleanInterval * 1000) <= 0) {
                         }
                      }else {
                         gson = a1;
                      }
                      obj2 = a.a.edit();
                      obj2.putLong(str3, System.currentTimeMillis());
                      g.a(obj2);
                      objArray5 = new Object[0];
                      a.D().w("DiskUnSufficientPostClear", "PostWorker Low Disk Clear Online Config :"+gson.q(value), objArray5);
                      a fileManagerD = value.fileManagerDirInRootClearItems;
                      String str4 = " with ClearResult: ";
                      if (fileManagerD != null) {
                         Iterator iterator = fileManagerD.iterator();
                         while (iterator.hasNext()) {
                            str3 = iterator.next();
                            if (!TextUtils.isEmpty(str3)) {
                               if (PatchProxy.applyVoidOneRefs(str3, null, uob, "2")) {
                                  continue ;
                               }else {
                                  File uFile = b.a(-1504323719).h(str3);
                                  if (uFile.exists()) {
                                     objArray5 = new Object[0];
                                     a.D().w("DiskUnSufficientPostClear", "PostWork LowDisk Mode File Clear:  FileManager DirInRoot\'s subDir："+uFile.getAbsolutePath()+str4+b.q(uFile), objArray5);
                                  }
                               }
                            }
                            b2 = this;
                         }
                      }
                      a fileManagerD1 = value.fileManagerDirInPhotoClearItems;
                      if (fileManagerD1 != null) {
                         iterator1 = fileManagerD1.iterator();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            if (TextUtils.isEmpty(str5) || PatchProxy.applyVoidOneRefs(str5, null, uob, "3")) {
                               continue ;
                            }else {
                               uFile1 = b.a(-1504323719).d(str5);
                               if (uFile1.exists()) {
                                  objArray4 = new Object[0];
                                  a.D().w("DiskUnSufficientPostClear", "PostWork LowDisk Mode File Clear:  FileManager DirInPhoto\'s subDir："+uFile1.getAbsolutePath()+str4+b.q(uFile1), objArray4);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                      fileManagerD1 = value.fileManagerDirInCacheClearItems;
                      if (fileManagerD1 != null) {
                         iterator1 = fileManagerD1.iterator();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            if (TextUtils.isEmpty(str5) || PatchProxy.applyVoidOneRefs(str5, null, uob, str2)) {
                               continue ;
                            }else {
                               uFile1 = b.a(-1504323719).c(str5);
                               if (uFile1.exists()) {
                                  objArray4 = new Object[0];
                                  a.D().w("DiskUnSufficientPostClear", "PostWork LowDisk Mode File Clear:  FileManager DirInCache\'s subDir："+uFile1.getAbsolutePath()+str4+b.q(uFile1), objArray4);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                      if (value.externalFileDirClearItems != null && ((Environment.getExternalStorageState()).equals("mounted") && PermissionUtils.a(e0.b, "android.permission.WRITE_EXTERNAL_STORAGE"))) {
                         iterator1 = value.externalFileDirClearItems.iterator();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            if (!TextUtils.isEmpty(str5)) {
                               obj3 = null;
                               if (PatchProxy.applyVoidOneRefs(str5, obj3, uob, str)) {
                                  continue ;
                               }else {
                                  File uFile2 = new File(e0.b.getExternalFilesDir(obj3), str5);
                                  if (uFile2.exists()) {
                                     objArray5 = new Object[0];
                                     a.D().w("DiskUnSufficientPostClear", "PostWork LowDisk Mode File Clear:  ExternalFileDir\'s subDir："+uFile2.getAbsolutePath()+str4+b.q(uFile2), objArray5);
                                  }else {
                                     continue ;
                                  }
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                      fileManagerD1 = value.fileManagerDirInPrivateRootClearItems;
                      if (fileManagerD1 != null) {
                         iterator1 = fileManagerD1.iterator();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            if (TextUtils.isEmpty(str5) || PatchProxy.applyVoidOneRefs(str5, null, uob, "6")) {
                               continue ;
                            }else {
                               uFile1 = b.a(-1504323719).g(str5);
                               if (uFile1.exists()) {
                                  objArray5 = new Object[0];
                                  a.D().w("DiskUnSufficientPostClear", "PostWork LowDisk Mode File Clear: FileManager DirInPrivateRoot\'s subDir: "+uFile1.getAbsolutePath()+str4+b.q(uFile1), objArray5);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      label_04c3 :
                         b = 0;
                         objArray3 = new Object[b];
                         p3.D().w("PostUtils", "clearPrivateCacheDir\(\) called", objArray3);
                         PostUtils.B(PostUtils.m());
                      }else {
                         goto label_04c3 ;
                      }
                   }else {
                      goto label_04c3 ;
                   }
                }
             }else {
                obj1 = null;
                goto label_0240 ;
             }
          }else {
             b = 0;
          }
          objArray3 = new Object[b];
          a.D().w("PostWorkManager", "clearOutput\(\) Clear cache finish .", objArray3);
          obj = DeviceSampleEnum.DEVICE_SAMPLE_THOUSANDTH;
          f = 0.10f;
          s os = s.class;
          if (PatchProxy.isSupport(os)) {
             obj2 = PatchProxy.applyTwoRefs(obj, Float.valueOf(f), null, os, str2);
             if (obj2 != PatchProxyResult.class) {
                b2 = obj2.booleanValue();
             label_0514 :
                if (b2) {
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.a0("cost", Long.valueOf((System.currentTimeMillis() - l)));
                   jsonObject.a0("isUserActive", Integer.valueOf(a.f().j()));
                   u1.T("", "POST_CLEAR_CACHE", jsonObject.toString());
                }
             }
          }
          i = (s.b(obj) && s.c(f))? 1: 0;
          b2 = i;
          goto label_0514 ;
       }else {
          Object[] objArray7 = new Object[0];
          a.D().w("PostWorkManager", "clearOutput\(\) Clear cache called while posting. Ignore.", objArray7);
       }
       return;
    }
    public void l(PostWorkInfo p0,w0 p1){
       Object[] objArray;
       PostEncodeInfo encodeInfo;
       Object[] objArray2;
       PostWorkManager d;
       boolean b1;
       Object obj = this;
       PostStatus postStatus = p0;
       Iterator obj1 = p1;
       s0 os0 = s0.class;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.applyVoidTwoRefs(postStatus, obj1, obj, postWorkMana, "34")) {
          return;
       }
       PostStatus status = p0.getStatus();
       if (status == null) {
          PostUtils.D("PostWorkManager", "onStatusChanged\(\) status is null", new IllegalStateException("status is null"));
          return;
       }else if(status == postStatus.mLastNotifyStatus && status.isForbiddenDuplicateEvent()){
          objArray = new Object[0];
          a.D().A("PostWorkManager", "onStatusChanged: find duplicate notification "+status, objArray);
          return;
       }else {
          postStatus.mLastNotifyStatus = status;
          Object[] objArray1 = new Object[0];
          a.D().w("PostWorkManager", "onStatusChanged: status: "+status+", id: "+p0.getId(), objArray1);
          UploadResult uploadResult = 2;
          Throwable throwable = null;
          boolean b = true;
          switch (PostWorkManager$e.a[status.ordinal()]){
              case 6:
                encodeInfo = p0.getEncodeInfo();
                if (encodeInfo != null) {
                   throwable = encodeInfo.getThrowable();
                }
                if (postStatus.mRecoverStatus == null) {
                   int i = 0x7f110668;
                   if (PostWorkErrorTips.a(throwable)) {
                      i.a(i, R.string.arg_RES_7f103d87);
                   }else if(throwable != null){
                      ExceptionHandler.handleCaughtException(throwable);
                   }
                   i.a(i, R.string.arg_RES_7f1036e2);
                }
                if (obj1 != null && (obj1.b != null && (p0.isPublished() && postStatus.mIsFailMsgLogger == null))) {
                   postStatus.mIsFailMsgLogger = b;
                   obj.d.j(postStatus, b);
                }
             label_0371 :
                obj.r(postStatus, throwable);
                break;
              case 7:
                objArray = new Object[0];
                a.D().w("PostWorkManager", "encode canceled: postWorkInfo id: "+p0.getId(), objArray);
                break;
              case 8:
                objArray2 = new Object[0];
                a.D().w("PostWorkManager", "upload completed: postWorkInfo id: "+p0.getId(), objArray2);
                obj.V3(d.a(-447917650).XV());
                obj.j.h(postStatus);
                if (p0.isPublished()) {
                   if (!PatchProxy.applyVoidOneRefs(postStatus, throwable, os0, "15")) {
                      String str3 = "EncodingUtils";
                      if (p0.getEncodeInfo() == null) {
                         objArray2 = new Object[0];
                         a.D().s(str3, "deleteTempEncodingFileIfNeeded encodeInfo is null", objArray2);
                      }else if(p0.getEncodeInfo().mEncodeParams == null){
                         objArray2 = new Object[0];
                         a.D().s(str3, "deleteTempEncodingFileIfNeeded encode params is null", objArray2);
                      }else if(TextUtils.x(p0.getEncodeInfo().mEncodeParams.mEncodingTemporaryFilePath)){
                         objArray2 = new Object[0];
                         a.D().s(str3, "deleteTempEncodingFileIfNeeded encoding temporary file path is null", objArray2);
                      }else {
                         Object[] objArray3 = new Object[0];
                         a.D().s(str3, "upload complete, delete encode temporary file: "+p0.getEncodeInfo().mEncodeParams.mEncodingTemporaryFilePath, objArray3);
                         c.a(new f1(postStatus));
                      }
                   }
                   String str = "3";
                   if (!PatchProxy.applyVoidOneRefs(postStatus, throwable, os0, str)) {
                      if (p0.getUploadInfo() == null) {
                         PostUtils.x("saveFileToAlbum", "postWorkInfo为空,数据异常");
                      }else if(!TextUtils.x(p0.getSessionId())){
                         objArray = new Object[b];
                         objArray[0] = p0.getSessionId();
                         a.D().w("saveFileToSystemAlbum", "start", objArray);
                      }
                      if (!b.c(a.w, 0).getBoolean("key_save_album", 0) && (s0.k(p0) && !p0.getUploadInfo().isStory())) {
                         t.fromCallable(o0.b).subscribeOn(d.c).observeOn(d.a).flatMap(new c0(postStatus)).subscribe(new o1(postStatus), new n0(postStatus));
                      }
                   }
                   this.o(p0);
                   d = obj.d;
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoidOneRefs(postStatus, d, p.class, str)) {
                      PostEncodeInfo encodeInfo1 = p0.getEncodeInfo();
                      UploadInfo uploadInfo = p0.getUploadInfo();
                      int i1 = d.g(uploadInfo);
                      int i2 = d.h(postStatus);
                      ClientTaskDetail$UploadAtlasDetailPackage uploadAtlasD = b0.c(uploadInfo);
                      String str1 = "";
                      String photoId = (uploadInfo != null && uploadInfo.getUploadResult() != null)? uploadInfo.getUploadResult().getPhotoId(): str1;
                      if (uploadInfo != null) {
                         str1 = uploadInfo.getSessionId();
                      }
                      String str2 = str1;
                      UploadInfo mUploadStart = (uploadInfo != null)? uploadInfo.mUploadStartTime: System.currentTimeMillis();
                      ClientTaskDetail$TaskDetailPackage taskDetailPa = d.d(i1, i2, 2, uploadAtlasD, uploadInfo, encodeInfo1);
                      d.b(taskDetailPa, uploadInfo);
                      d.a(taskDetailPa, encodeInfo1);
                      ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                      resultPackag.domain = 3;
                      resultPackag.timeCost = System.currentTimeMillis() - mUploadStart;
                      x ox = mUploadStart;
                      x ox1 = mUploadStart;
                      ClientTaskDetail$TaskDetailPackage taskDetailPa1 = taskDetailPa;
                      ox = new x(d, uploadInfo, h$b.d(7, i1), str2, d.c(photoId), resultPackag, taskDetailPa1, p0);
                      a0.c.execute(ox1);
                   }
                   obj.h.h(postStatus);
                }
                break;
              case 9:
                UploadInfo obj2 = PatchProxy.applyOneRefs(postStatus, obj, postWorkMana, "36");
                if (obj2 != PatchProxyResult.class) {
                   b1 = obj2.booleanValue();
                }else if(p0.getUploadInfo() != null && IUploadRequest$UploadPostType.INTOWN == p0.getUploadInfo().getUploadPostType()){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                   return;
                }else if(!p0.getRecoverStatus() && (p0.isPublished() && postStatus.mIsFailMsgLogger == null)){
                   postStatus.mIsFailMsgLogger = b;
                   obj.d.j(postStatus, uploadResult);
                   obj.j.a(postStatus);
                }
             label_00fd :
                obj2 = p0.getUploadInfo();
                if (obj2 != null) {
                   obj2.setIsPipelineFailedThenFallback(0);
                   obj2.setPipelineStatsParams(throwable);
                   if (p0.getEncodeInfo() != null && (obj2.getThrowable() != null && obj2.getThrowable().getCause() instanceof FileNotFoundException)) {
                      p0.getEncodeInfo().mStatus = EncodeInfo$Status.FAILED;
                      objArray2 = new Object[0];
                      a.D().w("PostWorkManager", "upload failed: FileNotFoundException id: "+p0.getId()+", set encode status = FAILED", objArray2);
                   }
                }
                if (obj2 != null) {
                   throwable = obj2.getThrowable();
                }
                obj.r(postStatus, throwable);
                break;
              case 10:
                obj.d.i(postStatus, uploadResult);
                break;
              case 11:
                objArray = new Object[0];
                a.D().w("PostWorkManager", "upload succeed: postWorkInfo id: "+p0.getId(), objArray);
                if (PostExperimentUtils.J0()) {
                   obj.j.h(postStatus);
                }
                break;
              default:
          }
       label_0374 :
          obj1 = new ArrayList(obj.g).iterator();
          while (obj1.hasNext()) {
             e uoe = obj1.next();
             if (a.a(p0)) {
                if (uoe instanceof d) {
                   uoe.w9(status, postStatus);
                   objArray = new Object[0];
                   a.D().w("PostWorkManager", "onStatusChanged invalid post work but no ui", objArray);
                }
                objArray = new Object[0];
                a.D().w("PostWorkManager", "onStatusChanged invalid post work", objArray);
             }else {
                uoe.w9(status, postStatus);
             }
          }
          return;
       }
    }
    public boolean l3(int p0,boolean p1){
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, postWorkMana, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostWorkManager", "setVisible\(\) called with: id = ["+p0+"], visible = ["+p1+"]", objArray);
       PostWorkInfo postWorkInfo = this.c.get(Integer.valueOf(p0));
       if (postWorkInfo.getEncodeInfo() != null && this.a.L(postWorkInfo.getEncodeInfo().getId(), p1)) {
          i = true;
       }
       return i;
    }
    public PipelineKeyResponse l4(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "getPipelineKeyResponseCache taskId: "+p0, objArray);
       return this.k.get(p0);
    }
    public final void m(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "58")) {
          return;
       }
       k1.o(new b0(this, p0));
       return;
    }
    public boolean m4(Workspace p0,EditorSdk2V2$VideoEditorProject p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PostWorkManager.class, "53");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return a0.g();
    }
    public final void n(PostWorkInfo p0,w0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostWorkManager.class, "29")) {
          return;
       }
       if (p0.getUploadInfo() == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "registerUploadTask postWorkInfo id: "+p0.getId()+", uploadInfo id: "+p0.getUploadInfo().getId(), objArray);
       this.m(p0);
       this.b.b(new PostWorkManager$c(this, p0, p1));
       return;
    }
    public boolean n2(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PostWorkManager postWorkMana = PostWorkManager.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, postWorkMana, "48");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a.getBoolean("DisableParallelShoot", b) || (!l.c("KEY_DISABLE_PARALLEL_SHOOT", b) || !this.z0())) {
          Object obj1 = PatchProxy.apply(objArray, this, postWorkMana, "49");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             Iterator iterator = this.c.values().iterator();
             int i1 = 0;
             while (iterator.hasNext()) {
                PostWorkInfo postWorkInfo = iterator.next();
                if (postWorkInfo != null && this.j4(postWorkInfo)) {
                   i1 = i1 + 1;
                }
             }
             obj = new Object[b];
             a.D().w("PostWorkManager", "getVisibleWorkCount: "+i1, obj);
             i = i1;
          }
          if (i < a.t().a("numberParallelShoot", 10)) {
          label_008a :
             return b;
          }
       }
       b = true;
       goto label_008a ;
    }
    public boolean n4(int p0){
       PostWorkInfo obj;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, postWorkMana, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.c.get(Integer.valueOf(p0));
       Object[] objArray = new Object[]{"id",Integer.valueOf(p0)};
       a.D().w("PostWorkManager", "isEncodeCompleted", objArray);
       if (obj != null) {
          obj = obj.mEncodeInfo;
          if (obj != null && obj.getStatus() == EncodeInfo$Status.COMPLETE) {
             return 1;
          }
       }
       return this.i.contains(Integer.valueOf(p0));
    }
    public final void o(PostWorkInfo p0){
       String sessionId;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "59")) {
          return;
       }
       if (p0.getEncodeInfo() != null) {
          sessionId = p0.getEncodeInfo().getSessionId();
       }else if(p0.getUploadInfo() != null){
          sessionId = p0.getUploadInfo().getSessionId();
       }else {
          sessionId = "";
       }
       this.k.remove(sessionId);
       return;
    }
    public boolean o1(int p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(PostWorkManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, PostWorkManager.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.q(p0, p1, p2, p2);
    }
    public void o4(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "retryAll", objArray);
       Iterator iterator = this.c.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue().getStatus() == PostStatus.UPLOAD_FAILED || uEntry.getValue().getStatus() == PostStatus.ENCODE_FAILED) {
             if (p0 != null) {
                try{
                   p0.accept(uEntry.getValue());
                }catch(java.lang.Exception e5){
                   PostUtils.D("PostWorkManager", "retryAll", e5);
                }
             }
          }
          this.o1(uEntry.getKey().intValue(), 0, true);
       }
       return;
    }
    public void p(PostWorkInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostWorkManager.class, "57")) {
          return;
       }
       k1.o(new a0(this, p0));
       return;
    }
    public List p4(r p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 == null) {
          return new ArrayList(this.c.values());
       }
       Iterator iterator = this.c.values().iterator();
       while (iterator.hasNext()) {
          PostWorkInfo postWorkInfo = iterator.next();
          if (postWorkInfo == null) {
             break ;
          }else if(p0.test(postWorkInfo)){
             obj.add(postWorkInfo);
          }
       }
       return obj;
    }
    public boolean q(int p0,boolean p1,boolean p2,boolean p3){
       PostWorkInfo obj;
       Object[] objArray1;
       Object[] objArray2;
       PostWorkInfo mEncodeInfo;
       PostLogger postLogger;
       Object[] objArray3;
       boolean b2;
       PostEncodeInfo encodeInfo;
       boolean b3;
       Object[] objArray4;
       PostLogger postLogger1;
       UploadInfo mVideoContex;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PostWorkManager postWorkMana = PostWorkManager.class;
       if (PatchProxy.isSupport(postWorkMana)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, PostWorkManager.class, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       g.a(e7.a().edit().putLong("key_last_auto_retry_time", System.currentTimeMillis()));
       obj = this.c.get(Integer.valueOf(p0));
       boolean b = false;
       if (obj != null) {
          a uoa = null;
          if (!PatchProxy.isSupport(postWorkMana) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p2), this, postWorkMana, "10")) {
             if (p2) {
                obj.mUploadTaskType = 1;
             }
             PostWorkInfo mUploadInfo1 = obj.mUploadInfo;
             if (mUploadInfo1 != null) {
                mVideoContex = mUploadInfo1.mVideoContext;
             }else {
                mUploadInfo1 = obj.mRequest;
                if (mUploadInfo1 != null) {
                   w0 b4 = mUploadInfo1.b;
                   if (b4 != null) {
                      mVideoContex = b4.getVideoContext();
                   }
                }
                mVideoContex = uoa;
             }
             if (mVideoContex != null) {
                int i = 2;
                if (obj.mUploadTaskType != i) {
                   i = 1;
                }
                mVideoContex.G1(i);
             }else {
                objArray4 = new Object[b];
                a.D().t("PostWorkManager", "setIsRetry: no videoContext", objArray4);
             }
          }
          e.a().d(obj.getSessionId(), "retry_task");
          this.o(obj);
          obj.mIsFailMsgLogger = b;
          Object[] objArray = new Object[b];
          a.D().w("PostWorkManager", "isFallback: "+p1, objArray);
          String str = "retry";
          if (p1) {
             if (obj.mUploadInfo != null) {
                objArray1 = new Object[b];
                a.D().w("PostWorkManager", "retry disable pipeline upload", objArray1);
                obj.mUploadInfo.setIsPipelineFailedThenFallback(true);
                obj.mUploadInfo.setEnablePipelineUpload(b);
                obj.mUploadInfo.setStatus(IUploadInfo$Status.FAILED);
                this.b.r(obj.mUploadInfo);
             }
             this.m(obj);
             objArray2 = new Object[b];
             a.D().w("PostWorkManager", "retry: sessionId: "+obj.getSessionId(), objArray2);
             mEncodeInfo = obj.mEncodeInfo;
             if (mEncodeInfo == null || mEncodeInfo.getStatus() == EncodeInfo$Status.COMPLETE) {
                objArray1 = new Object[b];
                a.D().w("PostWorkManager", "retry upload", objArray1);
                postLogger = new PostLogger().c("PostWorkManager");
                postLogger.k(obj.getUploadInfo().mSessionId);
                postLogger.h(PostSubTaskEvent.UPLOAD_EVENT).j(PostLogger$Status.BEGIN).i(obj.getUploadInfo().getId()).g(str).d();
                return this.b.p(obj.getUploadInfo().getId());
             }else {
                objArray3 = new Object[b];
                a.D().w("PostWorkManager", "retry skip upload, encode status: "+obj.mEncodeInfo.getStatus(), objArray3);
                return true;
             }
          }else {
             obj.setRecoverStatus(b);
             float f = 0;
             if (obj.mUploadInfo != null) {
                if (p3) {
                   objArray = new Object[b];
                   a.D().w("PostWorkManager", "user retry: id: "+obj.getId(), objArray);
                   obj.mFailedProgress = f;
                   obj.mCurrentUiProgress = f;
                   p1.mFallbackCount = b;
                   this.d.k(obj);
                }
                w0 b1 = obj.mRequest.b;
                if (b1 != null && b1.isEnablePipelineUpload()) {
                   objArray2 = new Object[b];
                   a.D().w("PostWorkManager", "retry enable rickon", objArray2);
                   obj.mUploadInfo.setEnablePipelineUpload(true);
                }
             }
          label_01da :
             if (obj.getEncodeInfo() != null && !this.a.e(obj.getEncodeInfo().getId())) {
                objArray2 = new Object[b];
                a.D().w("PostWorkManager", "retry addEncodeTaskListener", objArray2);
                this.b(obj, obj.getEncodeInfo().getId());
             }
             PostEncodeInfo postEncodeIn = 0x3f800000;
             if (this.h.n(obj.getEncodeInfo(), obj.getUploadInfo())) {
                if (PostExperimentUtils.h()) {
                   Object obj1 = PatchProxy.applyOneRefs(obj, this, postWorkMana, "7");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else {
                      objArray1 = new Object[b];
                      a.D().w("PostWorkManager", "retryByteStream", objArray1);
                      obj.mPauseProgress = f;
                      if (obj.getEncodeInfo() != null && obj.getEncodeInfo().getStatus() != EncodeInfo$Status.ENCODING) {
                         objArray1 = new Object[b];
                         a.D().w("PostWorkManager", "retryByteStream encode status != encoding", objArray1);
                         obj.getEncodeInfo().setByteStreamEncodeInfo(uoa);
                         b2 = this.a.H(obj.getEncodeInfo().getId());
                      }else {
                         b2 = true;
                      }
                      objArray1 = this.h.f(obj);
                      if (b2 && objArray1) {
                         b = 1;
                      }
                      b2 = b;
                   }
                   return b2;
                }else {
                   mEncodeInfo = obj.mEncodeInfo;
                   if (mEncodeInfo != null && mEncodeInfo.getStatus() == EncodeInfo$Status.FAILED) {
                      objArray1 = new Object[b];
                      a.D().w("PostWorkManager", "retry encodeInfo is fail", objArray1);
                      mEncodeInfo.mStatus = EncodeInfo$Status.PENDING;
                   }
                   mEncodeInfo = obj.mEncodeInfo;
                   b2 = (mEncodeInfo != null && mEncodeInfo.getStatus() == EncodeInfo$Status.ENCODING)? true: false;
                   objArray = new Object[b];
                   a.D().w("PostWorkManager", "retry onlyUploadFailed="+b2, objArray);
                   if (b2) {
                      this.h.g(obj);
                      return true;
                   }else {
                      b2 = this.h.f(obj);
                      encodeInfo = obj.getEncodeInfo();
                      Object obj2 = PatchProxy.applyOneRefs(encodeInfo, this, postWorkMana, "6");
                      if (obj2 != patchProxyRe) {
                         b3 = obj2.booleanValue();
                      }else if(encodeInfo != null){
                         objArray4 = new Object[b];
                         a.D().w("PostWorkManager", "encodeCompleteRetryWholeFile: file="+encodeInfo.getOutputPath(), objArray4);
                      }
                      if (encodeInfo != null && (encodeInfo.getStatus() == EncodeInfo$Status.COMPLETE && (b.S(new File(encodeInfo.getOutputPath())) && !this.h.b(encodeInfo, uoa)))) {
                         b3 = true;
                      }else {
                         b3 = false;
                      }
                      objArray4 = new Object[b];
                      a.D().w("PostWorkManager", "retry enable rickon uploadRet: "+b2+" retryWholeFile="+b3, objArray4);
                      if (encodeInfo != null && !b3) {
                         postLogger1 = new PostLogger().c("PostWorkManager");
                         postLogger1.k(obj.getEncodeInfo().getSessionId());
                         postLogger1.h(PostSubTaskEvent.ENCODE_EVENT).i(String.valueOf(obj.getEncodeInfo().getId())).j(PostLogger$Status.BEGIN).g(str).d();
                         objArray3 = new Object[b];
                         a.D().w("PostWorkManager", "retry encodeRet: "+this.a.H(obj.getEncodeInfo().getId()), objArray3);
                      }else if(encodeInfo != null){
                         encodeInfo.mProgress = postEncodeIn;
                      }
                      this.h.d(obj);
                      this.j.a(obj);
                      objArray3 = new Object[b];
                      a.D().w("PostWorkManager", " retry refresh cache status :: "+obj.getStatus(), objArray3);
                      return true;
                   }
                }
             }else if(obj.getEncodeInfo() != null && obj.getEncodeInfo().getStatus() == EncodeInfo$Status.FAILED){
                if (obj.getUploadInfo() != null) {
                   obj.getUploadInfo().setStatus(IUploadInfo$Status.PENDING);
                }
                b2 = this.a.H(obj.getEncodeInfo().getId());
                postLogger1 = new PostLogger().c("PostWorkManager");
                postLogger1.k(obj.getEncodeInfo().getSessionId());
                postLogger1.h(PostSubTaskEvent.ENCODE_EVENT).i(String.valueOf(obj.getEncodeInfo().getId())).j(PostLogger$Status.BEGIN).g(str).d();
                objArray2 = new Object[b];
                a.D().w("PostWorkManager", "retry disable rickon encode ret: "+b2, objArray2);
                this.j.a(obj);
                return b2;
             }else {
                PostWorkInfo mUploadInfo = obj.mUploadInfo;
                if (mUploadInfo != null && mUploadInfo.getStatus() == IUploadInfo$Status.FAILED) {
                   if (!this.h.n(obj.mEncodeInfo, obj.mUploadInfo)) {
                      postLogger = new PostLogger().c("PostWorkManager");
                      postLogger.k(obj.getUploadInfo().mSessionId);
                      postLogger.h(PostSubTaskEvent.UPLOAD_EVENT).j(PostLogger$Status.BEGIN).i(obj.getUploadInfo().getId()).g(str).d();
                      if (obj.getEncodeInfo() != null && obj.getEncodeInfo().getStatus() == EncodeInfo$Status.COMPLETE) {
                         objArray1 = new Object[b];
                         a.D().w("PostWorkManager", "retry\(\) encode over set progress to 1 ", objArray1);
                         postLogger.mProgress = postEncodeIn;
                      }
                      b2 = this.b.p(obj.mUploadInfo.getId());
                   }else {
                      b2 = this.h.f(obj);
                   }
                   this.j.a(obj);
                   objArray2 = new Object[b];
                   a.D().w("PostWorkManager", "refresh cache status :: "+obj.getStatus(), objArray2);
                   return b2;
                }
             }
          }
       }
    label_0502 :
       objArray3 = new Object[b];
       a.D().t("PostWorkManager", "retry failed, no postWorkInfo matched to uploadId = "+p0, objArray3);
       return b;
    }
    public int q0(b p0){
       Object[] objArray;
       w0 obj = PatchProxy.applyOneRefs(p0, this, PostWorkManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       g.a(e7.a().edit().putLong("key_last_auto_retry_time", System.currentTimeMillis()));
       obj = p0.a;
       PostArguments postArgument = null;
       if (obj != null) {
          int i = this.a.a(obj);
          PostLogger postLogger = new PostLogger().c("PostWorkManager").e("PostWorkManager");
          postLogger.k(p0.a.getSessionId());
          postLogger.h(PostSubTaskEvent.ENCODE_EVENT).i(String.valueOf(i)).j(PostLogger$Status.BEGIN).f("add").d();
          PostEncodeInfo postEncodeIn = this.a.k(i);
          if (postEncodeIn.mWorkspace != null) {
             objArray = new Object[0];
             a.D().w("PostWorkManager", "add post work draft type: "+postEncodeIn.mWorkspace.getType(), objArray);
          }
          objArray = new Object[0];
          a.D().w("PostWorkManager", "add mId: "+this.f, objArray);
          PostWorkManager tf = this.f;
          this.f = tf + 1;
          if (i.h()) {
             postArgument = i.g();
          }
          PostWorkInfo postWorkInfo = new PostWorkInfo(tf, postEncodeIn, postArgument);
          postWorkInfo.mSessionId = postEncodeIn.mSessionId;
          postWorkInfo.mCacheId = this.f();
          postWorkInfo.mRequest = p0;
          p0.b = p0.b;
          this.m(postWorkInfo);
          e.a().d(postWorkInfo.getSessionId(), "add_encode_task");
          Object[] objArray1 = new Object[0];
          a.D().w("PostWorkManager", "add: sessionId: "+postWorkInfo.getId(), objArray1);
          this.b(postWorkInfo, i);
          b.a(0x6223c5ca).a(postWorkInfo, postWorkInfo.getEncodeInfo());
          this.a.I(postWorkInfo.getEncodeInfo());
          return postWorkInfo.mId;
       }else if(p0.b != null){
          return this.c(p0, postArgument).mId;
       }else {
          throw new IllegalStateException("Encode request and upload request are both null");
       }
    }
    public final void r(PostWorkInfo p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostWorkManager.class, "35")) {
          return;
       }
       if (s6.e()) {
          int i = 0;
          if (p1 == null) {
             Object[] objArray = new Object[i];
             a.D().w("PostWorkManager", "updatePostCacheWhenFailed: null return", objArray);
             return;
          }else if(PostWorkErrorTips.a(p1)){
             p0.mErrorType = AutoRetryConfig.NO_SPACE;
          }else if(PostUtils.u(p1)){
             p0.mErrorType = AutoRetryConfig.NO_NET;
          }else {
             p0.mErrorType = AutoRetryConfig.OTHER_ERRORS;
          }
          Object[] objArray1 = new Object[i];
          a.D().w("PostWorkManager", "updatePostCacheWhenFailed:  errorType="+p0.mErrorType+","+p1, objArray1);
          this.j.a(p0);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, PostWorkManager.class, "65")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostWorkManager", "release: ", objArray);
       this.o.onNext(PostWorkManager$LoadPostCacheStatus.STATUS_CACHE_PENDING);
       return;
    }
    public final void s(w0 p0,PostWorkInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostWorkManager.class, "27")) {
          return;
       }
       p1.mUploadInfo.updateUploadInfo(UploadInfo.generateUploadInfo(p0.b));
       return;
    }
    public boolean z0(){
       Iterator obj = PatchProxy.apply(null, this, PostWorkManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.values().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          int i = PostWorkManager$e.a[obj.next().getStatus().ordinal()];
          if (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5)))) {
             continue ;
          }else {
             break ;
          }
       }
       return true;
    }
}
