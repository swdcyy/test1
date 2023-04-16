package com.yxcorp.gifshow.profile.profileinstaller.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.zip.Deflater;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.zip.Inflater;
import java.util.zip.DataFormatException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.lang.Number;
import java.lang.Long;

public class b	// class@0015a0
{

    public void b(){
       super();
    }
    public static byte[] a(byte[] p0){
       Deflater obj = PatchProxy.applyOneRefs(p0, null, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Deflater(1);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       DeflaterOutputStream uDeflaterOut = new DeflaterOutputStream(uByteArrayOu, obj);
       uDeflaterOut.write(p0);
       uDeflaterOut.close();
       obj.end();
       return uByteArrayOu.toByteArray();
    }
    public static RuntimeException b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IllegalStateException(p0);
    }
    public static byte[] c(InputStream p0,int p1){
       byte[] obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new byte[p1];
       int i = 0;
       while (true) {
          if (i >= p1) {
             return obj;
          }
          int i1 = p1 - i;
          i1 = p0.read(obj, i, i1);
          if (i1 >= 0) {
             i = i + i1;
          }else {
             break ;
          }
       }
       throw b.b("Not enough bytes to read: "+p1);
    }
    public static byte[] d(InputStream p0,int p1,int p2){
       Inflater obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, b.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Inflater();
       byte[] uobyteArray = new byte[p2];
       byte[] uobyteArray1 = new byte[2048];
       int i = 0;
       int i1 = 0;
       while (true) {
          if (!obj.finished() && (!obj.needsDictionary() && i < p1)) {
             int i2 = p0.read(uobyteArray1);
             if (i2 >= 0) {
                obj.setInput(uobyteArray1, 0, i2);
                try{
                   int i3 = p2 - i1;
                   i1 = i1 + obj.inflate(uobyteArray, i1, i3);
                   i = i + i2;
                }catch(java.util.zip.DataFormatException e8){
                   throw b.b(e8.getMessage());
                }
             }else {
                break ;
             }
          }else if(i == p1){
             if (obj.finished()) {
                obj.end();
                return uobyteArray;
             }else {
                throw b.b("Inflater did not finish");
             }
          }else {
             throw b.b("Didn\'t read enough bytes during decompression. expected="+p1+" actual="+i);
          }
       }
       throw b.b("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "+p1+" bytes");
    }
    public static String e(InputStream p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new String(b.c(p0, p1), StandardCharsets.UTF_8);
    }
    public static long f(InputStream p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       byte[] uobyteArray = b.c(p0, p1);
       long l = 0;
       for (int i = 0; i < p1; i = i + 1) {
          int i1 = uobyteArray[i] & 0x00ff;
          int i2 = i * 8;
          long l1 = (long)i1 << i2;
          l = l + l1;
       }
       return l;
    }
    public static int g(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)b.f(p0, 2);
    }
    public static long h(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return b.f(p0, 4);
    }
    public static int i(InputStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)b.f(p0, 1);
    }
    public static int j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getBytes(StandardCharsets.UTF_8).length;
    }
    public static void k(OutputStream p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "14")) {
          return;
       }
       b.o(p0, (long)p1.length);
       p1 = b.a(p1);
       b.o(p0, (long)p1.length);
       p0.write(p1);
       return;
    }
    public static void l(OutputStream p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "6")) {
          return;
       }
       p0.write(p1.getBytes(StandardCharsets.UTF_8));
       return;
    }
    public static void m(OutputStream p0,long p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), null, b.class, "2")) {
          return;
       }
       byte[] uobyteArray = new byte[p2];
       for (int i = 0; i < p2; i = i + 1) {
          int i1 = i * 8;
          long l = p1 >> i1;
          l = l & 255;
          uobyteArray[i] = (byte)(int)l;
       }
       p0.write(uobyteArray);
       return;
    }
    public static void n(OutputStream p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uob, "4")) {
          return;
       }
       b.m(p0, (long)p1, 2);
       return;
    }
    public static void o(OutputStream p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uob, "5")) {
          return;
       }
       b.m(p0, p1, 4);
       return;
    }
    public static void p(OutputStream p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uob, "3")) {
          return;
       }
       b.m(p0, (long)p1, 1);
       return;
    }
}
