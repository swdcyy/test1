package io.netty.buffer.f$b;
import java.lang.String;
import java.lang.StringBuilder;
import zqd.w;
import java.lang.Long;

public final class f$b	// class@001052
{
    public static final char[] a;
    public static final char[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;

    static {
       int i3;
       int i5;
       int i6;
       StringBuilder str;
       int i = 256;
       char[] uocharArray = new char[i];
       f$b.a = uocharArray;
       uocharArray = new char[1024];
       f$b.b = uocharArray;
       String[] stringArray = new String[16];
       f$b.c = stringArray;
       stringArray = new String[4096];
       f$b.d = stringArray;
       stringArray = new String[i];
       f$b.e = stringArray;
       String[] stringArray1 = new String[16];
       f$b.f = stringArray1;
       uocharArray = ("0123456789abcdef").toCharArray();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          char[] b = f$b.b;
          i3 = i2 << 1;
          int i4 = i2 >> 4;
          i4 = i4 & 0x0f;
          b[i3] = uocharArray[i4];
          i3 = i3 + 1;
          i4 = i2 & 0x0f;
          b[i3] = uocharArray[i4];
       }
       i = 0;
       stringArray1 = f$b.c;
       while (i < stringArray1.length) {
          i5 = stringArray1.length - i;
          i6 = i5 * 3;
          str = new StringBuilder(i6);
          for (i6 = 0; i6 < i5; i6 = i6 + 1) {
             str = str+"   ";
          }
          f$b.c[i] = str;
          i = i + 1;
       }
       i = 0;
       stringArray1 = f$b.d;
       while (i < stringArray1.length) {
          i6 = i << 4;
          long l = (long)i6 & 0xffffffff;
          l = l | 0x100000000;
          str = new StringBuilder(12)+w.a+Long.toHexString(l);
          i6 = str.length() - 9;
          char c = '|';
          str.setCharAt(i6, c);
          stringArray1[i] = str+c;
          i = i + 1;
       }
       i = 0;
       stringArray1 = f$b.e;
       char c1 = ' ';
       while (i < stringArray1.length) {
          i3 = i & 0x00ff;
          stringArray1[i] = c1+w.b[i3];
          i = i + 1;
       }
       i = 0;
       stringArray1 = f$b.f;
       while (i < stringArray1.length) {
          i5 = stringArray1.length - i;
          str = new StringBuilder(i5);
          for (i3 = 0; i3 < i5; i3 = i3 + 1) {
             str = str+c1;
          }
          f$b.f[i] = str;
          i = i + 1;
       }
       char[] a = f$b.a;
       while (i1 < a.length) {
          a[i1] = (i1 <= 31 || i1 >= 127)? '.': (char)i1;
          i1 = i1 + 1;
       }
    }
}
