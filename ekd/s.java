package ekd.s;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.String;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.lang.Exception;
import ekd.p;

public class s	// class@00156c
{

    public static void a(File p0,List p1){
       File[] uFileArray = p0.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (oobject.isDirectory()) {
             s.a(oobject, p1);
          }else if(oobject.isFile()){
             p1.add(oobject);
          }
          i = i + 1;
       }
       return;
    }
    public static byte[] b(byte[] p0){
       byte[] uobyteArray = null;
       if (p0 != null) {
          try{
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(p0.length);
             GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
             gZIPOutputSt.write(p0);
             gZIPOutputSt.flush();
             gZIPOutputSt.close();
             uByteArrayOu.flush();
             uByteArrayOu.close();
             uobyteArray = uByteArrayOu.toByteArray();
             gZIPOutputSt.close();
             uByteArrayOu.close();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static void c(File p0,File p1){
       s.d(p0, p1, -1);
    }
    public static void d(File p0,File p1,int p2){
       if (p0.isFile()) {
          File[] uFileArray = new File[]{p0};
          s.e(uFileArray, p1.getAbsolutePath(), p2);
       }else if(p0.isDirectory()){
          ArrayList uArrayList = new ArrayList();
          s.a(p0, uArrayList);
          File[] uFileArray1 = new File[0];
          s.e(uArrayList.toArray(uFileArray1), p1.getAbsolutePath(), p2);
       }
       return;
    }
    public static void e(File[] p0,String p1,int p2){
       OutputStream outputStream;
       OutputStream outputStream1;
       BufferedInputStream uBufferedInp;
       ZipEntry zipEntry;
       object oobject = null;
       try{
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             outputStream = new ZipOutputStream(new BufferedOutputStream(uFileOutputS));
             try{
                int i = 4096;
                byte[] uobyteArray = new byte[i];
                int i1 = 0;
                while (i1 < p0.length) {
                   FileInputStream uFileInputSt = new FileInputStream(p0[i1]);
                   try{
                      uBufferedInp = new BufferedInputStream(uFileInputSt, i);
                      String absolutePath = p0[i1].getAbsolutePath();
                      int i2 = -1;
                      if (p2 != i2) {
                         zipEntry = (p2)? new ZipEntry(absolutePath.substring(p2)): new ZipEntry(absolutePath);
                      }else {
                         int i4 = absolutePath.lastIndexOf("/") + 1;
                         zipEntry = new ZipEntry(absolutePath.substring(i4));
                      }
                      outputStream.putNextEntry(zipEntry);
                      int i3 = uBufferedInp.read(uobyteArray, 0, i);
                      while (i3 != i2) {
                         outputStream.write(uobyteArray, 0, i3);
                      }
                      uBufferedInp.close();
                      i1 = i1 + 1;
                      oobject = uBufferedInp;
                   }catch(java.lang.Exception e10){
                      oobject = uBufferedInp;
                   }
                label_007a :
                   e10.printStackTrace();
                }
                p.c(oobject);
                p.d(outputStream);
                p.d(outputStream1);
                return;
             }catch(java.lang.Exception e10){
                goto label_007a ;
             }
          }catch(java.lang.Exception e10){
             outputStream = oobject;
             goto label_007a ;
          }
       }catch(java.lang.Exception e10){
          outputStream = oobject;
          outputStream1 = outputStream;
          goto label_007a ;
       }
    }
}
