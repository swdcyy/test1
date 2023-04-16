package ekd.k$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.util.Arrays;

public class k$b	// class@000d57
{
    public final byte[] a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public static final char[] e;
    public static final char[] f;
    public static final byte[] g;
    public static final k$b h;
    public static final k$b i;
    public static final k$b j;

    static {
       k$b.e = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       k$b.f = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
       byte[] uobyteArray = new byte[2]{0x0d,0x0a};
       k$b.g = uobyteArray;
       k$b.h = new k$b(false, null, -1, true);
       k$b.i = new k$b(true, null, -1, true);
       k$b.j = new k$b(false, uobyteArray, 76, true);
    }
    public void k$b(boolean p0,byte[] p1,int p2,boolean p3){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
       this.d = p3;
    }
    public String a(byte[] p0){
       int i3;
       int i8;
       int i11;
       k$b uob = this;
       int i = p0;
       int len = i.length;
       if (uob.d != null) {
          len = ((len + 2) / 3) * 4;
       }else {
          i3 = len % 3;
          len = (len / 3) * 4;
          i3 = (!i3)? 0: i3 + 1;
          len = len + i3;
       }
       k$b b = uob.b;
       if (b > null) {
          len = len + (((len - 1) / b) * uob.a.length);
       }
       byte[] uobyteArray = new byte[len];
       int len1 = i.length;
       char[] f = (uob.c != null)? k$b.f: k$b.e;
       int i1 = ((len1 + 0) / 3) * 3;
       int i2 = i1 + 0;
       if (b > null) {
          i3 = (b / 4) * 3;
          if (i1 > i3) {
             i1 = i3;
          }
       }
       i3 = 0;
       int i4 = 0;
       while (i3 < i2) {
          int i5 = i3 + i1;
          i5 = Math.min(i5, i2);
          int i7 = i4;
          for (int i6 = i3; i6 < i5; i6 = i8) {
             i8 = i6 + 1;
             i6 = i[i6] & 0x00ff;
             i6 = i6 << 16;
             int i9 = i8 + 1;
             i8 = i[i8] & 0x00ff;
             i8 = i8 << 8;
             i6 = i6 | i8;
             i8 = i9 + 1;
             i9 = i[i9] & 0x00ff;
             i6 = i6 | i9;
             i9 = i7 + 1;
             int i10 = i6 >> 18;
             i10 = i10 & 0x3f;
             uobyteArray[i7] = (byte)f[i10];
             i11 = i9 + 1;
             i7 = i6 >> 12;
             i7 = i7 & 0x3f;
             uobyteArray[i9] = (byte)f[i7];
             i7 = i11 + 1;
             i9 = i6 >> 6;
             i9 = i9 & 0x3f;
             uobyteArray[i11] = (byte)f[i9];
             i11 = i7 + 1;
             i6 = i6 & 0x3f;
             uobyteArray[i7] = (byte)f[i6];
          }
          i3 = i5 - i3;
          i3 = i3 / 3;
          i3 = i3 * 4;
          i4 = i4 + i3;
          if (i3 == uob.b && i5 < len1) {
             b = uob.a;
             i11 = b.length;
             i6 = 0;
             while (i6 < i11) {
                i8 = i4 + 1;
                uobyteArray[i4] = b[i6];
                i6 = i6 + 1;
                i4 = i8;
             }
          }
          i3 = i5;
       }
       if (i3 < len1) {
          i11 = i3 + 1;
          i3 = i[i3] & 0x00ff;
          i1 = i4 + 1;
          uobyteArray[i4] = (byte)f[(i3 >> 2)];
          if (i11 == len1) {
             i4 = i1 + 1;
             uobyteArray[i1] = (byte)f[((i3 << 4) & 0x3f)];
             if (uob.d != null) {
                i = i4 + 1;
                uobyteArray[i4] = 61;
                i4 = i + 1;
                uobyteArray[i] = 61;
             }
          }else {
             i = i[i11] & 0x00ff;
             i11 = i1 + 1;
             uobyteArray[i1] = (byte)f[(((i3 << 4) & 0x3f) | (i >> 4))];
             i4 = i11 + 1;
             uobyteArray[i11] = (byte)f[((i << 2) & 0x3f)];
             if (uob.d != null) {
                uobyteArray[i4] = 61;
                i4 = i4 + 1;
             }
          }
       }
       if (i4 != len) {
          uobyteArray = Arrays.copyOf(uobyteArray, i4);
       }
       return new String(uobyteArray, 0, 0, uobyteArray.length);
    }
}
