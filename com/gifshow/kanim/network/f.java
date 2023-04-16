package com.gifshow.kanim.network.f;
import com.gifshow.kanim.network.e;
import com.gifshow.kanim.network.d;
import java.lang.Object;
import java.lang.String;
import bh.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bh.i;
import java.util.Objects;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import com.gifshow.kanim.network.FileExtension;
import java.lang.StringBuilder;
import ih.b;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import com.gifshow.kanim.b;
import com.gifshow.kanim.network.c;
import java.io.Closeable;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import java.lang.CharSequence;

public class f	// class@0015c3
{
    public final e a;
    public final d b;

    public void f(e p0,d p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public e a(String p0,String p1){
       e uoe;
       boolean b;
       e uoe1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, uof, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "2";
       c uoc = PatchProxy.applyTwoRefs(p0, p1, this, uof, obj);
       c uoc1 = null;
       if (uoc != patchProxyRe) {
       }else if(p1 == null){
          f ta = this.a;
          Objects.requireNonNull(ta);
          Pair pair = PatchProxy.applyOneRefs(p0, ta, e.class, obj);
          if (pair != patchProxyRe) {
          }else {
             try{
                File uFile = ta.b(p0);
                if (uFile == null) {
                   pair = uoc1;
                }else {
                   FileInputStream uFileInputSt = new FileInputStream(uFile);
                   FileExtension zIP = ((uFile.getAbsolutePath()).endsWith(".zip"))? FileExtension.ZIP: FileExtension.JSON;
                   b.a("Cache hit for "+p0+" at "+uFile.getAbsolutePath());
                   pair = new Pair(zIP, uFileInputSt);
                }
             }catch(java.io.FileNotFoundException e0){
             }
          }
       }
    label_001e :
       uoc = uoc1;
       if (uoc != null) {
          return new e(uoc);
       }else {
          try{
             b.a("Animation for "+p0+" not found in cache. Fetching from network.");
             uoe = PatchProxy.applyTwoRefs(p0, p1, this, uof, "3");
             if (uoe != patchProxyRe) {
             }else {
                String str = "Fetching "+p0;
                try{
                   b.a(str);
                   uoc1 = this.b.a(p0);
                   if (uoc1.isSuccessful()) {
                      uoe = this.b(p0, uoc1.v1(), uoc1.s1(), p1);
                      p0 = "Completed fetch from network. Success: ";
                      b = (uoe.b() != null)? true: false;
                      p0 = p0+b;
                      b.a(p0);
                      uoc1.close();
                   }else {
                      uoe = new e(new IllegalArgumentException(uoc1.w()));
                      uoc1.close();
                   }
                }catch(java.lang.Exception e9){
                   uoe = new e(e9);
                   if (uoc1) {
                      uoc1.close();
                   }
                }
             }
          }catch(java.io.IOException e9){
             b.d("AnimationFetchResult close failed ", e9);
          }
          return uoe;
       }
    }
    public final e b(String p0,InputStream p1,String p2,String p3){
       FileExtension zIP;
       e uoe;
       e uoe1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p2 == null) {
          p2 = "application/json";
       }
       obj = null;
       if (p2.contains("application/zip")) {
          b.a("Handling zip response.");
          zIP = FileExtension.ZIP;
          uoe = PatchProxy.applyThreeRefs(p0, p1, p3, this, f.class, "5");
          if (uoe != patchProxyRe) {
          }else if(p3 == null){
             uoe = b.i(new ZipInputStream(p1), obj);
          }else {
             uoe = b.i(new ZipInputStream(new FileInputStream(this.a.d(p0, p1, zIP))), p0);
          }
       }else {
          b.a("Received json response.");
          zIP = FileExtension.JSON;
          uoe = PatchProxy.applyThreeRefs(p0, p1, p3, this, f.class, "6");
          if (uoe != patchProxyRe) {
          }else if(p3 == null){
             uoe1 = b.d(p1, obj);
          }else {
             uoe1 = b.d(new FileInputStream(new File(this.a.d(p0, p1, zIP).getAbsolutePath())), p0);
          }
          uoe = uoe1;
       }
       if (p3 != null && uoe.b() != null) {
          f ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, zIP, ta, e.class, "4")) {
             File uFile = new File(ta.c(), e.a(p0, zIP, true));
             File uFile1 = new File((uFile.getAbsolutePath()).replace(".temp", ""));
             b.a("Copying temp file to real file \("+uFile1+"\)");
             if (!uFile.renameTo(uFile1)) {
                b.c("Unable to rename cache file "+uFile.getAbsolutePath()+" to "+uFile1.getAbsolutePath()+".");
             }
          }
       }
       return uoe;
    }
}
