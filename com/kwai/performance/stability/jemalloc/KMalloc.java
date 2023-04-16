package com.kwai.performance.stability.jemalloc.KMalloc;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import android.content.Context;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.io.FileOutputStream;
import zsd.d;
import java.util.Objects;

public final class KMalloc	// class@00122b
{
    public static final KMalloc INSTANCE;
    public static File kmallocPermitFile;
    public static File launchCntFile;
    public static File launchFailFile;

    static {
       KMalloc.INSTANCE = new KMalloc();
    }
    public void KMalloc(){
       super();
    }
    public static final void disableInNextLaunch(){
       File kmallocPermi = KMalloc.kmallocPermitFile;
       if (kmallocPermi == null) {
          a.S("kmallocPermitFile");
       }
       if (kmallocPermi.exists()) {
          kmallocPermi = KMalloc.kmallocPermitFile;
          if (kmallocPermi == null) {
             a.S("kmallocPermitFile");
          }
          kmallocPermi.delete();
       }
       return;
    }
    public static native final void dumpMallocStat(String p0,String p1);
    public static final void enableInNextLaunch(){
       File kmallocPermi = KMalloc.kmallocPermitFile;
       if (kmallocPermi == null) {
          a.S("kmallocPermitFile");
       }
       if (!kmallocPermi.exists()) {
          kmallocPermi = KMalloc.kmallocPermitFile;
          if (kmallocPermi == null) {
             a.S("kmallocPermitFile");
          }
          kmallocPermi.createNewFile();
       }
       return;
    }
    public static native final String fileOwnerUid();
    public static final void init(Context p0){
       a.p(p0, "context");
       String str = KMalloc.fileOwnerUid();
       File filesDir = p0.getFilesDir();
       a.o(filesDir, "context.filesDir");
       String absolutePath = filesDir.getAbsolutePath();
       a.o(absolutePath, "userDataPath");
       if (StringsKt__StringsKt.O2(absolutePath, "/user/", false, 2, null)) {
          absolutePath = StringsKt___StringsKt.g6(absolutePath, 6);
       }
       KMalloc.kmallocPermitFile = new File(absolutePath+"/kmalloc_permit_"+str);
       KMalloc.launchCntFile = new File(absolutePath+"/kmalloc_launch_cnt_"+str);
       KMalloc.launchFailFile = new File(absolutePath+"/kmalloc_init_fail_"+str);
       return;
    }
    public static native final boolean isKmallocSucceed();
    public static native final String kmallocPermitPath();
    public static native final boolean kmallocPermitValid();
    public static final void recordSuccessLaunch(){
       File launchCntFil = KMalloc.launchCntFile;
       String str = "launchCntFile";
       if (launchCntFil == null) {
          a.S(str);
       }
       if (!launchCntFil.exists()) {
          return;
       }else {
          launchCntFil = KMalloc.launchCntFile;
          if (launchCntFil == null) {
             a.S(str);
          }
          boolean b = true;
          if (launchCntFil.canRead()) {
             launchCntFil = KMalloc.launchCntFile;
             if (launchCntFil == null) {
                a.S(str);
             }
             if (launchCntFil.canWrite()) {
             label_003f :
                launchCntFil = KMalloc.launchCntFile;
                if (launchCntFil == null) {
                   a.S(str);
                }
                if (launchCntFil.canRead()) {
                   launchCntFil = KMalloc.launchCntFile;
                   if (launchCntFil == null) {
                      a.S(str);
                   }
                   if (launchCntFil.canWrite()) {
                      launchCntFil = KMalloc.launchCntFile;
                      if (launchCntFil == null) {
                         a.S(str);
                      }
                      FilesKt__FileReadWriteKt.z(launchCntFil, null, b, null);
                      launchCntFil = KMalloc.launchCntFile;
                      if (launchCntFil == null) {
                         a.S(str);
                      }
                      launchCntFil.getAbsolutePath();
                      File launchCntFil1 = KMalloc.launchCntFile;
                      if (launchCntFil1 == null) {
                         a.S(str);
                      }
                      FileOutputStream uFileOutputS = new FileOutputStream(launchCntFil1);
                      str = String.valueOf(0);
                      Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                      byte[] bytes = str.getBytes(d.a);
                      a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                      uFileOutputS.write(bytes);
                      uFileOutputS.close();
                   label_00b4 :
                      return;
                   }
                }
                launchCntFil = KMalloc.launchCntFile;
                if (launchCntFil == null) {
                   a.S(str);
                }
                launchCntFil.getAbsolutePath();
                launchCntFil = KMalloc.launchCntFile;
                if (launchCntFil == null) {
                   a.S(str);
                }
                launchCntFil.canRead();
                launchCntFil = KMalloc.launchCntFile;
                if (launchCntFil == null) {
                   a.S(str);
                }
                launchCntFil.canWrite();
                goto label_00b4 ;
             }
          }
          launchCntFil = KMalloc.launchCntFile;
          if (launchCntFil == null) {
             a.S(str);
          }
          launchCntFil.setReadable(b);
          launchCntFil = KMalloc.launchCntFile;
          if (launchCntFil == null) {
             a.S(str);
          }
          launchCntFil.setWritable(b);
          goto label_003f ;
       }
    }
    public static native final void setMaxRetryCount(int p0);
    public static native final boolean supportOldTaggedPointer();
    public static native final boolean supportTaggedPointer();
}
