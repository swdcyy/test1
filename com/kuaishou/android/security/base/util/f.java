package com.kuaishou.android.security.base.util.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import java.lang.StringBuilder;
import java.io.IOException;
import com.kuaishou.android.security.base.log.d;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;

public class f	// class@000f1d
{

    public void f(){
       super();
    }
    public static String a(byte[] p0,String p1){
       ByteArrayOutputStream obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null || !p0.length) {
          }else {
             obj = new ByteArrayOutputStream();
             ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
             GZIPInputStream gZIPInputStr = new GZIPInputStream(uByteArrayIn);
             byte[] uobyteArray = new byte[256];
             int i = gZIPInputStr.read(uobyteArray);
             while (i >= 0) {
                obj.write(uobyteArray, 0, i);
             }
             return obj.toString(p1);
          }
       }catch(java.io.IOException e5){
          d.c("gzip uncompress to string error."+e5.getMessage());
       }
       return null;
    }
    public static byte[] a(String p0,String p1){
       GZIPOutputStream obj = null;
       ByteArrayOutputStream obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, f.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.length()) {
          return obj;
       }
       try{
          obj1 = new ByteArrayOutputStream();
          obj = new GZIPOutputStream(obj1);
          obj.write(p0.getBytes(p1));
          obj.close();
       }catch(java.io.IOException e3){
          d.c("gzip compress error."+e3.getMessage());
       }
       return obj1.toByteArray();
    }
    public static byte[] a(byte[] p0){
       GZIPOutputStream obj = null;
       ByteArrayOutputStream obj1 = PatchProxy.applyOneRefs(p0, obj, f.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.length) {
          return obj;
       }
       try{
          obj1 = new ByteArrayOutputStream();
          obj = new GZIPOutputStream(obj1);
          obj.write(p0);
          obj.close();
       }catch(java.io.IOException e3){
          d.c("gzip compress error."+e3.getMessage());
       }
       return obj1.toByteArray();
    }
    public static byte[] b(byte[] p0){
       ByteArrayInputStream obj = null;
       ByteArrayOutputStream obj1 = PatchProxy.applyOneRefs(p0, obj, f.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.length) {
          return obj;
       }
       obj1 = new ByteArrayOutputStream();
       try{
          obj = new ByteArrayInputStream(p0);
          GZIPInputStream gZIPInputStr = new GZIPInputStream(obj);
          byte[] uobyteArray = new byte[256];
          int i = gZIPInputStr.read(uobyteArray);
          while (i >= 0) {
             obj1.write(uobyteArray, 0, i);
          }
       }catch(java.io.IOException e4){
          d.c("gzip uncompress error."+e4.getMessage());
       }
       return obj1.toByteArray();
    }
    public static String c(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a(p0, "UTF-8");
    }
}
