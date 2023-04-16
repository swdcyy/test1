package nm1.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nm1.b;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import java.util.Arrays;

public class f	// class@003376
{

    public void f(){
       super();
    }
    public static String a(MessageNano p0){
       b b;
       int i2;
       char[] f;
       int i4;
       int i6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b obj = PatchProxy.applyOneRefs(p0, null, f.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.i;
       byte[] uobyteArray = MessageNano.toByteArray(p0);
       Objects.requireNonNull(obj);
       b uob = b.class;
       String str1 = PatchProxy.applyOneRefs(uobyteArray, obj, uob, "3");
       if (str1 != patchProxyRe) {
       }else {
          byte[] uobyteArray1 = PatchProxy.applyOneRefs(uobyteArray, obj, uob, str);
          byte i = 0;
          if (uobyteArray1 != patchProxyRe) {
          }else {
             int len = uobyteArray.length;
             if (obj.d != null) {
                len = ((len + 2) / 3) * 4;
             }else {
                i4 = len % 3;
                len = (len / 3) * 4;
                i4 = (!i4)? 0: i4 + 1;
                len = len + i4;
             }
             b = obj.b;
             if (b > null) {
                len = len + (((len - 1) / b) * obj.a.length);
             }
             int i1 = len;
             byte[] uobyteArray2 = new byte[i1];
             int len1 = uobyteArray.length;
             if (PatchProxy.isSupport(uob)) {
                Object obj1 = PatchProxy.applyFourRefs(uobyteArray, Integer.valueOf(i), Integer.valueOf(len1), uobyteArray2, obj, b.class, "7");
                if (obj1 != patchProxyRe) {
                   i2 = obj1.intValue();
                }else if(obj.c != null){
                   f = b.f;
                }else {
                   f = b.e;
                }
                int i3 = ((len1 + 0) / 3) * 3;
                len = i3 + 0;
                b = obj.b;
                if (b > null) {
                   i4 = (b / 4) * 3;
                   if (i3 > i4) {
                      i3 = i4;
                   }
                }
                i4 = 0;
                int i5 = 0;
                while (i5 < len) {
                   i6 = i5 + i3;
                   i6 = Math.min(i6, len);
                   char[] f1 = (obj.c != null)? b.f: b.e;
                   int i7 = i4;
                   int i8 = i5;
                   while (i8 < i6) {
                      int i9 = i8 + 1;
                      i8 = uobyteArray[i8] & 0x00ff;
                      i8 = i8 << 16;
                      int i10 = i9 + 1;
                      i9 = uobyteArray[i9] & 0x00ff;
                      i9 = i9 << 8;
                      i8 = i8 | i9;
                      i9 = i10 + 1;
                      i = uobyteArray[i10] & 0x00ff;
                      i8 = i8 | i;
                      i = i7 + 1;
                      i10 = i8 >> 18;
                      i10 = i10 & 0x3f;
                      uobyteArray2[i7] = (byte)f1[i10];
                      i3 = i + 1;
                      i7 = i8 >> 12;
                      i7 = i7 & 0x3f;
                      uobyteArray2[i] = (byte)f1[i7];
                      i = i3 + 1;
                      i7 = i8 >> 6;
                      i7 = i7 & 0x3f;
                      uobyteArray2[i3] = (byte)f1[i7];
                      i7 = i + 1;
                      i3 = i8 & 0x3f;
                      uobyteArray2[i] = (byte)f1[i3];
                      i8 = i9;
                      i3 = i3;
                      i = 0;
                   }
                   int i11 = i3;
                   i3 = i6 - i5;
                   i3 = i3 / 3;
                   i3 = i3 * 4;
                   i4 = i4 + i3;
                   if (i3 == obj.b && i6 < len1) {
                      uob = obj.a;
                      i5 = uob.length;
                      int i12 = 0;
                      while (i12 < i5) {
                         i = i4 + 1;
                         uobyteArray2[i4] = uob[i12];
                         i12 = i12 + 1;
                         i4 = i;
                      }
                   }
                   i5 = i6;
                   i3 = i11;
                   i = 0;
                }
                if (i5 < len1) {
                   i3 = i5 + 1;
                   len = uobyteArray[i5] & 0x00ff;
                   i5 = i4 + 1;
                   uobyteArray2[i4] = (byte)f[(len >> 2)];
                   i4 = 61;
                   if (i3 == len1) {
                      i3 = i5 + 1;
                      uobyteArray2[i5] = (byte)f[((len << 4) & 0x3f)];
                      if (obj.d != null) {
                         i2 = i3 + 1;
                         uobyteArray2[i3] = i4;
                         uobyteArray2[i2] = i4;
                         i2 = i2 + 1;
                      }else {
                         i2 = i3;
                      }
                   }else {
                      i3 = uobyteArray[i3] & 0x00ff;
                      i6 = i5 + 1;
                      uobyteArray2[i5] = (byte)f[(((len << 4) & 0x3f) | (i3 >> 4))];
                      len = i6 + 1;
                      uobyteArray2[i6] = (byte)f[((i3 << 2) & 0x3f)];
                      if (obj.d != null) {
                         i2 = len + 1;
                         uobyteArray2[len] = i4;
                      }else {
                         i2 = len;
                      }
                   }
                }else {
                   i2 = i4;
                }
             }else {
                goto label_0081 ;
             }
             if (i2 != i1) {
                uobyteArray1 = Arrays.copyOf(uobyteArray2, i2);
             }else {
                uobyteArray1 = uobyteArray2;
             }
          }
          str1 = new String(uobyteArray1, 0, 0, uobyteArray1.length);
       }
       return str1;
    }
}
