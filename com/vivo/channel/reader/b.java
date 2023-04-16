package com.vivo.channel.reader.b;
import java.io.RandomAccessFile;
import android.util.Pair;
import com.vivo.channel.reader.a;
import com.vivo.channel.reader.a$a;
import java.lang.String;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.io.DataInput;
import java.lang.Exception;
import java.io.IOException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import java.nio.ByteOrder;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.app.Application;
import android.content.pm.ApplicationInfo;

public class b	// class@001028
{
    public static final byte[] a;

    static {
       b.a = new byte[8]{'v','i','v','o','h','o','n','g'};
    }
    public static Pair a(RandomAccessFile p0){
       Pair pair = a.c(p0);
       if (pair != null) {
          return pair;
       }
       throw new a$a("Not an APK file: ZIP End of Central Directory record not found");
    }
    public static String b(File p0){
       RandomAccessFile randomAccess;
       Exception uException;
       String str = "";
       byte[] uobyteArray = null;
       try{
          Pair pair = b.f(p0);
          if (pair != null) {
             pair.first.position(20);
             String str1 = "r";
             try{
                randomAccess = new RandomAccessFile(p0, str1);
                uobyteArray = b.a;
                byte[] uobyteArray1 = new byte[uobyteArray.length];
                long l = randomAccess.length() - (long)uobyteArray.length;
                randomAccess.seek(l);
                randomAccess.readFully(uobyteArray1);
                if (b.e(uobyteArray1)) {
                   l = l - 2;
                   randomAccess.seek(l);
                   short s = b.d(randomAccess);
                   if (s > 0) {
                      randomAccess.seek((l - (long)s));
                      uobyteArray = new byte[s];
                      randomAccess.readFully(uobyteArray);
                      str = new String(uobyteArray, "UTF-8");
                   }
                }
                uobyteArray = randomAccess;
             label_0055 :
                if (uobyteArray != null) {
                   uobyteArray.close();
                }
             }catch(java.io.IOException e1){
             }catch(com.vivo.channel.reader.a$a e1){
             }
             uException.printStackTrace();
             if (randomAccess) {
             label_0068 :
                randomAccess.close();
             }
          }else {
             goto label_0055 ;
          }
       }catch(java.io.IOException e2){
          randomAccess = uobyteArray;
          IOException iOException = e2;
       }catch(com.vivo.channel.reader.a$a e2){
          randomAccess = uobyteArray;
          uException = e2;
          goto label_0063 ;
       }catch(java.io.IOException e1){
          e1.printStackTrace();
       }
       if (TextUtils.isEmpty(str)) {
          str = b.c(p0, -2012129793);
       }
       return str;
    }
    public static String c(File p0,int p1){
       RandomAccessFile randomAccess;
       Pair pair = null;
       try{
          String str = "r";
          try{
             randomAccess = new RandomAccessFile(p0, str);
             Pair pair1 = b.a(randomAccess);
             pair = pair1.first;
             long l = pair1.second.longValue();
             if (a.e(randomAccess, l)) {
                throw new a$a("ZIP64 APK not supported");
             }
             String str1 = b.g(randomAccess, b.h(pair, l), p1);
             try{
                randomAccess.close();
             }catch(java.io.IOException e5){
                e5.printStackTrace();
             }
             return str1;
          }catch(java.lang.Exception e4){
             RandomAccessFile randomAccess1 = randomAccess;
          }
          e4.printStackTrace();
          if (pair) {
             try{
                pair.close();
             }catch(java.io.IOException e4){
                e4.printStackTrace();
             }
          }
       }catch(java.lang.Exception e4){
          goto label_0040 ;
       }
    }
    public static short d(DataInput p0){
       byte[] uobyteArray = new byte[2];
       p0.readFully(uobyteArray);
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       return uByteBuffer.order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }
    public static boolean e(byte[] p0){
       if (p0.length != b.a.length) {
          return false;
       }
       int i = 0;
       while (true) {
          byte[] a = b.a;
          if (i >= a.length) {
             return true;
          }
          if (p0[i] != a[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static Pair f(File p0){
       Pair pair = null;
       if (p0 != null && (!p0.exists() || !p0.isFile())) {
          return pair;
       }
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "r");
       Pair pair1 = b.a(randomAccess);
       if (a.e(randomAccess, pair1.second.longValue())) {
          throw new a$a("ZIP64 APK not supported");
       }
       try{
          randomAccess.close();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return pair1;
    }
    public static String g(RandomAccessFile p0,long p1,int p2){
       if (p1 - 32 < 0) {
          throw new IllegalArgumentException("APK too small for APK Signing Block. ZIP Central Directory offset: "+p1);
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocate(24);
       ByteOrder lITTLE_ENDIA = ByteOrder.LITTLE_ENDIAN;
       uByteBuffer.order(lITTLE_ENDIA);
       p0.seek((p1 - (long)uByteBuffer.capacity()));
       p0.readFully(uByteBuffer.array(), uByteBuffer.arrayOffset(), uByteBuffer.capacity());
       if (uByteBuffer.getLong(8) - 0x20676953204b5041 || uByteBuffer.getLong(16) - 0x3234206b636f6c42) {
          throw new IllegalArgumentException("No APK Signing Block before ZIP Central Directory");
       }
       int i = 0;
       long longx = uByteBuffer.getLong(i);
       if (longx - (long)uByteBuffer.capacity() < 0 || longx - 0x7ffffff7 > 0) {
          throw new IllegalArgumentException("APK Signing Block size out of range: "+longx);
       }
       long l = p1 - (long)(int)(longx + 8);
       if (l < 0) {
          throw new IllegalArgumentException("APK Signing Block offset out of range: "+l);
       }
       uByteBuffer = ByteBuffer.allocate(12);
       uByteBuffer.order(lITTLE_ENDIA);
       p0.seek(l);
       p0.readFully(uByteBuffer.array(), uByteBuffer.arrayOffset(), uByteBuffer.capacity());
       long longx1 = uByteBuffer.getLong(i);
       if (longx1 - longx) {
          throw new IllegalArgumentException("APK Signing Block sizes in header and footer do not match: "+longx1+" vs "+longx);
       }
       l = l + 8;
       while (l - p1 <= 0) {
          uByteBuffer.clear();
          p0.seek(l);
          p0.readFully(uByteBuffer.array(), uByteBuffer.arrayOffset(), uByteBuffer.capacity());
          longx1 = uByteBuffer.getLong();
          if (uByteBuffer.getInt() == p2) {
             if (0x7109871a == p2) {
                break ;
             }else {
                ByteBuffer uByteBuffer1 = ByteBuffer.allocate((int)(longx1 - 4));
                uByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                p0.seek((l + 12));
                p0.readFully(uByteBuffer1.array(), uByteBuffer1.arrayOffset(), uByteBuffer1.capacity());
                return new String(uByteBuffer1.array());
             }
          }else {
             longx1 = longx1 + 8;
             l = l + longx1;
          }
       }
       return "";
    }
    public static long h(ByteBuffer p0,long p1){
       long l = a.b(p0);
       if (l - p1 >= 0) {
          throw new IllegalArgumentException("ZIP Central Directory offset out of range: "+l+". ZIP End of Central Directory offset: "+p1);
       }
       if (!(a.f(p0) + l) - p1) {
          return l;
       }
       throw new IllegalArgumentException("ZIP Central Directory is not immediately followed by End of Central Directory");
    }
    public static String i(Application p0){
       return b.b(new File(p0.getApplicationInfo().sourceDir));
    }
}
