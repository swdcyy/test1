package ib.b;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class b	// class@002193
{
    public static final char[] a;
    public static final char[] b;
    public static final char[] c;
    public static final byte[] d;

    static {
       byte i4;
       b.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       byte i = 256;
       char[] uocharArray = new char[i];
       b.b = uocharArray;
       uocharArray = new char[i];
       b.c = uocharArray;
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          char[] a = b.a;
          int i3 = i2 >> 4;
          i3 = i3 & 0x0f;
          b.b[i2] = a[i3];
          i3 = i2 & 0x0f;
          b.c[i2] = a[i3];
       }
       byte[] uobyteArray = new byte[103];
       b.d = uobyteArray;
       for (i = 0; i <= 70; i = i + 1) {
          b.d[i] = -1;
       }
       i = 0;
       while (i < 10) {
          i4 = i + 48;
          b.d[i4] = i;
          i = i + 1;
          i = (byte)i;
       }
       while (i1 < 6) {
          uobyteArray = b.d;
          i2 = i1 + 65;
          i4 = i1 + 10;
          i4 = (byte)i4;
          uobyteArray[i2] = i4;
          i2 = i1 + 97;
          uobyteArray[i2] = i4;
          i1 = i1 + 1;
          i1 = (byte)i1;
       }
    }
    public static byte[] a(String p0){
       int i = p0.length();
       if (i & 0x01) {
          throw new IllegalArgumentException("Odd number of characters.");
       }
       byte[] uobyteArray = new byte[(i >> 1)];
       String str = null;
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i4) {
          byte i3 = i1 + 1;
          char c = p0.charAt(i1);
          if (c <= 'f') {
             byte[] d = b.d;
             i1 = d[c];
             if (i1 != -1) {
                int i4 = i3 + 1;
                char c1 = p0.charAt(i3);
                if (c1 <= 'f') {
                   i3 = d[c1];
                   if (i3 != -1) {
                      i1 = i1 << 4;
                      i1 = i1 | i3;
                      uobyteArray[i2] = (byte)i1;
                      i2 = i2 + 1;
                   }
                }
             }
          }
          str = 1;
          break ;
       }
       if (!str) {
          return uobyteArray;
       }else {
          throw new IllegalArgumentException("Invalid hexadecimal digit: "+p0);
       }
    }
}
