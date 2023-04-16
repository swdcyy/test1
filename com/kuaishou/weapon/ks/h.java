package com.kuaishou.weapon.ks.h;
import java.lang.Object;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

public abstract class h	// class@001210
{

    public void h(){
       super();
    }
    public static void a(InputStream p0,OutputStream p1){
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(p1);
       byte[] uobyteArray = new byte[2048];
       int i = p0.read(uobyteArray, 0, 2048);
       while (i != -1) {
          gZIPOutputSt.write(uobyteArray, 0, i);
       }
       gZIPOutputSt.flush();
       gZIPOutputSt.finish();
       gZIPOutputSt.close();
       return;
    }
    public static byte[] a(byte[] p0){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       h.a(uByteArrayIn, uByteArrayOu);
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       uByteArrayOu.flush();
       uByteArrayOu.close();
       try{
          uByteArrayIn.close();
          uByteArrayOu.close();
          try{
             uByteArrayIn.close();
             return e0;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void b(InputStream p0,OutputStream p1){
       byte[] uobyteArray = null;
       try{
          GZIPInputStream gZIPInputStr = new GZIPInputStream(p0);
          try{
             int i = 2048;
             uobyteArray = new byte[i];
             int i1 = gZIPInputStr.read(uobyteArray, 0, i);
             while (i1 != -1) {
                p1.write(uobyteArray, 0, i1);
             }
             gZIPInputStr.close();
             gZIPInputStr.close();
          label_002f :
             return;
          }catch(java.lang.Exception e0){
             GZIPInputStream gZIPInputStr1 = gZIPInputStr;
          }
          if (!e0) {
             return;
          }
          e0.close();
          goto label_002f ;
       }catch(java.lang.Exception e0){
          goto label_002a ;
       }catch(java.lang.Exception e0){
       }
    }
    public static byte[] b(byte[] p0){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       h.b(uByteArrayIn, uByteArrayOu);
       p0 = uByteArrayOu.toByteArray();
       uByteArrayOu.flush();
       uByteArrayOu.close();
       try{
          uByteArrayIn.close();
          uByteArrayOu.close();
          try{
             uByteArrayIn.close();
             return p0;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
