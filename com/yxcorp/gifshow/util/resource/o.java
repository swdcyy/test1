package com.yxcorp.gifshow.util.resource.o;
import com.yxcorp.download.k;
import coc.a;
import boc.b;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import doc.a;
import t16.a;
import com.yxcorp.download.DownloadTask;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.e;
import qfc.a;
import java.lang.Object;
import q87.c;
import android.util.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.util.resource.IncrementalException;
import java.lang.StringBuilder;
import qkd.b;
import y56.a;
import android.os.SystemClock;
import java.nio.charset.Charset;
import com.yxcorp.gifshow.util.u0;
import com.yxcorp.gifshow.util.resource.n;
import java.lang.Throwable;
import java.lang.Long;
import java.util.Map;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.resource.d;

public class o extends k	// class@000cf6
{
    public Throwable c;
    public final a d;
    public final b e;
    public final YlabModelConfigResponse$ModelConfig$DiffInfo f;
    public final a g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final a k;

    public void o(a p0,b p1,YlabModelConfigResponse$ModelConfig$DiffInfo p2,a p3,boolean p4,boolean p5,boolean p6,a p7){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.k = p7;
       super();
       this.c = null;
    }
    public void a(DownloadTask p0){
       Object[] objArray1;
       Pair pair;
       Object[] objArray2;
       Object[] objArray5;
       boolean b;
       this.d.e();
       o te = this.e;
       File uFile = new File(p0.getTargetFilePath());
       YlabModelConfigResponse$ModelConfig$DiffInfo mOriginalRaw = this.f.mOriginalRawKey;
       o td = this.d;
       Object[] objArray = new Object[0];
       a.C().w("IncrementalUtils", "unzipAndMergeResource start", objArray);
       if (!uFile.exists()) {
          objArray1 = new Object[0];
          String str = "zipFile not exits";
          a.C().t("IncrementalUtils", str, objArray1);
          pair = new Pair(Integer.valueOf(1003), new IncrementalException(str));
       }else {
          File uFile1 = new File(te.getResourceDir()+mOriginalRaw+".origin");
          if (!uFile1.exists()) {
             objArray1 = new Object[0];
             a.C().t("IncrementalUtils", "tmpFile not exits : "+te+", "+mOriginalRaw, objArray1);
             b.q(uFile);
             pair = new Pair(Integer.valueOf(1004), new IncrementalException("tmpFile not exits"));
          }else {
             td.h = a.c(uFile1);
             long l = SystemClock.elapsedRealtime();
             Object[] objArray3 = new Object[0];
             a.C().w("IncrementalUtils", "unzip start", objArray3);
             String absolutePath = uFile1.getAbsolutePath();
             File uFile2 = u0.g(uFile, absolutePath, te.getCharset());
             u0.f(uFile2, absolutePath);
             b.m(uFile2);
             uFile2.delete();
             b.q(uFile);
             Object[] objArray4 = new Object[0];
             a.C().w("IncrementalUtils", "start check final file", objArray4);
             int i = 1007;
             if (!e.c(uFile1.getAbsolutePath())) {
                objArray5 = new Object[0];
                a.C().t("IncrementalUtils", "checkFinalFileError", objArray5);
                b.q(new File(te.getUnzipDir()));
                pair = new Pair(Integer.valueOf(i), new IncrementalException("check final file error"));
             }else {
                uFile = new File(te.getResourceDir()+mOriginalRaw+".origin");
                objArray5 = new Object[0];
                a.C().w("IncrementalUtils", "restore tmpFile : "+uFile, objArray5);
                if (!uFile.exists()) {
                   objArray2 = new Object[0];
                   a.C().A("IncrementalUtils", "tmp file not exits", objArray2);
                   pair = null;
                }else {
                   File uFile3 = new File(te.getResourceDir());
                   if (uFile3.exists()) {
                      objArray5 = new Object[0];
                      a.C().t("IncrementalUtils", "OriginFileAlreadyExits", objArray5);
                      b.q(uFile3);
                   }
                   objArray = new Object[0];
                   a.C().w("IncrementalUtils", "rename tmpFile to : "+uFile3, objArray);
                   b = uFile.renameTo(uFile3);
                }
                if (!pair) {
                   pair = new Pair(Integer.valueOf(1005), new IncrementalException("restoreOriginFileError"));
                }else {
                   n.b(te);
                   objArray2 = new Object[0];
                   a.C().w("IncrementalUtils", "unzip end cost : "+(SystemClock.elapsedRealtime() - l), objArray2);
                   pair = new Pair(Integer.valueOf(0), null);
                }
             }
          }
       }
       if (!pair.first.intValue()) {
          o te1 = this.e;
          te1.markHaveDownloaded(te1.getInitDownloadUrl(this.g));
          this.e.c(true);
          this.e.e(true);
          objArray2 = new Object[0];
          a.C().w("resourcemanager", "download incremental file success : "+this.e, objArray2);
       }else {
          this.d.b(pair.first.intValue(), pair.second.toString());
          e.d(this.e);
          this.c = pair.second;
       }
       return;
    }
    public void b(DownloadTask p0){
       this.d.b(1002, "canceld");
       n.f(this.e);
    }
    public void c(DownloadTask p0){
       o tc = this.c;
       if (tc == null) {
          Object[] objArray = new Object[0];
          a.C().y("resourcemanager", "download success "+this.e.getResourceName(), objArray);
          this.d.a();
          n.i(this.e);
       }else {
          this.q(tc);
          this.c = null;
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       a.C().e("resourcemanager", "download fail : "+this.e.getResourceName(), p1);
       this.d.b(1001, p1.toString());
       this.q(p1);
    }
    public void k(DownloadTask p0,long p1,long p2){
       n.h(this.e, ((float)p1 / (float)p2));
    }
    public void o(DownloadTask p0){
       this.d.c(p0.getUrl());
       n.b.put(this.e, Long.valueOf(SystemClock.elapsedRealtime()));
       n.a.put(this.e, Long.valueOf(SystemClock.elapsedRealtime()));
    }
    public final void q(Throwable p0){
       String initDownload = this.e.getInitDownloadUrl(this.g);
       if (!TextUtils.x(initDownload)) {
          e.d(this.e);
          Object[] objArray = new Object[0];
          a.C().t("resourcemanager", "try normal download : "+this.e.getResourceName(), objArray);
          n.v(new d(initDownload), this.e, this.h, this.i, this.j, this.k, new a(this.e.getResourceName(), 3));
       }else {
          n.g(this.e, p0);
       }
       return;
    }
}
