package com.kuaishou.miniapploader.internal.FileUtilsKt;
import java.lang.String;
import android.system.StructStat;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.system.Os;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Boolean;
import java.io.File;
import java.lang.StringBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Ref$IntRef;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public final class FileUtilsKt	// class@0009e9
{

    public static final StructStat genFileStructStat(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, FileUtilsKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "path";
       try{
          a.q(p0, obj);
          StructStat structStat = Os.stat(p0);
          a.h(structStat, "Os.stat\(path\)");
          return structStat;
       }catch(android.system.ErrnoException e3){
          throw new IOException(e3);
       }
    }
    public static final boolean isFileExist(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FileUtilsKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "path");
       return new File(p0).exists();
    }
    public static final String pathJoin(String[] p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, FileUtilsKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "paths");
       int i = 0;
       int i1 = 1;
       if (p0.length == i1) {
          return p0[i];
       }
       obj = p0[i];
       i = p0.length;
       for (; i1 < i; i1 = i1 + 1) {
          obj = obj+File.separator+p0[i1];
       }
       String str = obj;
       a.h(str, "builder.toString\(\)");
       return str;
    }
    public static final byte[] readFileData(String p0){
       BufferedInputStream uBufferedInp;
       String obj = PatchProxy.applyOneRefs(p0, null, FileUtilsKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "path";
       try{
          a.q(p0, obj);
          FileInputStream uFileInputSt = new FileInputStream(p0);
          try{
             uBufferedInp = new BufferedInputStream(uFileInputSt);
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             byte[] uobyteArray = new byte[4096];
             Ref$IntRef intRef = new Ref$IntRef();
             int i1 = uBufferedInp.read(uobyteArray);
             intRef.element = i1;
             while (i1 != -1) {
                uByteArrayOu.write(uobyteArray, 0, i1);
             }
             byte[] uobyteArray1 = uByteArrayOu.toByteArray();
             try{
                uBufferedInp.close();
                return uobyteArray1;
             }catch(java.lang.Exception e0){
             }
          }catch(java.io.IOException e5){
             int i = uBufferedInp;
          }
          throw e5;
       }catch(java.io.IOException e5){
          goto label_004c ;
       }
    }
    public static final String readFileString(String p0){
       BufferedReader uBufferedRea;
       String obj = PatchProxy.applyOneRefs(p0, null, FileUtilsKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "path";
       try{
          a.q(p0, obj);
          FileReader uFileReader = new FileReader(p0);
          try{
             uBufferedRea = new BufferedReader(uFileReader);
             p0 = "";
             char[] uocharArray = new char[1024];
             Ref$IntRef intRef = new Ref$IntRef();
             int i1 = uBufferedRea.read(uocharArray, 0, 1024);
             intRef.element = i1;
             while (i1 != -1) {
                p0 = p0+uocharArray;
             }
             p0 = p0;
             try{
                uBufferedRea.close();
                return p0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.io.IOException e7){
             int i = uBufferedRea;
          }
          throw e7;
       }catch(java.io.IOException e7){
          goto label_004c ;
       }
    }
}
