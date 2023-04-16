package com.yxcorp.gifshow.upload.r1$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.yxcorp.gifshow.upload.r1$a;
import java.lang.Object;
import com.yxcorp.gifshow.upload.r1$b$a;
import dnc.m2;
import com.yxcorp.gifshow.upload.r1$b$b;
import com.yxcorp.gifshow.upload.r1$b$c;
import com.yxcorp.gifshow.upload.s1;
import erd.g;
import enc.a0;
import com.yxcorp.gifshow.upload.t1;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.Boolean;
import oa0.a;
import android.content.SharedPreferences;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.o1;
import com.yxcorp.gifshow.postwork.e;
import java.lang.System;
import com.yxcorp.gifshow.upload.r1$b$d;
import com.yxcorp.gifshow.upload.g;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import lnc.i1;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import njd.a;
import com.yxcorp.gifshow.upload.UploadCoverResult;
import java.util.HashMap;
import okhttp3.MultipartBody$Part;
import ojd.e;
import java.util.Map;
import gnc.b;
import dnc.c;
import t45.d;
import brd.z;
import dnc.d;
import com.yxcorp.gifshow.upload.c;
import erd.o;
import com.yxcorp.gifshow.upload.d;
import dnc.f;
import com.yxcorp.gifshow.upload.u1;
import crd.b;
import ojd.f;
import f36.b;
import com.yxcorp.gifshow.upload.r1$b$f;
import erd.r;
import com.yxcorp.gifshow.upload.r1$b$e;

public class r1$b implements Runnable	// class@001ea5
{
    public UploadInfo b;
    public boolean c;
    public f d;
    public long e;
    public b f;
    public b g;
    public float h;
    public final a i;
    public final g j;
    public final g k;
    public final g l;
    public final g m;
    public final g n;
    public final r1 o;

    public void r1$b(r1 p0,UploadInfo p1,r1$a p2){
       this.o = p0;
       super();
       this.i = new r1$b$a(this);
       this.j = new m2(this);
       this.k = new r1$b$b(this);
       this.l = new r1$b$c(this);
       this.m = a0.a(new s1(this));
       this.n = a0.a(new t1(this));
       this.b = p1;
    }
    public File a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, r1$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null && !TextUtils.x(this.b.getWorkspacePath())) {
          return new File(this.b.getWorkspacePath());
       }
       return objArray;
    }
    public final boolean b(long p0){
       SharedPreferences obj;
       if (PatchProxy.isSupport(r1$b.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, r1$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = a.a;
       boolean b = false;
       if (obj.getBoolean("segment_on", b) && (p0 - obj.getLong("part_file_upload_threshold", 0) > 0 && (!p0.A(a.a().a()) || obj.getBoolean("data_network_segment_on", b)))) {
          b = true;
       }
    label_004d :
       return b;
    }
    public final boolean c(long p0){
       if (PatchProxy.isSupport(r1$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, r1$b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (p0 - (long)a.a.getInt("WholeUploadMaxSize", i) < 0) {
          i = true;
       }
       return i;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, r1$b.class, "10")) {
          return;
       }
       this.b.mStatus = IUploadInfo$Status.CANCELED;
       this.o.m(this.b);
       this.o.a.l("", "", this.e, this.b);
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r1$b.class, "5")) {
          return;
       }
       if (this.c != null) {
          this.b.mStatus = IUploadInfo$Status.CANCELED;
          this.o.m(this.b);
          return;
       }else {
          e.a().d(e.c(this.b), "start_upload_task");
          this.e = System.currentTimeMillis();
          this.b.mUploadStartTime = this.e;
          this.o.m(this.b);
          r1$b$d uob$d = new r1$b$d(this);
          this.d = uob$d;
          r1$b tf = this.f;
          if (tf instanceof g) {
             if (!this.b instanceof RickonWholeUploadInfo) {
                i1.a("UploadManager", "uploadInfo not type of RickonWholeUploadInfo");
             }
             tf = this.f;
             r1$b tb = this.b;
             Objects.requireNonNull(tf);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             g og = g.class;
             t ot = PatchProxy.applyTwoRefs(tb, uob$d, tf, og, "1");
             if (ot != patchProxyRe) {
             }else {
                tf.c = uob$d;
                if (!tb.hasVideoUploadInfo()) {
                   ot = t.empty();
                }else {
                   t ot1 = PatchProxy.applyOneRefs(tb, tf, og, "3");
                   if (ot1 != patchProxyRe) {
                   }else {
                      String str = "CloudVideoUploader";
                      PostLogger postLogger = new PostLogger().c(str);
                      postLogger.k(tb.getSessionId());
                      PostSubTaskEvent uPLOAD_COVER = PostSubTaskEvent.UPLOAD_COVER;
                      postLogger.h(uPLOAD_COVER).i(tb.getId()).j(PostLogger$Status.BEGIN).d();
                      if (!tb.isNeedUploadCover()) {
                         postLogger = new PostLogger().c(str);
                         postLogger.k(tb.getSessionId());
                         postLogger.h(uPLOAD_COVER).i(tb.getId()).j(PostLogger$Status.FINISH).g("not need upload cover").d();
                         a uoa = new a(new UploadCoverResult(), 1, null, null, 0, 0);
                         ot1 = t.just(postLogger);
                      }else {
                         HashMap hashMap = new HashMap();
                         hashMap.put("uploadTaskId", tb.mSessionId);
                         ot1 = tf.a.i(tb.mCoverUploadUrl, e.d("coverImg", new File(tb.getCoverFile().getAbsolutePath())), e.a(hashMap)).doOnNext(new c(tb)).observeOn(d.c).doOnError(new d(tb));
                      }
                   }
                   ot = ot1.flatMap(new c(tf, tb)).flatMap(new d(tb)).flatMap(new f(tf, tb));
                }
             }
             this.g = ot.doOnNext(this.m).doOnError(this.j).doOnError(this.n).subscribe(this.l, u1.b);
             return;
          }else {
             this.g = tf.a(this.b, uob$d).doOnNext(this.m).retry(3, new r1$b$f(this)).doOnError(this.j).doOnError(this.n).subscribe(this.k, new r1$b$e(this));
             return;
          }
       }
    }
}
