package c.t.m.g.ek;
import java.lang.String;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;
import java.io.InputStream;
import java.lang.Object;
import java.lang.System;

public class ek	// class@000c6d
{
    public static int a;

    public static String a(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0.getBytes("UTF-8"));
          p0 = ek.a(instance.digest(), "");
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String a(byte[] p0,String p1){
       StringBuilder str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          str = str+Integer.toHexString(i1)+p1;
       }
       return str;
    }
    public static byte[] a(byte[] p0){
       if (p0 == null) {
          return null;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       DeflaterOutputStream uDeflaterOut = new DeflaterOutputStream(uByteArrayOu);
       try{
          int i = 0;
          uDeflaterOut.write(p0, i, p0.length);
          uDeflaterOut.finish();
          uDeflaterOut.flush();
          uDeflaterOut.close();
          return uByteArrayOu.toByteArray();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static byte[] b(byte[] p0){
       int i1;
       if (p0 == null) {
          return null;
       }
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       InflaterInputStream inflaterInpu = new InflaterInputStream(uByteArrayIn);
       byte[] uobyteArray = new byte[0];
       byte[] uobyteArray1 = new byte[1024];
       int i = 0;
       try{
          do {
             i1 = inflaterInpu.read(uobyteArray1);
             if (i1 > 0) {
                i = i + i1;
                byte[] uobyteArray2 = new byte[i];
                System.arraycopy(uobyteArray, 0, uobyteArray2, 0, uobyteArray.length);
                System.arraycopy(uobyteArray1, 0, uobyteArray2, uobyteArray.length, i1);
                uobyteArray = uobyteArray2;
             }
          } while (i1 <= 0);
          try{
             uByteArrayIn.close();
             inflaterInpu.close();
             return uobyteArray;
          }catch(java.io.IOException e0){
             return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
}
