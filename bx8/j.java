package bx8.j;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import crd.a;
import java.lang.String;
import k2b.u1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qr4.i;
import com.yxcorp.utility.TextUtils;
import qr4.m$k0;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.AuditFrameUploadParam;
import java.lang.reflect.Type;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.zip.ZipOutputStream;
import java.io.File;
import java.util.List;
import java.util.zip.ZipEntry;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import qkd.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;
import java.lang.System;
import com.yxcorp.gifshow.upload.AuditFrameSwitch;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import vaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import brd.t;
import java.util.Collections;
import bx8.h;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import h69.j;
import java.lang.CharSequence;
import maa.a;
import haa.a;
import bx8.i;
import java.util.ArrayList;
import bx8.g;
import bx8.e;
import erd.o;
import bx8.b;
import bx8.c;
import erd.g;
import crd.b;
import cx8.h;
import cx8.g;
import okhttp3.MultipartBody$Part;
import ojd.e;
import bx8.a;
import bx8.d;

public final class j	// class@000478
{
    public final c a;
    public int b;
    public int c;
    public final String d;
    public String e;
    public final AuditFrameUploadParam f;
    public a g;
    public int h;
    public int i;

    public void j(c p0,VideoContext p1){
       super();
       this.b = 600;
       this.c = 70;
       this.g = new a();
       int i = 0;
       this.h = i;
       this.i = i;
       this.a = p0;
       String str = u1.f();
       Objects.requireNonNull(p1);
       if (PatchProxy.applyVoidOneRefs(str, p1, VideoContext.class, "188")) {
       }else {
          VideoContext.b();
          i b = p1.a.b;
          if (b != null) {
             b.P = TextUtils.k(str);
          }
       }
       this.d = str;
       AuditFrameUploadParam value = a.t().getValue("rawFrameUploadParam2", AuditFrameUploadParam.class, null);
       this.f = value;
       if (value != null) {
          this.b = value.mShortSideLength;
          this.c = (int)(value.mQuality * 100.00f);
          Object[] objArray = new Object[i];
          a.b().s("AuditInfoUploadManager", "update upload param, shortSide: "+this.b+", compressQuality: "+this.c, objArray);
       }
       return;
    }
    public final void a(ZipOutputStream p0,File p1,List p2){
       File[] uFileArray;
       int len;
       int i;
       j oj = j.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "15")) {
          return;
       }
       p2.add(p1.getName());
       if (p1.isDirectory()) {
          p2.add("/");
       }
       StringBuilder str = PatchProxy.applyOneRefs(p2, this, oj, "16");
       if (str != PatchProxyResult.class) {
       }else {
          str = "";
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next();
          }
          str = str;
       }
       p0.putNextEntry(new ZipEntry(str));
       if (p1.isFile() && !PatchProxy.applyVoidTwoRefs(p1, p0, null, oj, "17")) {
          BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p1));
          try{
             c.b(uBufferedInp, p0);
             uBufferedInp.close();
          }catch(java.lang.Exception e0){
             PostUtils.D("AuditInfoUploadManager", "close", e0);
          }
       }
    }
    public void b(boolean p0){
       boolean b;
       Object[] obj1;
       boolean b1;
       t ot;
       Object[] objArray2;
       List list;
       t ot1;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "2")) {
          return;
       }
       if (this.f == null) {
          Object[] objArray = new Object[0];
          a.b().s("AuditInfoUploadManager", "auditFrameUploadParam is null", objArray);
          return;
       }else {
          Object[] objArray1 = null;
          File uFile = PatchProxy.apply(objArray1, this, oj, "13");
          if (uFile != patchProxyRe) {
          }else {
             File uFile1 = new File(PostUtils.q("[>|39|>]", "audit_compress_dir"), this.a.V0()+"_"+System.currentTimeMillis());
             if (!uFile1.exists()) {
                obj1 = new Object[0];
                a.b().s("AuditInfoUploadManager", "initDirIfNeeded: ret: "+uFile1.mkdirs(), obj1);
             }
             uFile = uFile1;
          }
          AuditFrameSwitch obj = PatchProxy.apply(objArray1, this, oj, "4");
          String str = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = AuditFrameSwitch.getSwitch();
             if (this.a.a1() == Workspace$Type.PHOTO_MOVIE) {
                b = obj.mPhotoMovieEnabled;
             }else if(this.a.a1() == Workspace$Type.ALBUM_MOVIE){
                b = obj.mAlbumMovieEnabled;
             }else if(this.a.d1().F().b.S0 != null){
                b = obj.mAiCutEnabled;
             }else if(this.a.a1() == Workspace$Type.KUAISHAN && (obj.mKuaiShanEnabled != null && this.a.T0() != Workspace$Source.MEDIA_SCENE)){
                b = 1;
             }else {
                b = null;
             }
          }
          if (b != null) {
             obj1 = PatchProxy.apply(objArray1, this, oj, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.a.F0() != null && this.a.F0().v() != null){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                ot = PatchProxy.apply(objArray1, this, oj, "6");
                if (ot != patchProxyRe) {
                }else {
                   objArray2 = new Object[0];
                   a.b().s("AuditInfoUploadManager", "generateMessageWrapper kuaishan", objArray2);
                   if (this.a.F0() == null) {
                      objArray2 = new Object[0];
                      a.b().t("AuditInfoUploadManager", "filterAsset kuaishan draft is null", objArray2);
                      list = Collections.emptyList();
                   }else {
                      list = this.a.F0().z();
                   }
                   ot = t.fromCallable(new h(this, list)).subscribeOn(d.c);
                }
             }else {
                ot = PatchProxy.apply(objArray1, this, oj, "5");
                if (ot != patchProxyRe) {
                }else {
                   objArray2 = new Object[0];
                   a.b().s("AuditInfoUploadManager", "generateAssetFilePathList video template asset", objArray2);
                   String str1 = j.d(this.a, str);
                   if (TextUtils.x(str1) || str1.equals("-1")) {
                      objArray2 = new Object[0];
                      a.b().w("AuditInfoUploadManager", "generateAssetFilePathList: video template origin, return", objArray2);
                      ot1 = t.just(new ArrayList());
                   label_01b0 :
                      ot = ot1;
                   }else {
                      uoa = a.c(this.a);
                      ot1 = t.fromCallable(new i(uoa.z(), uoa)).subscribeOn(d.c);
                      goto label_01b0 ;
                   }
                }
             }
          }else {
             ot = PatchProxy.applyOneRefs(uFile, this, oj, "7");
             if (ot != patchProxyRe) {
             }else {
                objArray2 = new Object[0];
                a.b().s("AuditInfoUploadManager", "generateMessageWrapper assetDraft", objArray2);
                uoa = this.a.o0();
                if (uoa == null) {
                   objArray2 = new Object[0];
                   a.b().t("AuditInfoUploadManager", "filterFace assetDraft is null", objArray2);
                   list = Collections.emptyList();
                }else {
                   list = uoa.z();
                }
                ot1 = t.fromCallable(new g(this, uFile, list)).subscribeOn(d.c);
                goto label_01b0 ;
             }
          }
          this.g.c(ot.map(new e(this, b, uFile)).observeOn(d.a).subscribe(new b(this, p0), c.b));
          return;
       }
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "10")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("AuditInfoUploadManager", "real upload", objArray);
       this.g.c(g.a().d(e.d("zipFile", new File(p0)), p1, this.h, this.i).subscribe(new a(this), d.b));
       return;
    }
}
