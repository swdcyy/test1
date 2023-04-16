package lnc.t0;
import java.lang.String;
import lnc.s0;
import com.google.common.primitives.UnsignedLong;
import java.lang.Integer;

public class t0	// class@001dcf
{

    public static int a(String p0,int p1){
       int i3;
       long l6;
       int i5;
       int i6;
       long l8;
       byte[] bytes = p0.getBytes();
       int len = bytes.length;
       long l = 0xb492b66fbe98f273;
       int i = 8;
       long l1 = 16;
       long l2 = 0x9ae16a3b2f90404f;
       int i1 = 0xc3a5c85c97cb3127;
       int i2 = 64;
       if (len <= 32) {
          if (len <= l1) {
             if (len > i) {
                long l3 = s0.b(bytes, ((len + 0) - i));
                long l4 = (long)len + l3;
                l = l4 >> len;
                l2 = s0.c(s0.b(bytes, 0), ((l4 << (i2 - len)) | l)) ^ l3;
             }else {
                i3 = 4;
                if (len >= i3) {
                   l2 = s0.c(((((long)s0.a(bytes, 0) & 0xffffffff) << 3) + (long)len), ((long)s0.a(bytes, ((len + 0) - i3)) & 0xffffffff));
                }else if(len > 0){
                   l2 = l2 * s0.e((((long)(((bytes[((len + 0) - 1)] & 0x00ff) << 2) + len) * 0xc949d7c7509e6557) ^ ((long)((bytes[0] & 0x00ff) + ((bytes[((len >> 1) + 0)] & 0x00ff) << 8)) * l2)));
                }
             }
          }else {
             long l5 = s0.b(bytes, 0) * l;
             l6 = s0.b(bytes, i);
             int i4 = len + 0;
             l2 = l2 * s0.b(bytes, (i4 - 8));
             l2 = s0.c(((s0.d((l5 - l6), 43) + s0.d(l2, 30)) + (s0.b(bytes, (i4 - 16)) * i1)), ((long)len + ((l5 + s0.d((l6 ^ 0xc949d7c7509e6557), 20)) - l2)));
          }
       }else if(len <= i2){
          l = s0.b(bytes, 24);
          i5 = len + 0;
          i6 = i5 - 16;
          long l7 = s0.b(bytes, 0) + ((s0.b(bytes, i6) + (long)len) * i1);
          l8 = s0.d(l7, 37);
          l7 = l7 + s0.b(bytes, i);
          l7 = l7 + s0.b(bytes, l1);
          l = l + l7;
          l2 = (s0.d((l7 + l), 52) + s0.d(l7, 31)) + (l8 + s0.d(l7, 7));
          l7 = s0.b(bytes, l1) + s0.b(bytes, (i5 - 32));
          l8 = s0.b(bytes, (i5 - 8));
          long l9 = s0.d(l7, 37);
          l7 = l7 + s0.b(bytes, (i5 - 24));
          l7 = l7 + s0.b(bytes, i6);
          l6 = 0x9ae16a3b2f90404f;
          l2 = s0.e(((s0.e((((l + ((s0.d((l7 + l8), 52) + s0.d(l7, 31)) + (l9 + s0.d(l7, 7)))) * l6) + (((l8 + l7) + l2) * 0xc3a5c85c97cb3127))) * 0xc3a5c85c97cb3127) + l2)) * l6;
       }else {
          i5 = len + 0;
          long l10 = s0.b(bytes, (i5 - 40));
          long l11 = s0.b(bytes, (i5 - 16)) + s0.b(bytes, (i5 - 56));
          l2 = (long)len;
          long l12 = s0.c((s0.b(bytes, (i5 - 48)) + l2), s0.b(bytes, (i5 - 24)));
          byte[] uobyteArray = bytes;
          long[] olongArray = s0.f(uobyteArray, (i5 - 64), l2, l12);
          l10 = (l10 * l) + s0.b(bytes, 0);
          long[] olongArray1 = s0.f(uobyteArray, (i5 - 32), (l11 + l), l10);
          i5 = (len - 1) & 0xc0;
          int i7 = 0;
          l10 = l10 + l11;
          l10 = l10 + olongArray[0];
          i = i7 + 8;
          l10 = l10 + s0.b(bytes, i);
          l6 = s0.d(l10, 37) * l;
          i6 = 1;
          l11 = l11 + olongArray[i6];
          int i8 = i7 + 48;
          l2 = l11 + s0.b(bytes, i8);
          l2 = s0.d(l2, 42) * l;
          l8 = l6 ^ olongArray1[i6];
          i1 = i7 + 40;
          l6 = olongArray[0] + s0.b(bytes, i1);
          long l13 = l2 + l6;
          l6 = l12 + olongArray1[0];
          long l14 = s0.d(l6, 33) * l;
          i3 = i7 + 0;
          l2 = olongArray[i6] * l;
          long l15 = olongArray1[0] + l8;
          olongArray = s0.f(bytes, i3, l2, l15);
          i3 = i7 + 32;
          l2 = l14 + olongArray1[i6];
          i = i7 + 16;
          l15 = l13 + s0.b(bytes, i);
          olongArray1 = s0.f(bytes, i3, l2, l15);
          i7 = i7 + 64;
          i5 = i5 - 64;
          while (i5) {
             l11 = l13;
             l12 = l8;
             l10 = l14;
          }
          l2 = s0.c(((s0.c(olongArray[0], olongArray1[0]) + (s0.e(l13) * l)) + l8), (s0.c(olongArray[i6], olongArray1[i6]) + l14));
       }
       String str = UnsignedLong.fromLongBits(l2).toString();
       return (Integer.parseInt(str.substring((str.length() - 6))) % p1);
    }
}
