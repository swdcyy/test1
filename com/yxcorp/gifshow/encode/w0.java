package com.yxcorp.gifshow.encode.w0;
import pca.m0;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.io.File;
import c26.d;
import java.lang.String;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.util.Map;
import com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dq.a;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import pca.x1;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.kwai.video.editorsdk2.ExportTask;
import com.yxcorp.gifshow.encode.v0;
import pca.y1;
import java.lang.Throwable;
import pca.z1;
import java.lang.Float;
import pca.w1;
import qkd.b;
import java.lang.StringBuilder;
import w46.b;
import java.lang.IllegalStateException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.io.InputStream;
import java.io.OutputStream;
import ekd.p;
import com.yxcorp.gifshow.util.AdvEditUtil;

public class w0 extends m0	// class@000d55
{
    public File f;
    public File g;
    public File h;
    public long i;

    public void w0(PostEncodeInfo p0,File p1,long p2){
       super(p0, null);
       this.f = p1;
       this.g = new File(this.b.getOutputPath());
       this.i = p2;
       this.c.s().put(Integer.valueOf(p0.getId()), this);
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, w0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d != null) {
          Object[] objArray = new Object[0];
          a.D().s("FileCopyEncodeTask", "Cancelled.", objArray);
          this.f();
          this.b.mStatus = EncodeInfo$Status.CANCELED;
          k1.o(new x1(this));
       }
       return this.d;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, w0.class, "5")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       PostLogger postLogger = new PostLogger().c("FileCopyEncodeTask");
       postLogger.k(this.b.getSessionId());
       postLogger.h(PostSubTaskEvent.ENCODE_COPY).i(String.valueOf(this.b.getId())).j(PostLogger$Status.FINISH).d();
       Object[] objArray = new Object[0];
       a.D().s("FileCopyEncodeTask", "Done.", objArray);
       m0 tb = this.b;
       tb.mStatus = EncodeInfo$Status.COMPLETE;
       tb.d(null, tb, 7, Boolean.FALSE);
       k1.o(new y1(this));
       return;
    }
    public final void d(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "3")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FileCopyEncodeTask", "Failed.", objArray);
       this.f();
       this.b.setThrowable(p0);
       this.b.mStatus = EncodeInfo$Status.FAILED;
       k1.o(new z1(this, p0));
       return;
    }
    public final void e(float p0){
       if (PatchProxy.isSupport(w0.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, w0.class, "4")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       m0 tb = this.b;
       if ((double)(p0 - tb.mProgress) - 0x3f847ae147ae147b >= 0 || p0 - 0x3f800000 >= 0) {
          tb.mProgress = p0;
          k1.o(new w1(this));
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, w0.class, "6")) {
          return;
       }
       b.q(this.g);
       w0 th = this.h;
       if (th != null) {
          b.q(th);
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, w0.class, "7")) {
          return;
       }
       this.c.s().remove(Integer.valueOf(this.b.getId()));
       return;
    }
    public void run(){
       String str1;
       Object[] objArray1;
       OutputStream outputStream;
       File uFile = this;
       String str = "run: finally close";
       if (PatchProxy.applyVoid(null, uFile, w0.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FileCopyEncodeTask", "Run.", objArray);
       PostLogger postLogger = new PostLogger().c("FileCopyEncodeTask");
       postLogger.k(uFile.b.getSessionId());
       postLogger.i(String.valueOf(uFile.b.getId())).h(PostSubTaskEvent.ENCODE_COPY).j(PostLogger$Status.BEGIN).d();
       if (this.b()) {
          return;
       }
       m0 b = uFile.b;
       b.mProgress = 0;
       b.mStatus = EncodeInfo$Status.ENCODING;
       uFile.c.z(b);
       w0 f = uFile.f;
       if (f != null && (!f.exists() || uFile.f.isDirectory())) {
          str1 = "Invalid source file "+uFile.f;
          objArray1 = new Object[0];
          a.D().t("FileCopyEncodeTask", str1, objArray1);
          uFile.d(new IllegalStateException(str1));
          return;
       }else {
          File parentFile = uFile.g.getParentFile();
          if (!parentFile.exists()) {
             parentFile.mkdirs();
          }
          if (!parentFile.exists()) {
             str1 = "Cannot create directory for target file "+uFile.g.getAbsolutePath();
             objArray1 = new Object[0];
             a.D().t("FileCopyEncodeTask", str1, objArray1);
             uFile.d(new IllegalStateException(str1));
             return;
          }else {
             uFile.h = b.X(parentFile, uFile.g.getName());
             if (this.b()) {
                return;
             }else {
                a uoa = a.D();
                String str2 = " to ";
                String str3 = "Start copying "+uFile.f.getAbsolutePath()+str2+uFile.h.getAbsolutePath();
                Object[] objArray2 = new Object[0];
                try{
                   uoa.s("FileCopyEncodeTask", str3, objArray2);
                   f = uFile.f;
                   try{
                      FileInputStream uFileInputSt = new FileInputStream(f);
                      f = uFile.h;
                      try{
                         FileOutputStream uFileOutputS = new FileOutputStream(f);
                         CRC32 uCRC32 = new CRC32();
                         long l = uFile.f.length();
                         byte[] uobyteArray = new byte[4096];
                         long l1 = 0;
                         int i = uFileInputSt.read(uobyteArray);
                         while (i != -1 && uFile.d == null) {
                            uCRC32.update(uobyteArray, 0, i);
                            l1 = l1 + (long)i;
                            uFileOutputS.write(uobyteArray, 0, i);
                            float f1 = (float)l1 / (float)l;
                            uFile.e(f1);
                            if (uFile.d != null) {
                               break ;
                            }
                         }
                         uFileInputSt.close();
                         uFileOutputS.close();
                         if (this.b()) {
                            objArray1 = new Object[0];
                            a.D().w("FileCopyEncodeTask", str, objArray1);
                            p.c(uFileInputSt);
                            p.d(uFileOutputS);
                            return;
                         }else {
                            Object[] objArray5 = new Object[0];
                            a.D().s("FileCopyEncodeTask", "Done copying. Start renaming "+uFile.h.getAbsolutePath()+str2+uFile.g.getAbsolutePath(), objArray5);
                            b.q(uFile.g);
                            b.k0(uFile.h, uFile.g);
                            uFile.b.setEncodedFileCrc(String.valueOf(uCRC32.getValue()));
                            uFile.b.setEncondedFileDuration((long)AdvEditUtil.i(uFile.g.getAbsolutePath()));
                            if (!this.b()) {
                               this.c();
                            }
                            objArray1 = new Object[0];
                            a.D().w("FileCopyEncodeTask", str, objArray1);
                            p.c(uFileInputSt);
                         label_01e2 :
                            p.d(outputStream);
                            return;
                         }
                      }catch(java.io.IOException e0){
                      }
                      InputStream inputStream = uFileInputSt;
                   }catch(java.io.IOException e0){
                      outputStream = null;
                      goto label_01c3 ;
                   }
                }catch(java.io.IOException e0){
                   outputStream = null;
                }
                Object[] objArray3 = new Object[0];
                a.D().u("FileCopyEncodeTask", e0, objArray3);
                uFile.d(e0);
                Object[] objArray4 = new Object[0];
                a.D().w("FileCopyEncodeTask", str, objArray4);
                p.c(null);
                goto label_01e2 ;
             }
          }
       }
    }
}
