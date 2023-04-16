package com.kwai.plugin.dva.util.a;
import java.lang.Object;
import java.util.zip.ZipFile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.Closeable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.lang.Number;
import java.io.BufferedInputStream;
import java.security.MessageDigest;
import java.lang.StringBuilder;
import java.lang.Integer;
import okio.n;
import okio.l;
import okio.d;
import cud.k;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import java.lang.Exception;

public class a	// class@00138d
{

    public void a(){
       super();
    }
    public static void a(ZipFile p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "45")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean b(Closeable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       try{
          p0.close();
          return true;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean c(InputStream p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return 0;
       }
       try{
          if (p1.exists()) {
             p1.delete();
             p1.createNewFile();
          }
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(uFileOutputS);
             try{
                int i = 4096;
                byte[] uobyteArray = new byte[i];
                int i1 = p0.read(uobyteArray);
                while (i1 >= 0) {
                   uBufferedOut.write(uobyteArray, 0, i1);
                }
                uBufferedOut.flush();
                a.b(uBufferedOut);
                a.b(uFileOutputS);
                return true;
             }catch(java.lang.Exception e4){
                Closeable uCloseable1 = uBufferedOut;
             }
          }catch(java.lang.Exception e4){
          }
       }catch(java.lang.Exception e4){
          Closeable uCloseable = null;
       }
    }
    public static boolean d(File p0){
       File[] obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.isDirectory()) {
          obj = p0.listFiles();
          if (obj != null) {
             int len = obj.length;
             int i = 0;
             while (i < len) {
                if (!a.d(obj[i])) {
                   return false;
                }
                i = i + 1;
             }
          }
       }
       return p0.delete();
    }
    public static void e(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "31")) {
          return;
       }
       if (p0.isFile()) {
          p0.delete();
          return;
       }else if(p0.isDirectory()){
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null || !uFileArray.length) {
             p0.delete();
          }else {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                a.e(uFileArray[i]);
             }
             p0.delete();
          }
       }
       return;
    }
    public static void f(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "22")) {
          return;
       }
       if (p0.isDirectory()) {
          p1.mkdirs();
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             a.f(oobject, new File(p1, oobject.getName()));
          }
       }else if(p1.exists()){
          p1.delete();
       }
       p1.createNewFile();
       FileInputStream uFileInputSt = new FileInputStream(p0);
       FileChannel channel = uFileInputSt.getChannel();
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       FileChannel channel1 = uFileOutputS.getChannel();
       long l = channel.size();
       long l1 = 0;
       do {
          l1 = l1 + channel1.transferFrom(channel, l1, 0x100000);
       } while (l1 - l >= 0);
       a.b(channel1);
       a.b(uFileOutputS);
       a.b(channel);
       a.b(uFileInputSt);
       return;
    }
    public static long g(File p0){
       long l;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0.isDirectory()) {
          l = 0;
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             l = l + a.g(uFileArray[i]);
          }
       }else {
          l = p0.length();
       }
       return l;
    }
    public static String h(File p0){
       Closeable obj = PatchProxy.applyOneRefs(p0, null, a.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null || !p0.exists()) {
          }else {
             FileInputStream uFileInputSt = new FileInputStream(p0);
             a.b(uFileInputSt);
             return a.i(uFileInputSt);
          }
       }catch(java.lang.Exception e0){
          obj = null;
          a.b(obj);
       }catch(java.lang.Exception e0){
       }
       return null;
    }
    public static String i(InputStream p0){
       BufferedInputStream obj = PatchProxy.applyOneRefs(p0, null, a.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new BufferedInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          StringBuilder str = new StringBuilder(32);
          byte[] uobyteArray = new byte[0x19000];
          int i = obj.read(uobyteArray);
          int i1 = 0;
          while (i != -1) {
             instance.update(uobyteArray, i1, i);
          }
          byte[] uobyteArray1 = instance.digest();
          for (; i1 < uobyteArray1.length; i1 = i1 + 1) {
             int i2 = uobyteArray1[i1] & 0x00ff;
             i2 = i2 + 256;
             str = str+(Integer.toString(i2, 16)).substring(1);
          }
          return str;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static byte[] j(File p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "SHA1";
       try{
          MessageDigest instance = MessageDigest.getInstance(obj);
          try{
             d uod = l.d(l.j(p0));
             byte[] uobyteArray = new byte[8192];
             try{
                int i = uod.read(uobyteArray);
                while (i > 0) {
                   instance.update(uobyteArray, 0, i);
                }
                a.b(uod);
                return instance.digest();
             }catch(java.io.IOException e0){
                e0.printStackTrace();
                a.b(uod);
                return null;
             }
          }catch(java.io.FileNotFoundException e5){
             e5.printStackTrace();
             a.b(null);
             return null;
          }
       }catch(java.security.NoSuchAlgorithmException e5){
          e5.printStackTrace();
          return null;
       }
    }
    public static boolean k(Bitmap p0,String p1){
       FileOutputStream uFileOutputS;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && !p0.isRecycled()) {
          try{
             File uFile = new File(p1);
             if (!uFile.exists()) {
                uFile.getParentFile().mkdirs();
             }else {
                uFile.delete();
             }
             try{
                uFileOutputS = new FileOutputStream(p1);
                p0.compress(Bitmap$CompressFormat.JPEG, 100, uFileOutputS);
                b = 1;
                uFileOutputS.close();
             }catch(java.lang.Exception e4){
                FileOutputStream uFileOutputS1 = uFileOutputS;
             }
             e4.printStackTrace();
             if (null) {
                null.close();
             }
          }catch(java.lang.Exception e4){
             goto label_0052 ;
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
       }
    }
}
