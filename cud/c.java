package cud.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.StringBuilder;

public final class c	// class@001437
{

    public static final boolean a(byte[] p0,int p1,byte[] p2,int p3,int p4){
       a.q(p0, "a");
       a.q(p2, "b");
       int i = 0;
       while (true) {
          if (i >= p4) {
             return true;
          }
          int i1 = i + p1;
          int i2 = i + p3;
          if (p0[i1] != p2[i2]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static final void b(long p0,long p1,long p2){
       if ((p1 | p2) - null >= 0 && (p1 - p0 <= 0 && (p0 - p1) - p2 >= 0)) {
          return;
       }
       throw new ArrayIndexOutOfBoundsException("size="+p0+" offset="+p1+" byteCount="+p2);
    }
    public static final int c(int p0){
       return (((p0 & 0x00ff) << 24) | ((((0xff000000 & p0) >> 24) | ((0xff0000 & p0) >> 8)) | ((0xff00 & p0) << 8)));
    }
    public static final long d(long p0){
       return (((p0 & 255) << 56) | ((((((((0xff00000000000000 & p0) >> 56) | ((0xff000000000000 & p0) >> 40)) | ((0xff0000000000 & p0) >> 24)) | ((0xff00000000 & p0) >> 8)) | ((0xff000000 & p0) << 8)) | ((0xff0000 & p0) << 24)) | ((0xff00 & p0) << 40)));
    }
    public static final short e(short p0){
       int i = p0 & 0xffff;
       return (short)(((i & 0x00ff) << 8) | ((0xff00 & i) >> 8));
    }
}
