package com.vivo.channel.reader.a;
import java.nio.ByteBuffer;
import java.io.RandomAccessFile;
import android.util.Pair;
import java.lang.Math;
import java.nio.ByteOrder;
import java.nio.Buffer;
import java.lang.Long;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class a	// class@001027
{

    public static int a(ByteBuffer p0,int p1){
       return (p0.getShort(p1) & 0xffff);
    }
    public static long b(ByteBuffer p0){
       a.h(p0);
       return a.g(p0, (p0.position() + 16));
    }
    public static Pair c(RandomAccessFile p0){
       if (p0.length() - 22 < 0) {
          return null;
       }
       Pair pair = a.d(p0, 0);
       if (pair != null) {
          return pair;
       }
       return a.d(p0, 0xffff);
    }
    public static Pair d(RandomAccessFile p0,int p1){
       if (p1 < 0 || p1 > 0xffff) {
          throw new IllegalArgumentException("maxCommentSize: "+p1);
       }
       long l = p0.length();
       Pair pair = null;
       long l1 = 22;
       if (l - l1 < 0) {
          return pair;
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocate(((int)Math.min((long)p1, (l - l1)) + 22));
       ByteOrder lITTLE_ENDIA = ByteOrder.LITTLE_ENDIAN;
       uByteBuffer.order(lITTLE_ENDIA);
       l = l - (long)uByteBuffer.capacity();
       p0.seek(l);
       p0.readFully(uByteBuffer.array(), uByteBuffer.arrayOffset(), uByteBuffer.capacity());
       int i = a.i(uByteBuffer);
       if (i == -1) {
          return pair;
       }
       uByteBuffer.position(i);
       uByteBuffer = uByteBuffer.slice();
       uByteBuffer.order(lITTLE_ENDIA);
       return Pair.create(uByteBuffer, Long.valueOf((l + (long)i)));
    }
    public static final boolean e(RandomAccessFile p0,long p1){
       p1 = p1 - 20;
       boolean b = false;
       if (p1 < 0) {
          return b;
       }
       p0.seek(p1);
       if (p0.readInt() == 0x504b0607) {
          b = true;
       }
       return b;
    }
    public static long f(ByteBuffer p0){
       a.h(p0);
       return a.g(p0, (p0.position() + 12));
    }
    public static long g(ByteBuffer p0,int p1){
       return ((long)p0.getInt(p1) & 0xffffffff);
    }
    public static void h(ByteBuffer p0){
       if (p0.order() == ByteOrder.LITTLE_ENDIAN) {
          return;
       }
       throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
    public static int i(ByteBuffer p0){
       int i3;
       a.h(p0);
       int i = p0.capacity();
       int i1 = 22;
       if (i < i1) {
          return -1;
       }
       i = i - i1;
       i1 = Math.min(i, 0xffff);
       int i2 = 0;
       while (true) {
          if (i2 >= i1) {
             return -1;
          }
          i3 = i - i2;
          if (p0.getInt(i3) == 0x6054b50) {
             int i4 = i3 + 20;
             if (a.a(p0, i4) == i2) {
                break ;
             }
          }
          i2 = i2 + 1;
       }
       return i3;
    }
}
