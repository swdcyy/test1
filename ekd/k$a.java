package ekd.k$a;
import java.util.Arrays;
import ekd.k$b;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Integer;

public class k$a	// class@000d56
{
    public final boolean a;
    public final boolean b;
    public static final int[] c;
    public static final int[] d;
    public static final k$a e;
    public static final k$a f;
    public static final k$a g;

    static {
       int i = 256;
       int[] ointArray = new int[i];
       k$a.c = ointArray;
       int i1 = -1;
       Arrays.fill(ointArray, i1);
       int i2 = 0;
       char[] e = k$b.e;
       while (i2 < e.length) {
          k$a.c[e[i2]] = i2;
          i2 = i2 + 1;
       }
       k$a.c[61] = -2;
       int[] ointArray1 = new int[i];
       k$a.d = ointArray1;
       Arrays.fill(ointArray1, i1);
       i = 0;
       char[] f = k$b.f;
       while (i < f.length) {
          k$a.d[f[i]] = i;
          i = i + 1;
       }
       k$a.d[61] = -2;
       k$a.e = new k$a(false, false);
       k$a.f = new k$a(true, false);
       k$a.g = new k$a(false, true);
    }
    public void k$a(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public byte[] a(String p0){
       int len1;
       int i5;
       int i8;
       k$a uoa = this;
       byte[] bytes = (p0).getBytes(StandardCharsets.ISO_8859_1);
       int len = bytes.length;
       int[] d = (uoa.a != null)? k$a.d: k$a.c;
       int i = len + 0;
       int i1 = 61;
       int i2 = -1;
       int i3 = 0;
       if (i) {
          k$a uoa1 = 2;
          if (i < uoa1) {
             if (uoa.b == null || d[i3] != i2) {
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
             }
          }else {
             int i4 = 1;
             if (uoa.b != null) {
                i8 = 0;
                int i9 = 0;
                while (i8 < len) {
                   i5 = i8 + 1;
                   i8 = bytes[i8] & 0x00ff;
                   if (i8 == i1) {
                      len = len - i5;
                      len = len + i4;
                      i = i - len;
                      break ;
                   }else if(d[i8] == i2){
                      i9 = i9 + 1;
                   }
                   i8 = i5;
                }
                i = i - i9;
             label_005f :
                uoa1 = null;
             }else {
                len1 = len - 1;
                if (bytes[len1] == i1) {
                   len = len - uoa1;
                   if (bytes[len] != i1) {
                      uoa1 = 1;
                   }
                }else {
                   goto label_005f ;
                }
             }
             if (uoa1 == null) {
                len = i & 0x03;
                if (len) {
                   i8 = len - 4;
                }
             }
             i = i + 3;
             i = i / 4;
             i = i * 3;
             i = i - i8;
          label_006f :
             byte[] uobyteArray = new byte[i];
             len1 = bytes.length;
             int[] d1 = (uoa.a != null)? k$a.d: k$a.c;
             i4 = 0;
             i5 = 18;
             int i6 = 0;
             int i7 = 0;
             while (true) {
                if (i4 < len1) {
                   i3 = i4 + 1;
                   i4 = bytes[i4] & 0x00ff;
                   i4 = d1[i4];
                   if (i4 < 0) {
                      if (i4 == -2) {
                         if (i5 == 6) {
                            if (i3 != len1) {
                               i2 = i3 + 1;
                               if (bytes[i3] == i1) {
                                  i4 = i2;
                               label_009f :
                                  if (i5 != 18) {
                                  label_00ee :
                                     if (i5 == 6) {
                                        uobyteArray[i7] = (byte)(i6 >> 16);
                                        i7 = i7 + 1;
                                     }else if(!i5){
                                        i1 = i7 + 1;
                                        i2 = i6 >> 16;
                                        uobyteArray[i7] = (byte)i2;
                                        i7 = i1 + 1;
                                        i2 = i6 >> 8;
                                        uobyteArray[i1] = (byte)i2;
                                     }else if(i5 != 12){
                                        throw new IllegalArgumentException("Last unit does not have enough valid bits");
                                     }
                                     do {
                                        if (i4 < len1) {
                                           if (uoa.b != null) {
                                              i1 = i4 + 1;
                                              i4 = i1;
                                              if (d1[bytes[i4]] < 0) {
                                                 continue ;
                                              }
                                           }
                                        }else if(i7 != i){
                                           uobyteArray = Arrays.copyOf(uobyteArray, i7);
                                        }
                                        return uobyteArray;
                                     } while (d1[bytes[i4]] < 0);
                                     throw new IllegalArgumentException("Input byte array has incorrect ending byte at "+i4);
                                  }
                               }
                            }
                         }else {
                            i4 = i3;
                            goto label_009f ;
                         }
                         break ;
                      }else if(uoa.b != null){
                         throw new IllegalArgumentException("Illegal base64 character "+Integer.toString(bytes[(i3 + i2)], 16));
                      }
                   }else {
                      i4 = i4 << i5;
                      i6 = i6 | i4;
                      i5 = i5 - 6;
                      if (i5 < 0) {
                         i4 = i7 + 1;
                         i5 = i6 >> 16;
                         uobyteArray[i7] = (byte)i5;
                         i5 = i4 + 1;
                         i7 = i6 >> 8;
                         uobyteArray[i4] = (byte)i7;
                         i7 = i5 + 1;
                         uobyteArray[i5] = (byte)i6;
                         i5 = 18;
                         i6 = 0;
                      }
                   }
                   i4 = i3;
                   i3 = 0;
                }else {
                   goto label_00ee ;
                }
             }
             throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
          }
       }
       i = 0;
       goto label_006f ;
    }
}
