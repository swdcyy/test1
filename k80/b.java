package k80.b;
import k80.a;
import k80.b$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.e0;
import kotlin.jvm.internal.a;
import android.content.Context;
import j80.a;
import kotlin.collections.ArraysKt___ArraysKt;
import qkd.b;
import k80.c;
import kotlin.Result;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.Throwable;
import qrd.j0;
import j80.b;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import qrd.l1;

public final class b implements a	// class@001bd7
{
    public final List a;
    public static final int b = 1;
    public static final b$a c;

    static {
       b.c = new b$a(null);
    }
    public void b(){
       super();
       this.a = new ArrayList();
    }
    public synchronized File a(){
       File[] uFileArray;
       Object[] objArray1;
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       File uFile = a.a(obj, objArray);
       int i = 0;
       if (uFile != null) {
          uFileArray = uFile.listFiles();
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          if (!ArraysKt___ArraysKt.P7(uFileArray, new File(uFile, ".files_root_dir_version.dat"))) {
             objArray1 = objArray;
          }
          if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
             return uFile;
          }
       }
    label_0048 :
       uFile = e0.b.getDir("gdata", i);
       if (uFile != null) {
          uFileArray = uFile.listFiles();
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          if (!ArraysKt___ArraysKt.P7(uFileArray, new File(uFile, ".files_root_dir_version.dat"))) {
             objArray1 = objArray;
          }
          if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
             return uFile;
          }
       }
    label_007a :
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       uFile = a.a(obj, objArray);
       int i1 = 1;
       if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
          this.g(new File(uFile, ".files_root_dir_version.dat"), String.valueOf(i1));
          return uFile;
       }else {
          uFile = e0.b.getDir("gdata", i);
          this.g(new File(uFile, ".files_root_dir_version.dat"), String.valueOf(i1));
          a.o(uFile, "GlobalConfig.CONTEXT.get¡­VERSION.toString\(\)\)\n    }");
          return uFile;
       }
    }
    public synchronized File b(){
       File[] uFileArray;
       Object[] objArray1;
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       File uFile = a.a(obj, objArray);
       int i = 0;
       if (uFile != null) {
          uFileArray = uFile.listFiles();
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          if (!ArraysKt___ArraysKt.P7(uFileArray, new File(uFile, ".photo_dir_version.dat"))) {
             objArray1 = objArray;
          }
          if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
             return uFile;
          }
       }
    label_0048 :
       uFile = e0.b.getDir("gdata", i);
       if (uFile != null) {
          uFileArray = uFile.listFiles();
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          if (!ArraysKt___ArraysKt.P7(uFileArray, new File(uFile, ".photo_dir_version.dat"))) {
             objArray1 = objArray;
          }
          if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
             return uFile;
          }
       }
    label_007a :
       uFile = e0.b.getDir("gdata", i);
       a.o(uFile, "it");
       if (!PatchProxy.applyVoidOneRefs(uFile, objArray, c.class, "2")) {
          a.p(uFile, "$this$deleteIfEmpty");
          if (c.a(uFile)) {
             b.q(uFile);
          }
       }
       String str = (uFile.exists() && (uFile.canRead() && uFile.canWrite()))? 1: null;
       if (!str) {
          objArray1 = objArray;
       }
       if (uFile != null) {
          this.g(new File(uFile, ".photo_dir_version.dat"), String.valueOf(1));
          return uFile;
       }else {
          obj = e0.b;
          a.o(obj, "GlobalConfig.CONTEXT");
          uFile = a.a(obj, objArray);
          if (uFile != null && (uFile.isDirectory() && b.R(uFile))) {
             this.g(new File(uFile, ".photo_dir_version.dat"), String.valueOf(1));
             return uFile;
          }else {
             uFile = e0.b.getDir("gdata", i);
             this.g(new File(uFile, ".photo_dir_version.dat"), String.valueOf(1));
             a.o(uFile, "GlobalConfig.CONTEXT.get¡­VERSION.toString\(\)\)\n    }");
             return uFile;
          }
       }
    }
    public File c(){
       Object[] objArray1;
       File uFile1;
       Context b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, b.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       Context obj1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "2");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(obj, "$this$getExternalCacheDirQuietly");
          objArray1 = Result.constructor-impl(b.g());
          if (Result.isFailure-impl(objArray1)) {
             objArray1 = objArray;
          }
          obj1 = objArray1;
       }
       if (obj1 != null) {
          File uFile = this.f(obj1);
          if (uFile != null) {
             return uFile;
          }
       }
       objArray1 = PatchProxy.apply(objArray, objArray, b.class, "1");
       if (objArray1 != patchProxyRe) {
       }else {
          Object obj2 = Result.constructor-impl(b.i());
          if (!Result.isFailure-impl(obj2)) {
             objArray = obj2;
          }
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          obj1 = e0.b;
          a.o(obj1, "GlobalConfig.CONTEXT");
          uFile1 = this.f(new File(objArray1, "/Android/data/"+obj1.getPackageName()+"/cache/"));
          if (uFile1 != null) {
             ExceptionHandler.handleCaughtException(new Exception("The cache dir was successfully created by File\(\)"));
             return uFile1;
          }
       }
       b = e0.b;
       a.o(b, "GlobalConfig.CONTEXT");
       uFile1 = b.getCacheDir();
       a.o(uFile1, "it");
       if (this.f(uFile1) == null) {
          ExceptionHandler.handleCaughtException(new Exception("fatal: cache dir can\'t be created"));
       }
       a.o(uFile1, "GlobalConfig.CONTEXT.cac¡­\"\)\)\n          }\n        }");
       return uFile1;
    }
    public File d(){
       Context obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       File filesDir = obj.getFilesDir();
       filesDir.mkdirs();
       a.o(filesDir, "GlobalConfig.CONTEXT.filesDir.apply { mkdirs\(\) }");
       return filesDir;
    }
    public File e(){
       File obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b.getDir("cache", 0);
       obj.mkdirs();
       a.o(obj, "GlobalConfig.CONTEXT.get¡­IVATE\).apply { mkdirs\(\) }");
       return obj;
    }
    public final File f(File p0){
       File obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.isDirectory() || !b.R(p0)) {
          return null;
       }
       obj = new File(p0, ".cache");
       File uFile = new File(p0, ".files");
       if (!obj.exists() && !obj.mkdir()) {
          return null;
       }
       if (!uFile.exists() && !uFile.mkdirs()) {
          return null;
       }
       return p0;
    }
    public final void g(File p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       FilesKt__FileReadWriteKt.G(p0, p1, null, 2, null);
       Result.constructor-impl(l1.a);
       return;
    }
}
